/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import fr.inria.atlanmod.neoemf.core.impl.NeoEMFEObjectImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl#getResolvedFor <em>Resolved For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTracePropertyImpl extends NeoEMFEObjectImpl implements FTraceProperty {
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
	public String getResolvedFor() {
		return (String)eGet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVED_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedFor(String newResolvedFor) {
		eSet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVED_FOR, newResolvedFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getResolvings() {
		return (EList<String>)eGet(FTracePackage.Literals.FTRACE_PROPERTY__RESOLVINGS, true);
	}

} //FTracePropertyImpl
