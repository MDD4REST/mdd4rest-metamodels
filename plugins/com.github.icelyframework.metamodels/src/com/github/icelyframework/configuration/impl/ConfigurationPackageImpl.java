/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.Application;
import com.github.icelyframework.configuration.ApplicationConfig;
import com.github.icelyframework.configuration.ApplicationType;
import com.github.icelyframework.configuration.ArchitectureType;
import com.github.icelyframework.configuration.AuthenticationType;
import com.github.icelyframework.configuration.CacheOptions;
import com.github.icelyframework.configuration.CascadeOptions;
import com.github.icelyframework.configuration.ConfigurationFactory;
import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.DatabaseOptions;
import com.github.icelyframework.configuration.DatabaseType;
import com.github.icelyframework.configuration.DefaultBaseClassName;
import com.github.icelyframework.configuration.DeploymentOptions;
import com.github.icelyframework.configuration.FrameworkOptions;
import com.github.icelyframework.configuration.GenerateOptions;
import com.github.icelyframework.configuration.HibernateType;
import com.github.icelyframework.configuration.JPAOptions;
import com.github.icelyframework.configuration.JavaType;
import com.github.icelyframework.configuration.JhipsterApplicationType;
import com.github.icelyframework.configuration.JhipsterConfig;
import com.github.icelyframework.configuration.PackageName;
import com.github.icelyframework.configuration.Project;
import com.github.icelyframework.configuration.ProjectConfig;
import com.github.icelyframework.configuration.RESTOptions;
import com.github.icelyframework.configuration.SculptorConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sculptorConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jhipsterConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generateOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cascadeOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hibernateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultBaseClassNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum architectureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jhipsterApplicationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = registeredConfigurationPackage instanceof ConfigurationPackageImpl ? (ConfigurationPackageImpl)registeredConfigurationPackage : new ConfigurationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationConfig() {
		return applicationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationConfig_BaseName() {
		return (EAttribute)applicationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationConfig_ServicePort() {
		return (EAttribute)applicationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectConfig() {
		return projectConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectConfig_Version() {
		return (EAttribute)projectConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Project() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_BasePackage() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_ApplicationType() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Config() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Applications() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BasePath() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BasePackage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Architecture() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Config() {
		return (EReference)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSculptorConfig() {
		return sculptorConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_Cartridges() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_Project_nature() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_Id_type() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_Datetime_library() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_ToStringStyle() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_Scaffold_operations() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_Check_cyclicDependencies() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_FindAll_paging() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSculptorConfig_FindByCondition_paging() {
		return (EAttribute)sculptorConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Framework() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Rest() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Generate() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Cascade() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Database() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Jpa() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Deployment() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Hibernatetypes() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Javatypes() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Packagenames() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Defaultbaseclassnames() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSculptorConfig_Cacheoptions() {
		return (EReference)sculptorConfigEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJhipsterConfig() {
		return jhipsterConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_DatabaseType() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_JhiPrefix() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_SkipUserManagement() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_NativeLanguage() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_TestFrameworks() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_CacheProvider() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_EntitySuffix() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_SkipServer() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_DtoSuffix() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_EnableHibernateCache() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_SkipClient() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_BuildTool() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_AuthenticationType() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJhipsterConfig_ApplicationType() {
		return (EAttribute)jhipsterConfigEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRESTOptions() {
		return restOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRESTOptions_Spring_remoting_type() {
		return (EAttribute)restOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRESTOptions_Rest_default_path() {
		return (EAttribute)restOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRESTOptions_Rest_default_httpMethod() {
		return (EAttribute)restOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRESTOptions_Generate_resource() {
		return (EAttribute)restOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRESTOptions_Generate_restWeb() {
		return (EAttribute)restOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCacheOptions() {
		return cacheOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheOptions_Cache_provider() {
		return (EAttribute)cacheOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerateOptions() {
		return generateOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_domainObject_conditionalCriteriaProperties() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_repository_finders() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_modelDoc() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_umlgraph() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_spring_annotation_tx() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_ddl() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_ddl_drop() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_domainObject_compositeKeyClass() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_serviceContext() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_NotFoundException() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_spring_annotation() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_jpa_annotation() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_validation_annotation() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_jpa_annotation_onField() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_jpa_annotation_columnDefinition() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_xstream_annotation() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generat_test() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerateOptions_Generate_gapClass() {
		return (EAttribute)generateOptionsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrameworkOptions() {
		return frameworkOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameworkOptions_Framework_accessimpl_package() {
		return (EAttribute)frameworkOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameworkOptions_Framework_accessimpl_prefix() {
		return (EAttribute)frameworkOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameworkOptions_Framework_accessapi_packag() {
		return (EAttribute)frameworkOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCascadeOptions() {
		return cascadeOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCascadeOptions_Cascade_aggregate() {
		return (EAttribute)cascadeOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCascadeOptions_Cascade_aggregate_oneToMany() {
		return (EAttribute)cascadeOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCascadeOptions_Cascade_manyToMany() {
		return (EAttribute)cascadeOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCascadeOptions_Cascade_oneToMany() {
		return (EAttribute)cascadeOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCascadeOptions_Cascade_toMany() {
		return (EAttribute)cascadeOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCascadeOptions_Cascade_toOne() {
		return (EAttribute)cascadeOptionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageName() {
		return packageNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageName_Name() {
		return (EAttribute)packageNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageName_Value() {
		return (EAttribute)packageNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaType() {
		return javaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaType_Name() {
		return (EAttribute)javaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaType_Value() {
		return (EAttribute)javaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHibernateType() {
		return hibernateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHibernateType_Name() {
		return (EAttribute)hibernateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHibernateType_Value() {
		return (EAttribute)hibernateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultBaseClassName() {
		return defaultBaseClassNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultBaseClassName_Name() {
		return (EAttribute)defaultBaseClassNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultBaseClassName_Value() {
		return (EAttribute)defaultBaseClassNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseOptions() {
		return databaseOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseOptions_Db_useUnderscoreNaming() {
		return (EAttribute)databaseOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseOptions_Db_useIdSuffixInForeigKey() {
		return (EAttribute)databaseOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseOptions_Db_useTablePrefixedIdColumn() {
		return (EAttribute)databaseOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseOptions_Db_product() {
		return (EAttribute)databaseOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJPAOptions() {
		return jpaOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJPAOptions_Jpa_provider() {
		return (EAttribute)jpaOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentOptions() {
		return deploymentOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentOptions_Deployment_applicationServer() {
		return (EAttribute)deploymentOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getApplicationType() {
		return applicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArchitectureType() {
		return architectureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatabaseType() {
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthenticationType() {
		return authenticationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJhipsterApplicationType() {
		return jhipsterApplicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationConfigEClass = createEClass(APPLICATION_CONFIG);
		createEAttribute(applicationConfigEClass, APPLICATION_CONFIG__BASE_NAME);
		createEAttribute(applicationConfigEClass, APPLICATION_CONFIG__SERVICE_PORT);

		projectConfigEClass = createEClass(PROJECT_CONFIG);
		createEAttribute(projectConfigEClass, PROJECT_CONFIG__VERSION);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEReference(applicationEClass, APPLICATION__PROJECT);
		createEAttribute(applicationEClass, APPLICATION__BASE_PACKAGE);
		createEAttribute(applicationEClass, APPLICATION__APPLICATION_TYPE);
		createEReference(applicationEClass, APPLICATION__CONFIG);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__APPLICATIONS);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__BASE_PATH);
		createEAttribute(projectEClass, PROJECT__BASE_PACKAGE);
		createEAttribute(projectEClass, PROJECT__ARCHITECTURE);
		createEReference(projectEClass, PROJECT__CONFIG);

		sculptorConfigEClass = createEClass(SCULPTOR_CONFIG);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__CARTRIDGES);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__PROJECT_NATURE);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__ID_TYPE);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__DATETIME_LIBRARY);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__TO_STRING_STYLE);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__FIND_ALL_PAGING);
		createEAttribute(sculptorConfigEClass, SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__FRAMEWORK);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__REST);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__GENERATE);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__CASCADE);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__DATABASE);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__JPA);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__DEPLOYMENT);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__HIBERNATETYPES);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__JAVATYPES);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__PACKAGENAMES);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES);
		createEReference(sculptorConfigEClass, SCULPTOR_CONFIG__CACHEOPTIONS);

		jhipsterConfigEClass = createEClass(JHIPSTER_CONFIG);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__DATABASE_TYPE);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__JHI_PREFIX);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__SKIP_USER_MANAGEMENT);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__NATIVE_LANGUAGE);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__TEST_FRAMEWORKS);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__CACHE_PROVIDER);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__ENTITY_SUFFIX);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__SKIP_SERVER);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__DTO_SUFFIX);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__ENABLE_HIBERNATE_CACHE);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__SKIP_CLIENT);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__BUILD_TOOL);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__AUTHENTICATION_TYPE);
		createEAttribute(jhipsterConfigEClass, JHIPSTER_CONFIG__APPLICATION_TYPE);

		restOptionsEClass = createEClass(REST_OPTIONS);
		createEAttribute(restOptionsEClass, REST_OPTIONS__SPRING_REMOTING_TYPE);
		createEAttribute(restOptionsEClass, REST_OPTIONS__REST_DEFAULT_PATH);
		createEAttribute(restOptionsEClass, REST_OPTIONS__REST_DEFAULT_HTTP_METHOD);
		createEAttribute(restOptionsEClass, REST_OPTIONS__GENERATE_RESOURCE);
		createEAttribute(restOptionsEClass, REST_OPTIONS__GENERATE_REST_WEB);

		cacheOptionsEClass = createEClass(CACHE_OPTIONS);
		createEAttribute(cacheOptionsEClass, CACHE_OPTIONS__CACHE_PROVIDER);

		generateOptionsEClass = createEClass(GENERATE_OPTIONS);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_CONDITIONAL_CRITERIA_PROPERTIES);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_REPOSITORY_FINDERS);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_MODEL_DOC);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_UMLGRAPH);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION_TX);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_DDL);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_DDL_DROP);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_DOMAIN_OBJECT_COMPOSITE_KEY_CLASS);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_SERVICE_CONTEXT);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_NOT_FOUND_EXCEPTION);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_SPRING_ANNOTATION);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_VALIDATION_ANNOTATION);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_ON_FIELD);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_JPA_ANNOTATION_COLUMN_DEFINITION);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_XSTREAM_ANNOTATION);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERAT_TEST);
		createEAttribute(generateOptionsEClass, GENERATE_OPTIONS__GENERATE_GAP_CLASS);

		frameworkOptionsEClass = createEClass(FRAMEWORK_OPTIONS);
		createEAttribute(frameworkOptionsEClass, FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PACKAGE);
		createEAttribute(frameworkOptionsEClass, FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSIMPL_PREFIX);
		createEAttribute(frameworkOptionsEClass, FRAMEWORK_OPTIONS__FRAMEWORK_ACCESSAPI_PACKAG);

		cascadeOptionsEClass = createEClass(CASCADE_OPTIONS);
		createEAttribute(cascadeOptionsEClass, CASCADE_OPTIONS__CASCADE_AGGREGATE);
		createEAttribute(cascadeOptionsEClass, CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY);
		createEAttribute(cascadeOptionsEClass, CASCADE_OPTIONS__CASCADE_MANY_TO_MANY);
		createEAttribute(cascadeOptionsEClass, CASCADE_OPTIONS__CASCADE_ONE_TO_MANY);
		createEAttribute(cascadeOptionsEClass, CASCADE_OPTIONS__CASCADE_TO_MANY);
		createEAttribute(cascadeOptionsEClass, CASCADE_OPTIONS__CASCADE_TO_ONE);

		packageNameEClass = createEClass(PACKAGE_NAME);
		createEAttribute(packageNameEClass, PACKAGE_NAME__NAME);
		createEAttribute(packageNameEClass, PACKAGE_NAME__VALUE);

		javaTypeEClass = createEClass(JAVA_TYPE);
		createEAttribute(javaTypeEClass, JAVA_TYPE__NAME);
		createEAttribute(javaTypeEClass, JAVA_TYPE__VALUE);

		hibernateTypeEClass = createEClass(HIBERNATE_TYPE);
		createEAttribute(hibernateTypeEClass, HIBERNATE_TYPE__NAME);
		createEAttribute(hibernateTypeEClass, HIBERNATE_TYPE__VALUE);

		defaultBaseClassNameEClass = createEClass(DEFAULT_BASE_CLASS_NAME);
		createEAttribute(defaultBaseClassNameEClass, DEFAULT_BASE_CLASS_NAME__NAME);
		createEAttribute(defaultBaseClassNameEClass, DEFAULT_BASE_CLASS_NAME__VALUE);

		databaseOptionsEClass = createEClass(DATABASE_OPTIONS);
		createEAttribute(databaseOptionsEClass, DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING);
		createEAttribute(databaseOptionsEClass, DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY);
		createEAttribute(databaseOptionsEClass, DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN);
		createEAttribute(databaseOptionsEClass, DATABASE_OPTIONS__DB_PRODUCT);

		jpaOptionsEClass = createEClass(JPA_OPTIONS);
		createEAttribute(jpaOptionsEClass, JPA_OPTIONS__JPA_PROVIDER);

		deploymentOptionsEClass = createEClass(DEPLOYMENT_OPTIONS);
		createEAttribute(deploymentOptionsEClass, DEPLOYMENT_OPTIONS__DEPLOYMENT_APPLICATION_SERVER);

		// Create enums
		applicationTypeEEnum = createEEnum(APPLICATION_TYPE);
		architectureTypeEEnum = createEEnum(ARCHITECTURE_TYPE);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
		authenticationTypeEEnum = createEEnum(AUTHENTICATION_TYPE);
		jhipsterApplicationTypeEEnum = createEEnum(JHIPSTER_APPLICATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sculptorConfigEClass.getESuperTypes().add(this.getApplicationConfig());
		jhipsterConfigEClass.getESuperTypes().add(this.getApplicationConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationConfigEClass, ApplicationConfig.class, "ApplicationConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationConfig_BaseName(), ecorePackage.getEString(), "baseName", null, 1, 1, ApplicationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationConfig_ServicePort(), ecorePackage.getEString(), "servicePort", null, 0, 1, ApplicationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectConfigEClass, ProjectConfig.class, "ProjectConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectConfig_Version(), ecorePackage.getEString(), "version", null, 0, 1, ProjectConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Project(), this.getProject(), this.getProject_Applications(), "project", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_ApplicationType(), this.getApplicationType(), "applicationType", "SCULPTOR_MICROSERVICE", 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Config(), this.getApplicationConfig(), null, "config", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Applications(), this.getApplication(), this.getApplication_Project(), "applications", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Architecture(), this.getArchitectureType(), "architecture", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Config(), this.getProjectConfig(), null, "config", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sculptorConfigEClass, SculptorConfig.class, "SculptorConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSculptorConfig_Cartridges(), ecorePackage.getEString(), "cartridges", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_Project_nature(), ecorePackage.getEString(), "project_nature", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_Id_type(), ecorePackage.getEString(), "id_type", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_Datetime_library(), ecorePackage.getEString(), "datetime_library", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_ToStringStyle(), ecorePackage.getEString(), "toStringStyle", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_Scaffold_operations(), ecorePackage.getEString(), "scaffold_operations", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_Check_cyclicDependencies(), ecorePackage.getEBoolean(), "check_cyclicDependencies", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_FindAll_paging(), ecorePackage.getEString(), "findAll_paging", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSculptorConfig_FindByCondition_paging(), ecorePackage.getEString(), "findByCondition_paging", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Framework(), this.getFrameworkOptions(), null, "framework", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Rest(), this.getRESTOptions(), null, "rest", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Generate(), this.getGenerateOptions(), null, "generate", null, 0, 1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Cascade(), this.getCascadeOptions(), null, "cascade", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Database(), this.getDatabaseOptions(), null, "database", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Jpa(), this.getJPAOptions(), null, "jpa", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Deployment(), this.getDeploymentOptions(), null, "deployment", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Hibernatetypes(), this.getHibernateType(), null, "hibernatetypes", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Javatypes(), this.getJavaType(), null, "javatypes", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Packagenames(), this.getPackageName(), null, "packagenames", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Defaultbaseclassnames(), this.getDefaultBaseClassName(), null, "defaultbaseclassnames", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSculptorConfig_Cacheoptions(), this.getCacheOptions(), null, "cacheoptions", null, 0, -1, SculptorConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jhipsterConfigEClass, JhipsterConfig.class, "JhipsterConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJhipsterConfig_DatabaseType(), this.getDatabaseType(), "databaseType", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_JhiPrefix(), ecorePackage.getEString(), "jhiPrefix", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_SkipUserManagement(), ecorePackage.getEBoolean(), "skipUserManagement", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_NativeLanguage(), ecorePackage.getEString(), "nativeLanguage", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_TestFrameworks(), ecorePackage.getEString(), "testFrameworks", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_CacheProvider(), ecorePackage.getEString(), "cacheProvider", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_EntitySuffix(), ecorePackage.getEString(), "entitySuffix", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_SkipServer(), ecorePackage.getEBoolean(), "skipServer", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_DtoSuffix(), ecorePackage.getEString(), "dtoSuffix", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_EnableHibernateCache(), ecorePackage.getEBoolean(), "enableHibernateCache", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_SkipClient(), ecorePackage.getEBoolean(), "skipClient", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_BuildTool(), ecorePackage.getEString(), "buildTool", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_AuthenticationType(), this.getAuthenticationType(), "authenticationType", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJhipsterConfig_ApplicationType(), this.getJhipsterApplicationType(), "applicationType", null, 0, 1, JhipsterConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restOptionsEClass, RESTOptions.class, "RESTOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRESTOptions_Spring_remoting_type(), ecorePackage.getEString(), "spring_remoting_type", null, 0, 1, RESTOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTOptions_Rest_default_path(), ecorePackage.getEString(), "rest_default_path", null, 0, 1, RESTOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTOptions_Rest_default_httpMethod(), ecorePackage.getEString(), "rest_default_httpMethod", null, 0, 1, RESTOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTOptions_Generate_resource(), ecorePackage.getEBoolean(), "generate_resource", null, 0, 1, RESTOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTOptions_Generate_restWeb(), ecorePackage.getEBoolean(), "generate_restWeb", null, 0, 1, RESTOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheOptionsEClass, CacheOptions.class, "CacheOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCacheOptions_Cache_provider(), ecorePackage.getEString(), "cache_provider", null, 0, 1, CacheOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generateOptionsEClass, GenerateOptions.class, "GenerateOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerateOptions_Generate_domainObject_conditionalCriteriaProperties(), ecorePackage.getEBoolean(), "generate_domainObject_conditionalCriteriaProperties", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_repository_finders(), ecorePackage.getEBoolean(), "generate_repository_finders", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_modelDoc(), ecorePackage.getEBoolean(), "generate_modelDoc", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_umlgraph(), ecorePackage.getEBoolean(), "generate_umlgraph", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_spring_annotation_tx(), ecorePackage.getEBoolean(), "generate_spring_annotation_tx", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_ddl(), ecorePackage.getEBoolean(), "generate_ddl", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_ddl_drop(), ecorePackage.getEBoolean(), "generate_ddl_drop", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_domainObject_compositeKeyClass(), ecorePackage.getEBoolean(), "generate_domainObject_compositeKeyClass", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_serviceContext(), ecorePackage.getEBoolean(), "generate_serviceContext", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_NotFoundException(), ecorePackage.getEBoolean(), "generate_NotFoundException", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_spring_annotation(), ecorePackage.getEBoolean(), "generate_spring_annotation", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_jpa_annotation(), ecorePackage.getEBoolean(), "generate_jpa_annotation", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_validation_annotation(), ecorePackage.getEBoolean(), "generate_validation_annotation", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_jpa_annotation_onField(), ecorePackage.getEBoolean(), "generate_jpa_annotation_onField", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_jpa_annotation_columnDefinition(), ecorePackage.getEBoolean(), "generate_jpa_annotation_columnDefinition", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_xstream_annotation(), ecorePackage.getEBoolean(), "generate_xstream_annotation", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generat_test(), ecorePackage.getEBoolean(), "generat_test", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerateOptions_Generate_gapClass(), ecorePackage.getEBoolean(), "generate_gapClass", null, 0, 1, GenerateOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameworkOptionsEClass, FrameworkOptions.class, "FrameworkOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrameworkOptions_Framework_accessimpl_package(), ecorePackage.getEString(), "framework_accessimpl_package", null, 0, 1, FrameworkOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameworkOptions_Framework_accessimpl_prefix(), ecorePackage.getEString(), "framework_accessimpl_prefix", null, 0, 1, FrameworkOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameworkOptions_Framework_accessapi_packag(), ecorePackage.getEString(), "framework_accessapi_packag", null, 0, 1, FrameworkOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cascadeOptionsEClass, CascadeOptions.class, "CascadeOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCascadeOptions_Cascade_aggregate(), ecorePackage.getEString(), "cascade_aggregate", null, 0, 1, CascadeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeOptions_Cascade_aggregate_oneToMany(), ecorePackage.getEString(), "cascade_aggregate_oneToMany", null, 0, 1, CascadeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeOptions_Cascade_manyToMany(), ecorePackage.getEString(), "cascade_manyToMany", null, 0, 1, CascadeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeOptions_Cascade_oneToMany(), ecorePackage.getEString(), "cascade_oneToMany", null, 0, 1, CascadeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeOptions_Cascade_toMany(), ecorePackage.getEString(), "cascade_toMany", null, 0, 1, CascadeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCascadeOptions_Cascade_toOne(), ecorePackage.getEString(), "cascade_toOne", null, 0, 1, CascadeOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageNameEClass, PackageName.class, "PackageName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageName_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageName_Value(), ecorePackage.getEString(), "value", null, 0, 1, PackageName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaTypeEClass, JavaType.class, "JavaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaType_Name(), ecorePackage.getEString(), "name", null, 0, 1, JavaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaType_Value(), ecorePackage.getEString(), "value", null, 0, 1, JavaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hibernateTypeEClass, HibernateType.class, "HibernateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHibernateType_Name(), ecorePackage.getEString(), "name", null, 0, 1, HibernateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHibernateType_Value(), ecorePackage.getEString(), "value", null, 0, 1, HibernateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultBaseClassNameEClass, DefaultBaseClassName.class, "DefaultBaseClassName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultBaseClassName_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefaultBaseClassName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultBaseClassName_Value(), ecorePackage.getEString(), "value", null, 0, 1, DefaultBaseClassName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseOptionsEClass, DatabaseOptions.class, "DatabaseOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseOptions_Db_useUnderscoreNaming(), ecorePackage.getEBoolean(), "db_useUnderscoreNaming", null, 0, 1, DatabaseOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseOptions_Db_useIdSuffixInForeigKey(), ecorePackage.getEBoolean(), "db_useIdSuffixInForeigKey", null, 0, 1, DatabaseOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseOptions_Db_useTablePrefixedIdColumn(), ecorePackage.getEBoolean(), "db_useTablePrefixedIdColumn", null, 0, 1, DatabaseOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseOptions_Db_product(), ecorePackage.getEString(), "db_product", null, 0, 1, DatabaseOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jpaOptionsEClass, JPAOptions.class, "JPAOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJPAOptions_Jpa_provider(), ecorePackage.getEString(), "jpa_provider", null, 0, 1, JPAOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentOptionsEClass, DeploymentOptions.class, "DeploymentOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentOptions_Deployment_applicationServer(), ecorePackage.getEString(), "deployment_applicationServer", null, 0, 1, DeploymentOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(applicationTypeEEnum, ApplicationType.class, "ApplicationType");
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_MICROSERVICE);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_GATEWAY);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_MONOLITH);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.JHIPSTER_UAA);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.SCULPTOR_MICROSERVICE);
		addEEnumLiteral(applicationTypeEEnum, ApplicationType.SCULPTOR_MONOLITH);

		initEEnum(architectureTypeEEnum, ArchitectureType.class, "ArchitectureType");
		addEEnumLiteral(architectureTypeEEnum, ArchitectureType.SIMPLE);
		addEEnumLiteral(architectureTypeEEnum, ArchitectureType.CQRS);

		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.SQL);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.MONGODB);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.CASSANDRA);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.COUCHBASE);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.NO);

		initEEnum(authenticationTypeEEnum, AuthenticationType.class, "AuthenticationType");
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.JWT);
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.UAA);
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.SESSION);
		addEEnumLiteral(authenticationTypeEEnum, AuthenticationType.OAUTH2);

		initEEnum(jhipsterApplicationTypeEEnum, JhipsterApplicationType.class, "JhipsterApplicationType");
		addEEnumLiteral(jhipsterApplicationTypeEEnum, JhipsterApplicationType.MICROSERVICE);
		addEEnumLiteral(jhipsterApplicationTypeEEnum, JhipsterApplicationType.GATEWAY);
		addEEnumLiteral(jhipsterApplicationTypeEEnum, JhipsterApplicationType.MONOLITH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

} //ConfigurationPackageImpl
