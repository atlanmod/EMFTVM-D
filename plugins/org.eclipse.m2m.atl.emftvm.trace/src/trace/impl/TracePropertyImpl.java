/**
 */
package trace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import trace.TargetElement;
import trace.TraceLink;
import trace.TraceLinkSet;
import trace.TracePackage;
import trace.TraceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TracePropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link trace.impl.TracePropertyImpl#getResolvedFor <em>Resolved For</em>}</li>
 *   <li>{@link trace.impl.TracePropertyImpl#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link trace.impl.TracePropertyImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link trace.impl.TracePropertyImpl#getAppliedAt <em>Applied At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracePropertyImpl extends KyanosEObjectImpl implements TraceProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE_PROPERTY;
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
	public String getPropertyName() {
		return (String)eGet(TracePackage.Literals.TRACE_PROPERTY__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		eSet(TracePackage.Literals.TRACE_PROPERTY__PROPERTY_NAME, newPropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement getResolvedFor() {
		return (TargetElement)eGet(TracePackage.Literals.TRACE_PROPERTY__RESOLVED_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedFor(TargetElement newResolvedFor) {
		eSet(TracePackage.Literals.TRACE_PROPERTY__RESOLVED_FOR, newResolvedFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getResolvings() {
		return (EList<EObject>)eGet(TracePackage.Literals.TRACE_PROPERTY__RESOLVINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return (Boolean)eGet(TracePackage.Literals.TRACE_PROPERTY__RESOLVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		eSet(TracePackage.Literals.TRACE_PROPERTY__RESOLVED, newResolved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getAppliedAt() {
		return (TraceLink)eGet(TracePackage.Literals.TRACE_PROPERTY__APPLIED_AT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedAt(TraceLink newAppliedAt) {
		eSet(TracePackage.Literals.TRACE_PROPERTY__APPLIED_AT, newAppliedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> resolveBinding(TraceLinkSet traces) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TracePackage.TRACE_PROPERTY___RESOLVE_BINDING__TRACELINKSET:
				return resolveBinding((TraceLinkSet)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TracePropertyImpl
