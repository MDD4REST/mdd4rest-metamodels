/**
 */
package com.github.icelyframework.staticview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Project#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Project#getHasApplication <em>Has Application</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Project#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getProject()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProject_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProject_BasePath()
	 * @model required="true"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Project#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Has Application</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.staticview.Application}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Application</em>' containment reference list.
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProject_HasApplication()
	 * @see com.github.icelyframework.staticview.Application#getProject
	 * @model opposite="project" containment="true" required="true"
	 * @generated
	 */
	EList<Application> getHasApplication();

	/**
	 * Returns the value of the '<em><b>Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.staticview.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Types</em>' containment reference list.
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getProject_PrimitiveTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitiveTypes();

} // Project
