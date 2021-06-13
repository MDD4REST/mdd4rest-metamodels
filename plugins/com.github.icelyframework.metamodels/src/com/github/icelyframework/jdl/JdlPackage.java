/**
 */
package com.github.icelyframework.jdl;

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
 * @see com.github.icelyframework.jdl.JdlFactory
 * @model kind="package"
 * @generated
 */
public interface JdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/icelyframework/jdl";

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
	JdlPackage eINSTANCE = com.github.icelyframework.jdl.impl.JdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.ApplicationImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.ConfigImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__BASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__APPLICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SERVICE_PORT = 2;

	/**
	 * The feature id for the '<em><b>Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DATABASE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Build Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__BUILD_TOOL = 4;

	/**
	 * The feature id for the '<em><b>Dto Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DTO_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Enable Hibernate Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ENABLE_HIBERNATE_CACHE = 6;

	/**
	 * The feature id for the '<em><b>Entity Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ENTITY_SUFFIX = 7;

	/**
	 * The feature id for the '<em><b>Jhi Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__JHI_PREFIX = 8;

	/**
	 * The feature id for the '<em><b>Native Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NATIVE_LANGUAGE = 9;

	/**
	 * The feature id for the '<em><b>Skip Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SKIP_CLIENT = 10;

	/**
	 * The feature id for the '<em><b>Skip Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SKIP_SERVER = 11;

	/**
	 * The feature id for the '<em><b>Skip User Management</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SKIP_USER_MANAGEMENT = 12;

	/**
	 * The feature id for the '<em><b>Uaa Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__UAA_BASE_NAME = 13;

	/**
	 * The feature id for the '<em><b>Test Frameworks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__TEST_FRAMEWORKS = 14;

	/**
	 * The feature id for the '<em><b>Authentication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__AUTHENTICATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Cache Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CACHE_PROVIDER = 16;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__APPLICATION = 17;

	/**
	 * The feature id for the '<em><b>Client Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CLIENT_FRAMEWORK = 18;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.EntityImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPS = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.FieldImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__UNIQUE = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MIN = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MAX = 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.RelationshipImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TO_NAME = 1;

	/**
	 * The feature id for the '<em><b>From Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FROM_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>From Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FROM_NAME = 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.RelationshipColumnImpl <em>Relationship Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.RelationshipColumnImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getRelationshipColumn()
	 * @generated
	 */
	int RELATIONSHIP_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_COLUMN__IS_REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_COLUMN__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Relationship Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.JDLImpl <em>JDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.JDLImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getJDL()
	 * @generated
	 */
	int JDL = 6;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__ENUMS = 2;

	/**
	 * The feature id for the '<em><b>Paginate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__PAGINATE = 3;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__DTO = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__SEARCH = 6;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL__DEPLOYMENTS = 7;

	/**
	 * The number of structural features of the '<em>JDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.DeploymentImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 7;

	/**
	 * The feature id for the '<em><b>Deployment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DEPLOYMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DIRECTORY_PATH = 1;

	/**
	 * The feature id for the '<em><b>Docker Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DOCKER_REPOSITORY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Apps Folders</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__APPS_FOLDERS = 3;

	/**
	 * The feature id for the '<em><b>Service Discovery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SERVICE_DISCOVERY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__MONITORING = 5;

	/**
	 * The feature id for the '<em><b>Gateway Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__GATEWAY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Kubernetes Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__KUBERNETES_SERVICE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Jdl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__JDL = 8;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.UnidirectionalRelationshipImpl <em>Unidirectional Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.UnidirectionalRelationshipImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getUnidirectionalRelationship()
	 * @generated
	 */
	int UNIDIRECTIONAL_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDIRECTIONAL_RELATIONSHIP__MULTIPLICITY = RELATIONSHIP__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDIRECTIONAL_RELATIONSHIP__TO_NAME = RELATIONSHIP__TO_NAME;

	/**
	 * The feature id for the '<em><b>From Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDIRECTIONAL_RELATIONSHIP__FROM_COLUMN = RELATIONSHIP__FROM_COLUMN;

	/**
	 * The feature id for the '<em><b>From Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDIRECTIONAL_RELATIONSHIP__FROM_NAME = RELATIONSHIP__FROM_NAME;

	/**
	 * The feature id for the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unidirectional Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIDIRECTIONAL_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.BidirectionalRelationshipImpl <em>Bidirectional Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.BidirectionalRelationshipImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getBidirectionalRelationship()
	 * @generated
	 */
	int BIDIRECTIONAL_RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_RELATIONSHIP__MULTIPLICITY = RELATIONSHIP__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_RELATIONSHIP__TO_NAME = RELATIONSHIP__TO_NAME;

	/**
	 * The feature id for the '<em><b>From Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_RELATIONSHIP__FROM_COLUMN = RELATIONSHIP__FROM_COLUMN;

	/**
	 * The feature id for the '<em><b>From Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_RELATIONSHIP__FROM_NAME = RELATIONSHIP__FROM_NAME;

	/**
	 * The feature id for the '<em><b>To Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bidirectional Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.EnumImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 10;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__LITERALS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.LiteralImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.PaginateImpl <em>Paginate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.PaginateImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getPaginate()
	 * @generated
	 */
	int PAGINATE = 12;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATE__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Paginate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.DTOImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 13;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__VALUE = 1;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.ServiceImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.impl.SearchImpl
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 15;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.ApplicationType <em>Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.ApplicationType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 16;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.DatabaseType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 17;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.Multiplicity
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 18;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.RelationshipType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 19;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.DeploymentType <em>Deployment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.DeploymentType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDeploymentType()
	 * @generated
	 */
	int DEPLOYMENT_TYPE = 20;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.BuildToolType <em>Build Tool Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.BuildToolType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getBuildToolType()
	 * @generated
	 */
	int BUILD_TOOL_TYPE = 21;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.CacheProviderType <em>Cache Provider Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.CacheProviderType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getCacheProviderType()
	 * @generated
	 */
	int CACHE_PROVIDER_TYPE = 22;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.ClientFramework <em>Client Framework</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.ClientFramework
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getClientFramework()
	 * @generated
	 */
	int CLIENT_FRAMEWORK = 23;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.SearchEngine <em>Search Engine</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.SearchEngine
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getSearchEngine()
	 * @generated
	 */
	int SEARCH_ENGINE = 24;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.MessageBroker <em>Message Broker</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.MessageBroker
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getMessageBroker()
	 * @generated
	 */
	int MESSAGE_BROKER = 25;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.AuthenticationType <em>Authentication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.AuthenticationType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getAuthenticationType()
	 * @generated
	 */
	int AUTHENTICATION_TYPE = 26;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.ServiceDiscoveryType <em>Service Discovery Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.ServiceDiscoveryType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getServiceDiscoveryType()
	 * @generated
	 */
	int SERVICE_DISCOVERY_TYPE = 27;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.GatewayType <em>Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.GatewayType
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getGatewayType()
	 * @generated
	 */
	int GATEWAY_TYPE = 28;


	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.ServiceValue <em>Service Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.ServiceValue
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getServiceValue()
	 * @generated
	 */
	int SERVICE_VALUE = 29;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.DTOValue <em>DTO Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.DTOValue
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDTOValue()
	 * @generated
	 */
	int DTO_VALUE = 30;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.jdl.PaginationValue <em>Pagination Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.jdl.PaginationValue
	 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getPaginationValue()
	 * @generated
	 */
	int PAGINATION_VALUE = 31;


	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.github.icelyframework.jdl.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.jdl.Application#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see com.github.icelyframework.jdl.Application#getConfig()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Config();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.jdl.Application#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see com.github.icelyframework.jdl.Application#getEntities()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Entities();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.jdl.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see com.github.icelyframework.jdl.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see com.github.icelyframework.jdl.Config#getBaseName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_BaseName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see com.github.icelyframework.jdl.Config#getApplicationType()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ApplicationType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Port</em>'.
	 * @see com.github.icelyframework.jdl.Config#getServicePort()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ServicePort();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getDatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Type</em>'.
	 * @see com.github.icelyframework.jdl.Config#getDatabaseType()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_DatabaseType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getBuildTool <em>Build Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Tool</em>'.
	 * @see com.github.icelyframework.jdl.Config#getBuildTool()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_BuildTool();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getDtoSuffix <em>Dto Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dto Suffix</em>'.
	 * @see com.github.icelyframework.jdl.Config#getDtoSuffix()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_DtoSuffix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getEnableHibernateCache <em>Enable Hibernate Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Hibernate Cache</em>'.
	 * @see com.github.icelyframework.jdl.Config#getEnableHibernateCache()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_EnableHibernateCache();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getEntitySuffix <em>Entity Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Suffix</em>'.
	 * @see com.github.icelyframework.jdl.Config#getEntitySuffix()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_EntitySuffix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getJhiPrefix <em>Jhi Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jhi Prefix</em>'.
	 * @see com.github.icelyframework.jdl.Config#getJhiPrefix()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_JhiPrefix();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getNativeLanguage <em>Native Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Language</em>'.
	 * @see com.github.icelyframework.jdl.Config#getNativeLanguage()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_NativeLanguage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#isSkipClient <em>Skip Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Client</em>'.
	 * @see com.github.icelyframework.jdl.Config#isSkipClient()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_SkipClient();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#isSkipServer <em>Skip Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Server</em>'.
	 * @see com.github.icelyframework.jdl.Config#isSkipServer()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_SkipServer();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#isSkipUserManagement <em>Skip User Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip User Management</em>'.
	 * @see com.github.icelyframework.jdl.Config#isSkipUserManagement()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_SkipUserManagement();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getUaaBaseName <em>Uaa Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uaa Base Name</em>'.
	 * @see com.github.icelyframework.jdl.Config#getUaaBaseName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_UaaBaseName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getTestFrameworks <em>Test Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Frameworks</em>'.
	 * @see com.github.icelyframework.jdl.Config#getTestFrameworks()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_TestFrameworks();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getAuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.jdl.Config#getAuthenticationType()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_AuthenticationType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getCacheProvider <em>Cache Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Provider</em>'.
	 * @see com.github.icelyframework.jdl.Config#getCacheProvider()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_CacheProvider();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.jdl.Config#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.jdl.Config#getApplication()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Application();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Config#getClientFramework <em>Client Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Framework</em>'.
	 * @see com.github.icelyframework.jdl.Config#getClientFramework()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ClientFramework();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.github.icelyframework.jdl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.jdl.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see com.github.icelyframework.jdl.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see com.github.icelyframework.jdl.Entity#getRelationships()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationships();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.github.icelyframework.jdl.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.jdl.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.icelyframework.jdl.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Field#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.github.icelyframework.jdl.Field#isRequired()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Field#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see com.github.icelyframework.jdl.Field#isUnique()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Unique();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Field#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.github.icelyframework.jdl.Field#getMin()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Field#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.github.icelyframework.jdl.Field#getMax()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Max();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see com.github.icelyframework.jdl.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Relationship#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see com.github.icelyframework.jdl.Relationship#getMultiplicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Relationship#getToName <em>To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Name</em>'.
	 * @see com.github.icelyframework.jdl.Relationship#getToName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_ToName();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.jdl.Relationship#getFromColumn <em>From Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Column</em>'.
	 * @see com.github.icelyframework.jdl.Relationship#getFromColumn()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_FromColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Relationship#getFromName <em>From Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Name</em>'.
	 * @see com.github.icelyframework.jdl.Relationship#getFromName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_FromName();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.RelationshipColumn <em>Relationship Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Column</em>'.
	 * @see com.github.icelyframework.jdl.RelationshipColumn
	 * @generated
	 */
	EClass getRelationshipColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.RelationshipColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.jdl.RelationshipColumn#getName()
	 * @see #getRelationshipColumn()
	 * @generated
	 */
	EAttribute getRelationshipColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.RelationshipColumn#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see com.github.icelyframework.jdl.RelationshipColumn#isIsRequired()
	 * @see #getRelationshipColumn()
	 * @generated
	 */
	EAttribute getRelationshipColumn_IsRequired();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.jdl.RelationshipColumn#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see com.github.icelyframework.jdl.RelationshipColumn#getEntity()
	 * @see #getRelationshipColumn()
	 * @generated
	 */
	EReference getRelationshipColumn_Entity();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.JDL <em>JDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDL</em>'.
	 * @see com.github.icelyframework.jdl.JDL
	 * @generated
	 */
	EClass getJDL();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getApplications()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getEntities()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getEnums()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Enums();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getPaginate <em>Paginate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginate</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getPaginate()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Paginate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dto</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getDto()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Dto();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getService()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.JDL#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Search</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getSearch()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Search();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.jdl.JDL#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployments</em>'.
	 * @see com.github.icelyframework.jdl.JDL#getDeployments()
	 * @see #getJDL()
	 * @generated
	 */
	EReference getJDL_Deployments();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see com.github.icelyframework.jdl.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#getDeploymentType <em>Deployment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Type</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getDeploymentType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DeploymentType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#getDirectoryPath <em>Directory Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Path</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getDirectoryPath()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DirectoryPath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#getDockerRepositoryName <em>Docker Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Repository Name</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getDockerRepositoryName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DockerRepositoryName();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.icelyframework.jdl.Deployment#getAppsFolders <em>Apps Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Apps Folders</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getAppsFolders()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_AppsFolders();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#getServiceDiscoveryType <em>Service Discovery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Discovery Type</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getServiceDiscoveryType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_ServiceDiscoveryType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#isMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#isMonitoring()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Monitoring();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#getGatewayType <em>Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Type</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getGatewayType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_GatewayType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Deployment#getKubernetesServiceType <em>Kubernetes Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kubernetes Service Type</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getKubernetesServiceType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_KubernetesServiceType();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.jdl.Deployment#getJdl <em>Jdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jdl</em>'.
	 * @see com.github.icelyframework.jdl.Deployment#getJdl()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Jdl();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.UnidirectionalRelationship <em>Unidirectional Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unidirectional Relationship</em>'.
	 * @see com.github.icelyframework.jdl.UnidirectionalRelationship
	 * @generated
	 */
	EClass getUnidirectionalRelationship();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.jdl.UnidirectionalRelationship#getToEntity <em>To Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Entity</em>'.
	 * @see com.github.icelyframework.jdl.UnidirectionalRelationship#getToEntity()
	 * @see #getUnidirectionalRelationship()
	 * @generated
	 */
	EReference getUnidirectionalRelationship_ToEntity();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.BidirectionalRelationship <em>Bidirectional Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bidirectional Relationship</em>'.
	 * @see com.github.icelyframework.jdl.BidirectionalRelationship
	 * @generated
	 */
	EClass getBidirectionalRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.jdl.BidirectionalRelationship#getToColumn <em>To Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Column</em>'.
	 * @see com.github.icelyframework.jdl.BidirectionalRelationship#getToColumn()
	 * @see #getBidirectionalRelationship()
	 * @generated
	 */
	EReference getBidirectionalRelationship_ToColumn();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see com.github.icelyframework.jdl.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.jdl.Enum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see com.github.icelyframework.jdl.Enum#getLiterals()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Literals();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.jdl.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.github.icelyframework.jdl.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Literal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.jdl.Literal#getName()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.jdl.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Paginate <em>Paginate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paginate</em>'.
	 * @see com.github.icelyframework.jdl.Paginate
	 * @generated
	 */
	EClass getPaginate();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.jdl.Paginate#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see com.github.icelyframework.jdl.Paginate#getEntities()
	 * @see #getPaginate()
	 * @generated
	 */
	EReference getPaginate_Entities();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Paginate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.jdl.Paginate#getValue()
	 * @see #getPaginate()
	 * @generated
	 */
	EAttribute getPaginate_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see com.github.icelyframework.jdl.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.jdl.DTO#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see com.github.icelyframework.jdl.DTO#getEntities()
	 * @see #getDTO()
	 * @generated
	 */
	EReference getDTO_Entities();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.DTO#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.jdl.DTO#getValue()
	 * @see #getDTO()
	 * @generated
	 */
	EAttribute getDTO_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.github.icelyframework.jdl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.jdl.Service#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see com.github.icelyframework.jdl.Service#getEntities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Entities();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Service#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.jdl.Service#getValue()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.jdl.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see com.github.icelyframework.jdl.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.jdl.Search#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see com.github.icelyframework.jdl.Search#getEntities()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Entities();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.jdl.Search#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.jdl.Search#getValue()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_Value();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Type</em>'.
	 * @see com.github.icelyframework.jdl.ApplicationType
	 * @generated
	 */
	EEnum getApplicationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see com.github.icelyframework.jdl.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see com.github.icelyframework.jdl.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see com.github.icelyframework.jdl.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.DeploymentType <em>Deployment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Type</em>'.
	 * @see com.github.icelyframework.jdl.DeploymentType
	 * @generated
	 */
	EEnum getDeploymentType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.BuildToolType <em>Build Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Build Tool Type</em>'.
	 * @see com.github.icelyframework.jdl.BuildToolType
	 * @generated
	 */
	EEnum getBuildToolType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.CacheProviderType <em>Cache Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Provider Type</em>'.
	 * @see com.github.icelyframework.jdl.CacheProviderType
	 * @generated
	 */
	EEnum getCacheProviderType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.ClientFramework <em>Client Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Client Framework</em>'.
	 * @see com.github.icelyframework.jdl.ClientFramework
	 * @generated
	 */
	EEnum getClientFramework();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.SearchEngine <em>Search Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Engine</em>'.
	 * @see com.github.icelyframework.jdl.SearchEngine
	 * @generated
	 */
	EEnum getSearchEngine();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Broker</em>'.
	 * @see com.github.icelyframework.jdl.MessageBroker
	 * @generated
	 */
	EEnum getMessageBroker();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.AuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.jdl.AuthenticationType
	 * @generated
	 */
	EEnum getAuthenticationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.ServiceDiscoveryType <em>Service Discovery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Discovery Type</em>'.
	 * @see com.github.icelyframework.jdl.ServiceDiscoveryType
	 * @generated
	 */
	EEnum getServiceDiscoveryType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.GatewayType <em>Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Type</em>'.
	 * @see com.github.icelyframework.jdl.GatewayType
	 * @generated
	 */
	EEnum getGatewayType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.ServiceValue <em>Service Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Value</em>'.
	 * @see com.github.icelyframework.jdl.ServiceValue
	 * @generated
	 */
	EEnum getServiceValue();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.DTOValue <em>DTO Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DTO Value</em>'.
	 * @see com.github.icelyframework.jdl.DTOValue
	 * @generated
	 */
	EEnum getDTOValue();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.jdl.PaginationValue <em>Pagination Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pagination Value</em>'.
	 * @see com.github.icelyframework.jdl.PaginationValue
	 * @generated
	 */
	EEnum getPaginationValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JdlFactory getJdlFactory();

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
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.ApplicationImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONFIG = eINSTANCE.getApplication_Config();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ENTITIES = eINSTANCE.getApplication_Entities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.ConfigImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__BASE_NAME = eINSTANCE.getConfig_BaseName();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__APPLICATION_TYPE = eINSTANCE.getConfig_ApplicationType();

		/**
		 * The meta object literal for the '<em><b>Service Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__SERVICE_PORT = eINSTANCE.getConfig_ServicePort();

		/**
		 * The meta object literal for the '<em><b>Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__DATABASE_TYPE = eINSTANCE.getConfig_DatabaseType();

		/**
		 * The meta object literal for the '<em><b>Build Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__BUILD_TOOL = eINSTANCE.getConfig_BuildTool();

		/**
		 * The meta object literal for the '<em><b>Dto Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__DTO_SUFFIX = eINSTANCE.getConfig_DtoSuffix();

		/**
		 * The meta object literal for the '<em><b>Enable Hibernate Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__ENABLE_HIBERNATE_CACHE = eINSTANCE.getConfig_EnableHibernateCache();

		/**
		 * The meta object literal for the '<em><b>Entity Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__ENTITY_SUFFIX = eINSTANCE.getConfig_EntitySuffix();

		/**
		 * The meta object literal for the '<em><b>Jhi Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__JHI_PREFIX = eINSTANCE.getConfig_JhiPrefix();

		/**
		 * The meta object literal for the '<em><b>Native Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NATIVE_LANGUAGE = eINSTANCE.getConfig_NativeLanguage();

		/**
		 * The meta object literal for the '<em><b>Skip Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__SKIP_CLIENT = eINSTANCE.getConfig_SkipClient();

		/**
		 * The meta object literal for the '<em><b>Skip Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__SKIP_SERVER = eINSTANCE.getConfig_SkipServer();

		/**
		 * The meta object literal for the '<em><b>Skip User Management</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__SKIP_USER_MANAGEMENT = eINSTANCE.getConfig_SkipUserManagement();

		/**
		 * The meta object literal for the '<em><b>Uaa Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__UAA_BASE_NAME = eINSTANCE.getConfig_UaaBaseName();

		/**
		 * The meta object literal for the '<em><b>Test Frameworks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__TEST_FRAMEWORKS = eINSTANCE.getConfig_TestFrameworks();

		/**
		 * The meta object literal for the '<em><b>Authentication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__AUTHENTICATION_TYPE = eINSTANCE.getConfig_AuthenticationType();

		/**
		 * The meta object literal for the '<em><b>Cache Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__CACHE_PROVIDER = eINSTANCE.getConfig_CacheProvider();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__APPLICATION = eINSTANCE.getConfig_Application();

		/**
		 * The meta object literal for the '<em><b>Client Framework</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__CLIENT_FRAMEWORK = eINSTANCE.getConfig_ClientFramework();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.EntityImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPS = eINSTANCE.getEntity_Relationships();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.FieldImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__UNIQUE = eINSTANCE.getField_Unique();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MIN = eINSTANCE.getField_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MAX = eINSTANCE.getField_Max();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.RelationshipImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MULTIPLICITY = eINSTANCE.getRelationship_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>To Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TO_NAME = eINSTANCE.getRelationship_ToName();

		/**
		 * The meta object literal for the '<em><b>From Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__FROM_COLUMN = eINSTANCE.getRelationship_FromColumn();

		/**
		 * The meta object literal for the '<em><b>From Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__FROM_NAME = eINSTANCE.getRelationship_FromName();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.RelationshipColumnImpl <em>Relationship Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.RelationshipColumnImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getRelationshipColumn()
		 * @generated
		 */
		EClass RELATIONSHIP_COLUMN = eINSTANCE.getRelationshipColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_COLUMN__NAME = eINSTANCE.getRelationshipColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_COLUMN__IS_REQUIRED = eINSTANCE.getRelationshipColumn_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_COLUMN__ENTITY = eINSTANCE.getRelationshipColumn_Entity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.JDLImpl <em>JDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.JDLImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getJDL()
		 * @generated
		 */
		EClass JDL = eINSTANCE.getJDL();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__APPLICATIONS = eINSTANCE.getJDL_Applications();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__ENTITIES = eINSTANCE.getJDL_Entities();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__ENUMS = eINSTANCE.getJDL_Enums();

		/**
		 * The meta object literal for the '<em><b>Paginate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__PAGINATE = eINSTANCE.getJDL_Paginate();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__DTO = eINSTANCE.getJDL_Dto();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__SERVICE = eINSTANCE.getJDL_Service();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__SEARCH = eINSTANCE.getJDL_Search();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JDL__DEPLOYMENTS = eINSTANCE.getJDL_Deployments();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.DeploymentImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Deployment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DEPLOYMENT_TYPE = eINSTANCE.getDeployment_DeploymentType();

		/**
		 * The meta object literal for the '<em><b>Directory Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DIRECTORY_PATH = eINSTANCE.getDeployment_DirectoryPath();

		/**
		 * The meta object literal for the '<em><b>Docker Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DOCKER_REPOSITORY_NAME = eINSTANCE.getDeployment_DockerRepositoryName();

		/**
		 * The meta object literal for the '<em><b>Apps Folders</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__APPS_FOLDERS = eINSTANCE.getDeployment_AppsFolders();

		/**
		 * The meta object literal for the '<em><b>Service Discovery Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__SERVICE_DISCOVERY_TYPE = eINSTANCE.getDeployment_ServiceDiscoveryType();

		/**
		 * The meta object literal for the '<em><b>Monitoring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__MONITORING = eINSTANCE.getDeployment_Monitoring();

		/**
		 * The meta object literal for the '<em><b>Gateway Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__GATEWAY_TYPE = eINSTANCE.getDeployment_GatewayType();

		/**
		 * The meta object literal for the '<em><b>Kubernetes Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__KUBERNETES_SERVICE_TYPE = eINSTANCE.getDeployment_KubernetesServiceType();

		/**
		 * The meta object literal for the '<em><b>Jdl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__JDL = eINSTANCE.getDeployment_Jdl();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.UnidirectionalRelationshipImpl <em>Unidirectional Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.UnidirectionalRelationshipImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getUnidirectionalRelationship()
		 * @generated
		 */
		EClass UNIDIRECTIONAL_RELATIONSHIP = eINSTANCE.getUnidirectionalRelationship();

		/**
		 * The meta object literal for the '<em><b>To Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY = eINSTANCE.getUnidirectionalRelationship_ToEntity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.BidirectionalRelationshipImpl <em>Bidirectional Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.BidirectionalRelationshipImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getBidirectionalRelationship()
		 * @generated
		 */
		EClass BIDIRECTIONAL_RELATIONSHIP = eINSTANCE.getBidirectionalRelationship();

		/**
		 * The meta object literal for the '<em><b>To Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN = eINSTANCE.getBidirectionalRelationship_ToColumn();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.EnumImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__LITERALS = eINSTANCE.getEnum_Literals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.LiteralImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.PaginateImpl <em>Paginate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.PaginateImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getPaginate()
		 * @generated
		 */
		EClass PAGINATE = eINSTANCE.getPaginate();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGINATE__ENTITIES = eINSTANCE.getPaginate_Entities();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATE__VALUE = eINSTANCE.getPaginate_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.DTOImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__ENTITIES = eINSTANCE.getDTO_Entities();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO__VALUE = eINSTANCE.getDTO_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.ServiceImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENTITIES = eINSTANCE.getService_Entities();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__VALUE = eINSTANCE.getService_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.impl.SearchImpl
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__ENTITIES = eINSTANCE.getSearch_Entities();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__VALUE = eINSTANCE.getSearch_Value();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.ApplicationType <em>Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.ApplicationType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getApplicationType()
		 * @generated
		 */
		EEnum APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.DatabaseType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.Multiplicity
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.RelationshipType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.DeploymentType <em>Deployment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.DeploymentType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDeploymentType()
		 * @generated
		 */
		EEnum DEPLOYMENT_TYPE = eINSTANCE.getDeploymentType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.BuildToolType <em>Build Tool Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.BuildToolType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getBuildToolType()
		 * @generated
		 */
		EEnum BUILD_TOOL_TYPE = eINSTANCE.getBuildToolType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.CacheProviderType <em>Cache Provider Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.CacheProviderType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getCacheProviderType()
		 * @generated
		 */
		EEnum CACHE_PROVIDER_TYPE = eINSTANCE.getCacheProviderType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.ClientFramework <em>Client Framework</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.ClientFramework
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getClientFramework()
		 * @generated
		 */
		EEnum CLIENT_FRAMEWORK = eINSTANCE.getClientFramework();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.SearchEngine <em>Search Engine</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.SearchEngine
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getSearchEngine()
		 * @generated
		 */
		EEnum SEARCH_ENGINE = eINSTANCE.getSearchEngine();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.MessageBroker <em>Message Broker</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.MessageBroker
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getMessageBroker()
		 * @generated
		 */
		EEnum MESSAGE_BROKER = eINSTANCE.getMessageBroker();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.AuthenticationType <em>Authentication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.AuthenticationType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getAuthenticationType()
		 * @generated
		 */
		EEnum AUTHENTICATION_TYPE = eINSTANCE.getAuthenticationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.ServiceDiscoveryType <em>Service Discovery Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.ServiceDiscoveryType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getServiceDiscoveryType()
		 * @generated
		 */
		EEnum SERVICE_DISCOVERY_TYPE = eINSTANCE.getServiceDiscoveryType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.GatewayType <em>Gateway Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.GatewayType
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getGatewayType()
		 * @generated
		 */
		EEnum GATEWAY_TYPE = eINSTANCE.getGatewayType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.ServiceValue <em>Service Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.ServiceValue
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getServiceValue()
		 * @generated
		 */
		EEnum SERVICE_VALUE = eINSTANCE.getServiceValue();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.DTOValue <em>DTO Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.DTOValue
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getDTOValue()
		 * @generated
		 */
		EEnum DTO_VALUE = eINSTANCE.getDTOValue();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.jdl.PaginationValue <em>Pagination Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.jdl.PaginationValue
		 * @see com.github.icelyframework.jdl.impl.JdlPackageImpl#getPaginationValue()
		 * @generated
		 */
		EEnum PAGINATION_VALUE = eINSTANCE.getPaginationValue();

	}

} //JdlPackage
