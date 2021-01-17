/**
 */
package com.github.icelyframework.service.impl;

import com.github.icelyframework.service.Property;
import com.github.icelyframework.service.ServicePackage;
import com.github.icelyframework.service.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getDatabaseColumn <em>Database Column</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getValidate <em>Validate</em>}</li>
 *   <li>{@link com.github.icelyframework.service.impl.PropertyImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAMING_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean isNamingProperty = IS_NAMING_PROPERTY_EDEFAULT;

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
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;

	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseColumn() <em>Database Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseColumn() <em>Database Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseColumn()
	 * @generated
	 * @ordered
	 */
	protected String databaseColumn = DATABASE_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidate()
	 * @generated
	 * @ordered
	 */
	protected String validate = VALIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNamingProperty() {
		return isNamingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNamingProperty(boolean newIsNamingProperty) {
		boolean oldIsNamingProperty = isNamingProperty;
		isNamingProperty = newIsNamingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__IS_NAMING_PROPERTY, oldIsNamingProperty, isNamingProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeDefinition)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeDefinition newType) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeable(boolean newChangeable) {
		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseColumn() {
		return databaseColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseColumn(String newDatabaseColumn) {
		String oldDatabaseColumn = databaseColumn;
		databaseColumn = newDatabaseColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__DATABASE_COLUMN, oldDatabaseColumn, databaseColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidate(String newValidate) {
		String oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROPERTY__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.PROPERTY__UNIQUE:
				return isUnique();
			case ServicePackage.PROPERTY__IS_NAMING_PROPERTY:
				return isIsNamingProperty();
			case ServicePackage.PROPERTY__NAME:
				return getName();
			case ServicePackage.PROPERTY__REQUIRED:
				return isRequired();
			case ServicePackage.PROPERTY__MIN:
				return getMin();
			case ServicePackage.PROPERTY__MAX:
				return getMax();
			case ServicePackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ServicePackage.PROPERTY__CHANGEABLE:
				return isChangeable();
			case ServicePackage.PROPERTY__NULLABLE:
				return isNullable();
			case ServicePackage.PROPERTY__VISIBILITY:
				return getVisibility();
			case ServicePackage.PROPERTY__DATABASE_COLUMN:
				return getDatabaseColumn();
			case ServicePackage.PROPERTY__TRANSIENT:
				return isTransient();
			case ServicePackage.PROPERTY__VALIDATE:
				return getValidate();
			case ServicePackage.PROPERTY__LENGTH:
				return getLength();
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
			case ServicePackage.PROPERTY__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case ServicePackage.PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty((Boolean)newValue);
				return;
			case ServicePackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ServicePackage.PROPERTY__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case ServicePackage.PROPERTY__MIN:
				setMin((Integer)newValue);
				return;
			case ServicePackage.PROPERTY__MAX:
				setMax((Integer)newValue);
				return;
			case ServicePackage.PROPERTY__TYPE:
				setType((TypeDefinition)newValue);
				return;
			case ServicePackage.PROPERTY__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case ServicePackage.PROPERTY__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case ServicePackage.PROPERTY__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case ServicePackage.PROPERTY__DATABASE_COLUMN:
				setDatabaseColumn((String)newValue);
				return;
			case ServicePackage.PROPERTY__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case ServicePackage.PROPERTY__VALIDATE:
				setValidate((String)newValue);
				return;
			case ServicePackage.PROPERTY__LENGTH:
				setLength((String)newValue);
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
			case ServicePackage.PROPERTY__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty(IS_NAMING_PROPERTY_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__TYPE:
				setType((TypeDefinition)null);
				return;
			case ServicePackage.PROPERTY__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__DATABASE_COLUMN:
				setDatabaseColumn(DATABASE_COLUMN_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
				return;
			case ServicePackage.PROPERTY__LENGTH:
				setLength(LENGTH_EDEFAULT);
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
			case ServicePackage.PROPERTY__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case ServicePackage.PROPERTY__IS_NAMING_PROPERTY:
				return isNamingProperty != IS_NAMING_PROPERTY_EDEFAULT;
			case ServicePackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePackage.PROPERTY__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case ServicePackage.PROPERTY__MIN:
				return min != MIN_EDEFAULT;
			case ServicePackage.PROPERTY__MAX:
				return max != MAX_EDEFAULT;
			case ServicePackage.PROPERTY__TYPE:
				return type != null;
			case ServicePackage.PROPERTY__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case ServicePackage.PROPERTY__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case ServicePackage.PROPERTY__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case ServicePackage.PROPERTY__DATABASE_COLUMN:
				return DATABASE_COLUMN_EDEFAULT == null ? databaseColumn != null : !DATABASE_COLUMN_EDEFAULT.equals(databaseColumn);
			case ServicePackage.PROPERTY__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case ServicePackage.PROPERTY__VALIDATE:
				return VALIDATE_EDEFAULT == null ? validate != null : !VALIDATE_EDEFAULT.equals(validate);
			case ServicePackage.PROPERTY__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
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
		result.append(" (unique: ");
		result.append(unique);
		result.append(", isNamingProperty: ");
		result.append(isNamingProperty);
		result.append(", name: ");
		result.append(name);
		result.append(", required: ");
		result.append(required);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", changeable: ");
		result.append(changeable);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", databaseColumn: ");
		result.append(databaseColumn);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", validate: ");
		result.append(validate);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
