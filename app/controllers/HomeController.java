package controllers;


import play.mvc.*;

import security.Secured;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
@Security.Authenticated(Secured.class)
public class HomeController extends Controller {


    public Result index() {
        return ok(index.render());
    }

}
