/**
 */
package openapi2.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.Openapi2Package;
import openapi2.SecurityScheme;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Scheme Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecuritySchemeEntryTest extends TestCase {

	/**
	 * The fixture for this Security Scheme Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, SecurityScheme> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecuritySchemeEntryTest.class);
	}

	/**
	 * Constructs a new Security Scheme Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Scheme Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, SecurityScheme> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Scheme Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, SecurityScheme> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, SecurityScheme>)Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.SECURITY_SCHEME_ENTRY));
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

} //SecuritySchemeEntryTest
