/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Relationship#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Relationship#getToName <em>To Name</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Relationship#getFromColumn <em>From Column</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Relationship#getFromName <em>From Name</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see com.github.icelyframework.jdl.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see com.github.icelyframework.jdl.JdlPackage#getRelationship_Multiplicity()
	 * @model
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Relationship#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see com.github.icelyframework.jdl.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Name</em>' attribute.
	 * @see #setToName(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getRelationship_ToName()
	 * @model
	 * @generated
	 */
	String getToName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Relationship#getToName <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Name</em>' attribute.
	 * @see #getToName()
	 * @generated
	 */
	void setToName(String value);

	/**
	 * Returns the value of the '<em><b>From Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Column</em>' containment reference.
	 * @see #setFromColumn(RelationshipColumn)
	 * @see com.github.icelyframework.jdl.JdlPackage#getRelationship_FromColumn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelationshipColumn getFromColumn();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Relationship#getFromColumn <em>From Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Column</em>' containment reference.
	 * @see #getFromColumn()
	 * @generated
	 */
	void setFromColumn(RelationshipColumn value);

	/**
	 * Returns the value of the '<em><b>From Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Name</em>' attribute.
	 * @see #setFromName(String)
	 * @see com.github.icelyframework.jdl.JdlPackage#getRelationship_FromName()
	 * @model
	 * @generated
	 */
	String getFromName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Relationship#getFromName <em>From Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Name</em>' attribute.
	 * @see #getFromName()
	 * @generated
	 */
	void setFromName(String value);

} // Relationship
