/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import fr.inria.atlanmod.neoemf.core.NeoEMFEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvedFor <em>Resolved For</em>}</li>
 * </ul>
 *
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty()
 * @model
 * @extends NeoEMFEObject
 * @generated
 */
public interface FTraceProperty extends NeoEMFEObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_PropertyName()
	 * @model
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Resolved For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved For</em>' attribute.
	 * @see #setResolvedFor(String)
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_ResolvedFor()
	 * @model
	 * @generated
	 */
	String getResolvedFor();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvedFor <em>Resolved For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved For</em>' attribute.
	 * @see #getResolvedFor()
	 * @generated
	 */
	void setResolvedFor(String value);

	/**
	 * Returns the value of the '<em><b>Resolvings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolvings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolvings</em>' attribute list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_Resolvings()
	 * @model
	 * @generated
	 */
	EList<String> getResolvings();

} // FTraceProperty
