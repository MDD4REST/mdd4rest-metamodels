/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.configuration.ConfigurationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/icelyframework/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "icely";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = com.github.icelyframework.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.ApplicationConfigImpl <em>Application Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.ApplicationConfigImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getApplicationConfig()
	 * @generated
	 */
	int APPLICATION_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG__BASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG__SERVICE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG__APPLICATION = 2;

	/**
	 * The number of structural features of the '<em>Application Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.ProjectConfigImpl <em>Project Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.ProjectConfigImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getProjectConfig()
	 * @generated
	 */
	int PROJECT_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG__PROJECT = 1;

	/**
	 * The number of structural features of the '<em>Project Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.ApplicationImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASE_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONFIG = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.ProjectImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PATH = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ARCHITECTURE = 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONFIG = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl <em>Sculptor Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.SculptorConfigImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getSculptorConfig()
	 * @generated
	 */
	int SCULPTOR_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__BASE_NAME = APPLICATION_CONFIG__BASE_NAME;

	/**
	 * The feature id for the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__SERVICE_PORT = APPLICATION_CONFIG__SERVICE_PORT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__APPLICATION = APPLICATION_CONFIG__APPLICATION;

	/**
	 * The feature id for the '<em><b>Cartridges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__CARTRIDGES = APPLICATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__PROJECT_NATURE = APPLICATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__ID_TYPE = APPLICATION_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datetime library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__DATETIME_LIBRARY = APPLICATION_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To String Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__TO_STRING_STYLE = APPLICATION_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scaffold operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS = APPLICATION_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Check cyclic Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES = APPLICATION_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Find All paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__FIND_ALL_PAGING = APPLICATION_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Find By Condition paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING = APPLICATION_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__FRAMEWORK = APPLICATION_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__REST = APPLICATION_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__GENERATE = APPLICATION_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__CASCADE = APPLICATION_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__DATABASE = APPLICATION_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Jpa</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__JPA = APPLICATION_CONFIG_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__DEPLOYMENT = APPLICATION_CONFIG_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Hibernatetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__HIBERNATETYPES = APPLICATION_CONFIG_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Javatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__JAVATYPES = APPLICATION_CONFIG_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Packagenames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__PACKAGENAMES = APPLICATION_CONFIG_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Defaultbaseclassnames</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES = APPLICATION_CONFIG_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Cacheoptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG__CACHEOPTIONS = APPLICATION_CONFIG_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Sculptor Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCULPTOR_CONFIG_FEATURE_COUNT = APPLICATION_CONFIG_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl <em>Jhipster Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.JhipsterConfigImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJhipsterConfig()
	 * @generated
	 */
	int JHIPSTER_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__BASE_NAME = APPLICATION_CONFIG__BASE_NAME;

	/**
	 * The feature id for the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__SERVICE_PORT = APPLICATION_CONFIG__SERVICE_PORT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__APPLICATION = APPLICATION_CONFIG__APPLICATION;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__DATABASE_TYPE = APPLICATION_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jhi Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__JHI_PREFIX = APPLICATION_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skip User Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT = APPLICATION_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Native Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__NATIVE_LANGUAGE = APPLICATION_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Test Frameworks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__TEST_FRAMEWORKS = APPLICATION_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cache Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__CACHE_PROVIDER = APPLICATION_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entity Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__ENTITY_SUFFIX = APPLICATION_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skip Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__SKIP_SERVER = APPLICATION_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dto Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__DTO_SUFFIX = APPLICATION_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Enable Hibernate Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE = APPLICATION_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Skip Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__SKIP_CLIENT = APPLICATION_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Build Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__BUILD_TOOL = APPLICATION_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Authentication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__AUTHENTICATION_TYPE = APPLICATION_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG__APPLICATION_TYPE = APPLICATION_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Jhipster Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JHIPSTER_CONFIG_FEATURE_COUNT = APPLICATION_CONFIG_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl <em>REST Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.RESTOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getRESTOptions()
	 * @generated
	 */
	int REST_OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Spring remoting type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPTIONS__SPRING_REMOTING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rest default path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPTIONS__REST_DEFAULT_PATH = 1;

	/**
	 * The feature id for the '<em><b>Rest default http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPTIONS__REST_DEFAULT_HTTP_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Generate resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPTIONS__GENERATE_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Generate rest Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPTIONS__GENERATE_REST_WEB = 4;

	/**
	 * The number of structural features of the '<em>REST Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPTIONS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.CacheOptionsImpl <em>Cache Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.CacheOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getCacheOptions()
	 * @generated
	 */
	int CACHE_OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Cache provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPTIONS__CACHE_PROVIDER = 0;

	/**
	 * The number of structural features of the '<em>Cache Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl <em>Generate Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.GenerateOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getGenerateOptions()
	 * @generated
	 */
	int GENERATE_OPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Generate domain Object conditional Criteria Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Generate repository finders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS = 1;

	/**
	 * The feature id for the '<em><b>Generate model Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_MODEL_DOC = 2;

	/**
	 * The feature id for the '<em><b>Generate umlgraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_UMLGRAPH = 3;

	/**
	 * The feature id for the '<em><b>Generate spring annotation tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX = 4;

	/**
	 * The feature id for the '<em><b>Generate ddl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_DDL = 5;

	/**
	 * The feature id for the '<em><b>Generate ddl drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_DDL_DROP = 6;

	/**
	 * The feature id for the '<em><b>Generate domain Object composite Key Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Generate service Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT = 8;

	/**
	 * The feature id for the '<em><b>Generate Not Found Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION = 9;

	/**
	 * The feature id for the '<em><b>Generate spring annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Generate jpa annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Generate validation annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION = 12;

	/**
	 * The feature id for the '<em><b>Generate jpa annotation on Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Generate jpa annotation column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Generate xstream annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION = 15;

	/**
	 * The feature id for the '<em><b>Generat test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERAT_TEST = 16;

	/**
	 * The feature id for the '<em><b>Generate gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS__GENERATE_GAP_CLASS = 17;

	/**
	 * The number of structural features of the '<em>Generate Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATE_OPTIONS_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.FrameworkOptionsImpl <em>Framework Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.FrameworkOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getFrameworkOptions()
	 * @generated
	 */
	int FRAMEWORK_OPTIONS = 9;

	/**
	 * The feature id for the '<em><b>Framework accessimpl package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Framework accessimpl prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Framework accessapi packag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG = 2;

	/**
	 * The number of structural features of the '<em>Framework Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMEWORK_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl <em>Cascade Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.CascadeOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getCascadeOptions()
	 * @generated
	 */
	int CASCADE_OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Cascade aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS__CASCADE_AGGREGATE = 0;

	/**
	 * The feature id for the '<em><b>Cascade aggregate one To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY = 1;

	/**
	 * The feature id for the '<em><b>Cascade many To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS__CASCADE_MANY_TO_MANY = 2;

	/**
	 * The feature id for the '<em><b>Cascade one To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS__CASCADE_ONE_TO_MANY = 3;

	/**
	 * The feature id for the '<em><b>Cascade to Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS__CASCADE_TO_MANY = 4;

	/**
	 * The feature id for the '<em><b>Cascade to One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS__CASCADE_TO_ONE = 5;

	/**
	 * The number of structural features of the '<em>Cascade Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_OPTIONS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.PackageNameImpl <em>Package Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.PackageNameImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getPackageName()
	 * @generated
	 */
	int PACKAGE_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAME__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Package Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_NAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.JavaTypeImpl <em>Java Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.JavaTypeImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJavaType()
	 * @generated
	 */
	int JAVA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Java Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.HibernateTypeImpl <em>Hibernate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.HibernateTypeImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getHibernateType()
	 * @generated
	 */
	int HIBERNATE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Hibernate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.DefaultBaseClassNameImpl <em>Default Base Class Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.DefaultBaseClassNameImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDefaultBaseClassName()
	 * @generated
	 */
	int DEFAULT_BASE_CLASS_NAME = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BASE_CLASS_NAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BASE_CLASS_NAME__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Default Base Class Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BASE_CLASS_NAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.DatabaseOptionsImpl <em>Database Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.DatabaseOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDatabaseOptions()
	 * @generated
	 */
	int DATABASE_OPTIONS = 15;

	/**
	 * The feature id for the '<em><b>Db use Underscore Naming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING = 0;

	/**
	 * The feature id for the '<em><b>Db use Id Suffix In Foreig Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY = 1;

	/**
	 * The feature id for the '<em><b>Db use Table Prefixed Id Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Db product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPTIONS__DB_PRODUCT = 3;

	/**
	 * The number of structural features of the '<em>Database Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.JPAOptionsImpl <em>JPA Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.JPAOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJPAOptions()
	 * @generated
	 */
	int JPA_OPTIONS = 16;

	/**
	 * The feature id for the '<em><b>Jpa provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_OPTIONS__JPA_PROVIDER = 0;

	/**
	 * The number of structural features of the '<em>JPA Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.impl.DeploymentOptionsImpl <em>Deployment Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.impl.DeploymentOptionsImpl
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDeploymentOptions()
	 * @generated
	 */
	int DEPLOYMENT_OPTIONS = 17;

	/**
	 * The feature id for the '<em><b>Deployment application Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER = 0;

	/**
	 * The number of structural features of the '<em>Deployment Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.ApplicationType <em>Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.ApplicationType
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 18;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.ArchitectureType <em>Architecture Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.ArchitectureType
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getArchitectureType()
	 * @generated
	 */
	int ARCHITECTURE_TYPE = 19;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.DatabaseType
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 20;


	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.AuthenticationType <em>Authentication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.AuthenticationType
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getAuthenticationType()
	 * @generated
	 */
	int AUTHENTICATION_TYPE = 21;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.configuration.JhipsterApplicationType <em>Jhipster Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.configuration.JhipsterApplicationType
	 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJhipsterApplicationType()
	 * @generated
	 */
	int JHIPSTER_APPLICATION_TYPE = 22;


	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.ApplicationConfig <em>Application Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Config</em>'.
	 * @see com.github.icelyframework.configuration.ApplicationConfig
	 * @generated
	 */
	EClass getApplicationConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.ApplicationConfig#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see com.github.icelyframework.configuration.ApplicationConfig#getBaseName()
	 * @see #getApplicationConfig()
	 * @generated
	 */
	EAttribute getApplicationConfig_BaseName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.ApplicationConfig#getServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Port</em>'.
	 * @see com.github.icelyframework.configuration.ApplicationConfig#getServicePort()
	 * @see #getApplicationConfig()
	 * @generated
	 */
	EAttribute getApplicationConfig_ServicePort();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.configuration.ApplicationConfig#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.configuration.ApplicationConfig#getApplication()
	 * @see #getApplicationConfig()
	 * @generated
	 */
	EReference getApplicationConfig_Application();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.ProjectConfig <em>Project Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Config</em>'.
	 * @see com.github.icelyframework.configuration.ProjectConfig
	 * @generated
	 */
	EClass getProjectConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.ProjectConfig#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.github.icelyframework.configuration.ProjectConfig#getVersion()
	 * @see #getProjectConfig()
	 * @generated
	 */
	EAttribute getProjectConfig_Version();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.configuration.ProjectConfig#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.github.icelyframework.configuration.ProjectConfig#getProject()
	 * @see #getProjectConfig()
	 * @generated
	 */
	EReference getProjectConfig_Project();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.github.icelyframework.configuration.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.configuration.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.configuration.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.github.icelyframework.configuration.Application#getProject()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Project();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Application#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.configuration.Application#getBasePackage()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Application#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see com.github.icelyframework.configuration.Application#getApplicationType()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ApplicationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.configuration.Application#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see com.github.icelyframework.configuration.Application#getConfig()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Config();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.github.icelyframework.configuration.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see com.github.icelyframework.configuration.Project#getApplications()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Applications();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.configuration.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Project#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.github.icelyframework.configuration.Project#getBasePath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Project#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.configuration.Project#getBasePackage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.Project#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see com.github.icelyframework.configuration.Project#getArchitecture()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Architecture();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.configuration.Project#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see com.github.icelyframework.configuration.Project#getConfig()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Config();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.SculptorConfig <em>Sculptor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sculptor Config</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig
	 * @generated
	 */
	EClass getSculptorConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getCartridges <em>Cartridges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cartridges</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getCartridges()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_Cartridges();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getProject_nature <em>Project nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project nature</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getProject_nature()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_Project_nature();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getId_type <em>Id type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id type</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getId_type()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_Id_type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getDatetime_library <em>Datetime library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime library</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getDatetime_library()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_Datetime_library();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getToStringStyle <em>To String Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To String Style</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getToStringStyle()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_ToStringStyle();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getScaffold_operations <em>Scaffold operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaffold operations</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getScaffold_operations()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_Scaffold_operations();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#isCheck_cyclicDependencies <em>Check cyclic Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check cyclic Dependencies</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#isCheck_cyclicDependencies()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_Check_cyclicDependencies();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getFindAll_paging <em>Find All paging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Find All paging</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getFindAll_paging()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_FindAll_paging();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.SculptorConfig#getFindByCondition_paging <em>Find By Condition paging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Find By Condition paging</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getFindByCondition_paging()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EAttribute getSculptorConfig_FindByCondition_paging();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.configuration.SculptorConfig#getFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Framework</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getFramework()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Framework();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.configuration.SculptorConfig#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getRest()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Rest();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.configuration.SculptorConfig#getGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generate</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getGenerate()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Generate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cascade</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getCascade()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Cascade();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getDatabase()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Database();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getJpa <em>Jpa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jpa</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getJpa()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Jpa();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getDeployment()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Deployment();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getHibernatetypes <em>Hibernatetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hibernatetypes</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getHibernatetypes()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Hibernatetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getJavatypes <em>Javatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Javatypes</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getJavatypes()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Javatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getPackagenames <em>Packagenames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packagenames</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getPackagenames()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Packagenames();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getDefaultbaseclassnames <em>Defaultbaseclassnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defaultbaseclassnames</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getDefaultbaseclassnames()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Defaultbaseclassnames();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.configuration.SculptorConfig#getCacheoptions <em>Cacheoptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cacheoptions</em>'.
	 * @see com.github.icelyframework.configuration.SculptorConfig#getCacheoptions()
	 * @see #getSculptorConfig()
	 * @generated
	 */
	EReference getSculptorConfig_Cacheoptions();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.JhipsterConfig <em>Jhipster Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jhipster Config</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig
	 * @generated
	 */
	EClass getJhipsterConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getDatabaseType()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_DatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getJhiPrefix <em>Jhi Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jhi Prefix</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getJhiPrefix()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_JhiPrefix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipUserManagement <em>Skip User Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip User Management</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#isSkipUserManagement()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_SkipUserManagement();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getNativeLanguage <em>Native Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Language</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getNativeLanguage()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_NativeLanguage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getTestFrameworks <em>Test Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Frameworks</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getTestFrameworks()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_TestFrameworks();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getCacheProvider <em>Cache Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Provider</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getCacheProvider()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_CacheProvider();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getEntitySuffix <em>Entity Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Suffix</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getEntitySuffix()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_EntitySuffix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipServer <em>Skip Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Server</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#isSkipServer()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_SkipServer();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getDtoSuffix <em>Dto Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dto Suffix</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getDtoSuffix()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_DtoSuffix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#isEnableHibernateCache <em>Enable Hibernate Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Hibernate Cache</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#isEnableHibernateCache()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_EnableHibernateCache();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#isSkipClient <em>Skip Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Client</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#isSkipClient()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_SkipClient();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getBuildTool <em>Build Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Tool</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getBuildTool()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_BuildTool();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getAuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getAuthenticationType()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_AuthenticationType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JhipsterConfig#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterConfig#getApplicationType()
	 * @see #getJhipsterConfig()
	 * @generated
	 */
	EAttribute getJhipsterConfig_ApplicationType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.RESTOptions <em>REST Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Options</em>'.
	 * @see com.github.icelyframework.configuration.RESTOptions
	 * @generated
	 */
	EClass getRESTOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.RESTOptions#getSpring_remoting_type <em>Spring remoting type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spring remoting type</em>'.
	 * @see com.github.icelyframework.configuration.RESTOptions#getSpring_remoting_type()
	 * @see #getRESTOptions()
	 * @generated
	 */
	EAttribute getRESTOptions_Spring_remoting_type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.RESTOptions#getRest_default_path <em>Rest default path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest default path</em>'.
	 * @see com.github.icelyframework.configuration.RESTOptions#getRest_default_path()
	 * @see #getRESTOptions()
	 * @generated
	 */
	EAttribute getRESTOptions_Rest_default_path();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.RESTOptions#getRest_default_httpMethod <em>Rest default http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest default http Method</em>'.
	 * @see com.github.icelyframework.configuration.RESTOptions#getRest_default_httpMethod()
	 * @see #getRESTOptions()
	 * @generated
	 */
	EAttribute getRESTOptions_Rest_default_httpMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.RESTOptions#isGenerate_resource <em>Generate resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate resource</em>'.
	 * @see com.github.icelyframework.configuration.RESTOptions#isGenerate_resource()
	 * @see #getRESTOptions()
	 * @generated
	 */
	EAttribute getRESTOptions_Generate_resource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.RESTOptions#isGenerate_restWeb <em>Generate rest Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate rest Web</em>'.
	 * @see com.github.icelyframework.configuration.RESTOptions#isGenerate_restWeb()
	 * @see #getRESTOptions()
	 * @generated
	 */
	EAttribute getRESTOptions_Generate_restWeb();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.CacheOptions <em>Cache Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Options</em>'.
	 * @see com.github.icelyframework.configuration.CacheOptions
	 * @generated
	 */
	EClass getCacheOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CacheOptions#getCache_provider <em>Cache provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache provider</em>'.
	 * @see com.github.icelyframework.configuration.CacheOptions#getCache_provider()
	 * @see #getCacheOptions()
	 * @generated
	 */
	EAttribute getCacheOptions_Cache_provider();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.GenerateOptions <em>Generate Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generate Options</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions
	 * @generated
	 */
	EClass getGenerateOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_conditionalCriteriaProperties <em>Generate domain Object conditional Criteria Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate domain Object conditional Criteria Properties</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_conditionalCriteriaProperties()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_domainObject_conditionalCriteriaProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_repository_finders <em>Generate repository finders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate repository finders</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_repository_finders()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_repository_finders();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_modelDoc <em>Generate model Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate model Doc</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_modelDoc()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_modelDoc();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_umlgraph <em>Generate umlgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate umlgraph</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_umlgraph()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_umlgraph();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation_tx <em>Generate spring annotation tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate spring annotation tx</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation_tx()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_spring_annotation_tx();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl <em>Generate ddl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate ddl</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_ddl();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl_drop <em>Generate ddl drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate ddl drop</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl_drop()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_ddl_drop();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_compositeKeyClass <em>Generate domain Object composite Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate domain Object composite Key Class</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_compositeKeyClass()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_domainObject_compositeKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_serviceContext <em>Generate service Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate service Context</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_serviceContext()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_serviceContext();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_NotFoundException <em>Generate Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Not Found Exception</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_NotFoundException()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_NotFoundException();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation <em>Generate spring annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate spring annotation</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_spring_annotation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation <em>Generate jpa annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate jpa annotation</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_jpa_annotation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_validation_annotation <em>Generate validation annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate validation annotation</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_validation_annotation()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_validation_annotation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_onField <em>Generate jpa annotation on Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate jpa annotation on Field</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_onField()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_jpa_annotation_onField();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_columnDefinition <em>Generate jpa annotation column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate jpa annotation column Definition</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_columnDefinition()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_jpa_annotation_columnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_xstream_annotation <em>Generate xstream annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate xstream annotation</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_xstream_annotation()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_xstream_annotation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerat_test <em>Generat test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generat test</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerat_test()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generat_test();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_gapClass <em>Generate gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate gap Class</em>'.
	 * @see com.github.icelyframework.configuration.GenerateOptions#isGenerate_gapClass()
	 * @see #getGenerateOptions()
	 * @generated
	 */
	EAttribute getGenerateOptions_Generate_gapClass();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.FrameworkOptions <em>Framework Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Framework Options</em>'.
	 * @see com.github.icelyframework.configuration.FrameworkOptions
	 * @generated
	 */
	EClass getFrameworkOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_package <em>Framework accessimpl package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework accessimpl package</em>'.
	 * @see com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_package()
	 * @see #getFrameworkOptions()
	 * @generated
	 */
	EAttribute getFrameworkOptions_Framework_accessimpl_package();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_prefix <em>Framework accessimpl prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework accessimpl prefix</em>'.
	 * @see com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_prefix()
	 * @see #getFrameworkOptions()
	 * @generated
	 */
	EAttribute getFrameworkOptions_Framework_accessimpl_prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessapi_packag <em>Framework accessapi packag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework accessapi packag</em>'.
	 * @see com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessapi_packag()
	 * @see #getFrameworkOptions()
	 * @generated
	 */
	EAttribute getFrameworkOptions_Framework_accessapi_packag();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.CascadeOptions <em>Cascade Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Options</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions
	 * @generated
	 */
	EClass getCascadeOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate <em>Cascade aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade aggregate</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate()
	 * @see #getCascadeOptions()
	 * @generated
	 */
	EAttribute getCascadeOptions_Cascade_aggregate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate_oneToMany <em>Cascade aggregate one To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade aggregate one To Many</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate_oneToMany()
	 * @see #getCascadeOptions()
	 * @generated
	 */
	EAttribute getCascadeOptions_Cascade_aggregate_oneToMany();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_manyToMany <em>Cascade many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade many To Many</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions#getCascade_manyToMany()
	 * @see #getCascadeOptions()
	 * @generated
	 */
	EAttribute getCascadeOptions_Cascade_manyToMany();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_oneToMany <em>Cascade one To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade one To Many</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions#getCascade_oneToMany()
	 * @see #getCascadeOptions()
	 * @generated
	 */
	EAttribute getCascadeOptions_Cascade_oneToMany();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_toMany <em>Cascade to Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade to Many</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions#getCascade_toMany()
	 * @see #getCascadeOptions()
	 * @generated
	 */
	EAttribute getCascadeOptions_Cascade_toMany();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_toOne <em>Cascade to One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade to One</em>'.
	 * @see com.github.icelyframework.configuration.CascadeOptions#getCascade_toOne()
	 * @see #getCascadeOptions()
	 * @generated
	 */
	EAttribute getCascadeOptions_Cascade_toOne();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.PackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Name</em>'.
	 * @see com.github.icelyframework.configuration.PackageName
	 * @generated
	 */
	EClass getPackageName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.PackageName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.configuration.PackageName#getName()
	 * @see #getPackageName()
	 * @generated
	 */
	EAttribute getPackageName_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.PackageName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.configuration.PackageName#getValue()
	 * @see #getPackageName()
	 * @generated
	 */
	EAttribute getPackageName_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.JavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type</em>'.
	 * @see com.github.icelyframework.configuration.JavaType
	 * @generated
	 */
	EClass getJavaType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JavaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.configuration.JavaType#getName()
	 * @see #getJavaType()
	 * @generated
	 */
	EAttribute getJavaType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JavaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.configuration.JavaType#getValue()
	 * @see #getJavaType()
	 * @generated
	 */
	EAttribute getJavaType_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.HibernateType <em>Hibernate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hibernate Type</em>'.
	 * @see com.github.icelyframework.configuration.HibernateType
	 * @generated
	 */
	EClass getHibernateType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.HibernateType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.configuration.HibernateType#getName()
	 * @see #getHibernateType()
	 * @generated
	 */
	EAttribute getHibernateType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.HibernateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.configuration.HibernateType#getValue()
	 * @see #getHibernateType()
	 * @generated
	 */
	EAttribute getHibernateType_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.DefaultBaseClassName <em>Default Base Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Base Class Name</em>'.
	 * @see com.github.icelyframework.configuration.DefaultBaseClassName
	 * @generated
	 */
	EClass getDefaultBaseClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DefaultBaseClassName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.configuration.DefaultBaseClassName#getName()
	 * @see #getDefaultBaseClassName()
	 * @generated
	 */
	EAttribute getDefaultBaseClassName_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DefaultBaseClassName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.configuration.DefaultBaseClassName#getValue()
	 * @see #getDefaultBaseClassName()
	 * @generated
	 */
	EAttribute getDefaultBaseClassName_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.DatabaseOptions <em>Database Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Options</em>'.
	 * @see com.github.icelyframework.configuration.DatabaseOptions
	 * @generated
	 */
	EClass getDatabaseOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useUnderscoreNaming <em>Db use Underscore Naming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db use Underscore Naming</em>'.
	 * @see com.github.icelyframework.configuration.DatabaseOptions#isDb_useUnderscoreNaming()
	 * @see #getDatabaseOptions()
	 * @generated
	 */
	EAttribute getDatabaseOptions_Db_useUnderscoreNaming();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useIdSuffixInForeigKey <em>Db use Id Suffix In Foreig Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db use Id Suffix In Foreig Key</em>'.
	 * @see com.github.icelyframework.configuration.DatabaseOptions#isDb_useIdSuffixInForeigKey()
	 * @see #getDatabaseOptions()
	 * @generated
	 */
	EAttribute getDatabaseOptions_Db_useIdSuffixInForeigKey();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useTablePrefixedIdColumn <em>Db use Table Prefixed Id Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db use Table Prefixed Id Column</em>'.
	 * @see com.github.icelyframework.configuration.DatabaseOptions#isDb_useTablePrefixedIdColumn()
	 * @see #getDatabaseOptions()
	 * @generated
	 */
	EAttribute getDatabaseOptions_Db_useTablePrefixedIdColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DatabaseOptions#getDb_product <em>Db product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db product</em>'.
	 * @see com.github.icelyframework.configuration.DatabaseOptions#getDb_product()
	 * @see #getDatabaseOptions()
	 * @generated
	 */
	EAttribute getDatabaseOptions_Db_product();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.JPAOptions <em>JPA Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPA Options</em>'.
	 * @see com.github.icelyframework.configuration.JPAOptions
	 * @generated
	 */
	EClass getJPAOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.JPAOptions#getJpa_provider <em>Jpa provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jpa provider</em>'.
	 * @see com.github.icelyframework.configuration.JPAOptions#getJpa_provider()
	 * @see #getJPAOptions()
	 * @generated
	 */
	EAttribute getJPAOptions_Jpa_provider();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.configuration.DeploymentOptions <em>Deployment Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Options</em>'.
	 * @see com.github.icelyframework.configuration.DeploymentOptions
	 * @generated
	 */
	EClass getDeploymentOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.configuration.DeploymentOptions#getDeployment_applicationServer <em>Deployment application Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment application Server</em>'.
	 * @see com.github.icelyframework.configuration.DeploymentOptions#getDeployment_applicationServer()
	 * @see #getDeploymentOptions()
	 * @generated
	 */
	EAttribute getDeploymentOptions_Deployment_applicationServer();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.configuration.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Type</em>'.
	 * @see com.github.icelyframework.configuration.ApplicationType
	 * @generated
	 */
	EEnum getApplicationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.configuration.ArchitectureType <em>Architecture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Architecture Type</em>'.
	 * @see com.github.icelyframework.configuration.ArchitectureType
	 * @generated
	 */
	EEnum getArchitectureType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.configuration.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see com.github.icelyframework.configuration.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.configuration.AuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.configuration.AuthenticationType
	 * @generated
	 */
	EEnum getAuthenticationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.configuration.JhipsterApplicationType <em>Jhipster Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jhipster Application Type</em>'.
	 * @see com.github.icelyframework.configuration.JhipsterApplicationType
	 * @generated
	 */
	EEnum getJhipsterApplicationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.ApplicationConfigImpl <em>Application Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.ApplicationConfigImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getApplicationConfig()
		 * @generated
		 */
		EClass APPLICATION_CONFIG = eINSTANCE.getApplicationConfig();

		/**
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIG__BASE_NAME = eINSTANCE.getApplicationConfig_BaseName();

		/**
		 * The meta object literal for the '<em><b>Service Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_CONFIG__SERVICE_PORT = eINSTANCE.getApplicationConfig_ServicePort();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_CONFIG__APPLICATION = eINSTANCE.getApplicationConfig_Application();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.ProjectConfigImpl <em>Project Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.ProjectConfigImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getProjectConfig()
		 * @generated
		 */
		EClass PROJECT_CONFIG = eINSTANCE.getProjectConfig();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_CONFIG__VERSION = eINSTANCE.getProjectConfig_Version();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_CONFIG__PROJECT = eINSTANCE.getProjectConfig_Project();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.ApplicationImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PROJECT = eINSTANCE.getApplication_Project();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__BASE_PACKAGE = eINSTANCE.getApplication_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__APPLICATION_TYPE = eINSTANCE.getApplication_ApplicationType();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONFIG = eINSTANCE.getApplication_Config();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.ProjectImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__APPLICATIONS = eINSTANCE.getProject_Applications();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BASE_PATH = eINSTANCE.getProject_BasePath();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BASE_PACKAGE = eINSTANCE.getProject_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ARCHITECTURE = eINSTANCE.getProject_Architecture();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CONFIG = eINSTANCE.getProject_Config();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl <em>Sculptor Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.SculptorConfigImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getSculptorConfig()
		 * @generated
		 */
		EClass SCULPTOR_CONFIG = eINSTANCE.getSculptorConfig();

		/**
		 * The meta object literal for the '<em><b>Cartridges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__CARTRIDGES = eINSTANCE.getSculptorConfig_Cartridges();

		/**
		 * The meta object literal for the '<em><b>Project nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__PROJECT_NATURE = eINSTANCE.getSculptorConfig_Project_nature();

		/**
		 * The meta object literal for the '<em><b>Id type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__ID_TYPE = eINSTANCE.getSculptorConfig_Id_type();

		/**
		 * The meta object literal for the '<em><b>Datetime library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__DATETIME_LIBRARY = eINSTANCE.getSculptorConfig_Datetime_library();

		/**
		 * The meta object literal for the '<em><b>To String Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__TO_STRING_STYLE = eINSTANCE.getSculptorConfig_ToStringStyle();

		/**
		 * The meta object literal for the '<em><b>Scaffold operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS = eINSTANCE.getSculptorConfig_Scaffold_operations();

		/**
		 * The meta object literal for the '<em><b>Check cyclic Dependencies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES = eINSTANCE.getSculptorConfig_Check_cyclicDependencies();

		/**
		 * The meta object literal for the '<em><b>Find All paging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__FIND_ALL_PAGING = eINSTANCE.getSculptorConfig_FindAll_paging();

		/**
		 * The meta object literal for the '<em><b>Find By Condition paging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING = eINSTANCE.getSculptorConfig_FindByCondition_paging();

		/**
		 * The meta object literal for the '<em><b>Framework</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__FRAMEWORK = eINSTANCE.getSculptorConfig_Framework();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__REST = eINSTANCE.getSculptorConfig_Rest();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__GENERATE = eINSTANCE.getSculptorConfig_Generate();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__CASCADE = eINSTANCE.getSculptorConfig_Cascade();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__DATABASE = eINSTANCE.getSculptorConfig_Database();

		/**
		 * The meta object literal for the '<em><b>Jpa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__JPA = eINSTANCE.getSculptorConfig_Jpa();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__DEPLOYMENT = eINSTANCE.getSculptorConfig_Deployment();

		/**
		 * The meta object literal for the '<em><b>Hibernatetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__HIBERNATETYPES = eINSTANCE.getSculptorConfig_Hibernatetypes();

		/**
		 * The meta object literal for the '<em><b>Javatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__JAVATYPES = eINSTANCE.getSculptorConfig_Javatypes();

		/**
		 * The meta object literal for the '<em><b>Packagenames</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__PACKAGENAMES = eINSTANCE.getSculptorConfig_Packagenames();

		/**
		 * The meta object literal for the '<em><b>Defaultbaseclassnames</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES = eINSTANCE.getSculptorConfig_Defaultbaseclassnames();

		/**
		 * The meta object literal for the '<em><b>Cacheoptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCULPTOR_CONFIG__CACHEOPTIONS = eINSTANCE.getSculptorConfig_Cacheoptions();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.JhipsterConfigImpl <em>Jhipster Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.JhipsterConfigImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJhipsterConfig()
		 * @generated
		 */
		EClass JHIPSTER_CONFIG = eINSTANCE.getJhipsterConfig();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__DATABASE_TYPE = eINSTANCE.getJhipsterConfig_DatabaseType();

		/**
		 * The meta object literal for the '<em><b>Jhi Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__JHI_PREFIX = eINSTANCE.getJhipsterConfig_JhiPrefix();

		/**
		 * The meta object literal for the '<em><b>Skip User Management</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT = eINSTANCE.getJhipsterConfig_SkipUserManagement();

		/**
		 * The meta object literal for the '<em><b>Native Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__NATIVE_LANGUAGE = eINSTANCE.getJhipsterConfig_NativeLanguage();

		/**
		 * The meta object literal for the '<em><b>Test Frameworks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__TEST_FRAMEWORKS = eINSTANCE.getJhipsterConfig_TestFrameworks();

		/**
		 * The meta object literal for the '<em><b>Cache Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__CACHE_PROVIDER = eINSTANCE.getJhipsterConfig_CacheProvider();

		/**
		 * The meta object literal for the '<em><b>Entity Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__ENTITY_SUFFIX = eINSTANCE.getJhipsterConfig_EntitySuffix();

		/**
		 * The meta object literal for the '<em><b>Skip Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__SKIP_SERVER = eINSTANCE.getJhipsterConfig_SkipServer();

		/**
		 * The meta object literal for the '<em><b>Dto Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__DTO_SUFFIX = eINSTANCE.getJhipsterConfig_DtoSuffix();

		/**
		 * The meta object literal for the '<em><b>Enable Hibernate Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE = eINSTANCE.getJhipsterConfig_EnableHibernateCache();

		/**
		 * The meta object literal for the '<em><b>Skip Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__SKIP_CLIENT = eINSTANCE.getJhipsterConfig_SkipClient();

		/**
		 * The meta object literal for the '<em><b>Build Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__BUILD_TOOL = eINSTANCE.getJhipsterConfig_BuildTool();

		/**
		 * The meta object literal for the '<em><b>Authentication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__AUTHENTICATION_TYPE = eINSTANCE.getJhipsterConfig_AuthenticationType();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JHIPSTER_CONFIG__APPLICATION_TYPE = eINSTANCE.getJhipsterConfig_ApplicationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl <em>REST Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.RESTOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getRESTOptions()
		 * @generated
		 */
		EClass REST_OPTIONS = eINSTANCE.getRESTOptions();

		/**
		 * The meta object literal for the '<em><b>Spring remoting type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPTIONS__SPRING_REMOTING_TYPE = eINSTANCE.getRESTOptions_Spring_remoting_type();

		/**
		 * The meta object literal for the '<em><b>Rest default path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPTIONS__REST_DEFAULT_PATH = eINSTANCE.getRESTOptions_Rest_default_path();

		/**
		 * The meta object literal for the '<em><b>Rest default http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPTIONS__REST_DEFAULT_HTTP_METHOD = eINSTANCE.getRESTOptions_Rest_default_httpMethod();

		/**
		 * The meta object literal for the '<em><b>Generate resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPTIONS__GENERATE_RESOURCE = eINSTANCE.getRESTOptions_Generate_resource();

		/**
		 * The meta object literal for the '<em><b>Generate rest Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_OPTIONS__GENERATE_REST_WEB = eINSTANCE.getRESTOptions_Generate_restWeb();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.CacheOptionsImpl <em>Cache Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.CacheOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getCacheOptions()
		 * @generated
		 */
		EClass CACHE_OPTIONS = eINSTANCE.getCacheOptions();

		/**
		 * The meta object literal for the '<em><b>Cache provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_OPTIONS__CACHE_PROVIDER = eINSTANCE.getCacheOptions_Cache_provider();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl <em>Generate Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.GenerateOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getGenerateOptions()
		 * @generated
		 */
		EClass GENERATE_OPTIONS = eINSTANCE.getGenerateOptions();

		/**
		 * The meta object literal for the '<em><b>Generate domain Object conditional Criteria Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES = eINSTANCE.getGenerateOptions_Generate_domainObject_conditionalCriteriaProperties();

		/**
		 * The meta object literal for the '<em><b>Generate repository finders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS = eINSTANCE.getGenerateOptions_Generate_repository_finders();

		/**
		 * The meta object literal for the '<em><b>Generate model Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_MODEL_DOC = eINSTANCE.getGenerateOptions_Generate_modelDoc();

		/**
		 * The meta object literal for the '<em><b>Generate umlgraph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_UMLGRAPH = eINSTANCE.getGenerateOptions_Generate_umlgraph();

		/**
		 * The meta object literal for the '<em><b>Generate spring annotation tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX = eINSTANCE.getGenerateOptions_Generate_spring_annotation_tx();

		/**
		 * The meta object literal for the '<em><b>Generate ddl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_DDL = eINSTANCE.getGenerateOptions_Generate_ddl();

		/**
		 * The meta object literal for the '<em><b>Generate ddl drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_DDL_DROP = eINSTANCE.getGenerateOptions_Generate_ddl_drop();

		/**
		 * The meta object literal for the '<em><b>Generate domain Object composite Key Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS = eINSTANCE.getGenerateOptions_Generate_domainObject_compositeKeyClass();

		/**
		 * The meta object literal for the '<em><b>Generate service Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT = eINSTANCE.getGenerateOptions_Generate_serviceContext();

		/**
		 * The meta object literal for the '<em><b>Generate Not Found Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION = eINSTANCE.getGenerateOptions_Generate_NotFoundException();

		/**
		 * The meta object literal for the '<em><b>Generate spring annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION = eINSTANCE.getGenerateOptions_Generate_spring_annotation();

		/**
		 * The meta object literal for the '<em><b>Generate jpa annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION = eINSTANCE.getGenerateOptions_Generate_jpa_annotation();

		/**
		 * The meta object literal for the '<em><b>Generate validation annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION = eINSTANCE.getGenerateOptions_Generate_validation_annotation();

		/**
		 * The meta object literal for the '<em><b>Generate jpa annotation on Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD = eINSTANCE.getGenerateOptions_Generate_jpa_annotation_onField();

		/**
		 * The meta object literal for the '<em><b>Generate jpa annotation column Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION = eINSTANCE.getGenerateOptions_Generate_jpa_annotation_columnDefinition();

		/**
		 * The meta object literal for the '<em><b>Generate xstream annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION = eINSTANCE.getGenerateOptions_Generate_xstream_annotation();

		/**
		 * The meta object literal for the '<em><b>Generat test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERAT_TEST = eINSTANCE.getGenerateOptions_Generat_test();

		/**
		 * The meta object literal for the '<em><b>Generate gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATE_OPTIONS__GENERATE_GAP_CLASS = eINSTANCE.getGenerateOptions_Generate_gapClass();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.FrameworkOptionsImpl <em>Framework Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.FrameworkOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getFrameworkOptions()
		 * @generated
		 */
		EClass FRAMEWORK_OPTIONS = eINSTANCE.getFrameworkOptions();

		/**
		 * The meta object literal for the '<em><b>Framework accessimpl package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE = eINSTANCE.getFrameworkOptions_Framework_accessimpl_package();

		/**
		 * The meta object literal for the '<em><b>Framework accessimpl prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX = eINSTANCE.getFrameworkOptions_Framework_accessimpl_prefix();

		/**
		 * The meta object literal for the '<em><b>Framework accessapi packag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG = eINSTANCE.getFrameworkOptions_Framework_accessapi_packag();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl <em>Cascade Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.CascadeOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getCascadeOptions()
		 * @generated
		 */
		EClass CASCADE_OPTIONS = eINSTANCE.getCascadeOptions();

		/**
		 * The meta object literal for the '<em><b>Cascade aggregate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_OPTIONS__CASCADE_AGGREGATE = eINSTANCE.getCascadeOptions_Cascade_aggregate();

		/**
		 * The meta object literal for the '<em><b>Cascade aggregate one To Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY = eINSTANCE.getCascadeOptions_Cascade_aggregate_oneToMany();

		/**
		 * The meta object literal for the '<em><b>Cascade many To Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_OPTIONS__CASCADE_MANY_TO_MANY = eINSTANCE.getCascadeOptions_Cascade_manyToMany();

		/**
		 * The meta object literal for the '<em><b>Cascade one To Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_OPTIONS__CASCADE_ONE_TO_MANY = eINSTANCE.getCascadeOptions_Cascade_oneToMany();

		/**
		 * The meta object literal for the '<em><b>Cascade to Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_OPTIONS__CASCADE_TO_MANY = eINSTANCE.getCascadeOptions_Cascade_toMany();

		/**
		 * The meta object literal for the '<em><b>Cascade to One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASCADE_OPTIONS__CASCADE_TO_ONE = eINSTANCE.getCascadeOptions_Cascade_toOne();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.PackageNameImpl <em>Package Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.PackageNameImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getPackageName()
		 * @generated
		 */
		EClass PACKAGE_NAME = eINSTANCE.getPackageName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_NAME__NAME = eINSTANCE.getPackageName_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_NAME__VALUE = eINSTANCE.getPackageName_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.JavaTypeImpl <em>Java Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.JavaTypeImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJavaType()
		 * @generated
		 */
		EClass JAVA_TYPE = eINSTANCE.getJavaType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TYPE__NAME = eINSTANCE.getJavaType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TYPE__VALUE = eINSTANCE.getJavaType_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.HibernateTypeImpl <em>Hibernate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.HibernateTypeImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getHibernateType()
		 * @generated
		 */
		EClass HIBERNATE_TYPE = eINSTANCE.getHibernateType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIBERNATE_TYPE__NAME = eINSTANCE.getHibernateType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIBERNATE_TYPE__VALUE = eINSTANCE.getHibernateType_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.DefaultBaseClassNameImpl <em>Default Base Class Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.DefaultBaseClassNameImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDefaultBaseClassName()
		 * @generated
		 */
		EClass DEFAULT_BASE_CLASS_NAME = eINSTANCE.getDefaultBaseClassName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_BASE_CLASS_NAME__NAME = eINSTANCE.getDefaultBaseClassName_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_BASE_CLASS_NAME__VALUE = eINSTANCE.getDefaultBaseClassName_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.DatabaseOptionsImpl <em>Database Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.DatabaseOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDatabaseOptions()
		 * @generated
		 */
		EClass DATABASE_OPTIONS = eINSTANCE.getDatabaseOptions();

		/**
		 * The meta object literal for the '<em><b>Db use Underscore Naming</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING = eINSTANCE.getDatabaseOptions_Db_useUnderscoreNaming();

		/**
		 * The meta object literal for the '<em><b>Db use Id Suffix In Foreig Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY = eINSTANCE.getDatabaseOptions_Db_useIdSuffixInForeigKey();

		/**
		 * The meta object literal for the '<em><b>Db use Table Prefixed Id Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN = eINSTANCE.getDatabaseOptions_Db_useTablePrefixedIdColumn();

		/**
		 * The meta object literal for the '<em><b>Db product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_OPTIONS__DB_PRODUCT = eINSTANCE.getDatabaseOptions_Db_product();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.JPAOptionsImpl <em>JPA Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.JPAOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJPAOptions()
		 * @generated
		 */
		EClass JPA_OPTIONS = eINSTANCE.getJPAOptions();

		/**
		 * The meta object literal for the '<em><b>Jpa provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPA_OPTIONS__JPA_PROVIDER = eINSTANCE.getJPAOptions_Jpa_provider();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.impl.DeploymentOptionsImpl <em>Deployment Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.impl.DeploymentOptionsImpl
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDeploymentOptions()
		 * @generated
		 */
		EClass DEPLOYMENT_OPTIONS = eINSTANCE.getDeploymentOptions();

		/**
		 * The meta object literal for the '<em><b>Deployment application Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER = eINSTANCE.getDeploymentOptions_Deployment_applicationServer();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.ApplicationType <em>Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.ApplicationType
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getApplicationType()
		 * @generated
		 */
		EEnum APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.ArchitectureType <em>Architecture Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.ArchitectureType
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getArchitectureType()
		 * @generated
		 */
		EEnum ARCHITECTURE_TYPE = eINSTANCE.getArchitectureType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.DatabaseType
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.AuthenticationType <em>Authentication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.AuthenticationType
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getAuthenticationType()
		 * @generated
		 */
		EEnum AUTHENTICATION_TYPE = eINSTANCE.getAuthenticationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.configuration.JhipsterApplicationType <em>Jhipster Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.configuration.JhipsterApplicationType
		 * @see com.github.icelyframework.configuration.impl.ConfigurationPackageImpl#getJhipsterApplicationType()
		 * @generated
		 */
		EEnum JHIPSTER_APPLICATION_TYPE = eINSTANCE.getJhipsterApplicationType();

	}

} //ConfigurationPackage
