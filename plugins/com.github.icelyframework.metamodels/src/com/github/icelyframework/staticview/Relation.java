/**
 */
package com.github.icelyframework.staticview;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getCascade <em>Cascade</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#isRequired <em>Required</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#isNullable <em>Nullable</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.Relation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.staticview.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see com.github.icelyframework.staticview.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Multiplicity()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see com.github.icelyframework.staticview.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DomainObject)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	DomainObject getTarget();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.DomainObject#getHasRelation <em>Has Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(DomainObject)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Source()
	 * @see com.github.icelyframework.staticview.DomainObject#getHasRelation
	 * @model opposite="hasRelation" required="true" transient="false"
	 * @generated
	 */
	DomainObject getSource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see #setCascade(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Cascade()
	 * @model unique="false"
	 * @generated
	 */
	String getCascade();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(String value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' attribute.
	 * @see #setOrderBy(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_OrderBy()
	 * @model unique="false"
	 * @generated
	 */
	String getOrderBy();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By</em>' attribute.
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Visibility()
	 * @model unique="false"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Required()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Nullable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Relation)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Opposite()
	 * @model
	 * @generated
	 */
	Relation getOpposite();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Relation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDefinition)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.Relation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

} // Relation
