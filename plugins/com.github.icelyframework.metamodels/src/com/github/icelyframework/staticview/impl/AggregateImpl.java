/**
 */
package com.github.icelyframework.staticview.impl;

import com.github.icelyframework.staticview.Aggregate;
import com.github.icelyframework.staticview.Application;
import com.github.icelyframework.staticview.DomainObject;
import com.github.icelyframework.staticview.Resource;
import com.github.icelyframework.staticview.StaticviewPackage;

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
 *   <li>{@link com.github.icelyframework.staticview.impl.AggregateImpl#getHasDomainobject <em>Has Domainobject</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.AggregateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.AggregateImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.AggregateImpl#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.AggregateImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends EObjectImpl implements Aggregate {
	/**
	 * The cached value of the '{@link #getHasDomainobject() <em>Has Domainobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDomainobject()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> hasDomainobject;

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
	 * The cached value of the '{@link #getHasResource() <em>Has Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResource;

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
		return StaticviewPackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObject> getHasDomainobject() {
		if (hasDomainobject == null) {
			hasDomainobject = new EObjectContainmentWithInverseEList<DomainObject>(DomainObject.class, this, StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT, StaticviewPackage.DOMAIN_OBJECT__AGGREGATE);
		}
		return hasDomainobject;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.AGGREGATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication() {
		if (eContainerFeatureID() != StaticviewPackage.AGGREGATE__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, StaticviewPackage.AGGREGATE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != StaticviewPackage.AGGREGATE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, StaticviewPackage.APPLICATION__HAS_AGGREGATE, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.AGGREGATE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasResource() {
		if (hasResource == null) {
			hasResource = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, StaticviewPackage.AGGREGATE__HAS_RESOURCE, StaticviewPackage.RESOURCE__AGGREGATE);
		}
		return hasResource;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticviewPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
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
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDomainobject()).basicAdd(otherEnd, msgs);
			case StaticviewPackage.AGGREGATE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasResource()).basicAdd(otherEnd, msgs);
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
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
				return ((InternalEList<?>)getHasDomainobject()).basicRemove(otherEnd, msgs);
			case StaticviewPackage.AGGREGATE__APPLICATION:
				return basicSetApplication(null, msgs);
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
				return ((InternalEList<?>)getHasResource()).basicRemove(otherEnd, msgs);
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
			case StaticviewPackage.AGGREGATE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, StaticviewPackage.APPLICATION__HAS_AGGREGATE, Application.class, msgs);
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
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
				return getHasDomainobject();
			case StaticviewPackage.AGGREGATE__NAME:
				return getName();
			case StaticviewPackage.AGGREGATE__APPLICATION:
				return getApplication();
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
				return getHasResource();
			case StaticviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
				getHasDomainobject().clear();
				getHasDomainobject().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case StaticviewPackage.AGGREGATE__NAME:
				setName((String)newValue);
				return;
			case StaticviewPackage.AGGREGATE__APPLICATION:
				setApplication((Application)newValue);
				return;
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
				getHasResource().clear();
				getHasResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case StaticviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
				getHasDomainobject().clear();
				return;
			case StaticviewPackage.AGGREGATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticviewPackage.AGGREGATE__APPLICATION:
				setApplication((Application)null);
				return;
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
				getHasResource().clear();
				return;
			case StaticviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
				return hasDomainobject != null && !hasDomainobject.isEmpty();
			case StaticviewPackage.AGGREGATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticviewPackage.AGGREGATE__APPLICATION:
				return getApplication() != null;
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
				return hasResource != null && !hasResource.isEmpty();
			case StaticviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
