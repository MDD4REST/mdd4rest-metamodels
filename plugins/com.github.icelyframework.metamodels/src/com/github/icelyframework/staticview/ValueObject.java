/**
 */
package com.github.icelyframework.staticview;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.staticview.ValueObject#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link com.github.icelyframework.staticview.ValueObject#isPersistent <em>Persistent</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.staticview.StaticviewPackage#getValueObject()
 * @model
 * @generated
 */
public interface ValueObject extends DomainObject {
	/**
	 * Returns the value of the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immutable</em>' attribute.
	 * @see #setImmutable(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getValueObject_Immutable()
	 * @model
	 * @generated
	 */
	boolean isImmutable();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.ValueObject#isImmutable <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immutable</em>' attribute.
	 * @see #isImmutable()
	 * @generated
	 */
	void setImmutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see com.github.icelyframework.staticview.StaticviewPackage#getValueObject_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.staticview.ValueObject#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

} // ValueObject
