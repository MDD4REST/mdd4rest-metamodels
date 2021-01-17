/**
 */
package com.github.icelyframework.staticview;

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
 *   <li>{@link com.github.icelyframework.staticview.Enumeration#getHasLiteral <em>Has Literal</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DomainObject {
	/**
	 * Returns the value of the '<em><b>Has Literal</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.staticview.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Literal</em>' containment reference list.
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getEnumeration_HasLiteral()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getHasLiteral();

} // Enumeration
