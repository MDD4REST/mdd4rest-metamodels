/**
 */
package com.github.icelyframework.configuration.provider;


import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.GenerateOptions;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.icelyframework.configuration.GenerateOptions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerateOptionsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateOptionsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGenerate_domainObject_conditionalCriteriaPropertiesPropertyDescriptor(object);
			addGenerate_repository_findersPropertyDescriptor(object);
			addGenerate_modelDocPropertyDescriptor(object);
			addGenerate_umlgraphPropertyDescriptor(object);
			addGenerate_spring_annotation_txPropertyDescriptor(object);
			addGenerate_ddlPropertyDescriptor(object);
			addGenerate_ddl_dropPropertyDescriptor(object);
			addGenerate_domainObject_compositeKeyClassPropertyDescriptor(object);
			addGenerate_serviceContextPropertyDescriptor(object);
			addGenerate_NotFoundExceptionPropertyDescriptor(object);
			addGenerate_spring_annotationPropertyDescriptor(object);
			addGenerate_jpa_annotationPropertyDescriptor(object);
			addGenerate_validation_annotationPropertyDescriptor(object);
			addGenerate_jpa_annotation_onFieldPropertyDescriptor(object);
			addGenerate_jpa_annotation_columnDefinitionPropertyDescriptor(object);
			addGenerate_xstream_annotationPropertyDescriptor(object);
			addGenerat_testPropertyDescriptor(object);
			addGenerate_gapClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generate domain Object conditional Criteria Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_domainObject_conditionalCriteriaPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_domainObject_conditionalCriteriaProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_domainObject_conditionalCriteriaProperties_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate repository finders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_repository_findersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_repository_finders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_repository_finders_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate model Doc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_modelDocPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_modelDoc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_modelDoc_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_MODEL_DOC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate umlgraph feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_umlgraphPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_umlgraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_umlgraph_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_UMLGRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate spring annotation tx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_spring_annotation_txPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_spring_annotation_tx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_spring_annotation_tx_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate ddl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_ddlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_ddl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_ddl_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_DDL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate ddl drop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_ddl_dropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_ddl_drop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_ddl_drop_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_DDL_DROP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate domain Object composite Key Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_domainObject_compositeKeyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_domainObject_compositeKeyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_domainObject_compositeKeyClass_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate service Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_serviceContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_serviceContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_serviceContext_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Not Found Exception feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_NotFoundExceptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_NotFoundException_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_NotFoundException_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate spring annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_spring_annotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_spring_annotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_spring_annotation_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate jpa annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_jpa_annotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_jpa_annotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_jpa_annotation_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate validation annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_validation_annotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_validation_annotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_validation_annotation_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate jpa annotation on Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_jpa_annotation_onFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_jpa_annotation_onField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_jpa_annotation_onField_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate jpa annotation column Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_jpa_annotation_columnDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_jpa_annotation_columnDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_jpa_annotation_columnDefinition_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate xstream annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_xstream_annotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_xstream_annotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_xstream_annotation_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generat test feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerat_testPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generat_test_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generat_test_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERAT_TEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate gap Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerate_gapClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenerateOptions_generate_gapClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenerateOptions_generate_gapClass_feature", "_UI_GenerateOptions_type"),
				 ConfigurationPackage.Literals.GENERATE_OPTIONS__GENERATE_GAP_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GenerateOptions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenerateOptions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		GenerateOptions generateOptions = (GenerateOptions)object;
		return getString("_UI_GenerateOptions_type") + " " + generateOptions.isGenerate_domainObject_conditionalCriteriaProperties();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GenerateOptions.class)) {
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_MODEL_DOC:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_UMLGRAPH:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DDL_DROP:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERAT_TEST:
			case ConfigurationPackage.GENERATE_OPTIONS__GENERATE_GAP_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConfigurationEditPlugin.INSTANCE;
	}

}
