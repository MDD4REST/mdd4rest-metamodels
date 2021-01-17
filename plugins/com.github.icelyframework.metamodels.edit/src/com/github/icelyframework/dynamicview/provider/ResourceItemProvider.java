/**
 */
package com.github.icelyframework.dynamicview.provider;


import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.dynamicview.DynamicviewPackage;
import com.github.icelyframework.dynamicview.Resource;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link com.github.icelyframework.dynamicview.Resource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceItemProvider 
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
	public ResourceItemProvider(AdapterFactory adapterFactory) {
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
			addHasRelatedResourcePropertyDescriptor(object);
			addIsRelatedResourcePropertyDescriptor(object);
			addReadActivityPropertyDescriptor(object);
			addCreateActivityPropertyDescriptor(object);
			addDeleteActivityPropertyDescriptor(object);
			addOtherActivitiesPropertyDescriptor(object);
			addPathNamePropertyDescriptor(object);
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
				 getString("_UI_Resource_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_name_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Related Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRelatedResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_hasRelatedResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_hasRelatedResource_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__HAS_RELATED_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Related Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRelatedResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_isRelatedResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_isRelatedResource_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__IS_RELATED_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_readActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_readActivity_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__READ_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_createActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_createActivity_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__CREATE_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_deleteActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_deleteActivity_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__DELETE_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Activities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherActivitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_otherActivities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_otherActivities_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__OTHER_ACTIVITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_pathName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_pathName_feature", "_UI_Resource_type"),
				 DynamicviewPackage.Literals.RESOURCE__PATH_NAME,
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
			childrenFeatures.add(DynamicviewPackage.Literals.RESOURCE__HAS_ACTIVITY);
			childrenFeatures.add(DynamicviewPackage.Literals.RESOURCE__HAS_PERMISSION);
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
		String label = ((Resource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Resource_type") :
			getString("_UI_Resource_type") + " " + label;
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

		switch (notification.getFeatureID(Resource.class)) {
			case DynamicviewPackage.RESOURCE__NAME:
			case DynamicviewPackage.RESOURCE__PATH_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DynamicviewPackage.RESOURCE__HAS_ACTIVITY:
			case DynamicviewPackage.RESOURCE__HAS_PERMISSION:
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
				(DynamicviewPackage.Literals.RESOURCE__HAS_ACTIVITY,
				 DynamicviewFactory.eINSTANCE.createCreate()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_ACTIVITY,
				 DynamicviewFactory.eINSTANCE.createRead()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_ACTIVITY,
				 DynamicviewFactory.eINSTANCE.createOther()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_ACTIVITY,
				 DynamicviewFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_PERMISSION,
				 DynamicviewFactory.eINSTANCE.createHasAuthority()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_PERMISSION,
				 DynamicviewFactory.eINSTANCE.createAuthenticated()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_PERMISSION,
				 DynamicviewFactory.eINSTANCE.createPermitAll()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_PERMISSION,
				 DynamicviewFactory.eINSTANCE.createHasAnyAuthorities()));

		newChildDescriptors.add
			(createChildParameter
				(DynamicviewPackage.Literals.RESOURCE__HAS_PERMISSION,
				 DynamicviewFactory.eINSTANCE.createAccess()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DynamicviewEditPlugin.INSTANCE;
	}

}
