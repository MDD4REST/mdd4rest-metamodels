/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Application#getConfig <em>Config</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Application#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Application#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Application#getDtos <em>Dtos</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Application#getPaginates <em>Paginates</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Application#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(Config)
	 * @see com.github.icelyframework.jdl.JdlPackage#getApplication_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getConfig();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Application#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(Config value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getApplication_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Deployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getApplication_Deployments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployments();

	/**
	 * Returns the value of the '<em><b>Dtos</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.DTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtos</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getApplication_Dtos()
	 * @model
	 * @generated
	 */
	EList<DTO> getDtos();

	/**
	 * Returns the value of the '<em><b>Paginates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginates</em>' reference.
	 * @see #setPaginates(Paginate)
	 * @see com.github.icelyframework.jdl.JdlPackage#getApplication_Paginates()
	 * @model
	 * @generated
	 */
	Paginate getPaginates();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Application#getPaginates <em>Paginates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paginates</em>' reference.
	 * @see #getPaginates()
	 * @generated
	 */
	void setPaginates(Paginate value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(Service)
	 * @see com.github.icelyframework.jdl.JdlPackage#getApplication_Services()
	 * @model
	 * @generated
	 */
	Service getServices();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Application#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Service value);

} // Application
