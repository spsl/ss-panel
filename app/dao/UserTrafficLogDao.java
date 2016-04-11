package dao;

import models.Config;
import models.Log;
import models.UserTrafficLog;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:30.
 */
public class UserTrafficLogDao {

  public static UserTrafficLog findById(Long id) {
    return JPA.em().find(UserTrafficLog.class, id);
  }

  public static void add(UserTrafficLog userTrafficLog) {
    JPA.em().persist(userTrafficLog);
  }

  public static void update(UserTrafficLog userTrafficLog) {
    JPA.em().merge(userTrafficLog);
  }

  public static void delete(Long id) {
    UserTrafficLog userTrafficLog = findById(id);
    JPA.em().remove(userTrafficLog);
  }


}
