/**
 */
package com.github.icelyframework.dynamicview.impl;

import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.Policy;
import com.github.icelyframework.dynamicview.ProcessOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProcessOperationImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProcessOperationImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.impl.ProcessOperationImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessOperationImpl extends OperationImpl implements ProcessOperation {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected ProcessOperation delegate;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected Policy policy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicviewPackage.Literals.PROCESS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessOperation getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (ProcessOperation)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicviewPackage.PROCESS_OPERATION__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessOperation basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegate(ProcessOperation newDelegate) {
		ProcessOperation oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROCESS_OPERATION__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Policy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(Policy newPolicy, NotificationChain msgs) {
		Policy oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROCESS_OPERATION__POLICY, oldPolicy, newPolicy);
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
	public void setPolicy(Policy newPolicy) {
		if (newPolicy != policy) {
			NotificationChain msgs = null;
			if (policy != null)
				msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicviewPackage.PROCESS_OPERATION__POLICY, null, msgs);
			if (newPolicy != null)
				msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicviewPackage.PROCESS_OPERATION__POLICY, null, msgs);
			msgs = basicSetPolicy(newPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROCESS_OPERATION__POLICY, newPolicy, newPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.github.icelyframework.dynamicview.Process getProcess() {
		if (eContainerFeatureID() != DynamicviewPackage.PROCESS_OPERATION__PROCESS) return null;
		return (com.github.icelyframework.dynamicview.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(com.github.icelyframework.dynamicview.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, DynamicviewPackage.PROCESS_OPERATION__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(com.github.icelyframework.dynamicview.Process newProcess) {
		if (newProcess != eInternalContainer() || (eContainerFeatureID() != DynamicviewPackage.PROCESS_OPERATION__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, DynamicviewPackage.PROCESS__HAS_OPERATION, com.github.icelyframework.dynamicview.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicviewPackage.PROCESS_OPERATION__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((com.github.icelyframework.dynamicview.Process)otherEnd, msgs);
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
			case DynamicviewPackage.PROCESS_OPERATION__POLICY:
				return basicSetPolicy(null, msgs);
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				return basicSetProcess(null, msgs);
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
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				return eInternalContainer().eInverseRemove(this, DynamicviewPackage.PROCESS__HAS_OPERATION, com.github.icelyframework.dynamicview.Process.class, msgs);
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
			case DynamicviewPackage.PROCESS_OPERATION__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
			case DynamicviewPackage.PROCESS_OPERATION__POLICY:
				return getPolicy();
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				return getProcess();
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
			case DynamicviewPackage.PROCESS_OPERATION__DELEGATE:
				setDelegate((ProcessOperation)newValue);
				return;
			case DynamicviewPackage.PROCESS_OPERATION__POLICY:
				setPolicy((Policy)newValue);
				return;
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				setProcess((com.github.icelyframework.dynamicview.Process)newValue);
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
			case DynamicviewPackage.PROCESS_OPERATION__DELEGATE:
				setDelegate((ProcessOperation)null);
				return;
			case DynamicviewPackage.PROCESS_OPERATION__POLICY:
				setPolicy((Policy)null);
				return;
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				setProcess((com.github.icelyframework.dynamicview.Process)null);
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
			case DynamicviewPackage.PROCESS_OPERATION__DELEGATE:
				return delegate != null;
			case DynamicviewPackage.PROCESS_OPERATION__POLICY:
				return policy != null;
			case DynamicviewPackage.PROCESS_OPERATION__PROCESS:
				return getProcess() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessOperationImpl
