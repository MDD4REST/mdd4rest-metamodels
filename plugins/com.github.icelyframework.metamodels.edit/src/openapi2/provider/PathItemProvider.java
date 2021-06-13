/**
 */
package openapi2.provider;


import java.util.Collection;
import java.util.List;

import openapi2.Openapi2Factory;
import openapi2.Openapi2Package;
import openapi2.Path;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link openapi2.Path} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PathItemProvider extends ParameterContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathItemProvider(AdapterFactory adapterFactory) {
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

			addRelativePathPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Relative Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Path_relativePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Path_relativePath_feature", "_UI_Path_type"),
				 Openapi2Package.Literals.PATH__RELATIVE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Path_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Path_parameters_feature", "_UI_Path_type"),
				 Openapi2Package.Literals.PATH__PARAMETERS,
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
			childrenFeatures.add(Openapi2Package.Literals.PATH__GET);
			childrenFeatures.add(Openapi2Package.Literals.PATH__PUT);
			childrenFeatures.add(Openapi2Package.Literals.PATH__POST);
			childrenFeatures.add(Openapi2Package.Literals.PATH__DELETE);
			childrenFeatures.add(Openapi2Package.Literals.PATH__OPTIONS);
			childrenFeatures.add(Openapi2Package.Literals.PATH__HEAD);
			childrenFeatures.add(Openapi2Package.Literals.PATH__PATCH);
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
	 * This returns Path.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Path"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Path)object).getRelativePath();
		return label == null || label.length() == 0 ?
			getString("_UI_Path_type") :
			getString("_UI_Path_type") + " " + label;
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

		switch (notification.getFeatureID(Path.class)) {
			case Openapi2Package.PATH__RELATIVE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Openapi2Package.PATH__GET:
			case Openapi2Package.PATH__PUT:
			case Openapi2Package.PATH__POST:
			case Openapi2Package.PATH__DELETE:
			case Openapi2Package.PATH__OPTIONS:
			case Openapi2Package.PATH__HEAD:
			case Openapi2Package.PATH__PATCH:
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
				(Openapi2Package.Literals.PATH__GET,
				 Openapi2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.PATH__PUT,
				 Openapi2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.PATH__POST,
				 Openapi2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.PATH__DELETE,
				 Openapi2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.PATH__OPTIONS,
				 Openapi2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.PATH__HEAD,
				 Openapi2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Openapi2Package.Literals.PATH__PATCH,
				 Openapi2Factory.eINSTANCE.createOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Openapi2Package.Literals.PATH__GET ||
			childFeature == Openapi2Package.Literals.PATH__PUT ||
			childFeature == Openapi2Package.Literals.PATH__POST ||
			childFeature == Openapi2Package.Literals.PATH__DELETE ||
			childFeature == Openapi2Package.Literals.PATH__OPTIONS ||
			childFeature == Openapi2Package.Literals.PATH__HEAD ||
			childFeature == Openapi2Package.Literals.PATH__PATCH;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
