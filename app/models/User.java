package models;

import com.avaje.ebean.Model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;
import play.data.validation.Constraints;

/**
 * Created by spsl on 2016/4/9 - 18:18.
 */

@Entity
@Table(name="user")
public class User extends Model{




  @Id
  @Constraints.Min(10)
  private long id;

  @Column(name="user_name")
  private String userName;

  private String email;

  private String pass;

  private String passwd;

  private int t = 0;

  private long u;

  private long d;

  @Column(name="transfer_enable")
  private long transferEnable;

  private int port;

  @Column(name="switch")
  private int switchState = 1;

  private int enable = 1;

  private int type = 1;

  @Column(name="last_get_gift_time")
  private int lastGetGiftTime = 0;

  @Column(name="last_check_in_time")
  private int lastCheckInTime = 0;

  @Column(name="last_rest_pass_time")
  private int lastResetPassTime = 0;

  @Column(name="reg_date")
  private Date regDate;


  @Column(name="invite_num")
  private int inviteNum = 0;

  @Column(name="is_admin")
  private int isAdmin = 0;

  @Column(name="ref_by")
  private int refBy = 0;

  @Column(name="expire_time")
  private int expireTime = 0;

  private String method = "rc4-md5";


  @Column(name="is_email_verify")
  private int isEmailVerify = 0;

  @Column(name="reg_ip")
  private String regIp = "127.0.0.1";

























































































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

  public int getSwitchState() {
    return switchState;
  }

  public void setSwitchState(int switchState) {
    this.switchState = switchState;
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

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }

  public int getLastGetGiftTime() {
    return lastGetGiftTime;
  }

  public void setLastGetGiftTime(int lastGetGiftTime) {
    this.lastGetGiftTime = lastGetGiftTime;
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
