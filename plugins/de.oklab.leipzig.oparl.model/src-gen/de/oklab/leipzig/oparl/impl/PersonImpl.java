/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Person;

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
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getFormOfAddress <em>Form Of Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends PersonOrOrganizationImpl implements Person {
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
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected String familyName = FAMILY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormOfAddress() <em>Form Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormOfAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_OF_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormOfAddress() <em>Form Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormOfAddress()
	 * @generated
	 * @ordered
	 */
	protected String formOfAddress = FORM_OF_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> title;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected String streetAddress = STREET_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected String locality = LOCALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<String> status;

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
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keyword;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.PERSON__BODY, oldBody, body));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, OparlPackage.BODY__MEMBER, Body.class, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, OparlPackage.BODY__MEMBER, Body.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__BODY, newBody, newBody));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyName(String newFamilyName) {
		String oldFamilyName = familyName;
		familyName = newFamilyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__FAMILY_NAME, oldFamilyName, familyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormOfAddress() {
		return formOfAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormOfAddress(String newFormOfAddress) {
		String oldFormOfAddress = formOfAddress;
		formOfAddress = newFormOfAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__FORM_OF_ADDRESS, oldFormOfAddress, formOfAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTitle() {
		if (title == null) {
			title = new EDataTypeEList<String>(String.class, this, OparlPackage.PERSON__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetAddress(String newStreetAddress) {
		String oldStreetAddress = streetAddress;
		streetAddress = newStreetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__STREET_ADDRESS, oldStreetAddress, streetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality(String newLocality) {
		String oldLocality = locality;
		locality = newLocality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__LOCALITY, oldLocality, locality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStatus() {
		if (status == null) {
			status = new EDataTypeEList<String>(String.class, this, OparlPackage.PERSON__STATUS);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getMembership() {
		if (membership == null) {
			membership = new EObjectWithInverseResolvingEList<Membership>(Membership.class, this, OparlPackage.PERSON__MEMBERSHIP, OparlPackage.MEMBERSHIP__PERSON);
		}
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.PERSON__KEYWORD);
		}
		return keyword;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__MODIFIED, oldModified, modified));
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
			case OparlPackage.PERSON__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, OparlPackage.BODY__MEMBER, Body.class, msgs);
				return basicSetBody((Body)otherEnd, msgs);
			case OparlPackage.PERSON__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.PERSON__BODY:
				return basicSetBody(null, msgs);
			case OparlPackage.PERSON__MEMBERSHIP:
				return ((InternalEList<?>)getMembership()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.PERSON__ID:
				return getId();
			case OparlPackage.PERSON__TYPE:
				return getType();
			case OparlPackage.PERSON__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case OparlPackage.PERSON__NAME:
				return getName();
			case OparlPackage.PERSON__FAMILY_NAME:
				return getFamilyName();
			case OparlPackage.PERSON__GIVEN_NAME:
				return getGivenName();
			case OparlPackage.PERSON__FORM_OF_ADDRESS:
				return getFormOfAddress();
			case OparlPackage.PERSON__TITLE:
				return getTitle();
			case OparlPackage.PERSON__GENDER:
				return getGender();
			case OparlPackage.PERSON__PHONE:
				return getPhone();
			case OparlPackage.PERSON__EMAIL:
				return getEmail();
			case OparlPackage.PERSON__STREET_ADDRESS:
				return getStreetAddress();
			case OparlPackage.PERSON__POSTAL_CODE:
				return getPostalCode();
			case OparlPackage.PERSON__LOCALITY:
				return getLocality();
			case OparlPackage.PERSON__STATUS:
				return getStatus();
			case OparlPackage.PERSON__MEMBERSHIP:
				return getMembership();
			case OparlPackage.PERSON__KEYWORD:
				return getKeyword();
			case OparlPackage.PERSON__CREATED:
				return getCreated();
			case OparlPackage.PERSON__MODIFIED:
				return getModified();
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
			case OparlPackage.PERSON__ID:
				setId((String)newValue);
				return;
			case OparlPackage.PERSON__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.PERSON__BODY:
				setBody((Body)newValue);
				return;
			case OparlPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.PERSON__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
			case OparlPackage.PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case OparlPackage.PERSON__FORM_OF_ADDRESS:
				setFormOfAddress((String)newValue);
				return;
			case OparlPackage.PERSON__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.PERSON__GENDER:
				setGender((String)newValue);
				return;
			case OparlPackage.PERSON__PHONE:
				setPhone((String)newValue);
				return;
			case OparlPackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case OparlPackage.PERSON__STREET_ADDRESS:
				setStreetAddress((String)newValue);
				return;
			case OparlPackage.PERSON__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case OparlPackage.PERSON__LOCALITY:
				setLocality((String)newValue);
				return;
			case OparlPackage.PERSON__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.PERSON__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case OparlPackage.PERSON__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.PERSON__CREATED:
				setCreated((Date)newValue);
				return;
			case OparlPackage.PERSON__MODIFIED:
				setModified((Date)newValue);
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
			case OparlPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.PERSON__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.PERSON__BODY:
				setBody((Body)null);
				return;
			case OparlPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.PERSON__FAMILY_NAME:
				setFamilyName(FAMILY_NAME_EDEFAULT);
				return;
			case OparlPackage.PERSON__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case OparlPackage.PERSON__FORM_OF_ADDRESS:
				setFormOfAddress(FORM_OF_ADDRESS_EDEFAULT);
				return;
			case OparlPackage.PERSON__TITLE:
				getTitle().clear();
				return;
			case OparlPackage.PERSON__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case OparlPackage.PERSON__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case OparlPackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case OparlPackage.PERSON__STREET_ADDRESS:
				setStreetAddress(STREET_ADDRESS_EDEFAULT);
				return;
			case OparlPackage.PERSON__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case OparlPackage.PERSON__LOCALITY:
				setLocality(LOCALITY_EDEFAULT);
				return;
			case OparlPackage.PERSON__STATUS:
				getStatus().clear();
				return;
			case OparlPackage.PERSON__MEMBERSHIP:
				getMembership().clear();
				return;
			case OparlPackage.PERSON__KEYWORD:
				getKeyword().clear();
				return;
			case OparlPackage.PERSON__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case OparlPackage.PERSON__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
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
			case OparlPackage.PERSON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.PERSON__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.PERSON__BODY:
				return body != null;
			case OparlPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.PERSON__FAMILY_NAME:
				return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
			case OparlPackage.PERSON__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case OparlPackage.PERSON__FORM_OF_ADDRESS:
				return FORM_OF_ADDRESS_EDEFAULT == null ? formOfAddress != null : !FORM_OF_ADDRESS_EDEFAULT.equals(formOfAddress);
			case OparlPackage.PERSON__TITLE:
				return title != null && !title.isEmpty();
			case OparlPackage.PERSON__GENDER:
				return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
			case OparlPackage.PERSON__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case OparlPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case OparlPackage.PERSON__STREET_ADDRESS:
				return STREET_ADDRESS_EDEFAULT == null ? streetAddress != null : !STREET_ADDRESS_EDEFAULT.equals(streetAddress);
			case OparlPackage.PERSON__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case OparlPackage.PERSON__LOCALITY:
				return LOCALITY_EDEFAULT == null ? locality != null : !LOCALITY_EDEFAULT.equals(locality);
			case OparlPackage.PERSON__STATUS:
				return status != null && !status.isEmpty();
			case OparlPackage.PERSON__MEMBERSHIP:
				return membership != null && !membership.isEmpty();
			case OparlPackage.PERSON__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case OparlPackage.PERSON__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case OparlPackage.PERSON__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
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
		result.append(", familyName: ");
		result.append(familyName);
		result.append(", givenName: ");
		result.append(givenName);
		result.append(", formOfAddress: ");
		result.append(formOfAddress);
		result.append(", title: ");
		result.append(title);
		result.append(", gender: ");
		result.append(gender);
		result.append(", phone: ");
		result.append(phone);
		result.append(", email: ");
		result.append(email);
		result.append(", streetAddress: ");
		result.append(streetAddress);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", locality: ");
		result.append(locality);
		result.append(", status: ");
		result.append(status);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
