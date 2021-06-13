/**
 */
package openapi2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openapi2.SecurityRequirement#getSecuritySchemes <em>Security Schemes</em>}</li>
 * </ul>
 *
 * @see openapi2.Openapi2Package#getSecurityRequirement()
 * @model
 * @generated
 */
public interface SecurityRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Schemes</b></em>' containment reference list.
	 * The list contents are of type {@link openapi2.RequiredSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Schemes</em>' containment reference list.
	 * @see openapi2.Openapi2Package#getSecurityRequirement_SecuritySchemes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredSecurityScheme> getSecuritySchemes();

} // SecurityRequirement
