package common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * Created by sunsai on 2016/4/11 - 13:45.
 */
public class JsonHelper {

  public static final int OK = 0;         //OK
  public static final int ERROR = 400;    //ERROR 用于不需要细分具体错误原因的场景，就是错了

  private int code;

  private String msg;

  private Object data;

  public static JsonHelper instance() {
    return new JsonHelper();
  }



  public JsonHelper addData(Object data) {
    this.data = data;
    return this;
  }

  public JsonHelper addCode(int code) {
    this.code = code;
    return this;
  }

  public JsonHelper addMsg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * @param data
   * @return
   */
  public static JsonHelper instance(Object data) {
    return new JsonHelper(0, "ok", data);
  }

  /**
   *
   * @return
   */
  public static String ok() {
    return new JsonHelper(OK, "ok", "ok").json();
  }

  /**
   *
   * @return
   */
  public static String error() {
    return new JsonHelper(ERROR, "error", "error").json();
  }

  private JsonHelper(int code, String msg, Object data) {
    this.data = data;
    this.code = code;
    this.msg = msg;
  }

  private JsonHelper() {
    this.data = "";
    this.code = OK;
    this.msg = "ok";
  }

  public int getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public Object getData() {
    return data;
  }

  public String json() {
    ObjectMapper mapper = new ObjectMapper();
    SimpleFilterProvider filterProvider = new SimpleFilterProvider();
    String json = null;

    try {
      mapper.setFilterProvider(filterProvider);
      json = mapper.writeValueAsString(this);
    } catch (Exception e) {
      e.printStackTrace();
      json = "{'code':40002, 'msg':'mapperException','data':''}";
    }

    return json;
  }

}
