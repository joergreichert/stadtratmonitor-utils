/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;

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
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agenda Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getConsultation <em>Consultation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgendaItemImpl extends MinimalEObjectImpl.Container implements AgendaItem {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> auxiliaryFile;

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
	 * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean public_ = PUBLIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsultation() <em>Consultation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultation()
	 * @generated
	 * @ordered
	 */
	protected Consultation consultation;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

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
	protected AgendaItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.AGENDA_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting getMeeting() {
		if (eContainerFeatureID() != OparlPackage.AGENDA_ITEM__MEETING) return null;
		return (Meeting)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting basicGetMeeting() {
		if (eContainerFeatureID() != OparlPackage.AGENDA_ITEM__MEETING) return null;
		return (Meeting)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeeting(Meeting newMeeting, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMeeting, OparlPackage.AGENDA_ITEM__MEETING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeeting(Meeting newMeeting) {
		if (newMeeting != eInternalContainer() || (eContainerFeatureID() != OparlPackage.AGENDA_ITEM__MEETING && newMeeting != null)) {
			if (EcoreUtil.isAncestor(this, newMeeting))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeeting != null)
				msgs = ((InternalEObject)newMeeting).eInverseAdd(this, OparlPackage.MEETING__AGENDA_ITEM, Meeting.class, msgs);
			msgs = basicSetMeeting(newMeeting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__MEETING, newMeeting, newMeeting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__RESOLUTION, oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getAuxiliaryFile() {
		if (auxiliaryFile == null) {
			auxiliaryFile = new EObjectResolvingEList<File>(File.class, this, OparlPackage.AGENDA_ITEM__AUXILIARY_FILE);
		}
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.AGENDA_ITEM__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(boolean newPublic) {
		boolean oldPublic = public_;
		public_ = newPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__PUBLIC, oldPublic, public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consultation getConsultation() {
		if (consultation != null && consultation.eIsProxy()) {
			InternalEObject oldConsultation = (InternalEObject)consultation;
			consultation = (Consultation)eResolveProxy(oldConsultation);
			if (consultation != oldConsultation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.AGENDA_ITEM__CONSULTATION, oldConsultation, consultation));
			}
		}
		return consultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consultation basicGetConsultation() {
		return consultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsultation(Consultation newConsultation, NotificationChain msgs) {
		Consultation oldConsultation = consultation;
		consultation = newConsultation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__CONSULTATION, oldConsultation, newConsultation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsultation(Consultation newConsultation) {
		if (newConsultation != consultation) {
			NotificationChain msgs = null;
			if (consultation != null)
				msgs = ((InternalEObject)consultation).eInverseRemove(this, OparlPackage.CONSULTATION__AGENDA_ITEM, Consultation.class, msgs);
			if (newConsultation != null)
				msgs = ((InternalEObject)newConsultation).eInverseAdd(this, OparlPackage.CONSULTATION__AGENDA_ITEM, Consultation.class, msgs);
			msgs = basicSetConsultation(newConsultation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__CONSULTATION, newConsultation, newConsultation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__RESULT, oldResult, result));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.AGENDA_ITEM__MEETING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMeeting((Meeting)otherEnd, msgs);
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				if (consultation != null)
					msgs = ((InternalEObject)consultation).eInverseRemove(this, OparlPackage.CONSULTATION__AGENDA_ITEM, Consultation.class, msgs);
				return basicSetConsultation((Consultation)otherEnd, msgs);
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
			case OparlPackage.AGENDA_ITEM__MEETING:
				return basicSetMeeting(null, msgs);
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				return basicSetConsultation(null, msgs);
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
			case OparlPackage.AGENDA_ITEM__MEETING:
				return eInternalContainer().eInverseRemove(this, OparlPackage.MEETING__AGENDA_ITEM, Meeting.class, msgs);
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
			case OparlPackage.AGENDA_ITEM__ID:
				return getId();
			case OparlPackage.AGENDA_ITEM__TYPE:
				return getType();
			case OparlPackage.AGENDA_ITEM__MEETING:
				if (resolve) return getMeeting();
				return basicGetMeeting();
			case OparlPackage.AGENDA_ITEM__NAME:
				return getName();
			case OparlPackage.AGENDA_ITEM__NUMBER:
				return getNumber();
			case OparlPackage.AGENDA_ITEM__RESOLUTION:
				return getResolution();
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				return getAuxiliaryFile();
			case OparlPackage.AGENDA_ITEM__KEYWORD:
				return getKeyword();
			case OparlPackage.AGENDA_ITEM__PUBLIC:
				return isPublic();
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				if (resolve) return getConsultation();
				return basicGetConsultation();
			case OparlPackage.AGENDA_ITEM__RESULT:
				return getResult();
			case OparlPackage.AGENDA_ITEM__CREATED:
				return getCreated();
			case OparlPackage.AGENDA_ITEM__MODIFIED:
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
			case OparlPackage.AGENDA_ITEM__ID:
				setId((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__MEETING:
				setMeeting((Meeting)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__NUMBER:
				setNumber((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__RESOLUTION:
				setResolution((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				getAuxiliaryFile().clear();
				getAuxiliaryFile().addAll((Collection<? extends File>)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__PUBLIC:
				setPublic((Boolean)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				setConsultation((Consultation)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__RESULT:
				setResult((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__CREATED:
				setCreated((Date)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__MODIFIED:
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
			case OparlPackage.AGENDA_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__MEETING:
				setMeeting((Meeting)null);
				return;
			case OparlPackage.AGENDA_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__RESOLUTION:
				setResolution(RESOLUTION_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				getAuxiliaryFile().clear();
				return;
			case OparlPackage.AGENDA_ITEM__KEYWORD:
				getKeyword().clear();
				return;
			case OparlPackage.AGENDA_ITEM__PUBLIC:
				setPublic(PUBLIC_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				setConsultation((Consultation)null);
				return;
			case OparlPackage.AGENDA_ITEM__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__MODIFIED:
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
			case OparlPackage.AGENDA_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.AGENDA_ITEM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.AGENDA_ITEM__MEETING:
				return basicGetMeeting() != null;
			case OparlPackage.AGENDA_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.AGENDA_ITEM__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case OparlPackage.AGENDA_ITEM__RESOLUTION:
				return RESOLUTION_EDEFAULT == null ? resolution != null : !RESOLUTION_EDEFAULT.equals(resolution);
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				return auxiliaryFile != null && !auxiliaryFile.isEmpty();
			case OparlPackage.AGENDA_ITEM__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case OparlPackage.AGENDA_ITEM__PUBLIC:
				return public_ != PUBLIC_EDEFAULT;
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				return consultation != null;
			case OparlPackage.AGENDA_ITEM__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case OparlPackage.AGENDA_ITEM__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case OparlPackage.AGENDA_ITEM__MODIFIED:
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
		result.append(", number: ");
		result.append(number);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", public: ");
		result.append(public_);
		result.append(", result: ");
		result.append(result);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(')');
		return result.toString();
	}

} //AgendaItemImpl
