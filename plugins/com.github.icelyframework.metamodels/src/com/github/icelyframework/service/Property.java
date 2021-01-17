/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.Property#isUnique <em>Unique</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#isRequired <em>Required</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getMin <em>Min</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getMax <em>Max</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getType <em>Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#isNullable <em>Nullable</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getDatabaseColumn <em>Database Column</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#isTransient <em>Transient</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getValidate <em>Validate</em>}</li>
 *   <li>{@link com.github.icelyframework.service.Property#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Naming Property</em>' attribute.
	 * @see #setIsNamingProperty(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_IsNamingProperty()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsNamingProperty();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#isIsNamingProperty <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Naming Property</em>' attribute.
	 * @see #isIsNamingProperty()
	 * @generated
	 */
	void setIsNamingProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Required()
	 * @model default="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDefinition)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Changeable()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Nullable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Database Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Column</em>' attribute.
	 * @see #setDatabaseColumn(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_DatabaseColumn()
	 * @model unique="false"
	 * @generated
	 */
	String getDatabaseColumn();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getDatabaseColumn <em>Database Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Column</em>' attribute.
	 * @see #getDatabaseColumn()
	 * @generated
	 */
	void setDatabaseColumn(String value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Transient()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Validate()
	 * @model unique="false"
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see com.github.icelyframework.service.ServicePackage#getProperty_Length()
	 * @model unique="false"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.Property#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

} // Property
