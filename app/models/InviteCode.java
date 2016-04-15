package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CacheStrategy;
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
 * Created by spsl on 2016/4/10 - 15:41.
 */

@Entity
@Table(name="invite_code")
public class InviteCode extends Model {

  public static Finder<Long, InviteCode> find = new Finder<>(InviteCode.class);

  @Id
  @Constraints.Min(5)
  private long id;

  private String code;

  @Column(name="user_id")
  private int userId;

  @Column(name="create_at")
  private Formats.DateTime createAt;


  @Column(name="update_at")
  private Formats.DateTime updateAt;



















































  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public Formats.DateTime getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Formats.DateTime createAt) {
    this.createAt = createAt;
  }

  public Formats.DateTime getUpdateAt() {
    return updateAt;
  }

  public void setUpdateAt(Formats.DateTime updateAt) {
    this.updateAt = updateAt;
  }
}
