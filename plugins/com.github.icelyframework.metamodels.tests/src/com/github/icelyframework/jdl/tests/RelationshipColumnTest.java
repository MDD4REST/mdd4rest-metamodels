/**
 */
package com.github.icelyframework.jdl.tests;

import com.github.icelyframework.jdl.JdlFactory;
import com.github.icelyframework.jdl.RelationshipColumn;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipColumnTest extends TestCase {

	/**
	 * The fixture for this Relationship Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipColumn fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationshipColumnTest.class);
	}

	/**
	 * Constructs a new Relationship Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipColumnTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relationship Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelationshipColumn fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relationship Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipColumn getFixture() {
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
		setFixture(JdlFactory.eINSTANCE.createRelationshipColumn());
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

} //RelationshipColumnTest
