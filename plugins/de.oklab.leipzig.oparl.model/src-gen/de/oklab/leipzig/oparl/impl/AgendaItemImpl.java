/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile;
import de.oklab.leipzig.oparl.AgendaItemResolutionFile;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agenda Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getConsultation <em>Consultation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getResolutionText <em>Resolution Text</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getResolutionFile <em>Resolution File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgendaItemImpl extends InnerOParlElementImpl implements AgendaItem {
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
	 * The default value of the '{@link #getResolutionText() <em>Resolution Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionText()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolutionText() <em>Resolution Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionText()
	 * @generated
	 * @ordered
	 */
	protected String resolutionText = RESOLUTION_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolutionFile() <em>Resolution File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionFile()
	 * @generated
	 * @ordered
	 */
	protected AgendaItemResolutionFile resolutionFile;

	/**
	 * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryFile()
	 * @generated
	 * @ordered
	 */
	protected EList<AgendaItemAuxiliaryFile> auxiliaryFile;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

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
	public String getResolutionText() {
		return resolutionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionText(String newResolutionText) {
		String oldResolutionText = resolutionText;
		resolutionText = newResolutionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__RESOLUTION_TEXT, oldResolutionText, resolutionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendaItemResolutionFile getResolutionFile() {
		return resolutionFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolutionFile(AgendaItemResolutionFile newResolutionFile, NotificationChain msgs) {
		AgendaItemResolutionFile oldResolutionFile = resolutionFile;
		resolutionFile = newResolutionFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__RESOLUTION_FILE, oldResolutionFile, newResolutionFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionFile(AgendaItemResolutionFile newResolutionFile) {
		if (newResolutionFile != resolutionFile) {
			NotificationChain msgs = null;
			if (resolutionFile != null)
				msgs = ((InternalEObject)resolutionFile).eInverseRemove(this, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM, AgendaItemResolutionFile.class, msgs);
			if (newResolutionFile != null)
				msgs = ((InternalEObject)newResolutionFile).eInverseAdd(this, OparlPackage.AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM, AgendaItemResolutionFile.class, msgs);
			msgs = basicSetResolutionFile(newResolutionFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__RESOLUTION_FILE, newResolutionFile, newResolutionFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgendaItemAuxiliaryFile> getAuxiliaryFile() {
		if (auxiliaryFile == null) {
			auxiliaryFile = new EObjectContainmentWithInverseEList<AgendaItemAuxiliaryFile>(AgendaItemAuxiliaryFile.class, this, OparlPackage.AGENDA_ITEM__AUXILIARY_FILE, OparlPackage.AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM);
		}
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.AGENDA_ITEM__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "https://oparl.org/schema/1.0/AgendaItem";
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
			case OparlPackage.AGENDA_ITEM__MEETING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMeeting((Meeting)otherEnd, msgs);
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				if (consultation != null)
					msgs = ((InternalEObject)consultation).eInverseRemove(this, OparlPackage.CONSULTATION__AGENDA_ITEM, Consultation.class, msgs);
				return basicSetConsultation((Consultation)otherEnd, msgs);
			case OparlPackage.AGENDA_ITEM__RESOLUTION_FILE:
				if (resolutionFile != null)
					msgs = ((InternalEObject)resolutionFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.AGENDA_ITEM__RESOLUTION_FILE, null, msgs);
				return basicSetResolutionFile((AgendaItemResolutionFile)otherEnd, msgs);
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryFile()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.AGENDA_ITEM__RESOLUTION_FILE:
				return basicSetResolutionFile(null, msgs);
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				return ((InternalEList<?>)getAuxiliaryFile()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.AGENDA_ITEM__NAME:
				return getName();
			case OparlPackage.AGENDA_ITEM__MEETING:
				if (resolve) return getMeeting();
				return basicGetMeeting();
			case OparlPackage.AGENDA_ITEM__NUMBER:
				return getNumber();
			case OparlPackage.AGENDA_ITEM__PUBLIC:
				return isPublic();
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				if (resolve) return getConsultation();
				return basicGetConsultation();
			case OparlPackage.AGENDA_ITEM__RESULT:
				return getResult();
			case OparlPackage.AGENDA_ITEM__RESOLUTION_TEXT:
				return getResolutionText();
			case OparlPackage.AGENDA_ITEM__RESOLUTION_FILE:
				return getResolutionFile();
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				return getAuxiliaryFile();
			case OparlPackage.AGENDA_ITEM__START:
				return getStart();
			case OparlPackage.AGENDA_ITEM__END:
				return getEnd();
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
			case OparlPackage.AGENDA_ITEM__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__MEETING:
				setMeeting((Meeting)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__NUMBER:
				setNumber((String)newValue);
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
			case OparlPackage.AGENDA_ITEM__RESOLUTION_TEXT:
				setResolutionText((String)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__RESOLUTION_FILE:
				setResolutionFile((AgendaItemResolutionFile)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				getAuxiliaryFile().clear();
				getAuxiliaryFile().addAll((Collection<? extends AgendaItemAuxiliaryFile>)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__START:
				setStart((Date)newValue);
				return;
			case OparlPackage.AGENDA_ITEM__END:
				setEnd((Date)newValue);
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
			case OparlPackage.AGENDA_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__MEETING:
				setMeeting((Meeting)null);
				return;
			case OparlPackage.AGENDA_ITEM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
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
			case OparlPackage.AGENDA_ITEM__RESOLUTION_TEXT:
				setResolutionText(RESOLUTION_TEXT_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__RESOLUTION_FILE:
				setResolutionFile((AgendaItemResolutionFile)null);
				return;
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				getAuxiliaryFile().clear();
				return;
			case OparlPackage.AGENDA_ITEM__START:
				setStart(START_EDEFAULT);
				return;
			case OparlPackage.AGENDA_ITEM__END:
				setEnd(END_EDEFAULT);
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
			case OparlPackage.AGENDA_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.AGENDA_ITEM__MEETING:
				return basicGetMeeting() != null;
			case OparlPackage.AGENDA_ITEM__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case OparlPackage.AGENDA_ITEM__PUBLIC:
				return public_ != PUBLIC_EDEFAULT;
			case OparlPackage.AGENDA_ITEM__CONSULTATION:
				return consultation != null;
			case OparlPackage.AGENDA_ITEM__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case OparlPackage.AGENDA_ITEM__RESOLUTION_TEXT:
				return RESOLUTION_TEXT_EDEFAULT == null ? resolutionText != null : !RESOLUTION_TEXT_EDEFAULT.equals(resolutionText);
			case OparlPackage.AGENDA_ITEM__RESOLUTION_FILE:
				return resolutionFile != null;
			case OparlPackage.AGENDA_ITEM__AUXILIARY_FILE:
				return auxiliaryFile != null && !auxiliaryFile.isEmpty();
			case OparlPackage.AGENDA_ITEM__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case OparlPackage.AGENDA_ITEM__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OparlPackage.AGENDA_ITEM___GET_TYPE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(", public: ");
		result.append(public_);
		result.append(", result: ");
		result.append(result);
		result.append(", resolutionText: ");
		result.append(resolutionText);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //AgendaItemImpl
