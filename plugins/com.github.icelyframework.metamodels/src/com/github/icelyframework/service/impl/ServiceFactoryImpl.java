/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Access;
import com.github.icelyframework.service.Aggregate;
import com.github.icelyframework.service.Application;
import com.github.icelyframework.service.ApplicationType;
import com.github.icelyframework.service.ArchitectureType;
import com.github.icelyframework.service.Authenticated;
import com.github.icelyframework.service.AuthenticationType;
import com.github.icelyframework.service.BasicType;
import com.github.icelyframework.service.CollectionType;
import com.github.icelyframework.service.CommandEvent;
import com.github.icelyframework.service.ComplexType;
import com.github.icelyframework.service.Consumer;
import com.github.icelyframework.service.DTO;
import com.github.icelyframework.service.DataMapper;
import com.github.icelyframework.service.DefaultType;
import com.github.icelyframework.service.DiscriminatorType;
import com.github.icelyframework.service.DomainEvent;
import com.github.icelyframework.service.DomainObjectOperation;
import com.github.icelyframework.service.Entity;
import com.github.icelyframework.service.Enumeration;
import com.github.icelyframework.service.HasAnyAuthorities;
import com.github.icelyframework.service.HasAuthority;
import com.github.icelyframework.service.HttpMethod;
import com.github.icelyframework.service.Inheritance;
import com.github.icelyframework.service.InheritanceType;
import com.github.icelyframework.service.InputRepresentation;
import com.github.icelyframework.service.Literal;
import com.github.icelyframework.service.MediaType;
import com.github.icelyframework.service.Multiplicity;
import com.github.icelyframework.service.Operation;
import com.github.icelyframework.service.OutputRepresentation;
import com.github.icelyframework.service.Parameter;
import com.github.icelyframework.service.Path;
import com.github.icelyframework.service.PermitAll;
import com.github.icelyframework.service.PrimitiveType;
import com.github.icelyframework.service.Project;
import com.github.icelyframework.service.Property;
import com.github.icelyframework.service.Publish;
import com.github.icelyframework.service.QueryType;
import com.github.icelyframework.service.Relation;
import com.github.icelyframework.service.RelationType;
import com.github.icelyframework.service.Repository;
import com.github.icelyframework.service.RepositoryOperation;
import com.github.icelyframework.service.Resource;
import com.github.icelyframework.service.ResourceOperation;
import com.github.icelyframework.service.ResourceParam;
import com.github.icelyframework.service.Role;
import com.github.icelyframework.service.Service;
import com.github.icelyframework.service.ServiceFactory;
import com.github.icelyframework.service.ServiceOperation;
import com.github.icelyframework.service.ServicePackage;
import com.github.icelyframework.service.Subscribe;
import com.github.icelyframework.service.ValueObject;

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
public class ServiceFactoryImpl extends EFactoryImpl implements ServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceFactory init() {
		try {
			ServiceFactory theServiceFactory = (ServiceFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePackage.eNS_URI);
			if (theServiceFactory != null) {
				return theServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactoryImpl() {
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
			case ServicePackage.PROJECT: return createProject();
			case ServicePackage.APPLICATION: return createApplication();
			case ServicePackage.PROPERTY: return createProperty();
			case ServicePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case ServicePackage.RELATION: return createRelation();
			case ServicePackage.LITERAL: return createLiteral();
			case ServicePackage.INHERITANCE: return createInheritance();
			case ServicePackage.ENTITY: return createEntity();
			case ServicePackage.VALUE_OBJECT: return createValueObject();
			case ServicePackage.DATA_MAPPER: return createDataMapper();
			case ServicePackage.BASIC_TYPE: return createBasicType();
			case ServicePackage.COMMAND_EVENT: return createCommandEvent();
			case ServicePackage.ENUMERATION: return createEnumeration();
			case ServicePackage.AGGREGATE: return createAggregate();
			case ServicePackage.DTO: return createDTO();
			case ServicePackage.DOMAIN_EVENT: return createDomainEvent();
			case ServicePackage.PATH: return createPath();
			case ServicePackage.REPOSITORY: return createRepository();
			case ServicePackage.RESOURCE_OPERATION: return createResourceOperation();
			case ServicePackage.RESOURCE: return createResource();
			case ServicePackage.SERVICE_OPERATION: return createServiceOperation();
			case ServicePackage.REPOSITORY_OPERATION: return createRepositoryOperation();
			case ServicePackage.DOMAIN_OBJECT_OPERATION: return createDomainObjectOperation();
			case ServicePackage.CONSUMER: return createConsumer();
			case ServicePackage.SUBSCRIBE: return createSubscribe();
			case ServicePackage.SERVICE: return createService();
			case ServicePackage.OPERATION: return createOperation();
			case ServicePackage.PUBLISH: return createPublish();
			case ServicePackage.PARAMETER: return createParameter();
			case ServicePackage.COMPLEX_TYPE: return createComplexType();
			case ServicePackage.MODULE: return createModule();
			case ServicePackage.HAS_ANY_AUTHORITIES: return createHasAnyAuthorities();
			case ServicePackage.HAS_AUTHORITY: return createHasAuthority();
			case ServicePackage.AUTHENTICATED: return createAuthenticated();
			case ServicePackage.ACCESS: return createAccess();
			case ServicePackage.PERMIT_ALL: return createPermitAll();
			case ServicePackage.ROLE: return createRole();
			case ServicePackage.RESOURCE_PARAM: return createResourceParam();
			case ServicePackage.OUTPUT_REPRESENTATION: return createOutputRepresentation();
			case ServicePackage.INPUT_REPRESENTATION: return createInputRepresentation();
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
			case ServicePackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case ServicePackage.DEFAULT_TYPE:
				return createDefaultTypeFromString(eDataType, initialValue);
			case ServicePackage.HTTP_METHOD:
				return createHttpMethodFromString(eDataType, initialValue);
			case ServicePackage.RELATION_TYPE:
				return createRelationTypeFromString(eDataType, initialValue);
			case ServicePackage.INHERITANCE_TYPE:
				return createInheritanceTypeFromString(eDataType, initialValue);
			case ServicePackage.DISCRIMINATOR_TYPE:
				return createDiscriminatorTypeFromString(eDataType, initialValue);
			case ServicePackage.COLLECTION_TYPE:
				return createCollectionTypeFromString(eDataType, initialValue);
			case ServicePackage.ARCHITECTURE_TYPE:
				return createArchitectureTypeFromString(eDataType, initialValue);
			case ServicePackage.AUTHENTICATION_TYPE:
				return createAuthenticationTypeFromString(eDataType, initialValue);
			case ServicePackage.QUERY_TYPE:
				return createQueryTypeFromString(eDataType, initialValue);
			case ServicePackage.APPLICATION_TYPE:
				return createApplicationTypeFromString(eDataType, initialValue);
			case ServicePackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
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
			case ServicePackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case ServicePackage.DEFAULT_TYPE:
				return convertDefaultTypeToString(eDataType, instanceValue);
			case ServicePackage.HTTP_METHOD:
				return convertHttpMethodToString(eDataType, instanceValue);
			case ServicePackage.RELATION_TYPE:
				return convertRelationTypeToString(eDataType, instanceValue);
			case ServicePackage.INHERITANCE_TYPE:
				return convertInheritanceTypeToString(eDataType, instanceValue);
			case ServicePackage.DISCRIMINATOR_TYPE:
				return convertDiscriminatorTypeToString(eDataType, instanceValue);
			case ServicePackage.COLLECTION_TYPE:
				return convertCollectionTypeToString(eDataType, instanceValue);
			case ServicePackage.ARCHITECTURE_TYPE:
				return convertArchitectureTypeToString(eDataType, instanceValue);
			case ServicePackage.AUTHENTICATION_TYPE:
				return convertAuthenticationTypeToString(eDataType, instanceValue);
			case ServicePackage.QUERY_TYPE:
				return convertQueryTypeToString(eDataType, instanceValue);
			case ServicePackage.APPLICATION_TYPE:
				return convertApplicationTypeToString(eDataType, instanceValue);
			case ServicePackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
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
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
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
	public DataMapper createDataMapper() {
		DataMapperImpl dataMapper = new DataMapperImpl();
		return dataMapper;
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
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceOperation createResourceOperation() {
		ResourceOperationImpl resourceOperation = new ResourceOperationImpl();
		return resourceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOperation createServiceOperation() {
		ServiceOperationImpl serviceOperation = new ServiceOperationImpl();
		return serviceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryOperation createRepositoryOperation() {
		RepositoryOperationImpl repositoryOperation = new RepositoryOperationImpl();
		return repositoryOperation;
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
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscribe createSubscribe() {
		SubscribeImpl subscribe = new SubscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
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
	public com.github.icelyframework.service.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
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
	public Access createAccess() {
		AccessImpl access = new AccessImpl();
		return access;
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
	public ResourceParam createResourceParam() {
		ResourceParamImpl resourceParam = new ResourceParamImpl();
		return resourceParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputRepresentation createOutputRepresentation() {
		OutputRepresentationImpl outputRepresentation = new OutputRepresentationImpl();
		return outputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputRepresentation createInputRepresentation() {
		InputRepresentationImpl inputRepresentation = new InputRepresentationImpl();
		return inputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
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
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceType createInheritanceTypeFromString(EDataType eDataType, String initialValue) {
		InheritanceType result = InheritanceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorType createDiscriminatorTypeFromString(EDataType eDataType, String initialValue) {
		DiscriminatorType result = DiscriminatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscriminatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionTypeFromString(EDataType eDataType, String initialValue) {
		CollectionType result = CollectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureType createArchitectureTypeFromString(EDataType eDataType, String initialValue) {
		ArchitectureType result = ArchitectureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchitectureTypeToString(EDataType eDataType, Object instanceValue) {
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
	public QueryType createQueryTypeFromString(EDataType eDataType, String initialValue) {
		QueryType result = QueryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType createApplicationTypeFromString(EDataType eDataType, String initialValue) {
		ApplicationType result = ApplicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	@Override
	public ServicePackage getServicePackage() {
		return (ServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePackage getPackage() {
		return ServicePackage.eINSTANCE;
	}

} //ServiceFactoryImpl
