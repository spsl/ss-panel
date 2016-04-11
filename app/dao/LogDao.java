package dao;

import models.Config;
import models.Log;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:28.
 */
public class LogDao {

  public static Log findById(Long id) {
    return JPA.em().find(Log.class, id);
  }

  public static void add(Config log) {
    JPA.em().persist(log);
  }

  public static void update(Config log) {
    JPA.em().merge(log);
  }

  public static void delete(Long id) {
    Log log = findById(id);
    JPA.em().remove(log);
  }

}
