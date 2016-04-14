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
 * Created by spsl on 2016/4/10 - 16:01.
 */
@Entity
@Table(name="ss_config")
public class Config extends Model{


  @Id
  @Constraints.Min(10)
  private long id;

  private String key;

  private String value;

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

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
