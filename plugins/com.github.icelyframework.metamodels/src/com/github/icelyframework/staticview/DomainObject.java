/**
 */
package com.github.icelyframework.staticview;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#getHasRelation <em>Has Relation</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.DomainObject#isScaffold <em>Scaffold</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface DomainObject extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.staticview.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' containment reference list.
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHasProperty();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.DomainObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.DomainObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' attribute.
	 * @see #setAggregateRoot(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_AggregateRoot()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAggregateRoot();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.DomainObject#isAggregateRoot <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' attribute.
	 * @see #isAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Relation</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.staticview.Relation}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relation</em>' containment reference list.
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_HasRelation()
	 * @see com.github.icelyframework.staticview.Relation#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relation> getHasRelation();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.staticview.Aggregate#getHasDomainobject <em>Has Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' container reference.
	 * @see #setAggregate(Aggregate)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_Aggregate()
	 * @see com.github.icelyframework.staticview.Aggregate#getHasDomainobject
	 * @model opposite="hasDomainobject" required="true" transient="false"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.DomainObject#getAggregate <em>Aggregate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' container reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DomainObject)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_Extends()
	 * @model
	 * @generated
	 */
	DomainObject getExtends();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.DomainObject#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaffold</em>' attribute.
	 * @see #setScaffold(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getDomainObject_Scaffold()
	 * @model
	 * @generated
	 */
	boolean isScaffold();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.DomainObject#isScaffold <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaffold</em>' attribute.
	 * @see #isScaffold()
	 * @generated
	 */
	void setScaffold(boolean value);

} // DomainObject
