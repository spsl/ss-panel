package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by spsl on 2016/4/10 - 16:10.
 */
public class NodeOnineLog {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
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
