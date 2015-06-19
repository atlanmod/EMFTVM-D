/**
 */
package trace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import java.util.List;

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
 *   <li>{@link trace.TraceProperty#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link trace.TraceProperty#getResolvedFor <em>Resolved For</em>}</li>
 *   <li>{@link trace.TraceProperty#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link trace.TraceProperty#isResolved <em>Resolved</em>}</li>
 *   <li>{@link trace.TraceProperty#getAppliedAt <em>Applied At</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTraceProperty()
 * @model
 * @extends KyanosEObject
 * @generated
 */
public interface TraceProperty extends KyanosEObject {
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
	 * @see trace.TracePackage#getTraceProperty_PropertyName()
	 * @model
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link trace.TraceProperty#getPropertyName <em>Property Name</em>}' attribute.
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
	 * @see #setResolvedFor(TargetElement)
	 * @see trace.TracePackage#getTraceProperty_ResolvedFor()
	 * @model required="true"
	 * @generated
	 */
	TargetElement getResolvedFor();

	/**
	 * Sets the value of the '{@link trace.TraceProperty#getResolvedFor <em>Resolved For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved For</em>' reference.
	 * @see #getResolvedFor()
	 * @generated
	 */
	void setResolvedFor(TargetElement value);

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
	 * @see trace.TracePackage#getTraceProperty_Resolvings()
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
	 * @see trace.TracePackage#getTraceProperty_Resolved()
	 * @model
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link trace.TraceProperty#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Applied At</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TraceLink#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied At</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied At</em>' container reference.
	 * @see #setAppliedAt(TraceLink)
	 * @see trace.TracePackage#getTraceProperty_AppliedAt()
	 * @see trace.TraceLink#getProperties
	 * @model opposite="properties" transient="false"
	 * @generated
	 */
	TraceLink getAppliedAt();

	/**
	 * Sets the value of the '{@link trace.TraceProperty#getAppliedAt <em>Applied At</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied At</em>' container reference.
	 * @see #getAppliedAt()
	 * @generated
	 */
	void setAppliedAt(TraceLink value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="trace.JavaList<?>" many="false"
	 * @generated
	 */
	List<?> resolveBinding(TraceLinkSet traces);

} // TraceProperty
