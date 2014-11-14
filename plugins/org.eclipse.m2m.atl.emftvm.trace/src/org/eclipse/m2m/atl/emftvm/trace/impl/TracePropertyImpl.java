/**
 * (C) 2011 Dennis Wagelaar, Vrije Universiteit Brussel
 */
package org.eclipse.m2m.atl.emftvm.trace.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.atl.emftvm.trace.SourceElement;
import org.eclipse.m2m.atl.emftvm.trace.TargetElement;
import org.eclipse.m2m.atl.emftvm.trace.TraceLink;
import org.eclipse.m2m.atl.emftvm.trace.TraceLinkSet;
import org.eclipse.m2m.atl.emftvm.trace.TracePackage;
import org.eclipse.m2m.atl.emftvm.trace.TraceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.trace.impl.TracePropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.trace.impl.TracePropertyImpl#getResolvedFor <em>Resolved For</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.trace.impl.TracePropertyImpl#getResolvings <em>Resolvings</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.trace.impl.TracePropertyImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.m2m.atl.emftvm.trace.impl.TracePropertyImpl#getAppliedAt <em>Applied At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracePropertyImpl extends EObjectImpl implements TraceProperty {
	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolvedFor() <em>Resolved For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedFor()
	 * @generated
	 * @ordered
	 */
	protected TargetElement resolvedFor;

	/**
	 * The cached value of the '{@link #getResolvings() <em>Resolvings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvings()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> resolvings;

	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_PROPERTY__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement getResolvedFor() {
		if (resolvedFor != null && resolvedFor.eIsProxy()) {
			InternalEObject oldResolvedFor = (InternalEObject)resolvedFor;
			resolvedFor = (TargetElement)eResolveProxy(oldResolvedFor);
			if (resolvedFor != oldResolvedFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRACE_PROPERTY__RESOLVED_FOR, oldResolvedFor, resolvedFor));
			}
		}
		return resolvedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement basicGetResolvedFor() {
		return resolvedFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedFor(TargetElement newResolvedFor) {
		TargetElement oldResolvedFor = resolvedFor;
		resolvedFor = newResolvedFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_PROPERTY__RESOLVED_FOR, oldResolvedFor, resolvedFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getResolvings() {
		if (resolvings == null) {
			resolvings = new EObjectResolvingEList<EObject>(EObject.class, this, TracePackage.TRACE_PROPERTY__RESOLVINGS);
		}
		return resolvings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_PROPERTY__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getAppliedAt() {
		if (eContainerFeatureID() != TracePackage.TRACE_PROPERTY__APPLIED_AT) return null;
		return (TraceLink)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedAt(TraceLink newAppliedAt, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAppliedAt, TracePackage.TRACE_PROPERTY__APPLIED_AT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedAt(TraceLink newAppliedAt) {
		if (newAppliedAt != eInternalContainer() || (eContainerFeatureID() != TracePackage.TRACE_PROPERTY__APPLIED_AT && newAppliedAt != null)) {
			if (EcoreUtil.isAncestor(this, newAppliedAt))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAppliedAt != null)
				msgs = ((InternalEObject)newAppliedAt).eInverseAdd(this, TracePackage.TRACE_LINK__PROPERTIES, TraceLink.class, msgs);
			msgs = basicSetAppliedAt(newAppliedAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE_PROPERTY__APPLIED_AT, newAppliedAt, newAppliedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	public List<EObject> resolveBinding(TraceLinkSet traces, ResourceSet rs) {
		assert resolvings != null;
		assert resolvedFor != null;
		EList<EObject> result = new BasicEList<EObject>();
		for (EObject next : resolvings) {
			if (next.eIsProxy()) {
					InternalEObject oldObject = (InternalEObject)next;
					next = EcoreUtil.resolve(oldObject, rs);	    
			}
		final SourceElement se = traces.getDefaultSourceElement(next);
		if (se != null && !se.isMapsToSelf()) {
			final EList<TargetElement> seMapsTo = se.getMapsTo();
			if (!seMapsTo.isEmpty()) {
				assert seMapsTo.get(0).getObject().eResource() != null;
				result.add(seMapsTo.get(0).getObject());
				//next = seMapsTo.get(0).getObject();
			} else {
				for (TargetElement te : se.getSourceOf()
						.getTargetElements()) {
					if (te.getMapsTo().isEmpty()) { // default mapping
						assert te.getObject().eResource() != null;
						result.add(te.getObject());
						//next = te.getObject();
						break;
					}
				}
			}
		}
		result.add(next);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAppliedAt((TraceLink)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				return basicSetAppliedAt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				return eInternalContainer().eInverseRemove(this, TracePackage.TRACE_LINK__PROPERTIES, TraceLink.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracePackage.TRACE_PROPERTY__PROPERTY_NAME:
				return getPropertyName();
			case TracePackage.TRACE_PROPERTY__RESOLVED_FOR:
				if (resolve) return getResolvedFor();
				return basicGetResolvedFor();
			case TracePackage.TRACE_PROPERTY__RESOLVINGS:
				return getResolvings();
			case TracePackage.TRACE_PROPERTY__RESOLVED:
				return isResolved();
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				return getAppliedAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracePackage.TRACE_PROPERTY__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case TracePackage.TRACE_PROPERTY__RESOLVED_FOR:
				setResolvedFor((TargetElement)newValue);
				return;
			case TracePackage.TRACE_PROPERTY__RESOLVINGS:
				getResolvings().clear();
				getResolvings().addAll((Collection<? extends EObject>)newValue);
				return;
			case TracePackage.TRACE_PROPERTY__RESOLVED:
				setResolved((Boolean)newValue);
				return;
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				setAppliedAt((TraceLink)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracePackage.TRACE_PROPERTY__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case TracePackage.TRACE_PROPERTY__RESOLVED_FOR:
				setResolvedFor((TargetElement)null);
				return;
			case TracePackage.TRACE_PROPERTY__RESOLVINGS:
				getResolvings().clear();
				return;
			case TracePackage.TRACE_PROPERTY__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				setAppliedAt((TraceLink)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracePackage.TRACE_PROPERTY__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case TracePackage.TRACE_PROPERTY__RESOLVED_FOR:
				return resolvedFor != null;
			case TracePackage.TRACE_PROPERTY__RESOLVINGS:
				return resolvings != null && !resolvings.isEmpty();
			case TracePackage.TRACE_PROPERTY__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case TracePackage.TRACE_PROPERTY__APPLIED_AT:
				return getAppliedAt() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

} //TracePropertyImpl
