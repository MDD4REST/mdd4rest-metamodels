/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.DTO#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getDTO()
 * @model
 * @generated
 */
public interface DTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference.
	 * @see #setEntities(Entity)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDTO_Entities()
	 * @model
	 * @generated
	 */
	Entity getEntities();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.DTO#getEntities <em>Entities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entities</em>' reference.
	 * @see #getEntities()
	 * @generated
	 */
	void setEntities(Entity value);

} // DTO
