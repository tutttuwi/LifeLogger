package me.tutttuwi.lifelogger.util;

import java.util.ResourceBundle;

public final class ConfigLoader {

  /** Resouce. */
  private static final ResourceBundle resouce = ResourceBundle.getBundle("config");

  /**
   * Constructor.<br/>
   * Prevent to create new instance object.
   */
  private ConfigLoader() {
    throw new AssertionError();
  }

  /**
   * Get Value from key.
   *
   * @param key - keyname
   * @return value
   */
  public static String getString(String key) {
    return resouce.getString(key);
  }
}
