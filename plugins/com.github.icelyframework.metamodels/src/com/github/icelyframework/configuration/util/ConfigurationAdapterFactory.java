/**
 */
package com.github.icelyframework.configuration.util;

import com.github.icelyframework.configuration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationSwitch<Adapter> modelSwitch =
		new ConfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseApplicationConfig(ApplicationConfig object) {
				return createApplicationConfigAdapter();
			}
			@Override
			public Adapter caseProjectConfig(ProjectConfig object) {
				return createProjectConfigAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseSculptorConfig(SculptorConfig object) {
				return createSculptorConfigAdapter();
			}
			@Override
			public Adapter caseJhipsterConfig(JhipsterConfig object) {
				return createJhipsterConfigAdapter();
			}
			@Override
			public Adapter caseRESTOptions(RESTOptions object) {
				return createRESTOptionsAdapter();
			}
			@Override
			public Adapter caseCacheOptions(CacheOptions object) {
				return createCacheOptionsAdapter();
			}
			@Override
			public Adapter caseGenerateOptions(GenerateOptions object) {
				return createGenerateOptionsAdapter();
			}
			@Override
			public Adapter caseFrameworkOptions(FrameworkOptions object) {
				return createFrameworkOptionsAdapter();
			}
			@Override
			public Adapter caseCascadeOptions(CascadeOptions object) {
				return createCascadeOptionsAdapter();
			}
			@Override
			public Adapter casePackageName(PackageName object) {
				return createPackageNameAdapter();
			}
			@Override
			public Adapter caseJavaType(JavaType object) {
				return createJavaTypeAdapter();
			}
			@Override
			public Adapter caseHibernateType(HibernateType object) {
				return createHibernateTypeAdapter();
			}
			@Override
			public Adapter caseDefaultBaseClassName(DefaultBaseClassName object) {
				return createDefaultBaseClassNameAdapter();
			}
			@Override
			public Adapter caseDatabaseOptions(DatabaseOptions object) {
				return createDatabaseOptionsAdapter();
			}
			@Override
			public Adapter caseJPAOptions(JPAOptions object) {
				return createJPAOptionsAdapter();
			}
			@Override
			public Adapter caseDeploymentOptions(DeploymentOptions object) {
				return createDeploymentOptionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.ApplicationConfig <em>Application Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.ApplicationConfig
	 * @generated
	 */
	public Adapter createApplicationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.ProjectConfig <em>Project Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.ProjectConfig
	 * @generated
	 */
	public Adapter createProjectConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.SculptorConfig <em>Sculptor Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.SculptorConfig
	 * @generated
	 */
	public Adapter createSculptorConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.JhipsterConfig <em>Jhipster Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.JhipsterConfig
	 * @generated
	 */
	public Adapter createJhipsterConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.RESTOptions <em>REST Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.RESTOptions
	 * @generated
	 */
	public Adapter createRESTOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.CacheOptions <em>Cache Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.CacheOptions
	 * @generated
	 */
	public Adapter createCacheOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.GenerateOptions <em>Generate Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.GenerateOptions
	 * @generated
	 */
	public Adapter createGenerateOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.FrameworkOptions <em>Framework Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.FrameworkOptions
	 * @generated
	 */
	public Adapter createFrameworkOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.CascadeOptions <em>Cascade Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.CascadeOptions
	 * @generated
	 */
	public Adapter createCascadeOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.PackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.PackageName
	 * @generated
	 */
	public Adapter createPackageNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.JavaType <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.JavaType
	 * @generated
	 */
	public Adapter createJavaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.HibernateType <em>Hibernate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.HibernateType
	 * @generated
	 */
	public Adapter createHibernateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.DefaultBaseClassName <em>Default Base Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.DefaultBaseClassName
	 * @generated
	 */
	public Adapter createDefaultBaseClassNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.DatabaseOptions <em>Database Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.DatabaseOptions
	 * @generated
	 */
	public Adapter createDatabaseOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.JPAOptions <em>JPA Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.JPAOptions
	 * @generated
	 */
	public Adapter createJPAOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.github.icelyframework.configuration.DeploymentOptions <em>Deployment Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.github.icelyframework.configuration.DeploymentOptions
	 * @generated
	 */
	public Adapter createDeploymentOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConfigurationAdapterFactory
