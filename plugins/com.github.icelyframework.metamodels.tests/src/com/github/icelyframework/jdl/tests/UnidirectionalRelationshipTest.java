/**
 */
package com.github.icelyframework.jdl.tests;

import com.github.icelyframework.jdl.JdlFactory;
import com.github.icelyframework.jdl.UnidirectionalRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unidirectional Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnidirectionalRelationshipTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnidirectionalRelationshipTest.class);
	}

	/**
	 * Constructs a new Unidirectional Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnidirectionalRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unidirectional Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnidirectionalRelationship getFixture() {
		return (UnidirectionalRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JdlFactory.eINSTANCE.createUnidirectionalRelationship());
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

} //UnidirectionalRelationshipTest
