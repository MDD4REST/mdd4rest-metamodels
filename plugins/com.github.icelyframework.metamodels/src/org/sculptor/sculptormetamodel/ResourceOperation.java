/**
 */
package org.sculptor.sculptormetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sculptor.sculptormetamodel.ResourceOperation#getResource <em>Resource</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.ResourceOperation#getPath <em>Path</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.ResourceOperation#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.ResourceOperation#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.sculptor.sculptormetamodel.ResourceOperation#getReturnString <em>Return String</em>}</li>
 * </ul>
 *
 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResourceOperation()
 * @model
 * @generated
 */
public interface ResourceOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sculptor.sculptormetamodel.Resource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(Resource)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResourceOperation_Resource()
	 * @see org.sculptor.sculptormetamodel.Resource#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.ResourceOperation#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResourceOperation_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.ResourceOperation#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sculptor.sculptormetamodel.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see org.sculptor.sculptormetamodel.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResourceOperation_HttpMethod()
	 * @model unique="false"
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.ResourceOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see org.sculptor.sculptormetamodel.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(ServiceOperation)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResourceOperation_Delegate()
	 * @model
	 * @generated
	 */
	ServiceOperation getDelegate();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.ResourceOperation#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(ServiceOperation value);

	/**
	 * Returns the value of the '<em><b>Return String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return String</em>' attribute.
	 * @see #setReturnString(String)
	 * @see org.sculptor.sculptormetamodel.SculptormetamodelPackage#getResourceOperation_ReturnString()
	 * @model unique="false"
	 * @generated
	 */
	String getReturnString();

	/**
	 * Sets the value of the '{@link org.sculptor.sculptormetamodel.ResourceOperation#getReturnString <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return String</em>' attribute.
	 * @see #getReturnString()
	 * @generated
	 */
	void setReturnString(String value);

} // ResourceOperation
