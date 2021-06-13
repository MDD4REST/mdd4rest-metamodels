/**
 */
package openapi2.impl;

import java.util.Collection;

import openapi2.API;
import openapi2.ContainedCollections;
import openapi2.Info;
import openapi2.Openapi2Package;
import openapi2.Operation;
import openapi2.Parameter;
import openapi2.Path;
import openapi2.Response;
import openapi2.Schema;
import openapi2.SchemeType;
import openapi2.SecurityContainer;
import openapi2.SecurityRequirement;
import openapi2.SecurityScheme;
import openapi2.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openapi2.impl.APIImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getHost <em>Host</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link openapi2.impl.APIImpl#getContainedCollections <em>Contained Collections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIImpl extends ExternalDocsContainerImpl implements API {
	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRequirement> security;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Info info;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemeType> schemes;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consumes;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> produces;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Schema> definitions;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Response> responses;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, SecurityScheme> securityDefinitions;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Parameter> parameters;

	/**
	 * The cached value of the '{@link #getContainedCollections() <em>Contained Collections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCollections()
	 * @generated
	 * @ordered
	 */
	protected ContainedCollections containedCollections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi2Package.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, Openapi2Package.API__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Info getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs) {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.API__INFO, oldInfo, newInfo);
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
	public void setInfo(Info newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.API__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.API__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.API__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.API__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.API__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, Openapi2Package.API__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, Openapi2Package.API__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProduces() {
		if (produces == null) {
			produces = new EDataTypeUniqueEList<String>(String.class, this, Openapi2Package.API__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentWithInverseEList.Unsettable<Path>(Path.class, this, Openapi2Package.API__PATHS, Openapi2Package.PATH__API);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPaths() {
		if (paths != null) ((InternalEList.Unsettable<?>)paths).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPaths() {
		return paths != null && ((InternalEList.Unsettable<?>)paths).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Schema> getDefinitions() {
		if (definitions == null) {
			definitions = new EcoreEMap<String,Schema>(Openapi2Package.Literals.SCHEMA_ENTRY, SchemaEntryImpl.class, this, Openapi2Package.API__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Response> getResponses() {
		if (responses == null) {
			responses = new EcoreEMap<String,Response>(Openapi2Package.Literals.RESPONSE_DEFINITION_ENTRY, ResponseDefinitionEntryImpl.class, this, Openapi2Package.API__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, SecurityScheme> getSecurityDefinitions() {
		if (securityDefinitions == null) {
			securityDefinitions = new EcoreEMap<String,SecurityScheme>(Openapi2Package.Literals.SECURITY_SCHEME_ENTRY, SecuritySchemeEntryImpl.class, this, Openapi2Package.API__SECURITY_DEFINITIONS);
		}
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, Openapi2Package.API__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,Parameter>(Openapi2Package.Literals.PARAMETER_ENTRY, ParameterEntryImpl.class, this, Openapi2Package.API__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainedCollections getContainedCollections() {
		return containedCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedCollections(ContainedCollections newContainedCollections, NotificationChain msgs) {
		ContainedCollections oldContainedCollections = containedCollections;
		containedCollections = newContainedCollections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.API__CONTAINED_COLLECTIONS, oldContainedCollections, newContainedCollections);
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
	public void setContainedCollections(ContainedCollections newContainedCollections) {
		if (newContainedCollections != containedCollections) {
			NotificationChain msgs = null;
			if (containedCollections != null)
				msgs = ((InternalEObject)containedCollections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.API__CONTAINED_COLLECTIONS, null, msgs);
			if (newContainedCollections != null)
				msgs = ((InternalEObject)newContainedCollections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.API__CONTAINED_COLLECTIONS, null, msgs);
			msgs = basicSetContainedCollections(newContainedCollections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.API__CONTAINED_COLLECTIONS, newContainedCollections, newContainedCollections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getAllOperations() {
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
	public Schema getSchemaByReference(String ref) {
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
	public Operation getOperationById(String operationId) {
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
	public Path getPathByRelativePath(String relativePath) {
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
	public Parameter getParameterByReference(String ref) {
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
	public Response getResponseDefinitionByReference(String ref) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi2Package.API__PATHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaths()).basicAdd(otherEnd, msgs);
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
			case Openapi2Package.API__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__INFO:
				return basicSetInfo(null, msgs);
			case Openapi2Package.API__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__SECURITY_DEFINITIONS:
				return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Openapi2Package.API__CONTAINED_COLLECTIONS:
				return basicSetContainedCollections(null, msgs);
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
			case Openapi2Package.API__SECURITY:
				return getSecurity();
			case Openapi2Package.API__INFO:
				return getInfo();
			case Openapi2Package.API__HOST:
				return getHost();
			case Openapi2Package.API__BASE_PATH:
				return getBasePath();
			case Openapi2Package.API__SCHEMES:
				return getSchemes();
			case Openapi2Package.API__CONSUMES:
				return getConsumes();
			case Openapi2Package.API__PRODUCES:
				return getProduces();
			case Openapi2Package.API__PATHS:
				return getPaths();
			case Openapi2Package.API__DEFINITIONS:
				if (coreType) return getDefinitions();
				else return getDefinitions().map();
			case Openapi2Package.API__RESPONSES:
				if (coreType) return getResponses();
				else return getResponses().map();
			case Openapi2Package.API__SECURITY_DEFINITIONS:
				if (coreType) return getSecurityDefinitions();
				else return getSecurityDefinitions().map();
			case Openapi2Package.API__TAGS:
				return getTags();
			case Openapi2Package.API__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case Openapi2Package.API__CONTAINED_COLLECTIONS:
				return getContainedCollections();
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
			case Openapi2Package.API__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityRequirement>)newValue);
				return;
			case Openapi2Package.API__INFO:
				setInfo((Info)newValue);
				return;
			case Openapi2Package.API__HOST:
				setHost((String)newValue);
				return;
			case Openapi2Package.API__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case Openapi2Package.API__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case Openapi2Package.API__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case Openapi2Package.API__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case Openapi2Package.API__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
				return;
			case Openapi2Package.API__DEFINITIONS:
				((EStructuralFeature.Setting)getDefinitions()).set(newValue);
				return;
			case Openapi2Package.API__RESPONSES:
				((EStructuralFeature.Setting)getResponses()).set(newValue);
				return;
			case Openapi2Package.API__SECURITY_DEFINITIONS:
				((EStructuralFeature.Setting)getSecurityDefinitions()).set(newValue);
				return;
			case Openapi2Package.API__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case Openapi2Package.API__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case Openapi2Package.API__CONTAINED_COLLECTIONS:
				setContainedCollections((ContainedCollections)newValue);
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
			case Openapi2Package.API__SECURITY:
				getSecurity().clear();
				return;
			case Openapi2Package.API__INFO:
				setInfo((Info)null);
				return;
			case Openapi2Package.API__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case Openapi2Package.API__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case Openapi2Package.API__SCHEMES:
				getSchemes().clear();
				return;
			case Openapi2Package.API__CONSUMES:
				getConsumes().clear();
				return;
			case Openapi2Package.API__PRODUCES:
				getProduces().clear();
				return;
			case Openapi2Package.API__PATHS:
				unsetPaths();
				return;
			case Openapi2Package.API__DEFINITIONS:
				getDefinitions().clear();
				return;
			case Openapi2Package.API__RESPONSES:
				getResponses().clear();
				return;
			case Openapi2Package.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				return;
			case Openapi2Package.API__TAGS:
				getTags().clear();
				return;
			case Openapi2Package.API__PARAMETERS:
				getParameters().clear();
				return;
			case Openapi2Package.API__CONTAINED_COLLECTIONS:
				setContainedCollections((ContainedCollections)null);
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
			case Openapi2Package.API__SECURITY:
				return security != null && !security.isEmpty();
			case Openapi2Package.API__INFO:
				return info != null;
			case Openapi2Package.API__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case Openapi2Package.API__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case Openapi2Package.API__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case Openapi2Package.API__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case Openapi2Package.API__PRODUCES:
				return produces != null && !produces.isEmpty();
			case Openapi2Package.API__PATHS:
				return isSetPaths();
			case Openapi2Package.API__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case Openapi2Package.API__RESPONSES:
				return responses != null && !responses.isEmpty();
			case Openapi2Package.API__SECURITY_DEFINITIONS:
				return securityDefinitions != null && !securityDefinitions.isEmpty();
			case Openapi2Package.API__TAGS:
				return tags != null && !tags.isEmpty();
			case Openapi2Package.API__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Openapi2Package.API__CONTAINED_COLLECTIONS:
				return containedCollections != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SecurityContainer.class) {
			switch (derivedFeatureID) {
				case Openapi2Package.API__SECURITY: return Openapi2Package.SECURITY_CONTAINER__SECURITY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SecurityContainer.class) {
			switch (baseFeatureID) {
				case Openapi2Package.SECURITY_CONTAINER__SECURITY: return Openapi2Package.API__SECURITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (host: ");
		result.append(host);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", produces: ");
		result.append(produces);
		result.append(')');
		return result.toString();
	}

} //APIImpl
