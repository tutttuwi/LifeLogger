package me.tutttuwi.lifelogger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public abstract class ActionSupportWebWrapper extends ActionSupport
    implements ServletRequestAware, ServletResponseAware {

  /** Request. */
  protected HttpServletRequest req;
  /** Response. */
  protected HttpServletResponse res;

  @Override
  public void setServletRequest(HttpServletRequest paramHttpServletRequest) {
    this.req = paramHttpServletRequest;
  }

  @Override
  public void setServletResponse(HttpServletResponse paramHttpServletResponse) {
    this.res = paramHttpServletResponse;
  }

  /**
   * Initialize Action. <br/>
   *
   * @return result - ResultCode
   */
  public abstract String doInit();

  /**
   * Get Cookie By KeyName <br/>
   * if value related with key does'nt exist, return null.<br/>
   *
   * @param key - Cookie KeyName
   * @return value - Cookie Value
   */
  public String getCookie(String key) {
    String value = null;
    Cookie[] cookies = req.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (key.equals(cookie.getName())) {
          value = cookie.getValue();
          break;
        }
      }
    }
    return value;
  }

  /**
   * Set Cookie Info. <br>
   *
   * @param key - Cookie KeyName
   * @param value - Cookie Value
   * @param maxAge - Cookie expire MaxAge
   */
  public void setCookie(String key, String value, int maxAge) {
    Cookie cookie = new Cookie(key, value);
    cookie.setMaxAge(maxAge);
    cookie.setPath("/");
    // if http connection, add secure attribute.
    if ("https".equals(req.getScheme())) {
      cookie.setSecure(true);
    }
    res.addCookie(cookie);
  }

  /**
   * Remove Cookie Info. <br>
   *
   * @param key - Cookie KeyName
   */
  public void removeCookie(String key) {
    Cookie[] cookies = req.getCookies();
    for (Cookie cookie : cookies) {
      if (key.equals(cookie.getName())) {
        cookie.setValue("");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        res.addCookie(cookie);
      }
    }
  }

  /**
   * Set Session Object. <br>
   *
   * @param key - String
   * @param value - Object
   */
  public void setSession(String key, Object value) {
    req.getSession().setAttribute(key, value);
  }

  /**
   * Remove Session Object. <br>
   *
   * @param key - String
   */
  public void removeSession(String key) {
    req.getSession().setAttribute(key, null);
  }

  /**
   * Get Session Object. <br>
   * return Object, so please cast type you want.
   *
   * @param key - String
   * @return value - Object
   */
  public Object getSession(String key) {
    return req.getSession().getAttribute(key);
  }
}
