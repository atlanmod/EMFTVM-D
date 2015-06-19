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
import trace.TraceLink;
import trace.TraceLinkSet;
import trace.TracePackage;
import trace.TracedRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.TracedRuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link trace.impl.TracedRuleImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link trace.impl.TracedRuleImpl#getLinkSet <em>Link Set</em>}</li>
 *   <li>{@link trace.impl.TracedRuleImpl#getUniqueSourceElements <em>Unique Source Elements</em>}</li>
 *   <li>{@link trace.impl.TracedRuleImpl#getUniqueSourceElementLists <em>Unique Source Element Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedRuleImpl extends KyanosEObjectImpl implements TracedRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACED_RULE;
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
	public String getRule() {
		return (String)eGet(TracePackage.Literals.TRACED_RULE__RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(String newRule) {
		eSet(TracePackage.Literals.TRACED_RULE__RULE, newRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TraceLink> getLinks() {
		return (EList<TraceLink>)eGet(TracePackage.Literals.TRACED_RULE__LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLinkSet getLinkSet() {
		return (TraceLinkSet)eGet(TracePackage.Literals.TRACED_RULE__LINK_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkSet(TraceLinkSet newLinkSet) {
		eSet(TracePackage.Literals.TRACED_RULE__LINK_SET, newLinkSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SourceElement> getUniqueSourceElements() {
		return (EList<SourceElement>)eGet(TracePackage.Literals.TRACED_RULE__UNIQUE_SOURCE_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SourceElementList> getUniqueSourceElementLists() {
		return (EList<SourceElementList>)eGet(TracePackage.Literals.TRACED_RULE__UNIQUE_SOURCE_ELEMENT_LISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement getUniqueSourceElement(Object sourceElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementList getUniqueSourceElements(List<?> sourceElements) {
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
			case TracePackage.TRACED_RULE___GET_UNIQUE_SOURCE_ELEMENT__OBJECT:
				return getUniqueSourceElement(arguments.get(0));
			case TracePackage.TRACED_RULE___GET_UNIQUE_SOURCE_ELEMENTS__LIST:
				return getUniqueSourceElements((List<?>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TracedRuleImpl
