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
import com.github.icelyframework.jdl.DTOValue;
import com.github.icelyframework.jdl.DatabaseType;
import com.github.icelyframework.jdl.Deployment;
import com.github.icelyframework.jdl.DeploymentType;
import com.github.icelyframework.jdl.Entity;
import com.github.icelyframework.jdl.Field;
import com.github.icelyframework.jdl.GatewayType;
import com.github.icelyframework.jdl.JdlFactory;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.Literal;
import com.github.icelyframework.jdl.MessageBroker;
import com.github.icelyframework.jdl.Multiplicity;
import com.github.icelyframework.jdl.Paginate;
import com.github.icelyframework.jdl.PaginationValue;
import com.github.icelyframework.jdl.Relationship;
import com.github.icelyframework.jdl.RelationshipColumn;
import com.github.icelyframework.jdl.RelationshipType;
import com.github.icelyframework.jdl.Search;
import com.github.icelyframework.jdl.SearchEngine;
import com.github.icelyframework.jdl.Service;
import com.github.icelyframework.jdl.ServiceDiscoveryType;
import com.github.icelyframework.jdl.ServiceValue;
import com.github.icelyframework.jdl.UnidirectionalRelationship;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JdlPackageImpl extends EPackageImpl implements JdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unidirectionalRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bidirectionalRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buildToolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheProviderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientFrameworkEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchEngineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageBrokerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceDiscoveryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dtoValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paginationValueEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.icelyframework.jdl.JdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JdlPackageImpl() {
		super(eNS_URI, JdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JdlPackage init() {
		if (isInited) return (JdlPackage)EPackage.Registry.INSTANCE.getEPackage(JdlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJdlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JdlPackageImpl theJdlPackage = registeredJdlPackage instanceof JdlPackageImpl ? (JdlPackageImpl)registeredJdlPackage : new JdlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJdlPackage.createPackageContents();

		// Initialize created meta-data
		theJdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJdlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JdlPackage.eNS_URI, theJdlPackage);
		return theJdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Config() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Entities() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Deployments() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Dtos() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Paginates() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Services() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Search() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_BaseName() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_ApplicationType() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_ServicePort() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_DatabaseType() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_BuildTool() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_DtoSuffix() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_EnableHibernateCache() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_EntitySuffix() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_JhiPrefix() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_NativeLanguage() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_SkipClient() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_SkipServer() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_SkipUserManagement() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_UaaBaseName() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_TestFrameworks() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_AuthenticationType() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfig_CacheProvider() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfig_Application() {
		return (EReference)configEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Fields() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Relationships() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Type() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Required() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Unique() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Min() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Max() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_Multiplicity() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_ToName() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_FromColumn() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_FromName() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipColumn() {
		return relationshipColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipColumn_Name() {
		return (EAttribute)relationshipColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationshipColumn_IsRequired() {
		return (EAttribute)relationshipColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipColumn_Entity() {
		return (EReference)relationshipColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJDL() {
		return jdlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Applications() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Entities() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Enums() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Paginate() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Dto() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Service() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJDL_Search() {
		return (EReference)jdlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_DeploymentType() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_DirectoryPath() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_DockerRepositoryName() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_AppsFolders() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_ServiceDiscoveryType() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_Monitoring() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_GatewayType() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_KubernetesServiceType() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Application() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnidirectionalRelationship() {
		return unidirectionalRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnidirectionalRelationship_ToEntity() {
		return (EReference)unidirectionalRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBidirectionalRelationship() {
		return bidirectionalRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBidirectionalRelationship_ToColumn() {
		return (EReference)bidirectionalRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum_Literals() {
		return (EReference)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnum_Name() {
		return (EAttribute)enumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteral_Name() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaginate() {
		return paginateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaginate_Entities() {
		return (EReference)paginateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaginate_Value() {
		return (EAttribute)paginateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDTO() {
		return dtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTO_Entities() {
		return (EReference)dtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDTO_Value() {
		return (EAttribute)dtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Entities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Value() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSearch() {
		return searchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSearch_Entities() {
		return (EReference)searchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSearch_Value() {
		return (EAttribute)searchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getApplicationType() {
		return applicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatabaseType() {
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeploymentType() {
		return deploymentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBuildToolType() {
		return buildToolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCacheProviderType() {
		return cacheProviderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClientFramework() {
		return clientFrameworkEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSearchEngine() {
		return searchEngineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageBroker() {
		return messageBrokerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthenticationType() {
		return authenticationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceDiscoveryType() {
		return serviceDiscoveryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGatewayType() {
		return gatewayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceValue() {
		return serviceValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDTOValue() {
		return dtoValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaginationValue() {
		return paginationValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JdlFactory getJdlFactory() {
		return (JdlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__CONFIG);
		createEReference(applicationEClass, APPLICATION__ENTITIES);
		createEReference(applicationEClass, APPLICATION__DEPLOYMENTS);
		createEReference(applicationEClass, APPLICATION__DTOS);
		createEReference(applicationEClass, APPLICATION__PAGINATES);
		createEReference(applicationEClass, APPLICATION__SERVICES);
		createEReference(applicationEClass, APPLICATION__SEARCH);
		createEAttribute(applicationEClass, APPLICATION__NAME);

		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__BASE_NAME);
		createEAttribute(configEClass, CONFIG__APPLICATION_TYPE);
		createEAttribute(configEClass, CONFIG__SERVICE_PORT);
		createEAttribute(configEClass, CONFIG__DATABASE_TYPE);
		createEAttribute(configEClass, CONFIG__BUILD_TOOL);
		createEAttribute(configEClass, CONFIG__DTO_SUFFIX);
		createEAttribute(configEClass, CONFIG__ENABLE_HIBERNATE_CACHE);
		createEAttribute(configEClass, CONFIG__ENTITY_SUFFIX);
		createEAttribute(configEClass, CONFIG__JHI_PREFIX);
		createEAttribute(configEClass, CONFIG__NATIVE_LANGUAGE);
		createEAttribute(configEClass, CONFIG__SKIP_CLIENT);
		createEAttribute(configEClass, CONFIG__SKIP_SERVER);
		createEAttribute(configEClass, CONFIG__SKIP_USER_MANAGEMENT);
		createEAttribute(configEClass, CONFIG__UAA_BASE_NAME);
		createEAttribute(configEClass, CONFIG__TEST_FRAMEWORKS);
		createEAttribute(configEClass, CONFIG__AUTHENTICATION_TYPE);
		createEAttribute(configEClass, CONFIG__CACHE_PROVIDER);
		createEReference(configEClass, CONFIG__APPLICATION);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEReference(entityEClass, ENTITY__FIELDS);
		createEReference(entityEClass, ENTITY__RELATIONSHIPS);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__REQUIRED);
		createEAttribute(fieldEClass, FIELD__UNIQUE);
		createEAttribute(fieldEClass, FIELD__MIN);
		createEAttribute(fieldEClass, FIELD__MAX);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__MULTIPLICITY);
		createEAttribute(relationshipEClass, RELATIONSHIP__TO_NAME);
		createEReference(relationshipEClass, RELATIONSHIP__FROM_COLUMN);
		createEAttribute(relationshipEClass, RELATIONSHIP__FROM_NAME);

		relationshipColumnEClass = createEClass(RELATIONSHIP_COLUMN);
		createEAttribute(relationshipColumnEClass, RELATIONSHIP_COLUMN__NAME);
		createEAttribute(relationshipColumnEClass, RELATIONSHIP_COLUMN__IS_REQUIRED);
		createEReference(relationshipColumnEClass, RELATIONSHIP_COLUMN__ENTITY);

		jdlEClass = createEClass(JDL);
		createEReference(jdlEClass, JDL__APPLICATIONS);
		createEReference(jdlEClass, JDL__ENTITIES);
		createEReference(jdlEClass, JDL__ENUMS);
		createEReference(jdlEClass, JDL__PAGINATE);
		createEReference(jdlEClass, JDL__DTO);
		createEReference(jdlEClass, JDL__SERVICE);
		createEReference(jdlEClass, JDL__SEARCH);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__DEPLOYMENT_TYPE);
		createEAttribute(deploymentEClass, DEPLOYMENT__DIRECTORY_PATH);
		createEAttribute(deploymentEClass, DEPLOYMENT__DOCKER_REPOSITORY_NAME);
		createEAttribute(deploymentEClass, DEPLOYMENT__APPS_FOLDERS);
		createEAttribute(deploymentEClass, DEPLOYMENT__SERVICE_DISCOVERY_TYPE);
		createEAttribute(deploymentEClass, DEPLOYMENT__MONITORING);
		createEAttribute(deploymentEClass, DEPLOYMENT__GATEWAY_TYPE);
		createEAttribute(deploymentEClass, DEPLOYMENT__KUBERNETES_SERVICE_TYPE);
		createEReference(deploymentEClass, DEPLOYMENT__APPLICATION);

		unidirectionalRelationshipEClass = createEClass(UNIDIRECTIONAL_RELATIONSHIP);
		createEReference(unidirectionalRelationshipEClass, UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY);

		bidirectionalRelationshipEClass = createEClass(BIDIRECTIONAL_RELATIONSHIP);
		createEReference(bidirectionalRelationshipEClass, BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__LITERALS);
		createEAttribute(enumEClass, ENUM__NAME);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__NAME);
		createEAttribute(literalEClass, LITERAL__VALUE);

		paginateEClass = createEClass(PAGINATE);
		createEReference(paginateEClass, PAGINATE__ENTITIES);
		createEAttribute(paginateEClass, PAGINATE__VALUE);

		dtoEClass = createEClass(DTO);
		createEReference(dtoEClass, DTO__ENTITIES);
		createEAttribute(dtoEClass, DTO__VALUE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__ENTITIES);
		createEAttribute(serviceEClass, SERVICE__VALUE);

		searchEClass = createEClass(SEARCH);
		createEReference(searchEClass, SEARCH__ENTITIES);
		createEAttribute(searchEClass, SEARCH__VALUE);

		// Create enums
		applicationTypeEEnum = createEEnum(APPLICATION_TYPE);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
		multiplicityEEnum = createEEnum(MULTIPLICITY);
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
		deploymentTypeEEnum = createEEnum(DEPLOYMENT_TYPE);
		buildToolTypeEEnum = createEEnum(BUILD_TOOL_TYPE);
		cacheProviderTypeEEnum = createEEnum(CACHE_PROVIDER_TYPE);
		clientFrameworkEEnum = createEEnum(CLIENT_FRAMEWORK);
		searchEngineEEnum = createEEnum(SEARCH_ENGINE);
		messageBrokerEEnum = createEEnum(MESSAGE_BROKER);
		authenticationTypeEEnum = createEEnum(AUTHENTICATION_TYPE);
		serviceDiscoveryTypeEEnum = createEEnum(SERVICE_DISCOVERY_TYPE);
		gatewayTypeEEnum = createEEnum(GATEWAY_TYPE);
		serviceValueEEnum = createEEnum(SERVICE_VALUE);
		dtoValueEEnum = createEEnum(DTO_VALUE);
		paginationValueEEnum = createEEnum(PAGINATION_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unidirectionalRelationshipEClass.getESuperTypes().add(this.getRelationship());
		bidirectionalRelationshipEClass.getESuperTypes().add(this.getRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Config(), this.getConfig(), this.getConfig_Application(), "config", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Entities(), this.getEntity(), null, "entities", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Deployments(), this.getDeployment(), this.getDeployment_Application(), "deployments", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Dtos(), this.getDTO(), null, "dtos", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Paginates(), this.getPaginate(), null, "paginates", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Services(), this.getService(), null, "services", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Search(), this.getSearch(), null, "search", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_BaseName(), ecorePackage.getEString(), "baseName", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_ApplicationType(), this.getApplicationType(), "applicationType", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_ServicePort(), ecorePackage.getEString(), "servicePort", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_DatabaseType(), this.getDatabaseType(), "databaseType", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_BuildTool(), ecorePackage.getEString(), "buildTool", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_DtoSuffix(), ecorePackage.getEString(), "dtoSuffix", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_EnableHibernateCache(), ecorePackage.getEString(), "enableHibernateCache", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_EntitySuffix(), ecorePackage.getEString(), "entitySuffix", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_JhiPrefix(), ecorePackage.getEString(), "jhiPrefix", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_NativeLanguage(), ecorePackage.getEString(), "nativeLanguage", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_SkipClient(), ecorePackage.getEBoolean(), "skipClient", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_SkipServer(), ecorePackage.getEBoolean(), "skipServer", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_SkipUserManagement(), ecorePackage.getEBoolean(), "skipUserManagement", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_UaaBaseName(), ecorePackage.getEString(), "uaaBaseName", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_TestFrameworks(), ecorePackage.getEString(), "testFrameworks", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_AuthenticationType(), this.getAuthenticationType(), "authenticationType", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_CacheProvider(), ecorePackage.getEString(), "cacheProvider", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Application(), this.getApplication(), this.getApplication_Config(), "application", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Fields(), this.getField(), null, "fields", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Type(), ecorePackage.getEString(), "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Min(), ecorePackage.getEInt(), "min", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Max(), ecorePackage.getEInt(), "max", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Multiplicity(), this.getMultiplicity(), "multiplicity", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_ToName(), ecorePackage.getEString(), "toName", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_FromColumn(), this.getRelationshipColumn(), null, "fromColumn", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_FromName(), ecorePackage.getEString(), "fromName", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipColumnEClass, RelationshipColumn.class, "RelationshipColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationshipColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipColumn_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, RelationshipColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipColumn_Entity(), this.getEntity(), null, "entity", null, 1, 1, RelationshipColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jdlEClass, com.github.icelyframework.jdl.JDL.class, "JDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJDL_Applications(), this.getApplication(), null, "applications", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDL_Entities(), this.getEntity(), null, "entities", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDL_Enums(), this.getEnum(), null, "enums", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDL_Paginate(), this.getPaginate(), null, "paginate", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDL_Dto(), this.getDTO(), null, "dto", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDL_Service(), this.getService(), null, "service", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJDL_Search(), this.getSearch(), null, "search", null, 0, -1, com.github.icelyframework.jdl.JDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_DeploymentType(), this.getDeploymentType(), "deploymentType", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_DirectoryPath(), ecorePackage.getEString(), "directoryPath", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_DockerRepositoryName(), ecorePackage.getEString(), "dockerRepositoryName", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_AppsFolders(), ecorePackage.getEString(), "appsFolders", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_ServiceDiscoveryType(), this.getServiceDiscoveryType(), "serviceDiscoveryType", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_Monitoring(), ecorePackage.getEBoolean(), "monitoring", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_GatewayType(), this.getGatewayType(), "gatewayType", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_KubernetesServiceType(), ecorePackage.getEString(), "kubernetesServiceType", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Application(), this.getApplication(), this.getApplication_Deployments(), "application", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unidirectionalRelationshipEClass, UnidirectionalRelationship.class, "UnidirectionalRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnidirectionalRelationship_ToEntity(), this.getEntity(), null, "toEntity", null, 1, 1, UnidirectionalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bidirectionalRelationshipEClass, BidirectionalRelationship.class, "BidirectionalRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBidirectionalRelationship_ToColumn(), this.getRelationshipColumn(), null, "toColumn", null, 1, 1, BidirectionalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, com.github.icelyframework.jdl.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Literals(), this.getLiteral(), null, "literals", null, 1, -1, com.github.icelyframework.jdl.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.github.icelyframework.jdl.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Name(), ecorePackage.getEString(), "name", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginateEClass, Paginate.class, "Paginate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaginate_Entities(), this.getEntity(), null, "entities", null, 0, -1, Paginate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaginate_Value(), this.getPaginationValue(), "value", null, 0, 1, Paginate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoEClass, com.github.icelyframework.jdl.DTO.class, "DTO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTO_Entities(), this.getEntity(), null, "entities", null, 0, -1, com.github.icelyframework.jdl.DTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTO_Value(), this.getDTOValue(), "value", null, 0, 1, com.github.icelyframework.jdl.DTO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Entities(), this.getEntity(), null, "entities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Value(), this.getServiceValue(), "value", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchEClass, Search.class, "Search", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearch_Entities(), this.getEntity(), null, "entities", null, 0, -1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearch_Value(), this.getSearchEngine(), "value", null, 0, 1, Search.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(applicationTypeEEnum, ApplicationType.class, "ApplicationType");
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.MICROSERVICE);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.GATEWAY);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.MONOLITH);

		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.MONGODB);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.CASSANDRA);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.COUCHBASE);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.NO);

		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_TO_MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MANY_TO_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_TO_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MANY_TO_MANY);

		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.UNIDIRECTIONAL);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.BIDIRECTIONAL);

		initEEnum(deploymentTypeEEnum, DeploymentType.class, "DeploymentType");
		addEEnumLiteral(deploymentTypeEEnum, DeploymentType.DOCKER_COMPOSE);
		addEEnumLiteral(deploymentTypeEEnum, DeploymentType.KUBERNETES);
		addEEnumLiteral(deploymentTypeEEnum, DeploymentType.OPENSHIFT);

		initEEnum(buildToolTypeEEnum, BuildToolType.class, "BuildToolType");
		addEEnumLiteral(buildToolTypeEEnum, BuildToolType.MAVEN);
		addEEnumLiteral(buildToolTypeEEnum, BuildToolType.GRADLE);

		initEEnum(cacheProviderTypeEEnum, CacheProviderType.class, "CacheProviderType");
		addEEnumLiteral(cacheProviderTypeEEnum, CacheProviderType.EHCACHE);
		addEEnumLiteral(cacheProviderTypeEEnum, CacheProviderType.HAZELCAST);
		addEEnumLiteral(cacheProviderTypeEEnum, CacheProviderType.CAFFEINE);
		addEEnumLiteral(cacheProviderTypeEEnum, CacheProviderType.MEMCACHED);
		addEEnumLiteral(cacheProviderTypeEEnum, CacheProviderType.REDIS);
		addEEnumLiteral(cacheProviderTypeEEnum, CacheProviderType.NO);

		initEEnum(clientFrameworkEEnum, ClientFramework.class, "ClientFramework");
		addEEnumLiteral(clientFrameworkEEnum, ClientFramework.ANGULARX);
		addEEnumLiteral(clientFrameworkEEnum, ClientFramework.NO);

		initEEnum(searchEngineEEnum, SearchEngine.class, "SearchEngine");
		addEEnumLiteral(searchEngineEEnum, SearchEngine.ELASTICSEARCH);
		addEEnumLiteral(searchEngineEEnum, SearchEngine.NO);

		initEEnum(messageBrokerEEnum, MessageBroker.class, "MessageBroker");
		addEEnumLiteral(messageBrokerEEnum, MessageBroker.KAFKA);
		addEEnumLiteral(messageBrokerEEnum, MessageBroker.NO);

		initEEnum(authenticationTypeEEnum, AuthenticationType.class, "AuthenticationType");
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.JWT);
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.UAA);
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.SESSION);
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.OAUTH2);

		initEEnum(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.class, "ServiceDiscoveryType");
		addEEnumLiteral(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.EUREKA);
		addEEnumLiteral(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.CONSUL);
		addEEnumLiteral(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.NO);

		initEEnum(gatewayTypeEEnum, GatewayType.class, "GatewayType");
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.ZUUL);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.TRAEFIK);

		initEEnum(serviceValueEEnum, ServiceValue.class, "ServiceValue");
		addEEnumLiteral(serviceValueEEnum, ServiceValue.SERVICE_CLASS);
		addEEnumLiteral(serviceValueEEnum, ServiceValue.NO);
		addEEnumLiteral(serviceValueEEnum, ServiceValue.SERVICE_IMPL);

		initEEnum(dtoValueEEnum, DTOValue.class, "DTOValue");
		addEEnumLiteral(dtoValueEEnum, DTOValue.MAPSTRUCT);
		addEEnumLiteral(dtoValueEEnum, DTOValue.NO);

		initEEnum(paginationValueEEnum, PaginationValue.class, "PaginationValue");
		addEEnumLiteral(paginationValueEEnum, PaginationValue.PAGINATION);
		addEEnumLiteral(paginationValueEEnum, PaginationValue.NO);
		addEEnumLiteral(paginationValueEEnum, PaginationValue.INFINITE_SCROLL);

		// Create resource
		createResource(eNS_URI);
	}

} //JdlPackageImpl
