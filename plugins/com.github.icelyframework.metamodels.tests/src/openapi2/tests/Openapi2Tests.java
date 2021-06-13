/**
 */
package openapi2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>openapi2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Openapi2Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Openapi2Tests("openapi2 Tests");
		suite.addTestSuite(APITest.class);
		suite.addTestSuite(PathTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(SchemaTest.class);
		suite.addTestSuite(SecuritySchemeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Openapi2Tests(String name) {
		super(name);
	}

} //Openapi2Tests
