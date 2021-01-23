/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.Application;
import com.github.icelyframework.configuration.ApplicationConfig;
import com.github.icelyframework.configuration.ConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.ApplicationConfigImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.ApplicationConfigImpl#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.ApplicationConfigImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ApplicationConfigImpl extends EObjectImpl implements ApplicationConfig {
	/**
	 * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected String baseName = BASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected String servicePort = SERVICE_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.APPLICATION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseName() {
		return baseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseName(String newBaseName) {
		String oldBaseName = baseName;
		baseName = newBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.APPLICATION_CONFIG__BASE_NAME, oldBaseName, baseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServicePort() {
		return servicePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServicePort(String newServicePort) {
		String oldServicePort = servicePort;
		servicePort = newServicePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.APPLICATION_CONFIG__SERVICE_PORT, oldServicePort, servicePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication() {
		if (eContainerFeatureID() != ConfigurationPackage.APPLICATION_CONFIG__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, ConfigurationPackage.APPLICATION_CONFIG__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != ConfigurationPackage.APPLICATION_CONFIG__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, ConfigurationPackage.APPLICATION__CONFIG, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.APPLICATION_CONFIG__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				return basicSetApplication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				return eInternalContainer().eInverseRemove(this, ConfigurationPackage.APPLICATION__CONFIG, Application.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.APPLICATION_CONFIG__BASE_NAME:
				return getBaseName();
			case ConfigurationPackage.APPLICATION_CONFIG__SERVICE_PORT:
				return getServicePort();
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				return getApplication();
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
			case ConfigurationPackage.APPLICATION_CONFIG__BASE_NAME:
				setBaseName((String)newValue);
				return;
			case ConfigurationPackage.APPLICATION_CONFIG__SERVICE_PORT:
				setServicePort((String)newValue);
				return;
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				setApplication((Application)newValue);
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
			case ConfigurationPackage.APPLICATION_CONFIG__BASE_NAME:
				setBaseName(BASE_NAME_EDEFAULT);
				return;
			case ConfigurationPackage.APPLICATION_CONFIG__SERVICE_PORT:
				setServicePort(SERVICE_PORT_EDEFAULT);
				return;
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				setApplication((Application)null);
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
			case ConfigurationPackage.APPLICATION_CONFIG__BASE_NAME:
				return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
			case ConfigurationPackage.APPLICATION_CONFIG__SERVICE_PORT:
				return SERVICE_PORT_EDEFAULT == null ? servicePort != null : !SERVICE_PORT_EDEFAULT.equals(servicePort);
			case ConfigurationPackage.APPLICATION_CONFIG__APPLICATION:
				return getApplication() != null;
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
		result.append(" (baseName: ");
		result.append(baseName);
		result.append(", servicePort: ");
		result.append(servicePort);
		result.append(')');
		return result.toString();
	}

} //ApplicationConfigImpl
