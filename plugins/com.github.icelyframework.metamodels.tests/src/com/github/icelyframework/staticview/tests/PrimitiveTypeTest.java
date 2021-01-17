/**
 */
package com.github.icelyframework.staticview.tests;

import com.github.icelyframework.staticview.PrimitiveType;
import com.github.icelyframework.staticview.StaticviewFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitiveTypeTest extends SimpleTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrimitiveTypeTest.class);
	}

	/**
	 * Constructs a new Primitive Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Primitive Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrimitiveType getFixture() {
		return (PrimitiveType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StaticviewFactory.eINSTANCE.createPrimitiveType());
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

} //PrimitiveTypeTest
