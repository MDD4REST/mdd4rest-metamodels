/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.CascadeOptions;
import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.DatabaseOptions;
import com.github.icelyframework.configuration.DefaultBaseClassName;
import com.github.icelyframework.configuration.DeploymentOptions;
import com.github.icelyframework.configuration.FrameworkOptions;
import com.github.icelyframework.configuration.GenerateOptions;
import com.github.icelyframework.configuration.HibernateType;
import com.github.icelyframework.configuration.JPAOptions;
import com.github.icelyframework.configuration.JavaType;
import com.github.icelyframework.configuration.PackageName;
import com.github.icelyframework.configuration.RESTOptions;
import com.github.icelyframework.configuration.SculptorConfig;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sculptor Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getCartridges <em>Cartridges</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getProject_nature <em>Project nature</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getId_type <em>Id type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getDatetime_library <em>Datetime library</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getToStringStyle <em>To String Style</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getScaffold_operations <em>Scaffold operations</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#isCheck_cyclicDependencies <em>Check cyclic Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getFindAll_paging <em>Find All paging</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getFindByCondition_paging <em>Find By Condition paging</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getFramework <em>Framework</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getGenerate <em>Generate</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getJpa <em>Jpa</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getHibernatetypes <em>Hibernatetypes</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getJavatypes <em>Javatypes</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getPackagenames <em>Packagenames</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.SculptorConfigImpl#getDefaultbaseclassnames <em>Defaultbaseclassnames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SculptorConfigImpl extends ApplicationConfigImpl implements SculptorConfig {
	/**
	 * The default value of the '{@link #getCartridges() <em>Cartridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartridges()
	 * @generated
	 * @ordered
	 */
	protected static final String CARTRIDGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCartridges() <em>Cartridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartridges()
	 * @generated
	 * @ordered
	 */
	protected String cartridges = CARTRIDGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject_nature() <em>Project nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_nature()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject_nature() <em>Project nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject_nature()
	 * @generated
	 * @ordered
	 */
	protected String project_nature = PROJECT_NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId_type() <em>Id type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_type()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_type() <em>Id type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_type()
	 * @generated
	 * @ordered
	 */
	protected String id_type = ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatetime_library() <em>Datetime library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime_library()
	 * @generated
	 * @ordered
	 */
	protected static final String DATETIME_LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetime_library() <em>Datetime library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime_library()
	 * @generated
	 * @ordered
	 */
	protected String datetime_library = DATETIME_LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getToStringStyle() <em>To String Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStringStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_STRING_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToStringStyle() <em>To String Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStringStyle()
	 * @generated
	 * @ordered
	 */
	protected String toStringStyle = TO_STRING_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaffold_operations() <em>Scaffold operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaffold_operations()
	 * @generated
	 * @ordered
	 */
	protected static final String SCAFFOLD_OPERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaffold_operations() <em>Scaffold operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaffold_operations()
	 * @generated
	 * @ordered
	 */
	protected String scaffold_operations = SCAFFOLD_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheck_cyclicDependencies() <em>Check cyclic Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheck_cyclicDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_CYCLIC_DEPENDENCIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheck_cyclicDependencies() <em>Check cyclic Dependencies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheck_cyclicDependencies()
	 * @generated
	 * @ordered
	 */
	protected boolean check_cyclicDependencies = CHECK_CYCLIC_DEPENDENCIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFindAll_paging() <em>Find All paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindAll_paging()
	 * @generated
	 * @ordered
	 */
	protected static final String FIND_ALL_PAGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFindAll_paging() <em>Find All paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindAll_paging()
	 * @generated
	 * @ordered
	 */
	protected String findAll_paging = FIND_ALL_PAGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFindByCondition_paging() <em>Find By Condition paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindByCondition_paging()
	 * @generated
	 * @ordered
	 */
	protected static final String FIND_BY_CONDITION_PAGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFindByCondition_paging() <em>Find By Condition paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindByCondition_paging()
	 * @generated
	 * @ordered
	 */
	protected String findByCondition_paging = FIND_BY_CONDITION_PAGING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFramework() <em>Framework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramework()
	 * @generated
	 * @ordered
	 */
	protected FrameworkOptions framework;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected RESTOptions rest;

	/**
	 * The cached value of the '{@link #getGenerate() <em>Generate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerate()
	 * @generated
	 * @ordered
	 */
	protected GenerateOptions generate;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected EList<CascadeOptions> cascade;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseOptions> database;

	/**
	 * The cached value of the '{@link #getJpa() <em>Jpa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJpa()
	 * @generated
	 * @ordered
	 */
	protected EList<JPAOptions> jpa;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentOptions> deployment;

	/**
	 * The cached value of the '{@link #getHibernatetypes() <em>Hibernatetypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibernatetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<HibernateType> hibernatetypes;

	/**
	 * The cached value of the '{@link #getJavatypes() <em>Javatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaType> javatypes;

	/**
	 * The cached value of the '{@link #getPackagenames() <em>Packagenames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagenames()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageName> packagenames;

	/**
	 * The cached value of the '{@link #getDefaultbaseclassnames() <em>Defaultbaseclassnames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultbaseclassnames()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultBaseClassName> defaultbaseclassnames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SculptorConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.SCULPTOR_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCartridges() {
		return cartridges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartridges(String newCartridges) {
		String oldCartridges = cartridges;
		cartridges = newCartridges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__CARTRIDGES, oldCartridges, cartridges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProject_nature() {
		return project_nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject_nature(String newProject_nature) {
		String oldProject_nature = project_nature;
		project_nature = newProject_nature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__PROJECT_NATURE, oldProject_nature, project_nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_type() {
		return id_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_type(String newId_type) {
		String oldId_type = id_type;
		id_type = newId_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__ID_TYPE, oldId_type, id_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatetime_library() {
		return datetime_library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetime_library(String newDatetime_library) {
		String oldDatetime_library = datetime_library;
		datetime_library = newDatetime_library;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__DATETIME_LIBRARY, oldDatetime_library, datetime_library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToStringStyle() {
		return toStringStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStringStyle(String newToStringStyle) {
		String oldToStringStyle = toStringStyle;
		toStringStyle = newToStringStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__TO_STRING_STYLE, oldToStringStyle, toStringStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScaffold_operations() {
		return scaffold_operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaffold_operations(String newScaffold_operations) {
		String oldScaffold_operations = scaffold_operations;
		scaffold_operations = newScaffold_operations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS, oldScaffold_operations, scaffold_operations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheck_cyclicDependencies() {
		return check_cyclicDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheck_cyclicDependencies(boolean newCheck_cyclicDependencies) {
		boolean oldCheck_cyclicDependencies = check_cyclicDependencies;
		check_cyclicDependencies = newCheck_cyclicDependencies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES, oldCheck_cyclicDependencies, check_cyclicDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFindAll_paging() {
		return findAll_paging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindAll_paging(String newFindAll_paging) {
		String oldFindAll_paging = findAll_paging;
		findAll_paging = newFindAll_paging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__FIND_ALL_PAGING, oldFindAll_paging, findAll_paging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFindByCondition_paging() {
		return findByCondition_paging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFindByCondition_paging(String newFindByCondition_paging) {
		String oldFindByCondition_paging = findByCondition_paging;
		findByCondition_paging = newFindByCondition_paging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING, oldFindByCondition_paging, findByCondition_paging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameworkOptions getFramework() {
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFramework(FrameworkOptions newFramework, NotificationChain msgs) {
		FrameworkOptions oldFramework = framework;
		framework = newFramework;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK, oldFramework, newFramework);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramework(FrameworkOptions newFramework) {
		if (newFramework != framework) {
			NotificationChain msgs = null;
			if (framework != null)
				msgs = ((InternalEObject)framework).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK, null, msgs);
			if (newFramework != null)
				msgs = ((InternalEObject)newFramework).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK, null, msgs);
			msgs = basicSetFramework(newFramework, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK, newFramework, newFramework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RESTOptions getRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRest(RESTOptions newRest, NotificationChain msgs) {
		RESTOptions oldRest = rest;
		rest = newRest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__REST, oldRest, newRest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRest(RESTOptions newRest) {
		if (newRest != rest) {
			NotificationChain msgs = null;
			if (rest != null)
				msgs = ((InternalEObject)rest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SCULPTOR_CONFIG__REST, null, msgs);
			if (newRest != null)
				msgs = ((InternalEObject)newRest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SCULPTOR_CONFIG__REST, null, msgs);
			msgs = basicSetRest(newRest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__REST, newRest, newRest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerateOptions getGenerate() {
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerate(GenerateOptions newGenerate, NotificationChain msgs) {
		GenerateOptions oldGenerate = generate;
		generate = newGenerate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__GENERATE, oldGenerate, newGenerate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate(GenerateOptions newGenerate) {
		if (newGenerate != generate) {
			NotificationChain msgs = null;
			if (generate != null)
				msgs = ((InternalEObject)generate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SCULPTOR_CONFIG__GENERATE, null, msgs);
			if (newGenerate != null)
				msgs = ((InternalEObject)newGenerate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SCULPTOR_CONFIG__GENERATE, null, msgs);
			msgs = basicSetGenerate(newGenerate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SCULPTOR_CONFIG__GENERATE, newGenerate, newGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CascadeOptions> getCascade() {
		if (cascade == null) {
			cascade = new EObjectContainmentEList<CascadeOptions>(CascadeOptions.class, this, ConfigurationPackage.SCULPTOR_CONFIG__CASCADE);
		}
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatabaseOptions> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<DatabaseOptions>(DatabaseOptions.class, this, ConfigurationPackage.SCULPTOR_CONFIG__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JPAOptions> getJpa() {
		if (jpa == null) {
			jpa = new EObjectContainmentEList<JPAOptions>(JPAOptions.class, this, ConfigurationPackage.SCULPTOR_CONFIG__JPA);
		}
		return jpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeploymentOptions> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentEList<DeploymentOptions>(DeploymentOptions.class, this, ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT);
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HibernateType> getHibernatetypes() {
		if (hibernatetypes == null) {
			hibernatetypes = new EObjectContainmentEList<HibernateType>(HibernateType.class, this, ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES);
		}
		return hibernatetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JavaType> getJavatypes() {
		if (javatypes == null) {
			javatypes = new EObjectContainmentEList<JavaType>(JavaType.class, this, ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES);
		}
		return javatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageName> getPackagenames() {
		if (packagenames == null) {
			packagenames = new EObjectContainmentEList<PackageName>(PackageName.class, this, ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES);
		}
		return packagenames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefaultBaseClassName> getDefaultbaseclassnames() {
		if (defaultbaseclassnames == null) {
			defaultbaseclassnames = new EObjectContainmentEList<DefaultBaseClassName>(DefaultBaseClassName.class, this, ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES);
		}
		return defaultbaseclassnames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK:
				return basicSetFramework(null, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__REST:
				return basicSetRest(null, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__GENERATE:
				return basicSetGenerate(null, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__CASCADE:
				return ((InternalEList<?>)getCascade()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__JPA:
				return ((InternalEList<?>)getJpa()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES:
				return ((InternalEList<?>)getHibernatetypes()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES:
				return ((InternalEList<?>)getJavatypes()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES:
				return ((InternalEList<?>)getPackagenames()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES:
				return ((InternalEList<?>)getDefaultbaseclassnames()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.SCULPTOR_CONFIG__CARTRIDGES:
				return getCartridges();
			case ConfigurationPackage.SCULPTOR_CONFIG__PROJECT_NATURE:
				return getProject_nature();
			case ConfigurationPackage.SCULPTOR_CONFIG__ID_TYPE:
				return getId_type();
			case ConfigurationPackage.SCULPTOR_CONFIG__DATETIME_LIBRARY:
				return getDatetime_library();
			case ConfigurationPackage.SCULPTOR_CONFIG__TO_STRING_STYLE:
				return getToStringStyle();
			case ConfigurationPackage.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS:
				return getScaffold_operations();
			case ConfigurationPackage.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES:
				return isCheck_cyclicDependencies();
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_ALL_PAGING:
				return getFindAll_paging();
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING:
				return getFindByCondition_paging();
			case ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK:
				return getFramework();
			case ConfigurationPackage.SCULPTOR_CONFIG__REST:
				return getRest();
			case ConfigurationPackage.SCULPTOR_CONFIG__GENERATE:
				return getGenerate();
			case ConfigurationPackage.SCULPTOR_CONFIG__CASCADE:
				return getCascade();
			case ConfigurationPackage.SCULPTOR_CONFIG__DATABASE:
				return getDatabase();
			case ConfigurationPackage.SCULPTOR_CONFIG__JPA:
				return getJpa();
			case ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT:
				return getDeployment();
			case ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES:
				return getHibernatetypes();
			case ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES:
				return getJavatypes();
			case ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES:
				return getPackagenames();
			case ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES:
				return getDefaultbaseclassnames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.SCULPTOR_CONFIG__CARTRIDGES:
				setCartridges((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__PROJECT_NATURE:
				setProject_nature((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__ID_TYPE:
				setId_type((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DATETIME_LIBRARY:
				setDatetime_library((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__TO_STRING_STYLE:
				setToStringStyle((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS:
				setScaffold_operations((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES:
				setCheck_cyclicDependencies((Boolean)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_ALL_PAGING:
				setFindAll_paging((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING:
				setFindByCondition_paging((String)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK:
				setFramework((FrameworkOptions)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__REST:
				setRest((RESTOptions)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__GENERATE:
				setGenerate((GenerateOptions)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__CASCADE:
				getCascade().clear();
				getCascade().addAll((Collection<? extends CascadeOptions>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends DatabaseOptions>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__JPA:
				getJpa().clear();
				getJpa().addAll((Collection<? extends JPAOptions>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends DeploymentOptions>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES:
				getHibernatetypes().clear();
				getHibernatetypes().addAll((Collection<? extends HibernateType>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES:
				getJavatypes().clear();
				getJavatypes().addAll((Collection<? extends JavaType>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES:
				getPackagenames().clear();
				getPackagenames().addAll((Collection<? extends PackageName>)newValue);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES:
				getDefaultbaseclassnames().clear();
				getDefaultbaseclassnames().addAll((Collection<? extends DefaultBaseClassName>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.SCULPTOR_CONFIG__CARTRIDGES:
				setCartridges(CARTRIDGES_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__PROJECT_NATURE:
				setProject_nature(PROJECT_NATURE_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__ID_TYPE:
				setId_type(ID_TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DATETIME_LIBRARY:
				setDatetime_library(DATETIME_LIBRARY_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__TO_STRING_STYLE:
				setToStringStyle(TO_STRING_STYLE_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS:
				setScaffold_operations(SCAFFOLD_OPERATIONS_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES:
				setCheck_cyclicDependencies(CHECK_CYCLIC_DEPENDENCIES_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_ALL_PAGING:
				setFindAll_paging(FIND_ALL_PAGING_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING:
				setFindByCondition_paging(FIND_BY_CONDITION_PAGING_EDEFAULT);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK:
				setFramework((FrameworkOptions)null);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__REST:
				setRest((RESTOptions)null);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__GENERATE:
				setGenerate((GenerateOptions)null);
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__CASCADE:
				getCascade().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DATABASE:
				getDatabase().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__JPA:
				getJpa().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT:
				getDeployment().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES:
				getHibernatetypes().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES:
				getJavatypes().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES:
				getPackagenames().clear();
				return;
			case ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES:
				getDefaultbaseclassnames().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.SCULPTOR_CONFIG__CARTRIDGES:
				return CARTRIDGES_EDEFAULT == null ? cartridges != null : !CARTRIDGES_EDEFAULT.equals(cartridges);
			case ConfigurationPackage.SCULPTOR_CONFIG__PROJECT_NATURE:
				return PROJECT_NATURE_EDEFAULT == null ? project_nature != null : !PROJECT_NATURE_EDEFAULT.equals(project_nature);
			case ConfigurationPackage.SCULPTOR_CONFIG__ID_TYPE:
				return ID_TYPE_EDEFAULT == null ? id_type != null : !ID_TYPE_EDEFAULT.equals(id_type);
			case ConfigurationPackage.SCULPTOR_CONFIG__DATETIME_LIBRARY:
				return DATETIME_LIBRARY_EDEFAULT == null ? datetime_library != null : !DATETIME_LIBRARY_EDEFAULT.equals(datetime_library);
			case ConfigurationPackage.SCULPTOR_CONFIG__TO_STRING_STYLE:
				return TO_STRING_STYLE_EDEFAULT == null ? toStringStyle != null : !TO_STRING_STYLE_EDEFAULT.equals(toStringStyle);
			case ConfigurationPackage.SCULPTOR_CONFIG__SCAFFOLD_OPERATIONS:
				return SCAFFOLD_OPERATIONS_EDEFAULT == null ? scaffold_operations != null : !SCAFFOLD_OPERATIONS_EDEFAULT.equals(scaffold_operations);
			case ConfigurationPackage.SCULPTOR_CONFIG__CHECK_CYCLIC_DEPENDENCIES:
				return check_cyclicDependencies != CHECK_CYCLIC_DEPENDENCIES_EDEFAULT;
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_ALL_PAGING:
				return FIND_ALL_PAGING_EDEFAULT == null ? findAll_paging != null : !FIND_ALL_PAGING_EDEFAULT.equals(findAll_paging);
			case ConfigurationPackage.SCULPTOR_CONFIG__FIND_BY_CONDITION_PAGING:
				return FIND_BY_CONDITION_PAGING_EDEFAULT == null ? findByCondition_paging != null : !FIND_BY_CONDITION_PAGING_EDEFAULT.equals(findByCondition_paging);
			case ConfigurationPackage.SCULPTOR_CONFIG__FRAMEWORK:
				return framework != null;
			case ConfigurationPackage.SCULPTOR_CONFIG__REST:
				return rest != null;
			case ConfigurationPackage.SCULPTOR_CONFIG__GENERATE:
				return generate != null;
			case ConfigurationPackage.SCULPTOR_CONFIG__CASCADE:
				return cascade != null && !cascade.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__DATABASE:
				return database != null && !database.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__JPA:
				return jpa != null && !jpa.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__HIBERNATETYPES:
				return hibernatetypes != null && !hibernatetypes.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__JAVATYPES:
				return javatypes != null && !javatypes.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__PACKAGENAMES:
				return packagenames != null && !packagenames.isEmpty();
			case ConfigurationPackage.SCULPTOR_CONFIG__DEFAULTBASECLASSNAMES:
				return defaultbaseclassnames != null && !defaultbaseclassnames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cartridges: ");
		result.append(cartridges);
		result.append(", project_nature: ");
		result.append(project_nature);
		result.append(", id_type: ");
		result.append(id_type);
		result.append(", datetime_library: ");
		result.append(datetime_library);
		result.append(", toStringStyle: ");
		result.append(toStringStyle);
		result.append(", scaffold_operations: ");
		result.append(scaffold_operations);
		result.append(", check_cyclicDependencies: ");
		result.append(check_cyclicDependencies);
		result.append(", findAll_paging: ");
		result.append(findAll_paging);
		result.append(", findByCondition_paging: ");
		result.append(findByCondition_paging);
		result.append(')');
		return result.toString();
	}

} //SculptorConfigImpl
