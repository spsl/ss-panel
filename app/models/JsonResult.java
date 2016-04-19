package models;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import play.libs.Json;

/**
 * Created by sunsai on 2016/4/11 - 14:01.
 */
public class JsonResult{

  //private JsonNode result;

  private int code = 0;

  private String msg;

  private Object data;

  private JsonResult() {
    //result = Json.toJson(this);
  }

  public static JsonResult instance() {
    return new JsonResult();
  }

  public JsonNode json() {
    return Json.toJson(this);
  }

  public JsonResult code(int code) {
    this.code = code;
    return this;
  }

  public JsonResult data(Object data) {
    this.data = data;
    return this;
  }

  public JsonResult msg(String msg) {
    this.msg = msg;
    return this;
  }

}
