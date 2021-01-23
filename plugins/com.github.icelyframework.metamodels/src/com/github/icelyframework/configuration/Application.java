/**
 */
package com.github.icelyframework.configuration;

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
 *   <li>{@link com.github.icelyframework.configuration.Application#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Application#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Application#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Application#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.Application#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplication()
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
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.configuration.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplication_Project()
	 * @see com.github.icelyframework.configuration.Project#getApplications
	 * @model opposite="applications" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Application#getProject <em>Project</em>}' container reference.
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
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplication_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Application#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * The default value is <code>"SCULPTOR_MICROSERVICE"</code>.
	 * The literals are from the enumeration {@link com.github.icelyframework.configuration.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see com.github.icelyframework.configuration.ApplicationType
	 * @see #setApplicationType(ApplicationType)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplication_ApplicationType()
	 * @model default="SCULPTOR_MICROSERVICE"
	 * @generated
	 */
	ApplicationType getApplicationType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Application#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see com.github.icelyframework.configuration.ApplicationType
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(ApplicationConfig)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getApplication_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ApplicationConfig getConfig();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.Application#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ApplicationConfig value);

} // Application
