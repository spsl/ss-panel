package controllers;

import models.User;
import models.UserDao;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @Transactional(readOnly=true)
    public Result index() {
        User user = UserDao.findById(1L);

        String userName = "";
        if (user != null ) {
            userName = user.getUserName();
        }

        return ok(index.render("hello play framework" + userName));
    }

}
