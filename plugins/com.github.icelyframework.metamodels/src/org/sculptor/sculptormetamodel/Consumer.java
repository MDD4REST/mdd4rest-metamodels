/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getModule <em>Module</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getMessageRoot <em>Message Root</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Consumer#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer()
 * @model
 * @generated
 */
public interface Consumer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Module#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(org.sculptor.sculptormetamodel.Module)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_Module()
	 * @see org.sculptor.sculptormetamodel.Module#getConsumers
	 * @model opposite="consumers" transient="false"
	 * @generated
	 */
	org.sculptor.sculptormetamodel.Module getModule();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Consumer#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.sculptor.sculptormetamodel.Module value);

	/**
	 * Returns the value of the '<em><b>Repository Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Dependencies</em>' reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_RepositoryDependencies()
	 * @model
	 * @generated
	 */
	EList<Repository> getRepositoryDependencies();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_Channel()
	 * @model unique="false"
	 * @generated
	 */
	String getChannel();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Consumer#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(String value);

	/**
	 * Returns the value of the '<em><b>Message Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Root</em>' reference.
	 * @see #setMessageRoot(DomainObject)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_MessageRoot()
	 * @model
	 * @generated
	 */
	DomainObject getMessageRoot();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Consumer#getMessageRoot <em>Message Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Root</em>' reference.
	 * @see #getMessageRoot()
	 * @generated
	 */
	void setMessageRoot(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Other Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dependencies</em>' attribute list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_OtherDependencies()
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
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getConsumer_Subscribe()
	 * @model
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Consumer#getSubscribe <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

} // Consumer
