/**
 */
package com.github.icelyframework.jdl.provider;


import com.github.icelyframework.jdl.Config;
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
 * This is the item provider adapter for a {@link com.github.icelyframework.jdl.Config} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigItemProvider 
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
	public ConfigItemProvider(AdapterFactory adapterFactory) {
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

			addBaseNamePropertyDescriptor(object);
			addApplicationTypePropertyDescriptor(object);
			addServicePortPropertyDescriptor(object);
			addDatabaseTypePropertyDescriptor(object);
			addBuildToolPropertyDescriptor(object);
			addDtoSuffixPropertyDescriptor(object);
			addEnableHibernateCachePropertyDescriptor(object);
			addEntitySuffixPropertyDescriptor(object);
			addJhiPrefixPropertyDescriptor(object);
			addNativeLanguagePropertyDescriptor(object);
			addSkipClientPropertyDescriptor(object);
			addSkipServerPropertyDescriptor(object);
			addSkipUserManagementPropertyDescriptor(object);
			addUaaBaseNamePropertyDescriptor(object);
			addTestFrameworksPropertyDescriptor(object);
			addAuthenticationTypePropertyDescriptor(object);
			addCacheProviderPropertyDescriptor(object);
			addClientFrameworkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_baseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_baseName_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__BASE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_applicationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_applicationType_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__APPLICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_servicePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_servicePort_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__SERVICE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Database Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_databaseType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_databaseType_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__DATABASE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_buildTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_buildTool_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__BUILD_TOOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dto Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDtoSuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_dtoSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_dtoSuffix_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__DTO_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Hibernate Cache feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableHibernateCachePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_enableHibernateCache_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_enableHibernateCache_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__ENABLE_HIBERNATE_CACHE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entity Suffix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntitySuffixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_entitySuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_entitySuffix_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__ENTITY_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jhi Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJhiPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_jhiPrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_jhiPrefix_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__JHI_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Native Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNativeLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_nativeLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_nativeLanguage_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__NATIVE_LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skip Client feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkipClientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_skipClient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_skipClient_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__SKIP_CLIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skip Server feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkipServerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_skipServer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_skipServer_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__SKIP_SERVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skip User Management feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkipUserManagementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_skipUserManagement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_skipUserManagement_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__SKIP_USER_MANAGEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uaa Base Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUaaBaseNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_uaaBaseName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_uaaBaseName_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__UAA_BASE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Test Frameworks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestFrameworksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_testFrameworks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_testFrameworks_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__TEST_FRAMEWORKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_authenticationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_authenticationType_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__AUTHENTICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cache Provider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheProviderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_cacheProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_cacheProvider_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__CACHE_PROVIDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Framework feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientFrameworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Config_clientFramework_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Config_clientFramework_feature", "_UI_Config_type"),
				 JdlPackage.Literals.CONFIG__CLIENT_FRAMEWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Config.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Config"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Config)object).getBaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_Config_type") :
			getString("_UI_Config_type") + " " + label;
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

		switch (notification.getFeatureID(Config.class)) {
			case JdlPackage.CONFIG__BASE_NAME:
			case JdlPackage.CONFIG__APPLICATION_TYPE:
			case JdlPackage.CONFIG__SERVICE_PORT:
			case JdlPackage.CONFIG__DATABASE_TYPE:
			case JdlPackage.CONFIG__BUILD_TOOL:
			case JdlPackage.CONFIG__DTO_SUFFIX:
			case JdlPackage.CONFIG__ENABLE_HIBERNATE_CACHE:
			case JdlPackage.CONFIG__ENTITY_SUFFIX:
			case JdlPackage.CONFIG__JHI_PREFIX:
			case JdlPackage.CONFIG__NATIVE_LANGUAGE:
			case JdlPackage.CONFIG__SKIP_CLIENT:
			case JdlPackage.CONFIG__SKIP_SERVER:
			case JdlPackage.CONFIG__SKIP_USER_MANAGEMENT:
			case JdlPackage.CONFIG__UAA_BASE_NAME:
			case JdlPackage.CONFIG__TEST_FRAMEWORKS:
			case JdlPackage.CONFIG__AUTHENTICATION_TYPE:
			case JdlPackage.CONFIG__CACHE_PROVIDER:
			case JdlPackage.CONFIG__CLIENT_FRAMEWORK:
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
