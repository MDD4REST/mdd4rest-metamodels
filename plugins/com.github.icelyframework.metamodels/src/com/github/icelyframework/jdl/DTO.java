/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link com.github.icelyframework.jdl.DTO#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getDTO()
 * @model
 * @generated
 */
public interface DTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getDTO_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.DTOValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.DTOValue
	 * @see #setValue(DTOValue)
	 * @see com.github.icelyframework.jdl.JdlPackage#getDTO_Value()
	 * @model
	 * @generated
	 */
	DTOValue getValue();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.DTO#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.DTOValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DTOValue value);

} // DTO
