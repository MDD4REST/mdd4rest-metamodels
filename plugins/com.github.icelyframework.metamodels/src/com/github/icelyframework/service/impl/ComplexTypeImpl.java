/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.CollectionType;
import com.github.icelyframework.service.ComplexType;
import com.github.icelyframework.service.ServicePackage;
import com.github.icelyframework.service.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.ComplexTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ComplexTypeImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ComplexTypeImpl#getMappedType <em>Mapped Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeImpl extends TypeDefinitionImpl implements ComplexType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;

	/**
	 * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionType COLLECTION_EDEFAULT = CollectionType.SET;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected CollectionType collection = COLLECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappedType() <em>Mapped Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition mappedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeDefinition)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.COMPLEX_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeDefinition newType) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMPLEX_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(CollectionType newCollection) {
		CollectionType oldCollection = collection;
		collection = newCollection == null ? COLLECTION_EDEFAULT : newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMPLEX_TYPE__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getMappedType() {
		if (mappedType != null && mappedType.eIsProxy()) {
			InternalEObject oldMappedType = (InternalEObject)mappedType;
			mappedType = (TypeDefinition)eResolveProxy(oldMappedType);
			if (mappedType != oldMappedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.COMPLEX_TYPE__MAPPED_TYPE, oldMappedType, mappedType));
			}
		}
		return mappedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetMappedType() {
		return mappedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappedType(TypeDefinition newMappedType) {
		TypeDefinition oldMappedType = mappedType;
		mappedType = newMappedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMPLEX_TYPE__MAPPED_TYPE, oldMappedType, mappedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.COMPLEX_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ServicePackage.COMPLEX_TYPE__COLLECTION:
				return getCollection();
			case ServicePackage.COMPLEX_TYPE__MAPPED_TYPE:
				if (resolve) return getMappedType();
				return basicGetMappedType();
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
			case ServicePackage.COMPLEX_TYPE__TYPE:
				setType((TypeDefinition)newValue);
				return;
			case ServicePackage.COMPLEX_TYPE__COLLECTION:
				setCollection((CollectionType)newValue);
				return;
			case ServicePackage.COMPLEX_TYPE__MAPPED_TYPE:
				setMappedType((TypeDefinition)newValue);
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
			case ServicePackage.COMPLEX_TYPE__TYPE:
				setType((TypeDefinition)null);
				return;
			case ServicePackage.COMPLEX_TYPE__COLLECTION:
				setCollection(COLLECTION_EDEFAULT);
				return;
			case ServicePackage.COMPLEX_TYPE__MAPPED_TYPE:
				setMappedType((TypeDefinition)null);
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
			case ServicePackage.COMPLEX_TYPE__TYPE:
				return type != null;
			case ServicePackage.COMPLEX_TYPE__COLLECTION:
				return collection != COLLECTION_EDEFAULT;
			case ServicePackage.COMPLEX_TYPE__MAPPED_TYPE:
				return mappedType != null;
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
		result.append(" (collection: ");
		result.append(collection);
		result.append(')');
		return result.toString();
	}

} //ComplexTypeImpl
