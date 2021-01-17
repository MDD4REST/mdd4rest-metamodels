/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Resource#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getPath <em>Path</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getModule <em>Module</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getInputrepresentation <em>Inputrepresentation</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Resource#getOutputrepresentation <em>Outputrepresentation</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getResource_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.ResourceOperation}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.ResourceOperation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Operations()
	 * @see com.github.icelyframework.service.ResourceOperation#getResource
	 * @model opposite="resource" containment="true"
	 * @generated
	 */
	EList<ResourceOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Path()
	 * @model containment="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Resource#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getResource_GapClass()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Resource#isGapClass <em>Gap Class</em>}' attribute.
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
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Module#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(com.github.icelyframework.service.Module)
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Module()
	 * @see com.github.icelyframework.service.Module#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	com.github.icelyframework.service.Module getModule();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Resource#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(com.github.icelyframework.service.Module value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Inputrepresentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputrepresentation</em>' containment reference.
	 * @see #setInputrepresentation(InputRepresentation)
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Inputrepresentation()
	 * @model containment="true"
	 * @generated
	 */
	InputRepresentation getInputrepresentation();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Resource#getInputrepresentation <em>Inputrepresentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputrepresentation</em>' containment reference.
	 * @see #getInputrepresentation()
	 * @generated
	 */
	void setInputrepresentation(InputRepresentation value);

	/**
	 * Returns the value of the '<em><b>Outputrepresentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputrepresentation</em>' containment reference.
	 * @see #setOutputrepresentation(OutputRepresentation)
	 * @see com.github.icelyframework.service.ServicePackage#getResource_Outputrepresentation()
	 * @model containment="true"
	 * @generated
	 */
	OutputRepresentation getOutputrepresentation();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Resource#getOutputrepresentation <em>Outputrepresentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputrepresentation</em>' containment reference.
	 * @see #getOutputrepresentation()
	 * @generated
	 */
	void setOutputrepresentation(OutputRepresentation value);

} // Resource
