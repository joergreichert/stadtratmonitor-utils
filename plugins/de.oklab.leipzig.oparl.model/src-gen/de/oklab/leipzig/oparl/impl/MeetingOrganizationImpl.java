/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.MeetingOrganization;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meeting Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingOrganizationImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingOrganizationImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeetingOrganizationImpl extends MinimalEObjectImpl.Container implements MeetingOrganization {
	/**
	 * The cached value of the '{@link #getMeeting() <em>Meeting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeeting()
	 * @generated
	 * @ordered
	 */
	protected Meeting meeting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeetingOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.MEETING_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting getMeeting() {
		if (meeting != null && meeting.eIsProxy()) {
			InternalEObject oldMeeting = (InternalEObject)meeting;
			meeting = (Meeting)eResolveProxy(oldMeeting);
			if (meeting != oldMeeting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEETING_ORGANIZATION__MEETING, oldMeeting, meeting));
			}
		}
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting basicGetMeeting() {
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeeting(Meeting newMeeting, NotificationChain msgs) {
		Meeting oldMeeting = meeting;
		meeting = newMeeting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING_ORGANIZATION__MEETING, oldMeeting, newMeeting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeeting(Meeting newMeeting) {
		if (newMeeting != meeting) {
			NotificationChain msgs = null;
			if (meeting != null)
				msgs = ((InternalEObject)meeting).eInverseRemove(this, OparlPackage.MEETING__ORGANIZATION, Meeting.class, msgs);
			if (newMeeting != null)
				msgs = ((InternalEObject)newMeeting).eInverseAdd(this, OparlPackage.MEETING__ORGANIZATION, Meeting.class, msgs);
			msgs = basicSetMeeting(newMeeting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING_ORGANIZATION__MEETING, newMeeting, newMeeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (eContainerFeatureID() != OparlPackage.MEETING_ORGANIZATION__ORGANIZATION) return null;
		return (Organization)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		if (eContainerFeatureID() != OparlPackage.MEETING_ORGANIZATION__ORGANIZATION) return null;
		return (Organization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, OparlPackage.MEETING_ORGANIZATION__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != eInternalContainer() || (eContainerFeatureID() != OparlPackage.MEETING_ORGANIZATION__ORGANIZATION && newOrganization != null)) {
			if (EcoreUtil.isAncestor(this, newOrganization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, OparlPackage.ORGANIZATION__MEETING, Organization.class, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING_ORGANIZATION__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.MEETING_ORGANIZATION__MEETING:
				if (meeting != null)
					msgs = ((InternalEObject)meeting).eInverseRemove(this, OparlPackage.MEETING__ORGANIZATION, Meeting.class, msgs);
				return basicSetMeeting((Meeting)otherEnd, msgs);
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganization((Organization)otherEnd, msgs);
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
			case OparlPackage.MEETING_ORGANIZATION__MEETING:
				return basicSetMeeting(null, msgs);
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
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
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OparlPackage.ORGANIZATION__MEETING, Organization.class, msgs);
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
			case OparlPackage.MEETING_ORGANIZATION__MEETING:
				if (resolve) return getMeeting();
				return basicGetMeeting();
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OparlPackage.MEETING_ORGANIZATION__MEETING:
				setMeeting((Meeting)newValue);
				return;
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				setOrganization((Organization)newValue);
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
			case OparlPackage.MEETING_ORGANIZATION__MEETING:
				setMeeting((Meeting)null);
				return;
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				setOrganization((Organization)null);
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
			case OparlPackage.MEETING_ORGANIZATION__MEETING:
				return meeting != null;
			case OparlPackage.MEETING_ORGANIZATION__ORGANIZATION:
				return basicGetOrganization() != null;
		}
		return super.eIsSet(featureID);
	}

} //MeetingOrganizationImpl
