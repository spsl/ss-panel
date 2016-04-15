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
 * Created by spsl on 2016/4/10 - 16:19.
 */

@Entity
@Table(name="user_traffic_log")
public class UserTrafficLog extends Model{

  public static Finder<Long, UserTrafficLog> find = new Finder<>(UserTrafficLog.class);

  @Id
  @Constraints.Min(5)
  private long id;

  @Column(name="user_id")
  private int userId;

  @Column(name="node_id")
  private int nodeId;

  private double rate;

  private String traffic;

  @Column(name="log_time")
  private int logTime;





























































































  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getNodeId() {
    return nodeId;
  }

  public void setNodeId(int nodeId) {
    this.nodeId = nodeId;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public String getTraffic() {
    return traffic;
  }

  public void setTraffic(String traffic) {
    this.traffic = traffic;
  }

  public int getLogTime() {
    return logTime;
  }

  public void setLogTime(int logTime) {
    this.logTime = logTime;
  }
}
