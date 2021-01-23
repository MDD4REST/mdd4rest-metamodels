/**
 */
package com.github.icelyframework.configuration.provider;


import com.github.icelyframework.configuration.ConfigurationFactory;
import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.SculptorConfig;

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
 * This is the item provider adapter for a {@link com.github.icelyframework.configuration.SculptorConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SculptorConfigItemProvider extends ApplicationConfigItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SculptorConfigItemProvider(AdapterFactory adapterFactory) {
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

			addCartridgesPropertyDescriptor(object);
			addProject_naturePropertyDescriptor(object);
			addId_typePropertyDescriptor(object);
			addDatetime_libraryPropertyDescriptor(object);
			addToStringStylePropertyDescriptor(object);
			addScaffold_operationsPropertyDescriptor(object);
			addCheck_cyclicDependenciesPropertyDescriptor(object);
			addFindAll_pagingPropertyDescriptor(object);
			addFindByCondition_pagingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cartridges feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCartridgesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_cartridges_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_cartridges_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__CARTRIDGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project nature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProject_naturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_project_nature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_project_nature_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__PROJECT_NATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addId_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_id_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_id_type_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__ID_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datetime library feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatetime_libraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_datetime_library_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_datetime_library_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__DATETIME_LIBRARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To String Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToStringStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_toStringStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_toStringStyle_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__TO_STRING_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scaffold operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaffold_operationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_scaffold_operations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_scaffold_operations_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check cyclic Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheck_cyclicDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_check_cyclicDependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_check_cyclicDependencies_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Find All paging feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFindAll_pagingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_findAll_paging_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_findAll_paging_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__FIND_ALL_PAGING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Find By Condition paging feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFindByCondition_pagingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SculptorConfig_findByCondition_paging_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SculptorConfig_findByCondition_paging_feature", "_UI_SculptorConfig_type"),
				 ConfigurationPackage.Literals.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__FRAMEWORK);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__REST);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__GENERATE);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__CASCADE);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__DATABASE);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__JPA);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__DEPLOYMENT);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__HIBERNATETYPES);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__JAVATYPES);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__PACKAGENAMES);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES);
			childrenFeatures.add(ConfigurationPackage.Literals.SCULPTOR_CONFIG__CACHEOPTIONS);
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
	 * This returns SculptorConfig.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SculptorConfig"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SculptorConfig)object).getBaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_SculptorConfig_type") :
			getString("_UI_SculptorConfig_type") + " " + label;
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

		switch (notification.getFeatureID(SculptorConfig.class)) {
			case ConfigurationPackage.SCULPTOR_CONFIG__CARTRIDGES:
			case ConfigurationPackage.SCULPTOR_CONFIG__PROJECT_NATURE:
			case ConfigurationPackage.SCULPTOR_CONFIG__ID_TYPE:
			case ConfigurationPackage.SCULPTOR_CONFIG__DATETIME_LIBRARY:
			case ConfigurationPackage.SCULPTOR_CONFIG__TO_STRING_STYLE:
			case ConfigurationPackage.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS:
			case ConfigurationPackage.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES:
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_ALL_PAGING:
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK:
			case ConfigurationPackage.SCULPTOR_CONFIG__REST:
			case ConfigurationPackage.SCULPTOR_CONFIG__GENERATE:
			case ConfigurationPackage.SCULPTOR_CONFIG__CASCADE:
			case ConfigurationPackage.SCULPTOR_CONFIG__DATABASE:
			case ConfigurationPackage.SCULPTOR_CONFIG__JPA:
			case ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT:
			case ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES:
			case ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES:
			case ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES:
			case ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES:
			case ConfigurationPackage.SCULPTOR_CONFIG__CACHEOPTIONS:
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
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__FRAMEWORK,
				 ConfigurationFactory.eINSTANCE.createFrameworkOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__REST,
				 ConfigurationFactory.eINSTANCE.createRESTOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__GENERATE,
				 ConfigurationFactory.eINSTANCE.createGenerateOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__CASCADE,
				 ConfigurationFactory.eINSTANCE.createCascadeOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__DATABASE,
				 ConfigurationFactory.eINSTANCE.createDatabaseOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__JPA,
				 ConfigurationFactory.eINSTANCE.createJPAOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__DEPLOYMENT,
				 ConfigurationFactory.eINSTANCE.createDeploymentOptions()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__HIBERNATETYPES,
				 ConfigurationFactory.eINSTANCE.createHibernateType()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__JAVATYPES,
				 ConfigurationFactory.eINSTANCE.createJavaType()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__PACKAGENAMES,
				 ConfigurationFactory.eINSTANCE.createPackageName()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES,
				 ConfigurationFactory.eINSTANCE.createDefaultBaseClassName()));

		newChildDescriptors.add
			(createChildParameter
				(ConfigurationPackage.Literals.SCULPTOR_CONFIG__CACHEOPTIONS,
				 ConfigurationFactory.eINSTANCE.createCacheOptions()));
	}

}
