package me.tutttuwi.lifelogger.db.entity;

import java.sql.Timestamp;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;
import lombok.Data;
import lombok.ToString;

@ToString()
@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "user_idpw")
@Data
public class UserIdpw {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer seq;

  private String id;

  private String password;

  private String user_kb;

  private Timestamp create_dt;

  private Timestamp update_dt;

}
