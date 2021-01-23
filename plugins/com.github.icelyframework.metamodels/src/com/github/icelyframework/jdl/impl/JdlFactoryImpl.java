/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.Application;
import com.github.icelyframework.jdl.ApplicationType;
import com.github.icelyframework.jdl.AuthenticationType;
import com.github.icelyframework.jdl.BidirectionalRelationship;
import com.github.icelyframework.jdl.BuildToolType;
import com.github.icelyframework.jdl.CacheProviderType;
import com.github.icelyframework.jdl.ClientFramework;
import com.github.icelyframework.jdl.Config;
import com.github.icelyframework.jdl.DTO;
import com.github.icelyframework.jdl.DTOValue;
import com.github.icelyframework.jdl.DatabaseType;
import com.github.icelyframework.jdl.Deployment;
import com.github.icelyframework.jdl.DeploymentType;
import com.github.icelyframework.jdl.Entity;
import com.github.icelyframework.jdl.Field;
import com.github.icelyframework.jdl.GatewayType;
import com.github.icelyframework.jdl.JDL;
import com.github.icelyframework.jdl.JdlFactory;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.Literal;
import com.github.icelyframework.jdl.MessageBroker;
import com.github.icelyframework.jdl.Multiplicity;
import com.github.icelyframework.jdl.Paginate;
import com.github.icelyframework.jdl.PaginationValue;
import com.github.icelyframework.jdl.RelationshipColumn;
import com.github.icelyframework.jdl.RelationshipType;
import com.github.icelyframework.jdl.Search;
import com.github.icelyframework.jdl.SearchEngine;
import com.github.icelyframework.jdl.Service;
import com.github.icelyframework.jdl.ServiceDiscoveryType;
import com.github.icelyframework.jdl.ServiceValue;
import com.github.icelyframework.jdl.UnidirectionalRelationship;

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
public class JdlFactoryImpl extends EFactoryImpl implements JdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JdlFactory init() {
		try {
			JdlFactory theJdlFactory = (JdlFactory)EPackage.Registry.INSTANCE.getEFactory(JdlPackage.eNS_URI);
			if (theJdlFactory != null) {
				return theJdlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JdlFactoryImpl() {
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
			case JdlPackage.APPLICATION: return createApplication();
			case JdlPackage.CONFIG: return createConfig();
			case JdlPackage.ENTITY: return createEntity();
			case JdlPackage.FIELD: return createField();
			case JdlPackage.RELATIONSHIP_COLUMN: return createRelationshipColumn();
			case JdlPackage.JDL: return createJDL();
			case JdlPackage.DEPLOYMENT: return createDeployment();
			case JdlPackage.UNIDIRECTIONAL_RELATIONSHIP: return createUnidirectionalRelationship();
			case JdlPackage.BIDIRECTIONAL_RELATIONSHIP: return createBidirectionalRelationship();
			case JdlPackage.ENUM: return createEnum();
			case JdlPackage.LITERAL: return createLiteral();
			case JdlPackage.PAGINATE: return createPaginate();
			case JdlPackage.DTO: return createDTO();
			case JdlPackage.SERVICE: return createService();
			case JdlPackage.SEARCH: return createSearch();
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
			case JdlPackage.APPLICATION_TYPE:
				return createApplicationTypeFromString(eDataType, initialValue);
			case JdlPackage.DATABASE_TYPE:
				return createDatabaseTypeFromString(eDataType, initialValue);
			case JdlPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case JdlPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			case JdlPackage.DEPLOYMENT_TYPE:
				return createDeploymentTypeFromString(eDataType, initialValue);
			case JdlPackage.BUILD_TOOL_TYPE:
				return createBuildToolTypeFromString(eDataType, initialValue);
			case JdlPackage.CACHE_PROVIDER_TYPE:
				return createCacheProviderTypeFromString(eDataType, initialValue);
			case JdlPackage.CLIENT_FRAMEWORK:
				return createClientFrameworkFromString(eDataType, initialValue);
			case JdlPackage.SEARCH_ENGINE:
				return createSearchEngineFromString(eDataType, initialValue);
			case JdlPackage.MESSAGE_BROKER:
				return createMessageBrokerFromString(eDataType, initialValue);
			case JdlPackage.AUTHENTICATION_TYPE:
				return createAuthenticationTypeFromString(eDataType, initialValue);
			case JdlPackage.SERVICE_DISCOVERY_TYPE:
				return createServiceDiscoveryTypeFromString(eDataType, initialValue);
			case JdlPackage.GATEWAY_TYPE:
				return createGatewayTypeFromString(eDataType, initialValue);
			case JdlPackage.SERVICE_VALUE:
				return createServiceValueFromString(eDataType, initialValue);
			case JdlPackage.DTO_VALUE:
				return createDTOValueFromString(eDataType, initialValue);
			case JdlPackage.PAGINATION_VALUE:
				return createPaginationValueFromString(eDataType, initialValue);
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
			case JdlPackage.APPLICATION_TYPE:
				return convertApplicationTypeToString(eDataType, instanceValue);
			case JdlPackage.DATABASE_TYPE:
				return convertDatabaseTypeToString(eDataType, instanceValue);
			case JdlPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case JdlPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			case JdlPackage.DEPLOYMENT_TYPE:
				return convertDeploymentTypeToString(eDataType, instanceValue);
			case JdlPackage.BUILD_TOOL_TYPE:
				return convertBuildToolTypeToString(eDataType, instanceValue);
			case JdlPackage.CACHE_PROVIDER_TYPE:
				return convertCacheProviderTypeToString(eDataType, instanceValue);
			case JdlPackage.CLIENT_FRAMEWORK:
				return convertClientFrameworkToString(eDataType, instanceValue);
			case JdlPackage.SEARCH_ENGINE:
				return convertSearchEngineToString(eDataType, instanceValue);
			case JdlPackage.MESSAGE_BROKER:
				return convertMessageBrokerToString(eDataType, instanceValue);
			case JdlPackage.AUTHENTICATION_TYPE:
				return convertAuthenticationTypeToString(eDataType, instanceValue);
			case JdlPackage.SERVICE_DISCOVERY_TYPE:
				return convertServiceDiscoveryTypeToString(eDataType, instanceValue);
			case JdlPackage.GATEWAY_TYPE:
				return convertGatewayTypeToString(eDataType, instanceValue);
			case JdlPackage.SERVICE_VALUE:
				return convertServiceValueToString(eDataType, instanceValue);
			case JdlPackage.DTO_VALUE:
				return convertDTOValueToString(eDataType, instanceValue);
			case JdlPackage.PAGINATION_VALUE:
				return convertPaginationValueToString(eDataType, instanceValue);
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
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
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
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipColumn createRelationshipColumn() {
		RelationshipColumnImpl relationshipColumn = new RelationshipColumnImpl();
		return relationshipColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JDL createJDL() {
		JDLImpl jdl = new JDLImpl();
		return jdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnidirectionalRelationship createUnidirectionalRelationship() {
		UnidirectionalRelationshipImpl unidirectionalRelationship = new UnidirectionalRelationshipImpl();
		return unidirectionalRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BidirectionalRelationship createBidirectionalRelationship() {
		BidirectionalRelationshipImpl bidirectionalRelationship = new BidirectionalRelationshipImpl();
		return bidirectionalRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.github.icelyframework.jdl.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
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
	public Paginate createPaginate() {
		PaginateImpl paginate = new PaginateImpl();
		return paginate;
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
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
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
	public DatabaseType createDatabaseTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseType result = DatabaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentType createDeploymentTypeFromString(EDataType eDataType, String initialValue) {
		DeploymentType result = DeploymentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildToolType createBuildToolTypeFromString(EDataType eDataType, String initialValue) {
		BuildToolType result = BuildToolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildToolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheProviderType createCacheProviderTypeFromString(EDataType eDataType, String initialValue) {
		CacheProviderType result = CacheProviderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheProviderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientFramework createClientFrameworkFromString(EDataType eDataType, String initialValue) {
		ClientFramework result = ClientFramework.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientFrameworkToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchEngine createSearchEngineFromString(EDataType eDataType, String initialValue) {
		SearchEngine result = SearchEngine.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSearchEngineToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBroker createMessageBrokerFromString(EDataType eDataType, String initialValue) {
		MessageBroker result = MessageBroker.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageBrokerToString(EDataType eDataType, Object instanceValue) {
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
	public ServiceDiscoveryType createServiceDiscoveryTypeFromString(EDataType eDataType, String initialValue) {
		ServiceDiscoveryType result = ServiceDiscoveryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceDiscoveryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayType createGatewayTypeFromString(EDataType eDataType, String initialValue) {
		GatewayType result = GatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceValue createServiceValueFromString(EDataType eDataType, String initialValue) {
		ServiceValue result = ServiceValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOValue createDTOValueFromString(EDataType eDataType, String initialValue) {
		DTOValue result = DTOValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDTOValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationValue createPaginationValueFromString(EDataType eDataType, String initialValue) {
		PaginationValue result = PaginationValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaginationValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JdlPackage getJdlPackage() {
		return (JdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JdlPackage getPackage() {
		return JdlPackage.eINSTANCE;
	}

} //JdlFactoryImpl
