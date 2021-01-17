/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.DomainEvent;
import com.github.icelyframework.service.ServicePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DomainEventImpl extends EventImpl implements DomainEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DOMAIN_EVENT;
	}

} //DomainEventImpl
