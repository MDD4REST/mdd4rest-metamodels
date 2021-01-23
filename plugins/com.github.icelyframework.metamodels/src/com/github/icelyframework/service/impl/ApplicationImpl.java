/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Application;
import com.github.icelyframework.service.ApplicationType;
import com.github.icelyframework.service.ComplexType;
import com.github.icelyframework.service.Project;
import com.github.icelyframework.service.Role;
import com.github.icelyframework.service.ServicePackage;

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
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getComplextypes <em>Complextypes</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ApplicationImpl#getApplicationType <em>Application Type</em>}</li>
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
	 * The cached value of the '{@link #getComplextypes() <em>Complextypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplextypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> complextypes;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<com.github.icelyframework.service.Module> modules;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationType APPLICATION_TYPE_EDEFAULT = ApplicationType.SCULPTOR_MICROSERVICE;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationType applicationType = APPLICATION_TYPE_EDEFAULT;

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
		return ServicePackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		if (eContainerFeatureID() != ServicePackage.APPLICATION__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, ServicePackage.APPLICATION__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != ServicePackage.APPLICATION__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, ServicePackage.PROJECT__APPLICATIONS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.APPLICATION__PROJECT, newProject, newProject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.APPLICATION__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComplexType> getComplextypes() {
		if (complextypes == null) {
			complextypes = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, ServicePackage.APPLICATION__COMPLEXTYPES);
		}
		return complextypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<com.github.icelyframework.service.Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentWithInverseEList<com.github.icelyframework.service.Module>(com.github.icelyframework.service.Module.class, this, ServicePackage.APPLICATION__MODULES, ServicePackage.MODULE__APPLICATION);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentWithInverseEList<Role>(Role.class, this, ServicePackage.APPLICATION__ROLES, ServicePackage.ROLE__APPLICATION);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationType(ApplicationType newApplicationType) {
		ApplicationType oldApplicationType = applicationType;
		applicationType = newApplicationType == null ? APPLICATION_TYPE_EDEFAULT : newApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.APPLICATION__APPLICATION_TYPE, oldApplicationType, applicationType));
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
			case ServicePackage.APPLICATION__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case ServicePackage.APPLICATION__MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModules()).basicAdd(otherEnd, msgs);
			case ServicePackage.APPLICATION__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case ServicePackage.APPLICATION__PROJECT:
				return basicSetProject(null, msgs);
			case ServicePackage.APPLICATION__COMPLEXTYPES:
				return ((InternalEList<?>)getComplextypes()).basicRemove(otherEnd, msgs);
			case ServicePackage.APPLICATION__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case ServicePackage.APPLICATION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.APPLICATION__PROJECT:
				return eInternalContainer().eInverseRemove(this, ServicePackage.PROJECT__APPLICATIONS, Project.class, msgs);
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
			case ServicePackage.APPLICATION__NAME:
				return getName();
			case ServicePackage.APPLICATION__PROJECT:
				return getProject();
			case ServicePackage.APPLICATION__BASE_PACKAGE:
				return getBasePackage();
			case ServicePackage.APPLICATION__COMPLEXTYPES:
				return getComplextypes();
			case ServicePackage.APPLICATION__MODULES:
				return getModules();
			case ServicePackage.APPLICATION__ROLES:
				return getRoles();
			case ServicePackage.APPLICATION__APPLICATION_TYPE:
				return getApplicationType();
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
			case ServicePackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.APPLICATION__PROJECT:
				setProject((Project)newValue);
				return;
			case ServicePackage.APPLICATION__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case ServicePackage.APPLICATION__COMPLEXTYPES:
				getComplextypes().clear();
				getComplextypes().addAll((Collection<? extends ComplexType>)newValue);
				return;
			case ServicePackage.APPLICATION__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends com.github.icelyframework.service.Module>)newValue);
				return;
			case ServicePackage.APPLICATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ServicePackage.APPLICATION__APPLICATION_TYPE:
				setApplicationType((ApplicationType)newValue);
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
			case ServicePackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.APPLICATION__PROJECT:
				setProject((Project)null);
				return;
			case ServicePackage.APPLICATION__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case ServicePackage.APPLICATION__COMPLEXTYPES:
				getComplextypes().clear();
				return;
			case ServicePackage.APPLICATION__MODULES:
				getModules().clear();
				return;
			case ServicePackage.APPLICATION__ROLES:
				getRoles().clear();
				return;
			case ServicePackage.APPLICATION__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
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
			case ServicePackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.APPLICATION__PROJECT:
				return getProject() != null;
			case ServicePackage.APPLICATION__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case ServicePackage.APPLICATION__COMPLEXTYPES:
				return complextypes != null && !complextypes.isEmpty();
			case ServicePackage.APPLICATION__MODULES:
				return modules != null && !modules.isEmpty();
			case ServicePackage.APPLICATION__ROLES:
				return roles != null && !roles.isEmpty();
			case ServicePackage.APPLICATION__APPLICATION_TYPE:
				return applicationType != APPLICATION_TYPE_EDEFAULT;
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
		result.append(", basePackage: ");
		result.append(basePackage);
		result.append(", applicationType: ");
		result.append(applicationType);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
