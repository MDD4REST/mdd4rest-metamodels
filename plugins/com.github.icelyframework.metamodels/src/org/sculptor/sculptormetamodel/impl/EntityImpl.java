/**
 */
package org.sculptor.sculptormetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sculptor.sculptormetamodel.Entity;
import org.sculptor.sculptormetamodel.SculptormetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.impl.EntityImpl#isAuditable <em>Auditable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends DomainObjectImpl implements Entity {
	/**
	 * The default value of the '{@link #isAuditable() <em>Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAuditable() <em>Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuditable()
	 * @generated
	 * @ordered
	 */
	protected boolean auditable = AUDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuditable() {
		return auditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditable(boolean newAuditable) {
		boolean oldAuditable = auditable;
		auditable = newAuditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.ENTITY__AUDITABLE, oldAuditable, auditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SculptormetamodelPackage.ENTITY__AUDITABLE:
				return isAuditable();
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
			case SculptormetamodelPackage.ENTITY__AUDITABLE:
				setAuditable((Boolean)newValue);
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
			case SculptormetamodelPackage.ENTITY__AUDITABLE:
				setAuditable(AUDITABLE_EDEFAULT);
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
			case SculptormetamodelPackage.ENTITY__AUDITABLE:
				return auditable != AUDITABLE_EDEFAULT;
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
		result.append(" (auditable: ");
		result.append(auditable);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
