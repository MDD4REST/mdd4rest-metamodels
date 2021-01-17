/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.CacheOptions#getCache_provider <em>Cache provider</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCacheOptions()
 * @model
 * @generated
 */
public interface CacheOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Cache provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache provider</em>' attribute.
	 * @see #setCache_provider(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCacheOptions_Cache_provider()
	 * @model
	 * @generated
	 */
	String getCache_provider();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CacheOptions#getCache_provider <em>Cache provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache provider</em>' attribute.
	 * @see #getCache_provider()
	 * @generated
	 */
	void setCache_provider(String value);

} // CacheOptions
