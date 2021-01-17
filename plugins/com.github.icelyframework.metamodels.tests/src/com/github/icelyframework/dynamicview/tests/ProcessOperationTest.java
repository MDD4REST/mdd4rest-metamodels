/**
 */
package com.github.icelyframework.dynamicview.tests;

import com.github.icelyframework.dynamicview.DynamicviewFactory;
import com.github.icelyframework.dynamicview.ProcessOperation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessOperationTest extends OperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessOperationTest.class);
	}

	/**
	 * Constructs a new Process Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessOperation getFixture() {
		return (ProcessOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicviewFactory.eINSTANCE.createProcessOperation());
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

} //ProcessOperationTest
