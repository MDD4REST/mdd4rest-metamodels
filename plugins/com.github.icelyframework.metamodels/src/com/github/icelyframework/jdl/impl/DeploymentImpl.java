/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.Application;
import com.github.icelyframework.jdl.Deployment;
import com.github.icelyframework.jdl.DeploymentType;
import com.github.icelyframework.jdl.GatewayType;
import com.github.icelyframework.jdl.JDL;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.ServiceDiscoveryType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getDockerRepositoryName <em>Docker Repository Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getAppsFolders <em>Apps Folders</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getServiceDiscoveryType <em>Service Discovery Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#isMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getKubernetesServiceType <em>Kubernetes Service Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.DeploymentImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends EObjectImpl implements Deployment {
	/**
	 * The default value of the '{@link #getDeploymentType() <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentType()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentType DEPLOYMENT_TYPE_EDEFAULT = DeploymentType.DOCKER_COMPOSE;

	/**
	 * The cached value of the '{@link #getDeploymentType() <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentType()
	 * @generated
	 * @ordered
	 */
	protected DeploymentType deploymentType = DEPLOYMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected String directoryPath = DIRECTORY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerRepositoryName() <em>Docker Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_REPOSITORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerRepositoryName() <em>Docker Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected String dockerRepositoryName = DOCKER_REPOSITORY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppsFolders() <em>Apps Folders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppsFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> appsFolders;

	/**
	 * The default value of the '{@link #getServiceDiscoveryType() <em>Service Discovery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiscoveryType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceDiscoveryType SERVICE_DISCOVERY_TYPE_EDEFAULT = ServiceDiscoveryType.EUREKA;

	/**
	 * The cached value of the '{@link #getServiceDiscoveryType() <em>Service Discovery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDiscoveryType()
	 * @generated
	 * @ordered
	 */
	protected ServiceDiscoveryType serviceDiscoveryType = SERVICE_DISCOVERY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonitoring() <em>Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitoring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitoring() <em>Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitoring()
	 * @generated
	 * @ordered
	 */
	protected boolean monitoring = MONITORING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayType GATEWAY_TYPE_EDEFAULT = GatewayType.ZUUL;

	/**
	 * The cached value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected GatewayType gatewayType = GATEWAY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKubernetesServiceType() <em>Kubernetes Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String KUBERNETES_SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKubernetesServiceType() <em>Kubernetes Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKubernetesServiceType()
	 * @generated
	 * @ordered
	 */
	protected String kubernetesServiceType = KUBERNETES_SERVICE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected JDL application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentType getDeploymentType() {
		return deploymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentType(DeploymentType newDeploymentType) {
		DeploymentType oldDeploymentType = deploymentType;
		deploymentType = newDeploymentType == null ? DEPLOYMENT_TYPE_EDEFAULT : newDeploymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__DEPLOYMENT_TYPE, oldDeploymentType, deploymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirectoryPath() {
		return directoryPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryPath(String newDirectoryPath) {
		String oldDirectoryPath = directoryPath;
		directoryPath = newDirectoryPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__DIRECTORY_PATH, oldDirectoryPath, directoryPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerRepositoryName() {
		return dockerRepositoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerRepositoryName(String newDockerRepositoryName) {
		String oldDockerRepositoryName = dockerRepositoryName;
		dockerRepositoryName = newDockerRepositoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__DOCKER_REPOSITORY_NAME, oldDockerRepositoryName, dockerRepositoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAppsFolders() {
		if (appsFolders == null) {
			appsFolders = new EDataTypeUniqueEList<String>(String.class, this, JdlPackage.DEPLOYMENT__APPS_FOLDERS);
		}
		return appsFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDiscoveryType getServiceDiscoveryType() {
		return serviceDiscoveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDiscoveryType(ServiceDiscoveryType newServiceDiscoveryType) {
		ServiceDiscoveryType oldServiceDiscoveryType = serviceDiscoveryType;
		serviceDiscoveryType = newServiceDiscoveryType == null ? SERVICE_DISCOVERY_TYPE_EDEFAULT : newServiceDiscoveryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__SERVICE_DISCOVERY_TYPE, oldServiceDiscoveryType, serviceDiscoveryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoring(boolean newMonitoring) {
		boolean oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__MONITORING, oldMonitoring, monitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewayType getGatewayType() {
		return gatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayType(GatewayType newGatewayType) {
		GatewayType oldGatewayType = gatewayType;
		gatewayType = newGatewayType == null ? GATEWAY_TYPE_EDEFAULT : newGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__GATEWAY_TYPE, oldGatewayType, gatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKubernetesServiceType() {
		return kubernetesServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKubernetesServiceType(String newKubernetesServiceType) {
		String oldKubernetesServiceType = kubernetesServiceType;
		kubernetesServiceType = newKubernetesServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__KUBERNETES_SERVICE_TYPE, oldKubernetesServiceType, kubernetesServiceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JDL getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject)application;
			application = (JDL)eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JdlPackage.DEPLOYMENT__APPLICATION, oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JDL basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(JDL newApplication, NotificationChain msgs) {
		JDL oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__APPLICATION, oldApplication, newApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(JDL newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject)application).eInverseRemove(this, JdlPackage.JDL__DEPLOYMENTS, JDL.class, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, JdlPackage.JDL__DEPLOYMENTS, JDL.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DEPLOYMENT__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.DEPLOYMENT__APPLICATION:
				if (application != null)
					msgs = ((InternalEObject)application).eInverseRemove(this, JdlPackage.JDL__DEPLOYMENTS, JDL.class, msgs);
				return basicSetApplication((JDL)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.DEPLOYMENT__APPLICATION:
				return basicSetApplication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdlPackage.DEPLOYMENT__DEPLOYMENT_TYPE:
				return getDeploymentType();
			case JdlPackage.DEPLOYMENT__DIRECTORY_PATH:
				return getDirectoryPath();
			case JdlPackage.DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				return getDockerRepositoryName();
			case JdlPackage.DEPLOYMENT__APPS_FOLDERS:
				return getAppsFolders();
			case JdlPackage.DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				return getServiceDiscoveryType();
			case JdlPackage.DEPLOYMENT__MONITORING:
				return isMonitoring();
			case JdlPackage.DEPLOYMENT__GATEWAY_TYPE:
				return getGatewayType();
			case JdlPackage.DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				return getKubernetesServiceType();
			case JdlPackage.DEPLOYMENT__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JdlPackage.DEPLOYMENT__DEPLOYMENT_TYPE:
				setDeploymentType((DeploymentType)newValue);
				return;
			case JdlPackage.DEPLOYMENT__DIRECTORY_PATH:
				setDirectoryPath((String)newValue);
				return;
			case JdlPackage.DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				setDockerRepositoryName((String)newValue);
				return;
			case JdlPackage.DEPLOYMENT__APPS_FOLDERS:
				getAppsFolders().clear();
				getAppsFolders().addAll((Collection<? extends String>)newValue);
				return;
			case JdlPackage.DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				setServiceDiscoveryType((ServiceDiscoveryType)newValue);
				return;
			case JdlPackage.DEPLOYMENT__MONITORING:
				setMonitoring((Boolean)newValue);
				return;
			case JdlPackage.DEPLOYMENT__GATEWAY_TYPE:
				setGatewayType((GatewayType)newValue);
				return;
			case JdlPackage.DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				setKubernetesServiceType((String)newValue);
				return;
			case JdlPackage.DEPLOYMENT__APPLICATION:
				setApplication((JDL)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JdlPackage.DEPLOYMENT__DEPLOYMENT_TYPE:
				setDeploymentType(DEPLOYMENT_TYPE_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__DIRECTORY_PATH:
				setDirectoryPath(DIRECTORY_PATH_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				setDockerRepositoryName(DOCKER_REPOSITORY_NAME_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__APPS_FOLDERS:
				getAppsFolders().clear();
				return;
			case JdlPackage.DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				setServiceDiscoveryType(SERVICE_DISCOVERY_TYPE_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__MONITORING:
				setMonitoring(MONITORING_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__GATEWAY_TYPE:
				setGatewayType(GATEWAY_TYPE_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				setKubernetesServiceType(KUBERNETES_SERVICE_TYPE_EDEFAULT);
				return;
			case JdlPackage.DEPLOYMENT__APPLICATION:
				setApplication((JDL)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JdlPackage.DEPLOYMENT__DEPLOYMENT_TYPE:
				return deploymentType != DEPLOYMENT_TYPE_EDEFAULT;
			case JdlPackage.DEPLOYMENT__DIRECTORY_PATH:
				return DIRECTORY_PATH_EDEFAULT == null ? directoryPath != null : !DIRECTORY_PATH_EDEFAULT.equals(directoryPath);
			case JdlPackage.DEPLOYMENT__DOCKER_REPOSITORY_NAME:
				return DOCKER_REPOSITORY_NAME_EDEFAULT == null ? dockerRepositoryName != null : !DOCKER_REPOSITORY_NAME_EDEFAULT.equals(dockerRepositoryName);
			case JdlPackage.DEPLOYMENT__APPS_FOLDERS:
				return appsFolders != null && !appsFolders.isEmpty();
			case JdlPackage.DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
				return serviceDiscoveryType != SERVICE_DISCOVERY_TYPE_EDEFAULT;
			case JdlPackage.DEPLOYMENT__MONITORING:
				return monitoring != MONITORING_EDEFAULT;
			case JdlPackage.DEPLOYMENT__GATEWAY_TYPE:
				return gatewayType != GATEWAY_TYPE_EDEFAULT;
			case JdlPackage.DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
				return KUBERNETES_SERVICE_TYPE_EDEFAULT == null ? kubernetesServiceType != null : !KUBERNETES_SERVICE_TYPE_EDEFAULT.equals(kubernetesServiceType);
			case JdlPackage.DEPLOYMENT__APPLICATION:
				return application != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (deploymentType: ");
		result.append(deploymentType);
		result.append(", directoryPath: ");
		result.append(directoryPath);
		result.append(", dockerRepositoryName: ");
		result.append(dockerRepositoryName);
		result.append(", appsFolders: ");
		result.append(appsFolders);
		result.append(", serviceDiscoveryType: ");
		result.append(serviceDiscoveryType);
		result.append(", monitoring: ");
		result.append(monitoring);
		result.append(", gatewayType: ");
		result.append(gatewayType);
		result.append(", kubernetesServiceType: ");
		result.append(kubernetesServiceType);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
