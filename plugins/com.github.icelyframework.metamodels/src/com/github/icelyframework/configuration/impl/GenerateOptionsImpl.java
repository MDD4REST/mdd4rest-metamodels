/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.GenerateOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generate Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_domainObject_conditionalCriteriaProperties <em>Generate domain Object conditional Criteria Properties</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_repository_finders <em>Generate repository finders</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_modelDoc <em>Generate model Doc</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_umlgraph <em>Generate umlgraph</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_spring_annotation_tx <em>Generate spring annotation tx</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_ddl <em>Generate ddl</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_ddl_drop <em>Generate ddl drop</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_domainObject_compositeKeyClass <em>Generate domain Object composite Key Class</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_serviceContext <em>Generate service Context</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_NotFoundException <em>Generate Not Found Exception</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_spring_annotation <em>Generate spring annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_jpa_annotation <em>Generate jpa annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_validation_annotation <em>Generate validation annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_jpa_annotation_onField <em>Generate jpa annotation on Field</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_jpa_annotation_columnDefinition <em>Generate jpa annotation column Definition</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_xstream_annotation <em>Generate xstream annotation</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerat_test <em>Generat test</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.GenerateOptionsImpl#isGenerate_gapClass <em>Generate gap Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerateOptionsImpl extends EObjectImpl implements GenerateOptions {
	/**
	 * The default value of the '{@link #isGenerate_domainObject_conditionalCriteriaProperties() <em>Generate domain Object conditional Criteria Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_domainObject_conditionalCriteriaProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_domainObject_conditionalCriteriaProperties() <em>Generate domain Object conditional Criteria Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_domainObject_conditionalCriteriaProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_domainObject_conditionalCriteriaProperties = GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_repository_finders() <em>Generate repository finders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_repository_finders()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_REPOSITORY_FINDERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_repository_finders() <em>Generate repository finders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_repository_finders()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_repository_finders = GENERATE_REPOSITORY_FINDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_modelDoc() <em>Generate model Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_modelDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_MODEL_DOC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_modelDoc() <em>Generate model Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_modelDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_modelDoc = GENERATE_MODEL_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_umlgraph() <em>Generate umlgraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_umlgraph()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_UMLGRAPH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_umlgraph() <em>Generate umlgraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_umlgraph()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_umlgraph = GENERATE_UMLGRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_spring_annotation_tx() <em>Generate spring annotation tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_spring_annotation_tx()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_SPRING_ANNOTATION_TX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_spring_annotation_tx() <em>Generate spring annotation tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_spring_annotation_tx()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_spring_annotation_tx = GENERATE_SPRING_ANNOTATION_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_ddl() <em>Generate ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_ddl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DDL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_ddl() <em>Generate ddl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_ddl()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_ddl = GENERATE_DDL_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_ddl_drop() <em>Generate ddl drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_ddl_drop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DDL_DROP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_ddl_drop() <em>Generate ddl drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_ddl_drop()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_ddl_drop = GENERATE_DDL_DROP_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_domainObject_compositeKeyClass() <em>Generate domain Object composite Key Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_domainObject_compositeKeyClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_domainObject_compositeKeyClass() <em>Generate domain Object composite Key Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_domainObject_compositeKeyClass()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_domainObject_compositeKeyClass = GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_serviceContext() <em>Generate service Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_serviceContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_SERVICE_CONTEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_serviceContext() <em>Generate service Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_serviceContext()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_serviceContext = GENERATE_SERVICE_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_NotFoundException() <em>Generate Not Found Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_NotFoundException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_NOT_FOUND_EXCEPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_NotFoundException() <em>Generate Not Found Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_NotFoundException()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_NotFoundException = GENERATE_NOT_FOUND_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_spring_annotation() <em>Generate spring annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_spring_annotation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_SPRING_ANNOTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_spring_annotation() <em>Generate spring annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_spring_annotation()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_spring_annotation = GENERATE_SPRING_ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_jpa_annotation() <em>Generate jpa annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_jpa_annotation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_JPA_ANNOTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_jpa_annotation() <em>Generate jpa annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_jpa_annotation()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_jpa_annotation = GENERATE_JPA_ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_validation_annotation() <em>Generate validation annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_validation_annotation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_VALIDATION_ANNOTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_validation_annotation() <em>Generate validation annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_validation_annotation()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_validation_annotation = GENERATE_VALIDATION_ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_jpa_annotation_onField() <em>Generate jpa annotation on Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_jpa_annotation_onField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_JPA_ANNOTATION_ON_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_jpa_annotation_onField() <em>Generate jpa annotation on Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_jpa_annotation_onField()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_jpa_annotation_onField = GENERATE_JPA_ANNOTATION_ON_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_jpa_annotation_columnDefinition() <em>Generate jpa annotation column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_jpa_annotation_columnDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_jpa_annotation_columnDefinition() <em>Generate jpa annotation column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_jpa_annotation_columnDefinition()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_jpa_annotation_columnDefinition = GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_xstream_annotation() <em>Generate xstream annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_xstream_annotation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_XSTREAM_ANNOTATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_xstream_annotation() <em>Generate xstream annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_xstream_annotation()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_xstream_annotation = GENERATE_XSTREAM_ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerat_test() <em>Generat test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerat_test()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERAT_TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerat_test() <em>Generat test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerat_test()
	 * @generated
	 * @ordered
	 */
	protected boolean generat_test = GENERAT_TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_gapClass() <em>Generate gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_gapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_gapClass() <em>Generate gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_gapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_gapClass = GENERATE_GAP_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.GENERATE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_domainObject_conditionalCriteriaProperties() {
		return generate_domainObject_conditionalCriteriaProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_domainObject_conditionalCriteriaProperties(boolean newGenerate_domainObject_conditionalCriteriaProperties) {
		boolean oldGenerate_domainObject_conditionalCriteriaProperties = generate_domainObject_conditionalCriteriaProperties;
		generate_domainObject_conditionalCriteriaProperties = newGenerate_domainObject_conditionalCriteriaProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES, oldGenerate_domainObject_conditionalCriteriaProperties, generate_domainObject_conditionalCriteriaProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_repository_finders() {
		return generate_repository_finders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_repository_finders(boolean newGenerate_repository_finders) {
		boolean oldGenerate_repository_finders = generate_repository_finders;
		generate_repository_finders = newGenerate_repository_finders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS, oldGenerate_repository_finders, generate_repository_finders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_modelDoc() {
		return generate_modelDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_modelDoc(boolean newGenerate_modelDoc) {
		boolean oldGenerate_modelDoc = generate_modelDoc;
		generate_modelDoc = newGenerate_modelDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_MODEL_DOC, oldGenerate_modelDoc, generate_modelDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_umlgraph() {
		return generate_umlgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_umlgraph(boolean newGenerate_umlgraph) {
		boolean oldGenerate_umlgraph = generate_umlgraph;
		generate_umlgraph = newGenerate_umlgraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_UMLGRAPH, oldGenerate_umlgraph, generate_umlgraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_spring_annotation_tx() {
		return generate_spring_annotation_tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_spring_annotation_tx(boolean newGenerate_spring_annotation_tx) {
		boolean oldGenerate_spring_annotation_tx = generate_spring_annotation_tx;
		generate_spring_annotation_tx = newGenerate_spring_annotation_tx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX, oldGenerate_spring_annotation_tx, generate_spring_annotation_tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_ddl() {
		return generate_ddl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_ddl(boolean newGenerate_ddl) {
		boolean oldGenerate_ddl = generate_ddl;
		generate_ddl = newGenerate_ddl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL, oldGenerate_ddl, generate_ddl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_ddl_drop() {
		return generate_ddl_drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_ddl_drop(boolean newGenerate_ddl_drop) {
		boolean oldGenerate_ddl_drop = generate_ddl_drop;
		generate_ddl_drop = newGenerate_ddl_drop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL_DROP, oldGenerate_ddl_drop, generate_ddl_drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_domainObject_compositeKeyClass() {
		return generate_domainObject_compositeKeyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_domainObject_compositeKeyClass(boolean newGenerate_domainObject_compositeKeyClass) {
		boolean oldGenerate_domainObject_compositeKeyClass = generate_domainObject_compositeKeyClass;
		generate_domainObject_compositeKeyClass = newGenerate_domainObject_compositeKeyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS, oldGenerate_domainObject_compositeKeyClass, generate_domainObject_compositeKeyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_serviceContext() {
		return generate_serviceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_serviceContext(boolean newGenerate_serviceContext) {
		boolean oldGenerate_serviceContext = generate_serviceContext;
		generate_serviceContext = newGenerate_serviceContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT, oldGenerate_serviceContext, generate_serviceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_NotFoundException() {
		return generate_NotFoundException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_NotFoundException(boolean newGenerate_NotFoundException) {
		boolean oldGenerate_NotFoundException = generate_NotFoundException;
		generate_NotFoundException = newGenerate_NotFoundException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION, oldGenerate_NotFoundException, generate_NotFoundException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_spring_annotation() {
		return generate_spring_annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_spring_annotation(boolean newGenerate_spring_annotation) {
		boolean oldGenerate_spring_annotation = generate_spring_annotation;
		generate_spring_annotation = newGenerate_spring_annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION, oldGenerate_spring_annotation, generate_spring_annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_jpa_annotation() {
		return generate_jpa_annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_jpa_annotation(boolean newGenerate_jpa_annotation) {
		boolean oldGenerate_jpa_annotation = generate_jpa_annotation;
		generate_jpa_annotation = newGenerate_jpa_annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION, oldGenerate_jpa_annotation, generate_jpa_annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_validation_annotation() {
		return generate_validation_annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_validation_annotation(boolean newGenerate_validation_annotation) {
		boolean oldGenerate_validation_annotation = generate_validation_annotation;
		generate_validation_annotation = newGenerate_validation_annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION, oldGenerate_validation_annotation, generate_validation_annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_jpa_annotation_onField() {
		return generate_jpa_annotation_onField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_jpa_annotation_onField(boolean newGenerate_jpa_annotation_onField) {
		boolean oldGenerate_jpa_annotation_onField = generate_jpa_annotation_onField;
		generate_jpa_annotation_onField = newGenerate_jpa_annotation_onField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD, oldGenerate_jpa_annotation_onField, generate_jpa_annotation_onField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_jpa_annotation_columnDefinition() {
		return generate_jpa_annotation_columnDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_jpa_annotation_columnDefinition(boolean newGenerate_jpa_annotation_columnDefinition) {
		boolean oldGenerate_jpa_annotation_columnDefinition = generate_jpa_annotation_columnDefinition;
		generate_jpa_annotation_columnDefinition = newGenerate_jpa_annotation_columnDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION, oldGenerate_jpa_annotation_columnDefinition, generate_jpa_annotation_columnDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_xstream_annotation() {
		return generate_xstream_annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_xstream_annotation(boolean newGenerate_xstream_annotation) {
		boolean oldGenerate_xstream_annotation = generate_xstream_annotation;
		generate_xstream_annotation = newGenerate_xstream_annotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION, oldGenerate_xstream_annotation, generate_xstream_annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerat_test() {
		return generat_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerat_test(boolean newGenerat_test) {
		boolean oldGenerat_test = generat_test;
		generat_test = newGenerat_test;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERAT_TEST, oldGenerat_test, generat_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_gapClass() {
		return generate_gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_gapClass(boolean newGenerate_gapClass) {
		boolean oldGenerate_gapClass = generate_gapClass;
		generate_gapClass = newGenerate_gapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATE_OPTIONS__GENERATE_GAP_CLASS, oldGenerate_gapClass, generate_gapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES:
				return isGenerate_domainObject_conditionalCriteriaProperties();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS:
				return isGenerate_repository_finders();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_MODEL_DOC:
				return isGenerate_modelDoc();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_UMLGRAPH:
				return isGenerate_umlgraph();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX:
				return isGenerate_spring_annotation_tx();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL:
				return isGenerate_ddl();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL_DROP:
				return isGenerate_ddl_drop();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS:
				return isGenerate_domainObject_compositeKeyClass();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT:
				return isGenerate_serviceContext();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION:
				return isGenerate_NotFoundException();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION:
				return isGenerate_spring_annotation();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION:
				return isGenerate_jpa_annotation();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION:
				return isGenerate_validation_annotation();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD:
				return isGenerate_jpa_annotation_onField();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION:
				return isGenerate_jpa_annotation_columnDefinition();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION:
				return isGenerate_xstream_annotation();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERAT_TEST:
				return isGenerat_test();
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_GAP_CLASS:
				return isGenerate_gapClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES:
				setGenerate_domainObject_conditionalCriteriaProperties((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS:
				setGenerate_repository_finders((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_MODEL_DOC:
				setGenerate_modelDoc((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_UMLGRAPH:
				setGenerate_umlgraph((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX:
				setGenerate_spring_annotation_tx((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL:
				setGenerate_ddl((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL_DROP:
				setGenerate_ddl_drop((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS:
				setGenerate_domainObject_compositeKeyClass((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT:
				setGenerate_serviceContext((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION:
				setGenerate_NotFoundException((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION:
				setGenerate_spring_annotation((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION:
				setGenerate_jpa_annotation((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION:
				setGenerate_validation_annotation((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD:
				setGenerate_jpa_annotation_onField((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION:
				setGenerate_jpa_annotation_columnDefinition((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION:
				setGenerate_xstream_annotation((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERAT_TEST:
				setGenerat_test((Boolean)newValue);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_GAP_CLASS:
				setGenerate_gapClass((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES:
				setGenerate_domainObject_conditionalCriteriaProperties(GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS:
				setGenerate_repository_finders(GENERATE_REPOSITORY_FINDERS_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_MODEL_DOC:
				setGenerate_modelDoc(GENERATE_MODEL_DOC_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_UMLGRAPH:
				setGenerate_umlgraph(GENERATE_UMLGRAPH_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX:
				setGenerate_spring_annotation_tx(GENERATE_SPRING_ANNOTATION_TX_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL:
				setGenerate_ddl(GENERATE_DDL_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL_DROP:
				setGenerate_ddl_drop(GENERATE_DDL_DROP_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS:
				setGenerate_domainObject_compositeKeyClass(GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT:
				setGenerate_serviceContext(GENERATE_SERVICE_CONTEXT_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION:
				setGenerate_NotFoundException(GENERATE_NOT_FOUND_EXCEPTION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION:
				setGenerate_spring_annotation(GENERATE_SPRING_ANNOTATION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION:
				setGenerate_jpa_annotation(GENERATE_JPA_ANNOTATION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION:
				setGenerate_validation_annotation(GENERATE_VALIDATION_ANNOTATION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD:
				setGenerate_jpa_annotation_onField(GENERATE_JPA_ANNOTATION_ON_FIELD_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION:
				setGenerate_jpa_annotation_columnDefinition(GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION:
				setGenerate_xstream_annotation(GENERATE_XSTREAM_ANNOTATION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERAT_TEST:
				setGenerat_test(GENERAT_TEST_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_GAP_CLASS:
				setGenerate_gapClass(GENERATE_GAP_CLASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES:
				return generate_domainObject_conditionalCriteriaProperties != GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS:
				return generate_repository_finders != GENERATE_REPOSITORY_FINDERS_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_MODEL_DOC:
				return generate_modelDoc != GENERATE_MODEL_DOC_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_UMLGRAPH:
				return generate_umlgraph != GENERATE_UMLGRAPH_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX:
				return generate_spring_annotation_tx != GENERATE_SPRING_ANNOTATION_TX_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL:
				return generate_ddl != GENERATE_DDL_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL_DROP:
				return generate_ddl_drop != GENERATE_DDL_DROP_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS:
				return generate_domainObject_compositeKeyClass != GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT:
				return generate_serviceContext != GENERATE_SERVICE_CONTEXT_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION:
				return generate_NotFoundException != GENERATE_NOT_FOUND_EXCEPTION_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION:
				return generate_spring_annotation != GENERATE_SPRING_ANNOTATION_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION:
				return generate_jpa_annotation != GENERATE_JPA_ANNOTATION_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION:
				return generate_validation_annotation != GENERATE_VALIDATION_ANNOTATION_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD:
				return generate_jpa_annotation_onField != GENERATE_JPA_ANNOTATION_ON_FIELD_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION:
				return generate_jpa_annotation_columnDefinition != GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION:
				return generate_xstream_annotation != GENERATE_XSTREAM_ANNOTATION_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERAT_TEST:
				return generat_test != GENERAT_TEST_EDEFAULT;
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_GAP_CLASS:
				return generate_gapClass != GENERATE_GAP_CLASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (generate_domainObject_conditionalCriteriaProperties: ");
		result.append(generate_domainObject_conditionalCriteriaProperties);
		result.append(", generate_repository_finders: ");
		result.append(generate_repository_finders);
		result.append(", generate_modelDoc: ");
		result.append(generate_modelDoc);
		result.append(", generate_umlgraph: ");
		result.append(generate_umlgraph);
		result.append(", generate_spring_annotation_tx: ");
		result.append(generate_spring_annotation_tx);
		result.append(", generate_ddl: ");
		result.append(generate_ddl);
		result.append(", generate_ddl_drop: ");
		result.append(generate_ddl_drop);
		result.append(", generate_domainObject_compositeKeyClass: ");
		result.append(generate_domainObject_compositeKeyClass);
		result.append(", generate_serviceContext: ");
		result.append(generate_serviceContext);
		result.append(", generate_NotFoundException: ");
		result.append(generate_NotFoundException);
		result.append(", generate_spring_annotation: ");
		result.append(generate_spring_annotation);
		result.append(", generate_jpa_annotation: ");
		result.append(generate_jpa_annotation);
		result.append(", generate_validation_annotation: ");
		result.append(generate_validation_annotation);
		result.append(", generate_jpa_annotation_onField: ");
		result.append(generate_jpa_annotation_onField);
		result.append(", generate_jpa_annotation_columnDefinition: ");
		result.append(generate_jpa_annotation_columnDefinition);
		result.append(", generate_xstream_annotation: ");
		result.append(generate_xstream_annotation);
		result.append(", generat_test: ");
		result.append(generat_test);
		result.append(", generate_gapClass: ");
		result.append(generate_gapClass);
		result.append(')');
		return result.toString();
	}

} //GenerateOptionsImpl
