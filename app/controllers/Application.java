package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import models.JsonResult;
import models.Task;
import play.*;
import play.api.mvc.LegacyI18nSupport;
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

  public Result index() {
    return ok(testAngular.render());
  }

  public Result login() {
    return ok(login.render());
  }


  public Result auth() {

    JsonNode jsonNode = request().body().asJson();

    System.out.println(jsonNode.get("username"));
    System.out.println(jsonNode.get("password"));

    Task t = new Task();
    t.name = "sunsai";
    t.passWord = "sunsai";
    t.save();



    List<Task> task = Task.find.where()
        .eq("name", "sunsai")
        .eq("passWord", "sunsai")
        .findList();

    JsonResult result = new JsonResult();

    result.msg = "error";
    result.data = task;

    return ok(result.json());
  }

  public static class Login {
    public String username;
    public String password;
  }


  public static String getRootPath() {
    return Play.application().path().getAbsolutePath();
  }
}
