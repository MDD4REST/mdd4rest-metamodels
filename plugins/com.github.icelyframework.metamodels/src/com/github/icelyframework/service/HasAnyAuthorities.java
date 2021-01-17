/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Any Authorities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.HasAnyAuthorities#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getHasAnyAuthorities()
 * @model
 * @generated
 */
public interface HasAnyAuthorities extends Permission {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getHasAnyAuthorities_Role()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRole();

} // HasAnyAuthorities
