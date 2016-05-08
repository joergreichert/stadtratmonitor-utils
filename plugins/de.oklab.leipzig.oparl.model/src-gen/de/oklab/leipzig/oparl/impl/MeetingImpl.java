/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AddressableOParlElement;
import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.InvitationFile;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.MeetingLocation;
import de.oklab.leipzig.oparl.MeetingOrganization;
import de.oklab.leipzig.oparl.Named;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.ResultsProtocol;
import de.oklab.leipzig.oparl.Typed;
import de.oklab.leipzig.oparl.VerbatimProtocol;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getMeetingState <em>Meeting State</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#isCancelled <em>Cancelled</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getInvitation <em>Invitation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getResultsProtocol <em>Results Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getVerbatimProtocol <em>Verbatim Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getAgendaItem <em>Agenda Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeetingImpl extends AddressableOParlElementImpl implements Meeting {
    /**
     * The default value of the '{@link #getMeetingState() <em>Meeting State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeetingState()
     * @generated
     * @ordered
     */
    protected static final String MEETING_STATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMeetingState() <em>Meeting State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeetingState()
     * @generated
     * @ordered
     */
    protected String meetingState = MEETING_STATE_EDEFAULT;

    /**
     * The default value of the '{@link #isCancelled() <em>Cancelled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelled()
     * @generated
     * @ordered
     */
    protected static final boolean CANCELLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCancelled() <em>Cancelled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCancelled()
     * @generated
     * @ordered
     */
    protected boolean cancelled = CANCELLED_EDEFAULT;

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
     * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoom()
     * @generated
     * @ordered
     */
    protected static final String ROOM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoom()
     * @generated
     * @ordered
     */
    protected String room = ROOM_EDEFAULT;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected MeetingLocation location;

    /**
     * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganization()
     * @generated
     * @ordered
     */
    protected EList<MeetingOrganization> organization;

    /**
     * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParticipant()
     * @generated
     * @ordered
     */
    protected EList<Person> participant;

    /**
     * The cached value of the '{@link #getInvitation() <em>Invitation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInvitation()
     * @generated
     * @ordered
     */
    protected InvitationFile invitation;

    /**
     * The cached value of the '{@link #getResultsProtocol() <em>Results Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResultsProtocol()
     * @generated
     * @ordered
     */
    protected ResultsProtocol resultsProtocol;

    /**
     * The cached value of the '{@link #getVerbatimProtocol() <em>Verbatim Protocol</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVerbatimProtocol()
     * @generated
     * @ordered
     */
    protected VerbatimProtocol verbatimProtocol;

    /**
     * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryFile()
     * @generated
     * @ordered
     */
    protected EList<AuxiliaryFile> auxiliaryFile;

    /**
     * The cached value of the '{@link #getAgendaItem() <em>Agenda Item</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAgendaItem()
     * @generated
     * @ordered
     */
    protected EList<AgendaItem> agendaItem;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeetingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OparlPackage.Literals.MEETING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMeetingState() {
        return meetingState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeetingState(String newMeetingState) {
        String oldMeetingState = meetingState;
        meetingState = newMeetingState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__MEETING_STATE, oldMeetingState, meetingState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCancelled(boolean newCancelled) {
        boolean oldCancelled = cancelled;
        cancelled = newCancelled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__CANCELLED, oldCancelled, cancelled));
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
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__START, oldStart, start));
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
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__END, oldEnd, end));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRoom() {
        return room;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRoom(String newRoom) {
        String oldRoom = room;
        room = newRoom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__ROOM, oldRoom, room));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeetingLocation getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation(MeetingLocation newLocation, NotificationChain msgs) {
        MeetingLocation oldLocation = location;
        location = newLocation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__LOCATION, oldLocation, newLocation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(MeetingLocation newLocation) {
        if (newLocation != location) {
            NotificationChain msgs = null;
            if (location != null)
                msgs = ((InternalEObject)location).eInverseRemove(this, OparlPackage.MEETING_LOCATION__MEETING, MeetingLocation.class, msgs);
            if (newLocation != null)
                msgs = ((InternalEObject)newLocation).eInverseAdd(this, OparlPackage.MEETING_LOCATION__MEETING, MeetingLocation.class, msgs);
            msgs = basicSetLocation(newLocation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__LOCATION, newLocation, newLocation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MeetingOrganization> getOrganization() {
        if (organization == null) {
            organization = new EObjectWithInverseResolvingEList<MeetingOrganization>(MeetingOrganization.class, this, OparlPackage.MEETING__ORGANIZATION, OparlPackage.MEETING_ORGANIZATION__MEETING);
        }
        return organization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Person> getParticipant() {
        if (participant == null) {
            participant = new EObjectResolvingEList<Person>(Person.class, this, OparlPackage.MEETING__PARTICIPANT);
        }
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InvitationFile getInvitation() {
        return invitation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInvitation(InvitationFile newInvitation, NotificationChain msgs) {
        InvitationFile oldInvitation = invitation;
        invitation = newInvitation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__INVITATION, oldInvitation, newInvitation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInvitation(InvitationFile newInvitation) {
        if (newInvitation != invitation) {
            NotificationChain msgs = null;
            if (invitation != null)
                msgs = ((InternalEObject)invitation).eInverseRemove(this, OparlPackage.INVITATION_FILE__MEETING, InvitationFile.class, msgs);
            if (newInvitation != null)
                msgs = ((InternalEObject)newInvitation).eInverseAdd(this, OparlPackage.INVITATION_FILE__MEETING, InvitationFile.class, msgs);
            msgs = basicSetInvitation(newInvitation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__INVITATION, newInvitation, newInvitation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResultsProtocol getResultsProtocol() {
        return resultsProtocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetResultsProtocol(ResultsProtocol newResultsProtocol, NotificationChain msgs) {
        ResultsProtocol oldResultsProtocol = resultsProtocol;
        resultsProtocol = newResultsProtocol;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__RESULTS_PROTOCOL, oldResultsProtocol, newResultsProtocol);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResultsProtocol(ResultsProtocol newResultsProtocol) {
        if (newResultsProtocol != resultsProtocol) {
            NotificationChain msgs = null;
            if (resultsProtocol != null)
                msgs = ((InternalEObject)resultsProtocol).eInverseRemove(this, OparlPackage.RESULTS_PROTOCOL__MEETING, ResultsProtocol.class, msgs);
            if (newResultsProtocol != null)
                msgs = ((InternalEObject)newResultsProtocol).eInverseAdd(this, OparlPackage.RESULTS_PROTOCOL__MEETING, ResultsProtocol.class, msgs);
            msgs = basicSetResultsProtocol(newResultsProtocol, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__RESULTS_PROTOCOL, newResultsProtocol, newResultsProtocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VerbatimProtocol getVerbatimProtocol() {
        return verbatimProtocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVerbatimProtocol(VerbatimProtocol newVerbatimProtocol, NotificationChain msgs) {
        VerbatimProtocol oldVerbatimProtocol = verbatimProtocol;
        verbatimProtocol = newVerbatimProtocol;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__VERBATIM_PROTOCOL, oldVerbatimProtocol, newVerbatimProtocol);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVerbatimProtocol(VerbatimProtocol newVerbatimProtocol) {
        if (newVerbatimProtocol != verbatimProtocol) {
            NotificationChain msgs = null;
            if (verbatimProtocol != null)
                msgs = ((InternalEObject)verbatimProtocol).eInverseRemove(this, OparlPackage.VERBATIM_PROTOCOL__MEETING, VerbatimProtocol.class, msgs);
            if (newVerbatimProtocol != null)
                msgs = ((InternalEObject)newVerbatimProtocol).eInverseAdd(this, OparlPackage.VERBATIM_PROTOCOL__MEETING, VerbatimProtocol.class, msgs);
            msgs = basicSetVerbatimProtocol(newVerbatimProtocol, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__VERBATIM_PROTOCOL, newVerbatimProtocol, newVerbatimProtocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AuxiliaryFile> getAuxiliaryFile() {
        if (auxiliaryFile == null) {
            auxiliaryFile = new EObjectContainmentWithInverseEList<AuxiliaryFile>(AuxiliaryFile.class, this, OparlPackage.MEETING__AUXILIARY_FILE, OparlPackage.AUXILIARY_FILE__MEETING);
        }
        return auxiliaryFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AgendaItem> getAgendaItem() {
        if (agendaItem == null) {
            agendaItem = new EObjectContainmentWithInverseEList<AgendaItem>(AgendaItem.class, this, OparlPackage.MEETING__AGENDA_ITEM, OparlPackage.AGENDA_ITEM__MEETING);
        }
        return agendaItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return "https://oparl.org/schema/1.0/Meeting";
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case OparlPackage.MEETING__LOCATION:
                if (location != null)
                    msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.MEETING__LOCATION, null, msgs);
                return basicSetLocation((MeetingLocation)otherEnd, msgs);
            case OparlPackage.MEETING__ORGANIZATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganization()).basicAdd(otherEnd, msgs);
            case OparlPackage.MEETING__INVITATION:
                if (invitation != null)
                    msgs = ((InternalEObject)invitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.MEETING__INVITATION, null, msgs);
                return basicSetInvitation((InvitationFile)otherEnd, msgs);
            case OparlPackage.MEETING__RESULTS_PROTOCOL:
                if (resultsProtocol != null)
                    msgs = ((InternalEObject)resultsProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.MEETING__RESULTS_PROTOCOL, null, msgs);
                return basicSetResultsProtocol((ResultsProtocol)otherEnd, msgs);
            case OparlPackage.MEETING__VERBATIM_PROTOCOL:
                if (verbatimProtocol != null)
                    msgs = ((InternalEObject)verbatimProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.MEETING__VERBATIM_PROTOCOL, null, msgs);
                return basicSetVerbatimProtocol((VerbatimProtocol)otherEnd, msgs);
            case OparlPackage.MEETING__AUXILIARY_FILE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryFile()).basicAdd(otherEnd, msgs);
            case OparlPackage.MEETING__AGENDA_ITEM:
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
            case OparlPackage.MEETING__LOCATION:
                return basicSetLocation(null, msgs);
            case OparlPackage.MEETING__ORGANIZATION:
                return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
            case OparlPackage.MEETING__INVITATION:
                return basicSetInvitation(null, msgs);
            case OparlPackage.MEETING__RESULTS_PROTOCOL:
                return basicSetResultsProtocol(null, msgs);
            case OparlPackage.MEETING__VERBATIM_PROTOCOL:
                return basicSetVerbatimProtocol(null, msgs);
            case OparlPackage.MEETING__AUXILIARY_FILE:
                return ((InternalEList<?>)getAuxiliaryFile()).basicRemove(otherEnd, msgs);
            case OparlPackage.MEETING__AGENDA_ITEM:
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
            case OparlPackage.MEETING__MEETING_STATE:
                return getMeetingState();
            case OparlPackage.MEETING__CANCELLED:
                return isCancelled();
            case OparlPackage.MEETING__START:
                return getStart();
            case OparlPackage.MEETING__END:
                return getEnd();
            case OparlPackage.MEETING__ROOM:
                return getRoom();
            case OparlPackage.MEETING__LOCATION:
                return getLocation();
            case OparlPackage.MEETING__ORGANIZATION:
                return getOrganization();
            case OparlPackage.MEETING__PARTICIPANT:
                return getParticipant();
            case OparlPackage.MEETING__INVITATION:
                return getInvitation();
            case OparlPackage.MEETING__RESULTS_PROTOCOL:
                return getResultsProtocol();
            case OparlPackage.MEETING__VERBATIM_PROTOCOL:
                return getVerbatimProtocol();
            case OparlPackage.MEETING__AUXILIARY_FILE:
                return getAuxiliaryFile();
            case OparlPackage.MEETING__AGENDA_ITEM:
                return getAgendaItem();
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
            case OparlPackage.MEETING__MEETING_STATE:
                setMeetingState((String)newValue);
                return;
            case OparlPackage.MEETING__CANCELLED:
                setCancelled((Boolean)newValue);
                return;
            case OparlPackage.MEETING__START:
                setStart((Date)newValue);
                return;
            case OparlPackage.MEETING__END:
                setEnd((Date)newValue);
                return;
            case OparlPackage.MEETING__ROOM:
                setRoom((String)newValue);
                return;
            case OparlPackage.MEETING__LOCATION:
                setLocation((MeetingLocation)newValue);
                return;
            case OparlPackage.MEETING__ORGANIZATION:
                getOrganization().clear();
                getOrganization().addAll((Collection<? extends MeetingOrganization>)newValue);
                return;
            case OparlPackage.MEETING__PARTICIPANT:
                getParticipant().clear();
                getParticipant().addAll((Collection<? extends Person>)newValue);
                return;
            case OparlPackage.MEETING__INVITATION:
                setInvitation((InvitationFile)newValue);
                return;
            case OparlPackage.MEETING__RESULTS_PROTOCOL:
                setResultsProtocol((ResultsProtocol)newValue);
                return;
            case OparlPackage.MEETING__VERBATIM_PROTOCOL:
                setVerbatimProtocol((VerbatimProtocol)newValue);
                return;
            case OparlPackage.MEETING__AUXILIARY_FILE:
                getAuxiliaryFile().clear();
                getAuxiliaryFile().addAll((Collection<? extends AuxiliaryFile>)newValue);
                return;
            case OparlPackage.MEETING__AGENDA_ITEM:
                getAgendaItem().clear();
                getAgendaItem().addAll((Collection<? extends AgendaItem>)newValue);
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
            case OparlPackage.MEETING__MEETING_STATE:
                setMeetingState(MEETING_STATE_EDEFAULT);
                return;
            case OparlPackage.MEETING__CANCELLED:
                setCancelled(CANCELLED_EDEFAULT);
                return;
            case OparlPackage.MEETING__START:
                setStart(START_EDEFAULT);
                return;
            case OparlPackage.MEETING__END:
                setEnd(END_EDEFAULT);
                return;
            case OparlPackage.MEETING__ROOM:
                setRoom(ROOM_EDEFAULT);
                return;
            case OparlPackage.MEETING__LOCATION:
                setLocation((MeetingLocation)null);
                return;
            case OparlPackage.MEETING__ORGANIZATION:
                getOrganization().clear();
                return;
            case OparlPackage.MEETING__PARTICIPANT:
                getParticipant().clear();
                return;
            case OparlPackage.MEETING__INVITATION:
                setInvitation((InvitationFile)null);
                return;
            case OparlPackage.MEETING__RESULTS_PROTOCOL:
                setResultsProtocol((ResultsProtocol)null);
                return;
            case OparlPackage.MEETING__VERBATIM_PROTOCOL:
                setVerbatimProtocol((VerbatimProtocol)null);
                return;
            case OparlPackage.MEETING__AUXILIARY_FILE:
                getAuxiliaryFile().clear();
                return;
            case OparlPackage.MEETING__AGENDA_ITEM:
                getAgendaItem().clear();
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
            case OparlPackage.MEETING__MEETING_STATE:
                return MEETING_STATE_EDEFAULT == null ? meetingState != null : !MEETING_STATE_EDEFAULT.equals(meetingState);
            case OparlPackage.MEETING__CANCELLED:
                return cancelled != CANCELLED_EDEFAULT;
            case OparlPackage.MEETING__START:
                return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
            case OparlPackage.MEETING__END:
                return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
            case OparlPackage.MEETING__ROOM:
                return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
            case OparlPackage.MEETING__LOCATION:
                return location != null;
            case OparlPackage.MEETING__ORGANIZATION:
                return organization != null && !organization.isEmpty();
            case OparlPackage.MEETING__PARTICIPANT:
                return participant != null && !participant.isEmpty();
            case OparlPackage.MEETING__INVITATION:
                return invitation != null;
            case OparlPackage.MEETING__RESULTS_PROTOCOL:
                return resultsProtocol != null;
            case OparlPackage.MEETING__VERBATIM_PROTOCOL:
                return verbatimProtocol != null;
            case OparlPackage.MEETING__AUXILIARY_FILE:
                return auxiliaryFile != null && !auxiliaryFile.isEmpty();
            case OparlPackage.MEETING__AGENDA_ITEM:
                return agendaItem != null && !agendaItem.isEmpty();
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
                case OparlPackage.TYPED___GET_TYPE: return OparlPackage.MEETING___GET_TYPE;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == Named.class) {
            switch (baseOperationID) {
                case OparlPackage.NAMED___GET_NAME: return OparlPackage.MEETING___GET_NAME;
                default: return super.eDerivedOperationID(baseOperationID, baseClass);
            }
        }
        if (baseClass == AddressableOParlElement.class) {
            switch (baseOperationID) {
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS: return OparlPackage.MEETING___GET_STREET_ADDRESS;
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE: return OparlPackage.MEETING___GET_POSTAL_CODE;
                case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY: return OparlPackage.MEETING___GET_LOCALITY;
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
            case OparlPackage.MEETING___GET_TYPE:
                return getType();
            case OparlPackage.MEETING___GET_NAME:
                return getName();
            case OparlPackage.MEETING___GET_STREET_ADDRESS:
                return getStreetAddress();
            case OparlPackage.MEETING___GET_POSTAL_CODE:
                return getPostalCode();
            case OparlPackage.MEETING___GET_LOCALITY:
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
        result.append(" (meetingState: ");
        result.append(meetingState);
        result.append(", cancelled: ");
        result.append(cancelled);
        result.append(", start: ");
        result.append(start);
        result.append(", end: ");
        result.append(end);
        result.append(", room: ");
        result.append(room);
        result.append(')');
        return result.toString();
    }

} //MeetingImpl
