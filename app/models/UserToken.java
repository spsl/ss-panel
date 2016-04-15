package models;

import com.avaje.ebean.Model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import play.data.validation.Constraints;

/**
 * Created by spsl on 2016/4/10 - 16:14.
 */
@Entity
@Table(name="user_token")
public class UserToken extends Model{


  public static Finder<Long, UserToken> find = new Finder<>(UserToken.class);

  @Id
  @Constraints.Min(5)
  private long id;

  private String token;

  @Column(name="user_id")
  private int userId;

  @Column(name="create_time")
  private int createTime;

  @Column(name="expire_time")
  private int expireTime;




































































  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getCreateTime() {
    return createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
  }

  public int getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(int expireTime) {
    this.expireTime = expireTime;
  }
}
