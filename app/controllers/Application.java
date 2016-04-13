package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dao.UserDao;
import models.JsonResult;
import models.User;
import play.*;
import play.api.data.Form;
import play.api.i18n.Lang;
import play.api.libs.ws.ssl.SystemConfiguration;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;
import views.html.login;
import views.html.testAngular;

public class Application extends Controller {
  public static final String USER_NAME = "user_name";
  public static final String ROLE_ID = "roleid";
  public static final String USER_KEY_ID = "user_key_id";
  public static final String AD_MANAGER = "3";
  public static final String ADMIN = "admin";
  public static final String USER = "user";


  public static final String RRESOURCE_PAEH = "material_admin/angular/";


  //public static final Result INDEX = redirect(routes.Application.index());

  public static final String lang = "cn";
  public static Lang CN = Lang.get("cn").get();

  static {
    if (null == CN) {
      CN = Lang.apply("cn");
    }
  }

  public Result index() {



    return ok(testAngular.render());
  }

  public Result login() {
    return ok(login.render());
  }


  @Transactional
  public Result auth() {

    JsonNode jsonNode = request().body().asJson();

    System.out.println(jsonNode.get("username"));
    System.out.println(jsonNode.get("password"));

    User user = UserDao.auth(jsonNode.get("username").textValue(), jsonNode.get("password").textValue());

    JsonResult jsonResult = new JsonResult();
    jsonResult.setCode(0);

    return ok(Json.toJson(jsonResult));
  }

  public static class Login {
    public String username;
    public String password;
  }


  public static String getRootPath() {
    return Play.application().path().getAbsolutePath();
  }
}
