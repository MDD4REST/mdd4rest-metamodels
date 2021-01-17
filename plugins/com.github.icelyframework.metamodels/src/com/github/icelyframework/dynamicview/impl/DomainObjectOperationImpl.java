/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.DomainObject;
import com.github.icelyframework.dynamicview.DomainObjectOperation;
import com.github.icelyframework.dynamicview.DynamicviewPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.DomainObjectOperationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.DomainObjectOperationImpl#getDomainobject <em>Domainobject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainObjectOperationImpl extends OperationImpl implements DomainObjectOperation {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicviewPackage.Literals.DOMAIN_OBJECT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getDomainobject() {
		if (eContainerFeatureID() != DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainobject(DomainObject newDomainobject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomainobject, DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainobject(DomainObject newDomainobject) {
		if (newDomainobject != eInternalContainer() || (eContainerFeatureID() != DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT && newDomainobject != null)) {
			if (EcoreUtil.isAncestor(this, newDomainobject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomainobject != null)
				msgs = ((InternalEObject)newDomainobject).eInverseAdd(this, DynamicviewPackage.DOMAIN_OBJECT__HAS_OPERATION, DomainObject.class, msgs);
			msgs = basicSetDomainobject(newDomainobject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT, newDomainobject, newDomainobject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomainobject((DomainObject)otherEnd, msgs);
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
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				return basicSetDomainobject(null, msgs);
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
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				return eInternalContainer().eInverseRemove(this, DynamicviewPackage.DOMAIN_OBJECT__HAS_OPERATION, DomainObject.class, msgs);
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
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				return isAbstract();
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				return getDomainobject();
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
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				setDomainobject((DomainObject)newValue);
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
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				setDomainobject((DomainObject)null);
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
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case DynamicviewPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT:
				return getDomainobject() != null;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //DomainObjectOperationImpl
