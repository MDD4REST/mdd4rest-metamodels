/**
 */
package openapi2.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openapi2.Info;
import openapi2.Openapi2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfoTest extends TestCase {

	/**
	 * The fixture for this Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Info fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfoTest.class);
	}

	/**
	 * Constructs a new Info test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Info fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Info getFixture() {
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
		setFixture(Openapi2Factory.eINSTANCE.createInfo());
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

} //InfoTest
