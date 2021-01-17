/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useUnderscoreNaming <em>Db use Underscore Naming</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useIdSuffixInForeigKey <em>Db use Id Suffix In Foreig Key</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useTablePrefixedIdColumn <em>Db use Table Prefixed Id Column</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.DatabaseOptions#getDb_product <em>Db product</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDatabaseOptions()
 * @model
 * @generated
 */
public interface DatabaseOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Db use Underscore Naming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db use Underscore Naming</em>' attribute.
	 * @see #setDb_useUnderscoreNaming(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDatabaseOptions_Db_useUnderscoreNaming()
	 * @model
	 * @generated
	 */
	boolean isDb_useUnderscoreNaming();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useUnderscoreNaming <em>Db use Underscore Naming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db use Underscore Naming</em>' attribute.
	 * @see #isDb_useUnderscoreNaming()
	 * @generated
	 */
	void setDb_useUnderscoreNaming(boolean value);

	/**
	 * Returns the value of the '<em><b>Db use Id Suffix In Foreig Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db use Id Suffix In Foreig Key</em>' attribute.
	 * @see #setDb_useIdSuffixInForeigKey(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDatabaseOptions_Db_useIdSuffixInForeigKey()
	 * @model
	 * @generated
	 */
	boolean isDb_useIdSuffixInForeigKey();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useIdSuffixInForeigKey <em>Db use Id Suffix In Foreig Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db use Id Suffix In Foreig Key</em>' attribute.
	 * @see #isDb_useIdSuffixInForeigKey()
	 * @generated
	 */
	void setDb_useIdSuffixInForeigKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Db use Table Prefixed Id Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db use Table Prefixed Id Column</em>' attribute.
	 * @see #setDb_useTablePrefixedIdColumn(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDatabaseOptions_Db_useTablePrefixedIdColumn()
	 * @model
	 * @generated
	 */
	boolean isDb_useTablePrefixedIdColumn();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DatabaseOptions#isDb_useTablePrefixedIdColumn <em>Db use Table Prefixed Id Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db use Table Prefixed Id Column</em>' attribute.
	 * @see #isDb_useTablePrefixedIdColumn()
	 * @generated
	 */
	void setDb_useTablePrefixedIdColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Db product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db product</em>' attribute.
	 * @see #setDb_product(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getDatabaseOptions_Db_product()
	 * @model
	 * @generated
	 */
	String getDb_product();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.DatabaseOptions#getDb_product <em>Db product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db product</em>' attribute.
	 * @see #getDb_product()
	 * @generated
	 */
	void setDb_product(String value);

} // DatabaseOptions
