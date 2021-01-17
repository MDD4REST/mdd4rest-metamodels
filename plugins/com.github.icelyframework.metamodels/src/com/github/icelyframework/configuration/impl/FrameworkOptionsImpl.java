/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.FrameworkOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.FrameworkOptionsImpl#getFramework_accessimpl_package <em>Framework accessimpl package</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.FrameworkOptionsImpl#getFramework_accessimpl_prefix <em>Framework accessimpl prefix</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.FrameworkOptionsImpl#getFramework_accessapi_packag <em>Framework accessapi packag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameworkOptionsImpl extends EObjectImpl implements FrameworkOptions {
	/**
	 * The default value of the '{@link #getFramework_accessimpl_package() <em>Framework accessimpl package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework_accessimpl_package()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_ACCESSIMPL_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramework_accessimpl_package() <em>Framework accessimpl package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework_accessimpl_package()
	 * @generated
	 * @ordered
	 */
	protected String framework_accessimpl_package = FRAMEWORK_ACCESSIMPL_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramework_accessimpl_prefix() <em>Framework accessimpl prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework_accessimpl_prefix()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_ACCESSIMPL_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramework_accessimpl_prefix() <em>Framework accessimpl prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework_accessimpl_prefix()
	 * @generated
	 * @ordered
	 */
	protected String framework_accessimpl_prefix = FRAMEWORK_ACCESSIMPL_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramework_accessapi_packag() <em>Framework accessapi packag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework_accessapi_packag()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMEWORK_ACCESSAPI_PACKAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramework_accessapi_packag() <em>Framework accessapi packag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework_accessapi_packag()
	 * @generated
	 * @ordered
	 */
	protected String framework_accessapi_packag = FRAMEWORK_ACCESSAPI_PACKAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.FRAMEWORK_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFramework_accessimpl_package() {
		return framework_accessimpl_package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramework_accessimpl_package(String newFramework_accessimpl_package) {
		String oldFramework_accessimpl_package = framework_accessimpl_package;
		framework_accessimpl_package = newFramework_accessimpl_package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE, oldFramework_accessimpl_package, framework_accessimpl_package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFramework_accessimpl_prefix() {
		return framework_accessimpl_prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramework_accessimpl_prefix(String newFramework_accessimpl_prefix) {
		String oldFramework_accessimpl_prefix = framework_accessimpl_prefix;
		framework_accessimpl_prefix = newFramework_accessimpl_prefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX, oldFramework_accessimpl_prefix, framework_accessimpl_prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFramework_accessapi_packag() {
		return framework_accessapi_packag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramework_accessapi_packag(String newFramework_accessapi_packag) {
		String oldFramework_accessapi_packag = framework_accessapi_packag;
		framework_accessapi_packag = newFramework_accessapi_packag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG, oldFramework_accessapi_packag, framework_accessapi_packag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE:
				return getFramework_accessimpl_package();
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX:
				return getFramework_accessimpl_prefix();
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG:
				return getFramework_accessapi_packag();
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
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE:
				setFramework_accessimpl_package((String)newValue);
				return;
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX:
				setFramework_accessimpl_prefix((String)newValue);
				return;
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG:
				setFramework_accessapi_packag((String)newValue);
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
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE:
				setFramework_accessimpl_package(FRAMEWORK_ACCESSIMPL_PACKAGE_EDEFAULT);
				return;
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX:
				setFramework_accessimpl_prefix(FRAMEWORK_ACCESSIMPL_PREFIX_EDEFAULT);
				return;
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG:
				setFramework_accessapi_packag(FRAMEWORK_ACCESSAPI_PACKAG_EDEFAULT);
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
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE:
				return FRAMEWORK_ACCESSIMPL_PACKAGE_EDEFAULT == null ? framework_accessimpl_package != null : !FRAMEWORK_ACCESSIMPL_PACKAGE_EDEFAULT.equals(framework_accessimpl_package);
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX:
				return FRAMEWORK_ACCESSIMPL_PREFIX_EDEFAULT == null ? framework_accessimpl_prefix != null : !FRAMEWORK_ACCESSIMPL_PREFIX_EDEFAULT.equals(framework_accessimpl_prefix);
			case ConfigurationPackage.FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG:
				return FRAMEWORK_ACCESSAPI_PACKAG_EDEFAULT == null ? framework_accessapi_packag != null : !FRAMEWORK_ACCESSAPI_PACKAG_EDEFAULT.equals(framework_accessapi_packag);
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
		result.append(" (framework_accessimpl_package: ");
		result.append(framework_accessimpl_package);
		result.append(", framework_accessimpl_prefix: ");
		result.append(framework_accessimpl_prefix);
		result.append(", framework_accessapi_packag: ");
		result.append(framework_accessapi_packag);
		result.append(')');
		return result.toString();
	}

} //FrameworkOptionsImpl
