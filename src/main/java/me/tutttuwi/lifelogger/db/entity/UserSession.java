package me.tutttuwi.lifelogger.db.entity;

import java.sql.Timestamp;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;
import lombok.Data;
import lombok.ToString;

@ToString()
@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "user_session")
@Data
public class UserSession {

  @Id
  private Integer seq;

  private String session_id;

  private Timestamp create_dt;

  private Timestamp update_dt;

}
