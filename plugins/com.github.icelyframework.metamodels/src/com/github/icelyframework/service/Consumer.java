/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Consumer#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Consumer#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Consumer#getChannel <em>Channel</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Consumer#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Consumer#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Consumer#getMessageRoot <em>Message Root</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getConsumer()
 * @model
 * @generated
 */
public interface Consumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Dependencies</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getConsumer_RepositoryDependencies()
	 * @model
	 * @generated
	 */
	EList<Repository> getRepositoryDependencies();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getConsumer_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(String)
	 * @see com.github.icelyframework.service.ServicePackage#getConsumer_Channel()
	 * @model unique="false"
	 * @generated
	 */
	String getChannel();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Consumer#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(String value);

	/**
	 * Returns the value of the '<em><b>Other Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dependencies</em>' attribute list.
	 * @see com.github.icelyframework.service.ServicePackage#getConsumer_OtherDependencies()
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
	 * @see com.github.icelyframework.service.ServicePackage#getConsumer_Subscribe()
	 * @model containment="true"
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Consumer#getSubscribe <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' containment reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

	/**
	 * Returns the value of the '<em><b>Message Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Root</em>' reference.
	 * @see #setMessageRoot(DomainObject)
	 * @see com.github.icelyframework.service.ServicePackage#getConsumer_MessageRoot()
	 * @model
	 * @generated
	 */
	DomainObject getMessageRoot();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Consumer#getMessageRoot <em>Message Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Root</em>' reference.
	 * @see #getMessageRoot()
	 * @generated
	 */
	void setMessageRoot(DomainObject value);

} // Consumer
