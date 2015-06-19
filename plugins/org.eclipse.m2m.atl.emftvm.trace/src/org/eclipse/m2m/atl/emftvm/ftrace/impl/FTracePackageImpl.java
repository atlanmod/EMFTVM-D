/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.ftrace.FSourceElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTargetElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceElement;
import org.eclipse.m2m.atl.emftvm.ftrace.FTraceFactory;
import org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage;
import org.eclipse.m2m.atl.emftvm.ftrace.TraceProperty;
import trace.TracePackage;
import trace.impl.TracePackageImpl;

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
	private EClass fTraceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fTargetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fSourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaListEDataType = null;

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

		// Obtain or create and register interdependencies
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) : TracePackage.eINSTANCE);

		// Create package meta-data objects
		theFTracePackage.createPackageContents();
		theTracePackage.createPackageContents();

		// Initialize created meta-data
		theFTracePackage.initializePackageContents();
		theTracePackage.initializePackageContents();

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
	public EReference getFLink_Sources() {
		return (EReference)fLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFLink_Targets() {
		return (EReference)fLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFTraceElement() {
		return fTraceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTraceElement_Name() {
		return (EAttribute)fTraceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFTraceElement_Object() {
		return (EReference)fTraceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFTraceElement_RuntimeObject() {
		return (EAttribute)fTraceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFTargetElement() {
		return fTargetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSourceElement() {
		return fSourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSourceElement_MapsToSelf() {
		return (EAttribute)fSourceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceProperty() {
		return tracePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceProperty_PropertyName() {
		return (EAttribute)tracePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceProperty_ResolvedFor() {
		return (EReference)tracePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceProperty_Resolvings() {
		return (EReference)tracePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceProperty_Resolved() {
		return (EAttribute)tracePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceProperty_AppliedAt() {
		return (EReference)tracePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTraceProperty__ResolveBinding__List() {
		return tracePropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJavaList() {
		return javaListEDataType;
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
		createEReference(fLinkEClass, FLINK__SOURCES);
		createEReference(fLinkEClass, FLINK__TARGETS);

		fTraceElementEClass = createEClass(FTRACE_ELEMENT);
		createEAttribute(fTraceElementEClass, FTRACE_ELEMENT__NAME);
		createEReference(fTraceElementEClass, FTRACE_ELEMENT__OBJECT);
		createEAttribute(fTraceElementEClass, FTRACE_ELEMENT__RUNTIME_OBJECT);

		fTargetElementEClass = createEClass(FTARGET_ELEMENT);

		fSourceElementEClass = createEClass(FSOURCE_ELEMENT);
		createEAttribute(fSourceElementEClass, FSOURCE_ELEMENT__MAPS_TO_SELF);

		tracePropertyEClass = createEClass(TRACE_PROPERTY);
		createEAttribute(tracePropertyEClass, TRACE_PROPERTY__PROPERTY_NAME);
		createEReference(tracePropertyEClass, TRACE_PROPERTY__RESOLVED_FOR);
		createEReference(tracePropertyEClass, TRACE_PROPERTY__RESOLVINGS);
		createEAttribute(tracePropertyEClass, TRACE_PROPERTY__RESOLVED);
		createEReference(tracePropertyEClass, TRACE_PROPERTY__APPLIED_AT);
		createEOperation(tracePropertyEClass, TRACE_PROPERTY___RESOLVE_BINDING__LIST);

		// Create data types
		javaListEDataType = createEDataType(JAVA_LIST);
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

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(javaListEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		fTargetElementEClass.getESuperTypes().add(this.getFTraceElement());
		fSourceElementEClass.getESuperTypes().add(this.getFTraceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(fLinkEClass, FLink.class, "FLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFLink_RuleName(), ecorePackage.getEString(), "ruleName", null, 1, 1, FLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFLink_Sources(), this.getFSourceElement(), null, "sources", null, 0, -1, FLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFLink_Targets(), this.getFTargetElement(), null, "targets", null, 1, -1, FLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fTraceElementEClass, FTraceElement.class, "FTraceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFTraceElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, FTraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTraceElement_Object(), ecorePackage.getEObject(), null, "object", null, 0, 1, FTraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFTraceElement_RuntimeObject(), ecorePackage.getEJavaObject(), "runtimeObject", null, 0, 1, FTraceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fTargetElementEClass, FTargetElement.class, "FTargetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fSourceElementEClass, FSourceElement.class, "FSourceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFSourceElement_MapsToSelf(), ecorePackage.getEBoolean(), "mapsToSelf", null, 0, 1, FSourceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracePropertyEClass, TraceProperty.class, "TraceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceProperty_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, TraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceProperty_ResolvedFor(), this.getFTargetElement(), null, "resolvedFor", null, 1, 1, TraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceProperty_Resolvings(), ecorePackage.getEObject(), null, "resolvings", null, 0, -1, TraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraceProperty_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 0, 1, TraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceProperty_AppliedAt(), this.getFLink(), null, "appliedAt", null, 0, 1, TraceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTraceProperty__ResolveBinding__List(), null, "resolveBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theTracePackage.getJavaList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "traces", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theTracePackage.getJavaList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(javaListEDataType, List.class, "JavaList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Descrition
		createDescritionAnnotations();
		// null
		createNullAnnotations();
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
			 "ruleName", "this attribute contains the name of the matched rule"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("/")
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (javaListEDataType, 
		   source, 
		   new String[] {
		   });
	}

} //FTracePackageImpl
