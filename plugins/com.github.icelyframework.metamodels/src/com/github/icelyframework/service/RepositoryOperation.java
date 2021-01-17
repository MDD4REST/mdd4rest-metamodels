/**
 */
package com.github.icelyframework.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.RepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}</li>
 *   <li>{@link com.github.icelyframework.service.RepositoryOperation#isAccessObjectName <em>Access Object Name</em>}</li>
 *   <li>{@link com.github.icelyframework.service.RepositoryOperation#getRepository <em>Repository</em>}</li>
 *   <li>{@link com.github.icelyframework.service.RepositoryOperation#getQuery <em>Query</em>}</li>
 *   <li>{@link com.github.icelyframework.service.RepositoryOperation#getSelect <em>Select</em>}</li>
 *   <li>{@link com.github.icelyframework.service.RepositoryOperation#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation()
 * @model
 * @generated
 */
public interface RepositoryOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Delegate To Access Object</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate To Access Object</em>' attribute.
	 * @see #setDelegateToAccessObject(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation_DelegateToAccessObject()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDelegateToAccessObject();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.RepositoryOperation#isDelegateToAccessObject <em>Delegate To Access Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate To Access Object</em>' attribute.
	 * @see #isDelegateToAccessObject()
	 * @generated
	 */
	void setDelegateToAccessObject(boolean value);

	/**
	 * Returns the value of the '<em><b>Access Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Object Name</em>' attribute.
	 * @see #setAccessObjectName(boolean)
	 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation_AccessObjectName()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAccessObjectName();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.RepositoryOperation#isAccessObjectName <em>Access Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Object Name</em>' attribute.
	 * @see #isAccessObjectName()
	 * @generated
	 */
	void setAccessObjectName(boolean value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Repository#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation_Repository()
	 * @see com.github.icelyframework.service.Repository#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.RepositoryOperation#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.RepositoryOperation#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' attribute.
	 * @see #setSelect(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation_Select()
	 * @model
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.RepositoryOperation#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see com.github.icelyframework.service.ServicePackage#getRepositoryOperation_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.RepositoryOperation#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // RepositoryOperation
