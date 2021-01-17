/**
 */
package com.github.icelyframework.configuration.tests;

import com.github.icelyframework.configuration.ConfigurationFactory;
import com.github.icelyframework.configuration.GenerateOptions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generate Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerateOptionsTest extends TestCase {

	/**
	 * The fixture for this Generate Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateOptions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenerateOptionsTest.class);
	}

	/**
	 * Constructs a new Generate Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateOptionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Generate Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GenerateOptions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Generate Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerateOptions getFixture() {
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
		setFixture(ConfigurationFactory.eINSTANCE.createGenerateOptions());
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

} //GenerateOptionsTest
