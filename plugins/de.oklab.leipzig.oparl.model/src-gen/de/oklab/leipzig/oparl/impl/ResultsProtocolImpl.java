/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.ResultsProtocol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Results Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ResultsProtocolImpl#getMeeting <em>Meeting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultsProtocolImpl extends FileImpl implements ResultsProtocol {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultsProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.RESULTS_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting getMeeting() {
		if (eContainerFeatureID() != OparlPackage.RESULTS_PROTOCOL__MEETING) return null;
		return (Meeting)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting basicGetMeeting() {
		if (eContainerFeatureID() != OparlPackage.RESULTS_PROTOCOL__MEETING) return null;
		return (Meeting)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeeting(Meeting newMeeting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMeeting, OparlPackage.RESULTS_PROTOCOL__MEETING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeeting(Meeting newMeeting) {
		if (newMeeting != eInternalContainer() || (eContainerFeatureID() != OparlPackage.RESULTS_PROTOCOL__MEETING && newMeeting != null)) {
			if (EcoreUtil.isAncestor(this, newMeeting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeeting != null)
				msgs = ((InternalEObject)newMeeting).eInverseAdd(this, OparlPackage.MEETING__RESULTS_PROTOCOL, Meeting.class, msgs);
			msgs = basicSetMeeting(newMeeting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.RESULTS_PROTOCOL__MEETING, newMeeting, newMeeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMeeting((Meeting)otherEnd, msgs);
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
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				return basicSetMeeting(null, msgs);
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
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				return eInternalContainer().eInverseRemove(this, OparlPackage.MEETING__RESULTS_PROTOCOL, Meeting.class, msgs);
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
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				if (resolve) return getMeeting();
				return basicGetMeeting();
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
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				setMeeting((Meeting)newValue);
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
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				setMeeting((Meeting)null);
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
			case OparlPackage.RESULTS_PROTOCOL__MEETING:
				return basicGetMeeting() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultsProtocolImpl
