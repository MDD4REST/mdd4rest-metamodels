/**
 */
package com.github.icelyframework.configuration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jhipster Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getJhiPrefix <em>Jhi Prefix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipUserManagement <em>Skip User Management</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getNativeLanguage <em>Native Language</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getTestFrameworks <em>Test Frameworks</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getCacheProvider <em>Cache Provider</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getEntitySuffix <em>Entity Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipServer <em>Skip Server</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getDtoSuffix <em>Dto Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#isEnableHibernateCache <em>Enable Hibernate Cache</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipClient <em>Skip Client</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.JhipsterConfig#getBuildTool <em>Build Tool</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig()
 * @model
 * @generated
 */
public interface JhipsterConfig extends ApplicationConfig {
	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.configuration.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see com.github.icelyframework.configuration.DatabaseType
	 * @see #setDatabaseType(DatabaseType)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_DatabaseType()
	 * @model
	 * @generated
	 */
	DatabaseType getDatabaseType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see com.github.icelyframework.configuration.DatabaseType
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Jhi Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jhi Prefix</em>' attribute.
	 * @see #setJhiPrefix(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_JhiPrefix()
	 * @model
	 * @generated
	 */
	String getJhiPrefix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getJhiPrefix <em>Jhi Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jhi Prefix</em>' attribute.
	 * @see #getJhiPrefix()
	 * @generated
	 */
	void setJhiPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Skip User Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip User Management</em>' attribute.
	 * @see #setSkipUserManagement(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_SkipUserManagement()
	 * @model
	 * @generated
	 */
	boolean isSkipUserManagement();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipUserManagement <em>Skip User Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip User Management</em>' attribute.
	 * @see #isSkipUserManagement()
	 * @generated
	 */
	void setSkipUserManagement(boolean value);

	/**
	 * Returns the value of the '<em><b>Native Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Language</em>' attribute.
	 * @see #setNativeLanguage(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_NativeLanguage()
	 * @model
	 * @generated
	 */
	String getNativeLanguage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getNativeLanguage <em>Native Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Language</em>' attribute.
	 * @see #getNativeLanguage()
	 * @generated
	 */
	void setNativeLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Test Frameworks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Frameworks</em>' attribute.
	 * @see #setTestFrameworks(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_TestFrameworks()
	 * @model
	 * @generated
	 */
	String getTestFrameworks();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getTestFrameworks <em>Test Frameworks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Frameworks</em>' attribute.
	 * @see #getTestFrameworks()
	 * @generated
	 */
	void setTestFrameworks(String value);

	/**
	 * Returns the value of the '<em><b>Cache Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Provider</em>' attribute.
	 * @see #setCacheProvider(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_CacheProvider()
	 * @model
	 * @generated
	 */
	String getCacheProvider();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getCacheProvider <em>Cache Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Provider</em>' attribute.
	 * @see #getCacheProvider()
	 * @generated
	 */
	void setCacheProvider(String value);

	/**
	 * Returns the value of the '<em><b>Entity Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Suffix</em>' attribute.
	 * @see #setEntitySuffix(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_EntitySuffix()
	 * @model
	 * @generated
	 */
	String getEntitySuffix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getEntitySuffix <em>Entity Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Suffix</em>' attribute.
	 * @see #getEntitySuffix()
	 * @generated
	 */
	void setEntitySuffix(String value);

	/**
	 * Returns the value of the '<em><b>Skip Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Server</em>' attribute.
	 * @see #setSkipServer(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_SkipServer()
	 * @model
	 * @generated
	 */
	boolean isSkipServer();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipServer <em>Skip Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Server</em>' attribute.
	 * @see #isSkipServer()
	 * @generated
	 */
	void setSkipServer(boolean value);

	/**
	 * Returns the value of the '<em><b>Dto Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto Suffix</em>' attribute.
	 * @see #setDtoSuffix(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_DtoSuffix()
	 * @model
	 * @generated
	 */
	String getDtoSuffix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getDtoSuffix <em>Dto Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto Suffix</em>' attribute.
	 * @see #getDtoSuffix()
	 * @generated
	 */
	void setDtoSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Enable Hibernate Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Hibernate Cache</em>' attribute.
	 * @see #setEnableHibernateCache(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_EnableHibernateCache()
	 * @model
	 * @generated
	 */
	boolean isEnableHibernateCache();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#isEnableHibernateCache <em>Enable Hibernate Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Hibernate Cache</em>' attribute.
	 * @see #isEnableHibernateCache()
	 * @generated
	 */
	void setEnableHibernateCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Skip Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Client</em>' attribute.
	 * @see #setSkipClient(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_SkipClient()
	 * @model
	 * @generated
	 */
	boolean isSkipClient();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipClient <em>Skip Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Client</em>' attribute.
	 * @see #isSkipClient()
	 * @generated
	 */
	void setSkipClient(boolean value);

	/**
	 * Returns the value of the '<em><b>Build Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Tool</em>' attribute.
	 * @see #setBuildTool(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJhipsterConfig_BuildTool()
	 * @model
	 * @generated
	 */
	String getBuildTool();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JhipsterConfig#getBuildTool <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Tool</em>' attribute.
	 * @see #getBuildTool()
	 * @generated
	 */
	void setBuildTool(String value);

} // JhipsterConfig
