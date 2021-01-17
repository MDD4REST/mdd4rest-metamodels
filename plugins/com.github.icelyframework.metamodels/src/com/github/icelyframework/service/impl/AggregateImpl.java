/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Aggregate;
import com.github.icelyframework.service.DomainObject;
import com.github.icelyframework.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.AggregateImpl#getDomainobjects <em>Domainobjects</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.AggregateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.AggregateImpl#getModule <em>Module</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.AggregateImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends EObjectImpl implements Aggregate {
	/**
	 * The cached value of the '{@link #getDomainobjects() <em>Domainobjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainobjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainobjects;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAggregateRoot() <em>Aggregate Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected DomainObject aggregateRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObject> getDomainobjects() {
		if (domainobjects == null) {
			domainobjects = new EObjectContainmentWithInverseEList<DomainObject>(DomainObject.class, this, ServicePackage.AGGREGATE__DOMAINOBJECTS, ServicePackage.DOMAIN_OBJECT__AGGREGATE);
		}
		return domainobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.AGGREGATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.github.icelyframework.service.Module getModule() {
		if (eContainerFeatureID() != ServicePackage.AGGREGATE__MODULE) return null;
		return (com.github.icelyframework.service.Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(com.github.icelyframework.service.Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, ServicePackage.AGGREGATE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(com.github.icelyframework.service.Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != ServicePackage.AGGREGATE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, ServicePackage.MODULE__AGGREGATES, com.github.icelyframework.service.Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.AGGREGATE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getAggregateRoot() {
		if (aggregateRoot != null && aggregateRoot.eIsProxy()) {
			InternalEObject oldAggregateRoot = (InternalEObject)aggregateRoot;
			aggregateRoot = (DomainObject)eResolveProxy(oldAggregateRoot);
			if (aggregateRoot != oldAggregateRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
			}
		}
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetAggregateRoot() {
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateRoot(DomainObject newAggregateRoot) {
		DomainObject oldAggregateRoot = aggregateRoot;
		aggregateRoot = newAggregateRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.AGGREGATE__DOMAINOBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainobjects()).basicAdd(otherEnd, msgs);
			case ServicePackage.AGGREGATE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((com.github.icelyframework.service.Module)otherEnd, msgs);
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
			case ServicePackage.AGGREGATE__DOMAINOBJECTS:
				return ((InternalEList<?>)getDomainobjects()).basicRemove(otherEnd, msgs);
			case ServicePackage.AGGREGATE__MODULE:
				return basicSetModule(null, msgs);
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
			case ServicePackage.AGGREGATE__MODULE:
				return eInternalContainer().eInverseRemove(this, ServicePackage.MODULE__AGGREGATES, com.github.icelyframework.service.Module.class, msgs);
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
			case ServicePackage.AGGREGATE__DOMAINOBJECTS:
				return getDomainobjects();
			case ServicePackage.AGGREGATE__NAME:
				return getName();
			case ServicePackage.AGGREGATE__MODULE:
				return getModule();
			case ServicePackage.AGGREGATE__AGGREGATE_ROOT:
				if (resolve) return getAggregateRoot();
				return basicGetAggregateRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.AGGREGATE__DOMAINOBJECTS:
				getDomainobjects().clear();
				getDomainobjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case ServicePackage.AGGREGATE__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.AGGREGATE__MODULE:
				setModule((com.github.icelyframework.service.Module)newValue);
				return;
			case ServicePackage.AGGREGATE__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)newValue);
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
			case ServicePackage.AGGREGATE__DOMAINOBJECTS:
				getDomainobjects().clear();
				return;
			case ServicePackage.AGGREGATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.AGGREGATE__MODULE:
				setModule((com.github.icelyframework.service.Module)null);
				return;
			case ServicePackage.AGGREGATE__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)null);
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
			case ServicePackage.AGGREGATE__DOMAINOBJECTS:
				return domainobjects != null && !domainobjects.isEmpty();
			case ServicePackage.AGGREGATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.AGGREGATE__MODULE:
				return getModule() != null;
			case ServicePackage.AGGREGATE__AGGREGATE_ROOT:
				return aggregateRoot != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AggregateImpl
