/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paginate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Paginate#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Paginate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getPaginate()
 * @model
 * @generated
 */
public interface Paginate extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getPaginate_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.PaginationValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.PaginationValue
	 * @see #setValue(PaginationValue)
	 * @see com.github.icelyframework.jdl.JdlPackage#getPaginate_Value()
	 * @model
	 * @generated
	 */
	PaginationValue getValue();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Paginate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.PaginationValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PaginationValue value);

} // Paginate
