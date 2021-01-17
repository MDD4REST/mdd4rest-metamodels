/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Aggregate#getDomainobjects <em>Domainobjects</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Aggregate#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Aggregate#getModule <em>Module</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Aggregate#getAggregateRoot <em>Aggregate Root</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getAggregate()
 * @model
 * @generated
 */
public interface Aggregate extends EObject {
	/**
	 * Returns the value of the '<em><b>Domainobjects</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.DomainObject}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.DomainObject#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainobjects</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getAggregate_Domainobjects()
	 * @see com.github.icelyframework.service.DomainObject#getAggregate
	 * @model opposite="aggregate" containment="true" required="true"
	 * @generated
	 */
	EList<DomainObject> getDomainobjects();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getAggregate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Aggregate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Module#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(com.github.icelyframework.service.Module)
	 * @see com.github.icelyframework.service.ServicePackage#getAggregate_Module()
	 * @see com.github.icelyframework.service.Module#getAggregates
	 * @model opposite="aggregates" required="true" transient="false"
	 * @generated
	 */
	com.github.icelyframework.service.Module getModule();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Aggregate#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(com.github.icelyframework.service.Module value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' reference.
	 * @see #setAggregateRoot(DomainObject)
	 * @see com.github.icelyframework.service.ServicePackage#getAggregate_AggregateRoot()
	 * @model required="true"
	 * @generated
	 */
	DomainObject getAggregateRoot();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Aggregate#getAggregateRoot <em>Aggregate Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' reference.
	 * @see #getAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(DomainObject value);

} // Aggregate
