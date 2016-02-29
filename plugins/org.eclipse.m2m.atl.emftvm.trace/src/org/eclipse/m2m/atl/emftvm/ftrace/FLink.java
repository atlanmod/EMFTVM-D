/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import fr.inria.atlanmod.neoemf.core.NeoEMFEObject;

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
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink()
 * @model annotation="Descrition ruleName='this attribute contains the name of the matched rule and a list of unresolved bindings stored per binding name\n'"
 * @extends NeoEMFEObject
 * @generated
 */
public interface FLink extends NeoEMFEObject {
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
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTraceProperty> getProperties();

	void flatten(TraceLink currentMatch);


} // FLink
