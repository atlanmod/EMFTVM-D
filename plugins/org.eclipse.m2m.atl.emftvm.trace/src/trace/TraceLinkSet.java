/**
 */
package trace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.TraceLinkSet#getRules <em>Rules</em>}</li>
 *   <li>{@link trace.TraceLinkSet#getDefaultSourceElements <em>Default Source Elements</em>}</li>
 *   <li>{@link trace.TraceLinkSet#getDefaultSourceElementLists <em>Default Source Element Lists</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTraceLinkSet()
 * @model
 * @extends KyanosEObject
 * @generated
 */
public interface TraceLinkSet extends KyanosEObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link trace.TracedRule}.
	 * It is bidirectional and its opposite is '{@link trace.TracedRule#getLinkSet <em>Link Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see trace.TracePackage#getTraceLinkSet_Rules()
	 * @see trace.TracedRule#getLinkSet
	 * @model opposite="linkSet" containment="true"
	 * @generated
	 */
	EList<TracedRule> getRules();

	/**
	 * Returns the value of the '<em><b>Default Source Elements</b></em>' reference list.
	 * The list contents are of type {@link trace.SourceElement}.
	 * It is bidirectional and its opposite is '{@link trace.SourceElement#getDefaultFor <em>Default For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Source Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Source Elements</em>' reference list.
	 * @see trace.TracePackage#getTraceLinkSet_DefaultSourceElements()
	 * @see trace.SourceElement#getDefaultFor
	 * @model opposite="defaultFor"
	 * @generated
	 */
	EList<SourceElement> getDefaultSourceElements();

	/**
	 * Returns the value of the '<em><b>Default Source Element Lists</b></em>' containment reference list.
	 * The list contents are of type {@link trace.SourceElementList}.
	 * It is bidirectional and its opposite is '{@link trace.SourceElementList#getDefaultFor <em>Default For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Source Element Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Source Element Lists</em>' containment reference list.
	 * @see trace.TracePackage#getTraceLinkSet_DefaultSourceElementLists()
	 * @see trace.SourceElementList#getDefaultFor
	 * @model opposite="defaultFor" containment="true"
	 * @generated
	 */
	EList<SourceElementList> getDefaultSourceElementLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SourceElement getDefaultSourceElement(Object sourceElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceElementsDataType="trace.JavaList<?>" sourceElementsMany="false"
	 * @generated
	 */
	SourceElementList getDefaultSourceElements(List<?> sourceElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TracedRule getLinksByRule(String rule, boolean create);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

} // TraceLinkSet
