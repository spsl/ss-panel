package security;

import controllers.Application;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security.Authenticator;

public class Secured extends Authenticator {
	
	
	@Override
	public String getUsername(Context cxt){
		return cxt.session().get(Application.USER_NAME);
	}
	
	@Override
	public Result onUnauthorized(Context cxt) {
		return new Application().login();
	}

}
