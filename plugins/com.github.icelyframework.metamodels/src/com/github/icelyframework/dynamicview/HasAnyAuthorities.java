/**
 */
package com.github.icelyframework.dynamicview;

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
 *   <li>{@link com.github.icelyframework.dynamicview.HasAnyAuthorities#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getHasAnyAuthorities()
 * @model
 * @generated
 */
public interface HasAnyAuthorities extends Permission {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.dynamicview.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getHasAnyAuthorities_Roles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // HasAnyAuthorities
