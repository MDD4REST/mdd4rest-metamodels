/**
 */
package com.github.icelyframework.jdl.tests;

import com.github.icelyframework.jdl.JDL;
import com.github.icelyframework.jdl.JdlFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>JDL</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JDLTest extends TestCase {

	/**
	 * The fixture for this JDL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JDL fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JDLTest.class);
	}

	/**
	 * Constructs a new JDL test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JDLTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this JDL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JDL fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this JDL test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JDL getFixture() {
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
		setFixture(JdlFactory.eINSTANCE.createJDL());
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

} //JDLTest
