/**
 */
package openapi2.impl;

import java.util.Collection;

import openapi2.Openapi2Package;
import openapi2.RequiredSecurityScheme;
import openapi2.SecurityRequirement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openapi2.impl.SecurityRequirementImpl#getSecuritySchemes <em>Security Schemes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementImpl extends EObjectImpl implements SecurityRequirement {
	/**
	 * The cached value of the '{@link #getSecuritySchemes() <em>Security Schemes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredSecurityScheme> securitySchemes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi2Package.Literals.SECURITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredSecurityScheme> getSecuritySchemes() {
		if (securitySchemes == null) {
			securitySchemes = new EObjectContainmentEList<RequiredSecurityScheme>(RequiredSecurityScheme.class, this, Openapi2Package.SECURITY_REQUIREMENT__SECURITY_SCHEMES);
		}
		return securitySchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi2Package.SECURITY_REQUIREMENT__SECURITY_SCHEMES:
				return ((InternalEList<?>)getSecuritySchemes()).basicRemove(otherEnd, msgs);
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
			case Openapi2Package.SECURITY_REQUIREMENT__SECURITY_SCHEMES:
				return getSecuritySchemes();
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
			case Openapi2Package.SECURITY_REQUIREMENT__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
				getSecuritySchemes().addAll((Collection<? extends RequiredSecurityScheme>)newValue);
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
			case Openapi2Package.SECURITY_REQUIREMENT__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
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
			case Openapi2Package.SECURITY_REQUIREMENT__SECURITY_SCHEMES:
				return securitySchemes != null && !securitySchemes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityRequirementImpl
