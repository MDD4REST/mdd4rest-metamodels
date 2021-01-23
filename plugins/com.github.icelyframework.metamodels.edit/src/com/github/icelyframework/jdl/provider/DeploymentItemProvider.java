/**
 */
package com.github.icelyframework.jdl.provider;


import com.github.icelyframework.jdl.Deployment;
import com.github.icelyframework.jdl.JdlPackage;

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
 * This is the item provider adapter for a {@link com.github.icelyframework.jdl.Deployment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentItemProvider 
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
	public DeploymentItemProvider(AdapterFactory adapterFactory) {
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

			addDeploymentTypePropertyDescriptor(object);
			addDirectoryPathPropertyDescriptor(object);
			addDockerRepositoryNamePropertyDescriptor(object);
			addAppsFoldersPropertyDescriptor(object);
			addServiceDiscoveryTypePropertyDescriptor(object);
			addMonitoringPropertyDescriptor(object);
			addGatewayTypePropertyDescriptor(object);
			addKubernetesServiceTypePropertyDescriptor(object);
			addJdlPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Deployment Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_deploymentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_deploymentType_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__DEPLOYMENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directory Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectoryPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_directoryPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_directoryPath_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__DIRECTORY_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Docker Repository Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDockerRepositoryNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_dockerRepositoryName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_dockerRepositoryName_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__DOCKER_REPOSITORY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Apps Folders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppsFoldersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_appsFolders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_appsFolders_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__APPS_FOLDERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Discovery Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceDiscoveryTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_serviceDiscoveryType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_serviceDiscoveryType_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__SERVICE_DISCOVERY_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitoring feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitoringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_monitoring_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_monitoring_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__MONITORING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gateway Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_gatewayType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_gatewayType_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__GATEWAY_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kubernetes Service Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKubernetesServiceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_kubernetesServiceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_kubernetesServiceType_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__KUBERNETES_SERVICE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jdl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJdlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deployment_jdl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deployment_jdl_feature", "_UI_Deployment_type"),
				 JdlPackage.Literals.DEPLOYMENT__JDL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Deployment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Deployment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Deployment)object).getDockerRepositoryName();
		return label == null || label.length() == 0 ?
			getString("_UI_Deployment_type") :
			getString("_UI_Deployment_type") + " " + label;
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

		switch (notification.getFeatureID(Deployment.class)) {
			case JdlPackage.DEPLOYMENT__DEPLOYMENT_TYPE:
			case JdlPackage.DEPLOYMENT__DIRECTORY_PATH:
			case JdlPackage.DEPLOYMENT__DOCKER_REPOSITORY_NAME:
			case JdlPackage.DEPLOYMENT__APPS_FOLDERS:
			case JdlPackage.DEPLOYMENT__SERVICE_DISCOVERY_TYPE:
			case JdlPackage.DEPLOYMENT__MONITORING:
			case JdlPackage.DEPLOYMENT__GATEWAY_TYPE:
			case JdlPackage.DEPLOYMENT__KUBERNETES_SERVICE_TYPE:
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
		return JdlEditPlugin.INSTANCE;
	}

}
