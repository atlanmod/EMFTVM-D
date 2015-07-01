/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceFactory;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceProperty;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FTracePackageImpl extends EPackageImpl implements FTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fTracePropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FTracePackageImpl() {
		super(eNS_URI, FTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FTracePackage init() {
		if (isInited) return (FTracePackage)EPackage.Registry.INSTANCE.getEPackage(FTracePackage.eNS_URI);

		// Obtain or create and register package
		FTracePackageImpl theFTracePackage = (FTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FTracePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFTracePackage.createPackageContents();

		// Initialize created meta-data
		theFTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FTracePackage.eNS_URI, theFTracePackage);
		return theFTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFLink() {
		return fLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFLink_RuleName() {
		return (EAttribute)fLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFLink_Properties() {
		return (EReference)fLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFTraceProperty() {
		return fTracePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTraceProperty_PropertyName() {
		return (EAttribute)fTracePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTraceProperty_ResolvedFor() {
		return (EAttribute)fTracePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTraceProperty_Resolvings() {
		return (EAttribute)fTracePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTraceFactory getFTraceFactory() {
		return (FTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fLinkEClass = createEClass(FLINK);
		createEAttribute(fLinkEClass, FLINK__RULE_NAME);
		createEReference(fLinkEClass, FLINK__PROPERTIES);

		fTracePropertyEClass = createEClass(FTRACE_PROPERTY);
		createEAttribute(fTracePropertyEClass, FTRACE_PROPERTY__PROPERTY_NAME);
		createEAttribute(fTracePropertyEClass, FTRACE_PROPERTY__RESOLVINGS);
		createEAttribute(fTracePropertyEClass, FTRACE_PROPERTY__RESOLVED_FOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(fLinkEClass, FLink.class, "FLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFLink_RuleName(), ecorePackage.getEString(), "ruleName", null, 1, 1, FLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFLink_Properties(), this.getFTraceProperty(), null, "properties", null, 0, -1, FLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fTracePropertyEClass, FTraceProperty.class, "FTraceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFTraceProperty_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, FTraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFTraceProperty_Resolvings(), ecorePackage.getEString(), "resolvings", null, 0, -1, FTraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFTraceProperty_ResolvedFor(), ecorePackage.getEString(), "resolvedFor", null, 0, 1, FTraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Descrition
		createDescritionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Descrition</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDescritionAnnotations() {
		String source = "Descrition";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "This is a flat/compact representation of the trace metamodel \n"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("/")
		   });	
		addAnnotation
		  (fLinkEClass, 
		   source, 
		   new String[] {
			 "ruleName", "this attribute contains the name of the matched rule and a list of unresolved bindings stored per binding name\n"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("/")
		   });
	}

} //FTracePackageImpl
