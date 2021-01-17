/**
 */
package org.sculptor.sculptormetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObjectOperation#getDomainObject <em>Domain Object</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObjectOperation#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObjectOperation()
 * @model
 * @generated
 */
public interface DomainObjectOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.DomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' container reference.
	 * @see #setDomainObject(DomainObject)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObjectOperation_DomainObject()
	 * @see org.sculptor.sculptormetamodel.DomainObject#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	DomainObject getDomainObject();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObjectOperation#getDomainObject <em>Domain Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object</em>' container reference.
	 * @see #getDomainObject()
	 * @generated
	 */
	void setDomainObject(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObjectOperation_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObjectOperation#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

} // DomainObjectOperation
