/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.m2m.atl.emftvm.ftrace.*;
import org.eclipse.m2m.atl.emftvm.trace.TraceProperty;

import fr.inria.atlanmod.neoemf.core.NeoEMFEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FTraceFactoryImpl extends EFactoryImpl implements FTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FTraceFactory init() {
		try {
			FTraceFactory theFTraceFactory = (FTraceFactory)EPackage.Registry.INSTANCE.getEFactory(FTracePackage.eNS_URI);
			if (theFTraceFactory != null) {
				return theFTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FTracePackage.FLINK: return (EObject)createFLink();
			case FTracePackage.FTRACE_PROPERTY: return (EObject)createFTraceProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FLink createFLink() {
		FLinkImpl fLink = new FLinkImpl();
		return fLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTraceProperty createFTraceProperty() {
		FTracePropertyImpl fTraceProperty = new FTracePropertyImpl();
		return fTraceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTracePackage getFTracePackage() {
		return (FTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FTracePackage getPackage() {
		return FTracePackage.eINSTANCE;
	}
	/**
	 * Inherited
	 * @throws Exception 
	 */
//	public FTraceElement flatten(TraceElement element) {
//		switch (element.eClass().getClassifierID()) {
//		case TracePackage.SOURCE_ELEMENT:
//			return clone ((SourceElement)element);
//		case TracePackage.TARGET_ELEMENT:
//			return clone ((TargetElement)element);	
//		default:
//			
//		}
//		return null;
//	}

//	private FTraceElement clone(TargetElement element) {
//		FTargetElement clone = FTraceFactory.eINSTANCE.createFTargetElement();
//		clone.setName(element.getName());
//		clone.setObject(element.getObject());
//		return clone;
//	}
//	
//	private FTraceElement clone(SourceElement element) {
//		FSourceElement clone = FTraceFactory.eINSTANCE.createFSourceElement();
//		clone.setName(element.getName());
//		clone.setObject(element.getObject());
//		//clone.setMapsToSelf(element.);
//		return clone;
//	}

	public FTraceProperty flatten(TraceProperty property) throws ClassCastException {
		FTraceProperty clone = eINSTANCE.createFTraceProperty();
		clone.setPropertyName(property.getPropertyName());
		EObject targetObject = (EObject) property.getResolvedFor().getRuntimeObject();
		if (targetObject instanceof NeoEMFEObject) {
			clone.setResolvedFor(((NeoEMFEObject)targetObject).neoemfId());
		} else {
			throw new ClassCastException("invalid NeoEMF eObject");
		}

		for (EObject eObject : property.getResolvings()) {
			clone.getResolvings().add(((NeoEMFEObject)eObject).neoemfId());
		}

		return clone;
	}

} //FTraceFactoryImpl
