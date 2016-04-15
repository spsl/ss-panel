package dao;

import models.Config;

/**
 * Created by sunsai on 2016/4/11 - 12:28.
 */
public class ConfigDao {

  public static Config findById(Long id) {
    return Config.find.byId(id);
  }

  public static void add(Config config) {
    config.save();
  }

  public static void update(Config config) {
    config.update();
  }

  public static void delete(Long id) {
    Config.find.deleteById(id);
  }

}
