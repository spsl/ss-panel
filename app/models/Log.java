package models;

import com.avaje.ebean.Model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import play.data.format.Formats;
import play.data.validation.Constraints;

/**
 * Created by spsl on 2016/4/10 - 15:58.
 */
@Entity
@Table(name="log")
public class Log extends Model{

  public static Finder<Long, Log> find = new Finder<>(Log.class);

  @Id
  @Constraints.Min(10)
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
