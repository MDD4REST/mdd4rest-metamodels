/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.Application;
import com.github.icelyframework.jdl.Config;
import com.github.icelyframework.jdl.DTO;
import com.github.icelyframework.jdl.Deployment;
import com.github.icelyframework.jdl.Entity;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.Paginate;
import com.github.icelyframework.jdl.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getPaginates <em>Paginates</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected Config config;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployments;

	/**
	 * The cached value of the '{@link #getDtos() <em>Dtos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtos()
	 * @generated
	 * @ordered
	 */
	protected EList<DTO> dtos;

	/**
	 * The cached value of the '{@link #getPaginates() <em>Paginates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginates()
	 * @generated
	 * @ordered
	 */
	protected Paginate paginates;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Service services;

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
		return JdlPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Config getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(Config newConfig, NotificationChain msgs) {
		Config oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JdlPackage.APPLICATION__CONFIG, oldConfig, newConfig);
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
	public void setConfig(Config newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.APPLICATION__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JdlPackage.APPLICATION__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.APPLICATION__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, JdlPackage.APPLICATION__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Deployment> getDeployments() {
		if (deployments == null) {
			deployments = new EObjectContainmentEList<Deployment>(Deployment.class, this, JdlPackage.APPLICATION__DEPLOYMENTS);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DTO> getDtos() {
		if (dtos == null) {
			dtos = new EObjectResolvingEList<DTO>(DTO.class, this, JdlPackage.APPLICATION__DTOS);
		}
		return dtos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paginate getPaginates() {
		if (paginates != null && paginates.eIsProxy()) {
			InternalEObject oldPaginates = (InternalEObject)paginates;
			paginates = (Paginate)eResolveProxy(oldPaginates);
			if (paginates != oldPaginates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JdlPackage.APPLICATION__PAGINATES, oldPaginates, paginates));
			}
		}
		return paginates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paginate basicGetPaginates() {
		return paginates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaginates(Paginate newPaginates) {
		Paginate oldPaginates = paginates;
		paginates = newPaginates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.APPLICATION__PAGINATES, oldPaginates, paginates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject)services;
			services = (Service)eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JdlPackage.APPLICATION__SERVICES, oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServices(Service newServices) {
		Service oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.APPLICATION__SERVICES, oldServices, services));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.APPLICATION__CONFIG:
				return basicSetConfig(null, msgs);
			case JdlPackage.APPLICATION__DEPLOYMENTS:
				return ((InternalEList<?>)getDeployments()).basicRemove(otherEnd, msgs);
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
			case JdlPackage.APPLICATION__CONFIG:
				return getConfig();
			case JdlPackage.APPLICATION__ENTITIES:
				return getEntities();
			case JdlPackage.APPLICATION__DEPLOYMENTS:
				return getDeployments();
			case JdlPackage.APPLICATION__DTOS:
				return getDtos();
			case JdlPackage.APPLICATION__PAGINATES:
				if (resolve) return getPaginates();
				return basicGetPaginates();
			case JdlPackage.APPLICATION__SERVICES:
				if (resolve) return getServices();
				return basicGetServices();
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
			case JdlPackage.APPLICATION__CONFIG:
				setConfig((Config)newValue);
				return;
			case JdlPackage.APPLICATION__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case JdlPackage.APPLICATION__DEPLOYMENTS:
				getDeployments().clear();
				getDeployments().addAll((Collection<? extends Deployment>)newValue);
				return;
			case JdlPackage.APPLICATION__DTOS:
				getDtos().clear();
				getDtos().addAll((Collection<? extends DTO>)newValue);
				return;
			case JdlPackage.APPLICATION__PAGINATES:
				setPaginates((Paginate)newValue);
				return;
			case JdlPackage.APPLICATION__SERVICES:
				setServices((Service)newValue);
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
			case JdlPackage.APPLICATION__CONFIG:
				setConfig((Config)null);
				return;
			case JdlPackage.APPLICATION__ENTITIES:
				getEntities().clear();
				return;
			case JdlPackage.APPLICATION__DEPLOYMENTS:
				getDeployments().clear();
				return;
			case JdlPackage.APPLICATION__DTOS:
				getDtos().clear();
				return;
			case JdlPackage.APPLICATION__PAGINATES:
				setPaginates((Paginate)null);
				return;
			case JdlPackage.APPLICATION__SERVICES:
				setServices((Service)null);
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
			case JdlPackage.APPLICATION__CONFIG:
				return config != null;
			case JdlPackage.APPLICATION__ENTITIES:
				return entities != null && !entities.isEmpty();
			case JdlPackage.APPLICATION__DEPLOYMENTS:
				return deployments != null && !deployments.isEmpty();
			case JdlPackage.APPLICATION__DTOS:
				return dtos != null && !dtos.isEmpty();
			case JdlPackage.APPLICATION__PAGINATES:
				return paginates != null;
			case JdlPackage.APPLICATION__SERVICES:
				return services != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
