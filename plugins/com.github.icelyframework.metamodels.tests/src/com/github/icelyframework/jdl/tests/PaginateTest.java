/**
 */
package com.github.icelyframework.jdl.tests;

import com.github.icelyframework.jdl.JdlFactory;
import com.github.icelyframework.jdl.Paginate;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paginate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaginateTest extends TestCase {

	/**
	 * The fixture for this Paginate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Paginate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaginateTest.class);
	}

	/**
	 * Constructs a new Paginate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Paginate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Paginate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Paginate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Paginate getFixture() {
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
		setFixture(JdlFactory.eINSTANCE.createPaginate());
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

} //PaginateTest
