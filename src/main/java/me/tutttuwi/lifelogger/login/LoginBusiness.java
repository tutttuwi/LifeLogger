package me.tutttuwi.lifelogger.login;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.seasar.doma.jdbc.tx.TransactionManager;
import me.tutttuwi.lifelogger.app.CookieBean;
import me.tutttuwi.lifelogger.constants.ResultCodefBusiness;
import me.tutttuwi.lifelogger.db.AppConfig;
import me.tutttuwi.lifelogger.db.dao.UserIdpwDao;
import me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl;
import me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl;
import me.tutttuwi.lifelogger.db.entity.UserIdpw;
import me.tutttuwi.lifelogger.db.entity.UserSession;
import me.tutttuwi.lifelogger.util.PasswordUtil;

/**
 * Login Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
class LoginBusiness {

  // TODO: Log実装
  /** Logger. */
  private Logger logger = LogManager.getLogger(LoginBusiness.class);

  private final UserIdpwDao userIdpwDao = new UserIdpwDaoImpl();
  private final UserSessionDaoImpl userSessionDao = new UserSessionDaoImpl();
  private final TransactionManager tm = AppConfig.singleton().getTransactionManager();

  /**
   * Login Proc.<br>
   *
   * @param loginFormBean - ログインフォーム
   * @param cookieBean - クッキー情報
   * @return result - ResultCodefBusiness ビジネス処理結果
   */
  protected ResultCodefBusiness login(LoginFormBean bean, CookieBean cookieBean) {
    String safePw = PasswordUtil.getSafetyPassword(bean.getPw());
    String id = bean.getId();
    UserIdpw selectUserIdpw = tm.required(() -> {
      return userIdpwDao.selectByIdAndPw(id, safePw);
    });

    boolean existUserIdpw = Objects.nonNull(selectUserIdpw) ? true : false;
    if (!existUserIdpw) {
      // NG: login failed
      return ResultCodefBusiness.LOGIN_FAILED_IDPW_UN_MATCH;
    }

    // OK: login success
    UserSession insUserSession = new UserSession();
    String sessionId = UUID.randomUUID().toString();
    insUserSession.setSeq(selectUserIdpw.getSeq());
    insUserSession.setSession_id(sessionId);
    insUserSession.setCreate_dt(new Timestamp(System.currentTimeMillis()));
    insUserSession.setUpdate_dt(new Timestamp(System.currentTimeMillis()));

    tm.required(() -> {
      return userSessionDao.insert(insUserSession);
    });
    cookieBean.setSessionId(sessionId);
    // bean.setSessionId(sessionId);
    return ResultCodefBusiness.SUCCESS;
  }
}
