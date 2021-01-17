/**
 */
package com.github.icelyframework.deployment.tests;

import com.github.icelyframework.deployment.ApplicationDeployment;
import com.github.icelyframework.deployment.DeploymentFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Deployment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationDeploymentTest extends TestCase {

	/**
	 * The fixture for this Application Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDeployment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationDeploymentTest.class);
	}

	/**
	 * Constructs a new Application Deployment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDeploymentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Application Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApplicationDeployment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Application Deployment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDeployment getFixture() {
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
		setFixture(DeploymentFactory.eINSTANCE.createApplicationDeployment());
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

} //ApplicationDeploymentTest
