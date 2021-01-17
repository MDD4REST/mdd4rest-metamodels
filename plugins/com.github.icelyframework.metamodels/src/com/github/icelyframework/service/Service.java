/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Service#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#isWebService <em>Web Service</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#isRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#isLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Service#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.ServiceOperation}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.ServiceOperation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getService_Operations()
	 * @see com.github.icelyframework.service.ServiceOperation#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<ServiceOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Repository Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Dependencies</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getService_RepositoryDependencies()
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
	 * @see com.github.icelyframework.service.ServicePackage#getService_OtherDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getOtherDependencies();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getService_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Service</em>' attribute.
	 * @see #setWebService(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getService_WebService()
	 * @model unique="false"
	 * @generated
	 */
	boolean isWebService();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#isWebService <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Service</em>' attribute.
	 * @see #isWebService()
	 * @generated
	 */
	void setWebService(boolean value);

	/**
	 * Returns the value of the '<em><b>Remote Interface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Interface</em>' attribute.
	 * @see #setRemoteInterface(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getService_RemoteInterface()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isRemoteInterface();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#isRemoteInterface <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Interface</em>' attribute.
	 * @see #isRemoteInterface()
	 * @generated
	 */
	void setRemoteInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Interface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Interface</em>' attribute.
	 * @see #setLocalInterface(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getService_LocalInterface()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isLocalInterface();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#isLocalInterface <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Interface</em>' attribute.
	 * @see #isLocalInterface()
	 * @generated
	 */
	void setLocalInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' containment reference.
	 * @see #setSubscribe(Subscribe)
	 * @see com.github.icelyframework.service.ServicePackage#getService_Subscribe()
	 * @model containment="true"
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#getSubscribe <em>Subscribe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' containment reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getService_GapClass()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#isGapClass <em>Gap Class</em>}' attribute.
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
	 * @see com.github.icelyframework.service.ServicePackage#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(com.github.icelyframework.service.Module)
	 * @see com.github.icelyframework.service.ServicePackage#getService_Module()
	 * @see com.github.icelyframework.service.Module#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	com.github.icelyframework.service.Module getModule();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Service#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(com.github.icelyframework.service.Module value);

} // Service
