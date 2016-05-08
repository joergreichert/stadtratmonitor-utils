/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AddressableOParlElement;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.Named;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.Typed;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getFormOfAddress <em>Form Of Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getAffix <em>Affix</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getSubLocality <em>Sub Locality</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getLife <em>Life</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PersonImpl#getLifeSource <em>Life Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends PersonOrOrganizationImpl implements Person {
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
     * The default value of the '{@link #getAffix() <em>Affix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAffix()
     * @generated
     * @ordered
     */
    protected static final String AFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAffix() <em>Affix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAffix()
     * @generated
     * @ordered
     */
    protected String affix = AFFIX_EDEFAULT;

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
     * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone()
     * @generated
     * @ordered
     */
    protected EList<String> phone;

    /**
     * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected EList<String> email;

    /**
     * The default value of the '{@link #getSubLocality() <em>Sub Locality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubLocality()
     * @generated
     * @ordered
     */
    protected static final String SUB_LOCALITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubLocality() <em>Sub Locality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubLocality()
     * @generated
     * @ordered
     */
    protected String subLocality = SUB_LOCALITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;

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
     * The cached value of the '{@link #getMembership() <em>Membership</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMembership()
     * @generated
     * @ordered
     */
    protected EList<Membership> membership;

    /**
     * The default value of the '{@link #getLife() <em>Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLife()
     * @generated
     * @ordered
     */
    protected static final String LIFE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLife() <em>Life</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLife()
     * @generated
     * @ordered
     */
    protected String life = LIFE_EDEFAULT;

    /**
     * The default value of the '{@link #getLifeSource() <em>Life Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifeSource()
     * @generated
     * @ordered
     */
    protected static final String LIFE_SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLifeSource() <em>Life Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifeSource()
     * @generated
     * @ordered
     */
    protected String lifeSource = LIFE_SOURCE_EDEFAULT;

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
    public Body getBody() {
        if (eContainerFeatureID() != OparlPackage.PERSON__BODY) return null;
        return (Body)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Body basicGetBody() {
        if (eContainerFeatureID() != OparlPackage.PERSON__BODY) return null;
        return (Body)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBody, OparlPackage.PERSON__BODY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBody(Body newBody) {
        if (newBody != eInternalContainer() || (eContainerFeatureID() != OparlPackage.PERSON__BODY && newBody != null)) {
            if (EcoreUtil.isAncestor(this, newBody))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBody != null)
                msgs = ((InternalEObject)newBody).eInverseAdd(this, OparlPackage.BODY__PERSON, Body.class, msgs);
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
    public String getAffix() {
        return affix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAffix(String newAffix) {
        String oldAffix = affix;
        affix = newAffix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__AFFIX, oldAffix, affix));
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
    public EList<String> getPhone() {
        if (phone == null) {
            phone = new EDataTypeEList<String>(String.class, this, OparlPackage.PERSON__PHONE);
        }
        return phone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getEmail() {
        if (email == null) {
            email = new EDataTypeEList<String>(String.class, this, OparlPackage.PERSON__EMAIL);
        }
        return email;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubLocality() {
        return subLocality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubLocality(String newSubLocality) {
        String oldSubLocality = subLocality;
        subLocality = newSubLocality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__SUB_LOCALITY, oldSubLocality, subLocality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
        Location oldLocation = location;
        location = newLocation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__LOCATION, oldLocation, newLocation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(Location newLocation) {
        if (newLocation != location) {
            NotificationChain msgs = null;
            if (location != null)
                msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.PERSON__LOCATION, null, msgs);
            if (newLocation != null)
                msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OparlPackage.PERSON__LOCATION, null, msgs);
            msgs = basicSetLocation(newLocation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__LOCATION, newLocation, newLocation));
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
            membership = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, OparlPackage.PERSON__MEMBERSHIP, OparlPackage.MEMBERSHIP__PERSON);
        }
        return membership;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLife() {
        return life;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLife(String newLife) {
        String oldLife = life;
        life = newLife;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__LIFE, oldLife, life));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLifeSource() {
        return lifeSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLifeSource(String newLifeSource) {
        String oldLifeSource = lifeSource;
        lifeSource = newLifeSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PERSON__LIFE_SOURCE, oldLifeSource, lifeSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return super.getName();
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
    public String getType() {
        return "https://oparl.org/schema/1.0/Person";
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
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
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
            case OparlPackage.PERSON__LOCATION:
                return basicSetLocation(null, msgs);
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
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case OparlPackage.PERSON__BODY:
                return eInternalContainer().eInverseRemove(this, OparlPackage.BODY__PERSON, Body.class, msgs);
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
            case OparlPackage.PERSON__BODY:
                if (resolve) return getBody();
                return basicGetBody();
            case OparlPackage.PERSON__FAMILY_NAME:
                return getFamilyName();
            case OparlPackage.PERSON__GIVEN_NAME:
                return getGivenName();
            case OparlPackage.PERSON__FORM_OF_ADDRESS:
                return getFormOfAddress();
            case OparlPackage.PERSON__AFFIX:
                return getAffix();
            case OparlPackage.PERSON__TITLE:
                return getTitle();
            case OparlPackage.PERSON__GENDER:
                return getGender();
            case OparlPackage.PERSON__PHONE:
                return getPhone();
            case OparlPackage.PERSON__EMAIL:
                return getEmail();
            case OparlPackage.PERSON__SUB_LOCALITY:
                return getSubLocality();
            case OparlPackage.PERSON__LOCATION:
                return getLocation();
            case OparlPackage.PERSON__STATUS:
                return getStatus();
            case OparlPackage.PERSON__MEMBERSHIP:
                return getMembership();
            case OparlPackage.PERSON__LIFE:
                return getLife();
            case OparlPackage.PERSON__LIFE_SOURCE:
                return getLifeSource();
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
            case OparlPackage.PERSON__BODY:
                setBody((Body)newValue);
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
            case OparlPackage.PERSON__AFFIX:
                setAffix((String)newValue);
                return;
            case OparlPackage.PERSON__TITLE:
                getTitle().clear();
                getTitle().addAll((Collection<? extends String>)newValue);
                return;
            case OparlPackage.PERSON__GENDER:
                setGender((String)newValue);
                return;
            case OparlPackage.PERSON__PHONE:
                getPhone().clear();
                getPhone().addAll((Collection<? extends String>)newValue);
                return;
            case OparlPackage.PERSON__EMAIL:
                getEmail().clear();
                getEmail().addAll((Collection<? extends String>)newValue);
                return;
            case OparlPackage.PERSON__SUB_LOCALITY:
                setSubLocality((String)newValue);
                return;
            case OparlPackage.PERSON__LOCATION:
                setLocation((Location)newValue);
                return;
            case OparlPackage.PERSON__STATUS:
                getStatus().clear();
                getStatus().addAll((Collection<? extends String>)newValue);
                return;
            case OparlPackage.PERSON__MEMBERSHIP:
                getMembership().clear();
                getMembership().addAll((Collection<? extends Membership>)newValue);
                return;
            case OparlPackage.PERSON__LIFE:
                setLife((String)newValue);
                return;
            case OparlPackage.PERSON__LIFE_SOURCE:
                setLifeSource((String)newValue);
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
            case OparlPackage.PERSON__BODY:
                setBody((Body)null);
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
            case OparlPackage.PERSON__AFFIX:
                setAffix(AFFIX_EDEFAULT);
                return;
            case OparlPackage.PERSON__TITLE:
                getTitle().clear();
                return;
            case OparlPackage.PERSON__GENDER:
                setGender(GENDER_EDEFAULT);
                return;
            case OparlPackage.PERSON__PHONE:
                getPhone().clear();
                return;
            case OparlPackage.PERSON__EMAIL:
                getEmail().clear();
                return;
            case OparlPackage.PERSON__SUB_LOCALITY:
                setSubLocality(SUB_LOCALITY_EDEFAULT);
                return;
            case OparlPackage.PERSON__LOCATION:
                setLocation((Location)null);
                return;
            case OparlPackage.PERSON__STATUS:
                getStatus().clear();
                return;
            case OparlPackage.PERSON__MEMBERSHIP:
                getMembership().clear();
                return;
            case OparlPackage.PERSON__LIFE:
                setLife(LIFE_EDEFAULT);
                return;
            case OparlPackage.PERSON__LIFE_SOURCE:
                setLifeSource(LIFE_SOURCE_EDEFAULT);
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
            case OparlPackage.PERSON__BODY:
                return basicGetBody() != null;
            case OparlPackage.PERSON__FAMILY_NAME:
                return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
            case OparlPackage.PERSON__GIVEN_NAME:
                return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
            case OparlPackage.PERSON__FORM_OF_ADDRESS:
                return FORM_OF_ADDRESS_EDEFAULT == null ? formOfAddress != null : !FORM_OF_ADDRESS_EDEFAULT.equals(formOfAddress);
            case OparlPackage.PERSON__AFFIX:
                return AFFIX_EDEFAULT == null ? affix != null : !AFFIX_EDEFAULT.equals(affix);
            case OparlPackage.PERSON__TITLE:
                return title != null && !title.isEmpty();
            case OparlPackage.PERSON__GENDER:
                return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
            case OparlPackage.PERSON__PHONE:
                return phone != null && !phone.isEmpty();
            case OparlPackage.PERSON__EMAIL:
                return email != null && !email.isEmpty();
            case OparlPackage.PERSON__SUB_LOCALITY:
                return SUB_LOCALITY_EDEFAULT == null ? subLocality != null : !SUB_LOCALITY_EDEFAULT.equals(subLocality);
            case OparlPackage.PERSON__LOCATION:
                return location != null;
            case OparlPackage.PERSON__STATUS:
                return status != null && !status.isEmpty();
            case OparlPackage.PERSON__MEMBERSHIP:
                return membership != null && !membership.isEmpty();
            case OparlPackage.PERSON__LIFE:
                return LIFE_EDEFAULT == null ? life != null : !LIFE_EDEFAULT.equals(life);
            case OparlPackage.PERSON__LIFE_SOURCE:
                return LIFE_SOURCE_EDEFAULT == null ? lifeSource != null : !LIFE_SOURCE_EDEFAULT.equals(lifeSource);
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
                case OparlPackage.TYPED___GET_TYPE: return OparlPackage.PERSON___GET_TYPE;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == Named.class) {
            switch (baseOperationID) {
                case OparlPackage.NAMED___GET_NAME: return OparlPackage.PERSON___GET_NAME;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == AddressableOParlElement.class) {
            switch (baseOperationID) {
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS: return OparlPackage.PERSON___GET_STREET_ADDRESS;
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE: return OparlPackage.PERSON___GET_POSTAL_CODE;
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY: return OparlPackage.PERSON___GET_LOCALITY;
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
            case OparlPackage.PERSON___GET_NAME:
                return getName();
            case OparlPackage.PERSON___GET_STREET_ADDRESS:
                return getStreetAddress();
            case OparlPackage.PERSON___GET_POSTAL_CODE:
                return getPostalCode();
            case OparlPackage.PERSON___GET_LOCALITY:
                return getLocality();
            case OparlPackage.PERSON___GET_TYPE:
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (familyName: ");
        result.append(familyName);
        result.append(", givenName: ");
        result.append(givenName);
        result.append(", formOfAddress: ");
        result.append(formOfAddress);
        result.append(", affix: ");
        result.append(affix);
        result.append(", title: ");
        result.append(title);
        result.append(", gender: ");
        result.append(gender);
        result.append(", phone: ");
        result.append(phone);
        result.append(", email: ");
        result.append(email);
        result.append(", subLocality: ");
        result.append(subLocality);
        result.append(", status: ");
        result.append(status);
        result.append(", life: ");
        result.append(life);
        result.append(", lifeSource: ");
        result.append(lifeSource);
        result.append(')');
        return result.toString();
    }

} //PersonImpl
