/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Consumer;
import com.github.icelyframework.service.DomainObject;
import com.github.icelyframework.service.Repository;
import com.github.icelyframework.service.Service;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.ConsumerImpl#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ConsumerImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ConsumerImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ConsumerImpl#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ConsumerImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ConsumerImpl#getMessageRoot <em>Message Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerImpl extends EObjectImpl implements Consumer {
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
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceDependencies;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected String channel = CHANNEL_EDEFAULT;

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
	 * The cached value of the '{@link #getMessageRoot() <em>Message Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRoot()
	 * @generated
	 * @ordered
	 */
	protected DomainObject messageRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepositoryDependencies() {
		if (repositoryDependencies == null) {
			repositoryDependencies = new EObjectResolvingEList<Repository>(Repository.class, this, ServicePackage.CONSUMER__REPOSITORY_DEPENDENCIES);
		}
		return repositoryDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.CONSUMER__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannel(String newChannel) {
		String oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONSUMER__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDependencies() {
		if (otherDependencies == null) {
			otherDependencies = new EDataTypeUniqueEList<String>(String.class, this, ServicePackage.CONSUMER__OTHER_DEPENDENCIES);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.CONSUMER__SUBSCRIBE, oldSubscribe, newSubscribe);
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
				msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.CONSUMER__SUBSCRIBE, null, msgs);
			if (newSubscribe != null)
				msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.CONSUMER__SUBSCRIBE, null, msgs);
			msgs = basicSetSubscribe(newSubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONSUMER__SUBSCRIBE, newSubscribe, newSubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getMessageRoot() {
		if (messageRoot != null && messageRoot.eIsProxy()) {
			InternalEObject oldMessageRoot = (InternalEObject)messageRoot;
			messageRoot = (DomainObject)eResolveProxy(oldMessageRoot);
			if (messageRoot != oldMessageRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.CONSUMER__MESSAGE_ROOT, oldMessageRoot, messageRoot));
			}
		}
		return messageRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetMessageRoot() {
		return messageRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageRoot(DomainObject newMessageRoot) {
		DomainObject oldMessageRoot = messageRoot;
		messageRoot = newMessageRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONSUMER__MESSAGE_ROOT, oldMessageRoot, messageRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.CONSUMER__SUBSCRIBE:
				return basicSetSubscribe(null, msgs);
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
			case ServicePackage.CONSUMER__REPOSITORY_DEPENDENCIES:
				return getRepositoryDependencies();
			case ServicePackage.CONSUMER__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case ServicePackage.CONSUMER__CHANNEL:
				return getChannel();
			case ServicePackage.CONSUMER__OTHER_DEPENDENCIES:
				return getOtherDependencies();
			case ServicePackage.CONSUMER__SUBSCRIBE:
				return getSubscribe();
			case ServicePackage.CONSUMER__MESSAGE_ROOT:
				if (resolve) return getMessageRoot();
				return basicGetMessageRoot();
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
			case ServicePackage.CONSUMER__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				getRepositoryDependencies().addAll((Collection<? extends Repository>)newValue);
				return;
			case ServicePackage.CONSUMER__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.CONSUMER__CHANNEL:
				setChannel((String)newValue);
				return;
			case ServicePackage.CONSUMER__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				getOtherDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case ServicePackage.CONSUMER__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
				return;
			case ServicePackage.CONSUMER__MESSAGE_ROOT:
				setMessageRoot((DomainObject)newValue);
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
			case ServicePackage.CONSUMER__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				return;
			case ServicePackage.CONSUMER__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
			case ServicePackage.CONSUMER__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case ServicePackage.CONSUMER__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				return;
			case ServicePackage.CONSUMER__SUBSCRIBE:
				setSubscribe((Subscribe)null);
				return;
			case ServicePackage.CONSUMER__MESSAGE_ROOT:
				setMessageRoot((DomainObject)null);
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
			case ServicePackage.CONSUMER__REPOSITORY_DEPENDENCIES:
				return repositoryDependencies != null && !repositoryDependencies.isEmpty();
			case ServicePackage.CONSUMER__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
			case ServicePackage.CONSUMER__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case ServicePackage.CONSUMER__OTHER_DEPENDENCIES:
				return otherDependencies != null && !otherDependencies.isEmpty();
			case ServicePackage.CONSUMER__SUBSCRIBE:
				return subscribe != null;
			case ServicePackage.CONSUMER__MESSAGE_ROOT:
				return messageRoot != null;
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
		result.append(" (channel: ");
		result.append(channel);
		result.append(", otherDependencies: ");
		result.append(otherDependencies);
		result.append(')');
		return result.toString();
	}

} //ConsumerImpl
