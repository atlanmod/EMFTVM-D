/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#getResolvedFor <em>Resolved For</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#getAppliedAt <em>Applied At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTracePropertyImpl extends KyanosEObjectImpl implements FTraceProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTracePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FTracePackage.Literals.FTRACE_PROPERTY;
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
		return (String)eGet(FTracePackage.Literals.FTRACE_PROPERTY__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		eSet(FTracePackage.Literals.FTRACE_PROPERTY__PROPERTY_NAME, newPropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTargetElement getResolvedFor() {
		return (FTargetElement)eGet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVED_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedFor(FTargetElement newResolvedFor) {
		eSet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVED_FOR, newResolvedFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getResolvings() {
		return (EList<EObject>)eGet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return (Boolean)eGet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		eSet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVED, newResolved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FLink getAppliedAt() {
		return (FLink)eGet(FTracePackage.Literals.FTRACE_PROPERTY__APPLIED_AT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedAt(FLink newAppliedAt) {
		eSet(FTracePackage.Literals.FTRACE_PROPERTY__APPLIED_AT, newAppliedAt);
	}

} //FTracePropertyImpl
