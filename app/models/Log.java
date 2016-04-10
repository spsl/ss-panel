package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import play.data.format.Formats;

/**
 * Created by spsl on 2016/4/10 - 15:58.
 */
public class Log {

  public static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;

  private String type;

  private String msg;

  @Column(name="create_time")
  private Formats.DateTime createTime;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Formats.DateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Formats.DateTime createAt) {
    this.createTime = createAt;
  }
}
