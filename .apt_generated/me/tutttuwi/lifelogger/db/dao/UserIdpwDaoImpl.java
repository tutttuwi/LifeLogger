package me.tutttuwi.lifelogger.db.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-08-21T23:01:00.061+0900")
public class UserIdpwDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements me.tutttuwi.lifelogger.db.dao.UserIdpwDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserIdpwDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserIdpwDao.class, "selectByIdAndPw", java.lang.String.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserIdpwDao.class, "insert", me.tutttuwi.lifelogger.db.entity.UserIdpw.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserIdpwDao.class, "update", me.tutttuwi.lifelogger.db.entity.UserIdpw.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserIdpwDao.class, "delete", me.tutttuwi.lifelogger.db.entity.UserIdpw.class);

    /** */
    public UserIdpwDaoImpl() {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public UserIdpwDaoImpl(java.sql.Connection connection) {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public UserIdpwDaoImpl(javax.sql.DataSource dataSource) {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected UserIdpwDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected UserIdpwDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected UserIdpwDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<me.tutttuwi.lifelogger.db.entity.UserIdpw> selectAll() {
        entering("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/me/tutttuwi/lifelogger/db/dao/UserIdpwDao/selectAll.sql");
            __query.setEntityType(me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal());
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<me.tutttuwi.lifelogger.db.entity.UserIdpw>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<me.tutttuwi.lifelogger.db.entity.UserIdpw>(me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal()));
            java.util.List<me.tutttuwi.lifelogger.db.entity.UserIdpw> __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserIdpw selectByIdAndPw(java.lang.String id, java.lang.String pw) {
        entering("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "selectByIdAndPw", id, pw);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/me/tutttuwi/lifelogger/db/dao/UserIdpwDao/selectByIdAndPw.sql");
            __query.setEntityType(me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal());
            __query.addParameter("id", java.lang.String.class, id);
            __query.addParameter("pw", java.lang.String.class, pw);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl");
            __query.setCallerMethodName("selectByIdAndPw");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<me.tutttuwi.lifelogger.db.entity.UserIdpw> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<me.tutttuwi.lifelogger.db.entity.UserIdpw>(me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal()));
            me.tutttuwi.lifelogger.db.entity.UserIdpw __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "selectByIdAndPw", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "selectByIdAndPw", __e);
            throw __e;
        }
    }

    @Override
    public int insert(me.tutttuwi.lifelogger.db.entity.UserIdpw idpw) {
        entering("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "insert", idpw);
        try {
            if (idpw == null) {
                throw new org.seasar.doma.DomaNullPointerException("idpw");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<me.tutttuwi.lifelogger.db.entity.UserIdpw> __query = getQueryImplementors().createAutoInsertQuery(__method2, me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(idpw);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(me.tutttuwi.lifelogger.db.entity.UserIdpw idpw) {
        entering("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "update", idpw);
        try {
            if (idpw == null) {
                throw new org.seasar.doma.DomaNullPointerException("idpw");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<me.tutttuwi.lifelogger.db.entity.UserIdpw> __query = getQueryImplementors().createAutoUpdateQuery(__method3, me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(idpw);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(me.tutttuwi.lifelogger.db.entity.UserIdpw idpw) {
        entering("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "delete", idpw);
        try {
            if (idpw == null) {
                throw new org.seasar.doma.DomaNullPointerException("idpw");
            }
            org.seasar.doma.jdbc.query.AutoDeleteQuery<me.tutttuwi.lifelogger.db.entity.UserIdpw> __query = getQueryImplementors().createAutoDeleteQuery(__method4, me.tutttuwi.lifelogger.db.entity._UserIdpw.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(idpw);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserIdpwDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
