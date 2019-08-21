package me.tutttuwi.lifelogger.home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.seasar.doma.jdbc.tx.TransactionManager;
import me.tutttuwi.lifelogger.constants.ResultCodefBusiness;
import me.tutttuwi.lifelogger.db.AppConfig;
import me.tutttuwi.lifelogger.db.dao.UserIdpwDao;
import me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl;
import me.tutttuwi.lifelogger.db.entity.UserIdpw;
import me.tutttuwi.lifelogger.util.PasswordUtil;

/**
 * Login Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
class HomeBusiness {

  /** Logger. */
  private Logger logger = LogManager.getLogger(HomeBusiness.class);

  private final UserIdpwDao dao = new UserIdpwDaoImpl();
  private final TransactionManager tm = AppConfig.singleton().getTransactionManager();

  /**
   * Login Proc.<br>
   *
   * @return result - ResultCodefBusiness ビジネス処理結果
   */
  protected ResultCodefBusiness login(String id, String pw) {
    ResultCodefBusiness result = ResultCodefBusiness.ERROR;
    String safePw = PasswordUtil.getSafetyPassword(pw);
    UserIdpw userIdpw = tm.required(() -> {
      return dao.selectByIdAndPw(id, safePw);
    });
    if (userIdpw != null) {
      // OK
      result = ResultCodefBusiness.SUCCESS;
    } else {
      // NG: login failed
      result = ResultCodefBusiness.LOGIN_FAILED_IDPW_UN_MATCH;
    }

    logger.info("result code business -> " + result);
    return result;
  }
}
