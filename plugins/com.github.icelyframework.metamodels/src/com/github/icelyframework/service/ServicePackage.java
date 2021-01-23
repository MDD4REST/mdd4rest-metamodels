/**
 */
package com.github.icelyframework.service;

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
 * @see com.github.icelyframework.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/icelyframework/service";

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
	ServicePackage eINSTANCE = com.github.icelyframework.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ProjectImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Primitivetype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PRIMITIVETYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ARCHITECTURE = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ApplicationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

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
	 * The feature id for the '<em><b>Complextypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPLEXTYPES = 3;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODULES = 4;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROLES = 5;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.PropertyImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIQUE = 0;

	/**
	 * The feature id for the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_NAMING_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MIN = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MAX = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHANGEABLE = 7;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NULLABLE = 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = 9;

	/**
	 * The feature id for the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATABASE_COLUMN = 10;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TRANSIENT = 11;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALIDATE = 12;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LENGTH = 13;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.TypeDefinitionImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 8;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.SimpleTypeImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TYPE_NAME = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.PrimitiveTypeImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_NAME = SIMPLE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.RelationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CASCADE = 2;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORDER_BY = 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VISIBILITY = 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPPOSITE = 7;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 9;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CHANGEABLE = 10;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CACHE = 11;

	/**
	 * The feature id for the '<em><b>Database Join Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DATABASE_JOIN_COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__INVERSE = 13;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VALIDATE = 14;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TRANSIENT = 15;

	/**
	 * The feature id for the '<em><b>Database Join Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DATABASE_JOIN_TABLE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = 17;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__GENERATED_BY_SCULPTOR = 18;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__GENERATED_BY_JHIPSTER = 19;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.LiteralImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 5;

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
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.InheritanceImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 6;

	/**
	 * The feature id for the '<em><b>Discriminator Column Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISCRIMINATOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Discriminator Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISCRIMINATOR_COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.DomainObjectImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__TYPE_NAME = SIMPLE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__PROPERTIES = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__ABSTRACT = SIMPLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__AGGREGATE_ROOT = SIMPLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__RELATIONS = SIMPLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__INHERITANCE = SIMPLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__REPOSITORY = SIMPLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OPERATIONS = SIMPLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__AGGREGATE = SIMPLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__PACKAGE = SIMPLE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__GAP_CLASS = SIMPLE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__CACHE = SIMPLE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__OPTIMISTIC_LOCKING = SIMPLE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DATABASE_TABLE = SIMPLE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__VALIDATE = SIMPLE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE = SIMPLE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__SCAFFOLD = SIMPLE_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__GENERATED_BY_JHIPSTER = SIMPLE_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__GENERATED_BY_SCULPTOR = SIMPLE_TYPE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.EntityImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PROPERTIES = DOMAIN_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONS = DOMAIN_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SCAFFOLD = DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERATED_BY_JHIPSTER = DOMAIN_OBJECT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERATED_BY_SCULPTOR = DOMAIN_OBJECT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Auditable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AUDITABLE = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ValueObjectImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__PROPERTIES = DOMAIN_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__RELATIONS = DOMAIN_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__SCAFFOLD = DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__GENERATED_BY_JHIPSTER = DOMAIN_OBJECT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__GENERATED_BY_SCULPTOR = DOMAIN_OBJECT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__IMMUTABLE = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__PERSISTENT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.DataMapperImpl <em>Data Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.DataMapperImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDataMapper()
	 * @generated
	 */
	int DATA_MAPPER = 10;

	/**
	 * The feature id for the '<em><b>Domain Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPER__DOMAIN_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPER__DTO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Data Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAPPER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.BasicTypeImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__PROPERTIES = VALUE_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__ABSTRACT = VALUE_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__RELATIONS = VALUE_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__INHERITANCE = VALUE_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__REPOSITORY = VALUE_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__OPERATIONS = VALUE_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__PACKAGE = VALUE_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__GAP_CLASS = VALUE_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__CACHE = VALUE_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__OPTIMISTIC_LOCKING = VALUE_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__DATABASE_TABLE = VALUE_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__VALIDATE = VALUE_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__DISCRIMINATOR_COLUMN_VALUE = VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__SCAFFOLD = VALUE_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__GENERATED_BY_JHIPSTER = VALUE_OBJECT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__GENERATED_BY_SCULPTOR = VALUE_OBJECT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__IMMUTABLE = VALUE_OBJECT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__PERSISTENT = VALUE_OBJECT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.EventImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 17;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROPERTIES = VALUE_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ABSTRACT = VALUE_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RELATIONS = VALUE_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INHERITANCE = VALUE_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REPOSITORY = VALUE_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPERATIONS = VALUE_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PACKAGE = VALUE_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GAP_CLASS = VALUE_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CACHE = VALUE_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPTIMISTIC_LOCKING = VALUE_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATABASE_TABLE = VALUE_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALIDATE = VALUE_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DISCRIMINATOR_COLUMN_VALUE = VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SCAFFOLD = VALUE_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GENERATED_BY_JHIPSTER = VALUE_OBJECT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GENERATED_BY_SCULPTOR = VALUE_OBJECT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IMMUTABLE = VALUE_OBJECT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PERSISTENT = VALUE_OBJECT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.CommandEventImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getCommandEvent()
	 * @generated
	 */
	int COMMAND_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__TYPE_NAME = EVENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__PROPERTIES = EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__AGGREGATE_ROOT = EVENT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__RELATIONS = EVENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__INHERITANCE = EVENT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__REPOSITORY = EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__OPERATIONS = EVENT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__AGGREGATE = EVENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__PACKAGE = EVENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__GAP_CLASS = EVENT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__CACHE = EVENT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__OPTIMISTIC_LOCKING = EVENT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__DATABASE_TABLE = EVENT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__VALIDATE = EVENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__DISCRIMINATOR_COLUMN_VALUE = EVENT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__SCAFFOLD = EVENT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__GENERATED_BY_JHIPSTER = EVENT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__GENERATED_BY_SCULPTOR = EVENT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__IMMUTABLE = EVENT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__PERSISTENT = EVENT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.EnumerationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 14;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PROPERTIES = DOMAIN_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ABSTRACT = DOMAIN_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__RELATIONS = DOMAIN_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__INHERITANCE = DOMAIN_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__REPOSITORY = DOMAIN_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OPERATIONS = DOMAIN_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PACKAGE = DOMAIN_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GAP_CLASS = DOMAIN_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CACHE = DOMAIN_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OPTIMISTIC_LOCKING = DOMAIN_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DATABASE_TABLE = DOMAIN_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALIDATE = DOMAIN_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DISCRIMINATOR_COLUMN_VALUE = DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SCAFFOLD = DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GENERATED_BY_JHIPSTER = DOMAIN_OBJECT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GENERATED_BY_SCULPTOR = DOMAIN_OBJECT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.AggregateImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 15;

	/**
	 * The feature id for the '<em><b>Domainobjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__DOMAINOBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__MODULE = 2;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__AGGREGATE_ROOT = 3;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.DTOImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 16;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__PROPERTIES = VALUE_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__ABSTRACT = VALUE_OBJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__RELATIONS = VALUE_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__INHERITANCE = VALUE_OBJECT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__REPOSITORY = VALUE_OBJECT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__OPERATIONS = VALUE_OBJECT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__PACKAGE = VALUE_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__GAP_CLASS = VALUE_OBJECT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__CACHE = VALUE_OBJECT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__OPTIMISTIC_LOCKING = VALUE_OBJECT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__DATABASE_TABLE = VALUE_OBJECT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__VALIDATE = VALUE_OBJECT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__DISCRIMINATOR_COLUMN_VALUE = VALUE_OBJECT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__SCAFFOLD = VALUE_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__GENERATED_BY_JHIPSTER = VALUE_OBJECT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__GENERATED_BY_SCULPTOR = VALUE_OBJECT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__IMMUTABLE = VALUE_OBJECT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__PERSISTENT = VALUE_OBJECT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.DomainEventImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__TYPE_NAME = EVENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__PROPERTIES = EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__ABSTRACT = EVENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__AGGREGATE_ROOT = EVENT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__RELATIONS = EVENT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__INHERITANCE = EVENT__INHERITANCE;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__REPOSITORY = EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OPERATIONS = EVENT__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__AGGREGATE = EVENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__PACKAGE = EVENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__GAP_CLASS = EVENT__GAP_CLASS;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__CACHE = EVENT__CACHE;

	/**
	 * The feature id for the '<em><b>Optimistic Locking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__OPTIMISTIC_LOCKING = EVENT__OPTIMISTIC_LOCKING;

	/**
	 * The feature id for the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__DATABASE_TABLE = EVENT__DATABASE_TABLE;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__VALIDATE = EVENT__VALIDATE;

	/**
	 * The feature id for the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__DISCRIMINATOR_COLUMN_VALUE = EVENT__DISCRIMINATOR_COLUMN_VALUE;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__SCAFFOLD = EVENT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Generated By JHipster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__GENERATED_BY_JHIPSTER = EVENT__GENERATED_BY_JHIPSTER;

	/**
	 * The feature id for the '<em><b>Generated By Sculptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__GENERATED_BY_SCULPTOR = EVENT__GENERATED_BY_SCULPTOR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__IMMUTABLE = EVENT__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__PERSISTENT = EVENT__PERSISTENT;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.PathImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPath()
	 * @generated
	 */
	int PATH = 19;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RELATIVE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.RepositoryImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 20;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OTHER_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SUBSCRIBE = 3;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__AGGREGATE_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GAP_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 6;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.OperationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__THROWS = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PUBLISH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURNTYPE = 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ResourceOperationImpl <em>Resource Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ResourceOperationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getResourceOperation()
	 * @generated
	 */
	int RESOURCE_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__RETURNTYPE = OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__RESOURCE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__HTTP_METHOD = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__DELEGATE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__RETURN_STRING = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__PATH = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__CONTENT_TYPE = OPERATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION__RESOURCE_PARAMS = OPERATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ResourceImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 22;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SERVICE_DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__GAP_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MODULE = 5;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PERMISSIONS = 6;

	/**
	 * The feature id for the '<em><b>Inputrepresentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INPUTREPRESENTATION = 7;

	/**
	 * The feature id for the '<em><b>Outputrepresentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OUTPUTREPRESENTATION = 8;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ServiceOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ServiceOperationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getServiceOperation()
	 * @generated
	 */
	int SERVICE_OPERATION = 23;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__RETURNTYPE = OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__SERVICE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__SERVICE_DELEGATE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION__DELEGATE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.RepositoryOperationImpl <em>Repository Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.RepositoryOperationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRepositoryOperation()
	 * @generated
	 */
	int REPOSITORY_OPERATION = 24;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__RETURNTYPE = OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Delegate To Access Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__ACCESS_OBJECT_NAME = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__REPOSITORY = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__QUERY = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__SELECT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION__CONDITION = OPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Repository Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.DomainObjectOperationImpl <em>Domain Object Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.DomainObjectOperationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDomainObjectOperation()
	 * @generated
	 */
	int DOMAIN_OBJECT_OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__THROWS = OPERATION__THROWS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__VISIBILITY = OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__RETURNTYPE = OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__ABSTRACT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domainobject</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__DOMAINOBJECT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Object Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ConsumerImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 26;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__REPOSITORY_DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SERVICE_DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__OTHER_DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__SUBSCRIBE = 4;

	/**
	 * The feature id for the '<em><b>Message Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__MESSAGE_ROOT = 5;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.SubscribeImpl <em>Subscribe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.SubscribeImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getSubscribe()
	 * @generated
	 */
	int SUBSCRIBE = 27;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__EVENT_BUS = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__TOPIC = 1;

	/**
	 * The number of structural features of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ServiceImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 28;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Repository Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REPOSITORY_DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Other Dependencies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OTHER_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__WEB_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Remote Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REMOTE_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Local Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LOCAL_INTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUBSCRIBE = 7;

	/**
	 * The feature id for the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__GAP_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MODULE = 10;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.PublishImpl <em>Publish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.PublishImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPublish()
	 * @generated
	 */
	int PUBLISH = 30;

	/**
	 * The feature id for the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__EVENT_BUS = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__EVENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ParameterImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ComplexTypeImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__COLLECTION = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapped Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__MAPPED_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ModuleImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 34;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXTERNAL = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BASE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PERSISTENCE_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__AGGREGATES = 4;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__APPLICATION = 5;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SERVICES = 6;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RESOURCES = 7;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.PermissionImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 41;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.HasAnyAuthoritiesImpl <em>Has Any Authorities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.HasAnyAuthoritiesImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getHasAnyAuthorities()
	 * @generated
	 */
	int HAS_ANY_AUTHORITIES = 35;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ANY_AUTHORITIES__ROLES = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Any Authorities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ANY_AUTHORITIES_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.HasAuthorityImpl <em>Has Authority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.HasAuthorityImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getHasAuthority()
	 * @generated
	 */
	int HAS_AUTHORITY = 36;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_AUTHORITY__ROLE = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_AUTHORITY_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.AuthenticatedImpl <em>Authenticated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.AuthenticatedImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAuthenticated()
	 * @generated
	 */
	int AUTHENTICATED = 37;

	/**
	 * The number of structural features of the '<em>Authenticated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATED_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.AccessImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 38;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ACCESS = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.PermitAllImpl <em>Permit All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.PermitAllImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPermitAll()
	 * @generated
	 */
	int PERMIT_ALL = 39;

	/**
	 * The feature id for the '<em><b>With All Subresources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_ALL__WITH_ALL_SUBRESOURCES = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Permit All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_ALL_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.RoleImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 40;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.ResourceParamImpl <em>Resource Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.ResourceParamImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getResourceParam()
	 * @generated
	 */
	int RESOURCE_PARAM = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAM__QUERY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Resource Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.OutputRepresentationImpl <em>Output Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.OutputRepresentationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getOutputRepresentation()
	 * @generated
	 */
	int OUTPUT_REPRESENTATION = 43;

	/**
	 * The feature id for the '<em><b>Output Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.impl.InputRepresentationImpl <em>Input Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.impl.InputRepresentationImpl
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getInputRepresentation()
	 * @generated
	 */
	int INPUT_REPRESENTATION = 44;

	/**
	 * The feature id for the '<em><b>Input Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__INPUT_MEDIA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.Multiplicity
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 45;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.DefaultType <em>Default Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.DefaultType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDefaultType()
	 * @generated
	 */
	int DEFAULT_TYPE = 46;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.HttpMethod
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 47;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.RelationType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 48;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.InheritanceType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 49;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.DiscriminatorType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDiscriminatorType()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE = 50;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.CollectionType <em>Collection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.CollectionType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 51;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.ArchitectureType <em>Architecture Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.ArchitectureType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getArchitectureType()
	 * @generated
	 */
	int ARCHITECTURE_TYPE = 52;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.AuthenticationType <em>Authentication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.AuthenticationType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAuthenticationType()
	 * @generated
	 */
	int AUTHENTICATION_TYPE = 53;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.QueryType <em>Query Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.QueryType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 54;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.ApplicationType <em>Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.ApplicationType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 55;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.service.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.service.MediaType
	 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 56;


	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.github.icelyframework.service.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see com.github.icelyframework.service.Project#getApplications()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Project#getPrimitivetype <em>Primitivetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitivetype</em>'.
	 * @see com.github.icelyframework.service.Project#getPrimitivetype()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Primitivetype();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Project#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.github.icelyframework.service.Project#getBasePath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Project#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.service.Project#getBasePackage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Project#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see com.github.icelyframework.service.Project#getArchitecture()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Architecture();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.github.icelyframework.service.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.github.icelyframework.service.Application#getProject()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Project();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Application#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.service.Application#getBasePackage()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_BasePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Application#getComplextypes <em>Complextypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complextypes</em>'.
	 * @see com.github.icelyframework.service.Application#getComplextypes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Complextypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Application#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see com.github.icelyframework.service.Application#getModules()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Application#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see com.github.icelyframework.service.Application#getRoles()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Roles();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Application#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see com.github.icelyframework.service.Application#getApplicationType()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ApplicationType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.github.icelyframework.service.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see com.github.icelyframework.service.Property#isUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Unique();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#isIsNamingProperty <em>Is Naming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Naming Property</em>'.
	 * @see com.github.icelyframework.service.Property#isIsNamingProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsNamingProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.github.icelyframework.service.Property#isRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.github.icelyframework.service.Property#getMin()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.github.icelyframework.service.Property#getMax()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Max();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.service.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see com.github.icelyframework.service.Property#isChangeable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see com.github.icelyframework.service.Property#isNullable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.github.icelyframework.service.Property#getVisibility()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getDatabaseColumn <em>Database Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Column</em>'.
	 * @see com.github.icelyframework.service.Property#getDatabaseColumn()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DatabaseColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see com.github.icelyframework.service.Property#isTransient()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Transient();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see com.github.icelyframework.service.Property#getValidate()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Validate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Property#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.github.icelyframework.service.Property#getLength()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Length();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see com.github.icelyframework.service.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.icelyframework.service.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see com.github.icelyframework.service.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.github.icelyframework.service.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see com.github.icelyframework.service.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see com.github.icelyframework.service.Relation#getCascade()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see com.github.icelyframework.service.Relation#getOrderBy()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.github.icelyframework.service.Relation#getVisibility()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.github.icelyframework.service.Relation#isRequired()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see com.github.icelyframework.service.Relation#isNullable()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Nullable();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Relation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see com.github.icelyframework.service.Relation#getOpposite()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see com.github.icelyframework.service.Relation#getRelationType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_RelationType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see com.github.icelyframework.service.Relation#isChangeable()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see com.github.icelyframework.service.Relation#isCache()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Cache();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getDatabaseJoinColumn <em>Database Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Join Column</em>'.
	 * @see com.github.icelyframework.service.Relation#getDatabaseJoinColumn()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_DatabaseJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse</em>'.
	 * @see com.github.icelyframework.service.Relation#isInverse()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Inverse();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see com.github.icelyframework.service.Relation#getValidate()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Validate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see com.github.icelyframework.service.Relation#isTransient()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Transient();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#getDatabaseJoinTable <em>Database Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Join Table</em>'.
	 * @see com.github.icelyframework.service.Relation#getDatabaseJoinTable()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_DatabaseJoinTable();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.service.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isGeneratedBySculptor <em>Generated By Sculptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated By Sculptor</em>'.
	 * @see com.github.icelyframework.service.Relation#isGeneratedBySculptor()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_GeneratedBySculptor();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Relation#isGeneratedByJHipster <em>Generated By JHipster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated By JHipster</em>'.
	 * @see com.github.icelyframework.service.Relation#isGeneratedByJHipster()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_GeneratedByJHipster();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.github.icelyframework.service.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Literal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Literal#getName()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.service.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see com.github.icelyframework.service.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column Length</em>'.
	 * @see com.github.icelyframework.service.Inheritance#getDiscriminatorColumnLength()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_DiscriminatorColumnLength();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see com.github.icelyframework.service.Inheritance#getDiscriminatorType()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_DiscriminatorType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column Name</em>'.
	 * @see com.github.icelyframework.service.Inheritance#getDiscriminatorColumnName()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_DiscriminatorColumnName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Inheritance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.icelyframework.service.Inheritance#getType()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.github.icelyframework.service.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Entity#isAuditable <em>Auditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auditable</em>'.
	 * @see com.github.icelyframework.service.Entity#isAuditable()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Auditable();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see com.github.icelyframework.service.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see com.github.icelyframework.service.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ValueObject#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see com.github.icelyframework.service.ValueObject#isImmutable()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Immutable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ValueObject#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see com.github.icelyframework.service.ValueObject#isPersistent()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Persistent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.DataMapper <em>Data Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mapper</em>'.
	 * @see com.github.icelyframework.service.DataMapper
	 * @generated
	 */
	EClass getDataMapper();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.DataMapper#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Object</em>'.
	 * @see com.github.icelyframework.service.DataMapper#getDomainObject()
	 * @see #getDataMapper()
	 * @generated
	 */
	EReference getDataMapper_DomainObject();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.DataMapper#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dto</em>'.
	 * @see com.github.icelyframework.service.DataMapper#getDto()
	 * @see #getDataMapper()
	 * @generated
	 */
	EReference getDataMapper_Dto();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DataMapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.DataMapper#getName()
	 * @see #getDataMapper()
	 * @generated
	 */
	EAttribute getDataMapper_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see com.github.icelyframework.service.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Event</em>'.
	 * @see com.github.icelyframework.service.CommandEvent
	 * @generated
	 */
	EClass getCommandEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see com.github.icelyframework.service.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.DomainObject#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getProperties()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isAbstract()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isAggregateRoot()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_AggregateRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.DomainObject#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getRelations()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.DomainObject#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getInheritance()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Inheritance();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.DomainObject#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getRepository()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.DomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getOperations()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Operations();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.DomainObject#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getAggregate()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Aggregate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getPackage()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Package();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isGapClass()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isCache()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Cache();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isOptimisticLocking <em>Optimistic Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimistic Locking</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isOptimisticLocking()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_OptimisticLocking();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#getDatabaseTable <em>Database Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Table</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getDatabaseTable()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_DatabaseTable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getValidate()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Validate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#getDiscriminatorColumnValue <em>Discriminator Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column Value</em>'.
	 * @see com.github.icelyframework.service.DomainObject#getDiscriminatorColumnValue()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_DiscriminatorColumnValue();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isScaffold <em>Scaffold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaffold</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isScaffold()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Scaffold();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isGeneratedByJHipster <em>Generated By JHipster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated By JHipster</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isGeneratedByJHipster()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_GeneratedByJHipster();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObject#isGeneratedBySculptor <em>Generated By Sculptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated By Sculptor</em>'.
	 * @see com.github.icelyframework.service.DomainObject#isGeneratedBySculptor()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_GeneratedBySculptor();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see com.github.icelyframework.service.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see com.github.icelyframework.service.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.service.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Aggregate#getDomainobjects <em>Domainobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainobjects</em>'.
	 * @see com.github.icelyframework.service.Aggregate#getDomainobjects()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Domainobjects();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Aggregate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Aggregate#getName()
	 * @see #getAggregate()
	 * @generated
	 */
	EAttribute getAggregate_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Aggregate#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see com.github.icelyframework.service.Aggregate#getModule()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Module();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Aggregate#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.service.Aggregate#getAggregateRoot()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_AggregateRoot();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see com.github.icelyframework.service.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.github.icelyframework.service.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see com.github.icelyframework.service.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see com.github.icelyframework.service.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Path#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see com.github.icelyframework.service.Path#getRelativePath()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_RelativePath();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see com.github.icelyframework.service.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Repository#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.github.icelyframework.service.Repository#getOperations()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Operations();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.Repository#getRepositoryDependencies <em>Repository Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Dependencies</em>'.
	 * @see com.github.icelyframework.service.Repository#getRepositoryDependencies()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_RepositoryDependencies();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.icelyframework.service.Repository#getOtherDependencies <em>Other Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Dependencies</em>'.
	 * @see com.github.icelyframework.service.Repository#getOtherDependencies()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_OtherDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Repository#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe</em>'.
	 * @see com.github.icelyframework.service.Repository#getSubscribe()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Subscribe();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Repository#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.service.Repository#getAggregateRoot()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_AggregateRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Repository#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see com.github.icelyframework.service.Repository#isGapClass()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.ResourceOperation <em>Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Operation</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation
	 * @generated
	 */
	EClass getResourceOperation();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.ResourceOperation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Resource</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getResource()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EReference getResourceOperation_Resource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ResourceOperation#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getHttpMethod()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EAttribute getResourceOperation_HttpMethod();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.ResourceOperation#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getDelegate()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EReference getResourceOperation_Delegate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ResourceOperation#getReturnString <em>Return String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return String</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getReturnString()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EAttribute getResourceOperation_ReturnString();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.ResourceOperation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getPath()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EReference getResourceOperation_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ResourceOperation#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getContentType()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EAttribute getResourceOperation_ContentType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.ResourceOperation#getResourceParams <em>Resource Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Params</em>'.
	 * @see com.github.icelyframework.service.ResourceOperation#getResourceParams()
	 * @see #getResourceOperation()
	 * @generated
	 */
	EReference getResourceOperation_ResourceParams();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.github.icelyframework.service.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.Resource#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see com.github.icelyframework.service.Resource#getServiceDependencies()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ServiceDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Resource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.github.icelyframework.service.Resource#getOperations()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Operations();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Resource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see com.github.icelyframework.service.Resource#getPath()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Resource#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see com.github.icelyframework.service.Resource#isGapClass()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Resource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see com.github.icelyframework.service.Resource#getModule()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Resource#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see com.github.icelyframework.service.Resource#getPermissions()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Resource#getInputrepresentation <em>Inputrepresentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputrepresentation</em>'.
	 * @see com.github.icelyframework.service.Resource#getInputrepresentation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Inputrepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Resource#getOutputrepresentation <em>Outputrepresentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputrepresentation</em>'.
	 * @see com.github.icelyframework.service.Resource#getOutputrepresentation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Outputrepresentation();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.ServiceOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.github.icelyframework.service.ServiceOperation
	 * @generated
	 */
	EClass getServiceOperation();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.ServiceOperation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see com.github.icelyframework.service.ServiceOperation#getService()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EReference getServiceOperation_Service();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.ServiceOperation#getServiceDelegate <em>Service Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Delegate</em>'.
	 * @see com.github.icelyframework.service.ServiceOperation#getServiceDelegate()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EReference getServiceOperation_ServiceDelegate();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.ServiceOperation#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see com.github.icelyframework.service.ServiceOperation#getDelegate()
	 * @see #getServiceOperation()
	 * @generated
	 */
	EReference getServiceOperation_Delegate();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.RepositoryOperation <em>Repository Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Operation</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation
	 * @generated
	 */
	EClass getRepositoryOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.RepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delegate To Access Object</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation#isDelegateToAccessObject()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_DelegateToAccessObject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.RepositoryOperation#isAccessObjectName <em>Access Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Object Name</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation#isAccessObjectName()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_AccessObjectName();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.RepositoryOperation#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation#getRepository()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EReference getRepositoryOperation_Repository();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.RepositoryOperation#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation#getQuery()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_Query();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.RepositoryOperation#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation#getSelect()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_Select();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.RepositoryOperation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.github.icelyframework.service.RepositoryOperation#getCondition()
	 * @see #getRepositoryOperation()
	 * @generated
	 */
	EAttribute getRepositoryOperation_Condition();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.DomainObjectOperation <em>Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Operation</em>'.
	 * @see com.github.icelyframework.service.DomainObjectOperation
	 * @generated
	 */
	EClass getDomainObjectOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.DomainObjectOperation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.github.icelyframework.service.DomainObjectOperation#isAbstract()
	 * @see #getDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDomainObjectOperation_Abstract();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.DomainObjectOperation#getDomainobject <em>Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domainobject</em>'.
	 * @see com.github.icelyframework.service.DomainObjectOperation#getDomainobject()
	 * @see #getDomainObjectOperation()
	 * @generated
	 */
	EReference getDomainObjectOperation_Domainobject();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see com.github.icelyframework.service.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.Consumer#getRepositoryDependencies <em>Repository Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Dependencies</em>'.
	 * @see com.github.icelyframework.service.Consumer#getRepositoryDependencies()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_RepositoryDependencies();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.Consumer#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see com.github.icelyframework.service.Consumer#getServiceDependencies()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_ServiceDependencies();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Consumer#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see com.github.icelyframework.service.Consumer#getChannel()
	 * @see #getConsumer()
	 * @generated
	 */
	EAttribute getConsumer_Channel();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.icelyframework.service.Consumer#getOtherDependencies <em>Other Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Dependencies</em>'.
	 * @see com.github.icelyframework.service.Consumer#getOtherDependencies()
	 * @see #getConsumer()
	 * @generated
	 */
	EAttribute getConsumer_OtherDependencies();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Consumer#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe</em>'.
	 * @see com.github.icelyframework.service.Consumer#getSubscribe()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Subscribe();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Consumer#getMessageRoot <em>Message Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Root</em>'.
	 * @see com.github.icelyframework.service.Consumer#getMessageRoot()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_MessageRoot();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe</em>'.
	 * @see com.github.icelyframework.service.Subscribe
	 * @generated
	 */
	EClass getSubscribe();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Subscribe#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see com.github.icelyframework.service.Subscribe#getEventBus()
	 * @see #getSubscribe()
	 * @generated
	 */
	EAttribute getSubscribe_EventBus();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Subscribe#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see com.github.icelyframework.service.Subscribe#getTopic()
	 * @see #getSubscribe()
	 * @generated
	 */
	EAttribute getSubscribe_Topic();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.github.icelyframework.service.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.github.icelyframework.service.Service#getOperations()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Operations();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.Service#getRepositoryDependencies <em>Repository Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Dependencies</em>'.
	 * @see com.github.icelyframework.service.Service#getRepositoryDependencies()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RepositoryDependencies();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.icelyframework.service.Service#getOtherDependencies <em>Other Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Dependencies</em>'.
	 * @see com.github.icelyframework.service.Service#getOtherDependencies()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_OtherDependencies();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.Service#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see com.github.icelyframework.service.Service#getServiceDependencies()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceDependencies();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Service#isWebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Service</em>'.
	 * @see com.github.icelyframework.service.Service#isWebService()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_WebService();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Service#isRemoteInterface <em>Remote Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Interface</em>'.
	 * @see com.github.icelyframework.service.Service#isRemoteInterface()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_RemoteInterface();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Service#isLocalInterface <em>Local Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Interface</em>'.
	 * @see com.github.icelyframework.service.Service#isLocalInterface()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_LocalInterface();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Service#getSubscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscribe</em>'.
	 * @see com.github.icelyframework.service.Service#getSubscribe()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Subscribe();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Service#isGapClass <em>Gap Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gap Class</em>'.
	 * @see com.github.icelyframework.service.Service#isGapClass()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_GapClass();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see com.github.icelyframework.service.Service#getModule()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Module();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.github.icelyframework.service.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Operation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see com.github.icelyframework.service.Operation#getThrows()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Operation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.github.icelyframework.service.Operation#getVisibility()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.service.Operation#getPublish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish</em>'.
	 * @see com.github.icelyframework.service.Operation#getPublish()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Publish();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.github.icelyframework.service.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Operation#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see com.github.icelyframework.service.Operation#getReturntype()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Returntype();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Publish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publish</em>'.
	 * @see com.github.icelyframework.service.Publish
	 * @generated
	 */
	EClass getPublish();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Publish#getEventBus <em>Event Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Bus</em>'.
	 * @see com.github.icelyframework.service.Publish#getEventBus()
	 * @see #getPublish()
	 * @generated
	 */
	EAttribute getPublish_EventBus();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Publish#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see com.github.icelyframework.service.Publish#getTopic()
	 * @see #getPublish()
	 * @generated
	 */
	EAttribute getPublish_Topic();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Publish#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see com.github.icelyframework.service.Publish#getEventType()
	 * @see #getPublish()
	 * @generated
	 */
	EReference getPublish_EventType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.github.icelyframework.service.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.service.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see com.github.icelyframework.service.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.ComplexType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.service.ComplexType#getType()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ComplexType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see com.github.icelyframework.service.ComplexType#getCollection()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Collection();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.ComplexType#getMappedType <em>Mapped Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapped Type</em>'.
	 * @see com.github.icelyframework.service.ComplexType#getMappedType()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_MappedType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see com.github.icelyframework.service.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.SimpleType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see com.github.icelyframework.service.SimpleType#getTypeName()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_TypeName();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see com.github.icelyframework.service.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Module#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see com.github.icelyframework.service.Module#isExternal()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_External();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Module#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.service.Module#getBasePackage()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Module#getPersistenceUnit <em>Persistence Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit</em>'.
	 * @see com.github.icelyframework.service.Module#getPersistenceUnit()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_PersistenceUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Module#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregates</em>'.
	 * @see com.github.icelyframework.service.Module#getAggregates()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Aggregates();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Module#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.service.Module#getApplication()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see com.github.icelyframework.service.Module#getServices()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.service.Module#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.github.icelyframework.service.Module#getResources()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Resources();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.HasAnyAuthorities <em>Has Any Authorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Any Authorities</em>'.
	 * @see com.github.icelyframework.service.HasAnyAuthorities
	 * @generated
	 */
	EClass getHasAnyAuthorities();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.service.HasAnyAuthorities#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see com.github.icelyframework.service.HasAnyAuthorities#getRoles()
	 * @see #getHasAnyAuthorities()
	 * @generated
	 */
	EReference getHasAnyAuthorities_Roles();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.HasAuthority <em>Has Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Authority</em>'.
	 * @see com.github.icelyframework.service.HasAuthority
	 * @generated
	 */
	EClass getHasAuthority();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.service.HasAuthority#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see com.github.icelyframework.service.HasAuthority#getRole()
	 * @see #getHasAuthority()
	 * @generated
	 */
	EReference getHasAuthority_Role();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Authenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticated</em>'.
	 * @see com.github.icelyframework.service.Authenticated
	 * @generated
	 */
	EClass getAuthenticated();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see com.github.icelyframework.service.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Access#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see com.github.icelyframework.service.Access#getAccess()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Access();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.PermitAll <em>Permit All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permit All</em>'.
	 * @see com.github.icelyframework.service.PermitAll
	 * @generated
	 */
	EClass getPermitAll();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.PermitAll#isWithAllSubresources <em>With All Subresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With All Subresources</em>'.
	 * @see com.github.icelyframework.service.PermitAll#isWithAllSubresources()
	 * @see #getPermitAll()
	 * @generated
	 */
	EAttribute getPermitAll_WithAllSubresources();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.github.icelyframework.service.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.service.Role#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.service.Role#getApplication()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Application();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see com.github.icelyframework.service.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.ResourceParam <em>Resource Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Param</em>'.
	 * @see com.github.icelyframework.service.ResourceParam
	 * @generated
	 */
	EClass getResourceParam();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ResourceParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.service.ResourceParam#getName()
	 * @see #getResourceParam()
	 * @generated
	 */
	EAttribute getResourceParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.ResourceParam#getQueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Type</em>'.
	 * @see com.github.icelyframework.service.ResourceParam#getQueryType()
	 * @see #getResourceParam()
	 * @generated
	 */
	EAttribute getResourceParam_QueryType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Representation</em>'.
	 * @see com.github.icelyframework.service.OutputRepresentation
	 * @generated
	 */
	EClass getOutputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Media Type</em>'.
	 * @see com.github.icelyframework.service.OutputRepresentation#getOutputMediaType()
	 * @see #getOutputRepresentation()
	 * @generated
	 */
	EAttribute getOutputRepresentation_OutputMediaType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.service.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Representation</em>'.
	 * @see com.github.icelyframework.service.InputRepresentation
	 * @generated
	 */
	EClass getInputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.service.InputRepresentation#getInputMediaType <em>Input Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Media Type</em>'.
	 * @see com.github.icelyframework.service.InputRepresentation#getInputMediaType()
	 * @see #getInputRepresentation()
	 * @generated
	 */
	EAttribute getInputRepresentation_InputMediaType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see com.github.icelyframework.service.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.DefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Type</em>'.
	 * @see com.github.icelyframework.service.DefaultType
	 * @generated
	 */
	EEnum getDefaultType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see com.github.icelyframework.service.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see com.github.icelyframework.service.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see com.github.icelyframework.service.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see com.github.icelyframework.service.DiscriminatorType
	 * @generated
	 */
	EEnum getDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Type</em>'.
	 * @see com.github.icelyframework.service.CollectionType
	 * @generated
	 */
	EEnum getCollectionType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.ArchitectureType <em>Architecture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Architecture Type</em>'.
	 * @see com.github.icelyframework.service.ArchitectureType
	 * @generated
	 */
	EEnum getArchitectureType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.AuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.service.AuthenticationType
	 * @generated
	 */
	EEnum getAuthenticationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Type</em>'.
	 * @see com.github.icelyframework.service.QueryType
	 * @generated
	 */
	EEnum getQueryType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Type</em>'.
	 * @see com.github.icelyframework.service.ApplicationType
	 * @generated
	 */
	EEnum getApplicationType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.service.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see com.github.icelyframework.service.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ProjectImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getProject()
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
		 * The meta object literal for the '<em><b>Primitivetype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PRIMITIVETYPE = eINSTANCE.getProject_Primitivetype();

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
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ApplicationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getApplication()
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
		 * The meta object literal for the '<em><b>Complextypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMPLEXTYPES = eINSTANCE.getApplication_Complextypes();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MODULES = eINSTANCE.getApplication_Modules();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ROLES = eINSTANCE.getApplication_Roles();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__APPLICATION_TYPE = eINSTANCE.getApplication_ApplicationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.PropertyImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UNIQUE = eINSTANCE.getProperty_Unique();

		/**
		 * The meta object literal for the '<em><b>Is Naming Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_NAMING_PROPERTY = eINSTANCE.getProperty_IsNamingProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REQUIRED = eINSTANCE.getProperty_Required();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MIN = eINSTANCE.getProperty_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MAX = eINSTANCE.getProperty_Max();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CHANGEABLE = eINSTANCE.getProperty_Changeable();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NULLABLE = eINSTANCE.getProperty_Nullable();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VISIBILITY = eINSTANCE.getProperty_Visibility();

		/**
		 * The meta object literal for the '<em><b>Database Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DATABASE_COLUMN = eINSTANCE.getProperty_DatabaseColumn();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TRANSIENT = eINSTANCE.getProperty_Transient();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALIDATE = eINSTANCE.getProperty_Validate();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LENGTH = eINSTANCE.getProperty_Length();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.PrimitiveTypeImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.RelationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__CASCADE = eINSTANCE.getRelation_Cascade();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__ORDER_BY = eINSTANCE.getRelation_OrderBy();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__VISIBILITY = eINSTANCE.getRelation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__REQUIRED = eINSTANCE.getRelation_Required();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NULLABLE = eINSTANCE.getRelation_Nullable();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPPOSITE = eINSTANCE.getRelation_Opposite();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__RELATION_TYPE = eINSTANCE.getRelation_RelationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__CHANGEABLE = eINSTANCE.getRelation_Changeable();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__CACHE = eINSTANCE.getRelation_Cache();

		/**
		 * The meta object literal for the '<em><b>Database Join Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DATABASE_JOIN_COLUMN = eINSTANCE.getRelation_DatabaseJoinColumn();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__INVERSE = eINSTANCE.getRelation_Inverse();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__VALIDATE = eINSTANCE.getRelation_Validate();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TRANSIENT = eINSTANCE.getRelation_Transient();

		/**
		 * The meta object literal for the '<em><b>Database Join Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__DATABASE_JOIN_TABLE = eINSTANCE.getRelation_DatabaseJoinTable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Generated By Sculptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__GENERATED_BY_SCULPTOR = eINSTANCE.getRelation_GeneratedBySculptor();

		/**
		 * The meta object literal for the '<em><b>Generated By JHipster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__GENERATED_BY_JHIPSTER = eINSTANCE.getRelation_GeneratedByJHipster();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.LiteralImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.InheritanceImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH = eINSTANCE.getInheritance_DiscriminatorColumnLength();

		/**
		 * The meta object literal for the '<em><b>Discriminator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISCRIMINATOR_TYPE = eINSTANCE.getInheritance_DiscriminatorType();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISCRIMINATOR_COLUMN_NAME = eINSTANCE.getInheritance_DiscriminatorColumnName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__TYPE = eINSTANCE.getInheritance_Type();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.EntityImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Auditable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__AUDITABLE = eINSTANCE.getEntity_Auditable();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.TypeDefinitionImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ValueObjectImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__IMMUTABLE = eINSTANCE.getValueObject_Immutable();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_OBJECT__PERSISTENT = eINSTANCE.getValueObject_Persistent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.DataMapperImpl <em>Data Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.DataMapperImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDataMapper()
		 * @generated
		 */
		EClass DATA_MAPPER = eINSTANCE.getDataMapper();

		/**
		 * The meta object literal for the '<em><b>Domain Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAPPER__DOMAIN_OBJECT = eINSTANCE.getDataMapper_DomainObject();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MAPPER__DTO = eINSTANCE.getDataMapper_Dto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MAPPER__NAME = eINSTANCE.getDataMapper_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.BasicTypeImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.CommandEventImpl <em>Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.CommandEventImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getCommandEvent()
		 * @generated
		 */
		EClass COMMAND_EVENT = eINSTANCE.getCommandEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.DomainObjectImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__PROPERTIES = eINSTANCE.getDomainObject_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__NAME = eINSTANCE.getDomainObject_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__ABSTRACT = eINSTANCE.getDomainObject_Abstract();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__AGGREGATE_ROOT = eINSTANCE.getDomainObject_AggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__RELATIONS = eINSTANCE.getDomainObject_Relations();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__INHERITANCE = eINSTANCE.getDomainObject_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__REPOSITORY = eINSTANCE.getDomainObject_Repository();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__OPERATIONS = eINSTANCE.getDomainObject_Operations();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__AGGREGATE = eINSTANCE.getDomainObject_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__PACKAGE = eINSTANCE.getDomainObject_Package();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__GAP_CLASS = eINSTANCE.getDomainObject_GapClass();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__CACHE = eINSTANCE.getDomainObject_Cache();

		/**
		 * The meta object literal for the '<em><b>Optimistic Locking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__OPTIMISTIC_LOCKING = eINSTANCE.getDomainObject_OptimisticLocking();

		/**
		 * The meta object literal for the '<em><b>Database Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__DATABASE_TABLE = eINSTANCE.getDomainObject_DatabaseTable();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__VALIDATE = eINSTANCE.getDomainObject_Validate();

		/**
		 * The meta object literal for the '<em><b>Discriminator Column Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE = eINSTANCE.getDomainObject_DiscriminatorColumnValue();

		/**
		 * The meta object literal for the '<em><b>Scaffold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__SCAFFOLD = eINSTANCE.getDomainObject_Scaffold();

		/**
		 * The meta object literal for the '<em><b>Generated By JHipster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__GENERATED_BY_JHIPSTER = eINSTANCE.getDomainObject_GeneratedByJHipster();

		/**
		 * The meta object literal for the '<em><b>Generated By Sculptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__GENERATED_BY_SCULPTOR = eINSTANCE.getDomainObject_GeneratedBySculptor();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.EnumerationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.AggregateImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Domainobjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__DOMAINOBJECTS = eINSTANCE.getAggregate_Domainobjects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE__NAME = eINSTANCE.getAggregate_Name();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__MODULE = eINSTANCE.getAggregate_Module();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__AGGREGATE_ROOT = eINSTANCE.getAggregate_AggregateRoot();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.DTOImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.EventImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.DomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.DomainEventImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDomainEvent()
		 * @generated
		 */
		EClass DOMAIN_EVENT = eINSTANCE.getDomainEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.PathImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__RELATIVE_PATH = eINSTANCE.getPath_RelativePath();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.RepositoryImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__OPERATIONS = eINSTANCE.getRepository_Operations();

		/**
		 * The meta object literal for the '<em><b>Repository Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__REPOSITORY_DEPENDENCIES = eINSTANCE.getRepository_RepositoryDependencies();

		/**
		 * The meta object literal for the '<em><b>Other Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OTHER_DEPENDENCIES = eINSTANCE.getRepository_OtherDependencies();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SUBSCRIBE = eINSTANCE.getRepository_Subscribe();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__AGGREGATE_ROOT = eINSTANCE.getRepository_AggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GAP_CLASS = eINSTANCE.getRepository_GapClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ResourceOperationImpl <em>Resource Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ResourceOperationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getResourceOperation()
		 * @generated
		 */
		EClass RESOURCE_OPERATION = eINSTANCE.getResourceOperation();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_OPERATION__RESOURCE = eINSTANCE.getResourceOperation_Resource();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OPERATION__HTTP_METHOD = eINSTANCE.getResourceOperation_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_OPERATION__DELEGATE = eINSTANCE.getResourceOperation_Delegate();

		/**
		 * The meta object literal for the '<em><b>Return String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OPERATION__RETURN_STRING = eINSTANCE.getResourceOperation_ReturnString();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_OPERATION__PATH = eINSTANCE.getResourceOperation_Path();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_OPERATION__CONTENT_TYPE = eINSTANCE.getResourceOperation_ContentType();

		/**
		 * The meta object literal for the '<em><b>Resource Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_OPERATION__RESOURCE_PARAMS = eINSTANCE.getResourceOperation_ResourceParams();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ResourceImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SERVICE_DEPENDENCIES = eINSTANCE.getResource_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OPERATIONS = eINSTANCE.getResource_Operations();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PATH = eINSTANCE.getResource_Path();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__GAP_CLASS = eINSTANCE.getResource_GapClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MODULE = eINSTANCE.getResource_Module();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PERMISSIONS = eINSTANCE.getResource_Permissions();

		/**
		 * The meta object literal for the '<em><b>Inputrepresentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__INPUTREPRESENTATION = eINSTANCE.getResource_Inputrepresentation();

		/**
		 * The meta object literal for the '<em><b>Outputrepresentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OUTPUTREPRESENTATION = eINSTANCE.getResource_Outputrepresentation();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ServiceOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ServiceOperationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getServiceOperation()
		 * @generated
		 */
		EClass SERVICE_OPERATION = eINSTANCE.getServiceOperation();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION__SERVICE = eINSTANCE.getServiceOperation_Service();

		/**
		 * The meta object literal for the '<em><b>Service Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION__SERVICE_DELEGATE = eINSTANCE.getServiceOperation_ServiceDelegate();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OPERATION__DELEGATE = eINSTANCE.getServiceOperation_Delegate();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.RepositoryOperationImpl <em>Repository Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.RepositoryOperationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRepositoryOperation()
		 * @generated
		 */
		EClass REPOSITORY_OPERATION = eINSTANCE.getRepositoryOperation();

		/**
		 * The meta object literal for the '<em><b>Delegate To Access Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT = eINSTANCE.getRepositoryOperation_DelegateToAccessObject();

		/**
		 * The meta object literal for the '<em><b>Access Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__ACCESS_OBJECT_NAME = eINSTANCE.getRepositoryOperation_AccessObjectName();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OPERATION__REPOSITORY = eINSTANCE.getRepositoryOperation_Repository();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__QUERY = eINSTANCE.getRepositoryOperation_Query();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__SELECT = eINSTANCE.getRepositoryOperation_Select();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OPERATION__CONDITION = eINSTANCE.getRepositoryOperation_Condition();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.DomainObjectOperationImpl <em>Domain Object Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.DomainObjectOperationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDomainObjectOperation()
		 * @generated
		 */
		EClass DOMAIN_OBJECT_OPERATION = eINSTANCE.getDomainObjectOperation();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT_OPERATION__ABSTRACT = eINSTANCE.getDomainObjectOperation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Domainobject</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT_OPERATION__DOMAINOBJECT = eINSTANCE.getDomainObjectOperation_Domainobject();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ConsumerImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '<em><b>Repository Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__REPOSITORY_DEPENDENCIES = eINSTANCE.getConsumer_RepositoryDependencies();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__SERVICE_DEPENDENCIES = eINSTANCE.getConsumer_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER__CHANNEL = eINSTANCE.getConsumer_Channel();

		/**
		 * The meta object literal for the '<em><b>Other Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMER__OTHER_DEPENDENCIES = eINSTANCE.getConsumer_OtherDependencies();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__SUBSCRIBE = eINSTANCE.getConsumer_Subscribe();

		/**
		 * The meta object literal for the '<em><b>Message Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__MESSAGE_ROOT = eINSTANCE.getConsumer_MessageRoot();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.SubscribeImpl <em>Subscribe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.SubscribeImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getSubscribe()
		 * @generated
		 */
		EClass SUBSCRIBE = eINSTANCE.getSubscribe();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__EVENT_BUS = eINSTANCE.getSubscribe_EventBus();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__TOPIC = eINSTANCE.getSubscribe_Topic();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ServiceImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OPERATIONS = eINSTANCE.getService_Operations();

		/**
		 * The meta object literal for the '<em><b>Repository Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REPOSITORY_DEPENDENCIES = eINSTANCE.getService_RepositoryDependencies();

		/**
		 * The meta object literal for the '<em><b>Other Dependencies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__OTHER_DEPENDENCIES = eINSTANCE.getService_OtherDependencies();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_DEPENDENCIES = eINSTANCE.getService_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Web Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__WEB_SERVICE = eINSTANCE.getService_WebService();

		/**
		 * The meta object literal for the '<em><b>Remote Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__REMOTE_INTERFACE = eINSTANCE.getService_RemoteInterface();

		/**
		 * The meta object literal for the '<em><b>Local Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__LOCAL_INTERFACE = eINSTANCE.getService_LocalInterface();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUBSCRIBE = eINSTANCE.getService_Subscribe();

		/**
		 * The meta object literal for the '<em><b>Gap Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__GAP_CLASS = eINSTANCE.getService_GapClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__MODULE = eINSTANCE.getService_Module();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.OperationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__THROWS = eINSTANCE.getOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VISIBILITY = eINSTANCE.getOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PUBLISH = eINSTANCE.getOperation_Publish();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURNTYPE = eINSTANCE.getOperation_Returntype();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.PublishImpl <em>Publish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.PublishImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPublish()
		 * @generated
		 */
		EClass PUBLISH = eINSTANCE.getPublish();

		/**
		 * The meta object literal for the '<em><b>Event Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH__EVENT_BUS = eINSTANCE.getPublish_EventBus();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH__TOPIC = eINSTANCE.getPublish_Topic();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISH__EVENT_TYPE = eINSTANCE.getPublish_EventType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ParameterImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ComplexTypeImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__TYPE = eINSTANCE.getComplexType_Type();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__COLLECTION = eINSTANCE.getComplexType_Collection();

		/**
		 * The meta object literal for the '<em><b>Mapped Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__MAPPED_TYPE = eINSTANCE.getComplexType_MappedType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.SimpleTypeImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__TYPE_NAME = eINSTANCE.getSimpleType_TypeName();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ModuleImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__EXTERNAL = eINSTANCE.getModule_External();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__BASE_PACKAGE = eINSTANCE.getModule_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PERSISTENCE_UNIT = eINSTANCE.getModule_PersistenceUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Aggregates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__AGGREGATES = eINSTANCE.getModule_Aggregates();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__APPLICATION = eINSTANCE.getModule_Application();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SERVICES = eINSTANCE.getModule_Services();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RESOURCES = eINSTANCE.getModule_Resources();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.HasAnyAuthoritiesImpl <em>Has Any Authorities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.HasAnyAuthoritiesImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getHasAnyAuthorities()
		 * @generated
		 */
		EClass HAS_ANY_AUTHORITIES = eINSTANCE.getHasAnyAuthorities();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_ANY_AUTHORITIES__ROLES = eINSTANCE.getHasAnyAuthorities_Roles();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.HasAuthorityImpl <em>Has Authority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.HasAuthorityImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getHasAuthority()
		 * @generated
		 */
		EClass HAS_AUTHORITY = eINSTANCE.getHasAuthority();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_AUTHORITY__ROLE = eINSTANCE.getHasAuthority_Role();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.AuthenticatedImpl <em>Authenticated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.AuthenticatedImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAuthenticated()
		 * @generated
		 */
		EClass AUTHENTICATED = eINSTANCE.getAuthenticated();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.AccessImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAccess()
		 * @generated
		 */
		EClass ACCESS = eINSTANCE.getAccess();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS__ACCESS = eINSTANCE.getAccess_Access();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.PermitAllImpl <em>Permit All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.PermitAllImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPermitAll()
		 * @generated
		 */
		EClass PERMIT_ALL = eINSTANCE.getPermitAll();

		/**
		 * The meta object literal for the '<em><b>With All Subresources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_ALL__WITH_ALL_SUBRESOURCES = eINSTANCE.getPermitAll_WithAllSubresources();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.RoleImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__APPLICATION = eINSTANCE.getRole_Application();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.PermissionImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.ResourceParamImpl <em>Resource Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.ResourceParamImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getResourceParam()
		 * @generated
		 */
		EClass RESOURCE_PARAM = eINSTANCE.getResourceParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PARAM__NAME = eINSTANCE.getResourceParam_Name();

		/**
		 * The meta object literal for the '<em><b>Query Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PARAM__QUERY_TYPE = eINSTANCE.getResourceParam_QueryType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.OutputRepresentationImpl <em>Output Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.OutputRepresentationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getOutputRepresentation()
		 * @generated
		 */
		EClass OUTPUT_REPRESENTATION = eINSTANCE.getOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Output Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE = eINSTANCE.getOutputRepresentation_OutputMediaType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.impl.InputRepresentationImpl <em>Input Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.impl.InputRepresentationImpl
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getInputRepresentation()
		 * @generated
		 */
		EClass INPUT_REPRESENTATION = eINSTANCE.getInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Input Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REPRESENTATION__INPUT_MEDIA_TYPE = eINSTANCE.getInputRepresentation_InputMediaType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.Multiplicity
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.DefaultType <em>Default Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.DefaultType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDefaultType()
		 * @generated
		 */
		EEnum DEFAULT_TYPE = eINSTANCE.getDefaultType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.HttpMethod
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.RelationType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.InheritanceType <em>Inheritance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.InheritanceType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getInheritanceType()
		 * @generated
		 */
		EEnum INHERITANCE_TYPE = eINSTANCE.getInheritanceType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.DiscriminatorType <em>Discriminator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.DiscriminatorType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getDiscriminatorType()
		 * @generated
		 */
		EEnum DISCRIMINATOR_TYPE = eINSTANCE.getDiscriminatorType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.CollectionType <em>Collection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.CollectionType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getCollectionType()
		 * @generated
		 */
		EEnum COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.ArchitectureType <em>Architecture Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.ArchitectureType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getArchitectureType()
		 * @generated
		 */
		EEnum ARCHITECTURE_TYPE = eINSTANCE.getArchitectureType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.AuthenticationType <em>Authentication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.AuthenticationType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getAuthenticationType()
		 * @generated
		 */
		EEnum AUTHENTICATION_TYPE = eINSTANCE.getAuthenticationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.QueryType <em>Query Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.QueryType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getQueryType()
		 * @generated
		 */
		EEnum QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.ApplicationType <em>Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.ApplicationType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getApplicationType()
		 * @generated
		 */
		EEnum APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.service.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.service.MediaType
		 * @see com.github.icelyframework.service.impl.ServicePackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

	}

} //ServicePackage
