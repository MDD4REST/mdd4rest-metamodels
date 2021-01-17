/**
 */
package com.github.icelyframework.dynamicview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.Application#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Application#getHasAggregate <em>Has Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Application#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Application#getComplextypes <em>Complextypes</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.Application#getHasRole <em>Has Role</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Aggregate</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.dynamicview.Aggregate}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.dynamicview.Aggregate#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Aggregate</em>' containment reference list.
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getApplication_HasAggregate()
	 * @see com.github.icelyframework.dynamicview.Aggregate#getApplication
	 * @model opposite="application" containment="true" required="true"
	 * @generated
	 */
	EList<Aggregate> getHasAggregate();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.dynamicview.Project#getHasApplication <em>Has Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getApplication_Project()
	 * @see com.github.icelyframework.dynamicview.Project#getHasApplication
	 * @model opposite="hasApplication" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.Application#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Complextypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.dynamicview.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complextypes</em>' containment reference list.
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getApplication_Complextypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplextypes();

	/**
	 * Returns the value of the '<em><b>Has Role</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.dynamicview.Role}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.dynamicview.Role#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Role</em>' containment reference list.
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getApplication_HasRole()
	 * @see com.github.icelyframework.dynamicview.Role#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Role> getHasRole();

} // Application
