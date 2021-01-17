/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Resource#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Resource#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Resource#getPath <em>Path</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Resource#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Resource#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResource_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResource_GapClass()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Resource#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResource_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Resource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.ResourceOperation}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.ResourceOperation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResource_Operations()
	 * @see org.sculptor.sculptormetamodel.ResourceOperation#getResource
	 * @model opposite="resource" containment="true"
	 * @generated
	 */
	EList<ResourceOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Module#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(org.sculptor.sculptormetamodel.Module)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResource_Module()
	 * @see org.sculptor.sculptormetamodel.Module#getResources
	 * @model opposite="resources" transient="false"
	 * @generated
	 */
	org.sculptor.sculptormetamodel.Module getModule();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Resource#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.sculptor.sculptormetamodel.Module value);

} // Resource
