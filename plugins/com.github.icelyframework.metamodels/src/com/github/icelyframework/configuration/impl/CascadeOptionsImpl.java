/**
 */
package com.github.icelyframework.configuration.impl;

import com.github.icelyframework.configuration.CascadeOptions;
import com.github.icelyframework.configuration.ConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cascade Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl#getCascade_aggregate <em>Cascade aggregate</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl#getCascade_aggregate_oneToMany <em>Cascade aggregate one To Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl#getCascade_manyToMany <em>Cascade many To Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl#getCascade_oneToMany <em>Cascade one To Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl#getCascade_toMany <em>Cascade to Many</em>}</li>
 *   <li>{@link com.github.icelyframework.configuration.impl.CascadeOptionsImpl#getCascade_toOne <em>Cascade to One</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CascadeOptionsImpl extends EObjectImpl implements CascadeOptions {
	/**
	 * The default value of the '{@link #getCascade_aggregate() <em>Cascade aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_aggregate()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_AGGREGATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade_aggregate() <em>Cascade aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_aggregate()
	 * @generated
	 * @ordered
	 */
	protected String cascade_aggregate = CASCADE_AGGREGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade_aggregate_oneToMany() <em>Cascade aggregate one To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_aggregate_oneToMany()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_AGGREGATE_ONE_TO_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade_aggregate_oneToMany() <em>Cascade aggregate one To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_aggregate_oneToMany()
	 * @generated
	 * @ordered
	 */
	protected String cascade_aggregate_oneToMany = CASCADE_AGGREGATE_ONE_TO_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade_manyToMany() <em>Cascade many To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_manyToMany()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_MANY_TO_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade_manyToMany() <em>Cascade many To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_manyToMany()
	 * @generated
	 * @ordered
	 */
	protected String cascade_manyToMany = CASCADE_MANY_TO_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade_oneToMany() <em>Cascade one To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_oneToMany()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_ONE_TO_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade_oneToMany() <em>Cascade one To Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_oneToMany()
	 * @generated
	 * @ordered
	 */
	protected String cascade_oneToMany = CASCADE_ONE_TO_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade_toMany() <em>Cascade to Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_toMany()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_TO_MANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade_toMany() <em>Cascade to Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_toMany()
	 * @generated
	 * @ordered
	 */
	protected String cascade_toMany = CASCADE_TO_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade_toOne() <em>Cascade to One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_toOne()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_TO_ONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade_toOne() <em>Cascade to One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade_toOne()
	 * @generated
	 * @ordered
	 */
	protected String cascade_toOne = CASCADE_TO_ONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CascadeOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CASCADE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade_aggregate() {
		return cascade_aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade_aggregate(String newCascade_aggregate) {
		String oldCascade_aggregate = cascade_aggregate;
		cascade_aggregate = newCascade_aggregate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE, oldCascade_aggregate, cascade_aggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade_aggregate_oneToMany() {
		return cascade_aggregate_oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade_aggregate_oneToMany(String newCascade_aggregate_oneToMany) {
		String oldCascade_aggregate_oneToMany = cascade_aggregate_oneToMany;
		cascade_aggregate_oneToMany = newCascade_aggregate_oneToMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY, oldCascade_aggregate_oneToMany, cascade_aggregate_oneToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade_manyToMany() {
		return cascade_manyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade_manyToMany(String newCascade_manyToMany) {
		String oldCascade_manyToMany = cascade_manyToMany;
		cascade_manyToMany = newCascade_manyToMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CASCADE_OPTIONS__CASCADE_MANY_TO_MANY, oldCascade_manyToMany, cascade_manyToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade_oneToMany() {
		return cascade_oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade_oneToMany(String newCascade_oneToMany) {
		String oldCascade_oneToMany = cascade_oneToMany;
		cascade_oneToMany = newCascade_oneToMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CASCADE_OPTIONS__CASCADE_ONE_TO_MANY, oldCascade_oneToMany, cascade_oneToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade_toMany() {
		return cascade_toMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade_toMany(String newCascade_toMany) {
		String oldCascade_toMany = cascade_toMany;
		cascade_toMany = newCascade_toMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_MANY, oldCascade_toMany, cascade_toMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCascade_toOne() {
		return cascade_toOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCascade_toOne(String newCascade_toOne) {
		String oldCascade_toOne = cascade_toOne;
		cascade_toOne = newCascade_toOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_ONE, oldCascade_toOne, cascade_toOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE:
				return getCascade_aggregate();
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY:
				return getCascade_aggregate_oneToMany();
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_MANY_TO_MANY:
				return getCascade_manyToMany();
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_ONE_TO_MANY:
				return getCascade_oneToMany();
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_MANY:
				return getCascade_toMany();
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_ONE:
				return getCascade_toOne();
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
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE:
				setCascade_aggregate((String)newValue);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY:
				setCascade_aggregate_oneToMany((String)newValue);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_MANY_TO_MANY:
				setCascade_manyToMany((String)newValue);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_ONE_TO_MANY:
				setCascade_oneToMany((String)newValue);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_MANY:
				setCascade_toMany((String)newValue);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_ONE:
				setCascade_toOne((String)newValue);
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
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE:
				setCascade_aggregate(CASCADE_AGGREGATE_EDEFAULT);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY:
				setCascade_aggregate_oneToMany(CASCADE_AGGREGATE_ONE_TO_MANY_EDEFAULT);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_MANY_TO_MANY:
				setCascade_manyToMany(CASCADE_MANY_TO_MANY_EDEFAULT);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_ONE_TO_MANY:
				setCascade_oneToMany(CASCADE_ONE_TO_MANY_EDEFAULT);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_MANY:
				setCascade_toMany(CASCADE_TO_MANY_EDEFAULT);
				return;
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_ONE:
				setCascade_toOne(CASCADE_TO_ONE_EDEFAULT);
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
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE:
				return CASCADE_AGGREGATE_EDEFAULT == null ? cascade_aggregate != null : !CASCADE_AGGREGATE_EDEFAULT.equals(cascade_aggregate);
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_AGGREGATE_ONE_TO_MANY:
				return CASCADE_AGGREGATE_ONE_TO_MANY_EDEFAULT == null ? cascade_aggregate_oneToMany != null : !CASCADE_AGGREGATE_ONE_TO_MANY_EDEFAULT.equals(cascade_aggregate_oneToMany);
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_MANY_TO_MANY:
				return CASCADE_MANY_TO_MANY_EDEFAULT == null ? cascade_manyToMany != null : !CASCADE_MANY_TO_MANY_EDEFAULT.equals(cascade_manyToMany);
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_ONE_TO_MANY:
				return CASCADE_ONE_TO_MANY_EDEFAULT == null ? cascade_oneToMany != null : !CASCADE_ONE_TO_MANY_EDEFAULT.equals(cascade_oneToMany);
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_MANY:
				return CASCADE_TO_MANY_EDEFAULT == null ? cascade_toMany != null : !CASCADE_TO_MANY_EDEFAULT.equals(cascade_toMany);
			case ConfigurationPackage.CASCADE_OPTIONS__CASCADE_TO_ONE:
				return CASCADE_TO_ONE_EDEFAULT == null ? cascade_toOne != null : !CASCADE_TO_ONE_EDEFAULT.equals(cascade_toOne);
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
		result.append(" (cascade_aggregate: ");
		result.append(cascade_aggregate);
		result.append(", cascade_aggregate_oneToMany: ");
		result.append(cascade_aggregate_oneToMany);
		result.append(", cascade_manyToMany: ");
		result.append(cascade_manyToMany);
		result.append(", cascade_oneToMany: ");
		result.append(cascade_oneToMany);
		result.append(", cascade_toMany: ");
		result.append(cascade_toMany);
		result.append(", cascade_toOne: ");
		result.append(cascade_toOne);
		result.append(')');
		return result.toString();
	}

} //CascadeOptionsImpl
