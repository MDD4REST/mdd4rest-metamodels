/**
 */
package com.github.icelyframework.dynamicview;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.ResourceActivity#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.ResourceActivity#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.ResourceActivity#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getResourceActivity()
 * @model abstract="true"
 * @generated
 */
public interface ResourceActivity extends Operation {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(ProcessOperation)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getResourceActivity_Trigger()
	 * @model
	 * @generated
	 */
	ProcessOperation getTrigger();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.ResourceActivity#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(ProcessOperation value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getResourceActivity_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.ResourceActivity#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getResourceActivity_PathName()
	 * @model
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.ResourceActivity#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // ResourceActivity
