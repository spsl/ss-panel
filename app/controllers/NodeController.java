package controllers;

import models.JsonResult;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.node.add;

/**
 * Created by sunsai on 2016/4/19 - 19:38.
 */
public class NodeController extends Controller {

  public Result add() {
    return ok(add.render());
  }

  public Result save() {
    return ok(JsonResult.instance().code(100).json());
  }

}
