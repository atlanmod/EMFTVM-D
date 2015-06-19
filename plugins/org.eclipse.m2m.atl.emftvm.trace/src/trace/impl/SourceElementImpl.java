/**
 */
package trace.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import trace.SourceElement;
import trace.TargetElement;
import trace.TraceLink;
import trace.TraceLinkSet;
import trace.TracePackage;
import trace.TracedRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.SourceElementImpl#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link trace.impl.SourceElementImpl#getMapsTo <em>Maps To</em>}</li>
 *   <li>{@link trace.impl.SourceElementImpl#getDefaultFor <em>Default For</em>}</li>
 *   <li>{@link trace.impl.SourceElementImpl#getUniqueFor <em>Unique For</em>}</li>
 *   <li>{@link trace.impl.SourceElementImpl#isMapsToSelf <em>Maps To Self</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceElementImpl extends TraceElementImpl implements SourceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.SOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getSourceOf() {
		return (TraceLink)eGet(TracePackage.Literals.SOURCE_ELEMENT__SOURCE_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOf(TraceLink newSourceOf) {
		eSet(TracePackage.Literals.SOURCE_ELEMENT__SOURCE_OF, newSourceOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TargetElement> getMapsTo() {
		return (EList<TargetElement>)eGet(TracePackage.Literals.SOURCE_ELEMENT__MAPS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLinkSet getDefaultFor() {
		return (TraceLinkSet)eGet(TracePackage.Literals.SOURCE_ELEMENT__DEFAULT_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFor(TraceLinkSet newDefaultFor) {
		eSet(TracePackage.Literals.SOURCE_ELEMENT__DEFAULT_FOR, newDefaultFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRule getUniqueFor() {
		return (TracedRule)eGet(TracePackage.Literals.SOURCE_ELEMENT__UNIQUE_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueFor(TracedRule newUniqueFor) {
		eSet(TracePackage.Literals.SOURCE_ELEMENT__UNIQUE_FOR, newUniqueFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMapsToSelf() {
		return (Boolean)eGet(TracePackage.Literals.SOURCE_ELEMENT__MAPS_TO_SELF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapsToSelf(boolean newMapsToSelf) {
		eSet(TracePackage.Literals.SOURCE_ELEMENT__MAPS_TO_SELF, newMapsToSelf);
	}

} //SourceElementImpl
