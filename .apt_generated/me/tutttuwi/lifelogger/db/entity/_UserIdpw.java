package me.tutttuwi.lifelogger.db.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.2" }, date = "2019-08-21T23:01:00.047+0900")
public final class _UserIdpw extends org.seasar.doma.jdbc.entity.AbstractEntityType<me.tutttuwi.lifelogger.db.entity.UserIdpw> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.2");
    }

    private static final _UserIdpw __singleton = new _UserIdpw();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the seq */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, java.lang.Integer, Object> $seq = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserIdpw.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "seq", "", __namingType, false, __idGenerator);

    /** the id */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, java.lang.String, Object> $id = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserIdpw.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "id", "", __namingType, true, true, false);

    /** the password */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, java.lang.String, Object> $password = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserIdpw.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "password", "", __namingType, true, true, false);

    /** the user_kb */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, java.lang.String, Object> $user_kb = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserIdpw.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "user_kb", "", __namingType, true, true, false);

    /** the create_dt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, java.sql.Timestamp, Object> $create_dt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserIdpw.class, java.sql.Timestamp.class, java.sql.Timestamp.class, () -> new org.seasar.doma.wrapper.TimestampWrapper(), null, null, "create_dt", "", __namingType, true, true, false);

    /** the update_dt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, java.sql.Timestamp, Object> $update_dt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(me.tutttuwi.lifelogger.db.entity.UserIdpw.class, java.sql.Timestamp.class, java.sql.Timestamp.class, () -> new org.seasar.doma.wrapper.TimestampWrapper(), null, null, "update_dt", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<me.tutttuwi.lifelogger.db.entity.UserIdpw>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __entityPropertyTypeMap;

    private _UserIdpw() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "UserIdpw";
        __catalogName = "";
        __schemaName = "";
        __tableName = "user_idpw";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __map = new java.util.HashMap<>(6);
        __idList.add($seq);
        __list.add($seq);
        __map.put("seq", $seq);
        __list.add($id);
        __map.put("id", $id);
        __list.add($password);
        __map.put("password", $password);
        __list.add($user_kb);
        __map.put("user_kb", $user_kb);
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
    public void preInsert(me.tutttuwi.lifelogger.db.entity.UserIdpw entity, org.seasar.doma.jdbc.entity.PreInsertContext<me.tutttuwi.lifelogger.db.entity.UserIdpw> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(me.tutttuwi.lifelogger.db.entity.UserIdpw entity, org.seasar.doma.jdbc.entity.PreUpdateContext<me.tutttuwi.lifelogger.db.entity.UserIdpw> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(me.tutttuwi.lifelogger.db.entity.UserIdpw entity, org.seasar.doma.jdbc.entity.PreDeleteContext<me.tutttuwi.lifelogger.db.entity.UserIdpw> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(me.tutttuwi.lifelogger.db.entity.UserIdpw entity, org.seasar.doma.jdbc.entity.PostInsertContext<me.tutttuwi.lifelogger.db.entity.UserIdpw> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(me.tutttuwi.lifelogger.db.entity.UserIdpw entity, org.seasar.doma.jdbc.entity.PostUpdateContext<me.tutttuwi.lifelogger.db.entity.UserIdpw> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(me.tutttuwi.lifelogger.db.entity.UserIdpw entity, org.seasar.doma.jdbc.entity.PostDeleteContext<me.tutttuwi.lifelogger.db.entity.UserIdpw> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, ?, ?> getGeneratedIdPropertyType() {
        return $seq;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, me.tutttuwi.lifelogger.db.entity.UserIdpw, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserIdpw newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<me.tutttuwi.lifelogger.db.entity.UserIdpw, ?>> __args) {
        me.tutttuwi.lifelogger.db.entity.UserIdpw entity = new me.tutttuwi.lifelogger.db.entity.UserIdpw();
        if (__args.get("seq") != null) __args.get("seq").save(entity);
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("password") != null) __args.get("password").save(entity);
        if (__args.get("user_kb") != null) __args.get("user_kb").save(entity);
        if (__args.get("create_dt") != null) __args.get("create_dt").save(entity);
        if (__args.get("update_dt") != null) __args.get("update_dt").save(entity);
        return entity;
    }

    @Override
    public Class<me.tutttuwi.lifelogger.db.entity.UserIdpw> getEntityClass() {
        return me.tutttuwi.lifelogger.db.entity.UserIdpw.class;
    }

    @Override
    public me.tutttuwi.lifelogger.db.entity.UserIdpw getOriginalStates(me.tutttuwi.lifelogger.db.entity.UserIdpw __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(me.tutttuwi.lifelogger.db.entity.UserIdpw __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserIdpw getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserIdpw newInstance() {
        return new _UserIdpw();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<me.tutttuwi.lifelogger.db.entity.UserIdpw> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
