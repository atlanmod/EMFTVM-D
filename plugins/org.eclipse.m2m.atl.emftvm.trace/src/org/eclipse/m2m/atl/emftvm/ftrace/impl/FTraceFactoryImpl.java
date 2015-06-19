/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.m2m.atl.emftvm.ftrace.*;
import org.eclipse.m2m.atl.emftvm.trace.SourceElement;
import org.eclipse.m2m.atl.emftvm.trace.TargetElement;
import org.eclipse.m2m.atl.emftvm.trace.TraceElement;
import org.eclipse.m2m.atl.emftvm.trace.TracePackage;
import org.eclipse.m2m.atl.emftvm.trace.TraceProperty;

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
			case FTracePackage.FTARGET_ELEMENT: return (EObject)createFTargetElement();
			case FTracePackage.FSOURCE_ELEMENT: return (EObject)createFSourceElement();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FTracePackage.JAVA_LIST:
				return createJavaListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FTracePackage.JAVA_LIST:
				return convertJavaListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public FTargetElement createFTargetElement() {
		FTargetElementImpl fTargetElement = new FTargetElementImpl();
		return fTargetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSourceElement createFSourceElement() {
		FSourceElementImpl fSourceElement = new FSourceElementImpl();
		return fSourceElement;
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
	public List<?> createJavaListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
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
	 */
	public FTraceElement flatten(TraceElement element) {
		switch (element.eClass().getClassifierID()) {
		case TracePackage.SOURCE_ELEMENT:
			return clone ((SourceElement)element);
		case TracePackage.TARGET_ELEMENT:
			return clone ((TargetElement)element);	
		default:
			
		}
		return null;
	}

	private FTraceElement clone(TargetElement element) {
		FTargetElement clone = FTraceFactory.eINSTANCE.createFTargetElement();
		clone.setName(element.getName());
		clone.setObject(element.getObject());
		return clone;
	}
	
	private FTraceElement clone(SourceElement element) {
		FSourceElement clone = FTraceFactory.eINSTANCE.createFSourceElement();
		clone.setName(element.getName());
		clone.setObject(element.getObject());
		//clone.setMapsToSelf(element.);
		return clone;
	}

	public FTraceProperty flatten(TraceProperty property) {
		FTraceProperty clone = eINSTANCE.createFTraceProperty();
		clone.setPropertyName(property.getPropertyName());
		for (EObject eObject : property.getResolvings()) {
			clone.getResolvings().add(eObject);
		}
		return clone;
	}

} //FTraceFactoryImpl
