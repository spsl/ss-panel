package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import common.ResultCode;
import common.utils.PasswordCreater;
import common.utils.RandStrCreator;
import dao.UserDao;
import java.util.Date;
import java.util.List;
import models.JsonResult;
import models.Task;
import models.User;
import play.*;
import play.api.mvc.LegacyI18nSupport;
import play.mvc.*;
import views.html.login;
import views.html.testAngular;

public class Application extends Controller {
  public static final String USER_NAME = "user_name";
  public static final String ROLE_ID = "role_id";
  public static final String USER_KEY_ID = "user_key_id";
  public static final String AD_MANAGER = "3";
  public static final String ADMIN = "admin";
  public static final String USER = "user";


  public static final Result INDEX = redirect(routes.HomeController.index());
  public static final Result LOGIN = redirect(routes.Application.login());

  public static final String lang = "cn";

  public Result index() {
    return ok(testAngular.render());
  }

  public Result login() {
    return ok(login.render());
  }


  public Result auth() {

    JsonNode jsonNode = request().body().asJson();

    System.out.println(jsonNode.get("username"));
    System.out.println(jsonNode.get("password").textValue());

    String userNameOrEmail = jsonNode.get("username").textValue();
    String password = jsonNode.get("password").textValue();

    User user = UserDao.auth(userNameOrEmail, PasswordCreater.create(password));

    JsonResult result = JsonResult.instance();

    if (null == user) {
      result.code(ResultCode.USERNAME_OR_PASSWORD_ERROR);
      result.msg("用户名或密码错误");
    } else {
      session().clear();
      session(USER_NAME, user.getUserName());
      session(USER_KEY_ID, String.valueOf(user.getId()));
      session(ROLE_ID, String.valueOf(user.getType()));
      result.code(ResultCode.OK);
    }

    return ok(result.json());
  }


  public Result reg() {
    JsonNode jsonNode = request().body().asJson();

    String userName = jsonNode.get("username").asText();
    String password = jsonNode.get("password").asText();
    String email = jsonNode.get("email").asText();

    User user = UserDao.findByUsernameOrEmail(userName, email);

    JsonResult result = JsonResult.instance();

    if (null != user) {

      result.code(ResultCode.USERNAME_OR_EMAIL_HAS_USED);
      result.msg("用户名或邮箱已被使用！");

    } else {

      user = new User();

      user.setEmail(email);
      user.setUserName(userName);
      user.setPasswd(PasswordCreater.create(password));

      user.setPass(RandStrCreator.createRandomStr(6));

      user.setD(1);
      user.setD(12);
      user.setPort(12);
      user.setTransferEnable(1);
      user.setRegDate(new Date());

      UserDao.add(user);

      result.code(ResultCode.OK);
    }

    return ok(result.json());
  }


  public Result logout() {
    session().clear();
    return LOGIN;
  }

  public static class Login {
    public String username;
    public String password;
  }


  public static String getRootPath() {
    return Play.application().path().getAbsolutePath();
  }
}
