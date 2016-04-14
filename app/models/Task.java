package models;

import com.avaje.ebean.Model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.format.Formats;
import play.data.validation.Constraints;

/**
 * Created by sunsai on 2016/4/14 - 20:38.
 */
@Entity
public class Task extends Model {

  @Id
  @Constraints.Min(10)
  public Long id;

  @Constraints.Required
  public String name;

  public String passWord;

  public boolean done;

  @Formats.DateTime(pattern="dd/MM/yyyy")
  public Date dueDate = new Date();

  public static Finder<Long, Task> find = new Finder<Long,Task>(Task.class);

}
