package dao;

import models.User;
import play.db.jpa.JPA;

/**
 * Created by spsl on 2016/4/10 - 15:46.
 */
public class UserDao {

  public static User findById(Long id) {
    return JPA.em().find(User.class, id);
  }

  public static void add(User user) {
    JPA.em().persist(user);
  }

  public static void update(User user) {
    JPA.em().merge(user);
  }

  public static void delete(Long id) {
    User user = findById(id);
    JPA.em().remove(user);
  }

}