/**
 */
package openapi2.tests;

import java.util.Map;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.Openapi2Package;
import openapi2.Parameter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterEntryTest extends ParameterContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterEntryTest.class);
	}

	/**
	 * Constructs a new Parameter Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map.Entry<String, Parameter> getFixture() {
		return (Map.Entry<String, Parameter>)fixture;
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
		setFixture((Map.Entry<String, Parameter>)Openapi2Factory.eINSTANCE.create(Openapi2Package.Literals.PARAMETER_ENTRY));
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

} //ParameterEntryTest
