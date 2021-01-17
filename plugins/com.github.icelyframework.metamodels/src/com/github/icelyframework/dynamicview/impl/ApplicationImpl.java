/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.Aggregate;
import com.github.icelyframework.dynamicview.Application;
import com.github.icelyframework.dynamicview.ComplexType;
import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.Project;
import com.github.icelyframework.dynamicview.Role;

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
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl#getHasAggregate <em>Has Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl#getComplextypes <em>Complextypes</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ApplicationImpl#getHasRole <em>Has Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
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
	 * The cached value of the '{@link #getHasAggregate() <em>Has Aggregate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAggregate()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregate> hasAggregate;

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
	 * The cached value of the '{@link #getHasRole() <em>Has Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> hasRole;

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
		return DynamicviewPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregate> getHasAggregate() {
		if (hasAggregate == null) {
			hasAggregate = new EObjectContainmentWithInverseEList<Aggregate>(Aggregate.class, this, DynamicviewPackage.APPLICATION__HAS_AGGREGATE, DynamicviewPackage.AGGREGATE__APPLICATION);
		}
		return hasAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		if (eContainerFeatureID() != DynamicviewPackage.APPLICATION__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, DynamicviewPackage.APPLICATION__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != DynamicviewPackage.APPLICATION__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, DynamicviewPackage.PROJECT__HAS_APPLICATION, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.APPLICATION__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComplexType> getComplextypes() {
		if (complextypes == null) {
			complextypes = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, DynamicviewPackage.APPLICATION__COMPLEXTYPES);
		}
		return complextypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getHasRole() {
		if (hasRole == null) {
			hasRole = new EObjectContainmentWithInverseEList<Role>(Role.class, this, DynamicviewPackage.APPLICATION__HAS_ROLE, DynamicviewPackage.ROLE__APPLICATION);
		}
		return hasRole;
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
			case DynamicviewPackage.APPLICATION__HAS_AGGREGATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAggregate()).basicAdd(otherEnd, msgs);
			case DynamicviewPackage.APPLICATION__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case DynamicviewPackage.APPLICATION__HAS_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRole()).basicAdd(otherEnd, msgs);
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
			case DynamicviewPackage.APPLICATION__HAS_AGGREGATE:
				return ((InternalEList<?>)getHasAggregate()).basicRemove(otherEnd, msgs);
			case DynamicviewPackage.APPLICATION__PROJECT:
				return basicSetProject(null, msgs);
			case DynamicviewPackage.APPLICATION__COMPLEXTYPES:
				return ((InternalEList<?>)getComplextypes()).basicRemove(otherEnd, msgs);
			case DynamicviewPackage.APPLICATION__HAS_ROLE:
				return ((InternalEList<?>)getHasRole()).basicRemove(otherEnd, msgs);
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
			case DynamicviewPackage.APPLICATION__PROJECT:
				return eInternalContainer().eInverseRemove(this, DynamicviewPackage.PROJECT__HAS_APPLICATION, Project.class, msgs);
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
			case DynamicviewPackage.APPLICATION__NAME:
				return getName();
			case DynamicviewPackage.APPLICATION__HAS_AGGREGATE:
				return getHasAggregate();
			case DynamicviewPackage.APPLICATION__PROJECT:
				return getProject();
			case DynamicviewPackage.APPLICATION__COMPLEXTYPES:
				return getComplextypes();
			case DynamicviewPackage.APPLICATION__HAS_ROLE:
				return getHasRole();
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
			case DynamicviewPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case DynamicviewPackage.APPLICATION__HAS_AGGREGATE:
				getHasAggregate().clear();
				getHasAggregate().addAll((Collection<? extends Aggregate>)newValue);
				return;
			case DynamicviewPackage.APPLICATION__PROJECT:
				setProject((Project)newValue);
				return;
			case DynamicviewPackage.APPLICATION__COMPLEXTYPES:
				getComplextypes().clear();
				getComplextypes().addAll((Collection<? extends ComplexType>)newValue);
				return;
			case DynamicviewPackage.APPLICATION__HAS_ROLE:
				getHasRole().clear();
				getHasRole().addAll((Collection<? extends Role>)newValue);
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
			case DynamicviewPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicviewPackage.APPLICATION__HAS_AGGREGATE:
				getHasAggregate().clear();
				return;
			case DynamicviewPackage.APPLICATION__PROJECT:
				setProject((Project)null);
				return;
			case DynamicviewPackage.APPLICATION__COMPLEXTYPES:
				getComplextypes().clear();
				return;
			case DynamicviewPackage.APPLICATION__HAS_ROLE:
				getHasRole().clear();
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
			case DynamicviewPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicviewPackage.APPLICATION__HAS_AGGREGATE:
				return hasAggregate != null && !hasAggregate.isEmpty();
			case DynamicviewPackage.APPLICATION__PROJECT:
				return getProject() != null;
			case DynamicviewPackage.APPLICATION__COMPLEXTYPES:
				return complextypes != null && !complextypes.isEmpty();
			case DynamicviewPackage.APPLICATION__HAS_ROLE:
				return hasRole != null && !hasRole.isEmpty();
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
