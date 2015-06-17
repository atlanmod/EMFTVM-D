/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FLink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FLinkImpl extends KyanosEObjectImpl implements FLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FTracePackage.Literals.FLINK;
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
	public String getRuleName() {
		return (String)eGet(FTracePackage.Literals.FLINK__RULE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleName(String newRuleName) {
		eSet(FTracePackage.Literals.FLINK__RULE_NAME, newRuleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getSourceElements() {
		return (EList<String>)eGet(FTracePackage.Literals.FLINK__SOURCE_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTargetElements() {
		return (EList<String>)eGet(FTracePackage.Literals.FLINK__TARGET_ELEMENTS, true);
	}

} //FLinkImpl
