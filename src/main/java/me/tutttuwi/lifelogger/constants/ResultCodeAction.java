package me.tutttuwi.lifelogger.constants;

/**
 * Result Code - Action.
 *
 * @author Tomo
 *
 */
public enum ResultCodeAction {
  // @formatter:off

  SUCCESS("success"),
  LOGIN("login"),
  LOGOUT("logout"),
  INPUT("input"),
  MAINTENANCE("maintenance"),
  SESSION_EXPIRED("session_expired"),
  TOKEN_CHECK("token_check"),
  ERROR("error");

  // @formatter:on

  public final String CODE;

  private ResultCodeAction(String code) {
    this.CODE = code;
  }
}
