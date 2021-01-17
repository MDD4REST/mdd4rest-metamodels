/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.JPAOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPA Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.JPAOptionsImpl#getJpa_provider <em>Jpa provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPAOptionsImpl extends EObjectImpl implements JPAOptions {
	/**
	 * The default value of the '{@link #getJpa_provider() <em>Jpa provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpa_provider()
	 * @generated
	 * @ordered
	 */
	protected static final String JPA_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJpa_provider() <em>Jpa provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpa_provider()
	 * @generated
	 * @ordered
	 */
	protected String jpa_provider = JPA_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPAOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.JPA_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJpa_provider() {
		return jpa_provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJpa_provider(String newJpa_provider) {
		String oldJpa_provider = jpa_provider;
		jpa_provider = newJpa_provider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.JPA_OPTIONS__JPA_PROVIDER, oldJpa_provider, jpa_provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.JPA_OPTIONS__JPA_PROVIDER:
				return getJpa_provider();
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
			case ConfigurationPackage.JPA_OPTIONS__JPA_PROVIDER:
				setJpa_provider((String)newValue);
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
			case ConfigurationPackage.JPA_OPTIONS__JPA_PROVIDER:
				setJpa_provider(JPA_PROVIDER_EDEFAULT);
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
			case ConfigurationPackage.JPA_OPTIONS__JPA_PROVIDER:
				return JPA_PROVIDER_EDEFAULT == null ? jpa_provider != null : !JPA_PROVIDER_EDEFAULT.equals(jpa_provider);
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
		result.append(" (jpa_provider: ");
		result.append(jpa_provider);
		result.append(')');
		return result.toString();
	}

} //JPAOptionsImpl
