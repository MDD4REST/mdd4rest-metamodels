/**
 */
package com.github.icelyframework.staticview.impl;

import com.github.icelyframework.staticview.Aggregate;
import com.github.icelyframework.staticview.DomainObject;
import com.github.icelyframework.staticview.Property;
import com.github.icelyframework.staticview.Relation;
import com.github.icelyframework.staticview.StaticviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.DomainObjectImpl#isScaffold <em>Scaffold</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainObjectImpl extends SimpleTypeImpl implements DomainObject {
	/**
	 * The cached value of the '{@link #getHasProperty() <em>Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hasProperty;

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
	 * The default value of the '{@link #isAggregateRoot() <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGGREGATE_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAggregateRoot() <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean aggregateRoot = AGGREGATE_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRelation() <em>Has Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> hasRelation;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected DomainObject extends_;

	/**
	 * The default value of the '{@link #isScaffold() <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaffold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCAFFOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScaffold() <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaffold()
	 * @generated
	 * @ordered
	 */
	protected boolean scaffold = SCAFFOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticviewPackage.Literals.DOMAIN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectContainmentEList<Property>(Property.class, this, StaticviewPackage.DOMAIN_OBJECT__HAS_PROPERTY);
		}
		return hasProperty;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.DOMAIN_OBJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.DOMAIN_OBJECT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAggregateRoot() {
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateRoot(boolean newAggregateRoot) {
		boolean oldAggregateRoot = aggregateRoot;
		aggregateRoot = newAggregateRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.DOMAIN_OBJECT__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getHasRelation() {
		if (hasRelation == null) {
			hasRelation = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION, StaticviewPackage.RELATION__SOURCE);
		}
		return hasRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate getAggregate() {
		if (eContainerFeatureID() != StaticviewPackage.DOMAIN_OBJECT__AGGREGATE) return null;
		return (Aggregate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregate, StaticviewPackage.DOMAIN_OBJECT__AGGREGATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(Aggregate newAggregate) {
		if (newAggregate != eInternalContainer() || (eContainerFeatureID() != StaticviewPackage.DOMAIN_OBJECT__AGGREGATE && newAggregate != null)) {
			if (EcoreUtil.isAncestor(this, newAggregate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT, Aggregate.class, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.DOMAIN_OBJECT__AGGREGATE, newAggregate, newAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (DomainObject)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticviewPackage.DOMAIN_OBJECT__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(DomainObject newExtends) {
		DomainObject oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.DOMAIN_OBJECT__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isScaffold() {
		return scaffold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaffold(boolean newScaffold) {
		boolean oldScaffold = scaffold;
		scaffold = newScaffold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.DOMAIN_OBJECT__SCAFFOLD, oldScaffold, scaffold));
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
			case StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRelation()).basicAdd(otherEnd, msgs);
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAggregate((Aggregate)otherEnd, msgs);
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
			case StaticviewPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
			case StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION:
				return ((InternalEList<?>)getHasRelation()).basicRemove(otherEnd, msgs);
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				return basicSetAggregate(null, msgs);
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
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				return eInternalContainer().eInverseRemove(this, StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT, Aggregate.class, msgs);
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
			case StaticviewPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				return getHasProperty();
			case StaticviewPackage.DOMAIN_OBJECT__NAME:
				return getName();
			case StaticviewPackage.DOMAIN_OBJECT__ABSTRACT:
				return isAbstract();
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				return isAggregateRoot();
			case StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION:
				return getHasRelation();
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				return getAggregate();
			case StaticviewPackage.DOMAIN_OBJECT__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case StaticviewPackage.DOMAIN_OBJECT__SCAFFOLD:
				return isScaffold();
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
			case StaticviewPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__NAME:
				setName((String)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				setAggregateRoot((Boolean)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION:
				getHasRelation().clear();
				getHasRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				setAggregate((Aggregate)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__EXTENDS:
				setExtends((DomainObject)newValue);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__SCAFFOLD:
				setScaffold((Boolean)newValue);
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
			case StaticviewPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				getHasProperty().clear();
				return;
			case StaticviewPackage.DOMAIN_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				setAggregateRoot(AGGREGATE_ROOT_EDEFAULT);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION:
				getHasRelation().clear();
				return;
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				setAggregate((Aggregate)null);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__EXTENDS:
				setExtends((DomainObject)null);
				return;
			case StaticviewPackage.DOMAIN_OBJECT__SCAFFOLD:
				setScaffold(SCAFFOLD_EDEFAULT);
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
			case StaticviewPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
			case StaticviewPackage.DOMAIN_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticviewPackage.DOMAIN_OBJECT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				return aggregateRoot != AGGREGATE_ROOT_EDEFAULT;
			case StaticviewPackage.DOMAIN_OBJECT__HAS_RELATION:
				return hasRelation != null && !hasRelation.isEmpty();
			case StaticviewPackage.DOMAIN_OBJECT__AGGREGATE:
				return getAggregate() != null;
			case StaticviewPackage.DOMAIN_OBJECT__EXTENDS:
				return extends_ != null;
			case StaticviewPackage.DOMAIN_OBJECT__SCAFFOLD:
				return scaffold != SCAFFOLD_EDEFAULT;
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
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", aggregateRoot: ");
		result.append(aggregateRoot);
		result.append(", scaffold: ");
		result.append(scaffold);
		result.append(')');
		return result.toString();
	}

} //DomainObjectImpl
