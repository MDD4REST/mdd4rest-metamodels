/**
 */
package openapi2.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openapi2.License;
import openapi2.Openapi2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LicenseTest extends TestCase {

	/**
	 * The fixture for this License test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected License fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LicenseTest.class);
	}

	/**
	 * Constructs a new License test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this License test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(License fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this License test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected License getFixture() {
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
		setFixture(Openapi2Factory.eINSTANCE.createLicense());
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

} //LicenseTest
