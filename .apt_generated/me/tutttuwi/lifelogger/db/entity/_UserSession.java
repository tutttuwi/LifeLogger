package me.tutttuwi.lifelogger.db.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-08-21T23:01:00.051+0900")
public final class _UserSession extends org.seasar.doma.jdbc.entity.AbstractEntityType<me.tutttuwi.lifelogger.db.entity.UserSession> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final _UserSession __singleton = new _UserSession();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;

    /** the seq */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, java.lang.Integer, Object> $seq = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserSession.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "seq", "", __namingType, false);

    /** the session_id */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, java.lang.String, Object> $session_id = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserSession.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "session_id", "", __namingType, true, true, false);

    /** the create_dt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, java.sql.Timestamp, Object> $create_dt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserSession.class, java.sql.Timestamp.class, java.sql.Timestamp.class, () -> new org.seasar.doma.wrapper.TimestampWrapper(), null, null, "create_dt", "", __namingType, true, true, false);

    /** the update_dt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, java.sql.Timestamp, Object> $update_dt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserSession.class, java.sql.Timestamp.class, java.sql.Timestamp.class, () -> new org.seasar.doma.wrapper.TimestampWrapper(), null, null, "update_dt", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<me.tutttuwi.lifelogger.db.entity.UserSession>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __entityPropertyTypeMap;

    private _UserSession() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "UserSession";
        __catalogName = "";
        __schemaName = "";
        __tableName = "user_session";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($seq);
        __list.add($seq);
        __map.put("seq", $seq);
        __list.add($session_id);
        __map.put("session_id", $session_id);
        __list.add($create_dt);
        __map.put("create_dt", $create_dt);
        __list.add($update_dt);
        __map.put("update_dt", $update_dt);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(me.tutttuwi.lifelogger.db.entity.UserSession entity, org.seasar.doma.jdbc.entity.PreInsertContext<me.tutttuwi.lifelogger.db.entity.UserSession> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(me.tutttuwi.lifelogger.db.entity.UserSession entity, org.seasar.doma.jdbc.entity.PreUpdateContext<me.tutttuwi.lifelogger.db.entity.UserSession> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(me.tutttuwi.lifelogger.db.entity.UserSession entity, org.seasar.doma.jdbc.entity.PreDeleteContext<me.tutttuwi.lifelogger.db.entity.UserSession> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(me.tutttuwi.lifelogger.db.entity.UserSession entity, org.seasar.doma.jdbc.entity.PostInsertContext<me.tutttuwi.lifelogger.db.entity.UserSession> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(me.tutttuwi.lifelogger.db.entity.UserSession entity, org.seasar.doma.jdbc.entity.PostUpdateContext<me.tutttuwi.lifelogger.db.entity.UserSession> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(me.tutttuwi.lifelogger.db.entity.UserSession entity, org.seasar.doma.jdbc.entity.PostDeleteContext<me.tutttuwi.lifelogger.db.entity.UserSession> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserSession, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserSession newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<me.tutttuwi.lifelogger.db.entity.UserSession, ?>> __args) {
        me.tutttuwi.lifelogger.db.entity.UserSession entity = new me.tutttuwi.lifelogger.db.entity.UserSession();
        if (__args.get("seq") != null) __args.get("seq").save(entity);
        if (__args.get("session_id") != null) __args.get("session_id").save(entity);
        if (__args.get("create_dt") != null) __args.get("create_dt").save(entity);
        if (__args.get("update_dt") != null) __args.get("update_dt").save(entity);
        return entity;
    }

    @Override
    public Class<me.tutttuwi.lifelogger.db.entity.UserSession> getEntityClass() {
        return me.tutttuwi.lifelogger.db.entity.UserSession.class;
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserSession getOriginalStates(me.tutttuwi.lifelogger.db.entity.UserSession __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(me.tutttuwi.lifelogger.db.entity.UserSession __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserSession getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserSession newInstance() {
        return new _UserSession();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<me.tutttuwi.lifelogger.db.entity.UserSession> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
