package me.tutttuwi.lifelogger.logout;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tutttuwi.lifelogger.ActionSupportWebWrapper;
import me.tutttuwi.lifelogger.constants.CookieKey;
import me.tutttuwi.lifelogger.constants.ResultCodeAction;
import me.tutttuwi.lifelogger.constants.ResultCodefBusiness;
import me.tutttuwi.lifelogger.login.LoginAction;

/**
 * Login Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LogoutAction extends ActionSupportWebWrapper {

  /** Logger. */
  private Logger logger = LogManager.getLogger(LoginAction.class);

  /**
   * Logout Init.<br>
   * Logout and back Login Screen.<br>
   * <br>
   *
   * @return result
   */
  @Override
  public String doInit() {
    String result = ResultCodeAction.ERROR.CODE;
    // Logout
    ResultCodefBusiness resultCodeLogin =
        new LogoutBusiness().logout(getCookie(CookieKey.SESSION_ID.KEY));

    // Handling Result
    switch (resultCodeLogin) {
      case SUCCESS:
        // Destroy Session info in Cookie
        super.removeCookie(CookieKey.SESSION_ID.KEY);
        super.removeCookie(CookieKey.IS_KEEP_LOGIN_STATUS.KEY);
        removeSession(CookieKey.SESSION_ID.KEY);
        removeSession(CookieKey.IS_KEEP_LOGIN_STATUS.KEY);
        result = ResultCodeAction.SUCCESS.CODE;
        break;
      default:
        result = ResultCodeAction.ERROR.CODE;
    }
    return result;
  }
}
