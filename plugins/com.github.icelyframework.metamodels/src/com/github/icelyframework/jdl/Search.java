/**
 */
package com.github.icelyframework.jdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.jdl.Search#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.github.icelyframework.jdl.Search#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.jdl.JdlPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link com.github.icelyframework.jdl.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see com.github.icelyframework.jdl.JdlPackage#getSearch_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.jdl.SearchEngine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.SearchEngine
	 * @see #setValue(SearchEngine)
	 * @see com.github.icelyframework.jdl.JdlPackage#getSearch_Value()
	 * @model
	 * @generated
	 */
	SearchEngine getValue();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.jdl.Search#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see com.github.icelyframework.jdl.SearchEngine
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SearchEngine value);
} // Search
