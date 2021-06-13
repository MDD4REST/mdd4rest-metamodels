/**
 */
package openapi2.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.RequiredSecurityScheme;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredSecuritySchemeTest extends TestCase {

	/**
	 * The fixture for this Required Security Scheme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredSecurityScheme fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredSecuritySchemeTest.class);
	}

	/**
	 * Constructs a new Required Security Scheme test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredSecuritySchemeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Required Security Scheme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RequiredSecurityScheme fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Required Security Scheme test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredSecurityScheme getFixture() {
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
		setFixture(Openapi2Factory.eINSTANCE.createRequiredSecurityScheme());
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

} //RequiredSecuritySchemeTest
