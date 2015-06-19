/**
 */
package trace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import trace.SourceElement;
import trace.SourceElementList;
import trace.TraceLinkSet;
import trace.TracePackage;
import trace.TracedRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TraceLinkSetImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link trace.impl.TraceLinkSetImpl#getDefaultSourceElements <em>Default Source Elements</em>}</li>
 *   <li>{@link trace.impl.TraceLinkSetImpl#getDefaultSourceElementLists <em>Default Source Element Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceLinkSetImpl extends KyanosEObjectImpl implements TraceLinkSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE_LINK_SET;
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
	public EList<TracedRule> getRules() {
		return (EList<TracedRule>)eGet(TracePackage.Literals.TRACE_LINK_SET__RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SourceElement> getDefaultSourceElements() {
		return (EList<SourceElement>)eGet(TracePackage.Literals.TRACE_LINK_SET__DEFAULT_SOURCE_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SourceElementList> getDefaultSourceElementLists() {
		return (EList<SourceElementList>)eGet(TracePackage.Literals.TRACE_LINK_SET__DEFAULT_SOURCE_ELEMENT_LISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement getDefaultSourceElement(Object sourceElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementList getDefaultSourceElements(List<?> sourceElements) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRule getLinksByRule(String rule, boolean create) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {
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
			case TracePackage.TRACE_LINK_SET___GET_DEFAULT_SOURCE_ELEMENT__OBJECT:
				return getDefaultSourceElement(arguments.get(0));
			case TracePackage.TRACE_LINK_SET___GET_DEFAULT_SOURCE_ELEMENTS__LIST:
				return getDefaultSourceElements((List<?>)arguments.get(0));
			case TracePackage.TRACE_LINK_SET___GET_LINKS_BY_RULE__STRING_BOOLEAN:
				return getLinksByRule((String)arguments.get(0), (Boolean)arguments.get(1));
			case TracePackage.TRACE_LINK_SET___CLEAR:
				clear();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TraceLinkSetImpl
