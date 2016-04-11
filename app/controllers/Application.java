package controllers;

import play.*;
import play.api.i18n.Lang;
import play.mvc.*;
import views.html.index;

public class Application extends Controller {
  public static final String USER_NAME = "user_name";
  public static final String ROLE_ID = "roleid";
  public static final String USER_KEY_ID = "user_key_id";
  public static final String AD_MANAGER = "3";
  public static final String ADMIN = "admin";
  public static final String USER = "user";



  public static final String lang = "cn";
  public static Lang CN = Lang.get("cn").get();

  static {
    if (null == CN) {
      CN = Lang.apply("cn");
    }
  }

  public Result index() {



    return ok(index.render());
  }

  public Result login() {
    return null;
  }

  public static class Login {
    public String username;
    public String password;

    public String validate() {
      //User user = User.authenticate(username, password);

      //if(user == null){
      //	return Messages.get(lang, "username_or_password_wrong");
      //}
      return null;
    }
  }


  public static String getRootPath() {
    return Play.application().path().getAbsolutePath();
  }
}
