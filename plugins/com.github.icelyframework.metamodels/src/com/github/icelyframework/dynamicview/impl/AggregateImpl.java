/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.Aggregate;
import com.github.icelyframework.dynamicview.Application;
import com.github.icelyframework.dynamicview.DomainObject;
import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.Resource;

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
 *   <li>{@link com.github.icelyframework.dynamicview.impl.AggregateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.AggregateImpl#getHasProcess <em>Has Process</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.AggregateImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.AggregateImpl#getDomainobjects <em>Domainobjects</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.AggregateImpl#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.AggregateImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends EObjectImpl implements Aggregate {
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
	 * The cached value of the '{@link #getHasProcess() <em>Has Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<com.github.icelyframework.dynamicview.Process> hasProcess;

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
		return DynamicviewPackage.Literals.AGGREGATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.AGGREGATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<com.github.icelyframework.dynamicview.Process> getHasProcess() {
		if (hasProcess == null) {
			hasProcess = new EObjectContainmentWithInverseEList<com.github.icelyframework.dynamicview.Process>(com.github.icelyframework.dynamicview.Process.class, this, DynamicviewPackage.AGGREGATE__HAS_PROCESS, DynamicviewPackage.PROCESS__AGGREGATE);
		}
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication() {
		if (eContainerFeatureID() != DynamicviewPackage.AGGREGATE__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, DynamicviewPackage.AGGREGATE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != DynamicviewPackage.AGGREGATE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, DynamicviewPackage.APPLICATION__HAS_AGGREGATE, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.AGGREGATE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObject> getDomainobjects() {
		if (domainobjects == null) {
			domainobjects = new EObjectContainmentWithInverseEList<DomainObject>(DomainObject.class, this, DynamicviewPackage.AGGREGATE__DOMAINOBJECTS, DynamicviewPackage.DOMAIN_OBJECT__AGGREGATE);
		}
		return domainobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasResource() {
		if (hasResource == null) {
			hasResource = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, DynamicviewPackage.AGGREGATE__HAS_RESOURCE, DynamicviewPackage.RESOURCE__AGGREGATE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicviewPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
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
			case DynamicviewPackage.AGGREGATE__HAS_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasProcess()).basicAdd(otherEnd, msgs);
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
			case DynamicviewPackage.AGGREGATE__DOMAINOBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainobjects()).basicAdd(otherEnd, msgs);
			case DynamicviewPackage.AGGREGATE__HAS_RESOURCE:
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
			case DynamicviewPackage.AGGREGATE__HAS_PROCESS:
				return ((InternalEList<?>)getHasProcess()).basicRemove(otherEnd, msgs);
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				return basicSetApplication(null, msgs);
			case DynamicviewPackage.AGGREGATE__DOMAINOBJECTS:
				return ((InternalEList<?>)getDomainobjects()).basicRemove(otherEnd, msgs);
			case DynamicviewPackage.AGGREGATE__HAS_RESOURCE:
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
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, DynamicviewPackage.APPLICATION__HAS_AGGREGATE, Application.class, msgs);
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
			case DynamicviewPackage.AGGREGATE__NAME:
				return getName();
			case DynamicviewPackage.AGGREGATE__HAS_PROCESS:
				return getHasProcess();
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				return getApplication();
			case DynamicviewPackage.AGGREGATE__DOMAINOBJECTS:
				return getDomainobjects();
			case DynamicviewPackage.AGGREGATE__HAS_RESOURCE:
				return getHasResource();
			case DynamicviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
			case DynamicviewPackage.AGGREGATE__NAME:
				setName((String)newValue);
				return;
			case DynamicviewPackage.AGGREGATE__HAS_PROCESS:
				getHasProcess().clear();
				getHasProcess().addAll((Collection<? extends com.github.icelyframework.dynamicview.Process>)newValue);
				return;
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				setApplication((Application)newValue);
				return;
			case DynamicviewPackage.AGGREGATE__DOMAINOBJECTS:
				getDomainobjects().clear();
				getDomainobjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case DynamicviewPackage.AGGREGATE__HAS_RESOURCE:
				getHasResource().clear();
				getHasResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case DynamicviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
			case DynamicviewPackage.AGGREGATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicviewPackage.AGGREGATE__HAS_PROCESS:
				getHasProcess().clear();
				return;
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				setApplication((Application)null);
				return;
			case DynamicviewPackage.AGGREGATE__DOMAINOBJECTS:
				getDomainobjects().clear();
				return;
			case DynamicviewPackage.AGGREGATE__HAS_RESOURCE:
				getHasResource().clear();
				return;
			case DynamicviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
			case DynamicviewPackage.AGGREGATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicviewPackage.AGGREGATE__HAS_PROCESS:
				return hasProcess != null && !hasProcess.isEmpty();
			case DynamicviewPackage.AGGREGATE__APPLICATION:
				return getApplication() != null;
			case DynamicviewPackage.AGGREGATE__DOMAINOBJECTS:
				return domainobjects != null && !domainobjects.isEmpty();
			case DynamicviewPackage.AGGREGATE__HAS_RESOURCE:
				return hasResource != null && !hasResource.isEmpty();
			case DynamicviewPackage.AGGREGATE__AGGREGATE_ROOT:
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
