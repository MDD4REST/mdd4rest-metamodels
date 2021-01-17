/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Authenticated;
import com.github.icelyframework.service.ServicePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authenticated</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AuthenticatedImpl extends PermissionImpl implements Authenticated {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.AUTHENTICATED;
	}

} //AuthenticatedImpl
