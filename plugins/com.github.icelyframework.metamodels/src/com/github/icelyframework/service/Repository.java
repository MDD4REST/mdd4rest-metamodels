/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Repository#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Repository#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Repository#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Repository#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Repository#getAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Repository#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Repository#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.RepositoryOperation}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.RepositoryOperation#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_Operations()
	 * @see com.github.icelyframework.service.RepositoryOperation#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<RepositoryOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Repository Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Dependencies</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_RepositoryDependencies()
	 * @model
	 * @generated
	 */
	EList<Repository> getRepositoryDependencies();

	/**
	 * Returns the value of the '<em><b>Other Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dependencies</em>' attribute list.
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_OtherDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getOtherDependencies();

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' containment reference.
	 * @see #setSubscribe(Subscribe)
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_Subscribe()
	 * @model containment="true"
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Repository#getSubscribe <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' containment reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.DomainObject#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' container reference.
	 * @see #setAggregateRoot(DomainObject)
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_AggregateRoot()
	 * @see com.github.icelyframework.service.DomainObject#getRepository
	 * @model opposite="repository" transient="false"
	 * @generated
	 */
	DomainObject getAggregateRoot();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Repository#getAggregateRoot <em>Aggregate Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' container reference.
	 * @see #getAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_GapClass()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Repository#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Repository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Repository
