/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Inheritance#getType <em>Type</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Discriminator Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Name</em>' attribute.
	 * @see #setDiscriminatorColumnName(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getInheritance_DiscriminatorColumnName()
	 * @model unique="false"
	 * @generated
	 */
	String getDiscriminatorColumnName();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Name</em>' attribute.
	 * @see #getDiscriminatorColumnName()
	 * @generated
	 */
	void setDiscriminatorColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Length</em>' attribute.
	 * @see #setDiscriminatorColumnLength(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getInheritance_DiscriminatorColumnLength()
	 * @model unique="false"
	 * @generated
	 */
	String getDiscriminatorColumnLength();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Length</em>' attribute.
	 * @see #getDiscriminatorColumnLength()
	 * @generated
	 */
	void setDiscriminatorColumnLength(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sculptor.sculptormetamodel.InheritanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.sculptor.sculptormetamodel.InheritanceType
	 * @see #setType(InheritanceType)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getInheritance_Type()
	 * @model unique="false"
	 * @generated
	 */
	InheritanceType getType();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Inheritance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.sculptor.sculptormetamodel.InheritanceType
	 * @see #getType()
	 * @generated
	 */
	void setType(InheritanceType value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sculptor.sculptormetamodel.DiscriminatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' attribute.
	 * @see org.sculptor.sculptormetamodel.DiscriminatorType
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getInheritance_DiscriminatorType()
	 * @model unique="false"
	 * @generated
	 */
	DiscriminatorType getDiscriminatorType();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' attribute.
	 * @see org.sculptor.sculptormetamodel.DiscriminatorType
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(DiscriminatorType value);

} // Inheritance
