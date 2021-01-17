/**
 */
package com.github.icelyframework.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.RESTOptions#getSpring_remoting_type <em>Spring remoting type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.RESTOptions#getRest_default_path <em>Rest default path</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.RESTOptions#getRest_default_httpMethod <em>Rest default http Method</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.RESTOptions#isGenerate_resource <em>Generate resource</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.RESTOptions#isGenerate_restWeb <em>Generate rest Web</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.configuration.ConfigurationPackage#getRESTOptions()
 * @model
 * @generated
 */
public interface RESTOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Spring remoting type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring remoting type</em>' attribute.
	 * @see #setSpring_remoting_type(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getRESTOptions_Spring_remoting_type()
	 * @model
	 * @generated
	 */
	String getSpring_remoting_type();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.RESTOptions#getSpring_remoting_type <em>Spring remoting type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring remoting type</em>' attribute.
	 * @see #getSpring_remoting_type()
	 * @generated
	 */
	void setSpring_remoting_type(String value);

	/**
	 * Returns the value of the '<em><b>Rest default path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest default path</em>' attribute.
	 * @see #setRest_default_path(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getRESTOptions_Rest_default_path()
	 * @model
	 * @generated
	 */
	String getRest_default_path();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.RESTOptions#getRest_default_path <em>Rest default path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest default path</em>' attribute.
	 * @see #getRest_default_path()
	 * @generated
	 */
	void setRest_default_path(String value);

	/**
	 * Returns the value of the '<em><b>Rest default http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest default http Method</em>' attribute.
	 * @see #setRest_default_httpMethod(String)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getRESTOptions_Rest_default_httpMethod()
	 * @model
	 * @generated
	 */
	String getRest_default_httpMethod();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.RESTOptions#getRest_default_httpMethod <em>Rest default http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest default http Method</em>' attribute.
	 * @see #getRest_default_httpMethod()
	 * @generated
	 */
	void setRest_default_httpMethod(String value);

	/**
	 * Returns the value of the '<em><b>Generate resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate resource</em>' attribute.
	 * @see #setGenerate_resource(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getRESTOptions_Generate_resource()
	 * @model
	 * @generated
	 */
	boolean isGenerate_resource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.RESTOptions#isGenerate_resource <em>Generate resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate resource</em>' attribute.
	 * @see #isGenerate_resource()
	 * @generated
	 */
	void setGenerate_resource(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate rest Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate rest Web</em>' attribute.
	 * @see #setGenerate_restWeb(boolean)
	 * @see com.github.icelyframework.configuration.ConfigurationPackage#getRESTOptions_Generate_restWeb()
	 * @model
	 * @generated
	 */
	boolean isGenerate_restWeb();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.configuration.RESTOptions#isGenerate_restWeb <em>Generate rest Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate rest Web</em>' attribute.
	 * @see #isGenerate_restWeb()
	 * @generated
	 */
	void setGenerate_restWeb(boolean value);

} // RESTOptions
