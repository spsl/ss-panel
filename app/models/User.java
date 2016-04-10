package models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/9 - 18:18.
 */


@Entity
@Table(name="user")
public class User {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  public long id;

  public String username;

  public static User findById(Long id){
    return JPA.em().find(User.class, id);
  }

  public static void add(User user){
    JPA.em().persist(user);
  }

  public static void update(User user){
    JPA.em().merge(user);
  }

  public static void delete(Long id){
    User user = findById(id);
    JPA.em().remove(user);
  }

}
