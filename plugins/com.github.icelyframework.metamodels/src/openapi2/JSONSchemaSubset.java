/**
 */
package openapi2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Schema Subset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openapi2.JSONSchemaSubset#getType <em>Type</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getFormat <em>Format</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getDescription <em>Description</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getPattern <em>Pattern</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getEnum <em>Enum</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getDefault <em>Default</em>}</li>
 *   <li>{@link openapi2.JSONSchemaSubset#getMultipleOf <em>Multiple Of</em>}</li>
 * </ul>
 *
 * @see openapi2.Openapi2Package#getJSONSchemaSubset()
 * @model abstract="true"
 * @generated
 */
public interface JSONSchemaSubset extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link openapi2.JSONDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see openapi2.JSONDataType
	 * @see #setType(JSONDataType)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Type()
	 * @model
	 * @generated
	 */
	JSONDataType getType();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see openapi2.JSONDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(JSONDataType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(Double)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Maximum()
	 * @model
	 * @generated
	 */
	Double getMaximum();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #setExclusiveMaximum(Boolean)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_ExclusiveMaximum()
	 * @model
	 * @generated
	 */
	Boolean getExclusiveMaximum();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #getExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(Boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(Double)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Minimum()
	 * @model
	 * @generated
	 */
	Double getMinimum();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Double value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(Boolean)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_ExclusiveMinimum()
	 * @model
	 * @generated
	 */
	Boolean getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_MaxLength()
	 * @model
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Integer)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_MinLength()
	 * @model
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(Integer)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_MaxItems()
	 * @model
	 * @generated
	 */
	Integer getMaxItems();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(Integer)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_MinItems()
	 * @model
	 * @generated
	 */
	Integer getMinItems();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(Integer value);

	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Items</em>' attribute.
	 * @see #setUniqueItems(Boolean)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_UniqueItems()
	 * @model
	 * @generated
	 */
	Boolean getUniqueItems();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #getUniqueItems()
	 * @generated
	 */
	void setUniqueItems(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Enum()
	 * @model
	 * @generated
	 */
	EList<String> getEnum();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(Double)
	 * @see openapi2.Openapi2Package#getJSONSchemaSubset_MultipleOf()
	 * @model
	 * @generated
	 */
	Double getMultipleOf();

	/**
	 * Sets the value of the '{@link openapi2.JSONSchemaSubset#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(Double value);

} // JSONSchemaSubset
