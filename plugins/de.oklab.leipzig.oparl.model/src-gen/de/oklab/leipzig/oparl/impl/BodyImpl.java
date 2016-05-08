/**
 */
package de.oklab.leipzig.oparl.impl;

import com.google.common.base.Objects;

import de.oklab.leipzig.oparl.AddressableOParlElement;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.BodyLocation;
import de.oklab.leipzig.oparl.LegislativeTerm;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.Typed;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getSystem <em>System</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getLicenseValidSince <em>License Valid Since</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getOparlSince <em>Oparl Since</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getAgs <em>Ags</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getRgs <em>Rgs</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getEquivalentBody <em>Equivalent Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#get_contactEmail <em>contact Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getLegislativeTerm <em>Legislative Term</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.BodyImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyImpl extends AddressableOParlElementImpl implements Body {
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
     * The default value of the '{@link #getOparlSince() <em>Oparl Since</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOparlSince()
     * @generated
     * @ordered
     */
    protected static final Date OPARL_SINCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOparlSince() <em>Oparl Since</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOparlSince()
     * @generated
     * @ordered
     */
    protected Date oparlSince = OPARL_SINCE_EDEFAULT;

    /**
     * The default value of the '{@link #getAgs() <em>Ags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAgs()
     * @generated
     * @ordered
     */
    protected static final String AGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAgs() <em>Ags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAgs()
     * @generated
     * @ordered
     */
    protected String ags = AGS_EDEFAULT;

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
     * The cached value of the '{@link #getEquivalentBody() <em>Equivalent Body</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquivalentBody()
     * @generated
     * @ordered
     */
    protected EList<Body> equivalentBody;

    /**
     * The default value of the '{@link #get_contactEmail() <em>contact Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_contactEmail()
     * @generated
     * @ordered
     */
    protected static final String _CONTACT_EMAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #get_contactEmail() <em>contact Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_contactEmail()
     * @generated
     * @ordered
     */
    protected String _contactEmail = _CONTACT_EMAIL_EDEFAULT;

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
     * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected EList<Organization> organization;

    /**
     * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerson()
     * @generated
     * @ordered
     */
    protected EList<Person> person;

    /**
     * The cached value of the '{@link #getMeeting() <em>Meeting</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeeting()
     * @generated
     * @ordered
     */
    protected EList<Meeting> meeting;

    /**
     * The cached value of the '{@link #getPaper() <em>Paper</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPaper()
     * @generated
     * @ordered
     */
    protected EList<Paper> paper;

    /**
     * The cached value of the '{@link #getLegislativeTerm() <em>Legislative Term</em>}' containment reference list.
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
     * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected BodyLocation location;

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
    public de.oklab.leipzig.oparl.System getSystem() {
        if (eContainerFeatureID() != OparlPackage.BODY__SYSTEM) return null;
        return (de.oklab.leipzig.oparl.System)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.oklab.leipzig.oparl.System basicGetSystem() {
        if (eContainerFeatureID() != OparlPackage.BODY__SYSTEM) return null;
        return (de.oklab.leipzig.oparl.System)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSystem(de.oklab.leipzig.oparl.System newSystem, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSystem, OparlPackage.BODY__SYSTEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSystem(de.oklab.leipzig.oparl.System newSystem) {
        if (newSystem != eInternalContainer() || (eContainerFeatureID() != OparlPackage.BODY__SYSTEM && newSystem != null)) {
            if (EcoreUtil.isAncestor(this, newSystem))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
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
    public Date getOparlSince() {
        return oparlSince;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOparlSince(Date newOparlSince) {
        Date oldOparlSince = oparlSince;
        oparlSince = newOparlSince;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__OPARL_SINCE, oldOparlSince, oparlSince));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAgs() {
        return ags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAgs(String newAgs) {
        String oldAgs = ags;
        ags = newAgs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__AGS, oldAgs, ags));
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
    public EList<Body> getEquivalentBody() {
        if (equivalentBody == null) {
            equivalentBody = new EObjectContainmentEList<Body>(Body.class, this, OparlPackage.BODY__EQUIVALENT_BODY);
        }
        return equivalentBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String get_contactEmail() {
        return _contactEmail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void set_contactEmail(String new_contactEmail) {
        String old_contactEmail = _contactEmail;
        _contactEmail = new_contactEmail;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__CONTACT_EMAIL, old_contactEmail, _contactEmail));
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
    public EList<Organization> getOrganization() {
        if (organization == null) {
            organization = new EObjectContainmentWithInverseEList<Organization>(Organization.class, this, OparlPackage.BODY__ORGANIZATION, OparlPackage.ORGANIZATION__BODY);
        }
        return organization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Person> getPerson() {
        if (person == null) {
            person = new EObjectContainmentWithInverseEList<Person>(Person.class, this, OparlPackage.BODY__PERSON, OparlPackage.PERSON__BODY);
        }
        return person;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Meeting> getMeeting() {
        if (meeting == null) {
            meeting = new EObjectContainmentEList<Meeting>(Meeting.class, this, OparlPackage.BODY__MEETING);
        }
        return meeting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Paper> getPaper() {
        if (paper == null) {
            paper = new EObjectContainmentWithInverseEList<Paper>(Paper.class, this, OparlPackage.BODY__PAPER, OparlPackage.PAPER__BODY);
        }
        return paper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LegislativeTerm> getLegislativeTerm() {
        if (legislativeTerm == null) {
            legislativeTerm = new EObjectContainmentWithInverseEList<LegislativeTerm>(LegislativeTerm.class, this, OparlPackage.BODY__LEGISLATIVE_TERM, OparlPackage.LEGISLATIVE_TERM__BODY);
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
    public BodyLocation getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation(BodyLocation newLocation, NotificationChain msgs) {
        BodyLocation oldLocation = location;
        location = newLocation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__LOCATION, oldLocation, newLocation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(BodyLocation newLocation) {
        if (newLocation != location) {
            NotificationChain msgs = null;
            if (location != null)
                msgs = ((InternalEObject)location).eInverseRemove(this, OparlPackage.BODY_LOCATION__BODY, BodyLocation.class, msgs);
            if (newLocation != null)
                msgs = ((InternalEObject)newLocation).eInverseAdd(this, OparlPackage.BODY_LOCATION__BODY, BodyLocation.class, msgs);
            msgs = basicSetLocation(newLocation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.BODY__LOCATION, newLocation, newLocation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return "https://oparl.org/schema/1.0/Body";
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContactEmail() {
        return ((BodyImpl) this)._contactEmail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContactEmail(final String contactEmail) {
        boolean _notEquals = (!Objects.equal(contactEmail, null));
        if (_notEquals) {
            final String patternStr = "^^http://oparl\\.org/specs/1\\.0/$";
            final Pattern pattern = Pattern.compile(patternStr);
            final Matcher matcher = pattern.matcher(contactEmail);
            boolean _find = matcher.find();
            boolean _not = (!_find);
            if (_not) {
                String _format = String.format("%s doesn\'t follow pattern %s", contactEmail, patternStr);
                throw new IllegalArgumentException(_format);
            }
        }
        ((BodyImpl) this)._contactEmail = contactEmail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStreetAddress() {
        return super.getStreetAddress();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPostalCode() {
        return super.getPostalCode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
            case OparlPackage.BODY__SYSTEM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSystem((de.oklab.leipzig.oparl.System)otherEnd, msgs);
            case OparlPackage.BODY__ORGANIZATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganization()).basicAdd(otherEnd, msgs);
            case OparlPackage.BODY__PERSON:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerson()).basicAdd(otherEnd, msgs);
            case OparlPackage.BODY__PAPER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaper()).basicAdd(otherEnd, msgs);
            case OparlPackage.BODY__LEGISLATIVE_TERM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLegislativeTerm()).basicAdd(otherEnd, msgs);
            case OparlPackage.BODY__LOCATION:
                if (location != null)
                    msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.BODY__LOCATION, null, msgs);
                return basicSetLocation((BodyLocation)otherEnd, msgs);
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
            case OparlPackage.BODY__EQUIVALENT_BODY:
                return ((InternalEList<?>)getEquivalentBody()).basicRemove(otherEnd, msgs);
            case OparlPackage.BODY__ORGANIZATION:
                return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
            case OparlPackage.BODY__PERSON:
                return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
            case OparlPackage.BODY__MEETING:
                return ((InternalEList<?>)getMeeting()).basicRemove(otherEnd, msgs);
            case OparlPackage.BODY__PAPER:
                return ((InternalEList<?>)getPaper()).basicRemove(otherEnd, msgs);
            case OparlPackage.BODY__LEGISLATIVE_TERM:
                return ((InternalEList<?>)getLegislativeTerm()).basicRemove(otherEnd, msgs);
            case OparlPackage.BODY__LOCATION:
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
            case OparlPackage.BODY__SYSTEM:
                return eInternalContainer().eInverseRemove(this, OparlPackage.SYSTEM__BODIES, de.oklab.leipzig.oparl.System.class, msgs);
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
            case OparlPackage.BODY__SYSTEM:
                if (resolve) return getSystem();
                return basicGetSystem();
            case OparlPackage.BODY__WEBSITE:
                return getWebsite();
            case OparlPackage.BODY__LICENSE_VALID_SINCE:
                return getLicenseValidSince();
            case OparlPackage.BODY__OPARL_SINCE:
                return getOparlSince();
            case OparlPackage.BODY__AGS:
                return getAgs();
            case OparlPackage.BODY__RGS:
                return getRgs();
            case OparlPackage.BODY__EQUIVALENT_BODY:
                return getEquivalentBody();
            case OparlPackage.BODY__CONTACT_EMAIL:
                return get_contactEmail();
            case OparlPackage.BODY__CONTACT_NAME:
                return getContactName();
            case OparlPackage.BODY__ORGANIZATION:
                return getOrganization();
            case OparlPackage.BODY__PERSON:
                return getPerson();
            case OparlPackage.BODY__MEETING:
                return getMeeting();
            case OparlPackage.BODY__PAPER:
                return getPaper();
            case OparlPackage.BODY__LEGISLATIVE_TERM:
                return getLegislativeTerm();
            case OparlPackage.BODY__CLASSIFICATION:
                return getClassification();
            case OparlPackage.BODY__LOCATION:
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
            case OparlPackage.BODY__SYSTEM:
                setSystem((de.oklab.leipzig.oparl.System)newValue);
                return;
            case OparlPackage.BODY__WEBSITE:
                setWebsite((String)newValue);
                return;
            case OparlPackage.BODY__LICENSE_VALID_SINCE:
                setLicenseValidSince((Date)newValue);
                return;
            case OparlPackage.BODY__OPARL_SINCE:
                setOparlSince((Date)newValue);
                return;
            case OparlPackage.BODY__AGS:
                setAgs((String)newValue);
                return;
            case OparlPackage.BODY__RGS:
                setRgs((String)newValue);
                return;
            case OparlPackage.BODY__EQUIVALENT_BODY:
                getEquivalentBody().clear();
                getEquivalentBody().addAll((Collection<? extends Body>)newValue);
                return;
            case OparlPackage.BODY__CONTACT_EMAIL:
                set_contactEmail((String)newValue);
                return;
            case OparlPackage.BODY__CONTACT_NAME:
                setContactName((String)newValue);
                return;
            case OparlPackage.BODY__ORGANIZATION:
                getOrganization().clear();
                getOrganization().addAll((Collection<? extends Organization>)newValue);
                return;
            case OparlPackage.BODY__PERSON:
                getPerson().clear();
                getPerson().addAll((Collection<? extends Person>)newValue);
                return;
            case OparlPackage.BODY__MEETING:
                getMeeting().clear();
                getMeeting().addAll((Collection<? extends Meeting>)newValue);
                return;
            case OparlPackage.BODY__PAPER:
                getPaper().clear();
                getPaper().addAll((Collection<? extends Paper>)newValue);
                return;
            case OparlPackage.BODY__LEGISLATIVE_TERM:
                getLegislativeTerm().clear();
                getLegislativeTerm().addAll((Collection<? extends LegislativeTerm>)newValue);
                return;
            case OparlPackage.BODY__CLASSIFICATION:
                setClassification((String)newValue);
                return;
            case OparlPackage.BODY__LOCATION:
                setLocation((BodyLocation)newValue);
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
            case OparlPackage.BODY__SYSTEM:
                setSystem((de.oklab.leipzig.oparl.System)null);
                return;
            case OparlPackage.BODY__WEBSITE:
                setWebsite(WEBSITE_EDEFAULT);
                return;
            case OparlPackage.BODY__LICENSE_VALID_SINCE:
                setLicenseValidSince(LICENSE_VALID_SINCE_EDEFAULT);
                return;
            case OparlPackage.BODY__OPARL_SINCE:
                setOparlSince(OPARL_SINCE_EDEFAULT);
                return;
            case OparlPackage.BODY__AGS:
                setAgs(AGS_EDEFAULT);
                return;
            case OparlPackage.BODY__RGS:
                setRgs(RGS_EDEFAULT);
                return;
            case OparlPackage.BODY__EQUIVALENT_BODY:
                getEquivalentBody().clear();
                return;
            case OparlPackage.BODY__CONTACT_EMAIL:
                set_contactEmail(_CONTACT_EMAIL_EDEFAULT);
                return;
            case OparlPackage.BODY__CONTACT_NAME:
                setContactName(CONTACT_NAME_EDEFAULT);
                return;
            case OparlPackage.BODY__ORGANIZATION:
                getOrganization().clear();
                return;
            case OparlPackage.BODY__PERSON:
                getPerson().clear();
                return;
            case OparlPackage.BODY__MEETING:
                getMeeting().clear();
                return;
            case OparlPackage.BODY__PAPER:
                getPaper().clear();
                return;
            case OparlPackage.BODY__LEGISLATIVE_TERM:
                getLegislativeTerm().clear();
                return;
            case OparlPackage.BODY__CLASSIFICATION:
                setClassification(CLASSIFICATION_EDEFAULT);
                return;
            case OparlPackage.BODY__LOCATION:
                setLocation((BodyLocation)null);
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
            case OparlPackage.BODY__SYSTEM:
                return basicGetSystem() != null;
            case OparlPackage.BODY__WEBSITE:
                return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
            case OparlPackage.BODY__LICENSE_VALID_SINCE:
                return LICENSE_VALID_SINCE_EDEFAULT == null ? licenseValidSince != null : !LICENSE_VALID_SINCE_EDEFAULT.equals(licenseValidSince);
            case OparlPackage.BODY__OPARL_SINCE:
                return OPARL_SINCE_EDEFAULT == null ? oparlSince != null : !OPARL_SINCE_EDEFAULT.equals(oparlSince);
            case OparlPackage.BODY__AGS:
                return AGS_EDEFAULT == null ? ags != null : !AGS_EDEFAULT.equals(ags);
            case OparlPackage.BODY__RGS:
                return RGS_EDEFAULT == null ? rgs != null : !RGS_EDEFAULT.equals(rgs);
            case OparlPackage.BODY__EQUIVALENT_BODY:
                return equivalentBody != null && !equivalentBody.isEmpty();
            case OparlPackage.BODY__CONTACT_EMAIL:
                return _CONTACT_EMAIL_EDEFAULT == null ? _contactEmail != null : !_CONTACT_EMAIL_EDEFAULT.equals(_contactEmail);
            case OparlPackage.BODY__CONTACT_NAME:
                return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
            case OparlPackage.BODY__ORGANIZATION:
                return organization != null && !organization.isEmpty();
            case OparlPackage.BODY__PERSON:
                return person != null && !person.isEmpty();
            case OparlPackage.BODY__MEETING:
                return meeting != null && !meeting.isEmpty();
            case OparlPackage.BODY__PAPER:
                return paper != null && !paper.isEmpty();
            case OparlPackage.BODY__LEGISLATIVE_TERM:
                return legislativeTerm != null && !legislativeTerm.isEmpty();
            case OparlPackage.BODY__CLASSIFICATION:
                return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
            case OparlPackage.BODY__LOCATION:
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
                case OparlPackage.TYPED___GET_TYPE: return OparlPackage.BODY___GET_TYPE;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == AddressableOParlElement.class) {
            switch (baseOperationID) {
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS: return OparlPackage.BODY___GET_STREET_ADDRESS;
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE: return OparlPackage.BODY___GET_POSTAL_CODE;
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY: return OparlPackage.BODY___GET_LOCALITY;
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
            case OparlPackage.BODY___GET_TYPE:
                return getType();
            case OparlPackage.BODY___GET_CONTACT_EMAIL:
                return getContactEmail();
            case OparlPackage.BODY___SET_CONTACT_EMAIL__STRING:
                setContactEmail((String)arguments.get(0));
                return null;
            case OparlPackage.BODY___GET_STREET_ADDRESS:
                return getStreetAddress();
            case OparlPackage.BODY___GET_POSTAL_CODE:
                return getPostalCode();
            case OparlPackage.BODY___GET_LOCALITY:
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (website: ");
        result.append(website);
        result.append(", licenseValidSince: ");
        result.append(licenseValidSince);
        result.append(", oparlSince: ");
        result.append(oparlSince);
        result.append(", ags: ");
        result.append(ags);
        result.append(", rgs: ");
        result.append(rgs);
        result.append(", _contactEmail: ");
        result.append(_contactEmail);
        result.append(", contactName: ");
        result.append(contactName);
        result.append(", classification: ");
        result.append(classification);
        result.append(')');
        return result.toString();
    }

} //BodyImpl
