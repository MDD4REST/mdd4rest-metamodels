/**
 */
package com.github.icelyframework.staticview.provider;


import com.github.icelyframework.staticview.Aggregate;
import com.github.icelyframework.staticview.StaticviewFactory;
import com.github.icelyframework.staticview.StaticviewPackage;

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
 * This is the item provider adapter for a {@link com.github.icelyframework.staticview.Aggregate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregateItemProvider 
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
	public AggregateItemProvider(AdapterFactory adapterFactory) {
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
			addAggregateRootPropertyDescriptor(object);
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
				 getString("_UI_Aggregate_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aggregate_name_feature", "_UI_Aggregate_type"),
				 StaticviewPackage.Literals.AGGREGATE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Aggregate_aggregateRoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aggregate_aggregateRoot_feature", "_UI_Aggregate_type"),
				 StaticviewPackage.Literals.AGGREGATE__AGGREGATE_ROOT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT);
			childrenFeatures.add(StaticviewPackage.Literals.AGGREGATE__HAS_RESOURCE);
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
	 * This returns Aggregate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Aggregate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Aggregate)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Aggregate_type") :
			getString("_UI_Aggregate_type") + " " + label;
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

		switch (notification.getFeatureID(Aggregate.class)) {
			case StaticviewPackage.AGGREGATE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StaticviewPackage.AGGREGATE__HAS_DOMAINOBJECT:
			case StaticviewPackage.AGGREGATE__HAS_RESOURCE:
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
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createValueObject()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createBasicType()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createDTO()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createCommandEvent()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_DOMAINOBJECT,
				 StaticviewFactory.eINSTANCE.createDomainEvent()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_RESOURCE,
				 StaticviewFactory.eINSTANCE.createSingletonResource()));

		newChildDescriptors.add
			(createChildParameter
				(StaticviewPackage.Literals.AGGREGATE__HAS_RESOURCE,
				 StaticviewFactory.eINSTANCE.createCollectionResource()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StaticviewEditPlugin.INSTANCE;
	}

}
