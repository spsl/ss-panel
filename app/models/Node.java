package models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by spsl on 2016/4/10 - 16:02.
 */
public class Node implements Serializable{

  public static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;

  private String name;

  private String type;

  private String server;

  private String method;

  @Column(name="custom_method")
  private String customerMethod;

  @Column(name="traffic_rate")
  private double trafficRate;

  private String info;

  private String status;

  private int offset;

  private int sort;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getCustomerMethod() {
    return customerMethod;
  }

  public void setCustomerMethod(String customerMethod) {
    this.customerMethod = customerMethod;
  }

  public double getTrafficRate() {
    return trafficRate;
  }

  public void setTrafficRate(double trafficRate) {
    this.trafficRate = trafficRate;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getSort() {
    return sort;
  }

  public void setSort(int sort) {
    this.sort = sort;
  }
}
