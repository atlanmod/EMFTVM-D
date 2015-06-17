/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink()
 * @model annotation="Descrition ruleName='this attribute contains the name of the matched rule' sourceElements='A string representation of the list of source elements. \nEach item  represents a source pattern element along with the associated eObject as follows \"pattern_element : eObjectURI\".\n '"
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
	 * Returns the value of the '<em><b>Source Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' attribute list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_SourceElements()
	 * @model default=""
	 * @generated
	 */
	EList<String> getSourceElements();

	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' attribute list.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getFLink_TargetElements()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTargetElements();

} // FLink
