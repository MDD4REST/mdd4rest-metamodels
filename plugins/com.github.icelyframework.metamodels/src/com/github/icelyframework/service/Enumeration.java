/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DomainObject {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getEnumeration_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getLiterals();

} // Enumeration
