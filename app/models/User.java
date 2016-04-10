package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

/**
 * Created by spsl on 2016/4/9 - 18:18.
 */

@Entity
@Table(name="user")
public class User {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;

  @Column(name="user_name")
  private String userName;

  private String email;

  private String pass;

  private String passwd;

  private int t;

  private long u;

  private long d;

  @Column(name="transfer_enable")
  private long transferEnable;

  private int port;

  @Column(name="switch")
  private int _switch;

  private int enable;

  private int type;

  @Column(name="last_get_gift_time")
  private int lastgetGiftTime;

  @Column(name="last_check_in_time")
  private int lastCheckInTime;

  @Column(name="last_rest_pass_time")
  private int lastResetPassTime;

  @Column(name="reg_date")
  private DateTime regDate;


  @Column(name="invite_num")
  private int inviteNum;

  @Column(name="is_admin")
  private int isAdmin;

  @Column(name="ref_by")
  private int refBy;

  @Column(name="expire_time")
  private int expireTime;

  private String method;


  @Column(name="is_email_verify")
  private int isEmailVerify;

  @Column(name="reg_ip")
  private String regIp;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getPasswd() {
    return passwd;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public int getT() {
    return t;
  }

  public void setT(int t) {
    this.t = t;
  }

  public long getU() {
    return u;
  }

  public void setU(long u) {
    this.u = u;
  }

  public long getD() {
    return d;
  }

  public void setD(long d) {
    this.d = d;
  }

  public long getTransferEnable() {
    return transferEnable;
  }

  public void setTransferEnable(long transferEnable) {
    this.transferEnable = transferEnable;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public int get_switch() {
    return _switch;
  }

  public void set_switch(int _switch) {
    this._switch = _switch;
  }

  public int getEnable() {
    return enable;
  }

  public void setEnable(int enable) {
    this.enable = enable;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getLastgetGiftTime() {
    return lastgetGiftTime;
  }

  public void setLastgetGiftTime(int lastgetGiftTime) {
    this.lastgetGiftTime = lastgetGiftTime;
  }

  public int getLastCheckInTime() {
    return lastCheckInTime;
  }

  public void setLastCheckInTime(int lastCheckInTime) {
    this.lastCheckInTime = lastCheckInTime;
  }

  public int getLastResetPassTime() {
    return lastResetPassTime;
  }

  public void setLastResetPassTime(int lastResetPassTime) {
    this.lastResetPassTime = lastResetPassTime;
  }

  public DateTime getRegDate() {
    return regDate;
  }

  public void setRegDate(DateTime regDate) {
    this.regDate = regDate;
  }

  public int getInviteNum() {
    return inviteNum;
  }

  public void setInviteNum(int inviteNum) {
    this.inviteNum = inviteNum;
  }

  public int getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(int isAdmin) {
    this.isAdmin = isAdmin;
  }

  public int getRefBy() {
    return refBy;
  }

  public void setRefBy(int refBy) {
    this.refBy = refBy;
  }

  public int getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(int expireTime) {
    this.expireTime = expireTime;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public int getIsEmailVerify() {
    return isEmailVerify;
  }

  public void setIsEmailVerify(int isEmailVerify) {
    this.isEmailVerify = isEmailVerify;
  }

  public String getRegIp() {
    return regIp;
  }

  public void setRegIp(String regIp) {
    this.regIp = regIp;
  }

}
