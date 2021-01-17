/**
 */
package com.github.icelyframework.dynamicview;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.dynamicview.ProcessOperation#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.ProcessOperation#getPolicy <em>Policy</em>}</li>
 *   <li>{@link com.github.icelyframework.dynamicview.ProcessOperation#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getProcessOperation()
 * @model
 * @generated
 */
public interface ProcessOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(ProcessOperation)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getProcessOperation_Delegate()
	 * @model
	 * @generated
	 */
	ProcessOperation getDelegate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.ProcessOperation#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(ProcessOperation value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(Policy)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getProcessOperation_Policy()
	 * @model containment="true"
	 * @generated
	 */
	Policy getPolicy();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.ProcessOperation#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(Policy value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.dynamicview.Process#getHasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(com.github.icelyframework.dynamicview.Process)
	 * @see com.github.icelyframework.dynamicview.DynamicviewPackage#getProcessOperation_Process()
	 * @see com.github.icelyframework.dynamicview.Process#getHasOperation
	 * @model opposite="hasOperation" required="true" transient="false"
	 * @generated
	 */
	com.github.icelyframework.dynamicview.Process getProcess();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.dynamicview.ProcessOperation#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(com.github.icelyframework.dynamicview.Process value);

} // ProcessOperation
