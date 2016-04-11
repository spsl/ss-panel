package dao;

import models.NodeOnlineLog;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:29.
 */
public class NodeOnlineLogDao {

  public static NodeOnlineLog findById(Long id) {
    return JPA.em().find(NodeOnlineLog.class, id);
  }

  public static void add(NodeOnlineLog nodeOnlineLog) {
    JPA.em().persist(nodeOnlineLog);
  }

  public static void update(NodeOnlineLog nodeOnlineLog) {
    JPA.em().merge(nodeOnlineLog);
  }

  public static void delete(Long id) {
    NodeOnlineLog nodeOnlineLog = findById(id);
    JPA.em().remove(nodeOnlineLog);
  }
}
