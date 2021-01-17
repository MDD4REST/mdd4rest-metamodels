/**
 */
package com.github.icelyframework.jdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cache Provider Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.github.icelyframework.jdl.JdlPackage#getCacheProviderType()
 * @model
 * @generated
 */
public enum CacheProviderType implements Enumerator {
	/**
	 * The '<em><b>EHCACHE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EHCACHE_VALUE
	 * @generated
	 * @ordered
	 */
	EHCACHE(0, "EHCACHE", "EHCACHE"),

	/**
	 * The '<em><b>HAZELCAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAZELCAST_VALUE
	 * @generated
	 * @ordered
	 */
	HAZELCAST(1, "HAZELCAST", "HAZELCAST"),

	/**
	 * The '<em><b>CAFFEINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAFFEINE_VALUE
	 * @generated
	 * @ordered
	 */
	CAFFEINE(2, "CAFFEINE", "CAFFEINE"),

	/**
	 * The '<em><b>MEMCACHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMCACHED_VALUE
	 * @generated
	 * @ordered
	 */
	MEMCACHED(3, "MEMCACHED", "MEMCACHED"),

	/**
	 * The '<em><b>REDIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIS_VALUE
	 * @generated
	 * @ordered
	 */
	REDIS(4, "REDIS", "REDIS"),

	/**
	 * The '<em><b>NO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(5, "NO", "NO");

	/**
	 * The '<em><b>EHCACHE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EHCACHE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EHCACHE_VALUE = 0;

	/**
	 * The '<em><b>HAZELCAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAZELCAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HAZELCAST_VALUE = 1;

	/**
	 * The '<em><b>CAFFEINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAFFEINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAFFEINE_VALUE = 2;

	/**
	 * The '<em><b>MEMCACHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMCACHED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMCACHED_VALUE = 3;

	/**
	 * The '<em><b>REDIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIS_VALUE = 4;

	/**
	 * The '<em><b>NO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Cache Provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CacheProviderType[] VALUES_ARRAY =
		new CacheProviderType[] {
			EHCACHE,
			HAZELCAST,
			CAFFEINE,
			MEMCACHED,
			REDIS,
			NO,
		};

	/**
	 * A public read-only list of all the '<em><b>Cache Provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CacheProviderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cache Provider Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheProviderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheProviderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Provider Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheProviderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheProviderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Provider Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheProviderType get(int value) {
		switch (value) {
			case EHCACHE_VALUE: return EHCACHE;
			case HAZELCAST_VALUE: return HAZELCAST;
			case CAFFEINE_VALUE: return CAFFEINE;
			case MEMCACHED_VALUE: return MEMCACHED;
			case REDIS_VALUE: return REDIS;
			case NO_VALUE: return NO;
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
	private CacheProviderType(int value, String name, String literal) {
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
	
} //CacheProviderType
