/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceFactory;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.trace.TraceElement;
import org.eclipse.m2m.atl.emftvm.trace.TraceLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FLink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getTargets <em>Targets</em>}</li>
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
	public EList<FSourceElement> getSources() {
		return (EList<FSourceElement>)eGet(FTracePackage.Literals.FLINK__SOURCES, true);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FTargetElement> getTargets() {
		return (EList<FTargetElement>)eGet(FTracePackage.Literals.FLINK__TARGETS, true);
	}

	/**
	 * Flattens a {@link TraceLink}
	 */
	public void flatten(TraceLink currentMatch) {
		
		// initialize the name 
		this.setRuleName(currentMatch.getRule().getRule());
		
		//iterate and copy the the source and target elements
		for (TraceElement element : currentMatch.getSourceElements()) {
			this.getSources().add((FSourceElement)FTraceFactory.eINSTANCE.flatten(element)); 
		}
		
		for (TraceElement element : currentMatch.getTargetElements()) {
			this.getTargets().add((FTargetElement)FTraceFactory.eINSTANCE.flatten(element)); 
		}
	}


} //FLinkImpl
