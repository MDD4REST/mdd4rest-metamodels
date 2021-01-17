/**
 */
package org.sculptor.sculptormetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.TypedElement#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.TypedElement#getMapKeyType <em>Map Key Type</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getTypedElement_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.TypedElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see #setCollectionType(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getTypedElement_CollectionType()
	 * @model unique="false"
	 * @generated
	 */
	String getCollectionType();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.TypedElement#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(String value);

	/**
	 * Returns the value of the '<em><b>Map Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Type</em>' attribute.
	 * @see #setMapKeyType(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getTypedElement_MapKeyType()
	 * @model unique="false"
	 * @generated
	 */
	String getMapKeyType();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.TypedElement#getMapKeyType <em>Map Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Type</em>' attribute.
	 * @see #getMapKeyType()
	 * @generated
	 */
	void setMapKeyType(String value);

} // TypedElement
