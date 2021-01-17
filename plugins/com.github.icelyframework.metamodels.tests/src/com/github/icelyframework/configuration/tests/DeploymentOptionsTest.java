/**
 */
package com.github.icelyframework.configuration.tests;

import com.github.icelyframework.configuration.ConfigurationFactory;
import com.github.icelyframework.configuration.DeploymentOptions;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentOptionsTest extends TestCase {

	/**
	 * The fixture for this Deployment Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentOptions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeploymentOptionsTest.class);
	}

	/**
	 * Constructs a new Deployment Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentOptionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Deployment Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeploymentOptions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Deployment Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentOptions getFixture() {
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
		setFixture(ConfigurationFactory.eINSTANCE.createDeploymentOptions());
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

} //DeploymentOptionsTest
