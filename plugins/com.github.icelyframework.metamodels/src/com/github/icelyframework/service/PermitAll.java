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
 *   <li>{@link com.github.icelyframework.service.PermitAll#isWithAllSubresource <em>With All Subresource</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getPermitAll()
 * @model
 * @generated
 */
public interface PermitAll extends Permission {
	/**
	 * Returns the value of the '<em><b>With All Subresource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With All Subresource</em>' attribute.
	 * @see #setWithAllSubresource(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getPermitAll_WithAllSubresource()
	 * @model
	 * @generated
	 */
	boolean isWithAllSubresource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.PermitAll#isWithAllSubresource <em>With All Subresource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With All Subresource</em>' attribute.
	 * @see #isWithAllSubresource()
	 * @generated
	 */
	void setWithAllSubresource(boolean value);

} // PermitAll
