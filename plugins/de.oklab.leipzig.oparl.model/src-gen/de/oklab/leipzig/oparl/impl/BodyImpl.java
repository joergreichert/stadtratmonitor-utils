/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.LegislativeTerm;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.Person;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getSystem <em>System</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getLicense <em>License</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getLicenseValidSince <em>License Valid Since</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getRgs <em>Rgs</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getEquivalentBody <em>Equivalent Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getMember <em>Member</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getLegislativeTerm <em>Legislative Term</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyImpl extends MinimalEObjectImpl.Container implements Body {
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
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected de.oklab.leipzig.oparl.System system;

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
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseValidSince() <em>License Valid Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseValidSince()
	 * @generated
	 * @ordered
	 */
	protected static final Date LICENSE_VALID_SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseValidSince() <em>License Valid Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseValidSince()
	 * @generated
	 * @ordered
	 */
	protected Date licenseValidSince = LICENSE_VALID_SINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRgs() <em>Rgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgs()
	 * @generated
	 * @ordered
	 */
	protected static final String RGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRgs() <em>Rgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgs()
	 * @generated
	 * @ordered
	 */
	protected String rgs = RGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquivalentBody() <em>Equivalent Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentBody()
	 * @generated
	 * @ordered
	 */
	protected EList<String> equivalentBody;

	/**
	 * The default value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected String contactEmail = CONTACT_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected String contactName = CONTACT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaper() <em>Paper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> paper;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> member;

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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organization;

	/**
	 * The cached value of the '{@link #getLegislativeTerm() <em>Legislative Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegislativeTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<LegislativeTerm> legislativeTerm;

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
	protected BodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.BODY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oklab.leipzig.oparl.System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (de.oklab.leipzig.oparl.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.BODY__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oklab.leipzig.oparl.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(de.oklab.leipzig.oparl.System newSystem, NotificationChain msgs) {
		de.oklab.leipzig.oparl.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(de.oklab.leipzig.oparl.System newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, OparlPackage.SYSTEM__BODIES, de.oklab.leipzig.oparl.System.class, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, OparlPackage.SYSTEM__BODIES, de.oklab.leipzig.oparl.System.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__SYSTEM, newSystem, newSystem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__SHORT_NAME, oldShortName, shortName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLicenseValidSince() {
		return licenseValidSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseValidSince(Date newLicenseValidSince) {
		Date oldLicenseValidSince = licenseValidSince;
		licenseValidSince = newLicenseValidSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__LICENSE_VALID_SINCE, oldLicenseValidSince, licenseValidSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRgs() {
		return rgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRgs(String newRgs) {
		String oldRgs = rgs;
		rgs = newRgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__RGS, oldRgs, rgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEquivalentBody() {
		if (equivalentBody == null) {
			equivalentBody = new EDataTypeEList<String>(String.class, this, OparlPackage.BODY__EQUIVALENT_BODY);
		}
		return equivalentBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactEmail(String newContactEmail) {
		String oldContactEmail = contactEmail;
		contactEmail = newContactEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__CONTACT_EMAIL, oldContactEmail, contactEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactName(String newContactName) {
		String oldContactName = contactName;
		contactName = newContactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__CONTACT_NAME, oldContactName, contactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paper> getPaper() {
		if (paper == null) {
			paper = new EObjectWithInverseResolvingEList<Paper>(Paper.class, this, OparlPackage.BODY__PAPER, OparlPackage.PAPER__BODY);
		}
		return paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getMember() {
		if (member == null) {
			member = new EObjectWithInverseResolvingEList<Person>(Person.class, this, OparlPackage.BODY__MEMBER, OparlPackage.PERSON__BODY);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meeting> getMeeting() {
		if (meeting == null) {
			meeting = new EObjectResolvingEList<Meeting>(Meeting.class, this, OparlPackage.BODY__MEETING);
		}
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getOrganization() {
		if (organization == null) {
			organization = new EObjectWithInverseResolvingEList<Organization>(Organization.class, this, OparlPackage.BODY__ORGANIZATION, OparlPackage.ORGANIZATION__BODY);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegislativeTerm> getLegislativeTerm() {
		if (legislativeTerm == null) {
			legislativeTerm = new EObjectWithInverseResolvingEList<LegislativeTerm>(LegislativeTerm.class, this, OparlPackage.BODY__LEGISLATIVE_TERM, OparlPackage.LEGISLATIVE_TERM__BODY);
		}
		return legislativeTerm;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.BODY__KEYWORD);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__MODIFIED, oldModified, modified));
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
			case OparlPackage.BODY__SYSTEM:
				if (system != null)
					msgs = ((InternalEObject)system).eInverseRemove(this, OparlPackage.SYSTEM__BODIES, de.oklab.leipzig.oparl.System.class, msgs);
				return basicSetSystem((de.oklab.leipzig.oparl.System)otherEnd, msgs);
			case OparlPackage.BODY__PAPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaper()).basicAdd(otherEnd, msgs);
			case OparlPackage.BODY__MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMember()).basicAdd(otherEnd, msgs);
			case OparlPackage.BODY__ORGANIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganization()).basicAdd(otherEnd, msgs);
			case OparlPackage.BODY__LEGISLATIVE_TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLegislativeTerm()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.BODY__SYSTEM:
				return basicSetSystem(null, msgs);
			case OparlPackage.BODY__PAPER:
				return ((InternalEList<?>)getPaper()).basicRemove(otherEnd, msgs);
			case OparlPackage.BODY__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case OparlPackage.BODY__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case OparlPackage.BODY__LEGISLATIVE_TERM:
				return ((InternalEList<?>)getLegislativeTerm()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.BODY__ID:
				return getId();
			case OparlPackage.BODY__TYPE:
				return getType();
			case OparlPackage.BODY__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case OparlPackage.BODY__SHORT_NAME:
				return getShortName();
			case OparlPackage.BODY__NAME:
				return getName();
			case OparlPackage.BODY__WEBSITE:
				return getWebsite();
			case OparlPackage.BODY__LICENSE:
				return getLicense();
			case OparlPackage.BODY__LICENSE_VALID_SINCE:
				return getLicenseValidSince();
			case OparlPackage.BODY__RGS:
				return getRgs();
			case OparlPackage.BODY__EQUIVALENT_BODY:
				return getEquivalentBody();
			case OparlPackage.BODY__CONTACT_EMAIL:
				return getContactEmail();
			case OparlPackage.BODY__CONTACT_NAME:
				return getContactName();
			case OparlPackage.BODY__PAPER:
				return getPaper();
			case OparlPackage.BODY__MEMBER:
				return getMember();
			case OparlPackage.BODY__MEETING:
				return getMeeting();
			case OparlPackage.BODY__ORGANIZATION:
				return getOrganization();
			case OparlPackage.BODY__LEGISLATIVE_TERM:
				return getLegislativeTerm();
			case OparlPackage.BODY__CLASSIFICATION:
				return getClassification();
			case OparlPackage.BODY__KEYWORD:
				return getKeyword();
			case OparlPackage.BODY__CREATED:
				return getCreated();
			case OparlPackage.BODY__MODIFIED:
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
			case OparlPackage.BODY__ID:
				setId((String)newValue);
				return;
			case OparlPackage.BODY__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.BODY__SYSTEM:
				setSystem((de.oklab.leipzig.oparl.System)newValue);
				return;
			case OparlPackage.BODY__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case OparlPackage.BODY__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.BODY__WEBSITE:
				setWebsite((String)newValue);
				return;
			case OparlPackage.BODY__LICENSE:
				setLicense((String)newValue);
				return;
			case OparlPackage.BODY__LICENSE_VALID_SINCE:
				setLicenseValidSince((Date)newValue);
				return;
			case OparlPackage.BODY__RGS:
				setRgs((String)newValue);
				return;
			case OparlPackage.BODY__EQUIVALENT_BODY:
				getEquivalentBody().clear();
				getEquivalentBody().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.BODY__CONTACT_EMAIL:
				setContactEmail((String)newValue);
				return;
			case OparlPackage.BODY__CONTACT_NAME:
				setContactName((String)newValue);
				return;
			case OparlPackage.BODY__PAPER:
				getPaper().clear();
				getPaper().addAll((Collection<? extends Paper>)newValue);
				return;
			case OparlPackage.BODY__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Person>)newValue);
				return;
			case OparlPackage.BODY__MEETING:
				getMeeting().clear();
				getMeeting().addAll((Collection<? extends Meeting>)newValue);
				return;
			case OparlPackage.BODY__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case OparlPackage.BODY__LEGISLATIVE_TERM:
				getLegislativeTerm().clear();
				getLegislativeTerm().addAll((Collection<? extends LegislativeTerm>)newValue);
				return;
			case OparlPackage.BODY__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case OparlPackage.BODY__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.BODY__CREATED:
				setCreated((Date)newValue);
				return;
			case OparlPackage.BODY__MODIFIED:
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
			case OparlPackage.BODY__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.BODY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.BODY__SYSTEM:
				setSystem((de.oklab.leipzig.oparl.System)null);
				return;
			case OparlPackage.BODY__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case OparlPackage.BODY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.BODY__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case OparlPackage.BODY__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case OparlPackage.BODY__LICENSE_VALID_SINCE:
				setLicenseValidSince(LICENSE_VALID_SINCE_EDEFAULT);
				return;
			case OparlPackage.BODY__RGS:
				setRgs(RGS_EDEFAULT);
				return;
			case OparlPackage.BODY__EQUIVALENT_BODY:
				getEquivalentBody().clear();
				return;
			case OparlPackage.BODY__CONTACT_EMAIL:
				setContactEmail(CONTACT_EMAIL_EDEFAULT);
				return;
			case OparlPackage.BODY__CONTACT_NAME:
				setContactName(CONTACT_NAME_EDEFAULT);
				return;
			case OparlPackage.BODY__PAPER:
				getPaper().clear();
				return;
			case OparlPackage.BODY__MEMBER:
				getMember().clear();
				return;
			case OparlPackage.BODY__MEETING:
				getMeeting().clear();
				return;
			case OparlPackage.BODY__ORGANIZATION:
				getOrganization().clear();
				return;
			case OparlPackage.BODY__LEGISLATIVE_TERM:
				getLegislativeTerm().clear();
				return;
			case OparlPackage.BODY__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case OparlPackage.BODY__KEYWORD:
				getKeyword().clear();
				return;
			case OparlPackage.BODY__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case OparlPackage.BODY__MODIFIED:
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
			case OparlPackage.BODY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.BODY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.BODY__SYSTEM:
				return system != null;
			case OparlPackage.BODY__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case OparlPackage.BODY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.BODY__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case OparlPackage.BODY__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case OparlPackage.BODY__LICENSE_VALID_SINCE:
				return LICENSE_VALID_SINCE_EDEFAULT == null ? licenseValidSince != null : !LICENSE_VALID_SINCE_EDEFAULT.equals(licenseValidSince);
			case OparlPackage.BODY__RGS:
				return RGS_EDEFAULT == null ? rgs != null : !RGS_EDEFAULT.equals(rgs);
			case OparlPackage.BODY__EQUIVALENT_BODY:
				return equivalentBody != null && !equivalentBody.isEmpty();
			case OparlPackage.BODY__CONTACT_EMAIL:
				return CONTACT_EMAIL_EDEFAULT == null ? contactEmail != null : !CONTACT_EMAIL_EDEFAULT.equals(contactEmail);
			case OparlPackage.BODY__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
			case OparlPackage.BODY__PAPER:
				return paper != null && !paper.isEmpty();
			case OparlPackage.BODY__MEMBER:
				return member != null && !member.isEmpty();
			case OparlPackage.BODY__MEETING:
				return meeting != null && !meeting.isEmpty();
			case OparlPackage.BODY__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case OparlPackage.BODY__LEGISLATIVE_TERM:
				return legislativeTerm != null && !legislativeTerm.isEmpty();
			case OparlPackage.BODY__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case OparlPackage.BODY__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case OparlPackage.BODY__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case OparlPackage.BODY__MODIFIED:
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
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", name: ");
		result.append(name);
		result.append(", website: ");
		result.append(website);
		result.append(", license: ");
		result.append(license);
		result.append(", licenseValidSince: ");
		result.append(licenseValidSince);
		result.append(", rgs: ");
		result.append(rgs);
		result.append(", equivalentBody: ");
		result.append(equivalentBody);
		result.append(", contactEmail: ");
		result.append(contactEmail);
		result.append(", contactName: ");
		result.append(contactName);
		result.append(", classification: ");
		result.append(classification);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(')');
		return result.toString();
	}

} //BodyImpl
