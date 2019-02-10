/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Person;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#isVotingRight <em>Voting Right</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends InnerOParlElementImpl implements Membership {
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
	 * The default value of the '{@link #isVotingRight() <em>Voting Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVotingRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOTING_RIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVotingRight() <em>Voting Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVotingRight()
	 * @generated
	 * @ordered
	 */
	protected boolean votingRight = VOTING_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnBehalfOf() <em>On Behalf Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOf()
	 * @generated
	 * @ordered
	 */
	protected Organization onBehalfOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (eContainerFeatureID() != OparlPackage.MEMBERSHIP__PERSON) return null;
		return (Person)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		if (eContainerFeatureID() != OparlPackage.MEMBERSHIP__PERSON) return null;
		return (Person)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPerson, OparlPackage.MEMBERSHIP__PERSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(Person newPerson) {
		if (newPerson != eInternalContainer() || (eContainerFeatureID() != OparlPackage.MEMBERSHIP__PERSON && newPerson != null)) {
			if (EcoreUtil.isAncestor(this, newPerson))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, OparlPackage.PERSON__MEMBERSHIP, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getOrganization() {
		if (eContainerFeatureID() != OparlPackage.MEMBERSHIP__ORGANIZATION) return null;
		return (Organization)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		if (eContainerFeatureID() != OparlPackage.MEMBERSHIP__ORGANIZATION) return null;
		return (Organization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganization, OparlPackage.MEMBERSHIP__ORGANIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != eInternalContainer() || (eContainerFeatureID() != OparlPackage.MEMBERSHIP__ORGANIZATION && newOrganization != null)) {
			if (EcoreUtil.isAncestor(this, newOrganization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, OparlPackage.ORGANIZATION__MEMBERSHIP, Organization.class, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__ORGANIZATION, newOrganization, newOrganization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVotingRight() {
		return votingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVotingRight(boolean newVotingRight) {
		boolean oldVotingRight = votingRight;
		votingRight = newVotingRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__VOTING_RIGHT, oldVotingRight, votingRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getOnBehalfOf() {
		if (onBehalfOf != null && onBehalfOf.eIsProxy()) {
			InternalEObject oldOnBehalfOf = (InternalEObject)onBehalfOf;
			onBehalfOf = (Organization)eResolveProxy(oldOnBehalfOf);
			if (onBehalfOf != oldOnBehalfOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEMBERSHIP__ON_BEHALF_OF, oldOnBehalfOf, onBehalfOf));
			}
		}
		return onBehalfOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOnBehalfOf() {
		return onBehalfOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnBehalfOf(Organization newOnBehalfOf) {
		Organization oldOnBehalfOf = onBehalfOf;
		onBehalfOf = newOnBehalfOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__ON_BEHALF_OF, oldOnBehalfOf, onBehalfOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return "https://oparl.org/schema/1.0/Membership";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.MEMBERSHIP__PERSON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPerson((Person)otherEnd, msgs);
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
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
			case OparlPackage.MEMBERSHIP__PERSON:
				return basicSetPerson(null, msgs);
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
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
			case OparlPackage.MEMBERSHIP__PERSON:
				return eInternalContainer().eInverseRemove(this, OparlPackage.PERSON__MEMBERSHIP, Person.class, msgs);
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OparlPackage.ORGANIZATION__MEMBERSHIP, Organization.class, msgs);
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
			case OparlPackage.MEMBERSHIP__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case OparlPackage.MEMBERSHIP__ROLE:
				return getRole();
			case OparlPackage.MEMBERSHIP__VOTING_RIGHT:
				return isVotingRight();
			case OparlPackage.MEMBERSHIP__START_DATE:
				return getStartDate();
			case OparlPackage.MEMBERSHIP__END_DATE:
				return getEndDate();
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				if (resolve) return getOnBehalfOf();
				return basicGetOnBehalfOf();
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
			case OparlPackage.MEMBERSHIP__PERSON:
				setPerson((Person)newValue);
				return;
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OparlPackage.MEMBERSHIP__ROLE:
				setRole((String)newValue);
				return;
			case OparlPackage.MEMBERSHIP__VOTING_RIGHT:
				setVotingRight((Boolean)newValue);
				return;
			case OparlPackage.MEMBERSHIP__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OparlPackage.MEMBERSHIP__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				setOnBehalfOf((Organization)newValue);
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
			case OparlPackage.MEMBERSHIP__PERSON:
				setPerson((Person)null);
				return;
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OparlPackage.MEMBERSHIP__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__VOTING_RIGHT:
				setVotingRight(VOTING_RIGHT_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				setOnBehalfOf((Organization)null);
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
			case OparlPackage.MEMBERSHIP__PERSON:
				return basicGetPerson() != null;
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				return basicGetOrganization() != null;
			case OparlPackage.MEMBERSHIP__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case OparlPackage.MEMBERSHIP__VOTING_RIGHT:
				return votingRight != VOTING_RIGHT_EDEFAULT;
			case OparlPackage.MEMBERSHIP__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OparlPackage.MEMBERSHIP__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				return onBehalfOf != null;
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
			case OparlPackage.MEMBERSHIP___GET_TYPE:
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
		result.append(" (role: ");
		result.append(role);
		result.append(", votingRight: ");
		result.append(votingRight);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //MembershipImpl
