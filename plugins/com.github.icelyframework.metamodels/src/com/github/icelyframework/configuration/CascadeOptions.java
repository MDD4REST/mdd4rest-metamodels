/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascade Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate <em>Cascade aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate_oneToMany <em>Cascade aggregate one To Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_manyToMany <em>Cascade many To Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_oneToMany <em>Cascade one To Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_toMany <em>Cascade to Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_toOne <em>Cascade to One</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions()
 * @model
 * @generated
 */
public interface CascadeOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Cascade aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade aggregate</em>' attribute.
	 * @see #setCascade_aggregate(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions_Cascade_aggregate()
	 * @model
	 * @generated
	 */
	String getCascade_aggregate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate <em>Cascade aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade aggregate</em>' attribute.
	 * @see #getCascade_aggregate()
	 * @generated
	 */
	void setCascade_aggregate(String value);

	/**
	 * Returns the value of the '<em><b>Cascade aggregate one To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade aggregate one To Many</em>' attribute.
	 * @see #setCascade_aggregate_oneToMany(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions_Cascade_aggregate_oneToMany()
	 * @model
	 * @generated
	 */
	String getCascade_aggregate_oneToMany();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_aggregate_oneToMany <em>Cascade aggregate one To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade aggregate one To Many</em>' attribute.
	 * @see #getCascade_aggregate_oneToMany()
	 * @generated
	 */
	void setCascade_aggregate_oneToMany(String value);

	/**
	 * Returns the value of the '<em><b>Cascade many To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade many To Many</em>' attribute.
	 * @see #setCascade_manyToMany(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions_Cascade_manyToMany()
	 * @model
	 * @generated
	 */
	String getCascade_manyToMany();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_manyToMany <em>Cascade many To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade many To Many</em>' attribute.
	 * @see #getCascade_manyToMany()
	 * @generated
	 */
	void setCascade_manyToMany(String value);

	/**
	 * Returns the value of the '<em><b>Cascade one To Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade one To Many</em>' attribute.
	 * @see #setCascade_oneToMany(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions_Cascade_oneToMany()
	 * @model
	 * @generated
	 */
	String getCascade_oneToMany();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_oneToMany <em>Cascade one To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade one To Many</em>' attribute.
	 * @see #getCascade_oneToMany()
	 * @generated
	 */
	void setCascade_oneToMany(String value);

	/**
	 * Returns the value of the '<em><b>Cascade to Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade to Many</em>' attribute.
	 * @see #setCascade_toMany(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions_Cascade_toMany()
	 * @model
	 * @generated
	 */
	String getCascade_toMany();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_toMany <em>Cascade to Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade to Many</em>' attribute.
	 * @see #getCascade_toMany()
	 * @generated
	 */
	void setCascade_toMany(String value);

	/**
	 * Returns the value of the '<em><b>Cascade to One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade to One</em>' attribute.
	 * @see #setCascade_toOne(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getCascadeOptions_Cascade_toOne()
	 * @model
	 * @generated
	 */
	String getCascade_toOne();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.CascadeOptions#getCascade_toOne <em>Cascade to One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade to One</em>' attribute.
	 * @see #getCascade_toOne()
	 * @generated
	 */
	void setCascade_toOne(String value);

} // CascadeOptions
