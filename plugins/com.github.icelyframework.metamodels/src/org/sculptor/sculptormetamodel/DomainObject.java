/**
 */
package org.sculptor.sculptormetamodel;

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
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getReferences <em>References</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getModule <em>Module</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#isOptimisticLocking <em>Optimistic Locking</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#isCache <em>Cache</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getPackage <em>Package</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getDatabaseTable <em>Database Table</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getExtendsName <em>Extends Name</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getDiscriminatorColumnValue <em>Discriminator Column Value</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getBelongsToAggregate <em>Belongs To Aggregate</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.DomainObject#getTraits <em>Traits</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface DomainObject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Reference}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Reference#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_References()
	 * @see org.sculptor.sculptormetamodel.Reference#getFrom
	 * @model opposite="from" containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DomainObject)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Extends()
	 * @model
	 * @generated
	 */
	DomainObject getExtends();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Repository#getAggregateRoot <em>Aggregate Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(Repository)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Repository()
	 * @see org.sculptor.sculptormetamodel.Repository#getAggregateRoot
	 * @model opposite="aggregateRoot" containment="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Module#getDomainObjects <em>Domain Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(org.sculptor.sculptormetamodel.Module)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Module()
	 * @see org.sculptor.sculptormetamodel.Module#getDomainObjects
	 * @model opposite="domainObjects" transient="false"
	 * @generated
	 */
	org.sculptor.sculptormetamodel.Module getModule();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(org.sculptor.sculptormetamodel.Module value);

	/**
	 * Returns the value of the '<em><b>Optimistic Locking</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimistic Locking</em>' attribute.
	 * @see #setOptimisticLocking(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_OptimisticLocking()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isOptimisticLocking();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#isOptimisticLocking <em>Optimistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimistic Locking</em>' attribute.
	 * @see #isOptimisticLocking()
	 * @generated
	 */
	void setOptimisticLocking(boolean value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Cache()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCache();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#isCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #isCache()
	 * @generated
	 */
	void setCache(boolean value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Package()
	 * @model unique="false"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Database Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Table</em>' attribute.
	 * @see #setDatabaseTable(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_DatabaseTable()
	 * @model unique="false"
	 * @generated
	 */
	String getDatabaseTable();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getDatabaseTable <em>Database Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Table</em>' attribute.
	 * @see #getDatabaseTable()
	 * @generated
	 */
	void setDatabaseTable(String value);

	/**
	 * Returns the value of the '<em><b>Extends Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Name</em>' attribute.
	 * @see #setExtendsName(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_ExtendsName()
	 * @model unique="false"
	 * @generated
	 */
	String getExtendsName();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getExtendsName <em>Extends Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Name</em>' attribute.
	 * @see #getExtendsName()
	 * @generated
	 */
	void setExtendsName(String value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Validate()
	 * @model unique="false"
	 * @generated
	 */
	String getValidate();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #getValidate()
	 * @generated
	 */
	void setValidate(String value);

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_GapClass()
	 * @model unique="false"
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' reference.
	 * @see #setInheritance(Inheritance)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Inheritance()
	 * @model
	 * @generated
	 */
	Inheritance getInheritance();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getInheritance <em>Inheritance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance</em>' reference.
	 * @see #getInheritance()
	 * @generated
	 */
	void setInheritance(Inheritance value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Value</em>' attribute.
	 * @see #setDiscriminatorColumnValue(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_DiscriminatorColumnValue()
	 * @model unique="false"
	 * @generated
	 */
	String getDiscriminatorColumnValue();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getDiscriminatorColumnValue <em>Discriminator Column Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Value</em>' attribute.
	 * @see #getDiscriminatorColumnValue()
	 * @generated
	 */
	void setDiscriminatorColumnValue(String value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' attribute.
	 * @see #setAggregateRoot(boolean)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_AggregateRoot()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAggregateRoot();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#isAggregateRoot <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' attribute.
	 * @see #isAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Aggregate</em>' reference.
	 * @see #setBelongsToAggregate(DomainObject)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_BelongsToAggregate()
	 * @model
	 * @generated
	 */
	DomainObject getBelongsToAggregate();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.DomainObject#getBelongsToAggregate <em>Belongs To Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Aggregate</em>' reference.
	 * @see #getBelongsToAggregate()
	 * @generated
	 */
	void setBelongsToAggregate(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.DomainObjectOperation}.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.DomainObjectOperation#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Operations()
	 * @see org.sculptor.sculptormetamodel.DomainObjectOperation#getDomainObject
	 * @model opposite="domainObject" containment="true"
	 * @generated
	 */
	EList<DomainObjectOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Traits</b></em>' reference list.
	 * The list contents are of type {@link org.sculptor.sculptormetamodel.Trait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traits</em>' reference list.
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getDomainObject_Traits()
	 * @model
	 * @generated
	 */
	EList<Trait> getTraits();

} // DomainObject
