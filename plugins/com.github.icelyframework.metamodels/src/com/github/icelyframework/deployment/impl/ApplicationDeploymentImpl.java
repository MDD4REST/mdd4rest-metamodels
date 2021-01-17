/**
 */
package com.github.icelyframework.deployment.impl;

import com.github.icelyframework.deployment.ApplicationDeployment;
import com.github.icelyframework.deployment.DatabaseType;
import com.github.icelyframework.deployment.DeploymentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link com.github.icelyframework.deployment.impl.ApplicationDeploymentImpl#getServerType <em>Server Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationDeploymentImpl extends EObjectImpl implements ApplicationDeployment {
	/**
	 * The default value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryPath() <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryPath()
	 * @generated
	 * @ordered
	 */
	protected String directoryPath = DIRECTORY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected String dbPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbIP() <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbIP()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbIP() <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbIP()
	 * @generated
	 * @ordered
	 */
	protected String dbIP = DB_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsername()
	 * @generated
	 * @ordered
	 */
	protected String dbUsername = DB_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPort() <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPort()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPort() <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPort()
	 * @generated
	 * @ordered
	 */
	protected String dbPort = DB_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbType()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseType DB_TYPE_EDEFAULT = DatabaseType.SQL;

	/**
	 * The cached value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbType()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType dbType = DB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected String serverType = SERVER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.APPLICATION_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirectoryPath() {
		return directoryPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryPath(String newDirectoryPath) {
		String oldDirectoryPath = directoryPath;
		directoryPath = newDirectoryPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__DIRECTORY_PATH, oldDirectoryPath, directoryPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbPassword(String newDbPassword) {
		String oldDbPassword = dbPassword;
		dbPassword = newDbPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbIP() {
		return dbIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbIP(String newDbIP) {
		String oldDbIP = dbIP;
		dbIP = newDbIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__DB_IP, oldDbIP, dbIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbUsername() {
		return dbUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbUsername(String newDbUsername) {
		String oldDbUsername = dbUsername;
		dbUsername = newDbUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__DB_USERNAME, oldDbUsername, dbUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbPort() {
		return dbPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbPort(String newDbPort) {
		String oldDbPort = dbPort;
		dbPort = newDbPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PORT, oldDbPort, dbPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseType getDbType() {
		return dbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbType(DatabaseType newDbType) {
		DatabaseType oldDbType = dbType;
		dbType = newDbType == null ? DB_TYPE_EDEFAULT : newDbType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__DB_TYPE, oldDbType, dbType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerType() {
		return serverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerType(String newServerType) {
		String oldServerType = serverType;
		serverType = newServerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.APPLICATION_DEPLOYMENT__SERVER_TYPE, oldServerType, serverType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DIRECTORY_PATH:
				return getDirectoryPath();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PASSWORD:
				return getDbPassword();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__NAME:
				return getName();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_IP:
				return getDbIP();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_USERNAME:
				return getDbUsername();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PORT:
				return getDbPort();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_TYPE:
				return getDbType();
			case DeploymentPackage.APPLICATION_DEPLOYMENT__SERVER_TYPE:
				return getServerType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DIRECTORY_PATH:
				setDirectoryPath((String)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PASSWORD:
				setDbPassword((String)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__NAME:
				setName((String)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_IP:
				setDbIP((String)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_USERNAME:
				setDbUsername((String)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PORT:
				setDbPort((String)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_TYPE:
				setDbType((DatabaseType)newValue);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__SERVER_TYPE:
				setServerType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DIRECTORY_PATH:
				setDirectoryPath(DIRECTORY_PATH_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PASSWORD:
				setDbPassword(DB_PASSWORD_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_IP:
				setDbIP(DB_IP_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_USERNAME:
				setDbUsername(DB_USERNAME_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PORT:
				setDbPort(DB_PORT_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_TYPE:
				setDbType(DB_TYPE_EDEFAULT);
				return;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__SERVER_TYPE:
				setServerType(SERVER_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DIRECTORY_PATH:
				return DIRECTORY_PATH_EDEFAULT == null ? directoryPath != null : !DIRECTORY_PATH_EDEFAULT.equals(directoryPath);
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
			case DeploymentPackage.APPLICATION_DEPLOYMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_IP:
				return DB_IP_EDEFAULT == null ? dbIP != null : !DB_IP_EDEFAULT.equals(dbIP);
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_USERNAME:
				return DB_USERNAME_EDEFAULT == null ? dbUsername != null : !DB_USERNAME_EDEFAULT.equals(dbUsername);
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_PORT:
				return DB_PORT_EDEFAULT == null ? dbPort != null : !DB_PORT_EDEFAULT.equals(dbPort);
			case DeploymentPackage.APPLICATION_DEPLOYMENT__DB_TYPE:
				return dbType != DB_TYPE_EDEFAULT;
			case DeploymentPackage.APPLICATION_DEPLOYMENT__SERVER_TYPE:
				return SERVER_TYPE_EDEFAULT == null ? serverType != null : !SERVER_TYPE_EDEFAULT.equals(serverType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (directoryPath: ");
		result.append(directoryPath);
		result.append(", dbPassword: ");
		result.append(dbPassword);
		result.append(", name: ");
		result.append(name);
		result.append(", dbIP: ");
		result.append(dbIP);
		result.append(", dbUsername: ");
		result.append(dbUsername);
		result.append(", dbPort: ");
		result.append(dbPort);
		result.append(", dbType: ");
		result.append(dbType);
		result.append(", serverType: ");
		result.append(serverType);
		result.append(')');
		return result.toString();
	}

} //ApplicationDeploymentImpl
