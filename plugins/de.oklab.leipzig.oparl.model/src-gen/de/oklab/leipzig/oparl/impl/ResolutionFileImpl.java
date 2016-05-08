/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItemResolutionFile;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.ResolutionFile;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ResolutionFileImpl#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ResolutionFileImpl#getPaper <em>Paper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolutionFileImpl extends FileImpl implements ResolutionFile {
    /**
     * The cached value of the '{@link #getAgendaItem() <em>Agenda Item</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAgendaItem()
     * @generated
     * @ordered
     */
    protected EList<AgendaItemResolutionFile> agendaItem;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResolutionFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OparlPackage.Literals.RESOLUTION_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AgendaItemResolutionFile> getAgendaItem() {
        if (agendaItem == null) {
            agendaItem = new EObjectWithInverseResolvingEList<AgendaItemResolutionFile>(AgendaItemResolutionFile.class, this, OparlPackage.RESOLUTION_FILE__AGENDA_ITEM, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE);
        }
        return agendaItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Paper> getPaper() {
        if (paper == null) {
            paper = new EObjectResolvingEList<Paper>(Paper.class, this, OparlPackage.RESOLUTION_FILE__PAPER);
        }
        return paper;
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
            case OparlPackage.RESOLUTION_FILE__AGENDA_ITEM:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgendaItem()).basicAdd(otherEnd, msgs);
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
            case OparlPackage.RESOLUTION_FILE__AGENDA_ITEM:
                return ((InternalEList<?>)getAgendaItem()).basicRemove(otherEnd, msgs);
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
            case OparlPackage.RESOLUTION_FILE__AGENDA_ITEM:
                return getAgendaItem();
            case OparlPackage.RESOLUTION_FILE__PAPER:
                return getPaper();
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
            case OparlPackage.RESOLUTION_FILE__AGENDA_ITEM:
                getAgendaItem().clear();
                getAgendaItem().addAll((Collection<? extends AgendaItemResolutionFile>)newValue);
                return;
            case OparlPackage.RESOLUTION_FILE__PAPER:
                getPaper().clear();
                getPaper().addAll((Collection<? extends Paper>)newValue);
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
            case OparlPackage.RESOLUTION_FILE__AGENDA_ITEM:
                getAgendaItem().clear();
                return;
            case OparlPackage.RESOLUTION_FILE__PAPER:
                getPaper().clear();
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
            case OparlPackage.RESOLUTION_FILE__AGENDA_ITEM:
                return agendaItem != null && !agendaItem.isEmpty();
            case OparlPackage.RESOLUTION_FILE__PAPER:
                return paper != null && !paper.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ResolutionFileImpl
