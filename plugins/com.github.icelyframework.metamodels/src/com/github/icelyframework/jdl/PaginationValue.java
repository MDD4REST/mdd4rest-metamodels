/**
 */
package com.github.icelyframework.jdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pagination Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.jdl.JdlPackage#getPaginationValue()
 * @model
 * @generated
 */
public enum PaginationValue implements Enumerator {
	/**
	 * The '<em><b>PAGINATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGINATION_VALUE
	 * @generated
	 * @ordered
	 */
	PAGINATION(0, "PAGINATION", "PAGINATION"),

	/**
	 * The '<em><b>NO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(1, "NO", "NO"),

	/**
	 * The '<em><b>INFINITE SCROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE_SCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	INFINITE_SCROLL(2, "INFINITE_SCROLL", "INFINITE_SCROLL");

	/**
	 * The '<em><b>PAGINATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGINATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGINATION_VALUE = 0;

	/**
	 * The '<em><b>NO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 1;

	/**
	 * The '<em><b>INFINITE SCROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE_SCROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFINITE_SCROLL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Pagination Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaginationValue[] VALUES_ARRAY =
		new PaginationValue[] {
			PAGINATION,
			NO,
			INFINITE_SCROLL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pagination Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaginationValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pagination Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaginationValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaginationValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pagination Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaginationValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaginationValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pagination Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaginationValue get(int value) {
		switch (value) {
			case PAGINATION_VALUE: return PAGINATION;
			case NO_VALUE: return NO;
			case INFINITE_SCROLL_VALUE: return INFINITE_SCROLL;
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
	private PaginationValue(int value, String name, String literal) {
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
	
} //PaginationValue
