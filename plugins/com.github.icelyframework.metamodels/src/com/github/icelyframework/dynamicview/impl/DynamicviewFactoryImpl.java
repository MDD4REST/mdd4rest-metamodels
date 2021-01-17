/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.Access;
import com.github.icelyframework.dynamicview.Aggregate;
import com.github.icelyframework.dynamicview.Application;
import com.github.icelyframework.dynamicview.Authenticated;
import com.github.icelyframework.dynamicview.AuthenticationType;
import com.github.icelyframework.dynamicview.BasicType;
import com.github.icelyframework.dynamicview.CollectionResource;
import com.github.icelyframework.dynamicview.CommandEvent;
import com.github.icelyframework.dynamicview.CommandOperation;
import com.github.icelyframework.dynamicview.ComplexType;
import com.github.icelyframework.dynamicview.Create;
import com.github.icelyframework.dynamicview.DTO;
import com.github.icelyframework.dynamicview.DefaultType;
import com.github.icelyframework.dynamicview.Delete;
import com.github.icelyframework.dynamicview.DomainEvent;
import com.github.icelyframework.dynamicview.DomainObjectOperation;
import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.Entity;
import com.github.icelyframework.dynamicview.Enumeration;
import com.github.icelyframework.dynamicview.HasAnyAuthorities;
import com.github.icelyframework.dynamicview.HasAuthority;
import com.github.icelyframework.dynamicview.MediaType;
import com.github.icelyframework.dynamicview.Operation;
import com.github.icelyframework.dynamicview.Other;
import com.github.icelyframework.dynamicview.Parameter;
import com.github.icelyframework.dynamicview.PermitAll;
import com.github.icelyframework.dynamicview.Policy;
import com.github.icelyframework.dynamicview.PrimitiveType;
import com.github.icelyframework.dynamicview.ProcessOperation;
import com.github.icelyframework.dynamicview.Project;
import com.github.icelyframework.dynamicview.Publish;
import com.github.icelyframework.dynamicview.QueryOperation;
import com.github.icelyframework.dynamicview.Read;
import com.github.icelyframework.dynamicview.Role;
import com.github.icelyframework.dynamicview.SingletonResource;
import com.github.icelyframework.dynamicview.ValueObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicviewFactoryImpl extends EFactoryImpl implements DynamicviewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DynamicviewFactory init() {
		try {
			DynamicviewFactory theDynamicviewFactory = (DynamicviewFactory)EPackage.Registry.INSTANCE.getEFactory(DynamicviewPackage.eNS_URI);
			if (theDynamicviewFactory != null) {
				return theDynamicviewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DynamicviewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicviewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DynamicviewPackage.APPLICATION: return createApplication();
			case DynamicviewPackage.CREATE: return createCreate();
			case DynamicviewPackage.READ: return createRead();
			case DynamicviewPackage.OTHER: return createOther();
			case DynamicviewPackage.DELETE: return createDelete();
			case DynamicviewPackage.OPERATION: return createOperation();
			case DynamicviewPackage.SINGLETON_RESOURCE: return createSingletonResource();
			case DynamicviewPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case DynamicviewPackage.PUBLISH: return createPublish();
			case DynamicviewPackage.COMMAND_EVENT: return createCommandEvent();
			case DynamicviewPackage.DOMAIN_EVENT: return createDomainEvent();
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION: return createDomainObjectOperation();
			case DynamicviewPackage.POLICY: return createPolicy();
			case DynamicviewPackage.COMMAND_OPERATION: return createCommandOperation();
			case DynamicviewPackage.QUERY_OPERATION: return createQueryOperation();
			case DynamicviewPackage.PROCESS_OPERATION: return createProcessOperation();
			case DynamicviewPackage.PROCESS: return createProcess();
			case DynamicviewPackage.PROJECT: return createProject();
			case DynamicviewPackage.COLLECTION_RESOURCE: return createCollectionResource();
			case DynamicviewPackage.PARAMETER: return createParameter();
			case DynamicviewPackage.AGGREGATE: return createAggregate();
			case DynamicviewPackage.ENTITY: return createEntity();
			case DynamicviewPackage.VALUE_OBJECT: return createValueObject();
			case DynamicviewPackage.DTO: return createDTO();
			case DynamicviewPackage.ENUMERATION: return createEnumeration();
			case DynamicviewPackage.BASIC_TYPE: return createBasicType();
			case DynamicviewPackage.COMPLEX_TYPE: return createComplexType();
			case DynamicviewPackage.ROLE: return createRole();
			case DynamicviewPackage.HAS_AUTHORITY: return createHasAuthority();
			case DynamicviewPackage.AUTHENTICATED: return createAuthenticated();
			case DynamicviewPackage.PERMIT_ALL: return createPermitAll();
			case DynamicviewPackage.HAS_ANY_AUTHORITIES: return createHasAnyAuthorities();
			case DynamicviewPackage.ACCESS: return createAccess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DynamicviewPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case DynamicviewPackage.DEFAULT_TYPE:
				return createDefaultTypeFromString(eDataType, initialValue);
			case DynamicviewPackage.AUTHENTICATION_TYPE:
				return createAuthenticationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DynamicviewPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case DynamicviewPackage.DEFAULT_TYPE:
				return convertDefaultTypeToString(eDataType, instanceValue);
			case DynamicviewPackage.AUTHENTICATION_TYPE:
				return convertAuthenticationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Other createOther() {
		OtherImpl other = new OtherImpl();
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingletonResource createSingletonResource() {
		SingletonResourceImpl singletonResource = new SingletonResourceImpl();
		return singletonResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publish createPublish() {
		PublishImpl publish = new PublishImpl();
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandEvent createCommandEvent() {
		CommandEventImpl commandEvent = new CommandEventImpl();
		return commandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainEvent createDomainEvent() {
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObjectOperation createDomainObjectOperation() {
		DomainObjectOperationImpl domainObjectOperation = new DomainObjectOperationImpl();
		return domainObjectOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandOperation createCommandOperation() {
		CommandOperationImpl commandOperation = new CommandOperationImpl();
		return commandOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryOperation createQueryOperation() {
		QueryOperationImpl queryOperation = new QueryOperationImpl();
		return queryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessOperation createProcessOperation() {
		ProcessOperationImpl processOperation = new ProcessOperationImpl();
		return processOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.github.icelyframework.dynamicview.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionResource createCollectionResource() {
		CollectionResourceImpl collectionResource = new CollectionResourceImpl();
		return collectionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTO createDTO() {
		DTOImpl dto = new DTOImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicType createBasicType() {
		BasicTypeImpl basicType = new BasicTypeImpl();
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasAuthority createHasAuthority() {
		HasAuthorityImpl hasAuthority = new HasAuthorityImpl();
		return hasAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Authenticated createAuthenticated() {
		AuthenticatedImpl authenticated = new AuthenticatedImpl();
		return authenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermitAll createPermitAll() {
		PermitAllImpl permitAll = new PermitAllImpl();
		return permitAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HasAnyAuthorities createHasAnyAuthorities() {
		HasAnyAuthoritiesImpl hasAnyAuthorities = new HasAnyAuthoritiesImpl();
		return hasAnyAuthorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Access createAccess() {
		AccessImpl access = new AccessImpl();
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultType createDefaultTypeFromString(EDataType eDataType, String initialValue) {
		DefaultType result = DefaultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationType createAuthenticationTypeFromString(EDataType eDataType, String initialValue) {
		AuthenticationType result = AuthenticationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicviewPackage getDynamicviewPackage() {
		return (DynamicviewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DynamicviewPackage getPackage() {
		return DynamicviewPackage.eINSTANCE;
	}

} //DynamicviewFactoryImpl
