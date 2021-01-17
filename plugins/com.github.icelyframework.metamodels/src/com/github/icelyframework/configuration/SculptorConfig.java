/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sculptor Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getCartridges <em>Cartridges</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getProject_nature <em>Project nature</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getId_type <em>Id type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getDatetime_library <em>Datetime library</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getToStringStyle <em>To String Style</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getScaffold_operations <em>Scaffold operations</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#isCheck_cyclicDependencies <em>Check cyclic Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getFindAll_paging <em>Find All paging</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getFindByCondition_paging <em>Find By Condition paging</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getFramework <em>Framework</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getRest <em>Rest</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getGenerate <em>Generate</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getCascade <em>Cascade</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getJpa <em>Jpa</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getHibernatetypes <em>Hibernatetypes</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getJavatypes <em>Javatypes</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getPackagenames <em>Packagenames</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.SculptorConfig#getDefaultbaseclassnames <em>Defaultbaseclassnames</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig()
 * @model
 * @generated
 */
public interface SculptorConfig extends ApplicationConfig {
	/**
	 * Returns the value of the '<em><b>Cartridges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartridges</em>' attribute.
	 * @see #setCartridges(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Cartridges()
	 * @model
	 * @generated
	 */
	String getCartridges();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getCartridges <em>Cartridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartridges</em>' attribute.
	 * @see #getCartridges()
	 * @generated
	 */
	void setCartridges(String value);

	/**
	 * Returns the value of the '<em><b>Project nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project nature</em>' attribute.
	 * @see #setProject_nature(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Project_nature()
	 * @model
	 * @generated
	 */
	String getProject_nature();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getProject_nature <em>Project nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project nature</em>' attribute.
	 * @see #getProject_nature()
	 * @generated
	 */
	void setProject_nature(String value);

	/**
	 * Returns the value of the '<em><b>Id type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id type</em>' attribute.
	 * @see #setId_type(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Id_type()
	 * @model
	 * @generated
	 */
	String getId_type();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getId_type <em>Id type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id type</em>' attribute.
	 * @see #getId_type()
	 * @generated
	 */
	void setId_type(String value);

	/**
	 * Returns the value of the '<em><b>Datetime library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime library</em>' attribute.
	 * @see #setDatetime_library(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Datetime_library()
	 * @model
	 * @generated
	 */
	String getDatetime_library();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getDatetime_library <em>Datetime library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime library</em>' attribute.
	 * @see #getDatetime_library()
	 * @generated
	 */
	void setDatetime_library(String value);

	/**
	 * Returns the value of the '<em><b>To String Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To String Style</em>' attribute.
	 * @see #setToStringStyle(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_ToStringStyle()
	 * @model
	 * @generated
	 */
	String getToStringStyle();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getToStringStyle <em>To String Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To String Style</em>' attribute.
	 * @see #getToStringStyle()
	 * @generated
	 */
	void setToStringStyle(String value);

	/**
	 * Returns the value of the '<em><b>Scaffold operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaffold operations</em>' attribute.
	 * @see #setScaffold_operations(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Scaffold_operations()
	 * @model
	 * @generated
	 */
	String getScaffold_operations();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getScaffold_operations <em>Scaffold operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaffold operations</em>' attribute.
	 * @see #getScaffold_operations()
	 * @generated
	 */
	void setScaffold_operations(String value);

	/**
	 * Returns the value of the '<em><b>Check cyclic Dependencies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check cyclic Dependencies</em>' attribute.
	 * @see #setCheck_cyclicDependencies(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Check_cyclicDependencies()
	 * @model
	 * @generated
	 */
	boolean isCheck_cyclicDependencies();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#isCheck_cyclicDependencies <em>Check cyclic Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check cyclic Dependencies</em>' attribute.
	 * @see #isCheck_cyclicDependencies()
	 * @generated
	 */
	void setCheck_cyclicDependencies(boolean value);

	/**
	 * Returns the value of the '<em><b>Find All paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find All paging</em>' attribute.
	 * @see #setFindAll_paging(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_FindAll_paging()
	 * @model
	 * @generated
	 */
	String getFindAll_paging();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getFindAll_paging <em>Find All paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find All paging</em>' attribute.
	 * @see #getFindAll_paging()
	 * @generated
	 */
	void setFindAll_paging(String value);

	/**
	 * Returns the value of the '<em><b>Find By Condition paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find By Condition paging</em>' attribute.
	 * @see #setFindByCondition_paging(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_FindByCondition_paging()
	 * @model
	 * @generated
	 */
	String getFindByCondition_paging();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getFindByCondition_paging <em>Find By Condition paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find By Condition paging</em>' attribute.
	 * @see #getFindByCondition_paging()
	 * @generated
	 */
	void setFindByCondition_paging(String value);

	/**
	 * Returns the value of the '<em><b>Framework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework</em>' containment reference.
	 * @see #setFramework(FrameworkOptions)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Framework()
	 * @model containment="true"
	 * @generated
	 */
	FrameworkOptions getFramework();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getFramework <em>Framework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework</em>' containment reference.
	 * @see #getFramework()
	 * @generated
	 */
	void setFramework(FrameworkOptions value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' containment reference.
	 * @see #setRest(RESTOptions)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Rest()
	 * @model containment="true"
	 * @generated
	 */
	RESTOptions getRest();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getRest <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' containment reference.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(RESTOptions value);

	/**
	 * Returns the value of the '<em><b>Generate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate</em>' containment reference.
	 * @see #setGenerate(GenerateOptions)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Generate()
	 * @model containment="true"
	 * @generated
	 */
	GenerateOptions getGenerate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.SculptorConfig#getGenerate <em>Generate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate</em>' containment reference.
	 * @see #getGenerate()
	 * @generated
	 */
	void setGenerate(GenerateOptions value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.CascadeOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Cascade()
	 * @model containment="true"
	 * @generated
	 */
	EList<CascadeOptions> getCascade();

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.DatabaseOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Database()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatabaseOptions> getDatabase();

	/**
	 * Returns the value of the '<em><b>Jpa</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.JPAOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jpa</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Jpa()
	 * @model containment="true"
	 * @generated
	 */
	EList<JPAOptions> getJpa();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.DeploymentOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentOptions> getDeployment();

	/**
	 * Returns the value of the '<em><b>Hibernatetypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.HibernateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hibernatetypes</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Hibernatetypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HibernateType> getHibernatetypes();

	/**
	 * Returns the value of the '<em><b>Javatypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.JavaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Javatypes</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Javatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JavaType> getJavatypes();

	/**
	 * Returns the value of the '<em><b>Packagenames</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.PackageName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packagenames</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Packagenames()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageName> getPackagenames();

	/**
	 * Returns the value of the '<em><b>Defaultbaseclassnames</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.configuration.DefaultBaseClassName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultbaseclassnames</em>' containment reference list.
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getSculptorConfig_Defaultbaseclassnames()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefaultBaseClassName> getDefaultbaseclassnames();

} // SculptorConfig
