/**
 */
package com.github.icelyframework.dynamicview.tests;

import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.dynamicview.SingletonResource;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Singleton Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingletonResourceTest extends ResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingletonResourceTest.class);
	}

	/**
	 * Constructs a new Singleton Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Singleton Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingletonResource getFixture() {
		return (SingletonResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicviewFactory.eINSTANCE.createSingletonResource());
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

} //SingletonResourceTest
