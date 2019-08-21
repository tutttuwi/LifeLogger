package me.tutttuwi.lifelogger;

import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.seasar.doma.jdbc.tx.TransactionManager;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import me.tutttuwi.lifelogger.constants.CookieKey;
import me.tutttuwi.lifelogger.constants.ResultCodeAction;
import me.tutttuwi.lifelogger.db.AppConfig;
import me.tutttuwi.lifelogger.db.dao.UserSessionDao;
import me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl;
import me.tutttuwi.lifelogger.db.entity.UserSession;
import me.tutttuwi.lifelogger.login.LoginAction;

public class LoginCheckInterceptor extends MethodFilterInterceptor {

  /** UserSession. */
  private final UserSessionDao userSessionDao = new UserSessionDaoImpl();
  /** Transaction. */
  private final TransactionManager tm = AppConfig.singleton().getTransactionManager();

  @Override
  protected String doIntercept(ActionInvocation invocation) throws Exception {

    // アクションチェック（レスポンスの場合スキップ）
    if (invocation.isExecuted()) {
      return invocation.invoke();
    }
    ActionSupportWebWrapper action = (ActionSupportWebWrapper) invocation.getAction();

    // Variable Definition
    String sessionId = Objects.nonNull(action.getCookie("sessionId"))
        ? action.getCookie("sessionId") : (String) action.getSession(CookieKey.SESSION_ID.KEY);
    String keepLoginStatus = Objects.nonNull(action.getCookie("isKeepLoginStatus"))
        ? action.getCookie("isKeepLoginStatus")
        : (String) action.getSession(CookieKey.IS_KEEP_LOGIN_STATUS.KEY);
    boolean existUserSession = false;
    // Action Before
    if (StringUtils.isNotEmpty(sessionId)) {
      UserSession selectUserSession = tm.required(() -> {
        return userSessionDao.selectBySessionId(sessionId);
      });
      existUserSession = Objects.nonNull(selectUserSession) ? true : false;
      // TODO:ログイン維持しているかつセッションが存在しない場合は、セッションを作成する処理を実装
      // if (!StringUtils.isEmpty(keepLoginStatus) && existUserSession){
      // // ログイン維持している かつ セッションが存在しない
      // tm.required(()->{
      // return userSessionDao.insert(session)
      // });
      // }
    }
    if (StringUtils.isEmpty(keepLoginStatus) && !existUserSession) {
      // ログイン維持していない かつ セッションが存在しない
      return ResultCodeAction.SESSION_EXPIRED.CODE;
    }

    if (action instanceof LoginAction) {
      return ResultCodeAction.LOGIN.CODE;
    }
    return invocation.invoke();
  }
}
