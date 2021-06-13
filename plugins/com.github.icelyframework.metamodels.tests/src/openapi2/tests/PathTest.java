/**
 */
package openapi2.tests;

import junit.textui.TestRunner;

import openapi2.Openapi2Factory;
import openapi2.Path;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link openapi2.Path#getOperationByHTTPMethod(java.lang.String) <em>Get Operation By HTTP Method</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PathTest extends ParameterContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PathTest.class);
	}

	/**
	 * Constructs a new Path test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Path test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Path getFixture() {
		return (Path)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openapi2Factory.eINSTANCE.createPath());
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
	 * Tests the '{@link openapi2.Path#getOperationByHTTPMethod(java.lang.String) <em>Get Operation By HTTP Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openapi2.Path#getOperationByHTTPMethod(java.lang.String)
	 * @generated
	 */
	public void testGetOperationByHTTPMethod__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PathTest
