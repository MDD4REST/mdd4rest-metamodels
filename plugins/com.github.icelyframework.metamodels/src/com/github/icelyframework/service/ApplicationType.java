/**
 */
package com.github.icelyframework.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.service.ServicePackage#getApplicationType()
 * @model
 * @generated
 */
public enum ApplicationType implements Enumerator {
	/**
	 * The '<em><b>JHIPSTER MICROSERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_MICROSERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	JHIPSTER_MICROSERVICE(0, "JHIPSTER_MICROSERVICE", "JHIPSTER_MICROSERVICE"),

	/**
	 * The '<em><b>JHIPSTER GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	JHIPSTER_GATEWAY(1, "JHIPSTER_GATEWAY", "JHIPSTER_GATEWAY"),

	/**
	 * The '<em><b>JHIPSTER MONOLITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_MONOLITH_VALUE
	 * @generated
	 * @ordered
	 */
	JHIPSTER_MONOLITH(2, "JHIPSTER_MONOLITH", "JHIPSTER_MONOLITH"),

	/**
	 * The '<em><b>JHIPSTER UAA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_UAA_VALUE
	 * @generated
	 * @ordered
	 */
	JHIPSTER_UAA(3, "JHIPSTER_UAA", "JHIPSTER_UAA"),

	/**
	 * The '<em><b>SCULPTOR MICROSERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCULPTOR_MICROSERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SCULPTOR_MICROSERVICE(4, "SCULPTOR_MICROSERVICE", "SCULPTOR_MICROSERVICE"),

	/**
	 * The '<em><b>SCULPTOR MONOLITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCULPTOR_MONOLITH_VALUE
	 * @generated
	 * @ordered
	 */
	SCULPTOR_MONOLITH(5, "SCULPTOR_MONOLITH", "SCULPTOR_MONOLITH");

	/**
	 * The '<em><b>JHIPSTER MICROSERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_MICROSERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JHIPSTER_MICROSERVICE_VALUE = 0;

	/**
	 * The '<em><b>JHIPSTER GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JHIPSTER_GATEWAY_VALUE = 1;

	/**
	 * The '<em><b>JHIPSTER MONOLITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_MONOLITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JHIPSTER_MONOLITH_VALUE = 2;

	/**
	 * The '<em><b>JHIPSTER UAA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JHIPSTER_UAA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JHIPSTER_UAA_VALUE = 3;

	/**
	 * The '<em><b>SCULPTOR MICROSERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCULPTOR_MICROSERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCULPTOR_MICROSERVICE_VALUE = 4;

	/**
	 * The '<em><b>SCULPTOR MONOLITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCULPTOR_MONOLITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCULPTOR_MONOLITH_VALUE = 5;

	/**
	 * An array of all the '<em><b>Application Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationType[] VALUES_ARRAY =
		new ApplicationType[] {
			JHIPSTER_MICROSERVICE,
			JHIPSTER_GATEWAY,
			JHIPSTER_MONOLITH,
			JHIPSTER_UAA,
			SCULPTOR_MICROSERVICE,
			SCULPTOR_MONOLITH,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType get(int value) {
		switch (value) {
			case JHIPSTER_MICROSERVICE_VALUE: return JHIPSTER_MICROSERVICE;
			case JHIPSTER_GATEWAY_VALUE: return JHIPSTER_GATEWAY;
			case JHIPSTER_MONOLITH_VALUE: return JHIPSTER_MONOLITH;
			case JHIPSTER_UAA_VALUE: return JHIPSTER_UAA;
			case SCULPTOR_MICROSERVICE_VALUE: return SCULPTOR_MICROSERVICE;
			case SCULPTOR_MONOLITH_VALUE: return SCULPTOR_MONOLITH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ApplicationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ApplicationType
