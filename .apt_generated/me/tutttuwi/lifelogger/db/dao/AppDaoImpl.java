package me.tutttuwi.lifelogger.db.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-08-21T23:01:00.054+0900")
public class AppDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements me.tutttuwi.lifelogger.db.dao.AppDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    /** */
    public AppDaoImpl() {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public AppDaoImpl(java.sql.Connection connection) {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public AppDaoImpl(javax.sql.DataSource dataSource) {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected AppDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected AppDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected AppDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

}
