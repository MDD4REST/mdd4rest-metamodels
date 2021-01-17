/**
 */
package com.github.icelyframework.service.tests;

import com.github.icelyframework.service.HasAnyAuthorities;
import com.github.icelyframework.service.ServiceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Has Any Authorities</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HasAnyAuthoritiesTest extends PermissionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HasAnyAuthoritiesTest.class);
	}

	/**
	 * Constructs a new Has Any Authorities test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasAnyAuthoritiesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Has Any Authorities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HasAnyAuthorities getFixture() {
		return (HasAnyAuthorities)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceFactory.eINSTANCE.createHasAnyAuthorities());
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

} //HasAnyAuthoritiesTest
