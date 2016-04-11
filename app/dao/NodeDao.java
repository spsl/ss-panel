package dao;

import models.Node;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:28.
 */
public class NodeDao {

  public static Node findById(Long id) {
    return JPA.em().find(Node.class, id);
  }

  public static void add(Node node) {
    JPA.em().persist(node);
  }

  public static void update(Node node) {
    JPA.em().merge(node);
  }

  public static void delete(Long id) {
    Node node = findById(id);
    JPA.em().remove(node);
  }

}
