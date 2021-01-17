/**
 */
package com.github.icelyframework.dynamicview;

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
 * @see com.github.icelyframework.dynamicview.DynamicviewFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicviewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamicview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/icelyframework/dynamic";

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
	DynamicviewPackage eINSTANCE = com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ResourceImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getResource()
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
	 * The feature id for the '<em><b>Read Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__READ_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Create Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CREATE_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Delete Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DELETE_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Other Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OTHER_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__AGGREGATE = 7;

	/**
	 * The feature id for the '<em><b>Has Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH_NAME = 9;

	/**
	 * The feature id for the '<em><b>Has Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_PERMISSION = 10;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ApplicationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getApplication()
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
	 * The feature id for the '<em><b>Has Aggregate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_AGGREGATE = 1;

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
	 * The feature id for the '<em><b>Has Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_ROLE = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.OperationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PUBLISH = 1;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__HAS_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURNTYPE = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ResourceActivityImpl <em>Resource Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ResourceActivityImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getResourceActivity()
	 * @generated
	 */
	int RESOURCE_ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__HAS_PARAMETER = OPERATION__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__RETURNTYPE = OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__TRIGGER = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__RESOURCE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY__PATH_NAME = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACTIVITY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.CreateImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = RESOURCE_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__PUBLISH = RESOURCE_ACTIVITY__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__HAS_PARAMETER = RESOURCE_ACTIVITY__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__RETURNTYPE = RESOURCE_ACTIVITY__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TRIGGER = RESOURCE_ACTIVITY__TRIGGER;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__RESOURCE = RESOURCE_ACTIVITY__RESOURCE;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__PATH_NAME = RESOURCE_ACTIVITY__PATH_NAME;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = RESOURCE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ReadImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getRead()
	 * @generated
	 */
	int READ = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__NAME = RESOURCE_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__PUBLISH = RESOURCE_ACTIVITY__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__HAS_PARAMETER = RESOURCE_ACTIVITY__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__RETURNTYPE = RESOURCE_ACTIVITY__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__TRIGGER = RESOURCE_ACTIVITY__TRIGGER;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__RESOURCE = RESOURCE_ACTIVITY__RESOURCE;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__PATH_NAME = RESOURCE_ACTIVITY__PATH_NAME;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = RESOURCE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.OtherImpl <em>Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.OtherImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getOther()
	 * @generated
	 */
	int OTHER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__NAME = RESOURCE_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__PUBLISH = RESOURCE_ACTIVITY__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__HAS_PARAMETER = RESOURCE_ACTIVITY__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__RETURNTYPE = RESOURCE_ACTIVITY__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__TRIGGER = RESOURCE_ACTIVITY__TRIGGER;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__RESOURCE = RESOURCE_ACTIVITY__RESOURCE;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__PATH_NAME = RESOURCE_ACTIVITY__PATH_NAME;

	/**
	 * The number of structural features of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FEATURE_COUNT = RESOURCE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.DeleteImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME = RESOURCE_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PUBLISH = RESOURCE_ACTIVITY__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__HAS_PARAMETER = RESOURCE_ACTIVITY__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__RETURNTYPE = RESOURCE_ACTIVITY__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TRIGGER = RESOURCE_ACTIVITY__TRIGGER;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__RESOURCE = RESOURCE_ACTIVITY__RESOURCE;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PATH_NAME = RESOURCE_ACTIVITY__PATH_NAME;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = RESOURCE_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.SingletonResourceImpl <em>Singleton Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.SingletonResourceImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getSingletonResource()
	 * @generated
	 */
	int SINGLETON_RESOURCE = 8;

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
	 * The feature id for the '<em><b>Read Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__READ_ACTIVITY = RESOURCE__READ_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Create Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__CREATE_ACTIVITY = RESOURCE__CREATE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Delete Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__DELETE_ACTIVITY = RESOURCE__DELETE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Other Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__OTHER_ACTIVITIES = RESOURCE__OTHER_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__AGGREGATE = RESOURCE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Has Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__HAS_ACTIVITY = RESOURCE__HAS_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__PATH_NAME = RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Has Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLETON_RESOURCE__HAS_PERMISSION = RESOURCE__HAS_PERMISSION;

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
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.TypeDefinitionImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 22;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.SimpleTypeImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 31;

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
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.PrimitiveTypeImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 9;

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
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.DomainObjectImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 25;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__TYPE_NAME = SIMPLE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = SIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__AGGREGATE_ROOT = SIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__HAS_OPERATION = SIMPLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__AGGREGATE = SIMPLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ValueObjectImpl <em>Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ValueObjectImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getValueObject()
	 * @generated
	 */
	int VALUE_OBJECT = 27;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__HAS_OPERATION = DOMAIN_OBJECT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.EventImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__HAS_OPERATION = VALUE_OBJECT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.PublishImpl <em>Publish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.PublishImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPublish()
	 * @generated
	 */
	int PUBLISH = 11;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH__EVENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Publish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.CommandEventImpl <em>Command Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.CommandEventImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCommandEvent()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__AGGREGATE_ROOT = EVENT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__HAS_OPERATION = EVENT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT__AGGREGATE = EVENT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Command Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.DomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.DomainEventImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDomainEvent()
	 * @generated
	 */
	int DOMAIN_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__TYPE_NAME = EVENT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__AGGREGATE_ROOT = EVENT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__HAS_OPERATION = EVENT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT__AGGREGATE = EVENT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.DomainObjectOperationImpl <em>Domain Object Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.DomainObjectOperationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDomainObjectOperation()
	 * @generated
	 */
	int DOMAIN_OBJECT_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_OPERATION__HAS_PARAMETER = OPERATION__HAS_PARAMETER;

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
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.PolicyImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 15;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__EVENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ProcessOperationImpl <em>Process Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ProcessOperationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getProcessOperation()
	 * @generated
	 */
	int PROCESS_OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__PUBLISH = OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__HAS_PARAMETER = OPERATION__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__RETURNTYPE = OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__DELEGATE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__POLICY = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION__PROCESS = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.CommandOperationImpl <em>Command Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.CommandOperationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCommandOperation()
	 * @generated
	 */
	int COMMAND_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__NAME = PROCESS_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__PUBLISH = PROCESS_OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__HAS_PARAMETER = PROCESS_OPERATION__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__RETURNTYPE = PROCESS_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__DELEGATE = PROCESS_OPERATION__DELEGATE;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__POLICY = PROCESS_OPERATION__POLICY;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION__PROCESS = PROCESS_OPERATION__PROCESS;

	/**
	 * The number of structural features of the '<em>Command Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_FEATURE_COUNT = PROCESS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.QueryOperationImpl <em>Query Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.QueryOperationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getQueryOperation()
	 * @generated
	 */
	int QUERY_OPERATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__NAME = PROCESS_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__PUBLISH = PROCESS_OPERATION__PUBLISH;

	/**
	 * The feature id for the '<em><b>Has Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__HAS_PARAMETER = PROCESS_OPERATION__HAS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__RETURNTYPE = PROCESS_OPERATION__RETURNTYPE;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__DELEGATE = PROCESS_OPERATION__DELEGATE;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__POLICY = PROCESS_OPERATION__POLICY;

	/**
	 * The feature id for the '<em><b>Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION__PROCESS = PROCESS_OPERATION__PROCESS;

	/**
	 * The number of structural features of the '<em>Query Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_FEATURE_COUNT = PROCESS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ProcessImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 19;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__HAS_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AGGREGATE = 2;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ProjectImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 20;

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
	 * The feature id for the '<em><b>Authentication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTHENTICATION_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.CollectionResourceImpl <em>Collection Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.CollectionResourceImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCollectionResource()
	 * @generated
	 */
	int COLLECTION_RESOURCE = 21;

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
	 * The feature id for the '<em><b>Read Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__READ_ACTIVITY = RESOURCE__READ_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Create Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__CREATE_ACTIVITY = RESOURCE__CREATE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Delete Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__DELETE_ACTIVITY = RESOURCE__DELETE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Other Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__OTHER_ACTIVITIES = RESOURCE__OTHER_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__AGGREGATE = RESOURCE__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Has Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__HAS_ACTIVITY = RESOURCE__HAS_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__PATH_NAME = RESOURCE__PATH_NAME;

	/**
	 * The feature id for the '<em><b>Has Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE__HAS_PERMISSION = RESOURCE__HAS_PERMISSION;

	/**
	 * The number of structural features of the '<em>Collection Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ParameterImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.AggregateImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__HAS_PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Domainobjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__DOMAINOBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Has Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__HAS_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__AGGREGATE_ROOT = 5;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.EntityImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 26;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HAS_OPERATION = DOMAIN_OBJECT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.DTOImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 28;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__HAS_OPERATION = VALUE_OBJECT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.EnumerationImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 29;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_NAME = DOMAIN_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__AGGREGATE_ROOT = DOMAIN_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HAS_OPERATION = DOMAIN_OBJECT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__AGGREGATE = DOMAIN_OBJECT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.BasicTypeImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TYPE_NAME = VALUE_OBJECT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__NAME = VALUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__AGGREGATE_ROOT = VALUE_OBJECT__AGGREGATE_ROOT;

	/**
	 * The feature id for the '<em><b>Has Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__HAS_OPERATION = VALUE_OBJECT__HAS_OPERATION;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__AGGREGATE = VALUE_OBJECT__AGGREGATE;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = VALUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.ComplexTypeImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getComplexType()
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
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.RoleImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 33;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__APPLICATION = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.PermissionImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 34;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.HasAuthorityImpl <em>Has Authority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.HasAuthorityImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getHasAuthority()
	 * @generated
	 */
	int HAS_AUTHORITY = 35;

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
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.AuthenticatedImpl <em>Authenticated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.AuthenticatedImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAuthenticated()
	 * @generated
	 */
	int AUTHENTICATED = 36;

	/**
	 * The number of structural features of the '<em>Authenticated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATED_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.PermitAllImpl <em>Permit All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.PermitAllImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPermitAll()
	 * @generated
	 */
	int PERMIT_ALL = 37;

	/**
	 * The feature id for the '<em><b>With All Subresource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_ALL__WITH_ALL_SUBRESOURCE = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Permit All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_ALL_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.HasAnyAuthoritiesImpl <em>Has Any Authorities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.HasAnyAuthoritiesImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getHasAnyAuthorities()
	 * @generated
	 */
	int HAS_ANY_AUTHORITIES = 38;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ANY_AUTHORITIES__ROLE = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Any Authorities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ANY_AUTHORITIES_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.impl.AccessImpl
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 39;

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
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.MediaType
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 40;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.DefaultType <em>Default Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.DefaultType
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDefaultType()
	 * @generated
	 */
	int DEFAULT_TYPE = 41;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.dynamicview.AuthenticationType <em>Authentication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.dynamicview.AuthenticationType
	 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAuthenticationType()
	 * @generated
	 */
	int AUTHENTICATION_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.dynamicview.Resource#getHasRelatedResource <em>Has Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getHasRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasRelatedResource();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Resource#getIsRelatedResource <em>Is Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Related Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getIsRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_IsRelatedResource();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Resource#getReadActivity <em>Read Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read Activity</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getReadActivity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ReadActivity();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Resource#getCreateActivity <em>Create Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Create Activity</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getCreateActivity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_CreateActivity();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Resource#getDeleteActivity <em>Delete Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delete Activity</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getDeleteActivity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_DeleteActivity();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.dynamicview.Resource#getOtherActivities <em>Other Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Other Activities</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getOtherActivities()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_OtherActivities();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.Resource#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getAggregate()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Aggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Resource#getHasActivity <em>Has Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Activity</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getHasActivity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasActivity();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Resource#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getPathName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_PathName();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Resource#getHasPermission <em>Has Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Permission</em>'.
	 * @see com.github.icelyframework.dynamicview.Resource#getHasPermission()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasPermission();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.github.icelyframework.dynamicview.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Application#getHasAggregate <em>Has Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Aggregate</em>'.
	 * @see com.github.icelyframework.dynamicview.Application#getHasAggregate()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasAggregate();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.github.icelyframework.dynamicview.Application#getProject()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Application#getComplextypes <em>Complextypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complextypes</em>'.
	 * @see com.github.icelyframework.dynamicview.Application#getComplextypes()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Complextypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Application#getHasRole <em>Has Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Role</em>'.
	 * @see com.github.icelyframework.dynamicview.Application#getHasRole()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasRole();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.ResourceActivity <em>Resource Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Activity</em>'.
	 * @see com.github.icelyframework.dynamicview.ResourceActivity
	 * @generated
	 */
	EClass getResourceActivity();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.ResourceActivity#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see com.github.icelyframework.dynamicview.ResourceActivity#getTrigger()
	 * @see #getResourceActivity()
	 * @generated
	 */
	EReference getResourceActivity_Trigger();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.ResourceActivity#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.ResourceActivity#getResource()
	 * @see #getResourceActivity()
	 * @generated
	 */
	EReference getResourceActivity_Resource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.ResourceActivity#getPathName <em>Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Name</em>'.
	 * @see com.github.icelyframework.dynamicview.ResourceActivity#getPathName()
	 * @see #getResourceActivity()
	 * @generated
	 */
	EAttribute getResourceActivity_PathName();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see com.github.icelyframework.dynamicview.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see com.github.icelyframework.dynamicview.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other</em>'.
	 * @see com.github.icelyframework.dynamicview.Other
	 * @generated
	 */
	EClass getOther();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see com.github.icelyframework.dynamicview.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.dynamicview.Operation#getPublish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish</em>'.
	 * @see com.github.icelyframework.dynamicview.Operation#getPublish()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Publish();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Operation#getHasParameter <em>Has Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Parameter</em>'.
	 * @see com.github.icelyframework.dynamicview.Operation#getHasParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_HasParameter();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Operation#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returntype</em>'.
	 * @see com.github.icelyframework.dynamicview.Operation#getReturntype()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Returntype();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.SingletonResource <em>Singleton Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.SingletonResource
	 * @generated
	 */
	EClass getSingletonResource();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.SingletonResource#getLookupField <em>Lookup Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lookup Field</em>'.
	 * @see com.github.icelyframework.dynamicview.SingletonResource#getLookupField()
	 * @see #getSingletonResource()
	 * @generated
	 */
	EAttribute getSingletonResource_LookupField();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see com.github.icelyframework.dynamicview.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.github.icelyframework.dynamicview.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.github.icelyframework.dynamicview.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Publish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publish</em>'.
	 * @see com.github.icelyframework.dynamicview.Publish
	 * @generated
	 */
	EClass getPublish();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Publish#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see com.github.icelyframework.dynamicview.Publish#getEventType()
	 * @see #getPublish()
	 * @generated
	 */
	EReference getPublish_EventType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Event</em>'.
	 * @see com.github.icelyframework.dynamicview.CommandEvent
	 * @generated
	 */
	EClass getCommandEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainEvent
	 * @generated
	 */
	EClass getDomainEvent();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.DomainObjectOperation <em>Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObjectOperation
	 * @generated
	 */
	EClass getDomainObjectOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.DomainObjectOperation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObjectOperation#isAbstract()
	 * @see #getDomainObjectOperation()
	 * @generated
	 */
	EAttribute getDomainObjectOperation_Abstract();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.DomainObjectOperation#getDomainobject <em>Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domainobject</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObjectOperation#getDomainobject()
	 * @see #getDomainObjectOperation()
	 * @generated
	 */
	EReference getDomainObjectOperation_Domainobject();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see com.github.icelyframework.dynamicview.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Policy#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see com.github.icelyframework.dynamicview.Policy#getEventType()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_EventType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Policy#getName()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.CommandOperation <em>Command Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.CommandOperation
	 * @generated
	 */
	EClass getCommandOperation();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.QueryOperation <em>Query Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.QueryOperation
	 * @generated
	 */
	EClass getQueryOperation();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.ProcessOperation <em>Process Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.ProcessOperation
	 * @generated
	 */
	EClass getProcessOperation();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.ProcessOperation#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate</em>'.
	 * @see com.github.icelyframework.dynamicview.ProcessOperation#getDelegate()
	 * @see #getProcessOperation()
	 * @generated
	 */
	EReference getProcessOperation_Delegate();

	/**
	 * Returns the meta object for the containment reference '{@link com.github.icelyframework.dynamicview.ProcessOperation#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy</em>'.
	 * @see com.github.icelyframework.dynamicview.ProcessOperation#getPolicy()
	 * @see #getProcessOperation()
	 * @generated
	 */
	EReference getProcessOperation_Policy();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.ProcessOperation#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process</em>'.
	 * @see com.github.icelyframework.dynamicview.ProcessOperation#getProcess()
	 * @see #getProcessOperation()
	 * @generated
	 */
	EReference getProcessOperation_Process();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see com.github.icelyframework.dynamicview.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Process#getHasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.Process#getHasOperation()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_HasOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.Process#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.dynamicview.Process#getAggregate()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Aggregate();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.github.icelyframework.dynamicview.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Project#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.github.icelyframework.dynamicview.Project#getBasePath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePath();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Project#getHasApplication <em>Has Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Application</em>'.
	 * @see com.github.icelyframework.dynamicview.Project#getHasApplication()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_HasApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Project#getPrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
	 * @see com.github.icelyframework.dynamicview.Project#getPrimitiveTypes()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_PrimitiveTypes();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Project#getAuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.dynamicview.Project#getAuthenticationType()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AuthenticationType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.CollectionResource <em>Collection Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.CollectionResource
	 * @generated
	 */
	EClass getCollectionResource();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see com.github.icelyframework.dynamicview.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.github.icelyframework.dynamicview.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.dynamicview.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Aggregate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate#getName()
	 * @see #getAggregate()
	 * @generated
	 */
	EAttribute getAggregate_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Aggregate#getHasProcess <em>Has Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Process</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate#getHasProcess()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_HasProcess();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.Aggregate#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate#getApplication()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Application();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Aggregate#getDomainobjects <em>Domainobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainobjects</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate#getDomainobjects()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Domainobjects();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.Aggregate#getHasResource <em>Has Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate#getHasResource()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_HasResource();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.Aggregate#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.dynamicview.Aggregate#getAggregateRoot()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_AggregateRoot();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.DomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObject#getName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.DomainObject#isAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Root</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObject#isAggregateRoot()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_AggregateRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.dynamicview.DomainObject#getHasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Operation</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObject#getHasOperation()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_HasOperation();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.DomainObject#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Aggregate</em>'.
	 * @see com.github.icelyframework.dynamicview.DomainObject#getAggregate()
	 * @see #getDomainObject()
	 * @generated
	 */
	EReference getDomainObject_Aggregate();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.github.icelyframework.dynamicview.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Object</em>'.
	 * @see com.github.icelyframework.dynamicview.ValueObject
	 * @generated
	 */
	EClass getValueObject();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see com.github.icelyframework.dynamicview.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see com.github.icelyframework.dynamicview.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see com.github.icelyframework.dynamicview.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see com.github.icelyframework.dynamicview.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.SimpleType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see com.github.icelyframework.dynamicview.SimpleType#getTypeName()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_TypeName();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see com.github.icelyframework.dynamicview.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.ComplexType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.github.icelyframework.dynamicview.ComplexType#getType()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Type();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see com.github.icelyframework.dynamicview.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.dynamicview.Role#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see com.github.icelyframework.dynamicview.Role#getApplication()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Application();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see com.github.icelyframework.dynamicview.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.HasAuthority <em>Has Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Authority</em>'.
	 * @see com.github.icelyframework.dynamicview.HasAuthority
	 * @generated
	 */
	EClass getHasAuthority();

	/**
	 * Returns the meta object for the reference '{@link com.github.icelyframework.dynamicview.HasAuthority#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see com.github.icelyframework.dynamicview.HasAuthority#getRole()
	 * @see #getHasAuthority()
	 * @generated
	 */
	EReference getHasAuthority_Role();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Authenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticated</em>'.
	 * @see com.github.icelyframework.dynamicview.Authenticated
	 * @generated
	 */
	EClass getAuthenticated();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.PermitAll <em>Permit All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permit All</em>'.
	 * @see com.github.icelyframework.dynamicview.PermitAll
	 * @generated
	 */
	EClass getPermitAll();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.PermitAll#isWithAllSubresource <em>With All Subresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With All Subresource</em>'.
	 * @see com.github.icelyframework.dynamicview.PermitAll#isWithAllSubresource()
	 * @see #getPermitAll()
	 * @generated
	 */
	EAttribute getPermitAll_WithAllSubresource();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.HasAnyAuthorities <em>Has Any Authorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Any Authorities</em>'.
	 * @see com.github.icelyframework.dynamicview.HasAnyAuthorities
	 * @generated
	 */
	EClass getHasAnyAuthorities();

	/**
	 * Returns the meta object for the reference list '{@link com.github.icelyframework.dynamicview.HasAnyAuthorities#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see com.github.icelyframework.dynamicview.HasAnyAuthorities#getRole()
	 * @see #getHasAnyAuthorities()
	 * @generated
	 */
	EReference getHasAnyAuthorities_Role();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.dynamicview.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see com.github.icelyframework.dynamicview.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.dynamicview.Access#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see com.github.icelyframework.dynamicview.Access#getAccess()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Access();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.dynamicview.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see com.github.icelyframework.dynamicview.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.dynamicview.DefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Type</em>'.
	 * @see com.github.icelyframework.dynamicview.DefaultType
	 * @generated
	 */
	EEnum getDefaultType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.dynamicview.AuthenticationType <em>Authentication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Type</em>'.
	 * @see com.github.icelyframework.dynamicview.AuthenticationType
	 * @generated
	 */
	EEnum getAuthenticationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamicviewFactory getDynamicviewFactory();

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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ResourceImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getResource()
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
		 * The meta object literal for the '<em><b>Read Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__READ_ACTIVITY = eINSTANCE.getResource_ReadActivity();

		/**
		 * The meta object literal for the '<em><b>Create Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CREATE_ACTIVITY = eINSTANCE.getResource_CreateActivity();

		/**
		 * The meta object literal for the '<em><b>Delete Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__DELETE_ACTIVITY = eINSTANCE.getResource_DeleteActivity();

		/**
		 * The meta object literal for the '<em><b>Other Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OTHER_ACTIVITIES = eINSTANCE.getResource_OtherActivities();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__AGGREGATE = eINSTANCE.getResource_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Has Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_ACTIVITY = eINSTANCE.getResource_HasActivity();

		/**
		 * The meta object literal for the '<em><b>Path Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PATH_NAME = eINSTANCE.getResource_PathName();

		/**
		 * The meta object literal for the '<em><b>Has Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_PERMISSION = eINSTANCE.getResource_HasPermission();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ApplicationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getApplication()
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
		 * The meta object literal for the '<em><b>Has Aggregate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_AGGREGATE = eINSTANCE.getApplication_HasAggregate();

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
		 * The meta object literal for the '<em><b>Has Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_ROLE = eINSTANCE.getApplication_HasRole();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ResourceActivityImpl <em>Resource Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ResourceActivityImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getResourceActivity()
		 * @generated
		 */
		EClass RESOURCE_ACTIVITY = eINSTANCE.getResourceActivity();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACTIVITY__TRIGGER = eINSTANCE.getResourceActivity_Trigger();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACTIVITY__RESOURCE = eINSTANCE.getResourceActivity_Resource();

		/**
		 * The meta object literal for the '<em><b>Path Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACTIVITY__PATH_NAME = eINSTANCE.getResourceActivity_PathName();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.CreateImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ReadImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.OtherImpl <em>Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.OtherImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getOther()
		 * @generated
		 */
		EClass OTHER = eINSTANCE.getOther();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.DeleteImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.OperationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Publish</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PUBLISH = eINSTANCE.getOperation_Publish();

		/**
		 * The meta object literal for the '<em><b>Has Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__HAS_PARAMETER = eINSTANCE.getOperation_HasParameter();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURNTYPE = eINSTANCE.getOperation_Returntype();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.SingletonResourceImpl <em>Singleton Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.SingletonResourceImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getSingletonResource()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.PrimitiveTypeImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPrimitiveType()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.EventImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.PublishImpl <em>Publish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.PublishImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPublish()
		 * @generated
		 */
		EClass PUBLISH = eINSTANCE.getPublish();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISH__EVENT_TYPE = eINSTANCE.getPublish_EventType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.CommandEventImpl <em>Command Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.CommandEventImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCommandEvent()
		 * @generated
		 */
		EClass COMMAND_EVENT = eINSTANCE.getCommandEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.DomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.DomainEventImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDomainEvent()
		 * @generated
		 */
		EClass DOMAIN_EVENT = eINSTANCE.getDomainEvent();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.DomainObjectOperationImpl <em>Domain Object Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.DomainObjectOperationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDomainObjectOperation()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.PolicyImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__EVENT_TYPE = eINSTANCE.getPolicy_EventType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.CommandOperationImpl <em>Command Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.CommandOperationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCommandOperation()
		 * @generated
		 */
		EClass COMMAND_OPERATION = eINSTANCE.getCommandOperation();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.QueryOperationImpl <em>Query Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.QueryOperationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getQueryOperation()
		 * @generated
		 */
		EClass QUERY_OPERATION = eINSTANCE.getQueryOperation();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ProcessOperationImpl <em>Process Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ProcessOperationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getProcessOperation()
		 * @generated
		 */
		EClass PROCESS_OPERATION = eINSTANCE.getProcessOperation();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OPERATION__DELEGATE = eINSTANCE.getProcessOperation_Delegate();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OPERATION__POLICY = eINSTANCE.getProcessOperation_Policy();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OPERATION__PROCESS = eINSTANCE.getProcessOperation_Process();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ProcessImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Has Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__HAS_OPERATION = eINSTANCE.getProcess_HasOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__AGGREGATE = eINSTANCE.getProcess_Aggregate();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ProjectImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getProject()
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
		 * The meta object literal for the '<em><b>Authentication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AUTHENTICATION_TYPE = eINSTANCE.getProject_AuthenticationType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.CollectionResourceImpl <em>Collection Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.CollectionResourceImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getCollectionResource()
		 * @generated
		 */
		EClass COLLECTION_RESOURCE = eINSTANCE.getCollectionResource();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.TypeDefinitionImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ParameterImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.AggregateImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE__NAME = eINSTANCE.getAggregate_Name();

		/**
		 * The meta object literal for the '<em><b>Has Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__HAS_PROCESS = eINSTANCE.getAggregate_HasProcess();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__APPLICATION = eINSTANCE.getAggregate_Application();

		/**
		 * The meta object literal for the '<em><b>Domainobjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__DOMAINOBJECTS = eINSTANCE.getAggregate_Domainobjects();

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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.DomainObjectImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__NAME = eINSTANCE.getDomainObject_Name();

		/**
		 * The meta object literal for the '<em><b>Aggregate Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__AGGREGATE_ROOT = eINSTANCE.getDomainObject_AggregateRoot();

		/**
		 * The meta object literal for the '<em><b>Has Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__HAS_OPERATION = eINSTANCE.getDomainObject_HasOperation();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_OBJECT__AGGREGATE = eINSTANCE.getDomainObject_Aggregate();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.EntityImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ValueObjectImpl <em>Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ValueObjectImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getValueObject()
		 * @generated
		 */
		EClass VALUE_OBJECT = eINSTANCE.getValueObject();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.DTOImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.EnumerationImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.BasicTypeImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.SimpleTypeImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getSimpleType()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.ComplexTypeImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getComplexType()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.RoleImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getRole()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.PermissionImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.HasAuthorityImpl <em>Has Authority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.HasAuthorityImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getHasAuthority()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.AuthenticatedImpl <em>Authenticated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.AuthenticatedImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAuthenticated()
		 * @generated
		 */
		EClass AUTHENTICATED = eINSTANCE.getAuthenticated();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.PermitAllImpl <em>Permit All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.PermitAllImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getPermitAll()
		 * @generated
		 */
		EClass PERMIT_ALL = eINSTANCE.getPermitAll();

		/**
		 * The meta object literal for the '<em><b>With All Subresource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_ALL__WITH_ALL_SUBRESOURCE = eINSTANCE.getPermitAll_WithAllSubresource();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.HasAnyAuthoritiesImpl <em>Has Any Authorities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.HasAnyAuthoritiesImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getHasAnyAuthorities()
		 * @generated
		 */
		EClass HAS_ANY_AUTHORITIES = eINSTANCE.getHasAnyAuthorities();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_ANY_AUTHORITIES__ROLE = eINSTANCE.getHasAnyAuthorities_Role();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.impl.AccessImpl <em>Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.impl.AccessImpl
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAccess()
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
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.MediaType
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.DefaultType <em>Default Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.DefaultType
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getDefaultType()
		 * @generated
		 */
		EEnum DEFAULT_TYPE = eINSTANCE.getDefaultType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.dynamicview.AuthenticationType <em>Authentication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.dynamicview.AuthenticationType
		 * @see com.github.icelyframework.dynamicview.impl.DynamicviewPackageImpl#getAuthenticationType()
		 * @generated
		 */
		EEnum AUTHENTICATION_TYPE = eINSTANCE.getAuthenticationType();

	}

} //DynamicviewPackage
