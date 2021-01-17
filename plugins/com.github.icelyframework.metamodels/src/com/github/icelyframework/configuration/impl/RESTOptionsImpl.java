/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.ConfigurationPackage;
import com.github.icelyframework.configuration.RESTOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl#getSpring_remoting_type <em>Spring remoting type</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl#getRest_default_path <em>Rest default path</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl#getRest_default_httpMethod <em>Rest default http Method</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl#isGenerate_resource <em>Generate resource</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.RESTOptionsImpl#isGenerate_restWeb <em>Generate rest Web</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RESTOptionsImpl extends EObjectImpl implements RESTOptions {
	/**
	 * The default value of the '{@link #getSpring_remoting_type() <em>Spring remoting type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpring_remoting_type()
	 * @generated
	 * @ordered
	 */
	protected static final String SPRING_REMOTING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpring_remoting_type() <em>Spring remoting type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpring_remoting_type()
	 * @generated
	 * @ordered
	 */
	protected String spring_remoting_type = SPRING_REMOTING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRest_default_path() <em>Rest default path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest_default_path()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_DEFAULT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRest_default_path() <em>Rest default path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest_default_path()
	 * @generated
	 * @ordered
	 */
	protected String rest_default_path = REST_DEFAULT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRest_default_httpMethod() <em>Rest default http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest_default_httpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_DEFAULT_HTTP_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRest_default_httpMethod() <em>Rest default http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest_default_httpMethod()
	 * @generated
	 * @ordered
	 */
	protected String rest_default_httpMethod = REST_DEFAULT_HTTP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_resource() <em>Generate resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_resource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_RESOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_resource() <em>Generate resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_resource()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_resource = GENERATE_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerate_restWeb() <em>Generate rest Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_restWeb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_REST_WEB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate_restWeb() <em>Generate rest Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate_restWeb()
	 * @generated
	 * @ordered
	 */
	protected boolean generate_restWeb = GENERATE_REST_WEB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.REST_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpring_remoting_type() {
		return spring_remoting_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpring_remoting_type(String newSpring_remoting_type) {
		String oldSpring_remoting_type = spring_remoting_type;
		spring_remoting_type = newSpring_remoting_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.REST_OPTIONS__SPRING_REMOTING_TYPE, oldSpring_remoting_type, spring_remoting_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRest_default_path() {
		return rest_default_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRest_default_path(String newRest_default_path) {
		String oldRest_default_path = rest_default_path;
		rest_default_path = newRest_default_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_PATH, oldRest_default_path, rest_default_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRest_default_httpMethod() {
		return rest_default_httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRest_default_httpMethod(String newRest_default_httpMethod) {
		String oldRest_default_httpMethod = rest_default_httpMethod;
		rest_default_httpMethod = newRest_default_httpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_HTTP_METHOD, oldRest_default_httpMethod, rest_default_httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_resource() {
		return generate_resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_resource(boolean newGenerate_resource) {
		boolean oldGenerate_resource = generate_resource;
		generate_resource = newGenerate_resource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.REST_OPTIONS__GENERATE_RESOURCE, oldGenerate_resource, generate_resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate_restWeb() {
		return generate_restWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate_restWeb(boolean newGenerate_restWeb) {
		boolean oldGenerate_restWeb = generate_restWeb;
		generate_restWeb = newGenerate_restWeb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.REST_OPTIONS__GENERATE_REST_WEB, oldGenerate_restWeb, generate_restWeb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.REST_OPTIONS__SPRING_REMOTING_TYPE:
				return getSpring_remoting_type();
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_PATH:
				return getRest_default_path();
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_HTTP_METHOD:
				return getRest_default_httpMethod();
			case ConfigurationPackage.REST_OPTIONS__GENERATE_RESOURCE:
				return isGenerate_resource();
			case ConfigurationPackage.REST_OPTIONS__GENERATE_REST_WEB:
				return isGenerate_restWeb();
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
			case ConfigurationPackage.REST_OPTIONS__SPRING_REMOTING_TYPE:
				setSpring_remoting_type((String)newValue);
				return;
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_PATH:
				setRest_default_path((String)newValue);
				return;
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_HTTP_METHOD:
				setRest_default_httpMethod((String)newValue);
				return;
			case ConfigurationPackage.REST_OPTIONS__GENERATE_RESOURCE:
				setGenerate_resource((Boolean)newValue);
				return;
			case ConfigurationPackage.REST_OPTIONS__GENERATE_REST_WEB:
				setGenerate_restWeb((Boolean)newValue);
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
			case ConfigurationPackage.REST_OPTIONS__SPRING_REMOTING_TYPE:
				setSpring_remoting_type(SPRING_REMOTING_TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_PATH:
				setRest_default_path(REST_DEFAULT_PATH_EDEFAULT);
				return;
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_HTTP_METHOD:
				setRest_default_httpMethod(REST_DEFAULT_HTTP_METHOD_EDEFAULT);
				return;
			case ConfigurationPackage.REST_OPTIONS__GENERATE_RESOURCE:
				setGenerate_resource(GENERATE_RESOURCE_EDEFAULT);
				return;
			case ConfigurationPackage.REST_OPTIONS__GENERATE_REST_WEB:
				setGenerate_restWeb(GENERATE_REST_WEB_EDEFAULT);
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
			case ConfigurationPackage.REST_OPTIONS__SPRING_REMOTING_TYPE:
				return SPRING_REMOTING_TYPE_EDEFAULT == null ? spring_remoting_type != null : !SPRING_REMOTING_TYPE_EDEFAULT.equals(spring_remoting_type);
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_PATH:
				return REST_DEFAULT_PATH_EDEFAULT == null ? rest_default_path != null : !REST_DEFAULT_PATH_EDEFAULT.equals(rest_default_path);
			case ConfigurationPackage.REST_OPTIONS__REST_DEFAULT_HTTP_METHOD:
				return REST_DEFAULT_HTTP_METHOD_EDEFAULT == null ? rest_default_httpMethod != null : !REST_DEFAULT_HTTP_METHOD_EDEFAULT.equals(rest_default_httpMethod);
			case ConfigurationPackage.REST_OPTIONS__GENERATE_RESOURCE:
				return generate_resource != GENERATE_RESOURCE_EDEFAULT;
			case ConfigurationPackage.REST_OPTIONS__GENERATE_REST_WEB:
				return generate_restWeb != GENERATE_REST_WEB_EDEFAULT;
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
		result.append(" (spring_remoting_type: ");
		result.append(spring_remoting_type);
		result.append(", rest_default_path: ");
		result.append(rest_default_path);
		result.append(", rest_default_httpMethod: ");
		result.append(rest_default_httpMethod);
		result.append(", generate_resource: ");
		result.append(generate_resource);
		result.append(", generate_restWeb: ");
		result.append(generate_restWeb);
		result.append(')');
		return result.toString();
	}

} //RESTOptionsImpl
