/**
 */
package openapi2.tests;

import java.util.Map;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.Openapi2Package;
import openapi2.Response;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Response Definition Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponseDefinitionEntryTest extends ResponseContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResponseDefinitionEntryTest.class);
	}

	/**
	 * Constructs a new Response Definition Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDefinitionEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Response Definition Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map.Entry<String, Response> getFixture() {
		return (Map.Entry<String, Response>)fixture;
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
		setFixture((Map.Entry<String, Response>)Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.RESPONSE_DEFINITION_ENTRY));
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

} //ResponseDefinitionEntryTest
