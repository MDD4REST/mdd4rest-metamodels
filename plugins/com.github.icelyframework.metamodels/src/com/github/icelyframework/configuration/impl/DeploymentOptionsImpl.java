/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.DeploymentOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.DeploymentOptionsImpl#getDeployment_applicationServer <em>Deployment application Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentOptionsImpl extends EObjectImpl implements DeploymentOptions {
	/**
	 * The default value of the '{@link #getDeployment_applicationServer() <em>Deployment application Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment_applicationServer()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_APPLICATION_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployment_applicationServer() <em>Deployment application Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment_applicationServer()
	 * @generated
	 * @ordered
	 */
	protected String deployment_applicationServer = DEPLOYMENT_APPLICATION_SERVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.DEPLOYMENT_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeployment_applicationServer() {
		return deployment_applicationServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployment_applicationServer(String newDeployment_applicationServer) {
		String oldDeployment_applicationServer = deployment_applicationServer;
		deployment_applicationServer = newDeployment_applicationServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER, oldDeployment_applicationServer, deployment_applicationServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER:
				return getDeployment_applicationServer();
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
			case ConfigurationPackage.DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER:
				setDeployment_applicationServer((String)newValue);
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
			case ConfigurationPackage.DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER:
				setDeployment_applicationServer(DEPLOYMENT_APPLICATION_SERVER_EDEFAULT);
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
			case ConfigurationPackage.DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER:
				return DEPLOYMENT_APPLICATION_SERVER_EDEFAULT == null ? deployment_applicationServer != null : !DEPLOYMENT_APPLICATION_SERVER_EDEFAULT.equals(deployment_applicationServer);
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
		result.append(" (deployment_applicationServer: ");
		result.append(deployment_applicationServer);
		result.append(')');
		return result.toString();
	}

} //DeploymentOptionsImpl
