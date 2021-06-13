/**
 */
package openapi2.tests;

import java.util.Map;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.Openapi2Package;
import openapi2.Schema;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Schema Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaEntryTest extends SchemaContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchemaEntryTest.class);
	}

	/**
	 * Constructs a new Schema Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Schema Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map.Entry<String, Schema> getFixture() {
		return (Map.Entry<String, Schema>)fixture;
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
		setFixture((Map.Entry<String, Schema>)Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.SCHEMA_ENTRY));
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

} //SchemaEntryTest
