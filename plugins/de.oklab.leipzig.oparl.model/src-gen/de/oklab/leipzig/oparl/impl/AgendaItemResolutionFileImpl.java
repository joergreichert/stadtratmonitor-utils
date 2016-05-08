/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AgendaItemResolutionFile;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.ResolutionFile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agenda Item Resolution File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemResolutionFileImpl#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemResolutionFileImpl#getResolutionFile <em>Resolution File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgendaItemResolutionFileImpl extends MinimalEObjectImpl.Container implements AgendaItemResolutionFile {
    /**
     * The cached value of the '{@link #getResolutionFile() <em>Resolution File</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResolutionFile()
     * @generated
     * @ordered
     */
    protected ResolutionFile resolutionFile;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AgendaItemResolutionFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OparlPackage.Literals.AGENDA_ITEM_RESOLUTION_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AgendaItem getAgendaItem() {
        if (eContainerFeatureID() != OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM) return null;
        return (AgendaItem)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AgendaItem basicGetAgendaItem() {
        if (eContainerFeatureID() != OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM) return null;
        return (AgendaItem)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAgendaItem(AgendaItem newAgendaItem, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAgendaItem, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAgendaItem(AgendaItem newAgendaItem) {
        if (newAgendaItem != eInternalContainer() || (eContainerFeatureID() != OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM && newAgendaItem != null)) {
            if (EcoreUtil.isAncestor(this, newAgendaItem))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAgendaItem != null)
                msgs = ((InternalEObject)newAgendaItem).eInverseAdd(this, OparlPackage.AGENDA_ITEM__RESOLUTION_FILE, AgendaItem.class, msgs);
            msgs = basicSetAgendaItem(newAgendaItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM, newAgendaItem, newAgendaItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResolutionFile getResolutionFile() {
        if (resolutionFile != null && resolutionFile.eIsProxy()) {
            InternalEObject oldResolutionFile = (InternalEObject)resolutionFile;
            resolutionFile = (ResolutionFile)eResolveProxy(oldResolutionFile);
            if (resolutionFile != oldResolutionFile) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE, oldResolutionFile, resolutionFile));
            }
        }
        return resolutionFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResolutionFile basicGetResolutionFile() {
        return resolutionFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResolutionFile(ResolutionFile newResolutionFile, NotificationChain msgs) {
        ResolutionFile oldResolutionFile = resolutionFile;
        resolutionFile = newResolutionFile;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE, oldResolutionFile, newResolutionFile);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResolutionFile(ResolutionFile newResolutionFile) {
        if (newResolutionFile != resolutionFile) {
            NotificationChain msgs = null;
            if (resolutionFile != null)
                msgs = ((InternalEObject)resolutionFile).eInverseRemove(this, OparlPackage.RESOLUTION_FILE__AGENDA_ITEM, ResolutionFile.class, msgs);
            if (newResolutionFile != null)
                msgs = ((InternalEObject)newResolutionFile).eInverseAdd(this, OparlPackage.RESOLUTION_FILE__AGENDA_ITEM, ResolutionFile.class, msgs);
            msgs = basicSetResolutionFile(newResolutionFile, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE, newResolutionFile, newResolutionFile));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAgendaItem((AgendaItem)otherEnd, msgs);
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE:
                if (resolutionFile != null)
                    msgs = ((InternalEObject)resolutionFile).eInverseRemove(this, OparlPackage.RESOLUTION_FILE__AGENDA_ITEM, ResolutionFile.class, msgs);
                return basicSetResolutionFile((ResolutionFile)otherEnd, msgs);
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
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                return basicSetAgendaItem(null, msgs);
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE:
                return basicSetResolutionFile(null, msgs);
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
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                return eInternalContainer().eInverseRemove(this, OparlPackage.AGENDA_ITEM__RESOLUTION_FILE, AgendaItem.class, msgs);
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
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                if (resolve) return getAgendaItem();
                return basicGetAgendaItem();
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE:
                if (resolve) return getResolutionFile();
                return basicGetResolutionFile();
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
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                setAgendaItem((AgendaItem)newValue);
                return;
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE:
                setResolutionFile((ResolutionFile)newValue);
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
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                setAgendaItem((AgendaItem)null);
                return;
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE:
                setResolutionFile((ResolutionFile)null);
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
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM:
                return basicGetAgendaItem() != null;
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE:
                return resolutionFile != null;
        }
        return super.eIsSet(featureID);
    }

} //AgendaItemResolutionFileImpl
