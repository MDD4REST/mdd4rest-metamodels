/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Repository;
import com.github.icelyframework.service.Service;
import com.github.icelyframework.service.ServiceOperation;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#isWebService <em>Web Service</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#isRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#isLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ServiceImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOperation> operations;

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
	 * The cached value of the '{@link #getOtherDependencies() <em>Other Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDependencies;

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
	 * The default value of the '{@link #isWebService() <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEB_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWebService() <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebService()
	 * @generated
	 * @ordered
	 */
	protected boolean webService = WEB_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_INTERFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteInterface = REMOTE_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_INTERFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean localInterface = LOCAL_INTERFACE_EDEFAULT;

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
	 * The default value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean gapClass = GAP_CLASS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<ServiceOperation>(ServiceOperation.class, this, ServicePackage.SERVICE__OPERATIONS, ServicePackage.SERVICE_OPERATION__SERVICE);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepositoryDependencies() {
		if (repositoryDependencies == null) {
			repositoryDependencies = new EObjectResolvingEList<Repository>(Repository.class, this, ServicePackage.SERVICE__REPOSITORY_DEPENDENCIES);
		}
		return repositoryDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDependencies() {
		if (otherDependencies == null) {
			otherDependencies = new EDataTypeUniqueEList<String>(String.class, this, ServicePackage.SERVICE__OTHER_DEPENDENCIES);
		}
		return otherDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.SERVICE__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWebService() {
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebService(boolean newWebService) {
		boolean oldWebService = webService;
		webService = newWebService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__WEB_SERVICE, oldWebService, webService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoteInterface() {
		return remoteInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteInterface(boolean newRemoteInterface) {
		boolean oldRemoteInterface = remoteInterface;
		remoteInterface = newRemoteInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__REMOTE_INTERFACE, oldRemoteInterface, remoteInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocalInterface() {
		return localInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalInterface(boolean newLocalInterface) {
		boolean oldLocalInterface = localInterface;
		localInterface = newLocalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__LOCAL_INTERFACE, oldLocalInterface, localInterface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SUBSCRIBE, oldSubscribe, newSubscribe);
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
				msgs = ((InternalEObject)subscribe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__SUBSCRIBE, null, msgs);
			if (newSubscribe != null)
				msgs = ((InternalEObject)newSubscribe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.SERVICE__SUBSCRIBE, null, msgs);
			msgs = basicSetSubscribe(newSubscribe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__SUBSCRIBE, newSubscribe, newSubscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGapClass() {
		return gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapClass(boolean newGapClass) {
		boolean oldGapClass = gapClass;
		gapClass = newGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__GAP_CLASS, oldGapClass, gapClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.github.icelyframework.service.Module getModule() {
		if (eContainerFeatureID() != ServicePackage.SERVICE__MODULE) return null;
		return (com.github.icelyframework.service.Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(com.github.icelyframework.service.Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, ServicePackage.SERVICE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(com.github.icelyframework.service.Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != ServicePackage.SERVICE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, ServicePackage.MODULE__SERVICES, com.github.icelyframework.service.Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE__MODULE, newModule, newModule));
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
			case ServicePackage.SERVICE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case ServicePackage.SERVICE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((com.github.icelyframework.service.Module)otherEnd, msgs);
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
			case ServicePackage.SERVICE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE__SUBSCRIBE:
				return basicSetSubscribe(null, msgs);
			case ServicePackage.SERVICE__MODULE:
				return basicSetModule(null, msgs);
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
			case ServicePackage.SERVICE__MODULE:
				return eInternalContainer().eInverseRemove(this, ServicePackage.MODULE__SERVICES, com.github.icelyframework.service.Module.class, msgs);
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
			case ServicePackage.SERVICE__OPERATIONS:
				return getOperations();
			case ServicePackage.SERVICE__REPOSITORY_DEPENDENCIES:
				return getRepositoryDependencies();
			case ServicePackage.SERVICE__OTHER_DEPENDENCIES:
				return getOtherDependencies();
			case ServicePackage.SERVICE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case ServicePackage.SERVICE__WEB_SERVICE:
				return isWebService();
			case ServicePackage.SERVICE__REMOTE_INTERFACE:
				return isRemoteInterface();
			case ServicePackage.SERVICE__LOCAL_INTERFACE:
				return isLocalInterface();
			case ServicePackage.SERVICE__SUBSCRIBE:
				return getSubscribe();
			case ServicePackage.SERVICE__GAP_CLASS:
				return isGapClass();
			case ServicePackage.SERVICE__NAME:
				return getName();
			case ServicePackage.SERVICE__MODULE:
				return getModule();
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
			case ServicePackage.SERVICE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ServiceOperation>)newValue);
				return;
			case ServicePackage.SERVICE__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				getRepositoryDependencies().addAll((Collection<? extends Repository>)newValue);
				return;
			case ServicePackage.SERVICE__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				getOtherDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case ServicePackage.SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.SERVICE__WEB_SERVICE:
				setWebService((Boolean)newValue);
				return;
			case ServicePackage.SERVICE__REMOTE_INTERFACE:
				setRemoteInterface((Boolean)newValue);
				return;
			case ServicePackage.SERVICE__LOCAL_INTERFACE:
				setLocalInterface((Boolean)newValue);
				return;
			case ServicePackage.SERVICE__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
				return;
			case ServicePackage.SERVICE__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case ServicePackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.SERVICE__MODULE:
				setModule((com.github.icelyframework.service.Module)newValue);
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
			case ServicePackage.SERVICE__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.SERVICE__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				return;
			case ServicePackage.SERVICE__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				return;
			case ServicePackage.SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
			case ServicePackage.SERVICE__WEB_SERVICE:
				setWebService(WEB_SERVICE_EDEFAULT);
				return;
			case ServicePackage.SERVICE__REMOTE_INTERFACE:
				setRemoteInterface(REMOTE_INTERFACE_EDEFAULT);
				return;
			case ServicePackage.SERVICE__LOCAL_INTERFACE:
				setLocalInterface(LOCAL_INTERFACE_EDEFAULT);
				return;
			case ServicePackage.SERVICE__SUBSCRIBE:
				setSubscribe((Subscribe)null);
				return;
			case ServicePackage.SERVICE__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case ServicePackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.SERVICE__MODULE:
				setModule((com.github.icelyframework.service.Module)null);
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
			case ServicePackage.SERVICE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicePackage.SERVICE__REPOSITORY_DEPENDENCIES:
				return repositoryDependencies != null && !repositoryDependencies.isEmpty();
			case ServicePackage.SERVICE__OTHER_DEPENDENCIES:
				return otherDependencies != null && !otherDependencies.isEmpty();
			case ServicePackage.SERVICE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
			case ServicePackage.SERVICE__WEB_SERVICE:
				return webService != WEB_SERVICE_EDEFAULT;
			case ServicePackage.SERVICE__REMOTE_INTERFACE:
				return remoteInterface != REMOTE_INTERFACE_EDEFAULT;
			case ServicePackage.SERVICE__LOCAL_INTERFACE:
				return localInterface != LOCAL_INTERFACE_EDEFAULT;
			case ServicePackage.SERVICE__SUBSCRIBE:
				return subscribe != null;
			case ServicePackage.SERVICE__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case ServicePackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.SERVICE__MODULE:
				return getModule() != null;
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
		result.append(" (otherDependencies: ");
		result.append(otherDependencies);
		result.append(", webService: ");
		result.append(webService);
		result.append(", remoteInterface: ");
		result.append(remoteInterface);
		result.append(", localInterface: ");
		result.append(localInterface);
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
