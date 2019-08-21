package me.tutttuwi.lifelogger.constants;

public enum CookieKey {
  // @formatter:off

  IS_KEEP_LOGIN_STATUS("isKeepLoginStatus", 60 * 60 * 24 * 12 * 100),
  SESSION_ID("sessionId", 60 * 30);

  // @formatter:on

  public final String KEY;
  public final int MAX_AGE;

  private CookieKey(String key, int maxAge) {
    this.KEY = key;
    this.MAX_AGE = maxAge;
  }
}
