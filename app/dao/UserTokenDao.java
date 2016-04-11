package dao;

import models.Config;
import models.Log;
import models.UserToken;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:29.
 */
public class UserTokenDao {

  public static UserToken findById(Long id) {
    return JPA.em().find(UserToken.class, id);
  }

  public static void add(UserToken userToken) {
    JPA.em().persist(userToken);
  }

  public static void update(UserToken userToken) {
    JPA.em().merge(userToken);
  }

  public static void delete(Long id) {
    UserToken userToken = findById(id);
    JPA.em().remove(userToken);
  }
}
