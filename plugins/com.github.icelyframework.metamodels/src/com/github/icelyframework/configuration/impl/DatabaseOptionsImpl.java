/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.DatabaseOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.DatabaseOptionsImpl#isDb_useUnderscoreNaming <em>Db use Underscore Naming</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.DatabaseOptionsImpl#isDb_useIdSuffixInForeigKey <em>Db use Id Suffix In Foreig Key</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.DatabaseOptionsImpl#isDb_useTablePrefixedIdColumn <em>Db use Table Prefixed Id Column</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.DatabaseOptionsImpl#getDb_product <em>Db product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseOptionsImpl extends EObjectImpl implements DatabaseOptions {
	/**
	 * The default value of the '{@link #isDb_useUnderscoreNaming() <em>Db use Underscore Naming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDb_useUnderscoreNaming()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DB_USE_UNDERSCORE_NAMING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDb_useUnderscoreNaming() <em>Db use Underscore Naming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDb_useUnderscoreNaming()
	 * @generated
	 * @ordered
	 */
	protected boolean db_useUnderscoreNaming = DB_USE_UNDERSCORE_NAMING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDb_useIdSuffixInForeigKey() <em>Db use Id Suffix In Foreig Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDb_useIdSuffixInForeigKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DB_USE_ID_SUFFIX_IN_FOREIG_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDb_useIdSuffixInForeigKey() <em>Db use Id Suffix In Foreig Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDb_useIdSuffixInForeigKey()
	 * @generated
	 * @ordered
	 */
	protected boolean db_useIdSuffixInForeigKey = DB_USE_ID_SUFFIX_IN_FOREIG_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDb_useTablePrefixedIdColumn() <em>Db use Table Prefixed Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDb_useTablePrefixedIdColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DB_USE_TABLE_PREFIXED_ID_COLUMN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDb_useTablePrefixedIdColumn() <em>Db use Table Prefixed Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDb_useTablePrefixedIdColumn()
	 * @generated
	 * @ordered
	 */
	protected boolean db_useTablePrefixedIdColumn = DB_USE_TABLE_PREFIXED_ID_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDb_product() <em>Db product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb_product()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDb_product() <em>Db product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb_product()
	 * @generated
	 * @ordered
	 */
	protected String db_product = DB_PRODUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.DATABASE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDb_useUnderscoreNaming() {
		return db_useUnderscoreNaming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDb_useUnderscoreNaming(boolean newDb_useUnderscoreNaming) {
		boolean oldDb_useUnderscoreNaming = db_useUnderscoreNaming;
		db_useUnderscoreNaming = newDb_useUnderscoreNaming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING, oldDb_useUnderscoreNaming, db_useUnderscoreNaming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDb_useIdSuffixInForeigKey() {
		return db_useIdSuffixInForeigKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDb_useIdSuffixInForeigKey(boolean newDb_useIdSuffixInForeigKey) {
		boolean oldDb_useIdSuffixInForeigKey = db_useIdSuffixInForeigKey;
		db_useIdSuffixInForeigKey = newDb_useIdSuffixInForeigKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY, oldDb_useIdSuffixInForeigKey, db_useIdSuffixInForeigKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDb_useTablePrefixedIdColumn() {
		return db_useTablePrefixedIdColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDb_useTablePrefixedIdColumn(boolean newDb_useTablePrefixedIdColumn) {
		boolean oldDb_useTablePrefixedIdColumn = db_useTablePrefixedIdColumn;
		db_useTablePrefixedIdColumn = newDb_useTablePrefixedIdColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN, oldDb_useTablePrefixedIdColumn, db_useTablePrefixedIdColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDb_product() {
		return db_product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDb_product(String newDb_product) {
		String oldDb_product = db_product;
		db_product = newDb_product;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.DATABASE_OPTIONS__DB_PRODUCT, oldDb_product, db_product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING:
				return isDb_useUnderscoreNaming();
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY:
				return isDb_useIdSuffixInForeigKey();
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN:
				return isDb_useTablePrefixedIdColumn();
			case ConfigurationPackage.DATABASE_OPTIONS__DB_PRODUCT:
				return getDb_product();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING:
				setDb_useUnderscoreNaming((Boolean)newValue);
				return;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY:
				setDb_useIdSuffixInForeigKey((Boolean)newValue);
				return;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN:
				setDb_useTablePrefixedIdColumn((Boolean)newValue);
				return;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_PRODUCT:
				setDb_product((String)newValue);
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
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING:
				setDb_useUnderscoreNaming(DB_USE_UNDERSCORE_NAMING_EDEFAULT);
				return;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY:
				setDb_useIdSuffixInForeigKey(DB_USE_ID_SUFFIX_IN_FOREIG_KEY_EDEFAULT);
				return;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN:
				setDb_useTablePrefixedIdColumn(DB_USE_TABLE_PREFIXED_ID_COLUMN_EDEFAULT);
				return;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_PRODUCT:
				setDb_product(DB_PRODUCT_EDEFAULT);
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
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_UNDERSCORE_NAMING:
				return db_useUnderscoreNaming != DB_USE_UNDERSCORE_NAMING_EDEFAULT;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_ID_SUFFIX_IN_FOREIG_KEY:
				return db_useIdSuffixInForeigKey != DB_USE_ID_SUFFIX_IN_FOREIG_KEY_EDEFAULT;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_USE_TABLE_PREFIXED_ID_COLUMN:
				return db_useTablePrefixedIdColumn != DB_USE_TABLE_PREFIXED_ID_COLUMN_EDEFAULT;
			case ConfigurationPackage.DATABASE_OPTIONS__DB_PRODUCT:
				return DB_PRODUCT_EDEFAULT == null ? db_product != null : !DB_PRODUCT_EDEFAULT.equals(db_product);
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
		result.append(" (db_useUnderscoreNaming: ");
		result.append(db_useUnderscoreNaming);
		result.append(", db_useIdSuffixInForeigKey: ");
		result.append(db_useIdSuffixInForeigKey);
		result.append(", db_useTablePrefixedIdColumn: ");
		result.append(db_useTablePrefixedIdColumn);
		result.append(", db_product: ");
		result.append(db_product);
		result.append(')');
		return result.toString();
	}

} //DatabaseOptionsImpl
