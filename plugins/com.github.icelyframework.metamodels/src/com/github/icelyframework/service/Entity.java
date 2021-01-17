/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Entity#isAuditable <em>Auditable</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DomainObject {
	/**
	 * Returns the value of the '<em><b>Auditable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable</em>' attribute.
	 * @see #setAuditable(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getEntity_Auditable()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAuditable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Entity#isAuditable <em>Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable</em>' attribute.
	 * @see #isAuditable()
	 * @generated
	 */
	void setAuditable(boolean value);

} // Entity
