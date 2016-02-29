/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import fr.inria.atlanmod.neoemf.core.impl.NeoEMFEObjectImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceFactory;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty;
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
 *   <li>{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FLinkImpl extends NeoEMFEObjectImpl implements FLink {
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
	public EList<FTraceProperty> getProperties() {
		return (EList<FTraceProperty>)eGet(FTracePackage.Literals.FLINK__PROPERTIES, true);
	}

	/**
	 * Flattens a {@link TraceLink}
	 * @throws Exception 
	 * @throws ClassCastExceptionException 
	 */

	public void flatten(TraceLink currentMatch) throws ClassCastException {
		
		this.setRuleName(currentMatch.getRule().getRule());
	
		for (TraceProperty property : currentMatch.getProperties()) {
			 FTraceProperty fproperty = FTraceFactory.eINSTANCE.flatten(property);
			 this.getProperties().add(fproperty);
		}
		
	}


} //FLinkImpl
