/**
 */
package com.github.icelyframework.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getDockerRepositoryName <em>Docker Repository Name</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getServiceDiscoveryType <em>Service Discovery Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getAppsFolders <em>Apps Folders</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#isMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ProjectDeployment#getKubernetesServiceType <em>Kubernetes Service Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment()
 * @model
 * @generated
 */
public interface ProjectDeployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Docker Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Repository Name</em>' attribute.
	 * @see #setDockerRepositoryName(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_DockerRepositoryName()
	 * @model
	 * @generated
	 */
	String getDockerRepositoryName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#getDockerRepositoryName <em>Docker Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Repository Name</em>' attribute.
	 * @see #getDockerRepositoryName()
	 * @generated
	 */
	void setDockerRepositoryName(String value);

	/**
	 * Returns the value of the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Path</em>' attribute.
	 * @see #setDirectoryPath(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_DirectoryPath()
	 * @model
	 * @generated
	 */
	String getDirectoryPath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#getDirectoryPath <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Path</em>' attribute.
	 * @see #getDirectoryPath()
	 * @generated
	 */
	void setDirectoryPath(String value);

	/**
	 * Returns the value of the '<em><b>Service Discovery Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.deployment.ServiceDiscoveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Discovery Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.ServiceDiscoveryType
	 * @see #setServiceDiscoveryType(ServiceDiscoveryType)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_ServiceDiscoveryType()
	 * @model
	 * @generated
	 */
	ServiceDiscoveryType getServiceDiscoveryType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#getServiceDiscoveryType <em>Service Discovery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Discovery Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.ServiceDiscoveryType
	 * @see #getServiceDiscoveryType()
	 * @generated
	 */
	void setServiceDiscoveryType(ServiceDiscoveryType value);

	/**
	 * Returns the value of the '<em><b>Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.deployment.GatewayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.GatewayType
	 * @see #setGatewayType(GatewayType)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_GatewayType()
	 * @model
	 * @generated
	 */
	GatewayType getGatewayType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#getGatewayType <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.GatewayType
	 * @see #getGatewayType()
	 * @generated
	 */
	void setGatewayType(GatewayType value);

	/**
	 * Returns the value of the '<em><b>Deployment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.deployment.DeploymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.DeploymentType
	 * @see #setDeploymentType(DeploymentType)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_DeploymentType()
	 * @model
	 * @generated
	 */
	DeploymentType getDeploymentType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#getDeploymentType <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.DeploymentType
	 * @see #getDeploymentType()
	 * @generated
	 */
	void setDeploymentType(DeploymentType value);

	/**
	 * Returns the value of the '<em><b>Apps Folders</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps Folders</em>' attribute list.
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_AppsFolders()
	 * @model
	 * @generated
	 */
	EList<String> getAppsFolders();

	/**
	 * Returns the value of the '<em><b>Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring</em>' attribute.
	 * @see #setMonitoring(boolean)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_Monitoring()
	 * @model
	 * @generated
	 */
	boolean isMonitoring();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#isMonitoring <em>Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring</em>' attribute.
	 * @see #isMonitoring()
	 * @generated
	 */
	void setMonitoring(boolean value);

	/**
	 * Returns the value of the '<em><b>Kubernetes Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kubernetes Service Type</em>' attribute.
	 * @see #setKubernetesServiceType(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getProjectDeployment_KubernetesServiceType()
	 * @model
	 * @generated
	 */
	String getKubernetesServiceType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ProjectDeployment#getKubernetesServiceType <em>Kubernetes Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kubernetes Service Type</em>' attribute.
	 * @see #getKubernetesServiceType()
	 * @generated
	 */
	void setKubernetesServiceType(String value);

} // ProjectDeployment
