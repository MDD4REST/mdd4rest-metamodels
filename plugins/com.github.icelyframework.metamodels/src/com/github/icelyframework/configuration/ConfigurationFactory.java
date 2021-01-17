/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = com.github.icelyframework.configuration.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Config</em>'.
	 * @generated
	 */
	ApplicationConfig createApplicationConfig();

	/**
	 * Returns a new object of class '<em>Project Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Config</em>'.
	 * @generated
	 */
	ProjectConfig createProjectConfig();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Sculptor Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sculptor Config</em>'.
	 * @generated
	 */
	SculptorConfig createSculptorConfig();

	/**
	 * Returns a new object of class '<em>Jhipster Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jhipster Config</em>'.
	 * @generated
	 */
	JhipsterConfig createJhipsterConfig();

	/**
	 * Returns a new object of class '<em>REST Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Options</em>'.
	 * @generated
	 */
	RESTOptions createRESTOptions();

	/**
	 * Returns a new object of class '<em>Cache Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Options</em>'.
	 * @generated
	 */
	CacheOptions createCacheOptions();

	/**
	 * Returns a new object of class '<em>Generate Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generate Options</em>'.
	 * @generated
	 */
	GenerateOptions createGenerateOptions();

	/**
	 * Returns a new object of class '<em>Framework Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Framework Options</em>'.
	 * @generated
	 */
	FrameworkOptions createFrameworkOptions();

	/**
	 * Returns a new object of class '<em>Cascade Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cascade Options</em>'.
	 * @generated
	 */
	CascadeOptions createCascadeOptions();

	/**
	 * Returns a new object of class '<em>Package Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Name</em>'.
	 * @generated
	 */
	PackageName createPackageName();

	/**
	 * Returns a new object of class '<em>Java Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Type</em>'.
	 * @generated
	 */
	JavaType createJavaType();

	/**
	 * Returns a new object of class '<em>Hibernate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hibernate Type</em>'.
	 * @generated
	 */
	HibernateType createHibernateType();

	/**
	 * Returns a new object of class '<em>Default Base Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Base Class Name</em>'.
	 * @generated
	 */
	DefaultBaseClassName createDefaultBaseClassName();

	/**
	 * Returns a new object of class '<em>Database Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Options</em>'.
	 * @generated
	 */
	DatabaseOptions createDatabaseOptions();

	/**
	 * Returns a new object of class '<em>JPA Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPA Options</em>'.
	 * @generated
	 */
	JPAOptions createJPAOptions();

	/**
	 * Returns a new object of class '<em>Deployment Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Options</em>'.
	 * @generated
	 */
	DeploymentOptions createDeploymentOptions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
