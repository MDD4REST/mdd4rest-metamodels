/**
 */
package openapi2.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.SecurityScheme;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link openapi2.SecurityScheme#getSecurityScopeByName(java.lang.String) <em>Get Security Scope By Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SecuritySchemeTest extends TestCase {

	/**
	 * The fixture for this Security Scheme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityScheme fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecuritySchemeTest.class);
	}

	/**
	 * Constructs a new Security Scheme test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Scheme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityScheme fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Scheme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityScheme getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openapi2Factory.eINSTANCE.createSecurityScheme());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link openapi2.SecurityScheme#getSecurityScopeByName(java.lang.String) <em>Get Security Scope By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openapi2.SecurityScheme#getSecurityScopeByName(java.lang.String)
	 * @generated
	 */
	public void testGetSecurityScopeByName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SecuritySchemeTest
