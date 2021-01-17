/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.DTO;
import com.github.icelyframework.service.DataMapper;
import com.github.icelyframework.service.DomainObject;
import com.github.icelyframework.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.DataMapperImpl#getDomainObject <em>Domain Object</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.DataMapperImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.DataMapperImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataMapperImpl extends EObjectImpl implements DataMapper {
	/**
	 * The cached value of the '{@link #getDomainObject() <em>Domain Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainObject;

	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected DTO dto;

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
	protected DataMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DATA_MAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObject> getDomainObject() {
		if (domainObject == null) {
			domainObject = new EObjectResolvingEList<DomainObject>(DomainObject.class, this, ServicePackage.DATA_MAPPER__DOMAIN_OBJECT);
		}
		return domainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTO getDto() {
		if (dto != null && dto.eIsProxy()) {
			InternalEObject oldDto = (InternalEObject)dto;
			dto = (DTO)eResolveProxy(oldDto);
			if (dto != oldDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.DATA_MAPPER__DTO, oldDto, dto));
			}
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetDto() {
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDto(DTO newDto) {
		DTO oldDto = dto;
		dto = newDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DATA_MAPPER__DTO, oldDto, dto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DATA_MAPPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.DATA_MAPPER__DOMAIN_OBJECT:
				return getDomainObject();
			case ServicePackage.DATA_MAPPER__DTO:
				if (resolve) return getDto();
				return basicGetDto();
			case ServicePackage.DATA_MAPPER__NAME:
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
			case ServicePackage.DATA_MAPPER__DOMAIN_OBJECT:
				getDomainObject().clear();
				getDomainObject().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case ServicePackage.DATA_MAPPER__DTO:
				setDto((DTO)newValue);
				return;
			case ServicePackage.DATA_MAPPER__NAME:
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
			case ServicePackage.DATA_MAPPER__DOMAIN_OBJECT:
				getDomainObject().clear();
				return;
			case ServicePackage.DATA_MAPPER__DTO:
				setDto((DTO)null);
				return;
			case ServicePackage.DATA_MAPPER__NAME:
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
			case ServicePackage.DATA_MAPPER__DOMAIN_OBJECT:
				return domainObject != null && !domainObject.isEmpty();
			case ServicePackage.DATA_MAPPER__DTO:
				return dto != null;
			case ServicePackage.DATA_MAPPER__NAME:
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

} //DataMapperImpl
