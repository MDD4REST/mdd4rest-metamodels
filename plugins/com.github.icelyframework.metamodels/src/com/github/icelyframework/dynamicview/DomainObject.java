/**
 */
package com.github.icelyframework.dynamicview;

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
 *   <li>{@link com.github.icelyframework.dynamicview.DomainObject#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.DomainObject#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.DomainObject#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.DomainObject#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface DomainObject extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getDomainObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.DomainObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' attribute.
	 * @see #setAggregateRoot(boolean)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getDomainObject_AggregateRoot()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAggregateRoot();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.DomainObject#isAggregateRoot <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' attribute.
	 * @see #isAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Operation</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.dynamicview.DomainObjectOperation}.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.dynamicview.DomainObjectOperation#getDomainobject <em>Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operation</em>' containment reference list.
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getDomainObject_HasOperation()
	 * @see com.github.icelyframework.dynamicview.DomainObjectOperation#getDomainobject
	 * @model opposite="domainobject" containment="true"
	 * @generated
	 */
	EList<DomainObjectOperation> getHasOperation();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.dynamicview.Aggregate#getDomainobjects <em>Domainobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' container reference.
	 * @see #setAggregate(Aggregate)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getDomainObject_Aggregate()
	 * @see com.github.icelyframework.dynamicview.Aggregate#getDomainobjects
	 * @model opposite="domainobjects" required="true" transient="false"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.DomainObject#getAggregate <em>Aggregate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' container reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

} // DomainObject
