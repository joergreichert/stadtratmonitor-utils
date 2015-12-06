/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getPost <em>Post</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getSubOrganizationOf <em>Sub Organization Of</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationImpl#getWebsite <em>Website</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends PersonOrOrganizationImpl implements Organization {
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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Body body;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> membership;

	/**
	 * The cached value of the '{@link #getMeeting() <em>Meeting</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeeting()
	 * @generated
	 * @ordered
	 */
	protected EList<Meeting> meeting;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keyword;

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
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (Body)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.ORGANIZATION__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		Body oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Body newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, OparlPackage.BODY__ORGANIZATION, Body.class, msgs);
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getMembership() {
		if (membership == null) {
			membership = new EObjectWithInverseResolvingEList<Membership>(Membership.class, this, OparlPackage.ORGANIZATION__MEMBERSHIP, OparlPackage.MEMBERSHIP__ORGANIZATION);
		}
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meeting> getMeeting() {
		if (meeting == null) {
			meeting = new EObjectWithInverseResolvingEList.ManyInverse<Meeting>(Meeting.class, this, OparlPackage.ORGANIZATION__MEETING, OparlPackage.MEETING__ORGANIZATION);
		}
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public String getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.ORGANIZATION__KEYWORD);
		}
		return keyword;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.ORGANIZATION__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, OparlPackage.BODY__ORGANIZATION, Body.class, msgs);
				return basicSetBody((Body)otherEnd, msgs);
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
			case OparlPackage.ORGANIZATION__MEETING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeeting()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.ORGANIZATION__ID:
				return getId();
			case OparlPackage.ORGANIZATION__TYPE:
				return getType();
			case OparlPackage.ORGANIZATION__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case OparlPackage.ORGANIZATION__NAME:
				return getName();
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return getMembership();
			case OparlPackage.ORGANIZATION__MEETING:
				return getMeeting();
			case OparlPackage.ORGANIZATION__SHORT_NAME:
				return getShortName();
			case OparlPackage.ORGANIZATION__POST:
				return getPost();
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				if (resolve) return getSubOrganizationOf();
				return basicGetSubOrganizationOf();
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				return getClassification();
			case OparlPackage.ORGANIZATION__KEYWORD:
				return getKeyword();
			case OparlPackage.ORGANIZATION__START_DATE:
				return getStartDate();
			case OparlPackage.ORGANIZATION__END_DATE:
				return getEndDate();
			case OparlPackage.ORGANIZATION__CREATED:
				return getCreated();
			case OparlPackage.ORGANIZATION__MODIFIED:
				return getModified();
			case OparlPackage.ORGANIZATION__WEBSITE:
				return getWebsite();
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
			case OparlPackage.ORGANIZATION__ID:
				setId((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__BODY:
				setBody((Body)newValue);
				return;
			case OparlPackage.ORGANIZATION__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case OparlPackage.ORGANIZATION__MEETING:
				getMeeting().clear();
				getMeeting().addAll((Collection<? extends Meeting>)newValue);
				return;
			case OparlPackage.ORGANIZATION__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__POST:
				getPost().clear();
				getPost().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				setSubOrganizationOf((Organization)newValue);
				return;
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case OparlPackage.ORGANIZATION__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.ORGANIZATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OparlPackage.ORGANIZATION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OparlPackage.ORGANIZATION__CREATED:
				setCreated((Date)newValue);
				return;
			case OparlPackage.ORGANIZATION__MODIFIED:
				setModified((Date)newValue);
				return;
			case OparlPackage.ORGANIZATION__WEBSITE:
				setWebsite((String)newValue);
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
			case OparlPackage.ORGANIZATION__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__BODY:
				setBody((Body)null);
				return;
			case OparlPackage.ORGANIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				getMembership().clear();
				return;
			case OparlPackage.ORGANIZATION__MEETING:
				getMeeting().clear();
				return;
			case OparlPackage.ORGANIZATION__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__POST:
				getPost().clear();
				return;
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				setSubOrganizationOf((Organization)null);
				return;
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__KEYWORD:
				getKeyword().clear();
				return;
			case OparlPackage.ORGANIZATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OparlPackage.ORGANIZATION__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
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
			case OparlPackage.ORGANIZATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.ORGANIZATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.ORGANIZATION__BODY:
				return body != null;
			case OparlPackage.ORGANIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.ORGANIZATION__MEMBERSHIP:
				return membership != null && !membership.isEmpty();
			case OparlPackage.ORGANIZATION__MEETING:
				return meeting != null && !meeting.isEmpty();
			case OparlPackage.ORGANIZATION__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case OparlPackage.ORGANIZATION__POST:
				return post != null && !post.isEmpty();
			case OparlPackage.ORGANIZATION__SUB_ORGANIZATION_OF:
				return subOrganizationOf != null;
			case OparlPackage.ORGANIZATION__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case OparlPackage.ORGANIZATION__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case OparlPackage.ORGANIZATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OparlPackage.ORGANIZATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OparlPackage.ORGANIZATION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case OparlPackage.ORGANIZATION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OparlPackage.ORGANIZATION__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
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
		result.append(", name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", post: ");
		result.append(post);
		result.append(", classification: ");
		result.append(classification);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(", website: ");
		result.append(website);
		result.append(')');
		return result.toString();
	}

} //OrganizationImpl
