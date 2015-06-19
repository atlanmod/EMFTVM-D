/**
 */
package trace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import trace.SourceElement;
import trace.TargetElement;
import trace.TraceLink;
import trace.TracePackage;
import trace.TraceProperty;
import trace.TracedRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TraceLinkImpl#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link trace.impl.TraceLinkImpl#getTargetElements <em>Target Elements</em>}</li>
 *   <li>{@link trace.impl.TraceLinkImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link trace.impl.TraceLinkImpl#isOverridden <em>Overridden</em>}</li>
 *   <li>{@link trace.impl.TraceLinkImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceLinkImpl extends KyanosEObjectImpl implements TraceLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE_LINK;
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
	@SuppressWarnings("unchecked")
	public EList<SourceElement> getSourceElements() {
		return (EList<SourceElement>)eGet(TracePackage.Literals.TRACE_LINK__SOURCE_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TargetElement> getTargetElements() {
		return (EList<TargetElement>)eGet(TracePackage.Literals.TRACE_LINK__TARGET_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRule getRule() {
		return (TracedRule)eGet(TracePackage.Literals.TRACE_LINK__RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(TracedRule newRule) {
		eSet(TracePackage.Literals.TRACE_LINK__RULE, newRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverridden() {
		return (Boolean)eGet(TracePackage.Literals.TRACE_LINK__OVERRIDDEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverridden(boolean newOverridden) {
		eSet(TracePackage.Literals.TRACE_LINK__OVERRIDDEN, newOverridden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TraceProperty> getProperties() {
		return (EList<TraceProperty>)eGet(TracePackage.Literals.TRACE_LINK__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement getSourceElement(String name, boolean create) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement getTargetElement(String name) {
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
			case TracePackage.TRACE_LINK___GET_SOURCE_ELEMENT__STRING_BOOLEAN:
				return getSourceElement((String)arguments.get(0), (Boolean)arguments.get(1));
			case TracePackage.TRACE_LINK___GET_TARGET_ELEMENT__STRING:
				return getTargetElement((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TraceLinkImpl
