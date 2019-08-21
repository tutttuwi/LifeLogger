package me.tutttuwi.lifelogger.db;

import javax.sql.DataSource;
import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;
import com.opensymphony.xwork2.ActionSupport;
import me.tutttuwi.lifelogger.constants.PropKey;
import me.tutttuwi.lifelogger.util.ConfigLoader;

@SingletonConfig
public class AppConfig extends ActionSupport implements Config {

  private static final AppConfig CONFIG = new AppConfig();

  private static final Dialect dialect = new PostgresDialect();

  private final LocalTransactionDataSource dataSource;

  private final TransactionManager transactionManager;

  static {
    try {
      // Class.forName(new ActionSupport().getText(PropKey.DB_CLASS.KEY));
      Class.forName(ConfigLoader.getString(PropKey.DB_CLASS.KEY));
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private AppConfig() {
    // final String JDBC_STRING = "jdbc:postgresql://localhost:5432/postgres";
    // final String JDBC_USER = "postgres";
    // final String JDBC_PASSWORD = "";
    final String JDBC_STRING = ConfigLoader.getString(PropKey.DB_URL.KEY);
    final String JDBC_USER = ConfigLoader.getString(PropKey.DB_USER.KEY);
    final String JDBC_PASSWORD = ConfigLoader.getString(PropKey.DB_PASS.KEY);
    // TODO: DB接続の際にスキーマを明示的に設定する
    // final String JDBC_SCHEMA = ConfigLoader.getString(PropKey.DB_SCHEMA.KEY));
    dataSource = new LocalTransactionDataSource(JDBC_STRING, JDBC_USER, JDBC_PASSWORD);
    transactionManager =
        new LocalTransactionManager(dataSource.getLocalTransaction(getJdbcLogger()));
  }

  @Override
  public Dialect getDialect() {
    return dialect;
  }

  @Override
  public DataSource getDataSource() {
    return dataSource;
  }

  @Override
  public TransactionManager getTransactionManager() {
    return transactionManager;
  }

  public static AppConfig singleton() {
    return CONFIG;
  }
}
