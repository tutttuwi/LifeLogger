package me.tutttuwi.lifelogger.app;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Login Bean.<br>
 * <br>
 *
 * @author tutttuwi
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CookieBean {

  /**
   * sessionID. <br/>
   */
  private String sessionId;

  /**
   * Status to keep login. <br/>
   */
  private String isKeepLoginStatus;

}
