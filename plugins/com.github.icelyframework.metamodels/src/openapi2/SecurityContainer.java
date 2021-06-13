/**
 */
package openapi2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openapi2.SecurityContainer#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @see openapi2.Openapi2Package#getSecurityContainer()
 * @model abstract="true"
 * @generated
 */
public interface SecurityContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link openapi2.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see openapi2.Openapi2Package#getSecurityContainer_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurity();

} // SecurityContainer
