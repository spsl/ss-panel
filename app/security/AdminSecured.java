package security;

import play.mvc.Http.Context;
import controllers.Application;

public class AdminSecured extends Secured{
	@Override
	public String getUsername(Context cxt) {
		String userId =  cxt.session().get(Application.USER_NAME);
		String roleId =  cxt.session().get(Application.ROLE_ID);
		
		if(userId != null) {
			return userId;
		}
		return null;
	}
}
