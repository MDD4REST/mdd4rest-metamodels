/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPA Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.JPAOptions#getJpa_provider <em>Jpa provider</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJPAOptions()
 * @model
 * @generated
 */
public interface JPAOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Jpa provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpa provider</em>' attribute.
	 * @see #setJpa_provider(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getJPAOptions_Jpa_provider()
	 * @model
	 * @generated
	 */
	String getJpa_provider();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.JPAOptions#getJpa_provider <em>Jpa provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jpa provider</em>' attribute.
	 * @see #getJpa_provider()
	 * @generated
	 */
	void setJpa_provider(String value);

} // JPAOptions
