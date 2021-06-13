/**
 */
package openapi2.tests;

import junit.textui.TestRunner;

import openapi2.ItemsDefinition;
import openapi2.Openapi2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Items Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemsDefinitionTest extends JSONSchemaSubsetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItemsDefinitionTest.class);
	}

	/**
	 * Constructs a new Items Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemsDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Items Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ItemsDefinition getFixture() {
		return (ItemsDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openapi2Factory.eINSTANCE.createItemsDefinition());
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

} //ItemsDefinitionTest
