/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import java.util.HashMap;
import java.util.Map;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceFactory;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty;
import org.eclipse.m2m.atl.emftvm.trace.TraceElement;
import org.eclipse.m2m.atl.emftvm.trace.TraceLink;
import org.eclipse.m2m.atl.emftvm.trace.TraceProperty;

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
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getProperties <em>Properties</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FTraceProperty> getProperties() {
		return (EList<FTraceProperty>)eGet(FTracePackage.Literals.FLINK__PROPERTIES, true);
	}

	/**
	 * Flattens a {@link TraceLink}
	 */
	// TODO just for now, I should replace these regular links 
	public void flatten(TraceLink currentMatch) {
		
		Map<TraceElement, FTraceElement> targetElementsMap = new HashMap<TraceElement, FTraceElement> ();
		// initialize the name 
		this.setRuleName(currentMatch.getRule().getRule());
		
		//iterate and copy the the source and target elements
		for (TraceElement element : currentMatch.getSourceElements()) {
			this.getSources().add((FSourceElement)FTraceFactory.eINSTANCE.flatten(element)); 
		}
		
		for (TraceElement element : currentMatch.getTargetElements()) {
			FTraceElement felement = FTraceFactory.eINSTANCE.flatten(element);
			targetElementsMap.put(element, felement);
			this.getTargets().add((FTargetElement)felement); 
		}
		
		for (TraceProperty property : currentMatch.getProperties()) {
			 FTraceProperty fproperty = FTraceFactory.eINSTANCE.flatten(property);
			 fproperty.setResolvedFor((FTargetElement) targetElementsMap.get(property));
			 this.getProperties().add(fproperty);
		}
		
		targetElementsMap.clear();
		targetElementsMap = null;
		
	}


} //FLinkImpl
