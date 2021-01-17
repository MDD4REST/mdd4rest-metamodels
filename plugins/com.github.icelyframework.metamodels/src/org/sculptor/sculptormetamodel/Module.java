/**
 */
package org.sculptor.sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#isExternal <em>External</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getApplication <em>Application</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getServices <em>Services</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.Module#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Module#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_External()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Module#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit</em>' attribute.
	 * @see #setPersistenceUnit(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_PersistenceUnit()
	 * @model unique="false"
	 * @generated
	 */
	String getPersistenceUnit();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Module#getPersistenceUnit <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit</em>' attribute.
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	void setPersistenceUnit(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Application#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_Application()
	 * @see org.sculptor.sculptormetamodel.Application#getModules
	 * @model opposite="modules" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.Module#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Domain Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.DomainObject}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.DomainObject#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Objects</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_DomainObjects()
	 * @see org.sculptor.sculptormetamodel.DomainObject#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<DomainObject> getDomainObjects();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Service}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_Services()
	 * @see org.sculptor.sculptormetamodel.Service#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Consumer}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Consumer#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_Consumers()
	 * @see org.sculptor.sculptormetamodel.Consumer#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Consumer> getConsumers();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Resource}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Resource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getModule_Resources()
	 * @see org.sculptor.sculptormetamodel.Resource#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // Module
