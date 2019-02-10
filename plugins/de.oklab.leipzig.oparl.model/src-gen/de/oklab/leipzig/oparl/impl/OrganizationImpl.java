/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AddressableOParlElement;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.MeetingOrganization;
import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.OrganizationLocation;
import de.oklab.leipzig.oparl.Typed;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getSubOrganizationOf <em>Sub Organization Of</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getOrganizationType <em>Organization Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends PersonOrOrganizationImpl implements Organization {
	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> membership;

	/**
	 * The cached value of the '{@link #getMeeting() <em>Meeting</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeeting()
	 * @generated
	 * @ordered
	 */
	protected EList<MeetingOrganization> meeting;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EList<String> post;

	/**
	 * The cached value of the '{@link #getSubOrganizationOf() <em>Sub Organization Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubOrganizationOf()
	 * @generated
	 * @ordered
	 */
	protected Organization subOrganizationOf;

	/**
	 * The default value of the '{@link #getOrganizationType() <em>Organization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationType()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationType() <em>Organization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationType()
	 * @generated
	 * @ordered
	 */
	protected String organizationType = ORGANIZATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected String classification = CLASSIFICATION_EDEFAULT;

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
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected String room = ROOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected OrganizationLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Body getBody() {
		if (eContainerFeatureID() != OparlPackage.ORGANIZATION__BODY) return null;
		return (Body)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body basicGetBody() {
		if (eContainerFeatureID() != OparlPackage.ORGANIZATION__BODY) return null;
		return (Body)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBody, OparlPackage.ORGANIZATION__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(Body newBody) {
		if (newBody != eInternalContainer() || (eContainerFeatureID() != OparlPackage.ORGANIZATION__BODY && newBody != null)) {
			if (EcoreUtil.isAncestor(this, newBody))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, OparlPackage.BODY__ORGANIZATION, Body.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getMembership() {
		if (membership == null) {
			membership = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, OparlPackage.ORGANIZATION__MEMBERSHIP, OparlPackage.MEMBERSHIP__ORGANIZATION);
		}
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeetingOrganization> getMeeting() {
		if (meeting == null) {
			meeting = new EObjectContainmentWithInverseEList<MeetingOrganization>(MeetingOrganization.class, this, OparlPackage.ORGANIZATION__MEETING, OparlPackage.MEETING_ORGANIZATION__ORGANIZATION);
		}
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPost() {
		if (post == null) {
			post = new EDataTypeEList<String>(String.class, this, OparlPackage.ORGANIZATION__POST);
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organization getSubOrganizationOf() {
		if (subOrganizationOf != null && subOrganizationOf.eIsProxy()) {
			InternalEObject oldSubOrganizationOf = (InternalEObject)subOrganizationOf;
			subOrganizationOf = (Organization)eResolveProxy(oldSubOrganizationOf);
			if (subOrganizationOf != oldSubOrganizationOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF, oldSubOrganizationOf, subOrganizationOf));
			}
		}
		return subOrganizationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetSubOrganizationOf() {
		return subOrganizationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubOrganizationOf(Organization newSubOrganizationOf) {
		Organization oldSubOrganizationOf = subOrganizationOf;
		subOrganizationOf = newSubOrganizationOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF, oldSubOrganizationOf, subOrganizationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationType() {
		return organizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationType(String newOrganizationType) {
		String oldOrganizationType = organizationType;
		organizationType = newOrganizationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__ORGANIZATION_TYPE, oldOrganizationType, organizationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassification(String newClassification) {
		String oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__CLASSIFICATION, oldClassification, classification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoom(String newRoom) {
		String oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(OrganizationLocation newLocation, NotificationChain msgs) {
		OrganizationLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__LOCATION, oldLocation, newLocation);
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
	public void setLocation(OrganizationLocation newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION, OrganizationLocation.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION, OrganizationLocation.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return "https://oparl.org/schema/1.0/Organization$";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreetAddress() {
		return super.getStreetAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return super.getPostalCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocality() {
		return super.getLocality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.ORGANIZATION__BODY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBody((Body)otherEnd, msgs);
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
			case OparlPackage.ORGANIZATION__MEETING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeeting()).basicAdd(otherEnd, msgs);
			case OparlPackage.ORGANIZATION__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.ORGANIZATION__LOCATION, null, msgs);
				return basicSetLocation((OrganizationLocation)otherEnd, msgs);
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
			case OparlPackage.ORGANIZATION__BODY:
				return basicSetBody(null, msgs);
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return ((InternalEList<?>)getMembership()).basicRemove(otherEnd, msgs);
			case OparlPackage.ORGANIZATION__MEETING:
				return ((InternalEList<?>)getMeeting()).basicRemove(otherEnd, msgs);
			case OparlPackage.ORGANIZATION__LOCATION:
				return basicSetLocation(null, msgs);
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
			case OparlPackage.ORGANIZATION__BODY:
				return eInternalContainer().eInverseRemove(this, OparlPackage.BODY__ORGANIZATION, Body.class, msgs);
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
			case OparlPackage.ORGANIZATION__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return getMembership();
			case OparlPackage.ORGANIZATION__MEETING:
				return getMeeting();
			case OparlPackage.ORGANIZATION__POST:
				return getPost();
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				if (resolve) return getSubOrganizationOf();
				return basicGetSubOrganizationOf();
			case OparlPackage.ORGANIZATION__ORGANIZATION_TYPE:
				return getOrganizationType();
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				return getClassification();
			case OparlPackage.ORGANIZATION__START_DATE:
				return getStartDate();
			case OparlPackage.ORGANIZATION__END_DATE:
				return getEndDate();
			case OparlPackage.ORGANIZATION__WEBSITE:
				return getWebsite();
			case OparlPackage.ORGANIZATION__ROOM:
				return getRoom();
			case OparlPackage.ORGANIZATION__LOCATION:
				return getLocation();
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
			case OparlPackage.ORGANIZATION__BODY:
				setBody((Body)newValue);
				return;
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case OparlPackage.ORGANIZATION__MEETING:
				getMeeting().clear();
				getMeeting().addAll((Collection<? extends MeetingOrganization>)newValue);
				return;
			case OparlPackage.ORGANIZATION__POST:
				getPost().clear();
				getPost().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				setSubOrganizationOf((Organization)newValue);
				return;
			case OparlPackage.ORGANIZATION__ORGANIZATION_TYPE:
				setOrganizationType((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OparlPackage.ORGANIZATION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OparlPackage.ORGANIZATION__WEBSITE:
				setWebsite((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__ROOM:
				setRoom((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__LOCATION:
				setLocation((OrganizationLocation)newValue);
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
			case OparlPackage.ORGANIZATION__BODY:
				setBody((Body)null);
				return;
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				getMembership().clear();
				return;
			case OparlPackage.ORGANIZATION__MEETING:
				getMeeting().clear();
				return;
			case OparlPackage.ORGANIZATION__POST:
				getPost().clear();
				return;
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				setSubOrganizationOf((Organization)null);
				return;
			case OparlPackage.ORGANIZATION__ORGANIZATION_TYPE:
				setOrganizationType(ORGANIZATION_TYPE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__ROOM:
				setRoom(ROOM_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__LOCATION:
				setLocation((OrganizationLocation)null);
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
			case OparlPackage.ORGANIZATION__BODY:
				return basicGetBody() != null;
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return membership != null && !membership.isEmpty();
			case OparlPackage.ORGANIZATION__MEETING:
				return meeting != null && !meeting.isEmpty();
			case OparlPackage.ORGANIZATION__POST:
				return post != null && !post.isEmpty();
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				return subOrganizationOf != null;
			case OparlPackage.ORGANIZATION__ORGANIZATION_TYPE:
				return ORGANIZATION_TYPE_EDEFAULT == null ? organizationType != null : !ORGANIZATION_TYPE_EDEFAULT.equals(organizationType);
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case OparlPackage.ORGANIZATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OparlPackage.ORGANIZATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OparlPackage.ORGANIZATION__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case OparlPackage.ORGANIZATION__ROOM:
				return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
			case OparlPackage.ORGANIZATION__LOCATION:
				return location != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Typed.class) {
			switch (baseOperationID) {
				case OparlPackage.TYPED___GET_TYPE: return OparlPackage.ORGANIZATION___GET_TYPE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AddressableOParlElement.class) {
			switch (baseOperationID) {
				case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS: return OparlPackage.ORGANIZATION___GET_STREET_ADDRESS;
				case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE: return OparlPackage.ORGANIZATION___GET_POSTAL_CODE;
				case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY: return OparlPackage.ORGANIZATION___GET_LOCALITY;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OparlPackage.ORGANIZATION___GET_TYPE:
				return getType();
			case OparlPackage.ORGANIZATION___GET_STREET_ADDRESS:
				return getStreetAddress();
			case OparlPackage.ORGANIZATION___GET_POSTAL_CODE:
				return getPostalCode();
			case OparlPackage.ORGANIZATION___GET_LOCALITY:
				return getLocality();
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
		result.append(" (post: ");
		result.append(post);
		result.append(", organizationType: ");
		result.append(organizationType);
		result.append(", classification: ");
		result.append(classification);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", website: ");
		result.append(website);
		result.append(", room: ");
		result.append(room);
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
