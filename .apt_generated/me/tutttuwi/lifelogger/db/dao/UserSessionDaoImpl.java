package me.tutttuwi.lifelogger.db.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-08-21T23:01:00.069+0900")
public class UserSessionDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements me.tutttuwi.lifelogger.db.dao.UserSessionDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserSessionDao.class, "selectBySeq", java.lang.String.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserSessionDao.class, "selectBySessionId", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserSessionDao.class, "insert", me.tutttuwi.lifelogger.db.entity.UserSession.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserSessionDao.class, "update", me.tutttuwi.lifelogger.db.entity.UserSession.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(me.tutttuwi.lifelogger.db.dao.UserSessionDao.class, "delete", me.tutttuwi.lifelogger.db.entity.UserSession.class);

    /** */
    public UserSessionDaoImpl() {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton());
    }

    /**
     * @param connection the connection
     */
    public UserSessionDaoImpl(java.sql.Connection connection) {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public UserSessionDaoImpl(javax.sql.DataSource dataSource) {
        super(me.tutttuwi.lifelogger.db.AppConfig.singleton(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected UserSessionDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected UserSessionDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected UserSessionDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserSession selectBySeq(java.lang.String seq) {
        entering("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "selectBySeq", seq);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/me/tutttuwi/lifelogger/db/dao/UserSessionDao/selectBySeq.sql");
            __query.setEntityType(me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal());
            __query.addParameter("seq", java.lang.String.class, seq);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl");
            __query.setCallerMethodName("selectBySeq");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<me.tutttuwi.lifelogger.db.entity.UserSession> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<me.tutttuwi.lifelogger.db.entity.UserSession>(me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal()));
            me.tutttuwi.lifelogger.db.entity.UserSession __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "selectBySeq", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "selectBySeq", __e);
            throw __e;
        }
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserSession selectBySessionId(java.lang.String sessionId) {
        entering("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "selectBySessionId", sessionId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/me/tutttuwi/lifelogger/db/dao/UserSessionDao/selectBySessionId.sql");
            __query.setEntityType(me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal());
            __query.addParameter("sessionId", java.lang.String.class, sessionId);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl");
            __query.setCallerMethodName("selectBySessionId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<me.tutttuwi.lifelogger.db.entity.UserSession> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<me.tutttuwi.lifelogger.db.entity.UserSession>(me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal()));
            me.tutttuwi.lifelogger.db.entity.UserSession __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "selectBySessionId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "selectBySessionId", __e);
            throw __e;
        }
    }

    @Override
    public int insert(me.tutttuwi.lifelogger.db.entity.UserSession session) {
        entering("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "insert", session);
        try {
            if (session == null) {
                throw new org.seasar.doma.DomaNullPointerException("session");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<me.tutttuwi.lifelogger.db.entity.UserSession> __query = getQueryImplementors().createAutoInsertQuery(__method2, me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(session);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl");
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
            exiting("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(me.tutttuwi.lifelogger.db.entity.UserSession session) {
        entering("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "update", session);
        try {
            if (session == null) {
                throw new org.seasar.doma.DomaNullPointerException("session");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<me.tutttuwi.lifelogger.db.entity.UserSession> __query = getQueryImplementors().createAutoUpdateQuery(__method3, me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(session);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl");
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
            exiting("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(me.tutttuwi.lifelogger.db.entity.UserSession session) {
        entering("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "delete", session);
        try {
            if (session == null) {
                throw new org.seasar.doma.DomaNullPointerException("session");
            }
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/me/tutttuwi/lifelogger/db/dao/UserSessionDao/delete.sql");
            __query.addParameter("session", me.tutttuwi.lifelogger.db.entity.UserSession.class, session);
            __query.setCallerClassName("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setEntityAndEntityType("session", session, me.tutttuwi.lifelogger.db.entity._UserSession.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("me.tutttuwi.lifelogger.db.dao.UserSessionDaoImpl", "delete", __e);
            throw __e;
        }
    }

}
