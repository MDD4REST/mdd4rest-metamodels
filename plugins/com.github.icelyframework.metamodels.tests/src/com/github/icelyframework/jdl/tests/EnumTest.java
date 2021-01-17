/**
 */
package com.github.icelyframework.jdl.tests;

import com.github.icelyframework.jdl.JdlFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumTest extends TestCase {

	/**
	 * The fixture for this Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected com.github.icelyframework.jdl.Enum fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumTest.class);
	}

	/**
	 * Constructs a new Enum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(com.github.icelyframework.jdl.Enum fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected com.github.icelyframework.jdl.Enum getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JdlFactory.eINSTANCE.createEnum());
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

} //EnumTest
