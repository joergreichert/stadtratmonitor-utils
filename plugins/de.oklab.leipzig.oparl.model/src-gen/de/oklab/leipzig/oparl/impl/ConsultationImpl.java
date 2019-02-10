/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#isAuthoritative <em>Authoritative</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsultationImpl extends InnerOParlElementImpl implements Consultation {
	/**
	 * The cached value of the '{@link #getAgendaItem() <em>Agenda Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaItem()
	 * @generated
	 * @ordered
	 */
	protected AgendaItem agendaItem;

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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organization;

	/**
	 * The default value of the '{@link #isAuthoritative() <em>Authoritative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthoritative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHORITATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthoritative() <em>Authoritative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthoritative()
	 * @generated
	 * @ordered
	 */
	protected boolean authoritative = AUTHORITATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.CONSULTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paper getPaper() {
		if (eContainerFeatureID() != OparlPackage.CONSULTATION__PAPER) return null;
		return (Paper)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper basicGetPaper() {
		if (eContainerFeatureID() != OparlPackage.CONSULTATION__PAPER) return null;
		return (Paper)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaper(Paper newPaper, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPaper, OparlPackage.CONSULTATION__PAPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaper(Paper newPaper) {
		if (newPaper != eInternalContainer() || (eContainerFeatureID() != OparlPackage.CONSULTATION__PAPER && newPaper != null)) {
			if (EcoreUtil.isAncestor(this, newPaper))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaper != null)
				msgs = ((InternalEObject)newPaper).eInverseAdd(this, OparlPackage.PAPER__CONSULTATION, Paper.class, msgs);
			msgs = basicSetPaper(newPaper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__PAPER, newPaper, newPaper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgendaItem getAgendaItem() {
		if (agendaItem != null && agendaItem.eIsProxy()) {
			InternalEObject oldAgendaItem = (InternalEObject)agendaItem;
			agendaItem = (AgendaItem)eResolveProxy(oldAgendaItem);
			if (agendaItem != oldAgendaItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.CONSULTATION__AGENDA_ITEM, oldAgendaItem, agendaItem));
			}
		}
		return agendaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendaItem basicGetAgendaItem() {
		return agendaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgendaItem(AgendaItem newAgendaItem, NotificationChain msgs) {
		AgendaItem oldAgendaItem = agendaItem;
		agendaItem = newAgendaItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__AGENDA_ITEM, oldAgendaItem, newAgendaItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgendaItem(AgendaItem newAgendaItem) {
		if (newAgendaItem != agendaItem) {
			NotificationChain msgs = null;
			if (agendaItem != null)
				msgs = ((InternalEObject)agendaItem).eInverseRemove(this, OparlPackage.AGENDA_ITEM__CONSULTATION, AgendaItem.class, msgs);
			if (newAgendaItem != null)
				msgs = ((InternalEObject)newAgendaItem).eInverseAdd(this, OparlPackage.AGENDA_ITEM__CONSULTATION, AgendaItem.class, msgs);
			msgs = basicSetAgendaItem(newAgendaItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__AGENDA_ITEM, newAgendaItem, newAgendaItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meeting getMeeting() {
		if (meeting != null && meeting.eIsProxy()) {
			InternalEObject oldMeeting = (InternalEObject)meeting;
			meeting = (Meeting)eResolveProxy(oldMeeting);
			if (meeting != oldMeeting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.CONSULTATION__MEETING, oldMeeting, meeting));
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
	@Override
	public void setMeeting(Meeting newMeeting) {
		Meeting oldMeeting = meeting;
		meeting = newMeeting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__MEETING, oldMeeting, meeting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Organization> getOrganization() {
		if (organization == null) {
			organization = new EObjectResolvingEList<Organization>(Organization.class, this, OparlPackage.CONSULTATION__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuthoritative() {
		return authoritative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoritative(boolean newAuthoritative) {
		boolean oldAuthoritative = authoritative;
		authoritative = newAuthoritative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__AUTHORITATIVE, oldAuthoritative, authoritative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return "https://oparl.org/schema/1.0/Consultation";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.CONSULTATION__PAPER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPaper((Paper)otherEnd, msgs);
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				if (agendaItem != null)
					msgs = ((InternalEObject)agendaItem).eInverseRemove(this, OparlPackage.AGENDA_ITEM__CONSULTATION, AgendaItem.class, msgs);
				return basicSetAgendaItem((AgendaItem)otherEnd, msgs);
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
			case OparlPackage.CONSULTATION__PAPER:
				return basicSetPaper(null, msgs);
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				return basicSetAgendaItem(null, msgs);
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
			case OparlPackage.CONSULTATION__PAPER:
				return eInternalContainer().eInverseRemove(this, OparlPackage.PAPER__CONSULTATION, Paper.class, msgs);
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
			case OparlPackage.CONSULTATION__PAPER:
				if (resolve) return getPaper();
				return basicGetPaper();
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				if (resolve) return getAgendaItem();
				return basicGetAgendaItem();
			case OparlPackage.CONSULTATION__MEETING:
				if (resolve) return getMeeting();
				return basicGetMeeting();
			case OparlPackage.CONSULTATION__ORGANIZATION:
				return getOrganization();
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				return isAuthoritative();
			case OparlPackage.CONSULTATION__ROLE:
				return getRole();
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
			case OparlPackage.CONSULTATION__PAPER:
				setPaper((Paper)newValue);
				return;
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				setAgendaItem((AgendaItem)newValue);
				return;
			case OparlPackage.CONSULTATION__MEETING:
				setMeeting((Meeting)newValue);
				return;
			case OparlPackage.CONSULTATION__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				setAuthoritative((Boolean)newValue);
				return;
			case OparlPackage.CONSULTATION__ROLE:
				setRole((String)newValue);
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
			case OparlPackage.CONSULTATION__PAPER:
				setPaper((Paper)null);
				return;
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				setAgendaItem((AgendaItem)null);
				return;
			case OparlPackage.CONSULTATION__MEETING:
				setMeeting((Meeting)null);
				return;
			case OparlPackage.CONSULTATION__ORGANIZATION:
				getOrganization().clear();
				return;
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				setAuthoritative(AUTHORITATIVE_EDEFAULT);
				return;
			case OparlPackage.CONSULTATION__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case OparlPackage.CONSULTATION__PAPER:
				return basicGetPaper() != null;
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				return agendaItem != null;
			case OparlPackage.CONSULTATION__MEETING:
				return meeting != null;
			case OparlPackage.CONSULTATION__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				return authoritative != AUTHORITATIVE_EDEFAULT;
			case OparlPackage.CONSULTATION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OparlPackage.CONSULTATION___GET_TYPE:
				return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (authoritative: ");
		result.append(authoritative);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ConsultationImpl
