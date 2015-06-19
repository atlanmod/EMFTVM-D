/**
 */
package trace;

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
 * @see trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2m/atl/emftvm/2011/Trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link trace.impl.TraceLinkSetImpl <em>Link Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TraceLinkSetImpl
	 * @see trace.impl.TracePackageImpl#getTraceLinkSet()
	 * @generated
	 */
	int TRACE_LINK_SET = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET__RULES = 0;

	/**
	 * The feature id for the '<em><b>Default Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET__DEFAULT_SOURCE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Default Source Element Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET__DEFAULT_SOURCE_ELEMENT_LISTS = 2;

	/**
	 * The number of structural features of the '<em>Link Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Default Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET___GET_DEFAULT_SOURCE_ELEMENT__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get Default Source Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET___GET_DEFAULT_SOURCE_ELEMENTS__LIST = 1;

	/**
	 * The operation id for the '<em>Get Links By Rule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET___GET_LINKS_BY_RULE__STRING_BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET___CLEAR = 3;

	/**
	 * The number of operations of the '<em>Link Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_SET_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link trace.impl.TracedRuleImpl <em>Traced Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TracedRuleImpl
	 * @see trace.impl.TracePackageImpl#getTracedRule()
	 * @generated
	 */
	int TRACED_RULE = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE__RULE = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Link Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE__LINK_SET = 2;

	/**
	 * The feature id for the '<em><b>Unique Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE__UNIQUE_SOURCE_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Unique Source Element Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE__UNIQUE_SOURCE_ELEMENT_LISTS = 4;

	/**
	 * The number of structural features of the '<em>Traced Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Unique Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE___GET_UNIQUE_SOURCE_ELEMENT__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get Unique Source Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE___GET_UNIQUE_SOURCE_ELEMENTS__LIST = 1;

	/**
	 * The number of operations of the '<em>Traced Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link trace.impl.TraceLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TraceLinkImpl
	 * @see trace.impl.TracePackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGET_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__RULE = 2;

	/**
	 * The feature id for the '<em><b>Overridden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__OVERRIDDEN = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Source Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK___GET_SOURCE_ELEMENT__STRING_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Get Target Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK___GET_TARGET_ELEMENT__STRING = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link trace.impl.TraceElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TraceElementImpl
	 * @see trace.impl.TracePackageImpl#getTraceElement()
	 * @generated
	 */
	int TRACE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__RUNTIME_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trace.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.SourceElementImpl
	 * @see trace.impl.TracePackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__OBJECT = TRACE_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__RUNTIME_OBJECT = TRACE_ELEMENT__RUNTIME_OBJECT;

	/**
	 * The feature id for the '<em><b>Source Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__SOURCE_OF = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maps To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__MAPS_TO = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__DEFAULT_FOR = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__UNIQUE_FOR = TRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maps To Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__MAPS_TO_SELF = TRACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_OPERATION_COUNT = TRACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.TargetElementImpl <em>Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TargetElementImpl
	 * @see trace.impl.TracePackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__OBJECT = TRACE_ELEMENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__RUNTIME_OBJECT = TRACE_ELEMENT__RUNTIME_OBJECT;

	/**
	 * The feature id for the '<em><b>Target Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__TARGET_OF = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maps To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__MAPS_TO = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_OPERATION_COUNT = TRACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trace.impl.SourceElementListImpl <em>Source Element List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.SourceElementListImpl
	 * @see trace.impl.TracePackageImpl#getSourceElementList()
	 * @generated
	 */
	int SOURCE_ELEMENT_LIST = 6;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_LIST__SOURCE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Default For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_LIST__DEFAULT_FOR = 1;

	/**
	 * The feature id for the '<em><b>Unique For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_LIST__UNIQUE_FOR = 2;

	/**
	 * The number of structural features of the '<em>Source Element List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_LIST_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Source Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_LIST___GET_SOURCE_OBJECTS = 0;

	/**
	 * The number of operations of the '<em>Source Element List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_LIST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link trace.impl.TracePropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trace.impl.TracePropertyImpl
	 * @see trace.impl.TracePackageImpl#getTraceProperty()
	 * @generated
	 */
	int TRACE_PROPERTY = 7;

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
	 * The feature id for the '<em><b>Applied At</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PROPERTY__APPLIED_AT = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
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
	int TRACE_PROPERTY___RESOLVE_BINDING__TRACELINKSET = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
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
	 * @see trace.impl.TracePackageImpl#getJavaList()
	 * @generated
	 */
	int JAVA_LIST = 8;


	/**
	 * Returns the meta object for class '{@link trace.TraceLinkSet <em>Link Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Set</em>'.
	 * @see trace.TraceLinkSet
	 * @generated
	 */
	EClass getTraceLinkSet();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TraceLinkSet#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see trace.TraceLinkSet#getRules()
	 * @see #getTraceLinkSet()
	 * @generated
	 */
	EReference getTraceLinkSet_Rules();

	/**
	 * Returns the meta object for the reference list '{@link trace.TraceLinkSet#getDefaultSourceElements <em>Default Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Source Elements</em>'.
	 * @see trace.TraceLinkSet#getDefaultSourceElements()
	 * @see #getTraceLinkSet()
	 * @generated
	 */
	EReference getTraceLinkSet_DefaultSourceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TraceLinkSet#getDefaultSourceElementLists <em>Default Source Element Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Source Element Lists</em>'.
	 * @see trace.TraceLinkSet#getDefaultSourceElementLists()
	 * @see #getTraceLinkSet()
	 * @generated
	 */
	EReference getTraceLinkSet_DefaultSourceElementLists();

	/**
	 * Returns the meta object for the '{@link trace.TraceLinkSet#getDefaultSourceElement(java.lang.Object) <em>Get Default Source Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Source Element</em>' operation.
	 * @see trace.TraceLinkSet#getDefaultSourceElement(java.lang.Object)
	 * @generated
	 */
	EOperation getTraceLinkSet__GetDefaultSourceElement__Object();

	/**
	 * Returns the meta object for the '{@link trace.TraceLinkSet#getDefaultSourceElements(java.util.List) <em>Get Default Source Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Source Elements</em>' operation.
	 * @see trace.TraceLinkSet#getDefaultSourceElements(java.util.List)
	 * @generated
	 */
	EOperation getTraceLinkSet__GetDefaultSourceElements__List();

	/**
	 * Returns the meta object for the '{@link trace.TraceLinkSet#getLinksByRule(java.lang.String, boolean) <em>Get Links By Rule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Links By Rule</em>' operation.
	 * @see trace.TraceLinkSet#getLinksByRule(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getTraceLinkSet__GetLinksByRule__String_boolean();

	/**
	 * Returns the meta object for the '{@link trace.TraceLinkSet#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see trace.TraceLinkSet#clear()
	 * @generated
	 */
	EOperation getTraceLinkSet__Clear();

	/**
	 * Returns the meta object for class '{@link trace.TracedRule <em>Traced Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Rule</em>'.
	 * @see trace.TracedRule
	 * @generated
	 */
	EClass getTracedRule();

	/**
	 * Returns the meta object for the attribute '{@link trace.TracedRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see trace.TracedRule#getRule()
	 * @see #getTracedRule()
	 * @generated
	 */
	EAttribute getTracedRule_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TracedRule#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see trace.TracedRule#getLinks()
	 * @see #getTracedRule()
	 * @generated
	 */
	EReference getTracedRule_Links();

	/**
	 * Returns the meta object for the container reference '{@link trace.TracedRule#getLinkSet <em>Link Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Link Set</em>'.
	 * @see trace.TracedRule#getLinkSet()
	 * @see #getTracedRule()
	 * @generated
	 */
	EReference getTracedRule_LinkSet();

	/**
	 * Returns the meta object for the reference list '{@link trace.TracedRule#getUniqueSourceElements <em>Unique Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unique Source Elements</em>'.
	 * @see trace.TracedRule#getUniqueSourceElements()
	 * @see #getTracedRule()
	 * @generated
	 */
	EReference getTracedRule_UniqueSourceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TracedRule#getUniqueSourceElementLists <em>Unique Source Element Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Source Element Lists</em>'.
	 * @see trace.TracedRule#getUniqueSourceElementLists()
	 * @see #getTracedRule()
	 * @generated
	 */
	EReference getTracedRule_UniqueSourceElementLists();

	/**
	 * Returns the meta object for the '{@link trace.TracedRule#getUniqueSourceElement(java.lang.Object) <em>Get Unique Source Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Source Element</em>' operation.
	 * @see trace.TracedRule#getUniqueSourceElement(java.lang.Object)
	 * @generated
	 */
	EOperation getTracedRule__GetUniqueSourceElement__Object();

	/**
	 * Returns the meta object for the '{@link trace.TracedRule#getUniqueSourceElements(java.util.List) <em>Get Unique Source Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unique Source Elements</em>' operation.
	 * @see trace.TracedRule#getUniqueSourceElements(java.util.List)
	 * @generated
	 */
	EOperation getTracedRule__GetUniqueSourceElements__List();

	/**
	 * Returns the meta object for class '{@link trace.TraceLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see trace.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TraceLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Elements</em>'.
	 * @see trace.TraceLink#getSourceElements()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_SourceElements();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TraceLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Elements</em>'.
	 * @see trace.TraceLink#getTargetElements()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_TargetElements();

	/**
	 * Returns the meta object for the container reference '{@link trace.TraceLink#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see trace.TraceLink#getRule()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Rule();

	/**
	 * Returns the meta object for the attribute '{@link trace.TraceLink#isOverridden <em>Overridden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overridden</em>'.
	 * @see trace.TraceLink#isOverridden()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Overridden();

	/**
	 * Returns the meta object for the containment reference list '{@link trace.TraceLink#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see trace.TraceLink#getProperties()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Properties();

	/**
	 * Returns the meta object for the '{@link trace.TraceLink#getSourceElement(java.lang.String, boolean) <em>Get Source Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Element</em>' operation.
	 * @see trace.TraceLink#getSourceElement(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getTraceLink__GetSourceElement__String_boolean();

	/**
	 * Returns the meta object for the '{@link trace.TraceLink#getTargetElement(java.lang.String) <em>Get Target Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Element</em>' operation.
	 * @see trace.TraceLink#getTargetElement(java.lang.String)
	 * @generated
	 */
	EOperation getTraceLink__GetTargetElement__String();

	/**
	 * Returns the meta object for class '{@link trace.TraceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see trace.TraceElement
	 * @generated
	 */
	EClass getTraceElement();

	/**
	 * Returns the meta object for the attribute '{@link trace.TraceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trace.TraceElement#getName()
	 * @see #getTraceElement()
	 * @generated
	 */
	EAttribute getTraceElement_Name();

	/**
	 * Returns the meta object for the reference '{@link trace.TraceElement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see trace.TraceElement#getObject()
	 * @see #getTraceElement()
	 * @generated
	 */
	EReference getTraceElement_Object();

	/**
	 * Returns the meta object for the attribute '{@link trace.TraceElement#getRuntimeObject <em>Runtime Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Object</em>'.
	 * @see trace.TraceElement#getRuntimeObject()
	 * @see #getTraceElement()
	 * @generated
	 */
	EAttribute getTraceElement_RuntimeObject();

	/**
	 * Returns the meta object for class '{@link trace.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see trace.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the container reference '{@link trace.SourceElement#getSourceOf <em>Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Of</em>'.
	 * @see trace.SourceElement#getSourceOf()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_SourceOf();

	/**
	 * Returns the meta object for the reference list '{@link trace.SourceElement#getMapsTo <em>Maps To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Maps To</em>'.
	 * @see trace.SourceElement#getMapsTo()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_MapsTo();

	/**
	 * Returns the meta object for the reference '{@link trace.SourceElement#getDefaultFor <em>Default For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default For</em>'.
	 * @see trace.SourceElement#getDefaultFor()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_DefaultFor();

	/**
	 * Returns the meta object for the reference '{@link trace.SourceElement#getUniqueFor <em>Unique For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unique For</em>'.
	 * @see trace.SourceElement#getUniqueFor()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_UniqueFor();

	/**
	 * Returns the meta object for the attribute '{@link trace.SourceElement#isMapsToSelf <em>Maps To Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps To Self</em>'.
	 * @see trace.SourceElement#isMapsToSelf()
	 * @see #getSourceElement()
	 * @generated
	 */
	EAttribute getSourceElement_MapsToSelf();

	/**
	 * Returns the meta object for class '{@link trace.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element</em>'.
	 * @see trace.TargetElement
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Returns the meta object for the container reference '{@link trace.TargetElement#getTargetOf <em>Target Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target Of</em>'.
	 * @see trace.TargetElement#getTargetOf()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_TargetOf();

	/**
	 * Returns the meta object for the reference list '{@link trace.TargetElement#getMapsTo <em>Maps To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Maps To</em>'.
	 * @see trace.TargetElement#getMapsTo()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_MapsTo();

	/**
	 * Returns the meta object for class '{@link trace.SourceElementList <em>Source Element List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element List</em>'.
	 * @see trace.SourceElementList
	 * @generated
	 */
	EClass getSourceElementList();

	/**
	 * Returns the meta object for the reference list '{@link trace.SourceElementList#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Elements</em>'.
	 * @see trace.SourceElementList#getSourceElements()
	 * @see #getSourceElementList()
	 * @generated
	 */
	EReference getSourceElementList_SourceElements();

	/**
	 * Returns the meta object for the container reference '{@link trace.SourceElementList#getDefaultFor <em>Default For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Default For</em>'.
	 * @see trace.SourceElementList#getDefaultFor()
	 * @see #getSourceElementList()
	 * @generated
	 */
	EReference getSourceElementList_DefaultFor();

	/**
	 * Returns the meta object for the container reference '{@link trace.SourceElementList#getUniqueFor <em>Unique For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Unique For</em>'.
	 * @see trace.SourceElementList#getUniqueFor()
	 * @see #getSourceElementList()
	 * @generated
	 */
	EReference getSourceElementList_UniqueFor();

	/**
	 * Returns the meta object for the '{@link trace.SourceElementList#getSourceObjects() <em>Get Source Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Objects</em>' operation.
	 * @see trace.SourceElementList#getSourceObjects()
	 * @generated
	 */
	EOperation getSourceElementList__GetSourceObjects();

	/**
	 * Returns the meta object for class '{@link trace.TraceProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see trace.TraceProperty
	 * @generated
	 */
	EClass getTraceProperty();

	/**
	 * Returns the meta object for the attribute '{@link trace.TraceProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see trace.TraceProperty#getPropertyName()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EAttribute getTraceProperty_PropertyName();

	/**
	 * Returns the meta object for the reference '{@link trace.TraceProperty#getResolvedFor <em>Resolved For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved For</em>'.
	 * @see trace.TraceProperty#getResolvedFor()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EReference getTraceProperty_ResolvedFor();

	/**
	 * Returns the meta object for the reference list '{@link trace.TraceProperty#getResolvings <em>Resolvings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolvings</em>'.
	 * @see trace.TraceProperty#getResolvings()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EReference getTraceProperty_Resolvings();

	/**
	 * Returns the meta object for the attribute '{@link trace.TraceProperty#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see trace.TraceProperty#isResolved()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EAttribute getTraceProperty_Resolved();

	/**
	 * Returns the meta object for the container reference '{@link trace.TraceProperty#getAppliedAt <em>Applied At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Applied At</em>'.
	 * @see trace.TraceProperty#getAppliedAt()
	 * @see #getTraceProperty()
	 * @generated
	 */
	EReference getTraceProperty_AppliedAt();

	/**
	 * Returns the meta object for the '{@link trace.TraceProperty#resolveBinding(trace.TraceLinkSet) <em>Resolve Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Binding</em>' operation.
	 * @see trace.TraceProperty#resolveBinding(trace.TraceLinkSet)
	 * @generated
	 */
	EOperation getTraceProperty__ResolveBinding__TraceLinkSet();

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
	TraceFactory getTraceFactory();

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
		 * The meta object literal for the '{@link trace.impl.TraceLinkSetImpl <em>Link Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TraceLinkSetImpl
		 * @see trace.impl.TracePackageImpl#getTraceLinkSet()
		 * @generated
		 */
		EClass TRACE_LINK_SET = eINSTANCE.getTraceLinkSet();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK_SET__RULES = eINSTANCE.getTraceLinkSet_Rules();

		/**
		 * The meta object literal for the '<em><b>Default Source Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK_SET__DEFAULT_SOURCE_ELEMENTS = eINSTANCE.getTraceLinkSet_DefaultSourceElements();

		/**
		 * The meta object literal for the '<em><b>Default Source Element Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK_SET__DEFAULT_SOURCE_ELEMENT_LISTS = eINSTANCE.getTraceLinkSet_DefaultSourceElementLists();

		/**
		 * The meta object literal for the '<em><b>Get Default Source Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_LINK_SET___GET_DEFAULT_SOURCE_ELEMENT__OBJECT = eINSTANCE.getTraceLinkSet__GetDefaultSourceElement__Object();

		/**
		 * The meta object literal for the '<em><b>Get Default Source Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_LINK_SET___GET_DEFAULT_SOURCE_ELEMENTS__LIST = eINSTANCE.getTraceLinkSet__GetDefaultSourceElements__List();

		/**
		 * The meta object literal for the '<em><b>Get Links By Rule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_LINK_SET___GET_LINKS_BY_RULE__STRING_BOOLEAN = eINSTANCE.getTraceLinkSet__GetLinksByRule__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_LINK_SET___CLEAR = eINSTANCE.getTraceLinkSet__Clear();

		/**
		 * The meta object literal for the '{@link trace.impl.TracedRuleImpl <em>Traced Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TracedRuleImpl
		 * @see trace.impl.TracePackageImpl#getTracedRule()
		 * @generated
		 */
		EClass TRACED_RULE = eINSTANCE.getTracedRule();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACED_RULE__RULE = eINSTANCE.getTracedRule_Rule();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_RULE__LINKS = eINSTANCE.getTracedRule_Links();

		/**
		 * The meta object literal for the '<em><b>Link Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_RULE__LINK_SET = eINSTANCE.getTracedRule_LinkSet();

		/**
		 * The meta object literal for the '<em><b>Unique Source Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_RULE__UNIQUE_SOURCE_ELEMENTS = eINSTANCE.getTracedRule_UniqueSourceElements();

		/**
		 * The meta object literal for the '<em><b>Unique Source Element Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_RULE__UNIQUE_SOURCE_ELEMENT_LISTS = eINSTANCE.getTracedRule_UniqueSourceElementLists();

		/**
		 * The meta object literal for the '<em><b>Get Unique Source Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACED_RULE___GET_UNIQUE_SOURCE_ELEMENT__OBJECT = eINSTANCE.getTracedRule__GetUniqueSourceElement__Object();

		/**
		 * The meta object literal for the '<em><b>Get Unique Source Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACED_RULE___GET_UNIQUE_SOURCE_ELEMENTS__LIST = eINSTANCE.getTracedRule__GetUniqueSourceElements__List();

		/**
		 * The meta object literal for the '{@link trace.impl.TraceLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TraceLinkImpl
		 * @see trace.impl.TracePackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__SOURCE_ELEMENTS = eINSTANCE.getTraceLink_SourceElements();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TARGET_ELEMENTS = eINSTANCE.getTraceLink_TargetElements();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__RULE = eINSTANCE.getTraceLink_Rule();

		/**
		 * The meta object literal for the '<em><b>Overridden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__OVERRIDDEN = eINSTANCE.getTraceLink_Overridden();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__PROPERTIES = eINSTANCE.getTraceLink_Properties();

		/**
		 * The meta object literal for the '<em><b>Get Source Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_LINK___GET_SOURCE_ELEMENT__STRING_BOOLEAN = eINSTANCE.getTraceLink__GetSourceElement__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Target Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE_LINK___GET_TARGET_ELEMENT__STRING = eINSTANCE.getTraceLink__GetTargetElement__String();

		/**
		 * The meta object literal for the '{@link trace.impl.TraceElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TraceElementImpl
		 * @see trace.impl.TracePackageImpl#getTraceElement()
		 * @generated
		 */
		EClass TRACE_ELEMENT = eINSTANCE.getTraceElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ELEMENT__NAME = eINSTANCE.getTraceElement_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_ELEMENT__OBJECT = eINSTANCE.getTraceElement_Object();

		/**
		 * The meta object literal for the '<em><b>Runtime Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ELEMENT__RUNTIME_OBJECT = eINSTANCE.getTraceElement_RuntimeObject();

		/**
		 * The meta object literal for the '{@link trace.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.SourceElementImpl
		 * @see trace.impl.TracePackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '<em><b>Source Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__SOURCE_OF = eINSTANCE.getSourceElement_SourceOf();

		/**
		 * The meta object literal for the '<em><b>Maps To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__MAPS_TO = eINSTANCE.getSourceElement_MapsTo();

		/**
		 * The meta object literal for the '<em><b>Default For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__DEFAULT_FOR = eINSTANCE.getSourceElement_DefaultFor();

		/**
		 * The meta object literal for the '<em><b>Unique For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__UNIQUE_FOR = eINSTANCE.getSourceElement_UniqueFor();

		/**
		 * The meta object literal for the '<em><b>Maps To Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_ELEMENT__MAPS_TO_SELF = eINSTANCE.getSourceElement_MapsToSelf();

		/**
		 * The meta object literal for the '{@link trace.impl.TargetElementImpl <em>Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TargetElementImpl
		 * @see trace.impl.TracePackageImpl#getTargetElement()
		 * @generated
		 */
		EClass TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '<em><b>Target Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__TARGET_OF = eINSTANCE.getTargetElement_TargetOf();

		/**
		 * The meta object literal for the '<em><b>Maps To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__MAPS_TO = eINSTANCE.getTargetElement_MapsTo();

		/**
		 * The meta object literal for the '{@link trace.impl.SourceElementListImpl <em>Source Element List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.SourceElementListImpl
		 * @see trace.impl.TracePackageImpl#getSourceElementList()
		 * @generated
		 */
		EClass SOURCE_ELEMENT_LIST = eINSTANCE.getSourceElementList();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_LIST__SOURCE_ELEMENTS = eINSTANCE.getSourceElementList_SourceElements();

		/**
		 * The meta object literal for the '<em><b>Default For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_LIST__DEFAULT_FOR = eINSTANCE.getSourceElementList_DefaultFor();

		/**
		 * The meta object literal for the '<em><b>Unique For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_LIST__UNIQUE_FOR = eINSTANCE.getSourceElementList_UniqueFor();

		/**
		 * The meta object literal for the '<em><b>Get Source Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE_ELEMENT_LIST___GET_SOURCE_OBJECTS = eINSTANCE.getSourceElementList__GetSourceObjects();

		/**
		 * The meta object literal for the '{@link trace.impl.TracePropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trace.impl.TracePropertyImpl
		 * @see trace.impl.TracePackageImpl#getTraceProperty()
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
		 * The meta object literal for the '<em><b>Applied At</b></em>' container reference feature.
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
		EOperation TRACE_PROPERTY___RESOLVE_BINDING__TRACELINKSET = eINSTANCE.getTraceProperty__ResolveBinding__TraceLinkSet();

		/**
		 * The meta object literal for the '<em>Java List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see trace.impl.TracePackageImpl#getJavaList()
		 * @generated
		 */
		EDataType JAVA_LIST = eINSTANCE.getJavaList();

	}

} //TracePackage
