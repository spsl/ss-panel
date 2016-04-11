package dao;

import models.Config;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:28.
 */
public class ConfigDao {

  public static Config findById(Long id) {
    return JPA.em().find(Config.class, id);
  }

  public static void add(Config config) {
    JPA.em().persist(config);
  }

  public static void update(Config config) {
    JPA.em().merge(config);
  }

  public static void delete(Long id) {
    Config config = findById(id);
    JPA.em().remove(config);
  }

}
