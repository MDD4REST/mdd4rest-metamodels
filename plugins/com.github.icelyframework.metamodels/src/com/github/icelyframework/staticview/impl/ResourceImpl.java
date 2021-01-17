/**
 */
package com.github.icelyframework.staticview.impl;

import com.github.icelyframework.staticview.Aggregate;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ResourceImpl#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ResourceImpl#getIsRelatedResource <em>Is Related Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ResourceImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ResourceImpl#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ResourceImpl#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends EObjectImpl implements Resource {
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
	 * The cached value of the '{@link #getHasRelatedResource() <em>Has Related Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasRelatedResource;

	/**
	 * The cached value of the '{@link #getIsRelatedResource() <em>Is Related Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected Resource isRelatedResource;

	/**
	 * The default value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleName() <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleName()
	 * @generated
	 * @ordered
	 */
	protected String simpleName = SIMPLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
	protected String pathName = PATH_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticviewPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasRelatedResource() {
		if (hasRelatedResource == null) {
			hasRelatedResource = new EObjectWithInverseResolvingEList<Resource>(Resource.class, this, StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE, StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE);
		}
		return hasRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getIsRelatedResource() {
		if (isRelatedResource != null && isRelatedResource.eIsProxy()) {
			InternalEObject oldIsRelatedResource = (InternalEObject)isRelatedResource;
			isRelatedResource = (Resource)eResolveProxy(oldIsRelatedResource);
			if (isRelatedResource != oldIsRelatedResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE, oldIsRelatedResource, isRelatedResource));
			}
		}
		return isRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetIsRelatedResource() {
		return isRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsRelatedResource(Resource newIsRelatedResource, NotificationChain msgs) {
		Resource oldIsRelatedResource = isRelatedResource;
		isRelatedResource = newIsRelatedResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE, oldIsRelatedResource, newIsRelatedResource);
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
	public void setIsRelatedResource(Resource newIsRelatedResource) {
		if (newIsRelatedResource != isRelatedResource) {
			NotificationChain msgs = null;
			if (isRelatedResource != null)
				msgs = ((InternalEObject)isRelatedResource).eInverseRemove(this, StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE, Resource.class, msgs);
			if (newIsRelatedResource != null)
				msgs = ((InternalEObject)newIsRelatedResource).eInverseAdd(this, StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE, Resource.class, msgs);
			msgs = basicSetIsRelatedResource(newIsRelatedResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE, newIsRelatedResource, newIsRelatedResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate getAggregate() {
		if (eContainerFeatureID() != StaticviewPackage.RESOURCE__AGGREGATE) return null;
		return (Aggregate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregate, StaticviewPackage.RESOURCE__AGGREGATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(Aggregate newAggregate) {
		if (newAggregate != eInternalContainer() || (eContainerFeatureID() != StaticviewPackage.RESOURCE__AGGREGATE && newAggregate != null)) {
			if (EcoreUtil.isAncestor(this, newAggregate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, StaticviewPackage.AGGREGATE__HAS_RESOURCE, Aggregate.class, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.RESOURCE__AGGREGATE, newAggregate, newAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSimpleName() {
		return simpleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimpleName(String newSimpleName) {
		String oldSimpleName = simpleName;
		simpleName = newSimpleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.RESOURCE__SIMPLE_NAME, oldSimpleName, simpleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathName() {
		return pathName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathName(String newPathName) {
		String oldPathName = pathName;
		pathName = newPathName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.RESOURCE__PATH_NAME, oldPathName, pathName));
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
			case StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRelatedResource()).basicAdd(otherEnd, msgs);
			case StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE:
				if (isRelatedResource != null)
					msgs = ((InternalEObject)isRelatedResource).eInverseRemove(this, StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE, Resource.class, msgs);
				return basicSetIsRelatedResource((Resource)otherEnd, msgs);
			case StaticviewPackage.RESOURCE__AGGREGATE:
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
			case StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return ((InternalEList<?>)getHasRelatedResource()).basicRemove(otherEnd, msgs);
			case StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE:
				return basicSetIsRelatedResource(null, msgs);
			case StaticviewPackage.RESOURCE__AGGREGATE:
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
			case StaticviewPackage.RESOURCE__AGGREGATE:
				return eInternalContainer().eInverseRemove(this, StaticviewPackage.AGGREGATE__HAS_RESOURCE, Aggregate.class, msgs);
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
			case StaticviewPackage.RESOURCE__NAME:
				return getName();
			case StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return getHasRelatedResource();
			case StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE:
				if (resolve) return getIsRelatedResource();
				return basicGetIsRelatedResource();
			case StaticviewPackage.RESOURCE__AGGREGATE:
				return getAggregate();
			case StaticviewPackage.RESOURCE__SIMPLE_NAME:
				return getSimpleName();
			case StaticviewPackage.RESOURCE__PATH_NAME:
				return getPathName();
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
			case StaticviewPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				getHasRelatedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE:
				setIsRelatedResource((Resource)newValue);
				return;
			case StaticviewPackage.RESOURCE__AGGREGATE:
				setAggregate((Aggregate)newValue);
				return;
			case StaticviewPackage.RESOURCE__SIMPLE_NAME:
				setSimpleName((String)newValue);
				return;
			case StaticviewPackage.RESOURCE__PATH_NAME:
				setPathName((String)newValue);
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
			case StaticviewPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				return;
			case StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE:
				setIsRelatedResource((Resource)null);
				return;
			case StaticviewPackage.RESOURCE__AGGREGATE:
				setAggregate((Aggregate)null);
				return;
			case StaticviewPackage.RESOURCE__SIMPLE_NAME:
				setSimpleName(SIMPLE_NAME_EDEFAULT);
				return;
			case StaticviewPackage.RESOURCE__PATH_NAME:
				setPathName(PATH_NAME_EDEFAULT);
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
			case StaticviewPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticviewPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return hasRelatedResource != null && !hasRelatedResource.isEmpty();
			case StaticviewPackage.RESOURCE__IS_RELATED_RESOURCE:
				return isRelatedResource != null;
			case StaticviewPackage.RESOURCE__AGGREGATE:
				return getAggregate() != null;
			case StaticviewPackage.RESOURCE__SIMPLE_NAME:
				return SIMPLE_NAME_EDEFAULT == null ? simpleName != null : !SIMPLE_NAME_EDEFAULT.equals(simpleName);
			case StaticviewPackage.RESOURCE__PATH_NAME:
				return PATH_NAME_EDEFAULT == null ? pathName != null : !PATH_NAME_EDEFAULT.equals(pathName);
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
		result.append(", simpleName: ");
		result.append(simpleName);
		result.append(", pathName: ");
		result.append(pathName);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
