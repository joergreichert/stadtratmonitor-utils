/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Person;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getPost <em>Post</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#isVotingRight <em>Voting Right</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MembershipImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends MinimalEObjectImpl.Container implements Membership {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

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
	 * The default value of the '{@link #getPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected String post = POST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnBehalfOf() <em>On Behalf Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOf()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_BEHALF_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnBehalfOf() <em>On Behalf Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnBehalfOf()
	 * @generated
	 * @ordered
	 */
	protected String onBehalfOf = ON_BEHALF_OF_EDEFAULT;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEMBERSHIP__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, OparlPackage.PERSON__MEMBERSHIP, Person.class, msgs);
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
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEMBERSHIP__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, OparlPackage.ORGANIZATION__MEMBERSHIP, Organization.class, msgs);
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
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public String getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(String newPost) {
		String oldPost = post;
		post = newPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__POST, oldPost, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnBehalfOf() {
		return onBehalfOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBehalfOf(String newOnBehalfOf) {
		String oldOnBehalfOf = onBehalfOf;
		onBehalfOf = newOnBehalfOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEMBERSHIP__ON_BEHALF_OF, oldOnBehalfOf, onBehalfOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVotingRight() {
		return votingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.MEMBERSHIP__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, OparlPackage.PERSON__MEMBERSHIP, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				if (organization != null)
					msgs = ((InternalEObject)organization).eInverseRemove(this, OparlPackage.ORGANIZATION__MEMBERSHIP, Organization.class, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OparlPackage.MEMBERSHIP__ID:
				return getId();
			case OparlPackage.MEMBERSHIP__TYPE:
				return getType();
			case OparlPackage.MEMBERSHIP__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case OparlPackage.MEMBERSHIP__ROLE:
				return getRole();
			case OparlPackage.MEMBERSHIP__POST:
				return getPost();
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				return getOnBehalfOf();
			case OparlPackage.MEMBERSHIP__VOTING_RIGHT:
				return isVotingRight();
			case OparlPackage.MEMBERSHIP__START_DATE:
				return getStartDate();
			case OparlPackage.MEMBERSHIP__END_DATE:
				return getEndDate();
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
			case OparlPackage.MEMBERSHIP__ID:
				setId((String)newValue);
				return;
			case OparlPackage.MEMBERSHIP__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.MEMBERSHIP__PERSON:
				setPerson((Person)newValue);
				return;
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case OparlPackage.MEMBERSHIP__ROLE:
				setRole((String)newValue);
				return;
			case OparlPackage.MEMBERSHIP__POST:
				setPost((String)newValue);
				return;
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				setOnBehalfOf((String)newValue);
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
			case OparlPackage.MEMBERSHIP__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__PERSON:
				setPerson((Person)null);
				return;
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case OparlPackage.MEMBERSHIP__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__POST:
				setPost(POST_EDEFAULT);
				return;
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				setOnBehalfOf(ON_BEHALF_OF_EDEFAULT);
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
			case OparlPackage.MEMBERSHIP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.MEMBERSHIP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.MEMBERSHIP__PERSON:
				return person != null;
			case OparlPackage.MEMBERSHIP__ORGANIZATION:
				return organization != null;
			case OparlPackage.MEMBERSHIP__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case OparlPackage.MEMBERSHIP__POST:
				return POST_EDEFAULT == null ? post != null : !POST_EDEFAULT.equals(post);
			case OparlPackage.MEMBERSHIP__ON_BEHALF_OF:
				return ON_BEHALF_OF_EDEFAULT == null ? onBehalfOf != null : !ON_BEHALF_OF_EDEFAULT.equals(onBehalfOf);
			case OparlPackage.MEMBERSHIP__VOTING_RIGHT:
				return votingRight != VOTING_RIGHT_EDEFAULT;
			case OparlPackage.MEMBERSHIP__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OparlPackage.MEMBERSHIP__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", role: ");
		result.append(role);
		result.append(", post: ");
		result.append(post);
		result.append(", onBehalfOf: ");
		result.append(onBehalfOf);
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
