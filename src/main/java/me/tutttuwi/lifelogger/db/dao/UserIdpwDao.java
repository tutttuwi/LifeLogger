package me.tutttuwi.lifelogger.db.dao;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import me.tutttuwi.lifelogger.db.AppConfig;
import me.tutttuwi.lifelogger.db.entity.UserIdpw;

@Dao(config = AppConfig.class)
public interface UserIdpwDao {

  @Select
  List<UserIdpw> selectAll();

  @Select
  UserIdpw selectByIdAndPw(String id, String pw);

  @Insert
  int insert(UserIdpw idpw);

  @Update
  int update(UserIdpw idpw);

  @Delete
  int delete(UserIdpw idpw);

}
