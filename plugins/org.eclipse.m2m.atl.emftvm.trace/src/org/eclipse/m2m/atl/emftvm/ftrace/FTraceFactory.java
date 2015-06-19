/**
 */
package org.eclipse.m2m.atl.emftvm.ftrace;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.m2m.atl.emftvm.trace.TraceElement;
import org.eclipse.m2m.atl.emftvm.trace.TraceProperty;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.m2m.atl.emftvm.ftrace.FTracePackage
 * @generated
 */
public interface FTraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FTraceFactory eINSTANCE = org.eclipse.m2m.atl.emftvm.ftrace.impl.FTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FLink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FLink</em>'.
	 * @generated
	 */
	FLink createFLink();

	/**
	 * Returns a new object of class '<em>FTarget Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTarget Element</em>'.
	 * @generated
	 */
	FTargetElement createFTargetElement();

	/**
	 * Returns a new object of class '<em>FSource Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSource Element</em>'.
	 * @generated
	 */
	FSourceElement createFSourceElement();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	FTraceProperty createFTraceProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FTracePackage getFTracePackage();

	/**
	 * Flattens the Trace elements 
	 * @param element
	 * @return {@link FTraceElement}
	 */
	FTraceElement flatten(TraceElement element);

	/**
	 * Flattens the trace properties
	 * @param property
	 * @return {@link FTraceProperty}
	 */
	FTraceProperty flatten(TraceProperty property);

} //FTraceFactory
