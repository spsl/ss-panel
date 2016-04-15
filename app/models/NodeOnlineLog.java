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
 * Created by spsl on 2016/4/10 - 16:10.
 */

@Entity
@Table(name="ss_node_online_log")
public class NodeOnlineLog extends Model{

  public static Finder<Long, NodeOnlineLog> find = new Finder<>(NodeOnlineLog.class);

  @Id
  @Constraints.Min(5)
  private long id;

  @Column(name="node_id")
  private int nodeId;

  @Column(name="online_user")
  private int onlineUserCount;

  @Column(name="log_time")
  private int logTime;







































  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getNodeId() {
    return nodeId;
  }

  public void setNodeId(int nodeId) {
    this.nodeId = nodeId;
  }

  public int getOnlineUserCount() {
    return onlineUserCount;
  }

  public void setOnlineUserCount(int onlineUserCount) {
    this.onlineUserCount = onlineUserCount;
  }

  public int getLogTime() {
    return logTime;
  }

  public void setLogTime(int logTime) {
    this.logTime = logTime;
  }
}
