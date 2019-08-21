package me.tutttuwi.lifelogger.login;

import lombok.Data;

/**
 * Login Bean.<br>
 * <br>
 *
 * @author tutttuwi
 */
@Data
public class LoginFormBean {

  /** id. */
  private String id;

  /** password. */
  private String pw;

  /** isKeepLoginStatus. */
  private String isKeepLoginStatus;

  /** isKeepLoginStatusSelected. */
  private boolean isKeepLoginStatusSelected;
}
