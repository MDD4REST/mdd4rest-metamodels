/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.Entity;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.UnidirectionalRelationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unidirectional Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.UnidirectionalRelationshipImpl#getToEntity <em>To Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnidirectionalRelationshipImpl extends RelationshipImpl implements UnidirectionalRelationship {
	/**
	 * The cached value of the '{@link #getToEntity() <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity toEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnidirectionalRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.UNIDIRECTIONAL_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getToEntity() {
		if (toEntity != null && toEntity.eIsProxy()) {
			InternalEObject oldToEntity = (InternalEObject)toEntity;
			toEntity = (Entity)eResolveProxy(oldToEntity);
			if (toEntity != oldToEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JdlPackage.UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
			}
		}
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetToEntity() {
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToEntity(Entity newToEntity) {
		Entity oldToEntity = toEntity;
		toEntity = newToEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdlPackage.UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY:
				if (resolve) return getToEntity();
				return basicGetToEntity();
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
			case JdlPackage.UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)newValue);
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
			case JdlPackage.UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)null);
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
			case JdlPackage.UNIDIRECTIONAL_RELATIONSHIP__TO_ENTITY:
				return toEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //UnidirectionalRelationshipImpl
