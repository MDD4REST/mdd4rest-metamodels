/**
 */
package com.github.icelyframework.staticview.impl;

import com.github.icelyframework.staticview.Aggregate;
import com.github.icelyframework.staticview.Application;
import com.github.icelyframework.staticview.ComplexType;
import com.github.icelyframework.staticview.Project;
import com.github.icelyframework.staticview.StaticviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.impl.ApplicationImpl#getHasAggregate <em>Has Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ApplicationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.impl.ApplicationImpl#getComplextypes <em>Complextypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The cached value of the '{@link #getHasAggregate() <em>Has Aggregate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAggregate()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregate> hasAggregate;

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
	 * The cached value of the '{@link #getComplextypes() <em>Complextypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplextypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> complextypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticviewPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregate> getHasAggregate() {
		if (hasAggregate == null) {
			hasAggregate = new EObjectContainmentWithInverseEList<Aggregate>(Aggregate.class, this, StaticviewPackage.APPLICATION__HAS_AGGREGATE, StaticviewPackage.AGGREGATE__APPLICATION);
		}
		return hasAggregate;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		if (eContainerFeatureID() != StaticviewPackage.APPLICATION__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, StaticviewPackage.APPLICATION__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != StaticviewPackage.APPLICATION__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, StaticviewPackage.PROJECT__HAS_APPLICATION, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticviewPackage.APPLICATION__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComplexType> getComplextypes() {
		if (complextypes == null) {
			complextypes = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, StaticviewPackage.APPLICATION__COMPLEXTYPES);
		}
		return complextypes;
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
			case StaticviewPackage.APPLICATION__HAS_AGGREGATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAggregate()).basicAdd(otherEnd, msgs);
			case StaticviewPackage.APPLICATION__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
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
			case StaticviewPackage.APPLICATION__HAS_AGGREGATE:
				return ((InternalEList<?>)getHasAggregate()).basicRemove(otherEnd, msgs);
			case StaticviewPackage.APPLICATION__PROJECT:
				return basicSetProject(null, msgs);
			case StaticviewPackage.APPLICATION__COMPLEXTYPES:
				return ((InternalEList<?>)getComplextypes()).basicRemove(otherEnd, msgs);
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
			case StaticviewPackage.APPLICATION__PROJECT:
				return eInternalContainer().eInverseRemove(this, StaticviewPackage.PROJECT__HAS_APPLICATION, Project.class, msgs);
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
			case StaticviewPackage.APPLICATION__HAS_AGGREGATE:
				return getHasAggregate();
			case StaticviewPackage.APPLICATION__NAME:
				return getName();
			case StaticviewPackage.APPLICATION__PROJECT:
				return getProject();
			case StaticviewPackage.APPLICATION__COMPLEXTYPES:
				return getComplextypes();
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
			case StaticviewPackage.APPLICATION__HAS_AGGREGATE:
				getHasAggregate().clear();
				getHasAggregate().addAll((Collection<? extends Aggregate>)newValue);
				return;
			case StaticviewPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case StaticviewPackage.APPLICATION__PROJECT:
				setProject((Project)newValue);
				return;
			case StaticviewPackage.APPLICATION__COMPLEXTYPES:
				getComplextypes().clear();
				getComplextypes().addAll((Collection<? extends ComplexType>)newValue);
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
			case StaticviewPackage.APPLICATION__HAS_AGGREGATE:
				getHasAggregate().clear();
				return;
			case StaticviewPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticviewPackage.APPLICATION__PROJECT:
				setProject((Project)null);
				return;
			case StaticviewPackage.APPLICATION__COMPLEXTYPES:
				getComplextypes().clear();
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
			case StaticviewPackage.APPLICATION__HAS_AGGREGATE:
				return hasAggregate != null && !hasAggregate.isEmpty();
			case StaticviewPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticviewPackage.APPLICATION__PROJECT:
				return getProject() != null;
			case StaticviewPackage.APPLICATION__COMPLEXTYPES:
				return complextypes != null && !complextypes.isEmpty();
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

} //ApplicationImpl
