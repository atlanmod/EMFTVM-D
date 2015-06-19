/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl#getResolvedFor <em>Resolved For</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl#getAppliedAt <em>Applied At</em>}</li>
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
		return FTracePackage.Literals.TRACE_PROPERTY;
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
		return (String)eGet(FTracePackage.Literals.TRACE_PROPERTY__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		eSet(FTracePackage.Literals.TRACE_PROPERTY__PROPERTY_NAME, newPropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTargetElement getResolvedFor() {
		return (FTargetElement)eGet(FTracePackage.Literals.TRACE_PROPERTY__RESOLVED_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedFor(FTargetElement newResolvedFor) {
		eSet(FTracePackage.Literals.TRACE_PROPERTY__RESOLVED_FOR, newResolvedFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getResolvings() {
		return (EList<EObject>)eGet(FTracePackage.Literals.TRACE_PROPERTY__RESOLVINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return (Boolean)eGet(FTracePackage.Literals.TRACE_PROPERTY__RESOLVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		eSet(FTracePackage.Literals.TRACE_PROPERTY__RESOLVED, newResolved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FLink getAppliedAt() {
		return (FLink)eGet(FTracePackage.Literals.TRACE_PROPERTY__APPLIED_AT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedAt(FLink newAppliedAt) {
		eSet(FTracePackage.Literals.TRACE_PROPERTY__APPLIED_AT, newAppliedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> resolveBinding(List<?> traces) {
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
			case FTracePackage.TRACE_PROPERTY___RESOLVE_BINDING__LIST:
				return resolveBinding((List<?>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TracePropertyImpl
