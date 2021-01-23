/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Service#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Service#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getService_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.ServiceValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.ServiceValue
	 * @see #setValue(ServiceValue)
	 * @see com.github.icelyframework.jdl.JdlPackage#getService_Value()
	 * @model
	 * @generated
	 */
	ServiceValue getValue();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Service#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.ServiceValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ServiceValue value);

} // Service
