/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getApplications <em>Applications</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getEnums <em>Enums</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getPaginate <em>Paginate</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getDto <em>Dto</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getService <em>Service</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getSearch <em>Search</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.JDL#getDeployments <em>Deployments</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getJDL()
 * @model
 * @generated
 */
public interface JDL extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Applications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<com.github.icelyframework.jdl.Enum> getEnums();

	/**
	 * Returns the value of the '<em><b>Paginate</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Paginate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginate</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Paginate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paginate> getPaginate();

	/**
	 * Returns the value of the '<em><b>Dto</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.DTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Dto()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTO> getDto();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Search}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Search()
	 * @model containment="true"
	 * @generated
	 */
	EList<Search> getSearch();

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Deployment}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.jdl.Deployment#getJdl <em>Jdl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getJDL_Deployments()
	 * @see com.github.icelyframework.jdl.Deployment#getJdl
	 * @model opposite="jdl"
	 * @generated
	 */
	EList<Deployment> getDeployments();

} // JDL
