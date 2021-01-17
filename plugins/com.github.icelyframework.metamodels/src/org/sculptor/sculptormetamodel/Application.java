/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Application#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Application#getProject <em>Project</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Application#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getApplication_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Application#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Project#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getApplication_Project()
	 * @see org.sculptor.sculptormetamodel.Project#getApplications
	 * @model opposite="applications" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Application#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Module}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Module#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getApplication_Modules()
	 * @see org.sculptor.sculptormetamodel.Module#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<org.sculptor.sculptormetamodel.Module> getModules();

} // Application
