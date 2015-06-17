/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The feature id for the '<em><b>Source Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK__SOURCE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLINK__TARGET_ELEMENTS = 2;

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
	 * Returns the meta object for the attribute list '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source Elements</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getSourceElements()
	 * @see #getFLink()
	 * @generated
	 */
	EAttribute getFLink_SourceElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.m2m.atl.emftvm.ftrace.FLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target Elements</em>'.
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FLink#getTargetElements()
	 * @see #getFLink()
	 * @generated
	 */
	EAttribute getFLink_TargetElements();

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
		 * The meta object literal for the '<em><b>Source Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLINK__SOURCE_ELEMENTS = eINSTANCE.getFLink_SourceElements();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLINK__TARGET_ELEMENTS = eINSTANCE.getFLink_TargetElements();

	}

} //FTracePackage
