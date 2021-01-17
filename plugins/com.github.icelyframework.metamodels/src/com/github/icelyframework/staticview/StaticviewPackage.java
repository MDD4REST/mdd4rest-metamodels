/**
 */
package com.github.icelyframework.staticview;

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
 * @see com.github.icelyframework.staticview.StaticviewFactory
 * @model kind="package"
 * @generated
 */
public interface StaticviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "staticview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/icelyframework/static";

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
	StaticviewPackage eINSTANCE = com.github.icelyframework.staticview.impl.StaticviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.ResourceImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Related Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_RELATED_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Is Related Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_RELATED_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__AGGREGATE = 3;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SIMPLE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH_NAME = 5;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.PropertyImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = 0;

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
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_REQUIRED = 3;

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
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.ProjectImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Has Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HAS_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PRIMITIVE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.RelationImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CASCADE = 3;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ORDER_BY = 4;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VISIBILITY = 5;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REQUIRED = 6;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NULLABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 8;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPPOSITE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.ApplicationImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Has Aggregate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_AGGREGATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Complextypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__COMPLEXTYPES = 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.TypeDefinitionImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 5;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.SimpleTypeImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 20;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.DomainObjectImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__TYPE_NAME = SIMPLE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__HAS_PROPERTY = SIMPLE_TYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__HAS_RELATION = SIMPLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__AGGREGATE = SIMPLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__EXTENDS = SIMPLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__SCAFFOLD = SIMPLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.EnumerationImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HAS_PROPERTY = DOMAIN_OBJECT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HAS_RELATION = DOMAIN_OBJECT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SCAFFOLD = DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The feature id for the '<em><b>Has Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HAS_LITERAL = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.ValueObjectImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__HAS_PROPERTY = DOMAIN_OBJECT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__HAS_RELATION = DOMAIN_OBJECT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__SCAFFOLD = DOMAIN_OBJECT__SCAFFOLD;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.BasicTypeImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__HAS_PROPERTY = VALUE_OBJECT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__HAS_RELATION = VALUE_OBJECT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__EXTENDS = VALUE_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__SCAFFOLD = VALUE_OBJECT__SCAFFOLD;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.LiteralImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 8;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.EntityImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HAS_PROPERTY = DOMAIN_OBJECT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HAS_RELATION = DOMAIN_OBJECT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS = DOMAIN_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SCAFFOLD = DOMAIN_OBJECT__SCAFFOLD;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.DTOImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__HAS_PROPERTY = VALUE_OBJECT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__HAS_RELATION = VALUE_OBJECT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__EXTENDS = VALUE_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__SCAFFOLD = VALUE_OBJECT__SCAFFOLD;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.AggregateImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 13;

	/**
	 * The feature id for the '<em><b>Has Domainobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__HAS_DOMAINOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Has Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__HAS_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__AGGREGATE_ROOT = 4;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.SingletonResourceImpl <em>Singleton Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.SingletonResourceImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getSingletonResource()
	 * @generated
	 */
	int SINGLETON_RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Has Related Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__HAS_RELATED_RESOURCE = RESOURCE__HAS_RELATED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Is Related Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__IS_RELATED_RESOURCE = RESOURCE__IS_RELATED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__AGGREGATE = RESOURCE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__SIMPLE_NAME = RESOURCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__PATH_NAME = RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Lookup Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__LOOKUP_FIELD = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Singleton Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.EventImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 15;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HAS_PROPERTY = VALUE_OBJECT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HAS_RELATION = VALUE_OBJECT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENDS = VALUE_OBJECT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SCAFFOLD = VALUE_OBJECT__SCAFFOLD;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.CommandEventImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getCommandEvent()
	 * @generated
	 */
	int COMMAND_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__TYPE_NAME = EVENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__HAS_PROPERTY = EVENT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__HAS_RELATION = EVENT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__AGGREGATE = EVENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__EXTENDS = EVENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__SCAFFOLD = EVENT__SCAFFOLD;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.DomainEventImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__TYPE_NAME = EVENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__HAS_PROPERTY = EVENT__HAS_PROPERTY;

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
	 * The feature id for the '<em><b>Has Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__HAS_RELATION = EVENT__HAS_RELATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__AGGREGATE = EVENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__EXTENDS = EVENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__SCAFFOLD = EVENT__SCAFFOLD;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.PrimitiveTypeImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 18;

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
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.CollectionResourceImpl <em>Collection Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.CollectionResourceImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getCollectionResource()
	 * @generated
	 */
	int COLLECTION_RESOURCE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Has Related Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__HAS_RELATED_RESOURCE = RESOURCE__HAS_RELATED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Is Related Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__IS_RELATED_RESOURCE = RESOURCE__IS_RELATED_RESOURCE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__AGGREGATE = RESOURCE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__SIMPLE_NAME = RESOURCE__SIMPLE_NAME;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__PATH_NAME = RESOURCE__PATH_NAME;

	/**
	 * The number of structural features of the '<em>Collection Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.impl.ComplexTypeImpl
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.Multiplicity
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 22;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.staticview.DefaultType <em>Default Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.staticview.DefaultType
	 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDefaultType()
	 * @generated
	 */
	int DEFAULT_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.github.icelyframework.staticview.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.staticview.Resource#getHasRelatedResource <em>Has Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Resource</em>'.
	 * @see com.github.icelyframework.staticview.Resource#getHasRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasRelatedResource();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.Resource#getIsRelatedResource <em>Is Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Related Resource</em>'.
	 * @see com.github.icelyframework.staticview.Resource#getIsRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_IsRelatedResource();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.staticview.Resource#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.staticview.Resource#getAggregate()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Aggregate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Resource#getSimpleName <em>Simple Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Name</em>'.
	 * @see com.github.icelyframework.staticview.Resource#getSimpleName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_SimpleName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Resource#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see com.github.icelyframework.staticview.Resource#getPathName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_PathName();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.github.icelyframework.staticview.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Property#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see com.github.icelyframework.staticview.Property#isIsUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Property#isIsNamingProperty <em>Is Naming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Naming Property</em>'.
	 * @see com.github.icelyframework.staticview.Property#isIsNamingProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsNamingProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Property#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see com.github.icelyframework.staticview.Property#isIsRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Property#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.github.icelyframework.staticview.Property#getMin()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Property#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.github.icelyframework.staticview.Property#getMax()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Max();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.staticview.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.github.icelyframework.staticview.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Project#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.github.icelyframework.staticview.Project#getBasePath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePath();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Project#getHasApplication <em>Has Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Application</em>'.
	 * @see com.github.icelyframework.staticview.Project#getHasApplication()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_HasApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Project#getPrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
	 * @see com.github.icelyframework.staticview.Project#getPrimitiveTypes()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_PrimitiveTypes();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see com.github.icelyframework.staticview.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getMultiplicity()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.staticview.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascade</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getCascade()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getOrderBy()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_OrderBy();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getVisibility()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.github.icelyframework.staticview.Relation#isRequired()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see com.github.icelyframework.staticview.Relation#isNullable()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.Relation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getOpposite()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Opposite();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.staticview.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.github.icelyframework.staticview.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Application#getHasAggregate <em>Has Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Aggregate</em>'.
	 * @see com.github.icelyframework.staticview.Application#getHasAggregate()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasAggregate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.staticview.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.github.icelyframework.staticview.Application#getProject()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Application#getComplextypes <em>Complextypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complextypes</em>'.
	 * @see com.github.icelyframework.staticview.Application#getComplextypes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Complextypes();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see com.github.icelyframework.staticview.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see com.github.icelyframework.staticview.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Enumeration#getHasLiteral <em>Has Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Literal</em>'.
	 * @see com.github.icelyframework.staticview.Enumeration#getHasLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_HasLiteral();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see com.github.icelyframework.staticview.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.github.icelyframework.staticview.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Literal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Literal#getName()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.github.icelyframework.staticview.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.github.icelyframework.staticview.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see com.github.icelyframework.staticview.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.DomainObject#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#getHasProperty()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_HasProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.DomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#getName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.DomainObject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#isAbstract()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.DomainObject#isAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#isAggregateRoot()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_AggregateRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.DomainObject#getHasRelation <em>Has Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relation</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#getHasRelation()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_HasRelation();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.staticview.DomainObject#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#getAggregate()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Aggregate();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.DomainObject#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#getExtends()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Extends();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.DomainObject#isScaffold <em>Scaffold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaffold</em>'.
	 * @see com.github.icelyframework.staticview.DomainObject#isScaffold()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Scaffold();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see com.github.icelyframework.staticview.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.ValueObject#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see com.github.icelyframework.staticview.ValueObject#isImmutable()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Immutable();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.ValueObject#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see com.github.icelyframework.staticview.ValueObject#isPersistent()
	 * @see #getValueObject()
	 * @generated
	 */
	EAttribute getValueObject_Persistent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.staticview.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Aggregate#getHasDomainobject <em>Has Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Domainobject</em>'.
	 * @see com.github.icelyframework.staticview.Aggregate#getHasDomainobject()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_HasDomainobject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.Aggregate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.staticview.Aggregate#getName()
	 * @see #getAggregate()
	 * @generated
	 */
	EAttribute getAggregate_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.staticview.Aggregate#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.staticview.Aggregate#getApplication()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.staticview.Aggregate#getHasResource <em>Has Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource</em>'.
	 * @see com.github.icelyframework.staticview.Aggregate#getHasResource()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_HasResource();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.Aggregate#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.staticview.Aggregate#getAggregateRoot()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_AggregateRoot();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.SingletonResource <em>Singleton Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Resource</em>'.
	 * @see com.github.icelyframework.staticview.SingletonResource
	 * @generated
	 */
	EClass getSingletonResource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.SingletonResource#getLookupField <em>Lookup Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lookup Field</em>'.
	 * @see com.github.icelyframework.staticview.SingletonResource#getLookupField()
	 * @see #getSingletonResource()
	 * @generated
	 */
	EAttribute getSingletonResource_LookupField();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.github.icelyframework.staticview.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Event</em>'.
	 * @see com.github.icelyframework.staticview.CommandEvent
	 * @generated
	 */
	EClass getCommandEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see com.github.icelyframework.staticview.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see com.github.icelyframework.staticview.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.icelyframework.staticview.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.CollectionResource <em>Collection Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Resource</em>'.
	 * @see com.github.icelyframework.staticview.CollectionResource
	 * @generated
	 */
	EClass getCollectionResource();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see com.github.icelyframework.staticview.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.staticview.SimpleType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see com.github.icelyframework.staticview.SimpleType#getTypeName()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_TypeName();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.staticview.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see com.github.icelyframework.staticview.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.staticview.ComplexType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.staticview.ComplexType#getType()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Type();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.staticview.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see com.github.icelyframework.staticview.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.staticview.DefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Type</em>'.
	 * @see com.github.icelyframework.staticview.DefaultType
	 * @generated
	 */
	EEnum getDefaultType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaticviewFactory getStaticviewFactory();

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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.ResourceImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Has Related Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_RELATED_RESOURCE = eINSTANCE.getResource_HasRelatedResource();

		/**
		 * The meta object literal for the '<em><b>Is Related Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__IS_RELATED_RESOURCE = eINSTANCE.getResource_IsRelatedResource();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__AGGREGATE = eINSTANCE.getResource_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Simple Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__SIMPLE_NAME = eINSTANCE.getResource_SimpleName();

		/**
		 * The meta object literal for the '<em><b>Path Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PATH_NAME = eINSTANCE.getResource_PathName();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.PropertyImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_UNIQUE = eINSTANCE.getProperty_IsUnique();

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
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_REQUIRED = eINSTANCE.getProperty_IsRequired();

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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.ProjectImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

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
		 * The meta object literal for the '<em><b>Has Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__HAS_APPLICATION = eINSTANCE.getProject_HasApplication();

		/**
		 * The meta object literal for the '<em><b>Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PRIMITIVE_TYPES = eINSTANCE.getProject_PrimitiveTypes();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.RelationImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICITY = eINSTANCE.getRelation_Multiplicity();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPPOSITE = eINSTANCE.getRelation_Opposite();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.ApplicationImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Has Aggregate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_AGGREGATE = eINSTANCE.getApplication_HasAggregate();

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
		 * The meta object literal for the '<em><b>Complextypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__COMPLEXTYPES = eINSTANCE.getApplication_Complextypes();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.TypeDefinitionImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.EnumerationImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Has Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__HAS_LITERAL = eINSTANCE.getEnumeration_HasLiteral();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.BasicTypeImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.LiteralImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.EntityImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.DTOImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.DomainObjectImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__HAS_PROPERTY = eINSTANCE.getDomainObject_HasProperty();

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
		 * The meta object literal for the '<em><b>Has Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__HAS_RELATION = eINSTANCE.getDomainObject_HasRelation();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__AGGREGATE = eINSTANCE.getDomainObject_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__EXTENDS = eINSTANCE.getDomainObject_Extends();

		/**
		 * The meta object literal for the '<em><b>Scaffold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__SCAFFOLD = eINSTANCE.getDomainObject_Scaffold();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.ValueObjectImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getValueObject()
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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.AggregateImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Has Domainobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__HAS_DOMAINOBJECT = eINSTANCE.getAggregate_HasDomainobject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE__NAME = eINSTANCE.getAggregate_Name();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__APPLICATION = eINSTANCE.getAggregate_Application();

		/**
		 * The meta object literal for the '<em><b>Has Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__HAS_RESOURCE = eINSTANCE.getAggregate_HasResource();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__AGGREGATE_ROOT = eINSTANCE.getAggregate_AggregateRoot();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.SingletonResourceImpl <em>Singleton Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.SingletonResourceImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getSingletonResource()
		 * @generated
		 */
		EClass SINGLETON_RESOURCE = eINSTANCE.getSingletonResource();

		/**
		 * The meta object literal for the '<em><b>Lookup Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLETON_RESOURCE__LOOKUP_FIELD = eINSTANCE.getSingletonResource_LookupField();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.EventImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.CommandEventImpl <em>Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.CommandEventImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getCommandEvent()
		 * @generated
		 */
		EClass COMMAND_EVENT = eINSTANCE.getCommandEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.DomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.DomainEventImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDomainEvent()
		 * @generated
		 */
		EClass DOMAIN_EVENT = eINSTANCE.getDomainEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.PrimitiveTypeImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getPrimitiveType()
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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.CollectionResourceImpl <em>Collection Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.CollectionResourceImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getCollectionResource()
		 * @generated
		 */
		EClass COLLECTION_RESOURCE = eINSTANCE.getCollectionResource();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.SimpleTypeImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getSimpleType()
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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.impl.ComplexTypeImpl
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getComplexType()
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
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.Multiplicity
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.staticview.DefaultType <em>Default Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.staticview.DefaultType
		 * @see com.github.icelyframework.staticview.impl.StaticviewPackageImpl#getDefaultType()
		 * @generated
		 */
		EEnum DEFAULT_TYPE = eINSTANCE.getDefaultType();

	}

} //StaticviewPackage
