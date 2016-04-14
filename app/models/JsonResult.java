package models;

import java.io.Serializable;

/**
 * Created by sunsai on 2016/4/11 - 14:01.
 */
public class JsonResult implements Serializable{

  private int code;

  private String msg;

  private Object data;

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
