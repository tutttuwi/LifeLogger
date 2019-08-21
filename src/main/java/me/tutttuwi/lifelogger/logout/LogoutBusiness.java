package me.tutttuwi.lifelogger.logout;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.seasar.doma.jdbc.tx.TransactionManager;
import me.tutttuwi.lifelogger.constants.ResultCodefBusiness;
import me.tutttuwi.lifelogger.db.AppConfig;
import me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl;
import me.tutttuwi.lifelogger.db.entity.UserSession;

/**
 * Login Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
class LogoutBusiness {

  // TODO: Log実装
  /** Logger. */
  private Logger logger = LogManager.getLogger(LogoutBusiness.class);

  private final UserSessionDaoImpl userSessionDao = new UserSessionDaoImpl();
  private final TransactionManager tm = AppConfig.singleton().getTransactionManager();

  /**
   * Logout Proc.<br>
   *
   * @return result - ResultCodefBusiness ビジネス処理結果
   */
  protected ResultCodefBusiness logout(String sessionId) {

    UserSession delUserSession = new UserSession();
    delUserSession.setSession_id(sessionId);

    Integer delCnt = tm.required(() -> {
      return userSessionDao.delete(delUserSession);
    });
    boolean delIsSuccess = delCnt > 0 ? true : false;

    if (delIsSuccess) {
      return ResultCodefBusiness.SUCCESS;
    } else {
      return ResultCodefBusiness.ERROR;
    }
  }
}
