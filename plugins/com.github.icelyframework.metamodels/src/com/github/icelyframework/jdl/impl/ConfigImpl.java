/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.Application;
import com.github.icelyframework.jdl.ApplicationType;
import com.github.icelyframework.jdl.AuthenticationType;
import com.github.icelyframework.jdl.ClientFramework;
import com.github.icelyframework.jdl.Config;
import com.github.icelyframework.jdl.DatabaseType;
import com.github.icelyframework.jdl.JdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getBuildTool <em>Build Tool</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getDtoSuffix <em>Dto Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getEnableHibernateCache <em>Enable Hibernate Cache</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getEntitySuffix <em>Entity Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getJhiPrefix <em>Jhi Prefix</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getNativeLanguage <em>Native Language</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#isSkipClient <em>Skip Client</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#isSkipServer <em>Skip Server</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#isSkipUserManagement <em>Skip User Management</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getUaaBaseName <em>Uaa Base Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getTestFrameworks <em>Test Frameworks</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getAuthenticationType <em>Authentication Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getCacheProvider <em>Cache Provider</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ConfigImpl#getClientFramework <em>Client Framework</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config {
	/**
	 * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected String baseName = BASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationType APPLICATION_TYPE_EDEFAULT = ApplicationType.MICROSERVICE;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationType applicationType = APPLICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected String servicePort = SERVICE_PORT_EDEFAULT;

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
	 * The default value of the '{@link #getEnableHibernateCache() <em>Enable Hibernate Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableHibernateCache()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_HIBERNATE_CACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnableHibernateCache() <em>Enable Hibernate Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableHibernateCache()
	 * @generated
	 * @ordered
	 */
	protected String enableHibernateCache = ENABLE_HIBERNATE_CACHE_EDEFAULT;

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
	 * The default value of the '{@link #getUaaBaseName() <em>Uaa Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaaBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String UAA_BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUaaBaseName() <em>Uaa Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaaBaseName()
	 * @generated
	 * @ordered
	 */
	protected String uaaBaseName = UAA_BASE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getClientFramework() <em>Client Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientFramework()
	 * @generated
	 * @ordered
	 */
	protected static final ClientFramework CLIENT_FRAMEWORK_EDEFAULT = ClientFramework.ANGULARX;

	/**
	 * The cached value of the '{@link #getClientFramework() <em>Client Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientFramework()
	 * @generated
	 * @ordered
	 */
	protected ClientFramework clientFramework = CLIENT_FRAMEWORK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseName() {
		return baseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseName(String newBaseName) {
		String oldBaseName = baseName;
		baseName = newBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__BASE_NAME, oldBaseName, baseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationType(ApplicationType newApplicationType) {
		ApplicationType oldApplicationType = applicationType;
		applicationType = newApplicationType == null ? APPLICATION_TYPE_EDEFAULT : newApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__APPLICATION_TYPE, oldApplicationType, applicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServicePort() {
		return servicePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServicePort(String newServicePort) {
		String oldServicePort = servicePort;
		servicePort = newServicePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__SERVICE_PORT, oldServicePort, servicePort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__DATABASE_TYPE, oldDatabaseType, databaseType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__BUILD_TOOL, oldBuildTool, buildTool));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__DTO_SUFFIX, oldDtoSuffix, dtoSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableHibernateCache() {
		return enableHibernateCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableHibernateCache(String newEnableHibernateCache) {
		String oldEnableHibernateCache = enableHibernateCache;
		enableHibernateCache = newEnableHibernateCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__ENABLE_HIBERNATE_CACHE, oldEnableHibernateCache, enableHibernateCache));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__ENTITY_SUFFIX, oldEntitySuffix, entitySuffix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__JHI_PREFIX, oldJhiPrefix, jhiPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__NATIVE_LANGUAGE, oldNativeLanguage, nativeLanguage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__SKIP_CLIENT, oldSkipClient, skipClient));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__SKIP_SERVER, oldSkipServer, skipServer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__SKIP_USER_MANAGEMENT, oldSkipUserManagement, skipUserManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUaaBaseName() {
		return uaaBaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUaaBaseName(String newUaaBaseName) {
		String oldUaaBaseName = uaaBaseName;
		uaaBaseName = newUaaBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__UAA_BASE_NAME, oldUaaBaseName, uaaBaseName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__TEST_FRAMEWORKS, oldTestFrameworks, testFrameworks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__AUTHENTICATION_TYPE, oldAuthenticationType, authenticationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__CACHE_PROVIDER, oldCacheProvider, cacheProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication() {
		if (eContainerFeatureID() != JdlPackage.CONFIG__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, JdlPackage.CONFIG__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != JdlPackage.CONFIG__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, JdlPackage.APPLICATION__CONFIG, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClientFramework getClientFramework() {
		return clientFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientFramework(ClientFramework newClientFramework) {
		ClientFramework oldClientFramework = clientFramework;
		clientFramework = newClientFramework == null ? CLIENT_FRAMEWORK_EDEFAULT : newClientFramework;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.CONFIG__CLIENT_FRAMEWORK, oldClientFramework, clientFramework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.CONFIG__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.CONFIG__APPLICATION:
				return basicSetApplication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JdlPackage.CONFIG__APPLICATION:
				return eInternalContainer().eInverseRemove(this, JdlPackage.APPLICATION__CONFIG, Application.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdlPackage.CONFIG__BASE_NAME:
				return getBaseName();
			case JdlPackage.CONFIG__APPLICATION_TYPE:
				return getApplicationType();
			case JdlPackage.CONFIG__SERVICE_PORT:
				return getServicePort();
			case JdlPackage.CONFIG__DATABASE_TYPE:
				return getDatabaseType();
			case JdlPackage.CONFIG__BUILD_TOOL:
				return getBuildTool();
			case JdlPackage.CONFIG__DTO_SUFFIX:
				return getDtoSuffix();
			case JdlPackage.CONFIG__ENABLE_HIBERNATE_CACHE:
				return getEnableHibernateCache();
			case JdlPackage.CONFIG__ENTITY_SUFFIX:
				return getEntitySuffix();
			case JdlPackage.CONFIG__JHI_PREFIX:
				return getJhiPrefix();
			case JdlPackage.CONFIG__NATIVE_LANGUAGE:
				return getNativeLanguage();
			case JdlPackage.CONFIG__SKIP_CLIENT:
				return isSkipClient();
			case JdlPackage.CONFIG__SKIP_SERVER:
				return isSkipServer();
			case JdlPackage.CONFIG__SKIP_USER_MANAGEMENT:
				return isSkipUserManagement();
			case JdlPackage.CONFIG__UAA_BASE_NAME:
				return getUaaBaseName();
			case JdlPackage.CONFIG__TEST_FRAMEWORKS:
				return getTestFrameworks();
			case JdlPackage.CONFIG__AUTHENTICATION_TYPE:
				return getAuthenticationType();
			case JdlPackage.CONFIG__CACHE_PROVIDER:
				return getCacheProvider();
			case JdlPackage.CONFIG__APPLICATION:
				return getApplication();
			case JdlPackage.CONFIG__CLIENT_FRAMEWORK:
				return getClientFramework();
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
			case JdlPackage.CONFIG__BASE_NAME:
				setBaseName((String)newValue);
				return;
			case JdlPackage.CONFIG__APPLICATION_TYPE:
				setApplicationType((ApplicationType)newValue);
				return;
			case JdlPackage.CONFIG__SERVICE_PORT:
				setServicePort((String)newValue);
				return;
			case JdlPackage.CONFIG__DATABASE_TYPE:
				setDatabaseType((DatabaseType)newValue);
				return;
			case JdlPackage.CONFIG__BUILD_TOOL:
				setBuildTool((String)newValue);
				return;
			case JdlPackage.CONFIG__DTO_SUFFIX:
				setDtoSuffix((String)newValue);
				return;
			case JdlPackage.CONFIG__ENABLE_HIBERNATE_CACHE:
				setEnableHibernateCache((String)newValue);
				return;
			case JdlPackage.CONFIG__ENTITY_SUFFIX:
				setEntitySuffix((String)newValue);
				return;
			case JdlPackage.CONFIG__JHI_PREFIX:
				setJhiPrefix((String)newValue);
				return;
			case JdlPackage.CONFIG__NATIVE_LANGUAGE:
				setNativeLanguage((String)newValue);
				return;
			case JdlPackage.CONFIG__SKIP_CLIENT:
				setSkipClient((Boolean)newValue);
				return;
			case JdlPackage.CONFIG__SKIP_SERVER:
				setSkipServer((Boolean)newValue);
				return;
			case JdlPackage.CONFIG__SKIP_USER_MANAGEMENT:
				setSkipUserManagement((Boolean)newValue);
				return;
			case JdlPackage.CONFIG__UAA_BASE_NAME:
				setUaaBaseName((String)newValue);
				return;
			case JdlPackage.CONFIG__TEST_FRAMEWORKS:
				setTestFrameworks((String)newValue);
				return;
			case JdlPackage.CONFIG__AUTHENTICATION_TYPE:
				setAuthenticationType((AuthenticationType)newValue);
				return;
			case JdlPackage.CONFIG__CACHE_PROVIDER:
				setCacheProvider((String)newValue);
				return;
			case JdlPackage.CONFIG__APPLICATION:
				setApplication((Application)newValue);
				return;
			case JdlPackage.CONFIG__CLIENT_FRAMEWORK:
				setClientFramework((ClientFramework)newValue);
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
			case JdlPackage.CONFIG__BASE_NAME:
				setBaseName(BASE_NAME_EDEFAULT);
				return;
			case JdlPackage.CONFIG__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
				return;
			case JdlPackage.CONFIG__SERVICE_PORT:
				setServicePort(SERVICE_PORT_EDEFAULT);
				return;
			case JdlPackage.CONFIG__DATABASE_TYPE:
				setDatabaseType(DATABASE_TYPE_EDEFAULT);
				return;
			case JdlPackage.CONFIG__BUILD_TOOL:
				setBuildTool(BUILD_TOOL_EDEFAULT);
				return;
			case JdlPackage.CONFIG__DTO_SUFFIX:
				setDtoSuffix(DTO_SUFFIX_EDEFAULT);
				return;
			case JdlPackage.CONFIG__ENABLE_HIBERNATE_CACHE:
				setEnableHibernateCache(ENABLE_HIBERNATE_CACHE_EDEFAULT);
				return;
			case JdlPackage.CONFIG__ENTITY_SUFFIX:
				setEntitySuffix(ENTITY_SUFFIX_EDEFAULT);
				return;
			case JdlPackage.CONFIG__JHI_PREFIX:
				setJhiPrefix(JHI_PREFIX_EDEFAULT);
				return;
			case JdlPackage.CONFIG__NATIVE_LANGUAGE:
				setNativeLanguage(NATIVE_LANGUAGE_EDEFAULT);
				return;
			case JdlPackage.CONFIG__SKIP_CLIENT:
				setSkipClient(SKIP_CLIENT_EDEFAULT);
				return;
			case JdlPackage.CONFIG__SKIP_SERVER:
				setSkipServer(SKIP_SERVER_EDEFAULT);
				return;
			case JdlPackage.CONFIG__SKIP_USER_MANAGEMENT:
				setSkipUserManagement(SKIP_USER_MANAGEMENT_EDEFAULT);
				return;
			case JdlPackage.CONFIG__UAA_BASE_NAME:
				setUaaBaseName(UAA_BASE_NAME_EDEFAULT);
				return;
			case JdlPackage.CONFIG__TEST_FRAMEWORKS:
				setTestFrameworks(TEST_FRAMEWORKS_EDEFAULT);
				return;
			case JdlPackage.CONFIG__AUTHENTICATION_TYPE:
				setAuthenticationType(AUTHENTICATION_TYPE_EDEFAULT);
				return;
			case JdlPackage.CONFIG__CACHE_PROVIDER:
				setCacheProvider(CACHE_PROVIDER_EDEFAULT);
				return;
			case JdlPackage.CONFIG__APPLICATION:
				setApplication((Application)null);
				return;
			case JdlPackage.CONFIG__CLIENT_FRAMEWORK:
				setClientFramework(CLIENT_FRAMEWORK_EDEFAULT);
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
			case JdlPackage.CONFIG__BASE_NAME:
				return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
			case JdlPackage.CONFIG__APPLICATION_TYPE:
				return applicationType != APPLICATION_TYPE_EDEFAULT;
			case JdlPackage.CONFIG__SERVICE_PORT:
				return SERVICE_PORT_EDEFAULT == null ? servicePort != null : !SERVICE_PORT_EDEFAULT.equals(servicePort);
			case JdlPackage.CONFIG__DATABASE_TYPE:
				return databaseType != DATABASE_TYPE_EDEFAULT;
			case JdlPackage.CONFIG__BUILD_TOOL:
				return BUILD_TOOL_EDEFAULT == null ? buildTool != null : !BUILD_TOOL_EDEFAULT.equals(buildTool);
			case JdlPackage.CONFIG__DTO_SUFFIX:
				return DTO_SUFFIX_EDEFAULT == null ? dtoSuffix != null : !DTO_SUFFIX_EDEFAULT.equals(dtoSuffix);
			case JdlPackage.CONFIG__ENABLE_HIBERNATE_CACHE:
				return ENABLE_HIBERNATE_CACHE_EDEFAULT == null ? enableHibernateCache != null : !ENABLE_HIBERNATE_CACHE_EDEFAULT.equals(enableHibernateCache);
			case JdlPackage.CONFIG__ENTITY_SUFFIX:
				return ENTITY_SUFFIX_EDEFAULT == null ? entitySuffix != null : !ENTITY_SUFFIX_EDEFAULT.equals(entitySuffix);
			case JdlPackage.CONFIG__JHI_PREFIX:
				return JHI_PREFIX_EDEFAULT == null ? jhiPrefix != null : !JHI_PREFIX_EDEFAULT.equals(jhiPrefix);
			case JdlPackage.CONFIG__NATIVE_LANGUAGE:
				return NATIVE_LANGUAGE_EDEFAULT == null ? nativeLanguage != null : !NATIVE_LANGUAGE_EDEFAULT.equals(nativeLanguage);
			case JdlPackage.CONFIG__SKIP_CLIENT:
				return skipClient != SKIP_CLIENT_EDEFAULT;
			case JdlPackage.CONFIG__SKIP_SERVER:
				return skipServer != SKIP_SERVER_EDEFAULT;
			case JdlPackage.CONFIG__SKIP_USER_MANAGEMENT:
				return skipUserManagement != SKIP_USER_MANAGEMENT_EDEFAULT;
			case JdlPackage.CONFIG__UAA_BASE_NAME:
				return UAA_BASE_NAME_EDEFAULT == null ? uaaBaseName != null : !UAA_BASE_NAME_EDEFAULT.equals(uaaBaseName);
			case JdlPackage.CONFIG__TEST_FRAMEWORKS:
				return TEST_FRAMEWORKS_EDEFAULT == null ? testFrameworks != null : !TEST_FRAMEWORKS_EDEFAULT.equals(testFrameworks);
			case JdlPackage.CONFIG__AUTHENTICATION_TYPE:
				return authenticationType != AUTHENTICATION_TYPE_EDEFAULT;
			case JdlPackage.CONFIG__CACHE_PROVIDER:
				return CACHE_PROVIDER_EDEFAULT == null ? cacheProvider != null : !CACHE_PROVIDER_EDEFAULT.equals(cacheProvider);
			case JdlPackage.CONFIG__APPLICATION:
				return getApplication() != null;
			case JdlPackage.CONFIG__CLIENT_FRAMEWORK:
				return clientFramework != CLIENT_FRAMEWORK_EDEFAULT;
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
		result.append(" (baseName: ");
		result.append(baseName);
		result.append(", applicationType: ");
		result.append(applicationType);
		result.append(", servicePort: ");
		result.append(servicePort);
		result.append(", databaseType: ");
		result.append(databaseType);
		result.append(", buildTool: ");
		result.append(buildTool);
		result.append(", dtoSuffix: ");
		result.append(dtoSuffix);
		result.append(", enableHibernateCache: ");
		result.append(enableHibernateCache);
		result.append(", entitySuffix: ");
		result.append(entitySuffix);
		result.append(", jhiPrefix: ");
		result.append(jhiPrefix);
		result.append(", nativeLanguage: ");
		result.append(nativeLanguage);
		result.append(", skipClient: ");
		result.append(skipClient);
		result.append(", skipServer: ");
		result.append(skipServer);
		result.append(", skipUserManagement: ");
		result.append(skipUserManagement);
		result.append(", uaaBaseName: ");
		result.append(uaaBaseName);
		result.append(", testFrameworks: ");
		result.append(testFrameworks);
		result.append(", authenticationType: ");
		result.append(authenticationType);
		result.append(", cacheProvider: ");
		result.append(cacheProvider);
		result.append(", clientFramework: ");
		result.append(clientFramework);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
