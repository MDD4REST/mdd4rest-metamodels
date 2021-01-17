/**
 */
package com.github.icelyframework.service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getResource <em>Resource</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getReturnString <em>Return String</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getPath <em>Path</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getContentType <em>Content Type</em>}</li>
 *   <li>{@link com.github.icelyframework.service.ResourceOperation#getResourceParams <em>Resource Params</em>}</li>
 * </ul>
 *
 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation()
 * @model
 * @generated
 */
public interface ResourceOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.github.icelyframework.service.Resource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(Resource)
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_Resource()
	 * @see com.github.icelyframework.service.Resource#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceOperation#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.icelyframework.service.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see com.github.icelyframework.service.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_HttpMethod()
	 * @model unique="false"
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see com.github.icelyframework.service.HttpMethod
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
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_Delegate()
	 * @model
	 * @generated
	 */
	ServiceOperation getDelegate();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceOperation#getDelegate <em>Delegate</em>}' reference.
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
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_ReturnString()
	 * @model unique="false"
	 * @generated
	 */
	String getReturnString();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceOperation#getReturnString <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return String</em>' attribute.
	 * @see #getReturnString()
	 * @generated
	 */
	void setReturnString(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_Path()
	 * @model containment="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceOperation#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link com.github.icelyframework.service.ResourceOperation#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Resource Params</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.icelyframework.service.ResourceParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Params</em>' containment reference list.
	 * @see com.github.icelyframework.service.ServicePackage#getResourceOperation_ResourceParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceParam> getResourceParams();

} // ResourceOperation
