/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.Multiplicity;
import com.github.icelyframework.jdl.Relationship;
import com.github.icelyframework.jdl.RelationshipColumn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.RelationshipImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.RelationshipImpl#getToName <em>To Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.RelationshipImpl#getFromColumn <em>From Column</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.RelationshipImpl#getFromName <em>From Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationshipImpl extends EObjectImpl implements Relationship {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity.ONE_TO_MANY;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected String toName = TO_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromColumn() <em>From Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromColumn()
	 * @generated
	 * @ordered
	 */
	protected RelationshipColumn fromColumn;

	/**
	 * The default value of the '{@link #getFromName() <em>From Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromName()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromName() <em>From Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromName()
	 * @generated
	 * @ordered
	 */
	protected String fromName = FROM_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.RELATIONSHIP__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return toName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		String oldToName = toName;
		toName = newToName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.RELATIONSHIP__TO_NAME, oldToName, toName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipColumn getFromColumn() {
		return fromColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromColumn(RelationshipColumn newFromColumn, NotificationChain msgs) {
		RelationshipColumn oldFromColumn = fromColumn;
		fromColumn = newFromColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.RELATIONSHIP__FROM_COLUMN, oldFromColumn, newFromColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromColumn(RelationshipColumn newFromColumn) {
		if (newFromColumn != fromColumn) {
			NotificationChain msgs = null;
			if (fromColumn != null)
				msgs = ((InternalEObject)fromColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.RELATIONSHIP__FROM_COLUMN, null, msgs);
			if (newFromColumn != null)
				msgs = ((InternalEObject)newFromColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.RELATIONSHIP__FROM_COLUMN, null, msgs);
			msgs = basicSetFromColumn(newFromColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.RELATIONSHIP__FROM_COLUMN, newFromColumn, newFromColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromName() {
		return fromName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromName(String newFromName) {
		String oldFromName = fromName;
		fromName = newFromName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.RELATIONSHIP__FROM_NAME, oldFromName, fromName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.RELATIONSHIP__FROM_COLUMN:
				return basicSetFromColumn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdlPackage.RELATIONSHIP__MULTIPLICITY:
				return getMultiplicity();
			case JdlPackage.RELATIONSHIP__TO_NAME:
				return getToName();
			case JdlPackage.RELATIONSHIP__FROM_COLUMN:
				return getFromColumn();
			case JdlPackage.RELATIONSHIP__FROM_NAME:
				return getFromName();
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
			case JdlPackage.RELATIONSHIP__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case JdlPackage.RELATIONSHIP__TO_NAME:
				setToName((String)newValue);
				return;
			case JdlPackage.RELATIONSHIP__FROM_COLUMN:
				setFromColumn((RelationshipColumn)newValue);
				return;
			case JdlPackage.RELATIONSHIP__FROM_NAME:
				setFromName((String)newValue);
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
			case JdlPackage.RELATIONSHIP__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case JdlPackage.RELATIONSHIP__TO_NAME:
				setToName(TO_NAME_EDEFAULT);
				return;
			case JdlPackage.RELATIONSHIP__FROM_COLUMN:
				setFromColumn((RelationshipColumn)null);
				return;
			case JdlPackage.RELATIONSHIP__FROM_NAME:
				setFromName(FROM_NAME_EDEFAULT);
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
			case JdlPackage.RELATIONSHIP__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case JdlPackage.RELATIONSHIP__TO_NAME:
				return TO_NAME_EDEFAULT == null ? toName != null : !TO_NAME_EDEFAULT.equals(toName);
			case JdlPackage.RELATIONSHIP__FROM_COLUMN:
				return fromColumn != null;
			case JdlPackage.RELATIONSHIP__FROM_NAME:
				return FROM_NAME_EDEFAULT == null ? fromName != null : !FROM_NAME_EDEFAULT.equals(fromName);
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
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(", toName: ");
		result.append(toName);
		result.append(", fromName: ");
		result.append(fromName);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
