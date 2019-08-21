package me.tutttuwi.lifelogger.home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tutttuwi.lifelogger.ActionSupportWebWrapper;
import me.tutttuwi.lifelogger.constants.ResultCodeAction;

/**
 * Home Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HomeAction extends ActionSupportWebWrapper
    implements ServletRequestAware, ServletResponseAware {

  /** Logger. */
  private Logger logger = LogManager.getLogger(HomeAction.class);

  /**
   * Home Init.<br>
   * Initialize Home Screen<br>
   * <br>
   *
   * @return result
   */
  @Override
  public String doInit() {
    return ResultCodeAction.SUCCESS.CODE;
  }

  /**
   * Go To LogoutAction.<br>
   *
   * @return result
   */
  public String doLogout() {
    return ResultCodeAction.LOGOUT.CODE;
  }
}
