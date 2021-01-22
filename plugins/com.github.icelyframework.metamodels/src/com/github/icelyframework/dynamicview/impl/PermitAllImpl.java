/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.PermitAll;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permit All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.PermitAllImpl#isWithAllSubresources <em>With All Subresources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermitAllImpl extends PermissionImpl implements PermitAll {
	/**
	 * The default value of the '{@link #isWithAllSubresources() <em>With All Subresources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithAllSubresources()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_ALL_SUBRESOURCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWithAllSubresources() <em>With All Subresources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithAllSubresources()
	 * @generated
	 * @ordered
	 */
	protected boolean withAllSubresources = WITH_ALL_SUBRESOURCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermitAllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicviewPackage.Literals.PERMIT_ALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWithAllSubresources() {
		return withAllSubresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWithAllSubresources(boolean newWithAllSubresources) {
		boolean oldWithAllSubresources = withAllSubresources;
		withAllSubresources = newWithAllSubresources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PERMIT_ALL__WITH_ALL_SUBRESOURCES, oldWithAllSubresources, withAllSubresources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicviewPackage.PERMIT_ALL__WITH_ALL_SUBRESOURCES:
				return isWithAllSubresources();
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
			case DynamicviewPackage.PERMIT_ALL__WITH_ALL_SUBRESOURCES:
				setWithAllSubresources((Boolean)newValue);
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
			case DynamicviewPackage.PERMIT_ALL__WITH_ALL_SUBRESOURCES:
				setWithAllSubresources(WITH_ALL_SUBRESOURCES_EDEFAULT);
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
			case DynamicviewPackage.PERMIT_ALL__WITH_ALL_SUBRESOURCES:
				return withAllSubresources != WITH_ALL_SUBRESOURCES_EDEFAULT;
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
		result.append(" (withAllSubresources: ");
		result.append(withAllSubresources);
		result.append(')');
		return result.toString();
	}

} //PermitAllImpl
