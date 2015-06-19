/**
 */
package trace.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import trace.SourceElement;
import trace.TargetElement;
import trace.TraceLink;
import trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TargetElementImpl#getTargetOf <em>Target Of</em>}</li>
 *   <li>{@link trace.impl.TargetElementImpl#getMapsTo <em>Maps To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetElementImpl extends TraceElementImpl implements TargetElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TARGET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getTargetOf() {
		return (TraceLink)eGet(TracePackage.Literals.TARGET_ELEMENT__TARGET_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOf(TraceLink newTargetOf) {
		eSet(TracePackage.Literals.TARGET_ELEMENT__TARGET_OF, newTargetOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SourceElement> getMapsTo() {
		return (EList<SourceElement>)eGet(TracePackage.Literals.TARGET_ELEMENT__MAPS_TO, true);
	}

} //TargetElementImpl
