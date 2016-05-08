/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.OrganizationLocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationLocationImpl#getOrganziation <em>Organziation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.OrganizationLocationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationLocationImpl extends MinimalEObjectImpl.Container implements OrganizationLocation {
    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OrganizationLocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OparlPackage.Literals.ORGANIZATION_LOCATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Organization getOrganziation() {
        if (eContainerFeatureID() != OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION) return null;
        return (Organization)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Organization basicGetOrganziation() {
        if (eContainerFeatureID() != OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION) return null;
        return (Organization)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOrganziation(Organization newOrganziation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOrganziation, OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrganziation(Organization newOrganziation) {
        if (newOrganziation != eInternalContainer() || (eContainerFeatureID() != OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION && newOrganziation != null)) {
            if (EcoreUtil.isAncestor(this, newOrganziation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOrganziation != null)
                msgs = ((InternalEObject)newOrganziation).eInverseAdd(this, OparlPackage.ORGANIZATION__LOCATION, Organization.class, msgs);
            msgs = basicSetOrganziation(newOrganziation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION, newOrganziation, newOrganziation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location getLocation() {
        if (location != null && location.eIsProxy()) {
            InternalEObject oldLocation = (InternalEObject)location;
            location = (Location)eResolveProxy(oldLocation);
            if (location != oldLocation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.ORGANIZATION_LOCATION__LOCATION, oldLocation, location));
            }
        }
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location basicGetLocation() {
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION_LOCATION__LOCATION, oldLocation, newLocation);
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
                msgs = ((InternalEObject)location).eInverseRemove(this, OparlPackage.LOCATION__ORGANIZATIONS, Location.class, msgs);
            if (newLocation != null)
                msgs = ((InternalEObject)newLocation).eInverseAdd(this, OparlPackage.LOCATION__ORGANIZATIONS, Location.class, msgs);
            msgs = basicSetLocation(newLocation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ORGANIZATION_LOCATION__LOCATION, newLocation, newLocation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOrganziation((Organization)otherEnd, msgs);
            case OparlPackage.ORGANIZATION_LOCATION__LOCATION:
                if (location != null)
                    msgs = ((InternalEObject)location).eInverseRemove(this, OparlPackage.LOCATION__ORGANIZATIONS, Location.class, msgs);
                return basicSetLocation((Location)otherEnd, msgs);
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
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                return basicSetOrganziation(null, msgs);
            case OparlPackage.ORGANIZATION_LOCATION__LOCATION:
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
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                return eInternalContainer().eInverseRemove(this, OparlPackage.ORGANIZATION__LOCATION, Organization.class, msgs);
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
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                if (resolve) return getOrganziation();
                return basicGetOrganziation();
            case OparlPackage.ORGANIZATION_LOCATION__LOCATION:
                if (resolve) return getLocation();
                return basicGetLocation();
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
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                setOrganziation((Organization)newValue);
                return;
            case OparlPackage.ORGANIZATION_LOCATION__LOCATION:
                setLocation((Location)newValue);
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
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                setOrganziation((Organization)null);
                return;
            case OparlPackage.ORGANIZATION_LOCATION__LOCATION:
                setLocation((Location)null);
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
            case OparlPackage.ORGANIZATION_LOCATION__ORGANZIATION:
                return basicGetOrganziation() != null;
            case OparlPackage.ORGANIZATION_LOCATION__LOCATION:
                return location != null;
        }
        return super.eIsSet(featureID);
    }

} //OrganizationLocationImpl
