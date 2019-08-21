package me.tutttuwi.lifelogger.unknown;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.validation.SkipValidation;
import me.tutttuwi.lifelogger.ActionSupportWebWrapper;
import me.tutttuwi.lifelogger.constants.ResultCodeAction;

/**
 * Unknown Action.<br>
 * <br>
 *
 * @author tutttuwi
 */
public class UnknownAction extends ActionSupportWebWrapper {

  /** Logger. */
  private Logger logger = LogManager.getLogger(UnknownAction.class);

  /**
   * Unknown Init.<br>
   * Forward to 404page.<br>
   * <br>
   *
   * @return result
   */
  @SkipValidation
  @Override
  public String doInit() {
    return ResultCodeAction.SUCCESS.CODE;
  }
}
