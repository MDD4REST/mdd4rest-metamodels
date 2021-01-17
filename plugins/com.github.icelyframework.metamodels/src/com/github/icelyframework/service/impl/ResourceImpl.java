/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.InputRepresentation;
import com.github.icelyframework.service.OutputRepresentation;
import com.github.icelyframework.service.Path;
import com.github.icelyframework.service.Permission;
import com.github.icelyframework.service.Resource;
import com.github.icelyframework.service.ResourceOperation;
import com.github.icelyframework.service.Service;
import com.github.icelyframework.service.ServicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getModule <em>Module</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getInputrepresentation <em>Inputrepresentation</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.ResourceImpl#getOutputrepresentation <em>Outputrepresentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceDependencies;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceOperation> operations;

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
	 * The default value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean gapClass = GAP_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * The cached value of the '{@link #getInputrepresentation() <em>Inputrepresentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputrepresentation()
	 * @generated
	 * @ordered
	 */
	protected InputRepresentation inputrepresentation;

	/**
	 * The cached value of the '{@link #getOutputrepresentation() <em>Outputrepresentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputrepresentation()
	 * @generated
	 * @ordered
	 */
	protected OutputRepresentation outputrepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList<Service>(Service.class, this, ServicePackage.RESOURCE__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<ResourceOperation>(ResourceOperation.class, this, ServicePackage.RESOURCE__OPERATIONS, ServicePackage.RESOURCE_OPERATION__RESOURCE);
		}
		return operations;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__PATH, oldPath, newPath);
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
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGapClass() {
		return gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGapClass(boolean newGapClass) {
		boolean oldGapClass = gapClass;
		gapClass = newGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__GAP_CLASS, oldGapClass, gapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.github.icelyframework.service.Module getModule() {
		if (eContainerFeatureID() != ServicePackage.RESOURCE__MODULE) return null;
		return (com.github.icelyframework.service.Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(com.github.icelyframework.service.Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, ServicePackage.RESOURCE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(com.github.icelyframework.service.Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != ServicePackage.RESOURCE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, ServicePackage.MODULE__RESOURCES, com.github.icelyframework.service.Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<Permission>(Permission.class, this, ServicePackage.RESOURCE__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputRepresentation getInputrepresentation() {
		return inputrepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputrepresentation(InputRepresentation newInputrepresentation, NotificationChain msgs) {
		InputRepresentation oldInputrepresentation = inputrepresentation;
		inputrepresentation = newInputrepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__INPUTREPRESENTATION, oldInputrepresentation, newInputrepresentation);
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
	public void setInputrepresentation(InputRepresentation newInputrepresentation) {
		if (newInputrepresentation != inputrepresentation) {
			NotificationChain msgs = null;
			if (inputrepresentation != null)
				msgs = ((InternalEObject)inputrepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE__INPUTREPRESENTATION, null, msgs);
			if (newInputrepresentation != null)
				msgs = ((InternalEObject)newInputrepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE__INPUTREPRESENTATION, null, msgs);
			msgs = basicSetInputrepresentation(newInputrepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__INPUTREPRESENTATION, newInputrepresentation, newInputrepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputRepresentation getOutputrepresentation() {
		return outputrepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputrepresentation(OutputRepresentation newOutputrepresentation, NotificationChain msgs) {
		OutputRepresentation oldOutputrepresentation = outputrepresentation;
		outputrepresentation = newOutputrepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__OUTPUTREPRESENTATION, oldOutputrepresentation, newOutputrepresentation);
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
	public void setOutputrepresentation(OutputRepresentation newOutputrepresentation) {
		if (newOutputrepresentation != outputrepresentation) {
			NotificationChain msgs = null;
			if (outputrepresentation != null)
				msgs = ((InternalEObject)outputrepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE__OUTPUTREPRESENTATION, null, msgs);
			if (newOutputrepresentation != null)
				msgs = ((InternalEObject)newOutputrepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.RESOURCE__OUTPUTREPRESENTATION, null, msgs);
			msgs = basicSetOutputrepresentation(newOutputrepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.RESOURCE__OUTPUTREPRESENTATION, newOutputrepresentation, newOutputrepresentation));
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
			case ServicePackage.RESOURCE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case ServicePackage.RESOURCE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((com.github.icelyframework.service.Module)otherEnd, msgs);
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
			case ServicePackage.RESOURCE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ServicePackage.RESOURCE__PATH:
				return basicSetPath(null, msgs);
			case ServicePackage.RESOURCE__MODULE:
				return basicSetModule(null, msgs);
			case ServicePackage.RESOURCE__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
			case ServicePackage.RESOURCE__INPUTREPRESENTATION:
				return basicSetInputrepresentation(null, msgs);
			case ServicePackage.RESOURCE__OUTPUTREPRESENTATION:
				return basicSetOutputrepresentation(null, msgs);
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
			case ServicePackage.RESOURCE__MODULE:
				return eInternalContainer().eInverseRemove(this, ServicePackage.MODULE__RESOURCES, com.github.icelyframework.service.Module.class, msgs);
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
			case ServicePackage.RESOURCE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case ServicePackage.RESOURCE__OPERATIONS:
				return getOperations();
			case ServicePackage.RESOURCE__PATH:
				return getPath();
			case ServicePackage.RESOURCE__GAP_CLASS:
				return isGapClass();
			case ServicePackage.RESOURCE__NAME:
				return getName();
			case ServicePackage.RESOURCE__MODULE:
				return getModule();
			case ServicePackage.RESOURCE__PERMISSIONS:
				return getPermissions();
			case ServicePackage.RESOURCE__INPUTREPRESENTATION:
				return getInputrepresentation();
			case ServicePackage.RESOURCE__OUTPUTREPRESENTATION:
				return getOutputrepresentation();
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
			case ServicePackage.RESOURCE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicePackage.RESOURCE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ResourceOperation>)newValue);
				return;
			case ServicePackage.RESOURCE__PATH:
				setPath((Path)newValue);
				return;
			case ServicePackage.RESOURCE__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case ServicePackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.RESOURCE__MODULE:
				setModule((com.github.icelyframework.service.Module)newValue);
				return;
			case ServicePackage.RESOURCE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case ServicePackage.RESOURCE__INPUTREPRESENTATION:
				setInputrepresentation((InputRepresentation)newValue);
				return;
			case ServicePackage.RESOURCE__OUTPUTREPRESENTATION:
				setOutputrepresentation((OutputRepresentation)newValue);
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
			case ServicePackage.RESOURCE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
			case ServicePackage.RESOURCE__OPERATIONS:
				getOperations().clear();
				return;
			case ServicePackage.RESOURCE__PATH:
				setPath((Path)null);
				return;
			case ServicePackage.RESOURCE__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case ServicePackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.RESOURCE__MODULE:
				setModule((com.github.icelyframework.service.Module)null);
				return;
			case ServicePackage.RESOURCE__PERMISSIONS:
				getPermissions().clear();
				return;
			case ServicePackage.RESOURCE__INPUTREPRESENTATION:
				setInputrepresentation((InputRepresentation)null);
				return;
			case ServicePackage.RESOURCE__OUTPUTREPRESENTATION:
				setOutputrepresentation((OutputRepresentation)null);
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
			case ServicePackage.RESOURCE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
			case ServicePackage.RESOURCE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicePackage.RESOURCE__PATH:
				return path != null;
			case ServicePackage.RESOURCE__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case ServicePackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.RESOURCE__MODULE:
				return getModule() != null;
			case ServicePackage.RESOURCE__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case ServicePackage.RESOURCE__INPUTREPRESENTATION:
				return inputrepresentation != null;
			case ServicePackage.RESOURCE__OUTPUTREPRESENTATION:
				return outputrepresentation != null;
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
		result.append(" (gapClass: ");
		result.append(gapClass);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
