/**
 */
package com.github.icelyframework.configuration.provider;


import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.JhipsterConfig;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.github.icelyframework.configuration.JhipsterConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JhipsterConfigItemProvider extends ApplicationConfigItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JhipsterConfigItemProvider(AdapterFactory adapterFactory) {
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

			addDatabaseTypePropertyDescriptor(object);
			addJhiPrefixPropertyDescriptor(object);
			addSkipUserManagementPropertyDescriptor(object);
			addNativeLanguagePropertyDescriptor(object);
			addTestFrameworksPropertyDescriptor(object);
			addCacheProviderPropertyDescriptor(object);
			addEntitySuffixPropertyDescriptor(object);
			addSkipServerPropertyDescriptor(object);
			addDtoSuffixPropertyDescriptor(object);
			addEnableHibernateCachePropertyDescriptor(object);
			addSkipClientPropertyDescriptor(object);
			addBuildToolPropertyDescriptor(object);
			addAuthenticationTypePropertyDescriptor(object);
			addApplicationTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_JhipsterConfig_databaseType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_databaseType_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__DATABASE_TYPE,
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
				 getString("_UI_JhipsterConfig_jhiPrefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_jhiPrefix_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__JHI_PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JhipsterConfig_skipUserManagement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_skipUserManagement_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JhipsterConfig_nativeLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_nativeLanguage_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__NATIVE_LANGUAGE,
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
				 getString("_UI_JhipsterConfig_testFrameworks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_testFrameworks_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__TEST_FRAMEWORKS,
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
				 getString("_UI_JhipsterConfig_cacheProvider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_cacheProvider_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__CACHE_PROVIDER,
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
				 getString("_UI_JhipsterConfig_entitySuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_entitySuffix_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__ENTITY_SUFFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JhipsterConfig_skipServer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_skipServer_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__SKIP_SERVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JhipsterConfig_dtoSuffix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_dtoSuffix_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__DTO_SUFFIX,
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
				 getString("_UI_JhipsterConfig_enableHibernateCache_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_enableHibernateCache_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JhipsterConfig_skipClient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_skipClient_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__SKIP_CLIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JhipsterConfig_buildTool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_buildTool_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__BUILD_TOOL,
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
				 getString("_UI_JhipsterConfig_authenticationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_authenticationType_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__AUTHENTICATION_TYPE,
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
				 getString("_UI_JhipsterConfig_applicationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JhipsterConfig_applicationType_feature", "_UI_JhipsterConfig_type"),
				 ConfigurationPackage.Literals.JHIPSTER_CONFIG__APPLICATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns JhipsterConfig.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JhipsterConfig"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JhipsterConfig)object).getBaseName();
		return label == null || label.length() == 0 ?
			getString("_UI_JhipsterConfig_type") :
			getString("_UI_JhipsterConfig_type") + " " + label;
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

		switch (notification.getFeatureID(JhipsterConfig.class)) {
			case ConfigurationPackage.JHIPSTER_CONFIG__DATABASE_TYPE:
			case ConfigurationPackage.JHIPSTER_CONFIG__JHI_PREFIX:
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT:
			case ConfigurationPackage.JHIPSTER_CONFIG__NATIVE_LANGUAGE:
			case ConfigurationPackage.JHIPSTER_CONFIG__TEST_FRAMEWORKS:
			case ConfigurationPackage.JHIPSTER_CONFIG__CACHE_PROVIDER:
			case ConfigurationPackage.JHIPSTER_CONFIG__ENTITY_SUFFIX:
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_SERVER:
			case ConfigurationPackage.JHIPSTER_CONFIG__DTO_SUFFIX:
			case ConfigurationPackage.JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE:
			case ConfigurationPackage.JHIPSTER_CONFIG__SKIP_CLIENT:
			case ConfigurationPackage.JHIPSTER_CONFIG__BUILD_TOOL:
			case ConfigurationPackage.JHIPSTER_CONFIG__AUTHENTICATION_TYPE:
			case ConfigurationPackage.JHIPSTER_CONFIG__APPLICATION_TYPE:
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

}
