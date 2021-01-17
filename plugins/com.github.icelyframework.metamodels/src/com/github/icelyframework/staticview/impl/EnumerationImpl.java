/**
 */
package com.github.icelyframework.staticview.impl;

import com.github.icelyframework.staticview.Enumeration;
import com.github.icelyframework.staticview.Literal;
import com.github.icelyframework.staticview.StaticviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.impl.EnumerationImpl#getHasLiteral <em>Has Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends DomainObjectImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getHasLiteral() <em>Has Literal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLiteral()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> hasLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticviewPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Literal> getHasLiteral() {
		if (hasLiteral == null) {
			hasLiteral = new EObjectContainmentEList<Literal>(Literal.class, this, StaticviewPackage.ENUMERATION__HAS_LITERAL);
		}
		return hasLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticviewPackage.ENUMERATION__HAS_LITERAL:
				return ((InternalEList<?>)getHasLiteral()).basicRemove(otherEnd, msgs);
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
			case StaticviewPackage.ENUMERATION__HAS_LITERAL:
				return getHasLiteral();
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
			case StaticviewPackage.ENUMERATION__HAS_LITERAL:
				getHasLiteral().clear();
				getHasLiteral().addAll((Collection<? extends Literal>)newValue);
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
			case StaticviewPackage.ENUMERATION__HAS_LITERAL:
				getHasLiteral().clear();
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
			case StaticviewPackage.ENUMERATION__HAS_LITERAL:
				return hasLiteral != null && !hasLiteral.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationImpl
