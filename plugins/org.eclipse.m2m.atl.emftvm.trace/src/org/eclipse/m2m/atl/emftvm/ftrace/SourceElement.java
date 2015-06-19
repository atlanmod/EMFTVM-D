/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.SourceElement#isMapsToSelf <em>Maps To Self</em>}</li>
 * </ul>
 *
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends TraceElement {
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
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#getSourceElement_MapsToSelf()
	 * @model
	 * @generated
	 */
	boolean isMapsToSelf();

	/**
	 * Sets the value of the '{@link org.eclipse.m2m.atl.emftvm.ftrace.SourceElement#isMapsToSelf <em>Maps To Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps To Self</em>' attribute.
	 * @see #isMapsToSelf()
	 * @generated
	 */
	void setMapsToSelf(boolean value);

} // SourceElement
