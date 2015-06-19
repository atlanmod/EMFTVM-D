/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceFactory
 * @model kind="package"
 *        annotation="Descrition description='This is a flat/compact representation of the trace metamodel \n'"
 * @generated
 */
public interface FTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ftrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2m/atl/emftvm/ftrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ftrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FTracePackage eINSTANCE = org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl <em>FLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFLink()
	 * @generated
	 */
	int FLINK = 0;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK__RULE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK__SOURCES = 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK__TARGETS = 2;

	/**
	 * The number of structural features of the '<em>FLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>FLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTraceElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTraceElementImpl
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFTraceElement()
	 * @generated
	 */
	int FTRACE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_ELEMENT__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_ELEMENT__RUNTIME_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTargetElementImpl <em>FTarget Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTargetElementImpl
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFTargetElement()
	 * @generated
	 */
	int FTARGET_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTARGET_ELEMENT__NAME = FTRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTARGET_ELEMENT__OBJECT = FTRACE_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTARGET_ELEMENT__RUNTIME_OBJECT = FTRACE_ELEMENT__RUNTIME_OBJECT;

	/**
	 * The number of structural features of the '<em>FTarget Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTARGET_ELEMENT_FEATURE_COUNT = FTRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FTarget Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTARGET_ELEMENT_OPERATION_COUNT = FTRACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FSourceElementImpl <em>FSource Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FSourceElementImpl
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFSourceElement()
	 * @generated
	 */
	int FSOURCE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSOURCE_ELEMENT__NAME = FTRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSOURCE_ELEMENT__OBJECT = FTRACE_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSOURCE_ELEMENT__RUNTIME_OBJECT = FTRACE_ELEMENT__RUNTIME_OBJECT;

	/**
	 * The feature id for the '<em><b>Maps To Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSOURCE_ELEMENT__MAPS_TO_SELF = FTRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FSource Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSOURCE_ELEMENT_FEATURE_COUNT = FTRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FSource Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSOURCE_ELEMENT_OPERATION_COUNT = FTRACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl <em>Trace Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getTraceProperty()
	 * @generated
	 */
	int TRACE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Resolved For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY__RESOLVED_FOR = 1;

	/**
	 * The feature id for the '<em><b>Resolvings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY__RESOLVINGS = 2;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY__RESOLVED = 3;

	/**
	 * The feature id for the '<em><b>Applied At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY__APPLIED_AT = 4;

	/**
	 * The number of structural features of the '<em>Trace Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Resolve Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY___RESOLVE_BINDING__LIST = 0;

	/**
	 * The number of operations of the '<em>Trace Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>Java List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 5;

	/**
	 * Returns the meta object for class '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink <em>FLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FLink</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink
	 * @generated
	 */
	EClass getFLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getRuleName()
	 * @see #getFLink()
	 * @generated
	 */
	EAttribute getFLink_RuleName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getSources()
	 * @see #getFLink()
	 * @generated
	 */
	EReference getFLink_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getTargets()
	 * @see #getFLink()
	 * @generated
	 */
	EReference getFLink_Targets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement
	 * @generated
	 */
	EClass getFTraceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement#getName()
	 * @see #getFTraceElement()
	 * @generated
	 */
	EAttribute getFTraceElement_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement#getObject()
	 * @see #getFTraceElement()
	 * @generated
	 */
	EReference getFTraceElement_Object();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement#getRuntimeObject <em>Runtime Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Object</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement#getRuntimeObject()
	 * @see #getFTraceElement()
	 * @generated
	 */
	EAttribute getFTraceElement_RuntimeObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement <em>FTarget Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTarget Element</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement
	 * @generated
	 */
	EClass getFTargetElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement <em>FSource Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSource Element</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement
	 * @generated
	 */
	EClass getFSourceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement#isMapsToSelf <em>Maps To Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps To Self</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement#isMapsToSelf()
	 * @see #getFSourceElement()
	 * @generated
	 */
	EAttribute getFSourceElement_MapsToSelf();

	/**
	 * Returns the meta object for class '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty <em>Trace Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Property</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty
	 * @generated
	 */
	EClass getTraceProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getPropertyName()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EAttribute getTraceProperty_PropertyName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getResolvedFor <em>Resolved For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved For</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getResolvedFor()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EReference getTraceProperty_ResolvedFor();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getResolvings <em>Resolvings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolvings</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getResolvings()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EReference getTraceProperty_Resolvings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#isResolved()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EAttribute getTraceProperty_Resolved();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getAppliedAt <em>Applied At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied At</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#getAppliedAt()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EReference getTraceProperty_AppliedAt();

	/**
	 * Returns the meta object for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#resolveBinding(java.util.List) <em>Resolve Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Binding</em>' operation.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty#resolveBinding(java.util.List)
	 * @generated
	 */
	EOperation getTraceProperty__ResolveBinding__List();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Java List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="E"
	 * @generated
	 */
	EDataType getJavaList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FTraceFactory getFTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl <em>FLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FLinkImpl
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFLink()
		 * @generated
		 */
		EClass FLINK = eINSTANCE.getFLink();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLINK__RULE_NAME = eINSTANCE.getFLink_RuleName();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLINK__SOURCES = eINSTANCE.getFLink_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLINK__TARGETS = eINSTANCE.getFLink_Targets();

		/**
		 * The meta object literal for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTraceElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTraceElementImpl
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFTraceElement()
		 * @generated
		 */
		EClass FTRACE_ELEMENT = eINSTANCE.getFTraceElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTRACE_ELEMENT__NAME = eINSTANCE.getFTraceElement_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FTRACE_ELEMENT__OBJECT = eINSTANCE.getFTraceElement_Object();

		/**
		 * The meta object literal for the '<em><b>Runtime Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTRACE_ELEMENT__RUNTIME_OBJECT = eINSTANCE.getFTraceElement_RuntimeObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTargetElementImpl <em>FTarget Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTargetElementImpl
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFTargetElement()
		 * @generated
		 */
		EClass FTARGET_ELEMENT = eINSTANCE.getFTargetElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FSourceElementImpl <em>FSource Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FSourceElementImpl
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFSourceElement()
		 * @generated
		 */
		EClass FSOURCE_ELEMENT = eINSTANCE.getFSourceElement();

		/**
		 * The meta object literal for the '<em><b>Maps To Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSOURCE_ELEMENT__MAPS_TO_SELF = eINSTANCE.getFSourceElement_MapsToSelf();

		/**
		 * The meta object literal for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl <em>Trace Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.TracePropertyImpl
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getTraceProperty()
		 * @generated
		 */
		EClass TRACE_PROPERTY = eINSTANCE.getTraceProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_PROPERTY__PROPERTY_NAME = eINSTANCE.getTraceProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Resolved For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PROPERTY__RESOLVED_FOR = eINSTANCE.getTraceProperty_ResolvedFor();

		/**
		 * The meta object literal for the '<em><b>Resolvings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PROPERTY__RESOLVINGS = eINSTANCE.getTraceProperty_Resolvings();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_PROPERTY__RESOLVED = eINSTANCE.getTraceProperty_Resolved();

		/**
		 * The meta object literal for the '<em><b>Applied At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PROPERTY__APPLIED_AT = eINSTANCE.getTraceProperty_AppliedAt();

		/**
		 * The meta object literal for the '<em><b>Resolve Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_PROPERTY___RESOLVE_BINDING__LIST = eINSTANCE.getTraceProperty__ResolveBinding__List();

		/**
		 * The meta object literal for the '<em>Java List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getJavaList()
		 * @generated
		 */
		EDataType JAVA_LIST = eINSTANCE.getJavaList();

	}

} //FTracePackage
