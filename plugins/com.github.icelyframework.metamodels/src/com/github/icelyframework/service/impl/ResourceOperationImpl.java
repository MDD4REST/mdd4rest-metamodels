/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.HttpMethod;
import com.github.icelyframework.service.Path;
import com.github.icelyframework.service.Resource;
import com.github.icelyframework.service.ResourceOperation;
import com.github.icelyframework.service.ResourceParam;
import com.github.icelyframework.service.ServiceOperation;
import com.github.icelyframework.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getReturnString <em>Return String</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceOperationImpl#getResourceParams <em>Resource Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceOperationImpl extends OperationImpl implements ResourceOperation {
	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod HTTP_METHOD_EDEFAULT = HttpMethod.UNDEFINED;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation delegate;

	/**
	 * The default value of the '{@link #getReturnString() <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnString()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnString() <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnString()
	 * @generated
	 * @ordered
	 */
	protected String returnString = RETURN_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected Path path;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceParams() <em>Resource Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceParam> resourceParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.RESOURCE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getResource() {
		if (eContainerFeatureID() != ServicePackage.RESOURCE_OPERATION__RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, ServicePackage.RESOURCE_OPERATION__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(Resource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != ServicePackage.RESOURCE_OPERATION__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, ServicePackage.RESOURCE__OPERATIONS, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpMethod(HttpMethod newHttpMethod) {
		HttpMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__HTTP_METHOD, oldHttpMethod, httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOperation getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (ServiceOperation)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.RESOURCE_OPERATION__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegate(ServiceOperation newDelegate) {
		ServiceOperation oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnString() {
		return returnString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnString(String newReturnString) {
		String oldReturnString = returnString;
		returnString = newReturnString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__RETURN_STRING, oldReturnString, returnString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Path newPath, NotificationChain msgs) {
		Path oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__PATH, oldPath, newPath);
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
	public void setPath(Path newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE_OPERATION__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE_OPERATION__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE_OPERATION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceParam> getResourceParams() {
		if (resourceParams == null) {
			resourceParams = new EObjectContainmentEList<ResourceParam>(ResourceParam.class, this, ServicePackage.RESOURCE_OPERATION__RESOURCE_PARAMS);
		}
		return resourceParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((Resource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				return basicSetResource(null, msgs);
			case ServicePackage.RESOURCE_OPERATION__PATH:
				return basicSetPath(null, msgs);
			case ServicePackage.RESOURCE_OPERATION__RESOURCE_PARAMS:
				return ((InternalEList<?>)getResourceParams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				return eInternalContainer().eInverseRemove(this, ServicePackage.RESOURCE__OPERATIONS, Resource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				return getResource();
			case ServicePackage.RESOURCE_OPERATION__HTTP_METHOD:
				return getHttpMethod();
			case ServicePackage.RESOURCE_OPERATION__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
			case ServicePackage.RESOURCE_OPERATION__RETURN_STRING:
				return getReturnString();
			case ServicePackage.RESOURCE_OPERATION__PATH:
				return getPath();
			case ServicePackage.RESOURCE_OPERATION__CONTENT_TYPE:
				return getContentType();
			case ServicePackage.RESOURCE_OPERATION__RESOURCE_PARAMS:
				return getResourceParams();
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
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				setResource((Resource)newValue);
				return;
			case ServicePackage.RESOURCE_OPERATION__HTTP_METHOD:
				setHttpMethod((HttpMethod)newValue);
				return;
			case ServicePackage.RESOURCE_OPERATION__DELEGATE:
				setDelegate((ServiceOperation)newValue);
				return;
			case ServicePackage.RESOURCE_OPERATION__RETURN_STRING:
				setReturnString((String)newValue);
				return;
			case ServicePackage.RESOURCE_OPERATION__PATH:
				setPath((Path)newValue);
				return;
			case ServicePackage.RESOURCE_OPERATION__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case ServicePackage.RESOURCE_OPERATION__RESOURCE_PARAMS:
				getResourceParams().clear();
				getResourceParams().addAll((Collection<? extends ResourceParam>)newValue);
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
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				setResource((Resource)null);
				return;
			case ServicePackage.RESOURCE_OPERATION__HTTP_METHOD:
				setHttpMethod(HTTP_METHOD_EDEFAULT);
				return;
			case ServicePackage.RESOURCE_OPERATION__DELEGATE:
				setDelegate((ServiceOperation)null);
				return;
			case ServicePackage.RESOURCE_OPERATION__RETURN_STRING:
				setReturnString(RETURN_STRING_EDEFAULT);
				return;
			case ServicePackage.RESOURCE_OPERATION__PATH:
				setPath((Path)null);
				return;
			case ServicePackage.RESOURCE_OPERATION__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case ServicePackage.RESOURCE_OPERATION__RESOURCE_PARAMS:
				getResourceParams().clear();
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
			case ServicePackage.RESOURCE_OPERATION__RESOURCE:
				return getResource() != null;
			case ServicePackage.RESOURCE_OPERATION__HTTP_METHOD:
				return httpMethod != HTTP_METHOD_EDEFAULT;
			case ServicePackage.RESOURCE_OPERATION__DELEGATE:
				return delegate != null;
			case ServicePackage.RESOURCE_OPERATION__RETURN_STRING:
				return RETURN_STRING_EDEFAULT == null ? returnString != null : !RETURN_STRING_EDEFAULT.equals(returnString);
			case ServicePackage.RESOURCE_OPERATION__PATH:
				return path != null;
			case ServicePackage.RESOURCE_OPERATION__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case ServicePackage.RESOURCE_OPERATION__RESOURCE_PARAMS:
				return resourceParams != null && !resourceParams.isEmpty();
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
		result.append(" (httpMethod: ");
		result.append(httpMethod);
		result.append(", returnString: ");
		result.append(returnString);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(')');
		return result.toString();
	}

} //ResourceOperationImpl
