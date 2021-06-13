/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Config#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getBuildTool <em>Build Tool</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getDtoSuffix <em>Dto Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getEnableHibernateCache <em>Enable Hibernate Cache</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getEntitySuffix <em>Entity Suffix</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getJhiPrefix <em>Jhi Prefix</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getNativeLanguage <em>Native Language</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#isSkipClient <em>Skip Client</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#isSkipServer <em>Skip Server</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#isSkipUserManagement <em>Skip User Management</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getUaaBaseName <em>Uaa Base Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getTestFrameworks <em>Test Frameworks</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getAuthenticationType <em>Authentication Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getCacheProvider <em>Cache Provider</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getApplication <em>Application</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Config#getClientFramework <em>Client Framework</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_BaseName()
	 * @model required="true"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.ApplicationType
	 * @see #setApplicationType(ApplicationType)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_ApplicationType()
	 * @model
	 * @generated
	 */
	ApplicationType getApplicationType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.ApplicationType
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Port</em>' attribute.
	 * @see #setServicePort(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_ServicePort()
	 * @model
	 * @generated
	 */
	String getServicePort();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getServicePort <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Port</em>' attribute.
	 * @see #getServicePort()
	 * @generated
	 */
	void setServicePort(String value);

	/**
	 * Returns the value of the '<em><b>Database Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.DatabaseType
	 * @see #setDatabaseType(DatabaseType)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_DatabaseType()
	 * @model
	 * @generated
	 */
	DatabaseType getDatabaseType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getDatabaseType <em>Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.DatabaseType
	 * @see #getDatabaseType()
	 * @generated
	 */
	void setDatabaseType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Build Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Tool</em>' attribute.
	 * @see #setBuildTool(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_BuildTool()
	 * @model
	 * @generated
	 */
	String getBuildTool();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getBuildTool <em>Build Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Tool</em>' attribute.
	 * @see #getBuildTool()
	 * @generated
	 */
	void setBuildTool(String value);

	/**
	 * Returns the value of the '<em><b>Dto Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto Suffix</em>' attribute.
	 * @see #setDtoSuffix(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_DtoSuffix()
	 * @model
	 * @generated
	 */
	String getDtoSuffix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getDtoSuffix <em>Dto Suffix</em>}' attribute.
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
	 * @see #setEnableHibernateCache(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_EnableHibernateCache()
	 * @model
	 * @generated
	 */
	String getEnableHibernateCache();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getEnableHibernateCache <em>Enable Hibernate Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Hibernate Cache</em>' attribute.
	 * @see #getEnableHibernateCache()
	 * @generated
	 */
	void setEnableHibernateCache(String value);

	/**
	 * Returns the value of the '<em><b>Entity Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Suffix</em>' attribute.
	 * @see #setEntitySuffix(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_EntitySuffix()
	 * @model
	 * @generated
	 */
	String getEntitySuffix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getEntitySuffix <em>Entity Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Suffix</em>' attribute.
	 * @see #getEntitySuffix()
	 * @generated
	 */
	void setEntitySuffix(String value);

	/**
	 * Returns the value of the '<em><b>Jhi Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jhi Prefix</em>' attribute.
	 * @see #setJhiPrefix(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_JhiPrefix()
	 * @model
	 * @generated
	 */
	String getJhiPrefix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getJhiPrefix <em>Jhi Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jhi Prefix</em>' attribute.
	 * @see #getJhiPrefix()
	 * @generated
	 */
	void setJhiPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Native Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native Language</em>' attribute.
	 * @see #setNativeLanguage(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_NativeLanguage()
	 * @model
	 * @generated
	 */
	String getNativeLanguage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getNativeLanguage <em>Native Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Language</em>' attribute.
	 * @see #getNativeLanguage()
	 * @generated
	 */
	void setNativeLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Skip Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Client</em>' attribute.
	 * @see #setSkipClient(boolean)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_SkipClient()
	 * @model
	 * @generated
	 */
	boolean isSkipClient();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#isSkipClient <em>Skip Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Client</em>' attribute.
	 * @see #isSkipClient()
	 * @generated
	 */
	void setSkipClient(boolean value);

	/**
	 * Returns the value of the '<em><b>Skip Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Server</em>' attribute.
	 * @see #setSkipServer(boolean)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_SkipServer()
	 * @model
	 * @generated
	 */
	boolean isSkipServer();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#isSkipServer <em>Skip Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Server</em>' attribute.
	 * @see #isSkipServer()
	 * @generated
	 */
	void setSkipServer(boolean value);

	/**
	 * Returns the value of the '<em><b>Skip User Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip User Management</em>' attribute.
	 * @see #setSkipUserManagement(boolean)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_SkipUserManagement()
	 * @model
	 * @generated
	 */
	boolean isSkipUserManagement();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#isSkipUserManagement <em>Skip User Management</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip User Management</em>' attribute.
	 * @see #isSkipUserManagement()
	 * @generated
	 */
	void setSkipUserManagement(boolean value);

	/**
	 * Returns the value of the '<em><b>Uaa Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uaa Base Name</em>' attribute.
	 * @see #setUaaBaseName(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_UaaBaseName()
	 * @model
	 * @generated
	 */
	String getUaaBaseName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getUaaBaseName <em>Uaa Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uaa Base Name</em>' attribute.
	 * @see #getUaaBaseName()
	 * @generated
	 */
	void setUaaBaseName(String value);

	/**
	 * Returns the value of the '<em><b>Test Frameworks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Frameworks</em>' attribute.
	 * @see #setTestFrameworks(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_TestFrameworks()
	 * @model
	 * @generated
	 */
	String getTestFrameworks();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getTestFrameworks <em>Test Frameworks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Frameworks</em>' attribute.
	 * @see #getTestFrameworks()
	 * @generated
	 */
	void setTestFrameworks(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.AuthenticationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.AuthenticationType
	 * @see #setAuthenticationType(AuthenticationType)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_AuthenticationType()
	 * @model
	 * @generated
	 */
	AuthenticationType getAuthenticationType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getAuthenticationType <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.AuthenticationType
	 * @see #getAuthenticationType()
	 * @generated
	 */
	void setAuthenticationType(AuthenticationType value);

	/**
	 * Returns the value of the '<em><b>Cache Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Provider</em>' attribute.
	 * @see #setCacheProvider(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_CacheProvider()
	 * @model
	 * @generated
	 */
	String getCacheProvider();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getCacheProvider <em>Cache Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Provider</em>' attribute.
	 * @see #getCacheProvider()
	 * @generated
	 */
	void setCacheProvider(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.jdl.Application#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_Application()
	 * @see com.github.icelyframework.jdl.Application#getConfig
	 * @model opposite="config" required="true" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Client Framework</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.ClientFramework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Framework</em>' attribute.
	 * @see com.github.icelyframework.jdl.ClientFramework
	 * @see #setClientFramework(ClientFramework)
	 * @see com.github.icelyframework.jdl.JdlPackage#getConfig_ClientFramework()
	 * @model
	 * @generated
	 */
	ClientFramework getClientFramework();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Config#getClientFramework <em>Client Framework</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Framework</em>' attribute.
	 * @see com.github.icelyframework.jdl.ClientFramework
	 * @see #getClientFramework()
	 * @generated
	 */
	void setClientFramework(ClientFramework value);

} // Config
