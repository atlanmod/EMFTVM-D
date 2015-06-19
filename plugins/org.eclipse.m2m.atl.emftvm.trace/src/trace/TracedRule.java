/**
 */
package trace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.TracedRule#getRule <em>Rule</em>}</li>
 *   <li>{@link trace.TracedRule#getLinks <em>Links</em>}</li>
 *   <li>{@link trace.TracedRule#getLinkSet <em>Link Set</em>}</li>
 *   <li>{@link trace.TracedRule#getUniqueSourceElements <em>Unique Source Elements</em>}</li>
 *   <li>{@link trace.TracedRule#getUniqueSourceElementLists <em>Unique Source Element Lists</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTracedRule()
 * @model
 * @extends KyanosEObject
 * @generated
 */
public interface TracedRule extends KyanosEObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see trace.TracePackage#getTracedRule_Rule()
	 * @model required="true"
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link trace.TracedRule#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link trace.TraceLink}.
	 * It is bidirectional and its opposite is '{@link trace.TraceLink#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see trace.TracePackage#getTracedRule_Links()
	 * @see trace.TraceLink#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<TraceLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Link Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link trace.TraceLinkSet#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Set</em>' container reference.
	 * @see #setLinkSet(TraceLinkSet)
	 * @see trace.TracePackage#getTracedRule_LinkSet()
	 * @see trace.TraceLinkSet#getRules
	 * @model opposite="rules" transient="false"
	 * @generated
	 */
	TraceLinkSet getLinkSet();

	/**
	 * Sets the value of the '{@link trace.TracedRule#getLinkSet <em>Link Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Set</em>' container reference.
	 * @see #getLinkSet()
	 * @generated
	 */
	void setLinkSet(TraceLinkSet value);

	/**
	 * Returns the value of the '<em><b>Unique Source Elements</b></em>' reference list.
	 * The list contents are of type {@link trace.SourceElement}.
	 * It is bidirectional and its opposite is '{@link trace.SourceElement#getUniqueFor <em>Unique For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Source Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Source Elements</em>' reference list.
	 * @see trace.TracePackage#getTracedRule_UniqueSourceElements()
	 * @see trace.SourceElement#getUniqueFor
	 * @model opposite="uniqueFor"
	 * @generated
	 */
	EList<SourceElement> getUniqueSourceElements();

	/**
	 * Returns the value of the '<em><b>Unique Source Element Lists</b></em>' containment reference list.
	 * The list contents are of type {@link trace.SourceElementList}.
	 * It is bidirectional and its opposite is '{@link trace.SourceElementList#getUniqueFor <em>Unique For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Source Element Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Source Element Lists</em>' containment reference list.
	 * @see trace.TracePackage#getTracedRule_UniqueSourceElementLists()
	 * @see trace.SourceElementList#getUniqueFor
	 * @model opposite="uniqueFor" containment="true"
	 * @generated
	 */
	EList<SourceElementList> getUniqueSourceElementLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SourceElement getUniqueSourceElement(Object sourceElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceElementsDataType="trace.JavaList<?>" sourceElementsMany="false"
	 * @generated
	 */
	SourceElementList getUniqueSourceElements(List<?> sourceElements);

} // TracedRule
