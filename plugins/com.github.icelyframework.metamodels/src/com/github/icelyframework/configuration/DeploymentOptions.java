/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.DeploymentOptions#getDeployment_applicationServer <em>Deployment application Server</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDeploymentOptions()
 * @model
 * @generated
 */
public interface DeploymentOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment application Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment application Server</em>' attribute.
	 * @see #setDeployment_applicationServer(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDeploymentOptions_Deployment_applicationServer()
	 * @model
	 * @generated
	 */
	String getDeployment_applicationServer();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DeploymentOptions#getDeployment_applicationServer <em>Deployment application Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment application Server</em>' attribute.
	 * @see #getDeployment_applicationServer()
	 * @generated
	 */
	void setDeployment_applicationServer(String value);

} // DeploymentOptions
