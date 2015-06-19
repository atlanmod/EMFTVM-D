/**
 */
package trace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.SourceElementList#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link trace.SourceElementList#getDefaultFor <em>Default For</em>}</li>
 *   <li>{@link trace.SourceElementList#getUniqueFor <em>Unique For</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getSourceElementList()
 * @model
 * @extends KyanosEObject
 * @generated
 */
public interface SourceElementList extends KyanosEObject {
	/**
	 * Returns the value of the '<em><b>Source Elements</b></em>' reference list.
	 * The list contents are of type {@link trace.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' reference list.
	 * @see trace.TracePackage#getSourceElementList_SourceElements()
	 * @model lower="2"
	 * @generated
	 */
	EList<SourceElement> getSourceElements();

	/**
	 * Returns the value of the '<em><b>Default For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TraceLinkSet#getDefaultSourceElementLists <em>Default Source Element Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default For</em>' container reference.
	 * @see #setDefaultFor(TraceLinkSet)
	 * @see trace.TracePackage#getSourceElementList_DefaultFor()
	 * @see trace.TraceLinkSet#getDefaultSourceElementLists
	 * @model opposite="defaultSourceElementLists" transient="false"
	 * @generated
	 */
	TraceLinkSet getDefaultFor();

	/**
	 * Sets the value of the '{@link trace.SourceElementList#getDefaultFor <em>Default For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default For</em>' container reference.
	 * @see #getDefaultFor()
	 * @generated
	 */
	void setDefaultFor(TraceLinkSet value);

	/**
	 * Returns the value of the '<em><b>Unique For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TracedRule#getUniqueSourceElementLists <em>Unique Source Element Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique For</em>' container reference.
	 * @see #setUniqueFor(TracedRule)
	 * @see trace.TracePackage#getSourceElementList_UniqueFor()
	 * @see trace.TracedRule#getUniqueSourceElementLists
	 * @model opposite="uniqueSourceElementLists" transient="false"
	 * @generated
	 */
	TracedRule getUniqueFor();

	/**
	 * Sets the value of the '{@link trace.SourceElementList#getUniqueFor <em>Unique For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique For</em>' container reference.
	 * @see #getUniqueFor()
	 * @generated
	 */
	void setUniqueFor(TracedRule value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" lower="2"
	 * @generated
	 */
	EList<Object> getSourceObjects();

} // SourceElementList
