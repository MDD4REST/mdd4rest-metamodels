/**
 */
package com.github.icelyframework.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbType <em>Db Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.ApplicationDeployment#getServerType <em>Server Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment()
 * @model
 * @generated
 */
public interface ApplicationDeployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Path</em>' attribute.
	 * @see #setDirectoryPath(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_DirectoryPath()
	 * @model
	 * @generated
	 */
	String getDirectoryPath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDirectoryPath <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Path</em>' attribute.
	 * @see #getDirectoryPath()
	 * @generated
	 */
	void setDirectoryPath(String value);

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_DbPassword()
	 * @model
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db IP</em>' attribute.
	 * @see #setDbIP(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_DbIP()
	 * @model
	 * @generated
	 */
	String getDbIP();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbIP <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db IP</em>' attribute.
	 * @see #getDbIP()
	 * @generated
	 */
	void setDbIP(String value);

	/**
	 * Returns the value of the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Username</em>' attribute.
	 * @see #setDbUsername(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_DbUsername()
	 * @model
	 * @generated
	 */
	String getDbUsername();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbUsername <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Username</em>' attribute.
	 * @see #getDbUsername()
	 * @generated
	 */
	void setDbUsername(String value);

	/**
	 * Returns the value of the '<em><b>Db Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Port</em>' attribute.
	 * @see #setDbPort(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_DbPort()
	 * @model
	 * @generated
	 */
	String getDbPort();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbPort <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Port</em>' attribute.
	 * @see #getDbPort()
	 * @generated
	 */
	void setDbPort(String value);

	/**
	 * Returns the value of the '<em><b>Db Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.deployment.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.DatabaseType
	 * @see #setDbType(DatabaseType)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_DbType()
	 * @model
	 * @generated
	 */
	DatabaseType getDbType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getDbType <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Type</em>' attribute.
	 * @see com.github.icelyframework.deployment.DatabaseType
	 * @see #getDbType()
	 * @generated
	 */
	void setDbType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Server Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Type</em>' attribute.
	 * @see #setServerType(String)
	 * @see com.github.icelyframework.deployment.DeploymentPackage#getApplicationDeployment_ServerType()
	 * @model
	 * @generated
	 */
	String getServerType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.deployment.ApplicationDeployment#getServerType <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Type</em>' attribute.
	 * @see #getServerType()
	 * @generated
	 */
	void setServerType(String value);

} // ApplicationDeployment
