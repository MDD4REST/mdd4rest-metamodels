/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.ApplicationConfig#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.ApplicationConfig#getServicePort <em>Service Port</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplicationConfig()
 * @model
 * @generated
 */
public interface ApplicationConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplicationConfig_BaseName()
	 * @model required="true"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.ApplicationConfig#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

	/**
	 * Returns the value of the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Port</em>' attribute.
	 * @see #setServicePort(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplicationConfig_ServicePort()
	 * @model
	 * @generated
	 */
	String getServicePort();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.ApplicationConfig#getServicePort <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Port</em>' attribute.
	 * @see #getServicePort()
	 * @generated
	 */
	void setServicePort(String value);

} // ApplicationConfig
