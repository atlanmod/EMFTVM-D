/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSource Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FSourceElementImpl#isMapsToSelf <em>Maps To Self</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSourceElementImpl extends FTraceElementImpl implements FSourceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FTracePackage.Literals.FSOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMapsToSelf() {
		return (Boolean)eGet(FTracePackage.Literals.FSOURCE_ELEMENT__MAPS_TO_SELF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapsToSelf(boolean newMapsToSelf) {
		eSet(FTracePackage.Literals.FSOURCE_ELEMENT__MAPS_TO_SELF, newMapsToSelf);
	}

} //FSourceElementImpl
