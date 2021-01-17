/**
 */
package com.github.icelyframework.configuration.util;

import com.github.icelyframework.configuration.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.configuration.ConfigurationPackage
 * @generated
 */
public class ConfigurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConfigurationPackage.APPLICATION_CONFIG: {
				ApplicationConfig applicationConfig = (ApplicationConfig)theEObject;
				T result = caseApplicationConfig(applicationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PROJECT_CONFIG: {
				ProjectConfig projectConfig = (ProjectConfig)theEObject;
				T result = caseProjectConfig(projectConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.SCULPTOR_CONFIG: {
				SculptorConfig sculptorConfig = (SculptorConfig)theEObject;
				T result = caseSculptorConfig(sculptorConfig);
				if (result == null) result = caseApplicationConfig(sculptorConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.JHIPSTER_CONFIG: {
				JhipsterConfig jhipsterConfig = (JhipsterConfig)theEObject;
				T result = caseJhipsterConfig(jhipsterConfig);
				if (result == null) result = caseApplicationConfig(jhipsterConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.REST_OPTIONS: {
				RESTOptions restOptions = (RESTOptions)theEObject;
				T result = caseRESTOptions(restOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CACHE_OPTIONS: {
				CacheOptions cacheOptions = (CacheOptions)theEObject;
				T result = caseCacheOptions(cacheOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.GENERATE_OPTIONS: {
				GenerateOptions generateOptions = (GenerateOptions)theEObject;
				T result = caseGenerateOptions(generateOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.FRAMEWORK_OPTIONS: {
				FrameworkOptions frameworkOptions = (FrameworkOptions)theEObject;
				T result = caseFrameworkOptions(frameworkOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.CASCADE_OPTIONS: {
				CascadeOptions cascadeOptions = (CascadeOptions)theEObject;
				T result = caseCascadeOptions(cascadeOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.PACKAGE_NAME: {
				PackageName packageName = (PackageName)theEObject;
				T result = casePackageName(packageName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.JAVA_TYPE: {
				JavaType javaType = (JavaType)theEObject;
				T result = caseJavaType(javaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.HIBERNATE_TYPE: {
				HibernateType hibernateType = (HibernateType)theEObject;
				T result = caseHibernateType(hibernateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DEFAULT_BASE_CLASS_NAME: {
				DefaultBaseClassName defaultBaseClassName = (DefaultBaseClassName)theEObject;
				T result = caseDefaultBaseClassName(defaultBaseClassName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DATABASE_OPTIONS: {
				DatabaseOptions databaseOptions = (DatabaseOptions)theEObject;
				T result = caseDatabaseOptions(databaseOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.JPA_OPTIONS: {
				JPAOptions jpaOptions = (JPAOptions)theEObject;
				T result = caseJPAOptions(jpaOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationPackage.DEPLOYMENT_OPTIONS: {
				DeploymentOptions deploymentOptions = (DeploymentOptions)theEObject;
				T result = caseDeploymentOptions(deploymentOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationConfig(ApplicationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectConfig(ProjectConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sculptor Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sculptor Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSculptorConfig(SculptorConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jhipster Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jhipster Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJhipsterConfig(JhipsterConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTOptions(RESTOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheOptions(CacheOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generate Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generate Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerateOptions(GenerateOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameworkOptions(FrameworkOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cascade Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cascade Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCascadeOptions(CascadeOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageName(PackageName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaType(JavaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hibernate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hibernate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHibernateType(HibernateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Base Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Base Class Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultBaseClassName(DefaultBaseClassName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseOptions(DatabaseOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPA Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPA Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPAOptions(JPAOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentOptions(DeploymentOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConfigurationSwitch
