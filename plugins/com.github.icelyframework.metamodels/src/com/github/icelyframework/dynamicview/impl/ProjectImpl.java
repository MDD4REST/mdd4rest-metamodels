/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.Application;
import com.github.icelyframework.dynamicview.AuthenticationType;
import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.PrimitiveType;
import com.github.icelyframework.dynamicview.Project;

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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProjectImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProjectImpl#getHasApplication <em>Has Application</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProjectImpl#getPrimitiveTypes <em>Primitive Types</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProjectImpl#getAuthenticationType <em>Authentication Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
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
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasApplication() <em>Has Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> hasApplication;

	/**
	 * The cached value of the '{@link #getPrimitiveTypes() <em>Primitive Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> primitiveTypes;

	/**
	 * The default value of the '{@link #getAuthenticationType() <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationType()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationType AUTHENTICATION_TYPE_EDEFAULT = AuthenticationType.CENTERALIZED;

	/**
	 * The cached value of the '{@link #getAuthenticationType() <em>Authentication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationType()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationType authenticationType = AUTHENTICATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicviewPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROJECT__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Application> getHasApplication() {
		if (hasApplication == null) {
			hasApplication = new EObjectContainmentWithInverseEList<Application>(Application.class, this, DynamicviewPackage.PROJECT__HAS_APPLICATION, DynamicviewPackage.APPLICATION__PROJECT);
		}
		return hasApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrimitiveType> getPrimitiveTypes() {
		if (primitiveTypes == null) {
			primitiveTypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, DynamicviewPackage.PROJECT__PRIMITIVE_TYPES);
		}
		return primitiveTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationType getAuthenticationType() {
		return authenticationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationType(AuthenticationType newAuthenticationType) {
		AuthenticationType oldAuthenticationType = authenticationType;
		authenticationType = newAuthenticationType == null ? AUTHENTICATION_TYPE_EDEFAULT : newAuthenticationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROJECT__AUTHENTICATION_TYPE, oldAuthenticationType, authenticationType));
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
			case DynamicviewPackage.PROJECT__HAS_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasApplication()).basicAdd(otherEnd, msgs);
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
			case DynamicviewPackage.PROJECT__HAS_APPLICATION:
				return ((InternalEList<?>)getHasApplication()).basicRemove(otherEnd, msgs);
			case DynamicviewPackage.PROJECT__PRIMITIVE_TYPES:
				return ((InternalEList<?>)getPrimitiveTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicviewPackage.PROJECT__NAME:
				return getName();
			case DynamicviewPackage.PROJECT__BASE_PATH:
				return getBasePath();
			case DynamicviewPackage.PROJECT__HAS_APPLICATION:
				return getHasApplication();
			case DynamicviewPackage.PROJECT__PRIMITIVE_TYPES:
				return getPrimitiveTypes();
			case DynamicviewPackage.PROJECT__AUTHENTICATION_TYPE:
				return getAuthenticationType();
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
			case DynamicviewPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case DynamicviewPackage.PROJECT__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case DynamicviewPackage.PROJECT__HAS_APPLICATION:
				getHasApplication().clear();
				getHasApplication().addAll((Collection<? extends Application>)newValue);
				return;
			case DynamicviewPackage.PROJECT__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				getPrimitiveTypes().addAll((Collection<? extends PrimitiveType>)newValue);
				return;
			case DynamicviewPackage.PROJECT__AUTHENTICATION_TYPE:
				setAuthenticationType((AuthenticationType)newValue);
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
			case DynamicviewPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicviewPackage.PROJECT__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case DynamicviewPackage.PROJECT__HAS_APPLICATION:
				getHasApplication().clear();
				return;
			case DynamicviewPackage.PROJECT__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				return;
			case DynamicviewPackage.PROJECT__AUTHENTICATION_TYPE:
				setAuthenticationType(AUTHENTICATION_TYPE_EDEFAULT);
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
			case DynamicviewPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicviewPackage.PROJECT__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case DynamicviewPackage.PROJECT__HAS_APPLICATION:
				return hasApplication != null && !hasApplication.isEmpty();
			case DynamicviewPackage.PROJECT__PRIMITIVE_TYPES:
				return primitiveTypes != null && !primitiveTypes.isEmpty();
			case DynamicviewPackage.PROJECT__AUTHENTICATION_TYPE:
				return authenticationType != AUTHENTICATION_TYPE_EDEFAULT;
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
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", authenticationType: ");
		result.append(authenticationType);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
