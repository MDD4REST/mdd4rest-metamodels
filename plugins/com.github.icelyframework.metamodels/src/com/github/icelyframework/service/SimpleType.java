/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.SimpleType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getSimpleType()
 * @model abstract="true"
 * @generated
 */
public interface SimpleType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getSimpleType_TypeName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.SimpleType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // SimpleType
