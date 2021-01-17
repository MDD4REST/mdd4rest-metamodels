/**
 */
package com.github.icelyframework.jdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bidirectional Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.BidirectionalRelationship#getToColumn <em>To Column</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getBidirectionalRelationship()
 * @model
 * @generated
 */
public interface BidirectionalRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>To Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Column</em>' containment reference.
	 * @see #setToColumn(RelationshipColumn)
	 * @see com.github.icelyframework.jdl.JdlPackage#getBidirectionalRelationship_ToColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationshipColumn getToColumn();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.BidirectionalRelationship#getToColumn <em>To Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Column</em>' containment reference.
	 * @see #getToColumn()
	 * @generated
	 */
	void setToColumn(RelationshipColumn value);

} // BidirectionalRelationship
