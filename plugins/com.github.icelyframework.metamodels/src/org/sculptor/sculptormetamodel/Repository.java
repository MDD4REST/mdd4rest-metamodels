/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Repository#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Repository#getAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Repository#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Repository#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Repository#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Repository#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository_GapClass()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Repository#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.DomainObject#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' container reference.
	 * @see #setAggregateRoot(DomainObject)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository_AggregateRoot()
	 * @see org.sculptor.sculptormetamodel.DomainObject#getRepository
	 * @model opposite="repository" transient="false"
	 * @generated
	 */
	DomainObject getAggregateRoot();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Repository#getAggregateRoot <em>Aggregate Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' container reference.
	 * @see #getAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.RepositoryOperation}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.RepositoryOperation#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository_Operations()
	 * @see org.sculptor.sculptormetamodel.RepositoryOperation#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<RepositoryOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Repository Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Dependencies</em>' reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository_RepositoryDependencies()
	 * @model
	 * @generated
	 */
	EList<Repository> getRepositoryDependencies();

	/**
	 * Returns the value of the '<em><b>Other Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dependencies</em>' attribute list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository_OtherDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getOtherDependencies();

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' reference.
	 * @see #setSubscribe(Subscribe)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getRepository_Subscribe()
	 * @model
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Repository#getSubscribe <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

} // Repository
