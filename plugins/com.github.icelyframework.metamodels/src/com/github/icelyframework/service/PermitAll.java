/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permit All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.PermitAll#isWithAllSubresources <em>With All Subresources</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getPermitAll()
 * @model
 * @generated
 */
public interface PermitAll extends Permission {
	/**
	 * Returns the value of the '<em><b>With All Subresources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With All Subresources</em>' attribute.
	 * @see #setWithAllSubresources(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getPermitAll_WithAllSubresources()
	 * @model
	 * @generated
	 */
	boolean isWithAllSubresources();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.PermitAll#isWithAllSubresources <em>With All Subresources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With All Subresources</em>' attribute.
	 * @see #isWithAllSubresources()
	 * @generated
	 */
	void setWithAllSubresources(boolean value);

} // PermitAll
