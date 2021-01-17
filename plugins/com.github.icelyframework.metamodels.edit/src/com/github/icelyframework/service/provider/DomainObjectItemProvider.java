/**
 */
package com.github.icelyframework.service.provider;


import com.github.icelyframework.service.DomainObject;
import com.github.icelyframework.service.ServiceFactory;
import com.github.icelyframework.service.ServicePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.icelyframework.service.DomainObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainObjectItemProvider extends SimpleTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObjectItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
			addAggregateRootPropertyDescriptor(object);
			addPackagePropertyDescriptor(object);
			addGapClassPropertyDescriptor(object);
			addCachePropertyDescriptor(object);
			addOptimisticLockingPropertyDescriptor(object);
			addDatabaseTablePropertyDescriptor(object);
			addValidatePropertyDescriptor(object);
			addDiscriminatorColumnValuePropertyDescriptor(object);
			addScaffoldPropertyDescriptor(object);
			addGeneratedByJHipsterPropertyDescriptor(object);
			addGeneratedBySculptorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_name_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_abstract_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aggregate Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregateRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_aggregateRoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_aggregateRoot_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__AGGREGATE_ROOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_package_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gap Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGapClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_gapClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_gapClass_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__GAP_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cache feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_cache_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_cache_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__CACHE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optimistic Locking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptimisticLockingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_optimisticLocking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_optimisticLocking_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__OPTIMISTIC_LOCKING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_databaseTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_databaseTable_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__DATABASE_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_validate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_validate_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__VALIDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discriminator Column Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscriminatorColumnValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_discriminatorColumnValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_discriminatorColumnValue_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scaffold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaffoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_scaffold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_scaffold_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__SCAFFOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generated By JHipster feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedByJHipsterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_generatedByJHipster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_generatedByJHipster_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__GENERATED_BY_JHIPSTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generated By Sculptor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratedBySculptorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DomainObject_generatedBySculptor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DomainObject_generatedBySculptor_feature", "_UI_DomainObject_type"),
				 ServicePackage.Literals.DOMAIN_OBJECT__GENERATED_BY_SCULPTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ServicePackage.Literals.DOMAIN_OBJECT__PROPERTIES);
			childrenFeatures.add(ServicePackage.Literals.DOMAIN_OBJECT__RELATIONS);
			childrenFeatures.add(ServicePackage.Literals.DOMAIN_OBJECT__INHERITANCE);
			childrenFeatures.add(ServicePackage.Literals.DOMAIN_OBJECT__REPOSITORY);
			childrenFeatures.add(ServicePackage.Literals.DOMAIN_OBJECT__OPERATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DomainObject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DomainObject_type") :
			getString("_UI_DomainObject_type") + " " + label;
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

		switch (notification.getFeatureID(DomainObject.class)) {
			case ServicePackage.DOMAIN_OBJECT__NAME:
			case ServicePackage.DOMAIN_OBJECT__ABSTRACT:
			case ServicePackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
			case ServicePackage.DOMAIN_OBJECT__PACKAGE:
			case ServicePackage.DOMAIN_OBJECT__GAP_CLASS:
			case ServicePackage.DOMAIN_OBJECT__CACHE:
			case ServicePackage.DOMAIN_OBJECT__OPTIMISTIC_LOCKING:
			case ServicePackage.DOMAIN_OBJECT__DATABASE_TABLE:
			case ServicePackage.DOMAIN_OBJECT__VALIDATE:
			case ServicePackage.DOMAIN_OBJECT__DISCRIMINATOR_COLUMN_VALUE:
			case ServicePackage.DOMAIN_OBJECT__SCAFFOLD:
			case ServicePackage.DOMAIN_OBJECT__GENERATED_BY_JHIPSTER:
			case ServicePackage.DOMAIN_OBJECT__GENERATED_BY_SCULPTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicePackage.DOMAIN_OBJECT__PROPERTIES:
			case ServicePackage.DOMAIN_OBJECT__RELATIONS:
			case ServicePackage.DOMAIN_OBJECT__INHERITANCE:
			case ServicePackage.DOMAIN_OBJECT__REPOSITORY:
			case ServicePackage.DOMAIN_OBJECT__OPERATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.DOMAIN_OBJECT__PROPERTIES,
				 ServiceFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.DOMAIN_OBJECT__RELATIONS,
				 ServiceFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.DOMAIN_OBJECT__INHERITANCE,
				 ServiceFactory.eINSTANCE.createInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.DOMAIN_OBJECT__REPOSITORY,
				 ServiceFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add
			(createChildParameter
				(ServicePackage.Literals.DOMAIN_OBJECT__OPERATIONS,
				 ServiceFactory.eINSTANCE.createDomainObjectOperation()));
	}

}
