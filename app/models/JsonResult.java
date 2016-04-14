package models;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import play.libs.Json;

/**
 * Created by sunsai on 2016/4/11 - 14:01.
 */
public class JsonResult implements Serializable{

  private int code;

  private String msg;

  private Object data;

  public JsonNode json() {
    return Json.toJson(this);
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
