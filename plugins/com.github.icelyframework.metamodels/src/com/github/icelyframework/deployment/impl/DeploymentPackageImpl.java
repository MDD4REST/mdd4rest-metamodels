/**
 */
package com.github.icelyframework.deployment.impl;

import com.github.icelyframework.deployment.Application;
import com.github.icelyframework.deployment.ApplicationDeployment;
import com.github.icelyframework.deployment.ApplicationType;
import com.github.icelyframework.deployment.DatabaseType;
import com.github.icelyframework.deployment.DeploymentFactory;
import com.github.icelyframework.deployment.DeploymentPackage;
import com.github.icelyframework.deployment.DeploymentType;
import com.github.icelyframework.deployment.GatewayType;
import com.github.icelyframework.deployment.Project;
import com.github.icelyframework.deployment.ProjectDeployment;
import com.github.icelyframework.deployment.ServiceDiscoveryType;

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
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

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
	private EEnum databaseTypeEEnum = null;

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
	private EEnum deploymentTypeEEnum = null;

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
	private EEnum applicationTypeEEnum = null;

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
	 * @see com.github.icelyframework.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited) return (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentPackageImpl theDeploymentPackage = registeredDeploymentPackage instanceof DeploymentPackageImpl ? (DeploymentPackageImpl)registeredDeploymentPackage : new DeploymentPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationDeployment() {
		return applicationDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_DirectoryPath() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_DbPassword() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_Name() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_DbIP() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_DbUsername() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_DbPort() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_DbType() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationDeployment_ServerType() {
		return (EAttribute)applicationDeploymentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectDeployment() {
		return projectDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_DockerRepositoryName() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_DirectoryPath() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_ServiceDiscoveryType() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_GatewayType() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_DeploymentType() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_AppsFolders() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_Monitoring() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectDeployment_KubernetesServiceType() {
		return (EAttribute)projectDeploymentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Applications() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BasePath() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BasePackage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Deployment() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Project() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_BasePackage() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_ApplicationType() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Deployment() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
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
	public EEnum getServiceDiscoveryType() {
		return serviceDiscoveryTypeEEnum;
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
	public EEnum getGatewayType() {
		return gatewayTypeEEnum;
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
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory)getEFactoryInstance();
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
		applicationDeploymentEClass = createEClass(APPLICATION_DEPLOYMENT);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__DIRECTORY_PATH);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__DB_PASSWORD);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__NAME);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__DB_IP);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__DB_USERNAME);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__DB_PORT);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__DB_TYPE);
		createEAttribute(applicationDeploymentEClass, APPLICATION_DEPLOYMENT__SERVER_TYPE);

		projectDeploymentEClass = createEClass(PROJECT_DEPLOYMENT);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__DIRECTORY_PATH);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__GATEWAY_TYPE);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__APPS_FOLDERS);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__MONITORING);
		createEAttribute(projectDeploymentEClass, PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__APPLICATIONS);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__BASE_PATH);
		createEAttribute(projectEClass, PROJECT__BASE_PACKAGE);
		createEReference(projectEClass, PROJECT__DEPLOYMENT);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEReference(applicationEClass, APPLICATION__PROJECT);
		createEAttribute(applicationEClass, APPLICATION__BASE_PACKAGE);
		createEAttribute(applicationEClass, APPLICATION__APPLICATION_TYPE);
		createEReference(applicationEClass, APPLICATION__DEPLOYMENT);

		// Create enums
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
		serviceDiscoveryTypeEEnum = createEEnum(SERVICE_DISCOVERY_TYPE);
		deploymentTypeEEnum = createEEnum(DEPLOYMENT_TYPE);
		gatewayTypeEEnum = createEEnum(GATEWAY_TYPE);
		applicationTypeEEnum = createEEnum(APPLICATION_TYPE);
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

		// Initialize classes and features; add operations and parameters
		initEClass(applicationDeploymentEClass, ApplicationDeployment.class, "ApplicationDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationDeployment_DirectoryPath(), ecorePackage.getEString(), "directoryPath", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_DbPassword(), ecorePackage.getEString(), "dbPassword", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_Name(), ecorePackage.getEString(), "name", null, 1, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_DbIP(), ecorePackage.getEString(), "dbIP", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_DbUsername(), ecorePackage.getEString(), "dbUsername", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_DbPort(), ecorePackage.getEString(), "dbPort", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_DbType(), this.getDatabaseType(), "dbType", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationDeployment_ServerType(), ecorePackage.getEString(), "serverType", null, 0, 1, ApplicationDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectDeploymentEClass, ProjectDeployment.class, "ProjectDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectDeployment_DockerRepositoryName(), ecorePackage.getEString(), "dockerRepositoryName", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_DirectoryPath(), ecorePackage.getEString(), "directoryPath", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_ServiceDiscoveryType(), this.getServiceDiscoveryType(), "serviceDiscoveryType", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_GatewayType(), this.getGatewayType(), "gatewayType", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_DeploymentType(), this.getDeploymentType(), "deploymentType", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_AppsFolders(), ecorePackage.getEString(), "appsFolders", null, 0, -1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_Monitoring(), ecorePackage.getEBoolean(), "monitoring", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectDeployment_KubernetesServiceType(), ecorePackage.getEString(), "kubernetesServiceType", null, 0, 1, ProjectDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Applications(), this.getApplication(), this.getApplication_Project(), "applications", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Deployment(), this.getProjectDeployment(), null, "deployment", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Project(), this.getProject(), this.getProject_Applications(), "project", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_ApplicationType(), this.getApplicationType(), "applicationType", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Deployment(), this.getApplicationDeployment(), null, "deployment", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.MONGODB);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.CASSANDRA);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.COUCHBASE);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.NO);

		initEEnum(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.class, "ServiceDiscoveryType");
		addEEnumLiteral(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.EUREKA);
		addEEnumLiteral(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.CONSUL);
		addEEnumLiteral(serviceDiscoveryTypeEEnum, ServiceDiscoveryType.NO);

		initEEnum(deploymentTypeEEnum, DeploymentType.class, "DeploymentType");
		addEEnumLiteral(deploymentTypeEEnum, DeploymentType.DOCKER_COMPOSE);
		addEEnumLiteral(deploymentTypeEEnum, DeploymentType.KUBERNETES);
		addEEnumLiteral(deploymentTypeEEnum, DeploymentType.OPENSHIFT);

		initEEnum(gatewayTypeEEnum, GatewayType.class, "GatewayType");
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.ZUUL);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.TRAEFIK);

		initEEnum(applicationTypeEEnum, ApplicationType.class, "ApplicationType");
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_MICROSERVICE);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_GATEWAY);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_MONOLITH);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_UAA);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.SCULPTOR_MICROSERVICE);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.SCULPTOR_MONOLITH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

} //DeploymentPackageImpl
