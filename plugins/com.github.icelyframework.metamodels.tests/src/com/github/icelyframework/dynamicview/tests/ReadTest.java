/**
 */
package com.github.icelyframework.dynamicview.tests;

import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.dynamicview.Read;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadTest extends ResourceActivityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadTest.class);
	}

	/**
	 * Constructs a new Read test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Read getFixture() {
		return (Read)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicviewFactory.eINSTANCE.createRead());
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

} //ReadTest
