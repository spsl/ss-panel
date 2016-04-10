package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by spsl on 2016/4/10 - 16:07.
 */
public class NodeInfoLog {
  public static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;

  @Column(name="node_id")
  private int nodeId;

  @Column(name="uptime")
  private double upTime;

  private String load;

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

  public double getUpTime() {
    return upTime;
  }

  public void setUpTime(double upTime) {
    this.upTime = upTime;
  }

  public String getLoad() {
    return load;
  }

  public void setLoad(String load) {
    this.load = load;
  }

  public int getLogTime() {
    return logTime;
  }

  public void setLogTime(int logTime) {
    this.logTime = logTime;
  }
}
