/**
 */
package trace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.TraceLink#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link trace.TraceLink#getTargetElements <em>Target Elements</em>}</li>
 *   <li>{@link trace.TraceLink#getRule <em>Rule</em>}</li>
 *   <li>{@link trace.TraceLink#isOverridden <em>Overridden</em>}</li>
 *   <li>{@link trace.TraceLink#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTraceLink()
 * @model
 * @extends KyanosEObject
 * @generated
 */
public interface TraceLink extends KyanosEObject {
	/**
	 * Returns the value of the '<em><b>Source Elements</b></em>' containment reference list.
	 * The list contents are of type {@link trace.SourceElement}.
	 * It is bidirectional and its opposite is '{@link trace.SourceElement#getSourceOf <em>Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' containment reference list.
	 * @see trace.TracePackage#getTraceLink_SourceElements()
	 * @see trace.SourceElement#getSourceOf
	 * @model opposite="sourceOf" containment="true"
	 * @generated
	 */
	EList<SourceElement> getSourceElements();

	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' containment reference list.
	 * The list contents are of type {@link trace.TargetElement}.
	 * It is bidirectional and its opposite is '{@link trace.TargetElement#getTargetOf <em>Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' containment reference list.
	 * @see trace.TracePackage#getTraceLink_TargetElements()
	 * @see trace.TargetElement#getTargetOf
	 * @model opposite="targetOf" containment="true"
	 * @generated
	 */
	EList<TargetElement> getTargetElements();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TracedRule#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(TracedRule)
	 * @see trace.TracePackage#getTraceLink_Rule()
	 * @see trace.TracedRule#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	TracedRule getRule();

	/**
	 * Sets the value of the '{@link trace.TraceLink#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(TracedRule value);

	/**
	 * Returns the value of the '<em><b>Overridden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overridden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden</em>' attribute.
	 * @see #setOverridden(boolean)
	 * @see trace.TracePackage#getTraceLink_Overridden()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isOverridden();

	/**
	 * Sets the value of the '{@link trace.TraceLink#isOverridden <em>Overridden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overridden</em>' attribute.
	 * @see #isOverridden()
	 * @generated
	 */
	void setOverridden(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link trace.TraceProperty}.
	 * It is bidirectional and its opposite is '{@link trace.TraceProperty#getAppliedAt <em>Applied At</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see trace.TracePackage#getTraceLink_Properties()
	 * @see trace.TraceProperty#getAppliedAt
	 * @model opposite="appliedAt" containment="true"
	 * @generated
	 */
	EList<TraceProperty> getProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SourceElement getSourceElement(String name, boolean create);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TargetElement getTargetElement(String name);

} // TraceLink
