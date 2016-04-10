package models;

import play.db.jpa.JPA;

/**
 * Created by spsl on 2016/4/10 - 15:48.
 */
public class InviteCodeDao {

  public static InviteCode findById(Long id) {
    return JPA.em().find(InviteCode.class, id);
  }

  public static void add(InviteCode inviteCode) {
    JPA.em().persist(inviteCode);
  }

  public static void update(InviteCode inviteCode) {
    JPA.em().merge(inviteCode);
  }

  public static void delete(Long id) {
    InviteCode inviteCode = findById(id);
    JPA.em().remove(inviteCode);
  }

}
