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
import com.github.icelyframework.jdl.Search;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getPaginates <em>Paginates</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.ApplicationImpl#getName <em>Name</em>}</li>
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
	 * The cached value of the '{@link #getDtos() <em>Dtos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtos()
	 * @generated
	 * @ordered
	 */
	protected EList<DTO> dtos;

	/**
	 * The cached value of the '{@link #getPaginates() <em>Paginates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginates()
	 * @generated
	 * @ordered
	 */
	protected EList<Paginate> paginates;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected EList<Search> search;

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
				msgs = ((InternalEObject)config).eInverseRemove(this, JdlPackage.CONFIG__APPLICATION, Config.class, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, JdlPackage.CONFIG__APPLICATION, Config.class, msgs);
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
	public EList<Paginate> getPaginates() {
		if (paginates == null) {
			paginates = new EObjectResolvingEList<Paginate>(Paginate.class, this, JdlPackage.APPLICATION__PAGINATES);
		}
		return paginates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<Service>(Service.class, this, JdlPackage.APPLICATION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Search> getSearch() {
		if (search == null) {
			search = new EObjectResolvingEList<Search>(Search.class, this, JdlPackage.APPLICATION__SEARCH);
		}
		return search;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.APPLICATION__NAME, oldName, name));
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
			case JdlPackage.APPLICATION__CONFIG:
				if (config != null)
					msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JdlPackage.APPLICATION__CONFIG, null, msgs);
				return basicSetConfig((Config)otherEnd, msgs);
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
			case JdlPackage.APPLICATION__CONFIG:
				return basicSetConfig(null, msgs);
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
			case JdlPackage.APPLICATION__DTOS:
				return getDtos();
			case JdlPackage.APPLICATION__PAGINATES:
				return getPaginates();
			case JdlPackage.APPLICATION__SERVICES:
				return getServices();
			case JdlPackage.APPLICATION__SEARCH:
				return getSearch();
			case JdlPackage.APPLICATION__NAME:
				return getName();
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
			case JdlPackage.APPLICATION__DTOS:
				getDtos().clear();
				getDtos().addAll((Collection<? extends DTO>)newValue);
				return;
			case JdlPackage.APPLICATION__PAGINATES:
				getPaginates().clear();
				getPaginates().addAll((Collection<? extends Paginate>)newValue);
				return;
			case JdlPackage.APPLICATION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case JdlPackage.APPLICATION__SEARCH:
				getSearch().clear();
				getSearch().addAll((Collection<? extends Search>)newValue);
				return;
			case JdlPackage.APPLICATION__NAME:
				setName((String)newValue);
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
			case JdlPackage.APPLICATION__DTOS:
				getDtos().clear();
				return;
			case JdlPackage.APPLICATION__PAGINATES:
				getPaginates().clear();
				return;
			case JdlPackage.APPLICATION__SERVICES:
				getServices().clear();
				return;
			case JdlPackage.APPLICATION__SEARCH:
				getSearch().clear();
				return;
			case JdlPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
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
			case JdlPackage.APPLICATION__DTOS:
				return dtos != null && !dtos.isEmpty();
			case JdlPackage.APPLICATION__PAGINATES:
				return paginates != null && !paginates.isEmpty();
			case JdlPackage.APPLICATION__SERVICES:
				return services != null && !services.isEmpty();
			case JdlPackage.APPLICATION__SEARCH:
				return search != null && !search.isEmpty();
			case JdlPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
