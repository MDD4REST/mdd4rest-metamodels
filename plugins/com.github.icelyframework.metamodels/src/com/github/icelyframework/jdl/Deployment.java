/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getDockerRepositoryName <em>Docker Repository Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getAppsFolders <em>Apps Folders</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getServiceDiscoveryType <em>Service Discovery Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#isMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getGatewayType <em>Gateway Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getKubernetesServiceType <em>Kubernetes Service Type</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Deployment#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.DeploymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.DeploymentType
	 * @see #setDeploymentType(DeploymentType)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_DeploymentType()
	 * @model
	 * @generated
	 */
	DeploymentType getDeploymentType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getDeploymentType <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.DeploymentType
	 * @see #getDeploymentType()
	 * @generated
	 */
	void setDeploymentType(DeploymentType value);

	/**
	 * Returns the value of the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Path</em>' attribute.
	 * @see #setDirectoryPath(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_DirectoryPath()
	 * @model
	 * @generated
	 */
	String getDirectoryPath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getDirectoryPath <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Path</em>' attribute.
	 * @see #getDirectoryPath()
	 * @generated
	 */
	void setDirectoryPath(String value);

	/**
	 * Returns the value of the '<em><b>Docker Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Repository Name</em>' attribute.
	 * @see #setDockerRepositoryName(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_DockerRepositoryName()
	 * @model
	 * @generated
	 */
	String getDockerRepositoryName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getDockerRepositoryName <em>Docker Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Repository Name</em>' attribute.
	 * @see #getDockerRepositoryName()
	 * @generated
	 */
	void setDockerRepositoryName(String value);

	/**
	 * Returns the value of the '<em><b>Apps Folders</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps Folders</em>' attribute list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_AppsFolders()
	 * @model
	 * @generated
	 */
	EList<String> getAppsFolders();

	/**
	 * Returns the value of the '<em><b>Service Discovery Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.ServiceDiscoveryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Discovery Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.ServiceDiscoveryType
	 * @see #setServiceDiscoveryType(ServiceDiscoveryType)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_ServiceDiscoveryType()
	 * @model
	 * @generated
	 */
	ServiceDiscoveryType getServiceDiscoveryType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getServiceDiscoveryType <em>Service Discovery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Discovery Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.ServiceDiscoveryType
	 * @see #getServiceDiscoveryType()
	 * @generated
	 */
	void setServiceDiscoveryType(ServiceDiscoveryType value);

	/**
	 * Returns the value of the '<em><b>Monitoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring</em>' attribute.
	 * @see #setMonitoring(boolean)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_Monitoring()
	 * @model
	 * @generated
	 */
	boolean isMonitoring();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#isMonitoring <em>Monitoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring</em>' attribute.
	 * @see #isMonitoring()
	 * @generated
	 */
	void setMonitoring(boolean value);

	/**
	 * Returns the value of the '<em><b>Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.GatewayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.GatewayType
	 * @see #setGatewayType(GatewayType)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_GatewayType()
	 * @model
	 * @generated
	 */
	GatewayType getGatewayType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getGatewayType <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Type</em>' attribute.
	 * @see com.github.icelyframework.jdl.GatewayType
	 * @see #getGatewayType()
	 * @generated
	 */
	void setGatewayType(GatewayType value);

	/**
	 * Returns the value of the '<em><b>Kubernetes Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kubernetes Service Type</em>' attribute.
	 * @see #setKubernetesServiceType(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_KubernetesServiceType()
	 * @model
	 * @generated
	 */
	String getKubernetesServiceType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getKubernetesServiceType <em>Kubernetes Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kubernetes Service Type</em>' attribute.
	 * @see #getKubernetesServiceType()
	 * @generated
	 */
	void setKubernetesServiceType(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.jdl.JDL#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(JDL)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDeployment_Application()
	 * @see com.github.icelyframework.jdl.JDL#getDeployments
	 * @model opposite="deployments" required="true"
	 * @generated
	 */
	JDL getApplication();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Deployment#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(JDL value);

} // Deployment
