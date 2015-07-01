/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * <!-- end-user-doc -->https://docs.google.com/presentation/d/1RfryJJHs2BdZ420G3w_cL9Hao1aGwfQWnkyU6nxzv5M/edit#slide=id.gb51ffff8c_0_0
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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>FLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFTraceProperty()
	 * @generated
	 */
	int FTRACE_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_PROPERTY__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Resolvings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_PROPERTY__RESOLVINGS = 1;

	/**
	 * The feature id for the '<em><b>Resolved For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_PROPERTY__RESOLVED_FOR = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRACE_PROPERTY_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getProperties()
	 * @see #getFLink()
	 * @generated
	 */
	EReference getFLink_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty
	 * @generated
	 */
	EClass getFTraceProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getPropertyName()
	 * @see #getFTraceProperty()
	 * @generated
	 */
	EAttribute getFTraceProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvedFor <em>Resolved For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved For</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvedFor()
	 * @see #getFTraceProperty()
	 * @generated
	 */
	EAttribute getFTraceProperty_ResolvedFor();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvings <em>Resolvings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resolvings</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty#getResolvings()
	 * @see #getFTraceProperty()
	 * @generated
	 */
	EAttribute getFTraceProperty_Resolvings();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLINK__PROPERTIES = eINSTANCE.getFLink_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePropertyImpl
		 * @see org.eclipse.m2m.atl.emftvm.ftrace.impl.FTracePackageImpl#getFTraceProperty()
		 * @generated
		 */
		EClass FTRACE_PROPERTY = eINSTANCE.getFTraceProperty();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTRACE_PROPERTY__PROPERTY_NAME = eINSTANCE.getFTraceProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Resolved For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTRACE_PROPERTY__RESOLVED_FOR = eINSTANCE.getFTraceProperty_ResolvedFor();

		/**
		 * The meta object literal for the '<em><b>Resolvings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTRACE_PROPERTY__RESOLVINGS = eINSTANCE.getFTraceProperty_Resolvings();

	}

} //FTracePackage
