/**
 */
package com.github.icelyframework.deployment;

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
 *   <li>{@link com.github.icelyframework.deployment.Application#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.Application#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.Application#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.Application#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.Application#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplication()
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
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.deployment.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplication_Project()
	 * @see com.github.icelyframework.deployment.Project#getApplications
	 * @model opposite="applications" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.Application#getProject <em>Project</em>}' container reference.
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
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplication_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.Application#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.deployment.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.ApplicationType
	 * @see #setApplicationType(ApplicationType)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplication_ApplicationType()
	 * @model
	 * @generated
	 */
	ApplicationType getApplicationType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.Application#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.ApplicationType
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.deployment.ApplicationDeployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplication_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationDeployment> getDeployment();

} // Application
