/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Operation;
import com.github.icelyframework.service.Parameter;
import com.github.icelyframework.service.Publish;
import com.github.icelyframework.service.ServicePackage;
import com.github.icelyframework.service.TypeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.OperationImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.OperationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.OperationImpl#getPublish <em>Publish</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.OperationImpl#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
	/**
	 * The default value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected static final String THROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected String throws_ = THROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublish() <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublish()
	 * @generated
	 * @ordered
	 */
	protected Publish publish;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition returntype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThrows() {
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrows(String newThrows) {
		String oldThrows = throws_;
		throws_ = newThrows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__THROWS, oldThrows, throws_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publish getPublish() {
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublish(Publish newPublish, NotificationChain msgs) {
		Publish oldPublish = publish;
		publish = newPublish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__PUBLISH, oldPublish, newPublish);
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
	public void setPublish(Publish newPublish) {
		if (newPublish != publish) {
			NotificationChain msgs = null;
			if (publish != null)
				msgs = ((InternalEObject)publish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.OPERATION__PUBLISH, null, msgs);
			if (newPublish != null)
				msgs = ((InternalEObject)newPublish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.OPERATION__PUBLISH, null, msgs);
			msgs = basicSetPublish(newPublish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__PUBLISH, newPublish, newPublish));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ServicePackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getReturntype() {
		if (returntype != null && returntype.eIsProxy()) {
			InternalEObject oldReturntype = (InternalEObject)returntype;
			returntype = (TypeDefinition)eResolveProxy(oldReturntype);
			if (returntype != oldReturntype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.OPERATION__RETURNTYPE, oldReturntype, returntype));
			}
		}
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturntype(TypeDefinition newReturntype) {
		TypeDefinition oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__RETURNTYPE, oldReturntype, returntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.OPERATION__PUBLISH:
				return basicSetPublish(null, msgs);
			case ServicePackage.OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.OPERATION__THROWS:
				return getThrows();
			case ServicePackage.OPERATION__VISIBILITY:
				return getVisibility();
			case ServicePackage.OPERATION__PUBLISH:
				return getPublish();
			case ServicePackage.OPERATION__NAME:
				return getName();
			case ServicePackage.OPERATION__PARAMETERS:
				return getParameters();
			case ServicePackage.OPERATION__RETURNTYPE:
				if (resolve) return getReturntype();
				return basicGetReturntype();
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
			case ServicePackage.OPERATION__THROWS:
				setThrows((String)newValue);
				return;
			case ServicePackage.OPERATION__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case ServicePackage.OPERATION__PUBLISH:
				setPublish((Publish)newValue);
				return;
			case ServicePackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ServicePackage.OPERATION__RETURNTYPE:
				setReturntype((TypeDefinition)newValue);
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
			case ServicePackage.OPERATION__THROWS:
				setThrows(THROWS_EDEFAULT);
				return;
			case ServicePackage.OPERATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ServicePackage.OPERATION__PUBLISH:
				setPublish((Publish)null);
				return;
			case ServicePackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case ServicePackage.OPERATION__RETURNTYPE:
				setReturntype((TypeDefinition)null);
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
			case ServicePackage.OPERATION__THROWS:
				return THROWS_EDEFAULT == null ? throws_ != null : !THROWS_EDEFAULT.equals(throws_);
			case ServicePackage.OPERATION__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case ServicePackage.OPERATION__PUBLISH:
				return publish != null;
			case ServicePackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ServicePackage.OPERATION__RETURNTYPE:
				return returntype != null;
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
		result.append(" (throws: ");
		result.append(throws_);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
