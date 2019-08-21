package me.tutttuwi.lifelogger.db.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import me.tutttuwi.lifelogger.db.AppConfig;
import me.tutttuwi.lifelogger.db.entity.UserSession;

@Dao(config = AppConfig.class)
public interface UserSessionDao {

  @Select
  UserSession selectBySeq(String seq);

  @Select
  UserSession selectBySessionId(String sessionId);

  @Insert
  int insert(UserSession session);

  @Update
  int update(UserSession session);

  @Delete(sqlFile = true)
  int delete(UserSession session);

}
