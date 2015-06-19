/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.m2m.atl.emftvm.trace.TraceLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FLink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink()
 * @model annotation="Descrition ruleName='this attribute contains the name of the matched rule'"
 * @extends KyanosEObject
 * @generated
 */
public interface FLink extends KyanosEObject {
	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_RuleName()
	 * @model required="true"
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<FSourceElement> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_Targets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FTargetElement> getTargets();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getAppliedAt <em>Applied At</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_Properties()
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getAppliedAt
	 * @model opposite="appliedAt" containment="true"
	 * @generated
	 */
	EList<FTraceProperty> getProperties();

	void flatten(TraceLink currentMatch);


} // FLink
