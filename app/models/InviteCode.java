package models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import play.data.format.Formats;

/**
 * Created by spsl on 2016/4/10 - 15:41.
 */
public class InviteCode implements Serializable{

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  private String code;

  @Column(name="user_id")
  private int userId;

  @Column(name="create_at")
  private Formats.DateTime createAt;


  @Column(name="update_at")
  private Formats.DateTime updateAt;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

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
