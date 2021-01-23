/**
 */
package com.github.icelyframework.configuration;

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
 *   <li>{@link com.github.icelyframework.configuration.Project#getApplications <em>Applications</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Project#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Project#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Project#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Project#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.Application}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.configuration.Application#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject_Applications()
	 * @see com.github.icelyframework.configuration.Application#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Project#getName <em>Name</em>}' attribute.
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
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Project#getBasePath <em>Base Path</em>}' attribute.
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
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Project#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.configuration.ArchitectureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see com.github.icelyframework.configuration.ArchitectureType
	 * @see #setArchitecture(ArchitectureType)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject_Architecture()
	 * @model required="true"
	 * @generated
	 */
	ArchitectureType getArchitecture();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Project#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see com.github.icelyframework.configuration.ArchitectureType
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(ArchitectureType value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.configuration.ProjectConfig#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(ProjectConfig)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getProject_Config()
	 * @see com.github.icelyframework.configuration.ProjectConfig#getProject
	 * @model opposite="project" containment="true" required="true"
	 * @generated
	 */
	ProjectConfig getConfig();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Project#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ProjectConfig value);

} // Project
