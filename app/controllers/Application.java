package controllers;

import play.*;
import play.db.jpa.Transactional;
import play.mvc.*;
import play.mvc.Http.Session;

public class Application extends Controller {
  public static final String USER_NAME = "user_name";
  public static final String ROLE_ID = "roleid";
  public static final String USER_KEY_ID = "user_key_id";
  public static final String AD_MANAGER = "3";
  public static final String ADMIN = "admin";
  public static final String USER = "user";

  public static String lang = "cn";

  public Result index() {
    Session mySession = session();
    if (mySession.containsKey(USER_NAME)) {
      return null;
    }
    return null;
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


  public static String getfilePath() {
    String rootPath = Play.application().path().getAbsolutePath();

    return rootPath;
  }
}
