/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.ServiceOperation#getService <em>Service</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ServiceOperation#getServiceDelegate <em>Service Delegate</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ServiceOperation#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getServiceOperation()
 * @model
 * @generated
 */
public interface ServiceOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(Service)
	 * @see com.github.icelyframework.service.ServicePackage#getServiceOperation_Service()
	 * @see com.github.icelyframework.service.Service#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ServiceOperation#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Service Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delegate</em>' reference.
	 * @see #setServiceDelegate(ServiceOperation)
	 * @see com.github.icelyframework.service.ServicePackage#getServiceOperation_ServiceDelegate()
	 * @model
	 * @generated
	 */
	ServiceOperation getServiceDelegate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ServiceOperation#getServiceDelegate <em>Service Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delegate</em>' reference.
	 * @see #getServiceDelegate()
	 * @generated
	 */
	void setServiceDelegate(ServiceOperation value);

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(RepositoryOperation)
	 * @see com.github.icelyframework.service.ServicePackage#getServiceOperation_Delegate()
	 * @model
	 * @generated
	 */
	RepositoryOperation getDelegate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ServiceOperation#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(RepositoryOperation value);

} // ServiceOperation
