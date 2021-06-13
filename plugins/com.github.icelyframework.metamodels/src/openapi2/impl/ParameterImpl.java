/**
 */
package openapi2.impl;

import java.util.Collection;

import openapi2.ArrayContainer;
import openapi2.CollectionFormat;
import openapi2.ItemsDefinition;
import openapi2.JSONDataType;
import openapi2.JSONPointer;
import openapi2.JSONSchemaSubset;
import openapi2.Openapi2Package;
import openapi2.Parameter;
import openapi2.ParameterContainer;
import openapi2.ParameterLocation;
import openapi2.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openapi2.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getItems <em>Items</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getExample <em>Example</em>}</li>
 *   <li>{@link openapi2.impl.ParameterImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends SchemaContainerImpl implements Parameter {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JSONDataType TYPE_EDEFAULT = JSONDataType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JSONDataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected Double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMaximum = EXCLUSIVE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected Double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Integer minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected Integer maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected Integer minItems = MIN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNIQUE_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected Boolean uniqueItems = UNIQUE_ITEMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enum_;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected static final Double MULTIPLE_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected Double multipleOf = MULTIPLE_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionFormat COLLECTION_FORMAT_EDEFAULT = CollectionFormat.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected CollectionFormat collectionFormat = COLLECTION_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected ItemsDefinition items;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation LOCATION_EDEFAULT = ParameterLocation.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowEmplyValue() <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmplyValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_EMPLY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEmplyValue() <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmplyValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowEmplyValue = ALLOW_EMPLY_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaringContext() <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringContext()
	 * @generated
	 * @ordered
	 */
	protected ParameterContainer declaringContext;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi2Package.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONDataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(JSONDataType newType) {
		JSONDataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(Double newMaximum) {
		Double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMaximum(Boolean newExclusiveMaximum) {
		Boolean oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum(Double newMinimum) {
		Double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMinimum(Boolean newExclusiveMinimum) {
		Boolean oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(Integer newMinLength) {
		Integer oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxItems(Integer newMaxItems) {
		Integer oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItems(Integer newMinItems) {
		Integer oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUniqueItems() {
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueItems(Boolean newUniqueItems) {
		Boolean oldUniqueItems = uniqueItems;
		uniqueItems = newUniqueItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<String>(String.class, this, Openapi2Package.PARAMETER__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMultipleOf() {
		return multipleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOf(Double newMultipleOf) {
		Double oldMultipleOf = multipleOf;
		multipleOf = newMultipleOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__MULTIPLE_OF, oldMultipleOf, multipleOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionFormat(CollectionFormat newCollectionFormat) {
		CollectionFormat oldCollectionFormat = collectionFormat;
		collectionFormat = newCollectionFormat == null ? COLLECTION_FORMAT_EDEFAULT : newCollectionFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemsDefinition getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(ItemsDefinition newItems, NotificationChain msgs) {
		ItemsDefinition oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__ITEMS, oldItems, newItems);
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
	public void setItems(ItemsDefinition newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PARAMETER__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi2Package.PARAMETER__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__REF, oldRef, ref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(ParameterLocation newLocation) {
		ParameterLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowEmplyValue() {
		return allowEmplyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowEmplyValue(Boolean newAllowEmplyValue) {
		Boolean oldAllowEmplyValue = allowEmplyValue;
		allowEmplyValue = newAllowEmplyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__ALLOW_EMPLY_VALUE, oldAllowEmplyValue, allowEmplyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterContainer getDeclaringContext() {
		if (declaringContext != null && declaringContext.eIsProxy()) {
			InternalEObject oldDeclaringContext = (InternalEObject)declaringContext;
			declaringContext = (ParameterContainer)eResolveProxy(oldDeclaringContext);
			if (declaringContext != oldDeclaringContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Openapi2Package.PARAMETER__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
			}
		}
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterContainer basicGetDeclaringContext() {
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaringContext(ParameterContainer newDeclaringContext) {
		ParameterContainer oldDeclaringContext = declaringContext;
		declaringContext = newDeclaringContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject)schema;
			schema = (Schema)eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Openapi2Package.PARAMETER__SCHEMA, oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi2Package.PARAMETER__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi2Package.PARAMETER__ITEMS:
				return basicSetItems(null, msgs);
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
			case Openapi2Package.PARAMETER__TYPE:
				return getType();
			case Openapi2Package.PARAMETER__FORMAT:
				return getFormat();
			case Openapi2Package.PARAMETER__DESCRIPTION:
				return getDescription();
			case Openapi2Package.PARAMETER__MAXIMUM:
				return getMaximum();
			case Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case Openapi2Package.PARAMETER__MINIMUM:
				return getMinimum();
			case Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case Openapi2Package.PARAMETER__MAX_LENGTH:
				return getMaxLength();
			case Openapi2Package.PARAMETER__MIN_LENGTH:
				return getMinLength();
			case Openapi2Package.PARAMETER__PATTERN:
				return getPattern();
			case Openapi2Package.PARAMETER__MAX_ITEMS:
				return getMaxItems();
			case Openapi2Package.PARAMETER__MIN_ITEMS:
				return getMinItems();
			case Openapi2Package.PARAMETER__UNIQUE_ITEMS:
				return getUniqueItems();
			case Openapi2Package.PARAMETER__ENUM:
				return getEnum();
			case Openapi2Package.PARAMETER__DEFAULT:
				return getDefault();
			case Openapi2Package.PARAMETER__MULTIPLE_OF:
				return getMultipleOf();
			case Openapi2Package.PARAMETER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case Openapi2Package.PARAMETER__ITEMS:
				return getItems();
			case Openapi2Package.PARAMETER__REF:
				return getRef();
			case Openapi2Package.PARAMETER__NAME:
				return getName();
			case Openapi2Package.PARAMETER__LOCATION:
				return getLocation();
			case Openapi2Package.PARAMETER__REQUIRED:
				return getRequired();
			case Openapi2Package.PARAMETER__ALLOW_EMPLY_VALUE:
				return getAllowEmplyValue();
			case Openapi2Package.PARAMETER__DECLARING_CONTEXT:
				if (resolve) return getDeclaringContext();
				return basicGetDeclaringContext();
			case Openapi2Package.PARAMETER__EXAMPLE:
				return getExample();
			case Openapi2Package.PARAMETER__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
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
			case Openapi2Package.PARAMETER__TYPE:
				setType((JSONDataType)newValue);
				return;
			case Openapi2Package.PARAMETER__FORMAT:
				setFormat((String)newValue);
				return;
			case Openapi2Package.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Openapi2Package.PARAMETER__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case Openapi2Package.PARAMETER__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case Openapi2Package.PARAMETER__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case Openapi2Package.PARAMETER__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case Openapi2Package.PARAMETER__PATTERN:
				setPattern((String)newValue);
				return;
			case Openapi2Package.PARAMETER__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case Openapi2Package.PARAMETER__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case Openapi2Package.PARAMETER__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case Openapi2Package.PARAMETER__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
				return;
			case Openapi2Package.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case Openapi2Package.PARAMETER__MULTIPLE_OF:
				setMultipleOf((Double)newValue);
				return;
			case Openapi2Package.PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case Openapi2Package.PARAMETER__ITEMS:
				setItems((ItemsDefinition)newValue);
				return;
			case Openapi2Package.PARAMETER__REF:
				setRef((String)newValue);
				return;
			case Openapi2Package.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case Openapi2Package.PARAMETER__LOCATION:
				setLocation((ParameterLocation)newValue);
				return;
			case Openapi2Package.PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case Openapi2Package.PARAMETER__ALLOW_EMPLY_VALUE:
				setAllowEmplyValue((Boolean)newValue);
				return;
			case Openapi2Package.PARAMETER__DECLARING_CONTEXT:
				setDeclaringContext((ParameterContainer)newValue);
				return;
			case Openapi2Package.PARAMETER__EXAMPLE:
				setExample((String)newValue);
				return;
			case Openapi2Package.PARAMETER__SCHEMA:
				setSchema((Schema)newValue);
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
			case Openapi2Package.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__ENUM:
				getEnum().clear();
				return;
			case Openapi2Package.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__ITEMS:
				setItems((ItemsDefinition)null);
				return;
			case Openapi2Package.PARAMETER__REF:
				setRef(REF_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__ALLOW_EMPLY_VALUE:
				setAllowEmplyValue(ALLOW_EMPLY_VALUE_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__DECLARING_CONTEXT:
				setDeclaringContext((ParameterContainer)null);
				return;
			case Openapi2Package.PARAMETER__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case Openapi2Package.PARAMETER__SCHEMA:
				setSchema((Schema)null);
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
			case Openapi2Package.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case Openapi2Package.PARAMETER__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case Openapi2Package.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Openapi2Package.PARAMETER__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? exclusiveMaximum != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(exclusiveMaximum);
			case Openapi2Package.PARAMETER__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? exclusiveMinimum != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(exclusiveMinimum);
			case Openapi2Package.PARAMETER__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case Openapi2Package.PARAMETER__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case Openapi2Package.PARAMETER__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case Openapi2Package.PARAMETER__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? maxItems != null : !MAX_ITEMS_EDEFAULT.equals(maxItems);
			case Openapi2Package.PARAMETER__MIN_ITEMS:
				return MIN_ITEMS_EDEFAULT == null ? minItems != null : !MIN_ITEMS_EDEFAULT.equals(minItems);
			case Openapi2Package.PARAMETER__UNIQUE_ITEMS:
				return UNIQUE_ITEMS_EDEFAULT == null ? uniqueItems != null : !UNIQUE_ITEMS_EDEFAULT.equals(uniqueItems);
			case Openapi2Package.PARAMETER__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case Openapi2Package.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case Openapi2Package.PARAMETER__MULTIPLE_OF:
				return MULTIPLE_OF_EDEFAULT == null ? multipleOf != null : !MULTIPLE_OF_EDEFAULT.equals(multipleOf);
			case Openapi2Package.PARAMETER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case Openapi2Package.PARAMETER__ITEMS:
				return items != null;
			case Openapi2Package.PARAMETER__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case Openapi2Package.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Openapi2Package.PARAMETER__LOCATION:
				return location != LOCATION_EDEFAULT;
			case Openapi2Package.PARAMETER__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
			case Openapi2Package.PARAMETER__ALLOW_EMPLY_VALUE:
				return ALLOW_EMPLY_VALUE_EDEFAULT == null ? allowEmplyValue != null : !ALLOW_EMPLY_VALUE_EDEFAULT.equals(allowEmplyValue);
			case Openapi2Package.PARAMETER__DECLARING_CONTEXT:
				return declaringContext != null;
			case Openapi2Package.PARAMETER__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case Openapi2Package.PARAMETER__SCHEMA:
				return schema != null;
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
		if (baseClass == JSONSchemaSubset.class) {
			switch (derivedFeatureID) {
				case Openapi2Package.PARAMETER__TYPE: return Openapi2Package.JSON_SCHEMA_SUBSET__TYPE;
				case Openapi2Package.PARAMETER__FORMAT: return Openapi2Package.JSON_SCHEMA_SUBSET__FORMAT;
				case Openapi2Package.PARAMETER__DESCRIPTION: return Openapi2Package.JSON_SCHEMA_SUBSET__DESCRIPTION;
				case Openapi2Package.PARAMETER__MAXIMUM: return Openapi2Package.JSON_SCHEMA_SUBSET__MAXIMUM;
				case Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM: return Openapi2Package.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;
				case Openapi2Package.PARAMETER__MINIMUM: return Openapi2Package.JSON_SCHEMA_SUBSET__MINIMUM;
				case Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM: return Openapi2Package.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;
				case Openapi2Package.PARAMETER__MAX_LENGTH: return Openapi2Package.JSON_SCHEMA_SUBSET__MAX_LENGTH;
				case Openapi2Package.PARAMETER__MIN_LENGTH: return Openapi2Package.JSON_SCHEMA_SUBSET__MIN_LENGTH;
				case Openapi2Package.PARAMETER__PATTERN: return Openapi2Package.JSON_SCHEMA_SUBSET__PATTERN;
				case Openapi2Package.PARAMETER__MAX_ITEMS: return Openapi2Package.JSON_SCHEMA_SUBSET__MAX_ITEMS;
				case Openapi2Package.PARAMETER__MIN_ITEMS: return Openapi2Package.JSON_SCHEMA_SUBSET__MIN_ITEMS;
				case Openapi2Package.PARAMETER__UNIQUE_ITEMS: return Openapi2Package.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;
				case Openapi2Package.PARAMETER__ENUM: return Openapi2Package.JSON_SCHEMA_SUBSET__ENUM;
				case Openapi2Package.PARAMETER__DEFAULT: return Openapi2Package.JSON_SCHEMA_SUBSET__DEFAULT;
				case Openapi2Package.PARAMETER__MULTIPLE_OF: return Openapi2Package.JSON_SCHEMA_SUBSET__MULTIPLE_OF;
				default: return -1;
			}
		}
		if (baseClass == ArrayContainer.class) {
			switch (derivedFeatureID) {
				case Openapi2Package.PARAMETER__COLLECTION_FORMAT: return Openapi2Package.ARRAY_CONTAINER__COLLECTION_FORMAT;
				case Openapi2Package.PARAMETER__ITEMS: return Openapi2Package.ARRAY_CONTAINER__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (derivedFeatureID) {
				case Openapi2Package.PARAMETER__REF: return Openapi2Package.JSON_POINTER__REF;
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
		if (baseClass == JSONSchemaSubset.class) {
			switch (baseFeatureID) {
				case Openapi2Package.JSON_SCHEMA_SUBSET__TYPE: return Openapi2Package.PARAMETER__TYPE;
				case Openapi2Package.JSON_SCHEMA_SUBSET__FORMAT: return Openapi2Package.PARAMETER__FORMAT;
				case Openapi2Package.JSON_SCHEMA_SUBSET__DESCRIPTION: return Openapi2Package.PARAMETER__DESCRIPTION;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MAXIMUM: return Openapi2Package.PARAMETER__MAXIMUM;
				case Openapi2Package.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM: return Openapi2Package.PARAMETER__EXCLUSIVE_MAXIMUM;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MINIMUM: return Openapi2Package.PARAMETER__MINIMUM;
				case Openapi2Package.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM: return Openapi2Package.PARAMETER__EXCLUSIVE_MINIMUM;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MAX_LENGTH: return Openapi2Package.PARAMETER__MAX_LENGTH;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MIN_LENGTH: return Openapi2Package.PARAMETER__MIN_LENGTH;
				case Openapi2Package.JSON_SCHEMA_SUBSET__PATTERN: return Openapi2Package.PARAMETER__PATTERN;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MAX_ITEMS: return Openapi2Package.PARAMETER__MAX_ITEMS;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MIN_ITEMS: return Openapi2Package.PARAMETER__MIN_ITEMS;
				case Openapi2Package.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS: return Openapi2Package.PARAMETER__UNIQUE_ITEMS;
				case Openapi2Package.JSON_SCHEMA_SUBSET__ENUM: return Openapi2Package.PARAMETER__ENUM;
				case Openapi2Package.JSON_SCHEMA_SUBSET__DEFAULT: return Openapi2Package.PARAMETER__DEFAULT;
				case Openapi2Package.JSON_SCHEMA_SUBSET__MULTIPLE_OF: return Openapi2Package.PARAMETER__MULTIPLE_OF;
				default: return -1;
			}
		}
		if (baseClass == ArrayContainer.class) {
			switch (baseFeatureID) {
				case Openapi2Package.ARRAY_CONTAINER__COLLECTION_FORMAT: return Openapi2Package.PARAMETER__COLLECTION_FORMAT;
				case Openapi2Package.ARRAY_CONTAINER__ITEMS: return Openapi2Package.PARAMETER__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (baseFeatureID) {
				case Openapi2Package.JSON_POINTER__REF: return Openapi2Package.PARAMETER__REF;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(", description: ");
		result.append(description);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", default: ");
		result.append(default_);
		result.append(", multipleOf: ");
		result.append(multipleOf);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(", ref: ");
		result.append(ref);
		result.append(", name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", required: ");
		result.append(required);
		result.append(", allowEmplyValue: ");
		result.append(allowEmplyValue);
		result.append(", example: ");
		result.append(example);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
