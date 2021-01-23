/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.AuthenticationType;
import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.DatabaseType;
import com.github.icelyframework.configuration.JhipsterApplicationType;
import com.github.icelyframework.configuration.JhipsterConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jhipster Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getJhiPrefix <em>Jhi Prefix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#isSkipUserManagement <em>Skip User Management</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getNativeLanguage <em>Native Language</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getTestFrameworks <em>Test Frameworks</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getCacheProvider <em>Cache Provider</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getEntitySuffix <em>Entity Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#isSkipServer <em>Skip Server</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getDtoSuffix <em>Dto Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#isEnableHibernateCache <em>Enable Hibernate Cache</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#isSkipClient <em>Skip Client</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getBuildTool <em>Build Tool</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getAuthenticationType <em>Authentication Type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl#getApplicationType <em>Application Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JhipsterConfigImpl extends ApplicationConfigImpl implements JhipsterConfig {
	/**
	 * The default value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseType DATABASE_TYPE_EDEFAULT = DatabaseType.SQL;

	/**
	 * The cached value of the '{@link #getDatabaseType() <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType databaseType = DATABASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJhiPrefix() <em>Jhi Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJhiPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String JHI_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJhiPrefix() <em>Jhi Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJhiPrefix()
	 * @generated
	 * @ordered
	 */
	protected String jhiPrefix = JHI_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkipUserManagement() <em>Skip User Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipUserManagement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_USER_MANAGEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipUserManagement() <em>Skip User Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipUserManagement()
	 * @generated
	 * @ordered
	 */
	protected boolean skipUserManagement = SKIP_USER_MANAGEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNativeLanguage() <em>Native Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNativeLanguage() <em>Native Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeLanguage()
	 * @generated
	 * @ordered
	 */
	protected String nativeLanguage = NATIVE_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestFrameworks() <em>Test Frameworks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestFrameworks()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_FRAMEWORKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestFrameworks() <em>Test Frameworks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestFrameworks()
	 * @generated
	 * @ordered
	 */
	protected String testFrameworks = TEST_FRAMEWORKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheProvider() <em>Cache Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheProvider() <em>Cache Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheProvider()
	 * @generated
	 * @ordered
	 */
	protected String cacheProvider = CACHE_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntitySuffix() <em>Entity Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitySuffix() <em>Entity Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySuffix()
	 * @generated
	 * @ordered
	 */
	protected String entitySuffix = ENTITY_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkipServer() <em>Skip Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipServer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_SERVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipServer() <em>Skip Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipServer()
	 * @generated
	 * @ordered
	 */
	protected boolean skipServer = SKIP_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDtoSuffix() <em>Dto Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String DTO_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtoSuffix() <em>Dto Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoSuffix()
	 * @generated
	 * @ordered
	 */
	protected String dtoSuffix = DTO_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableHibernateCache() <em>Enable Hibernate Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableHibernateCache()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_HIBERNATE_CACHE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableHibernateCache() <em>Enable Hibernate Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableHibernateCache()
	 * @generated
	 * @ordered
	 */
	protected boolean enableHibernateCache = ENABLE_HIBERNATE_CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSkipClient() <em>Skip Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipClient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_CLIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipClient() <em>Skip Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipClient()
	 * @generated
	 * @ordered
	 */
	protected boolean skipClient = SKIP_CLIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildTool() <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTool()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildTool() <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildTool()
	 * @generated
	 * @ordered
	 */
	protected String buildTool = BUILD_TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationType() <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationType()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationType AUTHENTICATION_TYPE_EDEFAULT = AuthenticationType.JWT;

	/**
	 * The cached value of the '{@link #getAuthenticationType() <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationType()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationType authenticationType = AUTHENTICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final JhipsterApplicationType APPLICATION_TYPE_EDEFAULT = JhipsterApplicationType.MICROSERVICE;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected JhipsterApplicationType applicationType = APPLICATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JhipsterConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.JHIPSTER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDatabaseType() {
		return databaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseType(DatabaseType newDatabaseType) {
		DatabaseType oldDatabaseType = databaseType;
		databaseType = newDatabaseType == null ? DATABASE_TYPE_EDEFAULT : newDatabaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__DATABASE_TYPE, oldDatabaseType, databaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJhiPrefix() {
		return jhiPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJhiPrefix(String newJhiPrefix) {
		String oldJhiPrefix = jhiPrefix;
		jhiPrefix = newJhiPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__JHI_PREFIX, oldJhiPrefix, jhiPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSkipUserManagement() {
		return skipUserManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipUserManagement(boolean newSkipUserManagement) {
		boolean oldSkipUserManagement = skipUserManagement;
		skipUserManagement = newSkipUserManagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT, oldSkipUserManagement, skipUserManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNativeLanguage() {
		return nativeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNativeLanguage(String newNativeLanguage) {
		String oldNativeLanguage = nativeLanguage;
		nativeLanguage = newNativeLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__NATIVE_LANGUAGE, oldNativeLanguage, nativeLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestFrameworks() {
		return testFrameworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestFrameworks(String newTestFrameworks) {
		String oldTestFrameworks = testFrameworks;
		testFrameworks = newTestFrameworks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__TEST_FRAMEWORKS, oldTestFrameworks, testFrameworks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCacheProvider() {
		return cacheProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheProvider(String newCacheProvider) {
		String oldCacheProvider = cacheProvider;
		cacheProvider = newCacheProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__CACHE_PROVIDER, oldCacheProvider, cacheProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySuffix() {
		return entitySuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySuffix(String newEntitySuffix) {
		String oldEntitySuffix = entitySuffix;
		entitySuffix = newEntitySuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__ENTITY_SUFFIX, oldEntitySuffix, entitySuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSkipServer() {
		return skipServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipServer(boolean newSkipServer) {
		boolean oldSkipServer = skipServer;
		skipServer = newSkipServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__SKIP_SERVER, oldSkipServer, skipServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDtoSuffix() {
		return dtoSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDtoSuffix(String newDtoSuffix) {
		String oldDtoSuffix = dtoSuffix;
		dtoSuffix = newDtoSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__DTO_SUFFIX, oldDtoSuffix, dtoSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableHibernateCache() {
		return enableHibernateCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableHibernateCache(boolean newEnableHibernateCache) {
		boolean oldEnableHibernateCache = enableHibernateCache;
		enableHibernateCache = newEnableHibernateCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE, oldEnableHibernateCache, enableHibernateCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSkipClient() {
		return skipClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkipClient(boolean newSkipClient) {
		boolean oldSkipClient = skipClient;
		skipClient = newSkipClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__SKIP_CLIENT, oldSkipClient, skipClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildTool() {
		return buildTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildTool(String newBuildTool) {
		String oldBuildTool = buildTool;
		buildTool = newBuildTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__BUILD_TOOL, oldBuildTool, buildTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationType getAuthenticationType() {
		return authenticationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationType(AuthenticationType newAuthenticationType) {
		AuthenticationType oldAuthenticationType = authenticationType;
		authenticationType = newAuthenticationType == null ? AUTHENTICATION_TYPE_EDEFAULT : newAuthenticationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__AUTHENTICATION_TYPE, oldAuthenticationType, authenticationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JhipsterApplicationType getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationType(JhipsterApplicationType newApplicationType) {
		JhipsterApplicationType oldApplicationType = applicationType;
		applicationType = newApplicationType == null ? APPLICATION_TYPE_EDEFAULT : newApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JHIPSTER_CONFIG__APPLICATION_TYPE, oldApplicationType, applicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.JHIPSTER_CONFIG__DATABASE_TYPE:
				return getDatabaseType();
			case ConfigurationPackage.JHIPSTER_CONFIG__JHI_PREFIX:
				return getJhiPrefix();
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT:
				return isSkipUserManagement();
			case ConfigurationPackage.JHIPSTER_CONFIG__NATIVE_LANGUAGE:
				return getNativeLanguage();
			case ConfigurationPackage.JHIPSTER_CONFIG__TEST_FRAMEWORKS:
				return getTestFrameworks();
			case ConfigurationPackage.JHIPSTER_CONFIG__CACHE_PROVIDER:
				return getCacheProvider();
			case ConfigurationPackage.JHIPSTER_CONFIG__ENTITY_SUFFIX:
				return getEntitySuffix();
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_SERVER:
				return isSkipServer();
			case ConfigurationPackage.JHIPSTER_CONFIG__DTO_SUFFIX:
				return getDtoSuffix();
			case ConfigurationPackage.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE:
				return isEnableHibernateCache();
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_CLIENT:
				return isSkipClient();
			case ConfigurationPackage.JHIPSTER_CONFIG__BUILD_TOOL:
				return getBuildTool();
			case ConfigurationPackage.JHIPSTER_CONFIG__AUTHENTICATION_TYPE:
				return getAuthenticationType();
			case ConfigurationPackage.JHIPSTER_CONFIG__APPLICATION_TYPE:
				return getApplicationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.JHIPSTER_CONFIG__DATABASE_TYPE:
				setDatabaseType((DatabaseType)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__JHI_PREFIX:
				setJhiPrefix((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT:
				setSkipUserManagement((Boolean)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__NATIVE_LANGUAGE:
				setNativeLanguage((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__TEST_FRAMEWORKS:
				setTestFrameworks((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__CACHE_PROVIDER:
				setCacheProvider((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__ENTITY_SUFFIX:
				setEntitySuffix((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_SERVER:
				setSkipServer((Boolean)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__DTO_SUFFIX:
				setDtoSuffix((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE:
				setEnableHibernateCache((Boolean)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_CLIENT:
				setSkipClient((Boolean)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__BUILD_TOOL:
				setBuildTool((String)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__AUTHENTICATION_TYPE:
				setAuthenticationType((AuthenticationType)newValue);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__APPLICATION_TYPE:
				setApplicationType((JhipsterApplicationType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.JHIPSTER_CONFIG__DATABASE_TYPE:
				setDatabaseType(DATABASE_TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__JHI_PREFIX:
				setJhiPrefix(JHI_PREFIX_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT:
				setSkipUserManagement(SKIP_USER_MANAGEMENT_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__NATIVE_LANGUAGE:
				setNativeLanguage(NATIVE_LANGUAGE_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__TEST_FRAMEWORKS:
				setTestFrameworks(TEST_FRAMEWORKS_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__CACHE_PROVIDER:
				setCacheProvider(CACHE_PROVIDER_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__ENTITY_SUFFIX:
				setEntitySuffix(ENTITY_SUFFIX_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_SERVER:
				setSkipServer(SKIP_SERVER_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__DTO_SUFFIX:
				setDtoSuffix(DTO_SUFFIX_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE:
				setEnableHibernateCache(ENABLE_HIBERNATE_CACHE_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_CLIENT:
				setSkipClient(SKIP_CLIENT_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__BUILD_TOOL:
				setBuildTool(BUILD_TOOL_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__AUTHENTICATION_TYPE:
				setAuthenticationType(AUTHENTICATION_TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.JHIPSTER_CONFIG__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.JHIPSTER_CONFIG__DATABASE_TYPE:
				return databaseType != DATABASE_TYPE_EDEFAULT;
			case ConfigurationPackage.JHIPSTER_CONFIG__JHI_PREFIX:
				return JHI_PREFIX_EDEFAULT == null ? jhiPrefix != null : !JHI_PREFIX_EDEFAULT.equals(jhiPrefix);
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT:
				return skipUserManagement != SKIP_USER_MANAGEMENT_EDEFAULT;
			case ConfigurationPackage.JHIPSTER_CONFIG__NATIVE_LANGUAGE:
				return NATIVE_LANGUAGE_EDEFAULT == null ? nativeLanguage != null : !NATIVE_LANGUAGE_EDEFAULT.equals(nativeLanguage);
			case ConfigurationPackage.JHIPSTER_CONFIG__TEST_FRAMEWORKS:
				return TEST_FRAMEWORKS_EDEFAULT == null ? testFrameworks != null : !TEST_FRAMEWORKS_EDEFAULT.equals(testFrameworks);
			case ConfigurationPackage.JHIPSTER_CONFIG__CACHE_PROVIDER:
				return CACHE_PROVIDER_EDEFAULT == null ? cacheProvider != null : !CACHE_PROVIDER_EDEFAULT.equals(cacheProvider);
			case ConfigurationPackage.JHIPSTER_CONFIG__ENTITY_SUFFIX:
				return ENTITY_SUFFIX_EDEFAULT == null ? entitySuffix != null : !ENTITY_SUFFIX_EDEFAULT.equals(entitySuffix);
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_SERVER:
				return skipServer != SKIP_SERVER_EDEFAULT;
			case ConfigurationPackage.JHIPSTER_CONFIG__DTO_SUFFIX:
				return DTO_SUFFIX_EDEFAULT == null ? dtoSuffix != null : !DTO_SUFFIX_EDEFAULT.equals(dtoSuffix);
			case ConfigurationPackage.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE:
				return enableHibernateCache != ENABLE_HIBERNATE_CACHE_EDEFAULT;
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_CLIENT:
				return skipClient != SKIP_CLIENT_EDEFAULT;
			case ConfigurationPackage.JHIPSTER_CONFIG__BUILD_TOOL:
				return BUILD_TOOL_EDEFAULT == null ? buildTool != null : !BUILD_TOOL_EDEFAULT.equals(buildTool);
			case ConfigurationPackage.JHIPSTER_CONFIG__AUTHENTICATION_TYPE:
				return authenticationType != AUTHENTICATION_TYPE_EDEFAULT;
			case ConfigurationPackage.JHIPSTER_CONFIG__APPLICATION_TYPE:
				return applicationType != APPLICATION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (databaseType: ");
		result.append(databaseType);
		result.append(", jhiPrefix: ");
		result.append(jhiPrefix);
		result.append(", skipUserManagement: ");
		result.append(skipUserManagement);
		result.append(", nativeLanguage: ");
		result.append(nativeLanguage);
		result.append(", testFrameworks: ");
		result.append(testFrameworks);
		result.append(", cacheProvider: ");
		result.append(cacheProvider);
		result.append(", entitySuffix: ");
		result.append(entitySuffix);
		result.append(", skipServer: ");
		result.append(skipServer);
		result.append(", dtoSuffix: ");
		result.append(dtoSuffix);
		result.append(", enableHibernateCache: ");
		result.append(enableHibernateCache);
		result.append(", skipClient: ");
		result.append(skipClient);
		result.append(", buildTool: ");
		result.append(buildTool);
		result.append(", authenticationType: ");
		result.append(authenticationType);
		result.append(", applicationType: ");
		result.append(applicationType);
		result.append(')');
		return result.toString();
	}

} //JhipsterConfigImpl
