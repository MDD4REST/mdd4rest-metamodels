/**
 */
package com.github.icelyframework.service;

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
 *   <li>{@link com.github.icelyframework.service.Project#getApplications <em>Applications</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Project#getPrimitivetype <em>Primitivetype</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Project#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Project#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Project#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Application}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getProject_Applications()
	 * @see com.github.icelyframework.service.Application#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Primitivetype</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitivetype</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getProject_Primitivetype()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitivetype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Project#getName <em>Name</em>}' attribute.
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
	 * @see com.github.icelyframework.service.ServicePackage#getProject_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Project#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProject_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Project#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.ArchitectureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see com.github.icelyframework.service.ArchitectureType
	 * @see #setArchitecture(ArchitectureType)
	 * @see com.github.icelyframework.service.ServicePackage#getProject_Architecture()
	 * @model required="true"
	 * @generated
	 */
	ArchitectureType getArchitecture();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Project#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see com.github.icelyframework.service.ArchitectureType
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(ArchitectureType value);

} // Project
