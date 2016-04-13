package dao;

import java.util.List;
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

  /**
   * 验证登录信息
   * @param username
   * @param password
   * @return
   */
  public static User auth(String username, String password) {

    //String queryString = "from User user where isEnable =1 and username=? and password=?";
    //
    ////String queryString = "";
    //
    //@SuppressWarnings("unchecked")
    //List<User> result = JPA.em().createQuery(queryString)
    //    .setParameter(1, username)
    //    .setParameter(2, password)
    //    .getResultList();
    //
    //if(result.size() > 0){
    //  return result.get(0);
    //}

    return null;
  }

}
