package org.eclipse.m2m.atl.emftvm.ftrace.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.emftvm.ftrace.FLink;
import org.eclipse.m2m.atl.emftvm.trace.SourceElement;
import org.eclipse.m2m.atl.emftvm.trace.TargetElement;
import org.eclipse.m2m.atl.emftvm.trace.TraceLink;
import org.eclipse.m2m.atl.emftvm.trace.TraceProperty;
import org.eclipse.m2m.atl.emftvm.trace.TracedRule;

public class TraceLinkWrapper  implements TraceLink{
	
	@SuppressWarnings("unused")
	private FLink link;
	
	public TraceLinkWrapper(FLink link) {
		this.link = link;
		
	}

	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub

	}

	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub

	}

	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub

	}

	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub

	}

	public TracedRule getRule() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRule(TracedRule value) {
		// TODO Auto-generated method stub

	}

	public boolean isOverridden() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setOverridden(boolean value) {
		// TODO Auto-generated method stub

	}

	public EList<TraceProperty> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	public SourceElement getSourceElement(String name, boolean create) {
		// TODO Auto-generated method stub
		return null;
	}

	public TargetElement getTargetElement(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public EList<SourceElement> getSourceElements() {
		// TODO Auto-generated method stub
		return null;
	}

	public EList<TargetElement> getTargetElements() {
		// TODO Auto-generated method stub
		return null;
	}

	public TargetElement findTargetForObject(EObject eo) {
		// TODO Auto-generated method stub
		return null;
	}

}
