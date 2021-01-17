/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Enum#getValues <em>Values</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Enum#isOrdinal <em>Ordinal</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends DomainObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getEnum_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumValue> getValues();

	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getEnum_Ordinal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOrdinal();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Enum#isOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #isOrdinal()
	 * @generated
	 */
	void setOrdinal(boolean value);

} // Enum
