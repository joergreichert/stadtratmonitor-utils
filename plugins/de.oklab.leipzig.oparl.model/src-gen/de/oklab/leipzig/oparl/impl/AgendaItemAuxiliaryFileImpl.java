/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile;
import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.OparlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agenda Item Auxiliary File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemAuxiliaryFileImpl#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemAuxiliaryFileImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgendaItemAuxiliaryFileImpl extends MinimalEObjectImpl.Container implements AgendaItemAuxiliaryFile {
	/**
	 * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryFile()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryFile auxiliaryFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgendaItemAuxiliaryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.AGENDA_ITEM_AUXILIARY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgendaItem getAgendaItem() {
		if (eContainerFeatureID() != OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM) return null;
		return (AgendaItem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendaItem basicGetAgendaItem() {
		if (eContainerFeatureID() != OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM) return null;
		return (AgendaItem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgendaItem(AgendaItem newAgendaItem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAgendaItem, OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgendaItem(AgendaItem newAgendaItem) {
		if (newAgendaItem != eInternalContainer() || (eContainerFeatureID() != OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM && newAgendaItem != null)) {
			if (EcoreUtil.isAncestor(this, newAgendaItem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAgendaItem != null)
				msgs = ((InternalEObject)newAgendaItem).eInverseAdd(this, OparlPackage.AGENDA_ITEM__AUXILIARY_FILE, AgendaItem.class, msgs);
			msgs = basicSetAgendaItem(newAgendaItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM, newAgendaItem, newAgendaItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuxiliaryFile getAuxiliaryFile() {
		if (auxiliaryFile != null && auxiliaryFile.eIsProxy()) {
			InternalEObject oldAuxiliaryFile = (InternalEObject)auxiliaryFile;
			auxiliaryFile = (AuxiliaryFile)eResolveProxy(oldAuxiliaryFile);
			if (auxiliaryFile != oldAuxiliaryFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE, oldAuxiliaryFile, auxiliaryFile));
			}
		}
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryFile basicGetAuxiliaryFile() {
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxiliaryFile(AuxiliaryFile newAuxiliaryFile, NotificationChain msgs) {
		AuxiliaryFile oldAuxiliaryFile = auxiliaryFile;
		auxiliaryFile = newAuxiliaryFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE, oldAuxiliaryFile, newAuxiliaryFile);
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
	public void setAuxiliaryFile(AuxiliaryFile newAuxiliaryFile) {
		if (newAuxiliaryFile != auxiliaryFile) {
			NotificationChain msgs = null;
			if (auxiliaryFile != null)
				msgs = ((InternalEObject)auxiliaryFile).eInverseRemove(this, OparlPackage.AUXILIARY_FILE__AGENDA_ITEM, AuxiliaryFile.class, msgs);
			if (newAuxiliaryFile != null)
				msgs = ((InternalEObject)newAuxiliaryFile).eInverseAdd(this, OparlPackage.AUXILIARY_FILE__AGENDA_ITEM, AuxiliaryFile.class, msgs);
			msgs = basicSetAuxiliaryFile(newAuxiliaryFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE, newAuxiliaryFile, newAuxiliaryFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAgendaItem((AgendaItem)otherEnd, msgs);
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE:
				if (auxiliaryFile != null)
					msgs = ((InternalEObject)auxiliaryFile).eInverseRemove(this, OparlPackage.AUXILIARY_FILE__AGENDA_ITEM, AuxiliaryFile.class, msgs);
				return basicSetAuxiliaryFile((AuxiliaryFile)otherEnd, msgs);
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
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				return basicSetAgendaItem(null, msgs);
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE:
				return basicSetAuxiliaryFile(null, msgs);
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
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				return eInternalContainer().eInverseRemove(this, OparlPackage.AGENDA_ITEM__AUXILIARY_FILE, AgendaItem.class, msgs);
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
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				if (resolve) return getAgendaItem();
				return basicGetAgendaItem();
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE:
				if (resolve) return getAuxiliaryFile();
				return basicGetAuxiliaryFile();
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
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				setAgendaItem((AgendaItem)newValue);
				return;
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE:
				setAuxiliaryFile((AuxiliaryFile)newValue);
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
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				setAgendaItem((AgendaItem)null);
				return;
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE:
				setAuxiliaryFile((AuxiliaryFile)null);
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
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM:
				return basicGetAgendaItem() != null;
			case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE:
				return auxiliaryFile != null;
		}
		return super.eIsSet(featureID);
	}

} //AgendaItemAuxiliaryFileImpl
