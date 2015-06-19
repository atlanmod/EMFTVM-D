/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvedFor <em>Resolved For</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getAppliedAt <em>Applied At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty()
 * @model
 * @extends KyanosEObject
 * @generated
 */
public interface FTraceProperty extends KyanosEObject {
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
	 * Returns the value of the '<em><b>Resolved For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved For</em>' reference.
	 * @see #setResolvedFor(FTargetElement)
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_ResolvedFor()
	 * @model required="true"
	 * @generated
	 */
	FTargetElement getResolvedFor();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvedFor <em>Resolved For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved For</em>' reference.
	 * @see #getResolvedFor()
	 * @generated
	 */
	void setResolvedFor(FTargetElement value);

	/**
	 * Returns the value of the '<em><b>Resolvings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolvings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolvings</em>' reference list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_Resolvings()
	 * @model
	 * @generated
	 */
	EList<EObject> getResolvings();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_Resolved()
	 * @model
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Applied At</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied At</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied At</em>' container reference.
	 * @see #setAppliedAt(FLink)
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFTraceProperty_AppliedAt()
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getProperties
	 * @model opposite="properties" transient="false"
	 * @generated
	 */
	FLink getAppliedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getAppliedAt <em>Applied At</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied At</em>' container reference.
	 * @see #getAppliedAt()
	 * @generated
	 */
	void setAppliedAt(FLink value);

} // FTraceProperty
