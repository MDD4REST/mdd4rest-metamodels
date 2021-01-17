/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.ProcessOperation;
import com.github.icelyframework.dynamicview.Resource;
import com.github.icelyframework.dynamicview.ResourceActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ResourceActivityImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ResourceActivityImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ResourceActivityImpl#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceActivityImpl extends OperationImpl implements ResourceActivity {
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected ProcessOperation trigger;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

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
	protected ResourceActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicviewPackage.Literals.RESOURCE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessOperation getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (ProcessOperation)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicviewPackage.RESOURCE_ACTIVITY__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessOperation basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(ProcessOperation newTrigger) {
		ProcessOperation oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.RESOURCE_ACTIVITY__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicviewPackage.RESOURCE_ACTIVITY__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.RESOURCE_ACTIVITY__RESOURCE, oldResource, resource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.RESOURCE_ACTIVITY__PATH_NAME, oldPathName, pathName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicviewPackage.RESOURCE_ACTIVITY__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case DynamicviewPackage.RESOURCE_ACTIVITY__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case DynamicviewPackage.RESOURCE_ACTIVITY__PATH_NAME:
				return getPathName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DynamicviewPackage.RESOURCE_ACTIVITY__TRIGGER:
				setTrigger((ProcessOperation)newValue);
				return;
			case DynamicviewPackage.RESOURCE_ACTIVITY__RESOURCE:
				setResource((Resource)newValue);
				return;
			case DynamicviewPackage.RESOURCE_ACTIVITY__PATH_NAME:
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
			case DynamicviewPackage.RESOURCE_ACTIVITY__TRIGGER:
				setTrigger((ProcessOperation)null);
				return;
			case DynamicviewPackage.RESOURCE_ACTIVITY__RESOURCE:
				setResource((Resource)null);
				return;
			case DynamicviewPackage.RESOURCE_ACTIVITY__PATH_NAME:
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
			case DynamicviewPackage.RESOURCE_ACTIVITY__TRIGGER:
				return trigger != null;
			case DynamicviewPackage.RESOURCE_ACTIVITY__RESOURCE:
				return resource != null;
			case DynamicviewPackage.RESOURCE_ACTIVITY__PATH_NAME:
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
		result.append(" (pathName: ");
		result.append(pathName);
		result.append(')');
		return result.toString();
	}

} //ResourceActivityImpl
