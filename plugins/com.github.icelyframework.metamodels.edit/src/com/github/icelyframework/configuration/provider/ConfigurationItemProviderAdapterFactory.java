/**
 */
package com.github.icelyframework.configuration.provider;

import com.github.icelyframework.configuration.util.ConfigurationAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationItemProviderAdapterFactory extends ConfigurationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.ProjectConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectConfigItemProvider projectConfigItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.ProjectConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectConfigAdapter() {
		if (projectConfigItemProvider == null) {
			projectConfigItemProvider = new ProjectConfigItemProvider(this);
		}

		return projectConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.SculptorConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SculptorConfigItemProvider sculptorConfigItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.SculptorConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSculptorConfigAdapter() {
		if (sculptorConfigItemProvider == null) {
			sculptorConfigItemProvider = new SculptorConfigItemProvider(this);
		}

		return sculptorConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.JhipsterConfig} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JhipsterConfigItemProvider jhipsterConfigItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.JhipsterConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJhipsterConfigAdapter() {
		if (jhipsterConfigItemProvider == null) {
			jhipsterConfigItemProvider = new JhipsterConfigItemProvider(this);
		}

		return jhipsterConfigItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.RESTOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTOptionsItemProvider restOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.RESTOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRESTOptionsAdapter() {
		if (restOptionsItemProvider == null) {
			restOptionsItemProvider = new RESTOptionsItemProvider(this);
		}

		return restOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.CacheOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheOptionsItemProvider cacheOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.CacheOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCacheOptionsAdapter() {
		if (cacheOptionsItemProvider == null) {
			cacheOptionsItemProvider = new CacheOptionsItemProvider(this);
		}

		return cacheOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.GenerateOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateOptionsItemProvider generateOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.GenerateOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenerateOptionsAdapter() {
		if (generateOptionsItemProvider == null) {
			generateOptionsItemProvider = new GenerateOptionsItemProvider(this);
		}

		return generateOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.FrameworkOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkOptionsItemProvider frameworkOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.FrameworkOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFrameworkOptionsAdapter() {
		if (frameworkOptionsItemProvider == null) {
			frameworkOptionsItemProvider = new FrameworkOptionsItemProvider(this);
		}

		return frameworkOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.CascadeOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CascadeOptionsItemProvider cascadeOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.CascadeOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCascadeOptionsAdapter() {
		if (cascadeOptionsItemProvider == null) {
			cascadeOptionsItemProvider = new CascadeOptionsItemProvider(this);
		}

		return cascadeOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.PackageName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageNameItemProvider packageNameItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.PackageName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageNameAdapter() {
		if (packageNameItemProvider == null) {
			packageNameItemProvider = new PackageNameItemProvider(this);
		}

		return packageNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.JavaType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTypeItemProvider javaTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.JavaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaTypeAdapter() {
		if (javaTypeItemProvider == null) {
			javaTypeItemProvider = new JavaTypeItemProvider(this);
		}

		return javaTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.HibernateType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibernateTypeItemProvider hibernateTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.HibernateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHibernateTypeAdapter() {
		if (hibernateTypeItemProvider == null) {
			hibernateTypeItemProvider = new HibernateTypeItemProvider(this);
		}

		return hibernateTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.DefaultBaseClassName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultBaseClassNameItemProvider defaultBaseClassNameItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.DefaultBaseClassName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDefaultBaseClassNameAdapter() {
		if (defaultBaseClassNameItemProvider == null) {
			defaultBaseClassNameItemProvider = new DefaultBaseClassNameItemProvider(this);
		}

		return defaultBaseClassNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.DatabaseOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseOptionsItemProvider databaseOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.DatabaseOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatabaseOptionsAdapter() {
		if (databaseOptionsItemProvider == null) {
			databaseOptionsItemProvider = new DatabaseOptionsItemProvider(this);
		}

		return databaseOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.JPAOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPAOptionsItemProvider jpaOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.JPAOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJPAOptionsAdapter() {
		if (jpaOptionsItemProvider == null) {
			jpaOptionsItemProvider = new JPAOptionsItemProvider(this);
		}

		return jpaOptionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.github.icelyframework.configuration.DeploymentOptions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentOptionsItemProvider deploymentOptionsItemProvider;

	/**
	 * This creates an adapter for a {@link com.github.icelyframework.configuration.DeploymentOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentOptionsAdapter() {
		if (deploymentOptionsItemProvider == null) {
			deploymentOptionsItemProvider = new DeploymentOptionsItemProvider(this);
		}

		return deploymentOptionsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (projectConfigItemProvider != null) projectConfigItemProvider.dispose();
		if (applicationItemProvider != null) applicationItemProvider.dispose();
		if (projectItemProvider != null) projectItemProvider.dispose();
		if (sculptorConfigItemProvider != null) sculptorConfigItemProvider.dispose();
		if (jhipsterConfigItemProvider != null) jhipsterConfigItemProvider.dispose();
		if (restOptionsItemProvider != null) restOptionsItemProvider.dispose();
		if (cacheOptionsItemProvider != null) cacheOptionsItemProvider.dispose();
		if (generateOptionsItemProvider != null) generateOptionsItemProvider.dispose();
		if (frameworkOptionsItemProvider != null) frameworkOptionsItemProvider.dispose();
		if (cascadeOptionsItemProvider != null) cascadeOptionsItemProvider.dispose();
		if (packageNameItemProvider != null) packageNameItemProvider.dispose();
		if (javaTypeItemProvider != null) javaTypeItemProvider.dispose();
		if (hibernateTypeItemProvider != null) hibernateTypeItemProvider.dispose();
		if (defaultBaseClassNameItemProvider != null) defaultBaseClassNameItemProvider.dispose();
		if (databaseOptionsItemProvider != null) databaseOptionsItemProvider.dispose();
		if (jpaOptionsItemProvider != null) jpaOptionsItemProvider.dispose();
		if (deploymentOptionsItemProvider != null) deploymentOptionsItemProvider.dispose();
	}

}
