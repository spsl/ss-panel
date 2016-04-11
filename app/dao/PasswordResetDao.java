package dao;

import models.Config;
import models.Log;
import models.PasswordReset;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:29.
 */
public class PasswordResetDao {

  public static PasswordReset findById(Long id) {
    return JPA.em().find(PasswordReset.class, id);
  }

  public static void add(PasswordReset passwordReset) {
    JPA.em().persist(passwordReset);
  }

  public static void update(PasswordReset passwordReset) {
    JPA.em().merge(passwordReset);
  }

  public static void delete(Long id) {
    PasswordReset passwordReset = findById(id);
    JPA.em().remove(passwordReset);
  }
}
