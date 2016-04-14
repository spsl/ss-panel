package models;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import play.libs.Json;

/**
 * Created by sunsai on 2016/4/11 - 14:01.
 */
public class JsonResult implements Serializable{

  public int code;

  public String msg;

  public Object data;

  public JsonNode json() {
    return Json.toJson(this);
  }


  public void code(int code) {
    this.code = code;
  }

  public void data(Object data) {
    this.data = data;
  }

  public void msg(String msg) {
    this.msg = msg;
  }

}
