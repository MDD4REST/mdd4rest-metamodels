/**
 */
package openapi2.provider;


import java.util.Collection;
import java.util.List;

import openapi2.API;
import openapi2.Openapi2Factory;
import openapi2.Openapi2Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link openapi2.API} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APIItemProvider extends ExternalDocsContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIItemProvider(AdapterFactory adapterFactory) {
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

			addHostPropertyDescriptor(object);
			addBasePathPropertyDescriptor(object);
			addSchemesPropertyDescriptor(object);
			addConsumesPropertyDescriptor(object);
			addProducesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_host_feature", "_UI_API_type"),
				 Openapi2Package.Literals.API__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_basePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_basePath_feature", "_UI_API_type"),
				 Openapi2Package.Literals.API__BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schemes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_schemes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_schemes_feature", "_UI_API_type"),
				 Openapi2Package.Literals.API__SCHEMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_consumes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_consumes_feature", "_UI_API_type"),
				 Openapi2Package.Literals.API__CONSUMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Produces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProducesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_produces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_produces_feature", "_UI_API_type"),
				 Openapi2Package.Literals.API__PRODUCES,
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
			childrenFeatures.add(Openapi2Package.Literals.SECURITY_CONTAINER__SECURITY);
			childrenFeatures.add(Openapi2Package.Literals.API__INFO);
			childrenFeatures.add(Openapi2Package.Literals.API__PATHS);
			childrenFeatures.add(Openapi2Package.Literals.API__DEFINITIONS);
			childrenFeatures.add(Openapi2Package.Literals.API__RESPONSES);
			childrenFeatures.add(Openapi2Package.Literals.API__SECURITY_DEFINITIONS);
			childrenFeatures.add(Openapi2Package.Literals.API__TAGS);
			childrenFeatures.add(Openapi2Package.Literals.API__PARAMETERS);
			childrenFeatures.add(Openapi2Package.Literals.API__CONTAINED_COLLECTIONS);
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
	 * This returns API.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/API"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((API)object).getHost();
		return label == null || label.length() == 0 ?
			getString("_UI_API_type") :
			getString("_UI_API_type") + " " + label;
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

		switch (notification.getFeatureID(API.class)) {
			case Openapi2Package.API__HOST:
			case Openapi2Package.API__BASE_PATH:
			case Openapi2Package.API__SCHEMES:
			case Openapi2Package.API__CONSUMES:
			case Openapi2Package.API__PRODUCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Openapi2Package.API__SECURITY:
			case Openapi2Package.API__INFO:
			case Openapi2Package.API__PATHS:
			case Openapi2Package.API__DEFINITIONS:
			case Openapi2Package.API__RESPONSES:
			case Openapi2Package.API__SECURITY_DEFINITIONS:
			case Openapi2Package.API__TAGS:
			case Openapi2Package.API__PARAMETERS:
			case Openapi2Package.API__CONTAINED_COLLECTIONS:
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
				(Openapi2Package.Literals.SECURITY_CONTAINER__SECURITY,
				 Openapi2Factory.eINSTANCE.createSecurityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__INFO,
				 Openapi2Factory.eINSTANCE.createInfo()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__PATHS,
				 Openapi2Factory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__DEFINITIONS,
				 Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.SCHEMA_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__RESPONSES,
				 Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.RESPONSE_DEFINITION_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__SECURITY_DEFINITIONS,
				 Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.SECURITY_SCHEME_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__TAGS,
				 Openapi2Factory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__PARAMETERS,
				 Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.PARAMETER_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.API__CONTAINED_COLLECTIONS,
				 Openapi2Factory.eINSTANCE.createContainedCollections()));
	}

}
