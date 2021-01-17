/**
 */
package com.github.icelyframework.dynamicview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.Operation#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Operation#getPublish <em>Publish</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Operation#getHasParameter <em>Has Parameter</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Operation#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' containment reference.
	 * @see #setPublish(Publish)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getOperation_Publish()
	 * @model containment="true"
	 * @generated
	 */
	Publish getPublish();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.Operation#getPublish <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' containment reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(Publish value);

	/**
	 * Returns the value of the '<em><b>Has Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.dynamicview.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Parameter</em>' containment reference list.
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getOperation_HasParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getHasParameter();

	/**
	 * Returns the value of the '<em><b>Returntype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returntype</em>' reference.
	 * @see #setReturntype(TypeDefinition)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getOperation_Returntype()
	 * @model
	 * @generated
	 */
	TypeDefinition getReturntype();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.Operation#getReturntype <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returntype</em>' reference.
	 * @see #getReturntype()
	 * @generated
	 */
	void setReturntype(TypeDefinition value);

} // Operation
