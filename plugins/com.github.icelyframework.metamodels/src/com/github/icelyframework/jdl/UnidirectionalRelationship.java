/**
 */
package com.github.icelyframework.jdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unidirectional Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.UnidirectionalRelationship#getToEntity <em>To Entity</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getUnidirectionalRelationship()
 * @model
 * @generated
 */
public interface UnidirectionalRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Entity</em>' reference.
	 * @see #setToEntity(Entity)
	 * @see com.github.icelyframework.jdl.JdlPackage#getUnidirectionalRelationship_ToEntity()
	 * @model required="true"
	 * @generated
	 */
	Entity getToEntity();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.UnidirectionalRelationship#getToEntity <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Entity</em>' reference.
	 * @see #getToEntity()
	 * @generated
	 */
	void setToEntity(Entity value);

} // UnidirectionalRelationship
