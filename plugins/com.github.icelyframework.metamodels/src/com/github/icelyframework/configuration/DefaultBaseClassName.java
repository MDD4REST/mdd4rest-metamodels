/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Base Class Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.DefaultBaseClassName#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.DefaultBaseClassName#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDefaultBaseClassName()
 * @model
 * @generated
 */
public interface DefaultBaseClassName extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDefaultBaseClassName_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DefaultBaseClassName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDefaultBaseClassName_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DefaultBaseClassName#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DefaultBaseClassName
