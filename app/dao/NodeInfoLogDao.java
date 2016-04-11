package dao;

import models.Config;
import models.Log;
import models.NodeInfoLog;
import play.db.jpa.JPA;

/**
 * Created by sunsai on 2016/4/11 - 12:29.
 */
public class NodeInfoLogDao {

  public static NodeInfoLog findById(Long id) {
    return JPA.em().find(NodeInfoLog.class, id);
  }

  public static void add(NodeInfoLog nodeInfoLog) {
    JPA.em().persist(nodeInfoLog);
  }

  public static void update(NodeInfoLog nodeInfoLog) {
    JPA.em().merge(nodeInfoLog);
  }

  public static void delete(Long id) {
    NodeInfoLog nodeInfoLog = findById(id);
    JPA.em().remove(nodeInfoLog);
  }
}
