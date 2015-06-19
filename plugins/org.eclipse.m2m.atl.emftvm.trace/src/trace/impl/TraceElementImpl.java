/**
 */
package trace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import trace.TraceElement;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TraceElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link trace.impl.TraceElementImpl#getObject <em>Object</em>}</li>
 *   <li>{@link trace.impl.TraceElementImpl#getRuntimeObject <em>Runtime Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceElementImpl extends KyanosEObjectImpl implements TraceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TracePackage.Literals.TRACE_ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TracePackage.Literals.TRACE_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObject() {
		return (EObject)eGet(TracePackage.Literals.TRACE_ELEMENT__OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(EObject newObject) {
		eSet(TracePackage.Literals.TRACE_ELEMENT__OBJECT, newObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRuntimeObject() {
		return (Object)eGet(TracePackage.Literals.TRACE_ELEMENT__RUNTIME_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeObject(Object newRuntimeObject) {
		eSet(TracePackage.Literals.TRACE_ELEMENT__RUNTIME_OBJECT, newRuntimeObject);
	}

} //TraceElementImpl
