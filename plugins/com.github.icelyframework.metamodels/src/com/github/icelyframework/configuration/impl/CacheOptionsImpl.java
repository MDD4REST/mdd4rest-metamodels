/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.CacheOptions;
import com.github.icelyframework.configuration.ConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.CacheOptionsImpl#getCache_provider <em>Cache provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheOptionsImpl extends EObjectImpl implements CacheOptions {
	/**
	 * The default value of the '{@link #getCache_provider() <em>Cache provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache_provider()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCache_provider() <em>Cache provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache_provider()
	 * @generated
	 * @ordered
	 */
	protected String cache_provider = CACHE_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CACHE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCache_provider() {
		return cache_provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCache_provider(String newCache_provider) {
		String oldCache_provider = cache_provider;
		cache_provider = newCache_provider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CACHE_OPTIONS__CACHE_PROVIDER, oldCache_provider, cache_provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.CACHE_OPTIONS__CACHE_PROVIDER:
				return getCache_provider();
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
			case ConfigurationPackage.CACHE_OPTIONS__CACHE_PROVIDER:
				setCache_provider((String)newValue);
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
			case ConfigurationPackage.CACHE_OPTIONS__CACHE_PROVIDER:
				setCache_provider(CACHE_PROVIDER_EDEFAULT);
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
			case ConfigurationPackage.CACHE_OPTIONS__CACHE_PROVIDER:
				return CACHE_PROVIDER_EDEFAULT == null ? cache_provider != null : !CACHE_PROVIDER_EDEFAULT.equals(cache_provider);
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
		result.append(" (cache_provider: ");
		result.append(cache_provider);
		result.append(')');
		return result.toString();
	}

} //CacheOptionsImpl
