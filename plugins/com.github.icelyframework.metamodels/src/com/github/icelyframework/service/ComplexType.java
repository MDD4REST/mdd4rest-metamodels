/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.ComplexType#getType <em>Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ComplexType#getCollection <em>Collection</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ComplexType#getMappedType <em>Mapped Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDefinition)
	 * @see com.github.icelyframework.service.ServicePackage#getComplexType_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ComplexType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.CollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see com.github.icelyframework.service.CollectionType
	 * @see #setCollection(CollectionType)
	 * @see com.github.icelyframework.service.ServicePackage#getComplexType_Collection()
	 * @model
	 * @generated
	 */
	CollectionType getCollection();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ComplexType#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see com.github.icelyframework.service.CollectionType
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CollectionType value);

	/**
	 * Returns the value of the '<em><b>Mapped Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Type</em>' reference.
	 * @see #setMappedType(TypeDefinition)
	 * @see com.github.icelyframework.service.ServicePackage#getComplexType_MappedType()
	 * @model
	 * @generated
	 */
	TypeDefinition getMappedType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ComplexType#getMappedType <em>Mapped Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Type</em>' reference.
	 * @see #getMappedType()
	 * @generated
	 */
	void setMappedType(TypeDefinition value);

} // ComplexType
