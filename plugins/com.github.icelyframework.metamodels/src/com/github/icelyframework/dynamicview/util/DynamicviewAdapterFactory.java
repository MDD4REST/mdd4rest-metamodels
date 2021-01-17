/**
 */
package com.github.icelyframework.dynamicview.util;

import com.github.icelyframework.dynamicview.Access;
import com.github.icelyframework.dynamicview.Aggregate;
import com.github.icelyframework.dynamicview.Application;
import com.github.icelyframework.dynamicview.Authenticated;
import com.github.icelyframework.dynamicview.BasicType;
import com.github.icelyframework.dynamicview.CollectionResource;
import com.github.icelyframework.dynamicview.CommandEvent;
import com.github.icelyframework.dynamicview.CommandOperation;
import com.github.icelyframework.dynamicview.ComplexType;
import com.github.icelyframework.dynamicview.Create;
import com.github.icelyframework.dynamicview.DTO;
import com.github.icelyframework.dynamicview.Delete;
import com.github.icelyframework.dynamicview.DomainEvent;
import com.github.icelyframework.dynamicview.DomainObject;
import com.github.icelyframework.dynamicview.DomainObjectOperation;
import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.Entity;
import com.github.icelyframework.dynamicview.Enumeration;
import com.github.icelyframework.dynamicview.Event;
import com.github.icelyframework.dynamicview.HasAnyAuthorities;
import com.github.icelyframework.dynamicview.HasAuthority;
import com.github.icelyframework.dynamicview.Operation;
import com.github.icelyframework.dynamicview.Other;
import com.github.icelyframework.dynamicview.Parameter;
import com.github.icelyframework.dynamicview.Permission;
import com.github.icelyframework.dynamicview.PermitAll;
import com.github.icelyframework.dynamicview.Policy;
import com.github.icelyframework.dynamicview.PrimitiveType;
import com.github.icelyframework.dynamicview.ProcessOperation;
import com.github.icelyframework.dynamicview.Project;
import com.github.icelyframework.dynamicview.Publish;
import com.github.icelyframework.dynamicview.QueryOperation;
import com.github.icelyframework.dynamicview.Read;
import com.github.icelyframework.dynamicview.Resource;
import com.github.icelyframework.dynamicview.ResourceActivity;
import com.github.icelyframework.dynamicview.Role;
import com.github.icelyframework.dynamicview.SimpleType;
import com.github.icelyframework.dynamicview.SingletonResource;
import com.github.icelyframework.dynamicview.TypeDefinition;
import com.github.icelyframework.dynamicview.ValueObject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage
 * @generated
 */
public class DynamicviewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DynamicviewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicviewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DynamicviewPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicviewSwitch<Adapter> modelSwitch =
		new DynamicviewSwitch<Adapter>() {
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseResourceActivity(ResourceActivity object) {
				return createResourceActivityAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter caseOther(Other object) {
				return createOtherAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseSingletonResource(SingletonResource object) {
				return createSingletonResourceAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter casePublish(Publish object) {
				return createPublishAdapter();
			}
			@Override
			public Adapter caseCommandEvent(CommandEvent object) {
				return createCommandEventAdapter();
			}
			@Override
			public Adapter caseDomainEvent(DomainEvent object) {
				return createDomainEventAdapter();
			}
			@Override
			public Adapter caseDomainObjectOperation(DomainObjectOperation object) {
				return createDomainObjectOperationAdapter();
			}
			@Override
			public Adapter casePolicy(Policy object) {
				return createPolicyAdapter();
			}
			@Override
			public Adapter caseCommandOperation(CommandOperation object) {
				return createCommandOperationAdapter();
			}
			@Override
			public Adapter caseQueryOperation(QueryOperation object) {
				return createQueryOperationAdapter();
			}
			@Override
			public Adapter caseProcessOperation(ProcessOperation object) {
				return createProcessOperationAdapter();
			}
			@Override
			public Adapter caseProcess(com.github.icelyframework.dynamicview.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseCollectionResource(CollectionResource object) {
				return createCollectionResourceAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseAggregate(Aggregate object) {
				return createAggregateAdapter();
			}
			@Override
			public Adapter caseDomainObject(DomainObject object) {
				return createDomainObjectAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseValueObject(ValueObject object) {
				return createValueObjectAdapter();
			}
			@Override
			public Adapter caseDTO(DTO object) {
				return createDTOAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseBasicType(BasicType object) {
				return createBasicTypeAdapter();
			}
			@Override
			public Adapter caseSimpleType(SimpleType object) {
				return createSimpleTypeAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter caseHasAuthority(HasAuthority object) {
				return createHasAuthorityAdapter();
			}
			@Override
			public Adapter caseAuthenticated(Authenticated object) {
				return createAuthenticatedAdapter();
			}
			@Override
			public Adapter casePermitAll(PermitAll object) {
				return createPermitAllAdapter();
			}
			@Override
			public Adapter caseHasAnyAuthorities(HasAnyAuthorities object) {
				return createHasAnyAuthoritiesAdapter();
			}
			@Override
			public Adapter caseAccess(Access object) {
				return createAccessAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.ResourceActivity <em>Resource Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.ResourceActivity
	 * @generated
	 */
	public Adapter createResourceActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Other
	 * @generated
	 */
	public Adapter createOtherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.SingletonResource <em>Singleton Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.SingletonResource
	 * @generated
	 */
	public Adapter createSingletonResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Publish <em>Publish</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Publish
	 * @generated
	 */
	public Adapter createPublishAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.CommandEvent <em>Command Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.CommandEvent
	 * @generated
	 */
	public Adapter createCommandEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.DomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.DomainEvent
	 * @generated
	 */
	public Adapter createDomainEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.DomainObjectOperation <em>Domain Object Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.DomainObjectOperation
	 * @generated
	 */
	public Adapter createDomainObjectOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.CommandOperation <em>Command Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.CommandOperation
	 * @generated
	 */
	public Adapter createCommandOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.QueryOperation <em>Query Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.QueryOperation
	 * @generated
	 */
	public Adapter createQueryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.ProcessOperation <em>Process Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.ProcessOperation
	 * @generated
	 */
	public Adapter createProcessOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.CollectionResource <em>Collection Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.CollectionResource
	 * @generated
	 */
	public Adapter createCollectionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Aggregate
	 * @generated
	 */
	public Adapter createAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.DomainObject
	 * @generated
	 */
	public Adapter createDomainObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.ValueObject <em>Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.ValueObject
	 * @generated
	 */
	public Adapter createValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.DTO
	 * @generated
	 */
	public Adapter createDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.BasicType
	 * @generated
	 */
	public Adapter createBasicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.SimpleType
	 * @generated
	 */
	public Adapter createSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.HasAuthority <em>Has Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.HasAuthority
	 * @generated
	 */
	public Adapter createHasAuthorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Authenticated <em>Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Authenticated
	 * @generated
	 */
	public Adapter createAuthenticatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.PermitAll <em>Permit All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.PermitAll
	 * @generated
	 */
	public Adapter createPermitAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.HasAnyAuthorities <em>Has Any Authorities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.HasAnyAuthorities
	 * @generated
	 */
	public Adapter createHasAnyAuthoritiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.dynamicview.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.dynamicview.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DynamicviewAdapterFactory
