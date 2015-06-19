/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.TargetElement#getTargetOf <em>Target Of</em>}</li>
 *   <li>{@link trace.TargetElement#getMapsTo <em>Maps To</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTargetElement()
 * @model
 * @generated
 */
public interface TargetElement extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Target Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TraceLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Of</em>' container reference.
	 * @see #setTargetOf(TraceLink)
	 * @see trace.TracePackage#getTargetElement_TargetOf()
	 * @see trace.TraceLink#getTargetElements
	 * @model opposite="targetElements" transient="false"
	 * @generated
	 */
	TraceLink getTargetOf();

	/**
	 * Sets the value of the '{@link trace.TargetElement#getTargetOf <em>Target Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Of</em>' container reference.
	 * @see #getTargetOf()
	 * @generated
	 */
	void setTargetOf(TraceLink value);

	/**
	 * Returns the value of the '<em><b>Maps To</b></em>' reference list.
	 * The list contents are of type {@link trace.SourceElement}.
	 * It is bidirectional and its opposite is '{@link trace.SourceElement#getMapsTo <em>Maps To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps To</em>' reference list.
	 * @see trace.TracePackage#getTargetElement_MapsTo()
	 * @see trace.SourceElement#getMapsTo
	 * @model opposite="mapsTo"
	 * @generated
	 */
	EList<SourceElement> getMapsTo();

} // TargetElement
