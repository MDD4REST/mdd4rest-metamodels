/**
 */
package com.github.icelyframework.staticview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.Resource#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Resource#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Resource#getIsRelatedResource <em>Is Related Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Resource#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Resource#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Resource#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related Resource</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.staticview.Resource}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.Resource#getIsRelatedResource <em>Is Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Resource</em>' reference list.
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource_HasRelatedResource()
	 * @see com.github.icelyframework.staticview.Resource#getIsRelatedResource
	 * @model opposite="isRelatedResource"
	 * @generated
	 */
	EList<Resource> getHasRelatedResource();

	/**
	 * Returns the value of the '<em><b>Is Related Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.Resource#getHasRelatedResource <em>Has Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Resource</em>' reference.
	 * @see #setIsRelatedResource(Resource)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource_IsRelatedResource()
	 * @see com.github.icelyframework.staticview.Resource#getHasRelatedResource
	 * @model opposite="hasRelatedResource"
	 * @generated
	 */
	Resource getIsRelatedResource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Resource#getIsRelatedResource <em>Is Related Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Related Resource</em>' reference.
	 * @see #getIsRelatedResource()
	 * @generated
	 */
	void setIsRelatedResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.Aggregate#getHasResource <em>Has Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' container reference.
	 * @see #setAggregate(Aggregate)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource_Aggregate()
	 * @see com.github.icelyframework.staticview.Aggregate#getHasResource
	 * @model opposite="hasResource" required="true" transient="false"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Resource#getAggregate <em>Aggregate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' container reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource_SimpleName()
	 * @model required="true"
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Resource#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getResource_PathName()
	 * @model
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Resource#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // Resource
