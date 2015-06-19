/**
 */
package trace.impl;

import fr.inria.atlanmod.kyanos.core.impl.KyanosEObjectImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import trace.SourceElement;
import trace.SourceElementList;
import trace.TraceLinkSet;
import trace.TracePackage;
import trace.TracedRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Element List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trace.impl.SourceElementListImpl#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link trace.impl.SourceElementListImpl#getDefaultFor <em>Default For</em>}</li>
 *   <li>{@link trace.impl.SourceElementListImpl#getUniqueFor <em>Unique For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceElementListImpl extends KyanosEObjectImpl implements SourceElementList {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.SOURCE_ELEMENT_LIST;
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
		return (EList<SourceElement>)eGet(TracePackage.Literals.SOURCE_ELEMENT_LIST__SOURCE_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLinkSet getDefaultFor() {
		return (TraceLinkSet)eGet(TracePackage.Literals.SOURCE_ELEMENT_LIST__DEFAULT_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFor(TraceLinkSet newDefaultFor) {
		eSet(TracePackage.Literals.SOURCE_ELEMENT_LIST__DEFAULT_FOR, newDefaultFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRule getUniqueFor() {
		return (TracedRule)eGet(TracePackage.Literals.SOURCE_ELEMENT_LIST__UNIQUE_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueFor(TracedRule newUniqueFor) {
		eSet(TracePackage.Literals.SOURCE_ELEMENT_LIST__UNIQUE_FOR, newUniqueFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getSourceObjects() {
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
			case TracePackage.SOURCE_ELEMENT_LIST___GET_SOURCE_OBJECTS:
				return getSourceObjects();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceElementListImpl
