/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.ResourceParam#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceParam#getQueryType <em>Query Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getResourceParam()
 * @model
 * @generated
 */
public interface ResourceParam extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getResourceParam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceParam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.QueryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Type</em>' attribute.
	 * @see com.github.icelyframework.service.QueryType
	 * @see #setQueryType(QueryType)
	 * @see com.github.icelyframework.service.ServicePackage#getResourceParam_QueryType()
	 * @model
	 * @generated
	 */
	QueryType getQueryType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceParam#getQueryType <em>Query Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Type</em>' attribute.
	 * @see com.github.icelyframework.service.QueryType
	 * @see #getQueryType()
	 * @generated
	 */
	void setQueryType(QueryType value);

} // ResourceParam
