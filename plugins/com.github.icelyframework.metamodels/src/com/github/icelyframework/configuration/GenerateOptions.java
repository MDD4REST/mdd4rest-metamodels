/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generate Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_conditionalCriteriaProperties <em>Generate domain Object conditional Criteria Properties</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_repository_finders <em>Generate repository finders</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_modelDoc <em>Generate model Doc</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_umlgraph <em>Generate umlgraph</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation_tx <em>Generate spring annotation tx</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl <em>Generate ddl</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl_drop <em>Generate ddl drop</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_compositeKeyClass <em>Generate domain Object composite Key Class</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_serviceContext <em>Generate service Context</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_NotFoundException <em>Generate Not Found Exception</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation <em>Generate spring annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation <em>Generate jpa annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_validation_annotation <em>Generate validation annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_onField <em>Generate jpa annotation on Field</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_columnDefinition <em>Generate jpa annotation column Definition</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_xstream_annotation <em>Generate xstream annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerat_test <em>Generat test</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_gapClass <em>Generate gap Class</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions()
 * @model
 * @generated
 */
public interface GenerateOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Generate domain Object conditional Criteria Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate domain Object conditional Criteria Properties</em>' attribute.
	 * @see #setGenerate_domainObject_conditionalCriteriaProperties(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_domainObject_conditionalCriteriaProperties()
	 * @model
	 * @generated
	 */
	boolean isGenerate_domainObject_conditionalCriteriaProperties();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_conditionalCriteriaProperties <em>Generate domain Object conditional Criteria Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate domain Object conditional Criteria Properties</em>' attribute.
	 * @see #isGenerate_domainObject_conditionalCriteriaProperties()
	 * @generated
	 */
	void setGenerate_domainObject_conditionalCriteriaProperties(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate repository finders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate repository finders</em>' attribute.
	 * @see #setGenerate_repository_finders(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_repository_finders()
	 * @model
	 * @generated
	 */
	boolean isGenerate_repository_finders();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_repository_finders <em>Generate repository finders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate repository finders</em>' attribute.
	 * @see #isGenerate_repository_finders()
	 * @generated
	 */
	void setGenerate_repository_finders(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate model Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate model Doc</em>' attribute.
	 * @see #setGenerate_modelDoc(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_modelDoc()
	 * @model
	 * @generated
	 */
	boolean isGenerate_modelDoc();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_modelDoc <em>Generate model Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate model Doc</em>' attribute.
	 * @see #isGenerate_modelDoc()
	 * @generated
	 */
	void setGenerate_modelDoc(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate umlgraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate umlgraph</em>' attribute.
	 * @see #setGenerate_umlgraph(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_umlgraph()
	 * @model
	 * @generated
	 */
	boolean isGenerate_umlgraph();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_umlgraph <em>Generate umlgraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate umlgraph</em>' attribute.
	 * @see #isGenerate_umlgraph()
	 * @generated
	 */
	void setGenerate_umlgraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate spring annotation tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate spring annotation tx</em>' attribute.
	 * @see #setGenerate_spring_annotation_tx(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_spring_annotation_tx()
	 * @model
	 * @generated
	 */
	boolean isGenerate_spring_annotation_tx();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation_tx <em>Generate spring annotation tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate spring annotation tx</em>' attribute.
	 * @see #isGenerate_spring_annotation_tx()
	 * @generated
	 */
	void setGenerate_spring_annotation_tx(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate ddl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate ddl</em>' attribute.
	 * @see #setGenerate_ddl(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_ddl()
	 * @model
	 * @generated
	 */
	boolean isGenerate_ddl();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl <em>Generate ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate ddl</em>' attribute.
	 * @see #isGenerate_ddl()
	 * @generated
	 */
	void setGenerate_ddl(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate ddl drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate ddl drop</em>' attribute.
	 * @see #setGenerate_ddl_drop(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_ddl_drop()
	 * @model
	 * @generated
	 */
	boolean isGenerate_ddl_drop();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_ddl_drop <em>Generate ddl drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate ddl drop</em>' attribute.
	 * @see #isGenerate_ddl_drop()
	 * @generated
	 */
	void setGenerate_ddl_drop(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate domain Object composite Key Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate domain Object composite Key Class</em>' attribute.
	 * @see #setGenerate_domainObject_compositeKeyClass(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_domainObject_compositeKeyClass()
	 * @model
	 * @generated
	 */
	boolean isGenerate_domainObject_compositeKeyClass();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_domainObject_compositeKeyClass <em>Generate domain Object composite Key Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate domain Object composite Key Class</em>' attribute.
	 * @see #isGenerate_domainObject_compositeKeyClass()
	 * @generated
	 */
	void setGenerate_domainObject_compositeKeyClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate service Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate service Context</em>' attribute.
	 * @see #setGenerate_serviceContext(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_serviceContext()
	 * @model
	 * @generated
	 */
	boolean isGenerate_serviceContext();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_serviceContext <em>Generate service Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate service Context</em>' attribute.
	 * @see #isGenerate_serviceContext()
	 * @generated
	 */
	void setGenerate_serviceContext(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Not Found Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Not Found Exception</em>' attribute.
	 * @see #setGenerate_NotFoundException(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_NotFoundException()
	 * @model
	 * @generated
	 */
	boolean isGenerate_NotFoundException();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_NotFoundException <em>Generate Not Found Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Not Found Exception</em>' attribute.
	 * @see #isGenerate_NotFoundException()
	 * @generated
	 */
	void setGenerate_NotFoundException(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate spring annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate spring annotation</em>' attribute.
	 * @see #setGenerate_spring_annotation(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_spring_annotation()
	 * @model
	 * @generated
	 */
	boolean isGenerate_spring_annotation();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_spring_annotation <em>Generate spring annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate spring annotation</em>' attribute.
	 * @see #isGenerate_spring_annotation()
	 * @generated
	 */
	void setGenerate_spring_annotation(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate jpa annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate jpa annotation</em>' attribute.
	 * @see #setGenerate_jpa_annotation(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_jpa_annotation()
	 * @model
	 * @generated
	 */
	boolean isGenerate_jpa_annotation();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation <em>Generate jpa annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate jpa annotation</em>' attribute.
	 * @see #isGenerate_jpa_annotation()
	 * @generated
	 */
	void setGenerate_jpa_annotation(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate validation annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate validation annotation</em>' attribute.
	 * @see #setGenerate_validation_annotation(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_validation_annotation()
	 * @model
	 * @generated
	 */
	boolean isGenerate_validation_annotation();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_validation_annotation <em>Generate validation annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate validation annotation</em>' attribute.
	 * @see #isGenerate_validation_annotation()
	 * @generated
	 */
	void setGenerate_validation_annotation(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate jpa annotation on Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate jpa annotation on Field</em>' attribute.
	 * @see #setGenerate_jpa_annotation_onField(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_jpa_annotation_onField()
	 * @model
	 * @generated
	 */
	boolean isGenerate_jpa_annotation_onField();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_onField <em>Generate jpa annotation on Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate jpa annotation on Field</em>' attribute.
	 * @see #isGenerate_jpa_annotation_onField()
	 * @generated
	 */
	void setGenerate_jpa_annotation_onField(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate jpa annotation column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate jpa annotation column Definition</em>' attribute.
	 * @see #setGenerate_jpa_annotation_columnDefinition(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_jpa_annotation_columnDefinition()
	 * @model
	 * @generated
	 */
	boolean isGenerate_jpa_annotation_columnDefinition();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_jpa_annotation_columnDefinition <em>Generate jpa annotation column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate jpa annotation column Definition</em>' attribute.
	 * @see #isGenerate_jpa_annotation_columnDefinition()
	 * @generated
	 */
	void setGenerate_jpa_annotation_columnDefinition(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate xstream annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate xstream annotation</em>' attribute.
	 * @see #setGenerate_xstream_annotation(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_xstream_annotation()
	 * @model
	 * @generated
	 */
	boolean isGenerate_xstream_annotation();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_xstream_annotation <em>Generate xstream annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate xstream annotation</em>' attribute.
	 * @see #isGenerate_xstream_annotation()
	 * @generated
	 */
	void setGenerate_xstream_annotation(boolean value);

	/**
	 * Returns the value of the '<em><b>Generat test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generat test</em>' attribute.
	 * @see #setGenerat_test(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generat_test()
	 * @model
	 * @generated
	 */
	boolean isGenerat_test();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerat_test <em>Generat test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generat test</em>' attribute.
	 * @see #isGenerat_test()
	 * @generated
	 */
	void setGenerat_test(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate gap Class</em>' attribute.
	 * @see #setGenerate_gapClass(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getGenerateOptions_Generate_gapClass()
	 * @model
	 * @generated
	 */
	boolean isGenerate_gapClass();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.GenerateOptions#isGenerate_gapClass <em>Generate gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate gap Class</em>' attribute.
	 * @see #isGenerate_gapClass()
	 * @generated
	 */
	void setGenerate_gapClass(boolean value);

} // GenerateOptions
