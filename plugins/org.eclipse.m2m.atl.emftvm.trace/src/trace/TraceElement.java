/**
 */
package trace;

import fr.inria.atlanmod.kyanos.core.KyanosEObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trace.TraceElement#getName <em>Name</em>}</li>
 *   <li>{@link trace.TraceElement#getObject <em>Object</em>}</li>
 *   <li>{@link trace.TraceElement#getRuntimeObject <em>Runtime Object</em>}</li>
 * </ul>
 *
 * @see trace.TracePackage#getTraceElement()
 * @model abstract="true"
 * @extends KyanosEObject
 * @generated
 */
public interface TraceElement extends KyanosEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trace.TracePackage#getTraceElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trace.TraceElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(EObject)
	 * @see trace.TracePackage#getTraceElement_Object()
	 * @model
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link trace.TraceElement#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Object</em>' attribute.
	 * @see #setRuntimeObject(Object)
	 * @see trace.TracePackage#getTraceElement_RuntimeObject()
	 * @model transient="true"
	 * @generated
	 */
	Object getRuntimeObject();

	/**
	 * Sets the value of the '{@link trace.TraceElement#getRuntimeObject <em>Runtime Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Object</em>' attribute.
	 * @see #getRuntimeObject()
	 * @generated
	 */
	void setRuntimeObject(Object value);

} // TraceElement
