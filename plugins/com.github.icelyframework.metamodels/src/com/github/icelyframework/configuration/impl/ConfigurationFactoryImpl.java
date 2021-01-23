/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigurationPackage.eNS_URI);
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigurationPackage.PROJECT_CONFIG: return createProjectConfig();
			case ConfigurationPackage.APPLICATION: return createApplication();
			case ConfigurationPackage.PROJECT: return createProject();
			case ConfigurationPackage.SCULPTOR_CONFIG: return createSculptorConfig();
			case ConfigurationPackage.JHIPSTER_CONFIG: return createJhipsterConfig();
			case ConfigurationPackage.REST_OPTIONS: return createRESTOptions();
			case ConfigurationPackage.CACHE_OPTIONS: return createCacheOptions();
			case ConfigurationPackage.GENERATE_OPTIONS: return createGenerateOptions();
			case ConfigurationPackage.FRAMEWORK_OPTIONS: return createFrameworkOptions();
			case ConfigurationPackage.CASCADE_OPTIONS: return createCascadeOptions();
			case ConfigurationPackage.PACKAGE_NAME: return createPackageName();
			case ConfigurationPackage.JAVA_TYPE: return createJavaType();
			case ConfigurationPackage.HIBERNATE_TYPE: return createHibernateType();
			case ConfigurationPackage.DEFAULT_BASE_CLASS_NAME: return createDefaultBaseClassName();
			case ConfigurationPackage.DATABASE_OPTIONS: return createDatabaseOptions();
			case ConfigurationPackage.JPA_OPTIONS: return createJPAOptions();
			case ConfigurationPackage.DEPLOYMENT_OPTIONS: return createDeploymentOptions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigurationPackage.APPLICATION_TYPE:
				return createApplicationTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.ARCHITECTURE_TYPE:
				return createArchitectureTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.DATABASE_TYPE:
				return createDatabaseTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.AUTHENTICATION_TYPE:
				return createAuthenticationTypeFromString(eDataType, initialValue);
			case ConfigurationPackage.JHIPSTER_APPLICATION_TYPE:
				return createJhipsterApplicationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigurationPackage.APPLICATION_TYPE:
				return convertApplicationTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.ARCHITECTURE_TYPE:
				return convertArchitectureTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.DATABASE_TYPE:
				return convertDatabaseTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.AUTHENTICATION_TYPE:
				return convertAuthenticationTypeToString(eDataType, instanceValue);
			case ConfigurationPackage.JHIPSTER_APPLICATION_TYPE:
				return convertJhipsterApplicationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectConfig createProjectConfig() {
		ProjectConfigImpl projectConfig = new ProjectConfigImpl();
		return projectConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SculptorConfig createSculptorConfig() {
		SculptorConfigImpl sculptorConfig = new SculptorConfigImpl();
		return sculptorConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JhipsterConfig createJhipsterConfig() {
		JhipsterConfigImpl jhipsterConfig = new JhipsterConfigImpl();
		return jhipsterConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RESTOptions createRESTOptions() {
		RESTOptionsImpl restOptions = new RESTOptionsImpl();
		return restOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheOptions createCacheOptions() {
		CacheOptionsImpl cacheOptions = new CacheOptionsImpl();
		return cacheOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerateOptions createGenerateOptions() {
		GenerateOptionsImpl generateOptions = new GenerateOptionsImpl();
		return generateOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameworkOptions createFrameworkOptions() {
		FrameworkOptionsImpl frameworkOptions = new FrameworkOptionsImpl();
		return frameworkOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CascadeOptions createCascadeOptions() {
		CascadeOptionsImpl cascadeOptions = new CascadeOptionsImpl();
		return cascadeOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageName createPackageName() {
		PackageNameImpl packageName = new PackageNameImpl();
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaType createJavaType() {
		JavaTypeImpl javaType = new JavaTypeImpl();
		return javaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HibernateType createHibernateType() {
		HibernateTypeImpl hibernateType = new HibernateTypeImpl();
		return hibernateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultBaseClassName createDefaultBaseClassName() {
		DefaultBaseClassNameImpl defaultBaseClassName = new DefaultBaseClassNameImpl();
		return defaultBaseClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseOptions createDatabaseOptions() {
		DatabaseOptionsImpl databaseOptions = new DatabaseOptionsImpl();
		return databaseOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JPAOptions createJPAOptions() {
		JPAOptionsImpl jpaOptions = new JPAOptionsImpl();
		return jpaOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentOptions createDeploymentOptions() {
		DeploymentOptionsImpl deploymentOptions = new DeploymentOptionsImpl();
		return deploymentOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType createApplicationTypeFromString(EDataType eDataType, String initialValue) {
		ApplicationType result = ApplicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureType createArchitectureTypeFromString(EDataType eDataType, String initialValue) {
		ArchitectureType result = ArchitectureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchitectureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseTypeFromString(EDataType eDataType, String initialValue) {
		DatabaseType result = DatabaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationType createAuthenticationTypeFromString(EDataType eDataType, String initialValue) {
		AuthenticationType result = AuthenticationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JhipsterApplicationType createJhipsterApplicationTypeFromString(EDataType eDataType, String initialValue) {
		JhipsterApplicationType result = JhipsterApplicationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJhipsterApplicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

} //ConfigurationFactoryImpl
