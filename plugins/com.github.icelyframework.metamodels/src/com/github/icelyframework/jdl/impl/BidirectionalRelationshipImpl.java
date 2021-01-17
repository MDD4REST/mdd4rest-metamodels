/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.BidirectionalRelationship;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.RelationshipColumn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bidirectional Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.BidirectionalRelationshipImpl#getToColumn <em>To Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BidirectionalRelationshipImpl extends RelationshipImpl implements BidirectionalRelationship {
	/**
	 * The cached value of the '{@link #getToColumn() <em>To Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToColumn()
	 * @generated
	 * @ordered
	 */
	protected RelationshipColumn toColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BidirectionalRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.BIDIRECTIONAL_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipColumn getToColumn() {
		return toColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToColumn(RelationshipColumn newToColumn, NotificationChain msgs) {
		RelationshipColumn oldToColumn = toColumn;
		toColumn = newToColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN, oldToColumn, newToColumn);
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
	public void setToColumn(RelationshipColumn newToColumn) {
		if (newToColumn != toColumn) {
			NotificationChain msgs = null;
			if (toColumn != null)
				msgs = ((InternalEObject)toColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN, null, msgs);
			if (newToColumn != null)
				msgs = ((InternalEObject)newToColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN, null, msgs);
			msgs = basicSetToColumn(newToColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN, newToColumn, newToColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN:
				return basicSetToColumn(null, msgs);
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
			case JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN:
				return getToColumn();
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
			case JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN:
				setToColumn((RelationshipColumn)newValue);
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
			case JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN:
				setToColumn((RelationshipColumn)null);
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
			case JdlPackage.BIDIRECTIONAL_RELATIONSHIP__TO_COLUMN:
				return toColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //BidirectionalRelationshipImpl
