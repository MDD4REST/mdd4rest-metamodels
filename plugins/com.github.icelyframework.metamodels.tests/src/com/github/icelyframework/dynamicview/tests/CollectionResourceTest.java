/**
 */
package com.github.icelyframework.dynamicview.tests;

import com.github.icelyframework.dynamicview.CollectionResource;
import com.github.icelyframework.dynamicview.DynamicviewFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collection Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionResourceTest extends ResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectionResourceTest.class);
	}

	/**
	 * Constructs a new Collection Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collection Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CollectionResource getFixture() {
		return (CollectionResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicviewFactory.eINSTANCE.createCollectionResource());
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

} //CollectionResourceTest
