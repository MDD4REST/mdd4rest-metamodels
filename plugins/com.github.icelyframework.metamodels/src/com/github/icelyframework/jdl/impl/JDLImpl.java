/**
 */
package com.github.icelyframework.jdl.impl;

import com.github.icelyframework.jdl.Application;
import com.github.icelyframework.jdl.DTO;
import com.github.icelyframework.jdl.Entity;
import com.github.icelyframework.jdl.JDL;
import com.github.icelyframework.jdl.JdlPackage;
import com.github.icelyframework.jdl.Paginate;
import com.github.icelyframework.jdl.Search;
import com.github.icelyframework.jdl.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JDL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getPaginate <em>Paginate</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.impl.JDLImpl#getSearch <em>Search</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JDLImpl extends EObjectImpl implements JDL {
	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<com.github.icelyframework.jdl.Enum> enums;

	/**
	 * The cached value of the '{@link #getPaginate() <em>Paginate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginate()
	 * @generated
	 * @ordered
	 */
	protected EList<Paginate> paginate;

	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected EList<DTO> dto;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected EList<Search> search;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JDLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdlPackage.Literals.JDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<Application>(Application.class, this, JdlPackage.JDL__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, JdlPackage.JDL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<com.github.icelyframework.jdl.Enum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<com.github.icelyframework.jdl.Enum>(com.github.icelyframework.jdl.Enum.class, this, JdlPackage.JDL__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Paginate> getPaginate() {
		if (paginate == null) {
			paginate = new EObjectContainmentEList<Paginate>(Paginate.class, this, JdlPackage.JDL__PAGINATE);
		}
		return paginate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DTO> getDto() {
		if (dto == null) {
			dto = new EObjectContainmentEList<DTO>(DTO.class, this, JdlPackage.JDL__DTO);
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, JdlPackage.JDL__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Search> getSearch() {
		if (search == null) {
			search = new EObjectContainmentEList<Search>(Search.class, this, JdlPackage.JDL__SEARCH);
		}
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdlPackage.JDL__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case JdlPackage.JDL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case JdlPackage.JDL__ENUMS:
				return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
			case JdlPackage.JDL__PAGINATE:
				return ((InternalEList<?>)getPaginate()).basicRemove(otherEnd, msgs);
			case JdlPackage.JDL__DTO:
				return ((InternalEList<?>)getDto()).basicRemove(otherEnd, msgs);
			case JdlPackage.JDL__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case JdlPackage.JDL__SEARCH:
				return ((InternalEList<?>)getSearch()).basicRemove(otherEnd, msgs);
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
			case JdlPackage.JDL__APPLICATIONS:
				return getApplications();
			case JdlPackage.JDL__ENTITIES:
				return getEntities();
			case JdlPackage.JDL__ENUMS:
				return getEnums();
			case JdlPackage.JDL__PAGINATE:
				return getPaginate();
			case JdlPackage.JDL__DTO:
				return getDto();
			case JdlPackage.JDL__SERVICE:
				return getService();
			case JdlPackage.JDL__SEARCH:
				return getSearch();
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
			case JdlPackage.JDL__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case JdlPackage.JDL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case JdlPackage.JDL__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends com.github.icelyframework.jdl.Enum>)newValue);
				return;
			case JdlPackage.JDL__PAGINATE:
				getPaginate().clear();
				getPaginate().addAll((Collection<? extends Paginate>)newValue);
				return;
			case JdlPackage.JDL__DTO:
				getDto().clear();
				getDto().addAll((Collection<? extends DTO>)newValue);
				return;
			case JdlPackage.JDL__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case JdlPackage.JDL__SEARCH:
				getSearch().clear();
				getSearch().addAll((Collection<? extends Search>)newValue);
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
			case JdlPackage.JDL__APPLICATIONS:
				getApplications().clear();
				return;
			case JdlPackage.JDL__ENTITIES:
				getEntities().clear();
				return;
			case JdlPackage.JDL__ENUMS:
				getEnums().clear();
				return;
			case JdlPackage.JDL__PAGINATE:
				getPaginate().clear();
				return;
			case JdlPackage.JDL__DTO:
				getDto().clear();
				return;
			case JdlPackage.JDL__SERVICE:
				getService().clear();
				return;
			case JdlPackage.JDL__SEARCH:
				getSearch().clear();
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
			case JdlPackage.JDL__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case JdlPackage.JDL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case JdlPackage.JDL__ENUMS:
				return enums != null && !enums.isEmpty();
			case JdlPackage.JDL__PAGINATE:
				return paginate != null && !paginate.isEmpty();
			case JdlPackage.JDL__DTO:
				return dto != null && !dto.isEmpty();
			case JdlPackage.JDL__SERVICE:
				return service != null && !service.isEmpty();
			case JdlPackage.JDL__SEARCH:
				return search != null && !search.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JDLImpl
