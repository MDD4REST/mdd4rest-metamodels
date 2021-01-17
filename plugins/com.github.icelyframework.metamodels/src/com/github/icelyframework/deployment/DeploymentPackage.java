/**
 */
package com.github.icelyframework.deployment;

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
 * @see com.github.icelyframework.deployment.DeploymentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/icelyframework/deployment";

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
	DeploymentPackage eINSTANCE = com.github.icelyframework.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl <em>Application Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getApplicationDeployment()
	 * @generated
	 */
	int APPLICATION_DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__DIRECTORY_PATH = 0;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__DB_PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__DB_IP = 3;

	/**
	 * The feature id for the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__DB_USERNAME = 4;

	/**
	 * The feature id for the '<em><b>Db Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__DB_PORT = 5;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__DB_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT__SERVER_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Application Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DEPLOYMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl <em>Project Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.impl.ProjectDeploymentImpl
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getProjectDeployment()
	 * @generated
	 */
	int PROJECT_DEPLOYMENT = 1;

	/**
	 * The feature id for the '<em><b>Docker Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__DIRECTORY_PATH = 1;

	/**
	 * The feature id for the '<em><b>Service Discovery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Gateway Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__GATEWAY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Deployment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Apps Folders</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__APPS_FOLDERS = 5;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__MONITORING = 6;

	/**
	 * The feature id for the '<em><b>Kubernetes Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Project Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEPLOYMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.impl.ProjectImpl
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PATH = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BASE_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPLOYMENT = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.impl.ApplicationImpl
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

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
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__APPLICATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEPLOYMENT = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.DatabaseType
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 4;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.ServiceDiscoveryType <em>Service Discovery Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.ServiceDiscoveryType
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getServiceDiscoveryType()
	 * @generated
	 */
	int SERVICE_DISCOVERY_TYPE = 5;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.DeploymentType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.DeploymentType
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getDeploymentType()
	 * @generated
	 */
	int DEPLOYMENT_TYPE = 6;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.GatewayType <em>Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.GatewayType
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getGatewayType()
	 * @generated
	 */
	int GATEWAY_TYPE = 7;

	/**
	 * The meta object id for the '{@link com.github.icelyframework.deployment.ApplicationType <em>Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.icelyframework.deployment.ApplicationType
	 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.deployment.ApplicationDeployment <em>Application Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Deployment</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment
	 * @generated
	 */
	EClass getApplicationDeployment();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDirectoryPath <em>Directory Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Path</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getDirectoryPath()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_DirectoryPath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getDbPassword()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_DbPassword();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getName()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbIP <em>Db IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db IP</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getDbIP()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_DbIP();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbUsername <em>Db Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Username</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getDbUsername()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_DbUsername();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbPort <em>Db Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Port</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getDbPort()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_DbPort();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbType <em>Db Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Type</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getDbType()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_DbType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ApplicationDeployment#getServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Type</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationDeployment#getServerType()
	 * @see #getApplicationDeployment()
	 * @generated
	 */
	EAttribute getApplicationDeployment_ServerType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.deployment.ProjectDeployment <em>Project Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Deployment</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment
	 * @generated
	 */
	EClass getProjectDeployment();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#getDockerRepositoryName <em>Docker Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Repository Name</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getDockerRepositoryName()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_DockerRepositoryName();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#getDirectoryPath <em>Directory Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Path</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getDirectoryPath()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_DirectoryPath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#getServiceDiscoveryType <em>Service Discovery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Discovery Type</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getServiceDiscoveryType()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_ServiceDiscoveryType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#getGatewayType <em>Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Type</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getGatewayType()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_GatewayType();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#getDeploymentType <em>Deployment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Type</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getDeploymentType()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_DeploymentType();

	/**
	 * Returns the meta object for the attribute list '{@link com.github.icelyframework.deployment.ProjectDeployment#getAppsFolders <em>Apps Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Apps Folders</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getAppsFolders()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_AppsFolders();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#isMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#isMonitoring()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_Monitoring();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.ProjectDeployment#getKubernetesServiceType <em>Kubernetes Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kubernetes Service Type</em>'.
	 * @see com.github.icelyframework.deployment.ProjectDeployment#getKubernetesServiceType()
	 * @see #getProjectDeployment()
	 * @generated
	 */
	EAttribute getProjectDeployment_KubernetesServiceType();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.deployment.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.github.icelyframework.deployment.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.deployment.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see com.github.icelyframework.deployment.Project#getApplications()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Applications();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.deployment.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.Project#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see com.github.icelyframework.deployment.Project#getBasePath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePath();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.Project#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.deployment.Project#getBasePackage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BasePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.deployment.Project#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment</em>'.
	 * @see com.github.icelyframework.deployment.Project#getDeployment()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Deployment();

	/**
	 * Returns the meta object for class '{@link com.github.icelyframework.deployment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.github.icelyframework.deployment.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.github.icelyframework.deployment.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.github.icelyframework.deployment.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see com.github.icelyframework.deployment.Application#getProject()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Project();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.Application#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.github.icelyframework.deployment.Application#getBasePackage()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link com.github.icelyframework.deployment.Application#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see com.github.icelyframework.deployment.Application#getApplicationType()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ApplicationType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.github.icelyframework.deployment.Application#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment</em>'.
	 * @see com.github.icelyframework.deployment.Application#getDeployment()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Deployment();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.deployment.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see com.github.icelyframework.deployment.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.deployment.ServiceDiscoveryType <em>Service Discovery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Discovery Type</em>'.
	 * @see com.github.icelyframework.deployment.ServiceDiscoveryType
	 * @generated
	 */
	EEnum getServiceDiscoveryType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.deployment.DeploymentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see com.github.icelyframework.deployment.DeploymentType
	 * @generated
	 */
	EEnum getDeploymentType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.deployment.GatewayType <em>Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Type</em>'.
	 * @see com.github.icelyframework.deployment.GatewayType
	 * @generated
	 */
	EEnum getGatewayType();

	/**
	 * Returns the meta object for enum '{@link com.github.icelyframework.deployment.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Type</em>'.
	 * @see com.github.icelyframework.deployment.ApplicationType
	 * @generated
	 */
	EEnum getApplicationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

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
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl <em>Application Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getApplicationDeployment()
		 * @generated
		 */
		EClass APPLICATION_DEPLOYMENT = eINSTANCE.getApplicationDeployment();

		/**
		 * The meta object literal for the '<em><b>Directory Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__DIRECTORY_PATH = eINSTANCE.getApplicationDeployment_DirectoryPath();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__DB_PASSWORD = eINSTANCE.getApplicationDeployment_DbPassword();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__NAME = eINSTANCE.getApplicationDeployment_Name();

		/**
		 * The meta object literal for the '<em><b>Db IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__DB_IP = eINSTANCE.getApplicationDeployment_DbIP();

		/**
		 * The meta object literal for the '<em><b>Db Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__DB_USERNAME = eINSTANCE.getApplicationDeployment_DbUsername();

		/**
		 * The meta object literal for the '<em><b>Db Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__DB_PORT = eINSTANCE.getApplicationDeployment_DbPort();

		/**
		 * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__DB_TYPE = eINSTANCE.getApplicationDeployment_DbType();

		/**
		 * The meta object literal for the '<em><b>Server Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_DEPLOYMENT__SERVER_TYPE = eINSTANCE.getApplicationDeployment_ServerType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.impl.ProjectDeploymentImpl <em>Project Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.impl.ProjectDeploymentImpl
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getProjectDeployment()
		 * @generated
		 */
		EClass PROJECT_DEPLOYMENT = eINSTANCE.getProjectDeployment();

		/**
		 * The meta object literal for the '<em><b>Docker Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__DOCKER_REPOSITORY_NAME = eINSTANCE.getProjectDeployment_DockerRepositoryName();

		/**
		 * The meta object literal for the '<em><b>Directory Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__DIRECTORY_PATH = eINSTANCE.getProjectDeployment_DirectoryPath();

		/**
		 * The meta object literal for the '<em><b>Service Discovery Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__SERVICE_DISCOVERY_TYPE = eINSTANCE.getProjectDeployment_ServiceDiscoveryType();

		/**
		 * The meta object literal for the '<em><b>Gateway Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__GATEWAY_TYPE = eINSTANCE.getProjectDeployment_GatewayType();

		/**
		 * The meta object literal for the '<em><b>Deployment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__DEPLOYMENT_TYPE = eINSTANCE.getProjectDeployment_DeploymentType();

		/**
		 * The meta object literal for the '<em><b>Apps Folders</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__APPS_FOLDERS = eINSTANCE.getProjectDeployment_AppsFolders();

		/**
		 * The meta object literal for the '<em><b>Monitoring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__MONITORING = eINSTANCE.getProjectDeployment_Monitoring();

		/**
		 * The meta object literal for the '<em><b>Kubernetes Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEPLOYMENT__KUBERNETES_SERVICE_TYPE = eINSTANCE.getProjectDeployment_KubernetesServiceType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.impl.ProjectImpl
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getProject()
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
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DEPLOYMENT = eINSTANCE.getProject_Deployment();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.impl.ApplicationImpl
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getApplication()
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
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__APPLICATION_TYPE = eINSTANCE.getApplication_ApplicationType();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DEPLOYMENT = eINSTANCE.getApplication_Deployment();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.DatabaseType
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.ServiceDiscoveryType <em>Service Discovery Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.ServiceDiscoveryType
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getServiceDiscoveryType()
		 * @generated
		 */
		EEnum SERVICE_DISCOVERY_TYPE = eINSTANCE.getServiceDiscoveryType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.DeploymentType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.DeploymentType
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getDeploymentType()
		 * @generated
		 */
		EEnum DEPLOYMENT_TYPE = eINSTANCE.getDeploymentType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.GatewayType <em>Gateway Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.GatewayType
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getGatewayType()
		 * @generated
		 */
		EEnum GATEWAY_TYPE = eINSTANCE.getGatewayType();

		/**
		 * The meta object literal for the '{@link com.github.icelyframework.deployment.ApplicationType <em>Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.icelyframework.deployment.ApplicationType
		 * @see com.github.icelyframework.deployment.impl.DeploymentPackageImpl#getApplicationType()
		 * @generated
		 */
		EEnum APPLICATION_TYPE = eINSTANCE.getApplicationType();

	}

} //DeploymentPackage
