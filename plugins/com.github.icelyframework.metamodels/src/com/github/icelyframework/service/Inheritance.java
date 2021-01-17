/**
 */
package com.github.icelyframework.service;

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
 *   <li>{@link com.github.icelyframework.service.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Inheritance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Discriminator Column Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Length</em>' attribute.
	 * @see #setDiscriminatorColumnLength(String)
	 * @see com.github.icelyframework.service.ServicePackage#getInheritance_DiscriminatorColumnLength()
	 * @model unique="false"
	 * @generated
	 */
	String getDiscriminatorColumnLength();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Length</em>' attribute.
	 * @see #getDiscriminatorColumnLength()
	 * @generated
	 */
	void setDiscriminatorColumnLength(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.DiscriminatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' attribute.
	 * @see com.github.icelyframework.service.DiscriminatorType
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @see com.github.icelyframework.service.ServicePackage#getInheritance_DiscriminatorType()
	 * @model unique="false"
	 * @generated
	 */
	DiscriminatorType getDiscriminatorType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' attribute.
	 * @see com.github.icelyframework.service.DiscriminatorType
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(DiscriminatorType value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Name</em>' attribute.
	 * @see #setDiscriminatorColumnName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getInheritance_DiscriminatorColumnName()
	 * @model unique="false"
	 * @generated
	 */
	String getDiscriminatorColumnName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Name</em>' attribute.
	 * @see #getDiscriminatorColumnName()
	 * @generated
	 */
	void setDiscriminatorColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.InheritanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.github.icelyframework.service.InheritanceType
	 * @see #setType(InheritanceType)
	 * @see com.github.icelyframework.service.ServicePackage#getInheritance_Type()
	 * @model unique="false"
	 * @generated
	 */
	InheritanceType getType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Inheritance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.github.icelyframework.service.InheritanceType
	 * @see #getType()
	 * @generated
	 */
	void setType(InheritanceType value);

} // Inheritance
