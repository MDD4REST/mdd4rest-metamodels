/**
 */
package openapi2.impl;

import java.util.Collection;

import openapi2.API;
import openapi2.Openapi2Package;
import openapi2.Operation;
import openapi2.Parameter;
import openapi2.Path;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openapi2.impl.PathImpl#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getGet <em>Get</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getPut <em>Put</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getPost <em>Post</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getHead <em>Head</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getPatch <em>Patch</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getApi <em>Api</em>}</li>
 *   <li>{@link openapi2.impl.PathImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends ParameterContainerImpl implements Path {
	/**
	 * The default value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected String relativePath = RELATIVE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGet() <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGet()
	 * @generated
	 * @ordered
	 */
	protected Operation get;

	/**
	 * The cached value of the '{@link #getPut() <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPut()
	 * @generated
	 * @ordered
	 */
	protected Operation put;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected Operation post;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected Operation delete;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Operation options;

	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Operation head;

	/**
	 * The cached value of the '{@link #getPatch() <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatch()
	 * @generated
	 * @ordered
	 */
	protected Operation patch;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi2Package.Literals.PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePath(String newRelativePath) {
		String oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__RELATIVE_PATH, oldRelativePath, relativePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getGet() {
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGet(Operation newGet, NotificationChain msgs) {
		Operation oldGet = get;
		get = newGet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__GET, oldGet, newGet);
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
	public void setGet(Operation newGet) {
		if (newGet != get) {
			NotificationChain msgs = null;
			if (get != null)
				msgs = ((InternalEObject)get).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__GET, null, msgs);
			if (newGet != null)
				msgs = ((InternalEObject)newGet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__GET, null, msgs);
			msgs = basicSetGet(newGet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__GET, newGet, newGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getPut() {
		return put;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPut(Operation newPut, NotificationChain msgs) {
		Operation oldPut = put;
		put = newPut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__PUT, oldPut, newPut);
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
	public void setPut(Operation newPut) {
		if (newPut != put) {
			NotificationChain msgs = null;
			if (put != null)
				msgs = ((InternalEObject)put).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__PUT, null, msgs);
			if (newPut != null)
				msgs = ((InternalEObject)newPut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__PUT, null, msgs);
			msgs = basicSetPut(newPut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__PUT, newPut, newPut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(Operation newPost, NotificationChain msgs) {
		Operation oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__POST, oldPost, newPost);
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
	public void setPost(Operation newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(Operation newDelete, NotificationChain msgs) {
		Operation oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__DELETE, oldDelete, newDelete);
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
	public void setDelete(Operation newDelete) {
		if (newDelete != delete) {
			NotificationChain msgs = null;
			if (delete != null)
				msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__DELETE, null, msgs);
			if (newDelete != null)
				msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__DELETE, null, msgs);
			msgs = basicSetDelete(newDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__DELETE, newDelete, newDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Operation newOptions, NotificationChain msgs) {
		Operation oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__OPTIONS, oldOptions, newOptions);
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
	public void setOptions(Operation newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Operation newHead, NotificationChain msgs) {
		Operation oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__HEAD, oldHead, newHead);
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
	public void setHead(Operation newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getPatch() {
		return patch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatch(Operation newPatch, NotificationChain msgs) {
		Operation oldPatch = patch;
		patch = newPatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__PATCH, oldPatch, newPatch);
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
	public void setPatch(Operation newPatch) {
		if (newPatch != patch) {
			NotificationChain msgs = null;
			if (patch != null)
				msgs = ((InternalEObject)patch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__PATCH, null, msgs);
			if (newPatch != null)
				msgs = ((InternalEObject)newPatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PATH__PATCH, null, msgs);
			msgs = basicSetPatch(newPatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__PATCH, newPatch, newPatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public API getApi() {
		if (eContainerFeatureID() != Openapi2Package.PATH__API) return null;
		return (API)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApi, Openapi2Package.PATH__API, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApi(API newApi) {
		if (newApi != eInternalContainer() || (eContainerFeatureID() != Openapi2Package.PATH__API && newApi != null)) {
			if (EcoreUtil.isAncestor(this, newApi))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, Openapi2Package.API__PATHS, API.class, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PATH__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, Openapi2Package.PATH__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperationByHTTPMethod(String method) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi2Package.PATH__API:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApi((API)otherEnd, msgs);
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
			case Openapi2Package.PATH__GET:
				return basicSetGet(null, msgs);
			case Openapi2Package.PATH__PUT:
				return basicSetPut(null, msgs);
			case Openapi2Package.PATH__POST:
				return basicSetPost(null, msgs);
			case Openapi2Package.PATH__DELETE:
				return basicSetDelete(null, msgs);
			case Openapi2Package.PATH__OPTIONS:
				return basicSetOptions(null, msgs);
			case Openapi2Package.PATH__HEAD:
				return basicSetHead(null, msgs);
			case Openapi2Package.PATH__PATCH:
				return basicSetPatch(null, msgs);
			case Openapi2Package.PATH__API:
				return basicSetApi(null, msgs);
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
			case Openapi2Package.PATH__API:
				return eInternalContainer().eInverseRemove(this, Openapi2Package.API__PATHS, API.class, msgs);
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
			case Openapi2Package.PATH__RELATIVE_PATH:
				return getRelativePath();
			case Openapi2Package.PATH__GET:
				return getGet();
			case Openapi2Package.PATH__PUT:
				return getPut();
			case Openapi2Package.PATH__POST:
				return getPost();
			case Openapi2Package.PATH__DELETE:
				return getDelete();
			case Openapi2Package.PATH__OPTIONS:
				return getOptions();
			case Openapi2Package.PATH__HEAD:
				return getHead();
			case Openapi2Package.PATH__PATCH:
				return getPatch();
			case Openapi2Package.PATH__API:
				return getApi();
			case Openapi2Package.PATH__PARAMETERS:
				return getParameters();
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
			case Openapi2Package.PATH__RELATIVE_PATH:
				setRelativePath((String)newValue);
				return;
			case Openapi2Package.PATH__GET:
				setGet((Operation)newValue);
				return;
			case Openapi2Package.PATH__PUT:
				setPut((Operation)newValue);
				return;
			case Openapi2Package.PATH__POST:
				setPost((Operation)newValue);
				return;
			case Openapi2Package.PATH__DELETE:
				setDelete((Operation)newValue);
				return;
			case Openapi2Package.PATH__OPTIONS:
				setOptions((Operation)newValue);
				return;
			case Openapi2Package.PATH__HEAD:
				setHead((Operation)newValue);
				return;
			case Openapi2Package.PATH__PATCH:
				setPatch((Operation)newValue);
				return;
			case Openapi2Package.PATH__API:
				setApi((API)newValue);
				return;
			case Openapi2Package.PATH__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case Openapi2Package.PATH__RELATIVE_PATH:
				setRelativePath(RELATIVE_PATH_EDEFAULT);
				return;
			case Openapi2Package.PATH__GET:
				setGet((Operation)null);
				return;
			case Openapi2Package.PATH__PUT:
				setPut((Operation)null);
				return;
			case Openapi2Package.PATH__POST:
				setPost((Operation)null);
				return;
			case Openapi2Package.PATH__DELETE:
				setDelete((Operation)null);
				return;
			case Openapi2Package.PATH__OPTIONS:
				setOptions((Operation)null);
				return;
			case Openapi2Package.PATH__HEAD:
				setHead((Operation)null);
				return;
			case Openapi2Package.PATH__PATCH:
				setPatch((Operation)null);
				return;
			case Openapi2Package.PATH__API:
				setApi((API)null);
				return;
			case Openapi2Package.PATH__PARAMETERS:
				getParameters().clear();
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
			case Openapi2Package.PATH__RELATIVE_PATH:
				return RELATIVE_PATH_EDEFAULT == null ? relativePath != null : !RELATIVE_PATH_EDEFAULT.equals(relativePath);
			case Openapi2Package.PATH__GET:
				return get != null;
			case Openapi2Package.PATH__PUT:
				return put != null;
			case Openapi2Package.PATH__POST:
				return post != null;
			case Openapi2Package.PATH__DELETE:
				return delete != null;
			case Openapi2Package.PATH__OPTIONS:
				return options != null;
			case Openapi2Package.PATH__HEAD:
				return head != null;
			case Openapi2Package.PATH__PATCH:
				return patch != null;
			case Openapi2Package.PATH__API:
				return getApi() != null;
			case Openapi2Package.PATH__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (relativePath: ");
		result.append(relativePath);
		result.append(')');
		return result.toString();
	}

} //PathImpl
