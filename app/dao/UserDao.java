package dao;

import com.avaje.ebean.Expression;
import com.avaje.ebean.Model;
import java.util.List;
import models.User;
import play.db.jpa.JPA;

import static com.avaje.ebean.Expr.eq;
import static com.avaje.ebean.Expr.like;

/**
 * Created by spsl on 2016/4/10 - 15:46.
 */
public class UserDao {

  public static Model.Finder<Long, User> find = new Model.Finder<>(User.class);


  public static User findById(Long id) {
    return find.byId(id);
  }

  public static void add(User user) {
      user.save();
  }

  public static void update(User user) {
    user.update();
  }

  public static void delete(Long id) {
    find.deleteById(id);
  }

  /**
   * 验证登录信息
   * @param username
   * @param password
   * @return
   */
  public static User auth(String username, String password) {



    return null;
  }


  public static User findByUsernameOrEmail(String username, String email) {
    return find.where()
        .or(eq("email", email), eq("userName", username))
        .findUnique();
  }


  //public static Finder<Long,User> find = new Finder (
  //    Long.class, Locale.Category.class
  //);

}
