/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Operation#getThrows <em>Throws</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Operation#getPublish <em>Publish</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends DomainObjectTypedElement {
	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getOperation_Throws()
	 * @model unique="false"
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Operation#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getOperation_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Operation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' reference.
	 * @see #setPublish(Publish)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getOperation_Publish()
	 * @model
	 * @generated
	 */
	Publish getPublish();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Operation#getPublish <em>Publish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(Publish value);

} // Operation
