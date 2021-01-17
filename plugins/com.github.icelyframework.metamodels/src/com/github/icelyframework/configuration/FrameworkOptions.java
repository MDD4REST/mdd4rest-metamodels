/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_package <em>Framework accessimpl package</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_prefix <em>Framework accessimpl prefix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessapi_packag <em>Framework accessapi packag</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getFrameworkOptions()
 * @model
 * @generated
 */
public interface FrameworkOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Framework accessimpl package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework accessimpl package</em>' attribute.
	 * @see #setFramework_accessimpl_package(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getFrameworkOptions_Framework_accessimpl_package()
	 * @model
	 * @generated
	 */
	String getFramework_accessimpl_package();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_package <em>Framework accessimpl package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework accessimpl package</em>' attribute.
	 * @see #getFramework_accessimpl_package()
	 * @generated
	 */
	void setFramework_accessimpl_package(String value);

	/**
	 * Returns the value of the '<em><b>Framework accessimpl prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework accessimpl prefix</em>' attribute.
	 * @see #setFramework_accessimpl_prefix(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getFrameworkOptions_Framework_accessimpl_prefix()
	 * @model
	 * @generated
	 */
	String getFramework_accessimpl_prefix();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessimpl_prefix <em>Framework accessimpl prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework accessimpl prefix</em>' attribute.
	 * @see #getFramework_accessimpl_prefix()
	 * @generated
	 */
	void setFramework_accessimpl_prefix(String value);

	/**
	 * Returns the value of the '<em><b>Framework accessapi packag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework accessapi packag</em>' attribute.
	 * @see #setFramework_accessapi_packag(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getFrameworkOptions_Framework_accessapi_packag()
	 * @model
	 * @generated
	 */
	String getFramework_accessapi_packag();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.FrameworkOptions#getFramework_accessapi_packag <em>Framework accessapi packag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework accessapi packag</em>' attribute.
	 * @see #getFramework_accessapi_packag()
	 * @generated
	 */
	void setFramework_accessapi_packag(String value);

} // FrameworkOptions
