/**
 */
package com.github.icelyframework.jdl.tests;

import com.github.icelyframework.jdl.BidirectionalRelationship;
import com.github.icelyframework.jdl.JdlFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bidirectional Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BidirectionalRelationshipTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BidirectionalRelationshipTest.class);
	}

	/**
	 * Constructs a new Bidirectional Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BidirectionalRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bidirectional Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BidirectionalRelationship getFixture() {
		return (BidirectionalRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JdlFactory.eINSTANCE.createBidirectionalRelationship());
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

} //BidirectionalRelationshipTest
