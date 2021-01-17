/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Aggregate;
import com.github.icelyframework.service.Application;
import com.github.icelyframework.service.Resource;
import com.github.icelyframework.service.Service;
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
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#isExternal <em>External</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ModuleImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements com.github.icelyframework.service.Module {
	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected String persistenceUnit = PERSISTENCE_UNIT_EDEFAULT;

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
	 * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregates()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregate> aggregates;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.MODULE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.MODULE__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersistenceUnit() {
		return persistenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistenceUnit(String newPersistenceUnit) {
		String oldPersistenceUnit = persistenceUnit;
		persistenceUnit = newPersistenceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.MODULE__PERSISTENCE_UNIT, oldPersistenceUnit, persistenceUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregate> getAggregates() {
		if (aggregates == null) {
			aggregates = new EObjectContainmentWithInverseEList<Aggregate>(Aggregate.class, this, ServicePackage.MODULE__AGGREGATES, ServicePackage.AGGREGATE__MODULE);
		}
		return aggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication() {
		if (eContainerFeatureID() != ServicePackage.MODULE__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, ServicePackage.MODULE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != ServicePackage.MODULE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, ServicePackage.APPLICATION__MODULES, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.MODULE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this, ServicePackage.MODULE__SERVICES, ServicePackage.SERVICE__MODULE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, ServicePackage.MODULE__RESOURCES, ServicePackage.RESOURCE__MODULE);
		}
		return resources;
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
			case ServicePackage.MODULE__AGGREGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAggregates()).basicAdd(otherEnd, msgs);
			case ServicePackage.MODULE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
			case ServicePackage.MODULE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
			case ServicePackage.MODULE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case ServicePackage.MODULE__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case ServicePackage.MODULE__APPLICATION:
				return basicSetApplication(null, msgs);
			case ServicePackage.MODULE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ServicePackage.MODULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.MODULE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, ServicePackage.APPLICATION__MODULES, Application.class, msgs);
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
			case ServicePackage.MODULE__EXTERNAL:
				return isExternal();
			case ServicePackage.MODULE__BASE_PACKAGE:
				return getBasePackage();
			case ServicePackage.MODULE__PERSISTENCE_UNIT:
				return getPersistenceUnit();
			case ServicePackage.MODULE__NAME:
				return getName();
			case ServicePackage.MODULE__AGGREGATES:
				return getAggregates();
			case ServicePackage.MODULE__APPLICATION:
				return getApplication();
			case ServicePackage.MODULE__SERVICES:
				return getServices();
			case ServicePackage.MODULE__RESOURCES:
				return getResources();
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
			case ServicePackage.MODULE__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case ServicePackage.MODULE__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case ServicePackage.MODULE__PERSISTENCE_UNIT:
				setPersistenceUnit((String)newValue);
				return;
			case ServicePackage.MODULE__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.MODULE__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends Aggregate>)newValue);
				return;
			case ServicePackage.MODULE__APPLICATION:
				setApplication((Application)newValue);
				return;
			case ServicePackage.MODULE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.MODULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
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
			case ServicePackage.MODULE__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case ServicePackage.MODULE__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case ServicePackage.MODULE__PERSISTENCE_UNIT:
				setPersistenceUnit(PERSISTENCE_UNIT_EDEFAULT);
				return;
			case ServicePackage.MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.MODULE__AGGREGATES:
				getAggregates().clear();
				return;
			case ServicePackage.MODULE__APPLICATION:
				setApplication((Application)null);
				return;
			case ServicePackage.MODULE__SERVICES:
				getServices().clear();
				return;
			case ServicePackage.MODULE__RESOURCES:
				getResources().clear();
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
			case ServicePackage.MODULE__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case ServicePackage.MODULE__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case ServicePackage.MODULE__PERSISTENCE_UNIT:
				return PERSISTENCE_UNIT_EDEFAULT == null ? persistenceUnit != null : !PERSISTENCE_UNIT_EDEFAULT.equals(persistenceUnit);
			case ServicePackage.MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.MODULE__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case ServicePackage.MODULE__APPLICATION:
				return getApplication() != null;
			case ServicePackage.MODULE__SERVICES:
				return services != null && !services.isEmpty();
			case ServicePackage.MODULE__RESOURCES:
				return resources != null && !resources.isEmpty();
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
		result.append(" (external: ");
		result.append(external);
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(", persistenceUnit: ");
		result.append(persistenceUnit);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
