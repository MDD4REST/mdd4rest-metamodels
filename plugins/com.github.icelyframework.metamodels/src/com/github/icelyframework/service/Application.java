/**
 */
package com.github.icelyframework.service;

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
 *   <li>{@link com.github.icelyframework.service.Application#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Application#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Application#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Application#getComplextypes <em>Complextypes</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Application#getModules <em>Modules</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Application#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getApplication()
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
	 * @see com.github.icelyframework.service.ServicePackage#getApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.github.icelyframework.service.ServicePackage#getApplication_Project()
	 * @see com.github.icelyframework.service.Project#getApplications
	 * @model opposite="applications" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Application#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see com.github.icelyframework.service.ServicePackage#getApplication_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Application#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Complextypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complextypes</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getApplication_Complextypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplextypes();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Module}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Module#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getApplication_Modules()
	 * @see com.github.icelyframework.service.Module#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<com.github.icelyframework.service.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Role}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Role#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getApplication_Roles()
	 * @see com.github.icelyframework.service.Role#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Application
