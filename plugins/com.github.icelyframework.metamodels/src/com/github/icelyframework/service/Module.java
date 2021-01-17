/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Module#isExternal <em>External</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getApplication <em>Application</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getServices <em>Services</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Module#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getModule_External()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Module#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see com.github.icelyframework.service.ServicePackage#getModule_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Module#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit</em>' attribute.
	 * @see #setPersistenceUnit(String)
	 * @see com.github.icelyframework.service.ServicePackage#getModule_PersistenceUnit()
	 * @model unique="false"
	 * @generated
	 */
	String getPersistenceUnit();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Module#getPersistenceUnit <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit</em>' attribute.
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	void setPersistenceUnit(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getModule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Aggregate}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Aggregate#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getModule_Aggregates()
	 * @see com.github.icelyframework.service.Aggregate#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Aggregate> getAggregates();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Application#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see com.github.icelyframework.service.ServicePackage#getModule_Application()
	 * @see com.github.icelyframework.service.Application#getModules
	 * @model opposite="modules" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Module#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Service}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getModule_Services()
	 * @see com.github.icelyframework.service.Service#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Resource}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Resource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getModule_Resources()
	 * @see com.github.icelyframework.service.Resource#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // Module
