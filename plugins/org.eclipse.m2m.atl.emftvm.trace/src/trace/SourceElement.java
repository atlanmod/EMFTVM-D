/**
 */
package trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.SourceElement#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link trace.SourceElement#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link trace.SourceElement#getDefaultFor <em>Default For</em>}</li>
 *   <li>{@link trace.SourceElement#getUniqueFor <em>Unique For</em>}</li>
 *   <li>{@link trace.SourceElement#isMapsToSelf <em>Maps To Self</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Source Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TraceLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of</em>' container reference.
	 * @see #setSourceOf(TraceLink)
	 * @see trace.TracePackage#getSourceElement_SourceOf()
	 * @see trace.TraceLink#getSourceElements
	 * @model opposite="sourceElements" transient="false"
	 * @generated
	 */
	TraceLink getSourceOf();

	/**
	 * Sets the value of the '{@link trace.SourceElement#getSourceOf <em>Source Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Of</em>' container reference.
	 * @see #getSourceOf()
	 * @generated
	 */
	void setSourceOf(TraceLink value);

	/**
	 * Returns the value of the '<em><b>Maps To</b></em>' reference list.
	 * The list contents are of type {@link trace.TargetElement}.
	 * It is bidirectional and its opposite is '{@link trace.TargetElement#getMapsTo <em>Maps To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps To</em>' reference list.
	 * @see trace.TracePackage#getSourceElement_MapsTo()
	 * @see trace.TargetElement#getMapsTo
	 * @model opposite="mapsTo"
	 * @generated
	 */
	EList<TargetElement> getMapsTo();

	/**
	 * Returns the value of the '<em><b>Default For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link trace.TraceLinkSet#getDefaultSourceElements <em>Default Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default For</em>' reference.
	 * @see #setDefaultFor(TraceLinkSet)
	 * @see trace.TracePackage#getSourceElement_DefaultFor()
	 * @see trace.TraceLinkSet#getDefaultSourceElements
	 * @model opposite="defaultSourceElements"
	 * @generated
	 */
	TraceLinkSet getDefaultFor();

	/**
	 * Sets the value of the '{@link trace.SourceElement#getDefaultFor <em>Default For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default For</em>' reference.
	 * @see #getDefaultFor()
	 * @generated
	 */
	void setDefaultFor(TraceLinkSet value);

	/**
	 * Returns the value of the '<em><b>Unique For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link trace.TracedRule#getUniqueSourceElements <em>Unique Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique For</em>' reference.
	 * @see #setUniqueFor(TracedRule)
	 * @see trace.TracePackage#getSourceElement_UniqueFor()
	 * @see trace.TracedRule#getUniqueSourceElements
	 * @model opposite="uniqueSourceElements"
	 * @generated
	 */
	TracedRule getUniqueFor();

	/**
	 * Sets the value of the '{@link trace.SourceElement#getUniqueFor <em>Unique For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique For</em>' reference.
	 * @see #getUniqueFor()
	 * @generated
	 */
	void setUniqueFor(TracedRule value);

	/**
	 * Returns the value of the '<em><b>Maps To Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps To Self</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps To Self</em>' attribute.
	 * @see #setMapsToSelf(boolean)
	 * @see trace.TracePackage#getSourceElement_MapsToSelf()
	 * @model required="true"
	 * @generated
	 */
	boolean isMapsToSelf();

	/**
	 * Sets the value of the '{@link trace.SourceElement#isMapsToSelf <em>Maps To Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps To Self</em>' attribute.
	 * @see #isMapsToSelf()
	 * @generated
	 */
	void setMapsToSelf(boolean value);

} // SourceElement
