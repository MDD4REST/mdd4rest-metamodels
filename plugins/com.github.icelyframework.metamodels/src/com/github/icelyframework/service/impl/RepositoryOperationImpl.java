/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Repository;
import com.github.icelyframework.service.RepositoryOperation;
import com.github.icelyframework.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryOperationImpl#isDelegateToAccessObject <em>Delegate To Access Object</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryOperationImpl#isAccessObjectName <em>Access Object Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryOperationImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryOperationImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryOperationImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.RepositoryOperationImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryOperationImpl extends OperationImpl implements RepositoryOperation {
	/**
	 * The default value of the '{@link #isDelegateToAccessObject() <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegateToAccessObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELEGATE_TO_ACCESS_OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelegateToAccessObject() <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelegateToAccessObject()
	 * @generated
	 * @ordered
	 */
	protected boolean delegateToAccessObject = DELEGATE_TO_ACCESS_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccessObjectName() <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESS_OBJECT_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccessObjectName() <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessObjectName()
	 * @generated
	 * @ordered
	 */
	protected boolean accessObjectName = ACCESS_OBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected String select = SELECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.REPOSITORY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDelegateToAccessObject() {
		return delegateToAccessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegateToAccessObject(boolean newDelegateToAccessObject) {
		boolean oldDelegateToAccessObject = delegateToAccessObject;
		delegateToAccessObject = newDelegateToAccessObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT, oldDelegateToAccessObject, delegateToAccessObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAccessObjectName() {
		return accessObjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessObjectName(boolean newAccessObjectName) {
		boolean oldAccessObjectName = accessObjectName;
		accessObjectName = newAccessObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY_OPERATION__ACCESS_OBJECT_NAME, oldAccessObjectName, accessObjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository() {
		if (eContainerFeatureID() != ServicePackage.REPOSITORY_OPERATION__REPOSITORY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, ServicePackage.REPOSITORY_OPERATION__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != ServicePackage.REPOSITORY_OPERATION__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, ServicePackage.REPOSITORY__OPERATIONS, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY_OPERATION__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY_OPERATION__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(String newSelect) {
		String oldSelect = select;
		select = newSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY_OPERATION__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REPOSITORY_OPERATION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
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
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				return basicSetRepository(null, msgs);
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
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, ServicePackage.REPOSITORY__OPERATIONS, Repository.class, msgs);
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
			case ServicePackage.REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				return isDelegateToAccessObject();
			case ServicePackage.REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				return isAccessObjectName();
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				return getRepository();
			case ServicePackage.REPOSITORY_OPERATION__QUERY:
				return getQuery();
			case ServicePackage.REPOSITORY_OPERATION__SELECT:
				return getSelect();
			case ServicePackage.REPOSITORY_OPERATION__CONDITION:
				return getCondition();
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
			case ServicePackage.REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				setDelegateToAccessObject((Boolean)newValue);
				return;
			case ServicePackage.REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				setAccessObjectName((Boolean)newValue);
				return;
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case ServicePackage.REPOSITORY_OPERATION__QUERY:
				setQuery((String)newValue);
				return;
			case ServicePackage.REPOSITORY_OPERATION__SELECT:
				setSelect((String)newValue);
				return;
			case ServicePackage.REPOSITORY_OPERATION__CONDITION:
				setCondition((String)newValue);
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
			case ServicePackage.REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				setDelegateToAccessObject(DELEGATE_TO_ACCESS_OBJECT_EDEFAULT);
				return;
			case ServicePackage.REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				setAccessObjectName(ACCESS_OBJECT_NAME_EDEFAULT);
				return;
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				setRepository((Repository)null);
				return;
			case ServicePackage.REPOSITORY_OPERATION__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case ServicePackage.REPOSITORY_OPERATION__SELECT:
				setSelect(SELECT_EDEFAULT);
				return;
			case ServicePackage.REPOSITORY_OPERATION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case ServicePackage.REPOSITORY_OPERATION__DELEGATE_TO_ACCESS_OBJECT:
				return delegateToAccessObject != DELEGATE_TO_ACCESS_OBJECT_EDEFAULT;
			case ServicePackage.REPOSITORY_OPERATION__ACCESS_OBJECT_NAME:
				return accessObjectName != ACCESS_OBJECT_NAME_EDEFAULT;
			case ServicePackage.REPOSITORY_OPERATION__REPOSITORY:
				return getRepository() != null;
			case ServicePackage.REPOSITORY_OPERATION__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case ServicePackage.REPOSITORY_OPERATION__SELECT:
				return SELECT_EDEFAULT == null ? select != null : !SELECT_EDEFAULT.equals(select);
			case ServicePackage.REPOSITORY_OPERATION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (delegateToAccessObject: ");
		result.append(delegateToAccessObject);
		result.append(", accessObjectName: ");
		result.append(accessObjectName);
		result.append(", query: ");
		result.append(query);
		result.append(", select: ");
		result.append(select);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //RepositoryOperationImpl
