package me.tutttuwi.lifelogger.login;

import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.opensymphony.xwork2.interceptor.annotations.After;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import com.opensymphony.xwork2.interceptor.annotations.BeforeResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tutttuwi.lifelogger.ActionSupportWebWrapper;
import me.tutttuwi.lifelogger.app.CookieBean;
import me.tutttuwi.lifelogger.constants.CookieKey;
import me.tutttuwi.lifelogger.constants.PropKey;
import me.tutttuwi.lifelogger.constants.ResultCodeAction;
import me.tutttuwi.lifelogger.constants.ResultCodefBusiness;

/**
 * Login Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginAction extends ActionSupportWebWrapper {

  /** Logger. */
  private Logger logger = LogManager.getLogger(LoginAction.class);
  /** id. */
  private String id;
  /** password. */
  private String pw;
  /** isKeepLoginStatus. */
  private String isKeepLoginStatus;
  /** LoginFormBean. */
  private LoginFormBean loginFormBean = new LoginFormBean();
  /** LoginFormBean. */
  private CookieBean cookieBean = new CookieBean();

  /**
   * Login Init.<br>
   * Initialize Login Screen<br>
   * <br>
   *
   * @return result
   */
  @Override
  public String doInit() {
    return ResultCodeAction.SUCCESS.CODE;
  }

  /**
   * Login Proc.<br>
   * Do Login using id and password from user<br>
   * <br>
   *
   * @return result
   */
  public String doLogin() {
    String result = ResultCodeAction.ERROR.CODE;
    logger.info("id: " + loginFormBean.getId());
    logger.info("pw: " + loginFormBean.getPw());
    logger.info("isKeepLoginStatus: " + loginFormBean.isKeepLoginStatusSelected());
    // Cookie Info
    if (!loginFormBean.isKeepLoginStatusSelected()) {
      // Destroy keep login.
      super.removeCookie(CookieKey.IS_KEEP_LOGIN_STATUS.KEY);
    }
    // Login
    ResultCodefBusiness resultCodeLogin = new LoginBusiness().login(loginFormBean, cookieBean);

    // Handling Result
    switch (resultCodeLogin) {
      case SUCCESS:
        // CookieSet
        setCookie(CookieKey.SESSION_ID.KEY, cookieBean.getSessionId(),
            CookieKey.SESSION_ID.MAX_AGE);
        if (loginFormBean.isKeepLoginStatusSelected()) {
          setCookie(CookieKey.IS_KEEP_LOGIN_STATUS.KEY, UUID.randomUUID().toString(),
              CookieKey.IS_KEEP_LOGIN_STATUS.MAX_AGE);
        }
        setSession(CookieKey.SESSION_ID.KEY, cookieBean.getSessionId());
        result = ResultCodeAction.LOGIN.CODE;
        break;
      case LOGIN_FAILED_IDPW_UN_MATCH:
        addActionError(getText(PropKey.ERROR_FORM_LOGIN_UNMATCH.KEY));
        result = ResultCodeAction.INPUT.CODE;
        break;
      case WARNING_MAINTENANCE:
        result = ResultCodeAction.MAINTENANCE.CODE;
        break;
      default:
        result = ResultCodeAction.ERROR.CODE;
    }
    return result;
  }

  /**
   * Execution Order. <br/>
   * Before -> BeforeResult -> (Validation -> Execute) -> After <br/>
   * if error exist on Validation pahse, Execute is not called. but after is called.<br/>
   */

  /**
   * Before.
   */
  @Before
  public void before() {
    boolean isKeepLoginStatusSelected = "on".equals(this.isKeepLoginStatus) ? true : false;
    loginFormBean.setId(id);
    loginFormBean.setPw(pw);
    loginFormBean.setKeepLoginStatusSelected(isKeepLoginStatusSelected);
  }

  /**
   * BeforeResult.
   */
  @BeforeResult
  public void beforeResult() {
    /** NOP. */
  }

  /**
   * After.
   */
  @After
  public void after() {
    /** NOP. */
  }
}
