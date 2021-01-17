/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.DomainObject;
import com.github.icelyframework.service.Repository;
import com.github.icelyframework.service.RepositoryOperation;
import com.github.icelyframework.service.ServicePackage;
import com.github.icelyframework.service.Subscribe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends EObjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryOperation> operations;

	/**
	 * The cached value of the '{@link #getRepositoryDependencies() <em>Repository Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositoryDependencies;

	/**
	 * The cached value of the '{@link #getOtherDependencies() <em>Other Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDependencies;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected Subscribe subscribe;

	/**
	 * The default value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean gapClass = GAP_CLASS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RepositoryOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<RepositoryOperation>(RepositoryOperation.class, this, ServicePackage.REPOSITORY__OPERATIONS, ServicePackage.REPOSITORY_OPERATION__REPOSITORY);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepositoryDependencies() {
		if (repositoryDependencies == null) {
			repositoryDependencies = new EObjectResolvingEList<Repository>(Repository.class, this, ServicePackage.REPOSITORY__REPOSITORY_DEPENDENCIES);
		}
		return repositoryDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDependencies() {
		if (otherDependencies == null) {
			otherDependencies = new EDataTypeUniqueEList<String>(String.class, this, ServicePackage.REPOSITORY__OTHER_DEPENDENCIES);
		}
		return otherDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscribe getSubscribe() {
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribe(Subscribe newSubscribe, NotificationChain msgs) {
		Subscribe oldSubscribe = subscribe;
		subscribe = newSubscribe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY__SUBSCRIBE, oldSubscribe, newSubscribe);
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
	public void setSubscribe(Subscribe newSubscribe) {
		if (newSubscribe != subscribe) {
			NotificationChain msgs = null;
			if (subscribe != null)
				msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.REPOSITORY__SUBSCRIBE, null, msgs);
			if (newSubscribe != null)
				msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.REPOSITORY__SUBSCRIBE, null, msgs);
			msgs = basicSetSubscribe(newSubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY__SUBSCRIBE, newSubscribe, newSubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getAggregateRoot() {
		if (eContainerFeatureID() != ServicePackage.REPOSITORY__AGGREGATE_ROOT) return null;
		return (DomainObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateRoot(DomainObject newAggregateRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregateRoot, ServicePackage.REPOSITORY__AGGREGATE_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateRoot(DomainObject newAggregateRoot) {
		if (newAggregateRoot != eInternalContainer() || (eContainerFeatureID() != ServicePackage.REPOSITORY__AGGREGATE_ROOT && newAggregateRoot != null)) {
			if (EcoreUtil.isAncestor(this, newAggregateRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregateRoot != null)
				msgs = ((InternalEObject)newAggregateRoot).eInverseAdd(this, ServicePackage.DOMAIN_OBJECT__REPOSITORY, DomainObject.class, msgs);
			msgs = basicSetAggregateRoot(newAggregateRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY__AGGREGATE_ROOT, newAggregateRoot, newAggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGapClass() {
		return gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapClass(boolean newGapClass) {
		boolean oldGapClass = gapClass;
		gapClass = newGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY__GAP_CLASS, oldGapClass, gapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY__NAME, oldName, name));
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
			case ServicePackage.REPOSITORY__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAggregateRoot((DomainObject)otherEnd, msgs);
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
			case ServicePackage.REPOSITORY__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ServicePackage.REPOSITORY__SUBSCRIBE:
				return basicSetSubscribe(null, msgs);
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				return basicSetAggregateRoot(null, msgs);
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
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				return eInternalContainer().eInverseRemove(this, ServicePackage.DOMAIN_OBJECT__REPOSITORY, DomainObject.class, msgs);
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
			case ServicePackage.REPOSITORY__OPERATIONS:
				return getOperations();
			case ServicePackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				return getRepositoryDependencies();
			case ServicePackage.REPOSITORY__OTHER_DEPENDENCIES:
				return getOtherDependencies();
			case ServicePackage.REPOSITORY__SUBSCRIBE:
				return getSubscribe();
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				return getAggregateRoot();
			case ServicePackage.REPOSITORY__GAP_CLASS:
				return isGapClass();
			case ServicePackage.REPOSITORY__NAME:
				return getName();
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
			case ServicePackage.REPOSITORY__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends RepositoryOperation>)newValue);
				return;
			case ServicePackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				getRepositoryDependencies().addAll((Collection<? extends Repository>)newValue);
				return;
			case ServicePackage.REPOSITORY__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				getOtherDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case ServicePackage.REPOSITORY__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
				return;
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)newValue);
				return;
			case ServicePackage.REPOSITORY__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case ServicePackage.REPOSITORY__NAME:
				setName((String)newValue);
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
			case ServicePackage.REPOSITORY__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				return;
			case ServicePackage.REPOSITORY__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				return;
			case ServicePackage.REPOSITORY__SUBSCRIBE:
				setSubscribe((Subscribe)null);
				return;
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)null);
				return;
			case ServicePackage.REPOSITORY__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case ServicePackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
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
			case ServicePackage.REPOSITORY__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicePackage.REPOSITORY__REPOSITORY_DEPENDENCIES:
				return repositoryDependencies != null && !repositoryDependencies.isEmpty();
			case ServicePackage.REPOSITORY__OTHER_DEPENDENCIES:
				return otherDependencies != null && !otherDependencies.isEmpty();
			case ServicePackage.REPOSITORY__SUBSCRIBE:
				return subscribe != null;
			case ServicePackage.REPOSITORY__AGGREGATE_ROOT:
				return getAggregateRoot() != null;
			case ServicePackage.REPOSITORY__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case ServicePackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (otherDependencies: ");
		result.append(otherDependencies);
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
