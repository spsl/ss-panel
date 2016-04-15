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
 * Created by spsl on 2016/4/10 - 16:12.
 */
@Entity
@Table(name="ss_password_reset")
public class PasswordReset extends Model{

  public static Finder<Long, PasswordReset> find = new Finder<>(PasswordReset.class);

  @Id
  @Constraints.Min(5)
  private long id;

  private String email;

  private String token;

  @Column(name="init_time")
  private int initTime;

  @Column(name="expire_time")
  private int expireTime;




































  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public int getInitTime() {
    return initTime;
  }

  public void setInitTime(int initTime) {
    this.initTime = initTime;
  }

  public int getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(int expireTime) {
    this.expireTime = expireTime;
  }
}
