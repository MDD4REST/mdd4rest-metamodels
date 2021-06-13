/**
 */
package openapi2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openapi2.ArrayContainer#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link openapi2.ArrayContainer#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see openapi2.Openapi2Package#getArrayContainer()
 * @model abstract="true"
 * @generated
 */
public interface ArrayContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link openapi2.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see openapi2.CollectionFormat
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see openapi2.Openapi2Package#getArrayContainer_CollectionFormat()
	 * @model
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link openapi2.ArrayContainer#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see openapi2.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(ItemsDefinition)
	 * @see openapi2.Openapi2Package#getArrayContainer_Items()
	 * @model containment="true"
	 * @generated
	 */
	ItemsDefinition getItems();

	/**
	 * Sets the value of the '{@link openapi2.ArrayContainer#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(ItemsDefinition value);

} // ArrayContainer
