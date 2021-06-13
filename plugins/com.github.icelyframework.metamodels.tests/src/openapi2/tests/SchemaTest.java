/**
 */
package openapi2.tests;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.Schema;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link openapi2.Schema#getPropertyByName(java.lang.String) <em>Get Property By Name</em>}</li>
 *   <li>{@link openapi2.Schema#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SchemaTest extends JSONSchemaSubsetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchemaTest.class);
	}

	/**
	 * Constructs a new Schema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Schema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Schema getFixture() {
		return (Schema)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openapi2Factory.eINSTANCE.createSchema());
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
	 * Tests the '{@link openapi2.Schema#getPropertyByName(java.lang.String) <em>Get Property By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openapi2.Schema#getPropertyByName(java.lang.String)
	 * @generated
	 */
	public void testGetPropertyByName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link openapi2.Schema#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openapi2.Schema#getName()
	 * @generated
	 */
	public void testGetName() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SchemaTest
