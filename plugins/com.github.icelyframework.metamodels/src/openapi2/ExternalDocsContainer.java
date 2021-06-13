/**
 */
package openapi2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Docs Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openapi2.ExternalDocsContainer#getExternalDocs <em>External Docs</em>}</li>
 * </ul>
 *
 * @see openapi2.Openapi2Package#getExternalDocsContainer()
 * @model abstract="true"
 * @generated
 */
public interface ExternalDocsContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Docs</em>' containment reference.
	 * @see #setExternalDocs(ExternalDocs)
	 * @see openapi2.Openapi2Package#getExternalDocsContainer_ExternalDocs()
	 * @model containment="true"
	 * @generated
	 */
	ExternalDocs getExternalDocs();

	/**
	 * Sets the value of the '{@link openapi2.ExternalDocsContainer#getExternalDocs <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs</em>' containment reference.
	 * @see #getExternalDocs()
	 * @generated
	 */
	void setExternalDocs(ExternalDocs value);

} // ExternalDocsContainer
