/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.InvitationFile;
import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.ResultsProtocol;
import de.oklab.leipzig.oparl.VerbatimProtocol;

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
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getChairPerson <em>Chair Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getScribe <em>Scribe</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getInvitation <em>Invitation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getResultsProtocol <em>Results Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getVerbatimProtocol <em>Verbatim Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.MeetingImpl#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeetingImpl extends MinimalEObjectImpl.Container implements Meeting {
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
	 * The default value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected String streetAddress = STREET_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected String locality = LOCALITY_EDEFAULT;

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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organization;

	/**
	 * The cached value of the '{@link #getChairPerson() <em>Chair Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChairPerson()
	 * @generated
	 * @ordered
	 */
	protected Person chairPerson;

	/**
	 * The cached value of the '{@link #getScribe() <em>Scribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScribe()
	 * @generated
	 * @ordered
	 */
	protected Person scribe;

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
	 * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryFile()
	 * @generated
	 * @ordered
	 */
	protected AuxiliaryFile auxiliaryFile;

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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__NAME, oldName, name));
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
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetAddress(String newStreetAddress) {
		String oldStreetAddress = streetAddress;
		streetAddress = newStreetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__STREET_ADDRESS, oldStreetAddress, streetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality(String newLocality) {
		String oldLocality = locality;
		locality = newLocality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__LOCALITY, oldLocality, locality));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEETING__LOCATION, oldLocation, location));
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
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getOrganization() {
		if (organization == null) {
			organization = new EObjectWithInverseResolvingEList.ManyInverse<Organization>(Organization.class, this, OparlPackage.MEETING__ORGANIZATION, OparlPackage.ORGANIZATION__MEETING);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getChairPerson() {
		if (chairPerson != null && chairPerson.eIsProxy()) {
			InternalEObject oldChairPerson = (InternalEObject)chairPerson;
			chairPerson = (Person)eResolveProxy(oldChairPerson);
			if (chairPerson != oldChairPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEETING__CHAIR_PERSON, oldChairPerson, chairPerson));
			}
		}
		return chairPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetChairPerson() {
		return chairPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChairPerson(Person newChairPerson) {
		Person oldChairPerson = chairPerson;
		chairPerson = newChairPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__CHAIR_PERSON, oldChairPerson, chairPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getScribe() {
		if (scribe != null && scribe.eIsProxy()) {
			InternalEObject oldScribe = (InternalEObject)scribe;
			scribe = (Person)eResolveProxy(oldScribe);
			if (scribe != oldScribe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.MEETING__SCRIBE, oldScribe, scribe));
			}
		}
		return scribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetScribe() {
		return scribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScribe(Person newScribe) {
		Person oldScribe = scribe;
		scribe = newScribe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__SCRIBE, oldScribe, scribe));
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
	public AuxiliaryFile getAuxiliaryFile() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__AUXILIARY_FILE, oldAuxiliaryFile, newAuxiliaryFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliaryFile(AuxiliaryFile newAuxiliaryFile) {
		if (newAuxiliaryFile != auxiliaryFile) {
			NotificationChain msgs = null;
			if (auxiliaryFile != null)
				msgs = ((InternalEObject)auxiliaryFile).eInverseRemove(this, OparlPackage.AUXILIARY_FILE__MEETING, AuxiliaryFile.class, msgs);
			if (newAuxiliaryFile != null)
				msgs = ((InternalEObject)newAuxiliaryFile).eInverseAdd(this, OparlPackage.AUXILIARY_FILE__MEETING, AuxiliaryFile.class, msgs);
			msgs = basicSetAuxiliaryFile(newAuxiliaryFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__AUXILIARY_FILE, newAuxiliaryFile, newAuxiliaryFile));
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
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.MEETING__KEYWORD);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.MEETING__MODIFIED, oldModified, modified));
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
				if (auxiliaryFile != null)
					msgs = ((InternalEObject)auxiliaryFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.MEETING__AUXILIARY_FILE, null, msgs);
				return basicSetAuxiliaryFile((AuxiliaryFile)otherEnd, msgs);
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
			case OparlPackage.MEETING__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case OparlPackage.MEETING__INVITATION:
				return basicSetInvitation(null, msgs);
			case OparlPackage.MEETING__RESULTS_PROTOCOL:
				return basicSetResultsProtocol(null, msgs);
			case OparlPackage.MEETING__VERBATIM_PROTOCOL:
				return basicSetVerbatimProtocol(null, msgs);
			case OparlPackage.MEETING__AUXILIARY_FILE:
				return basicSetAuxiliaryFile(null, msgs);
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
			case OparlPackage.MEETING__ID:
				return getId();
			case OparlPackage.MEETING__TYPE:
				return getType();
			case OparlPackage.MEETING__NAME:
				return getName();
			case OparlPackage.MEETING__START:
				return getStart();
			case OparlPackage.MEETING__END:
				return getEnd();
			case OparlPackage.MEETING__STREET_ADDRESS:
				return getStreetAddress();
			case OparlPackage.MEETING__POSTAL_CODE:
				return getPostalCode();
			case OparlPackage.MEETING__LOCALITY:
				return getLocality();
			case OparlPackage.MEETING__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case OparlPackage.MEETING__ORGANIZATION:
				return getOrganization();
			case OparlPackage.MEETING__CHAIR_PERSON:
				if (resolve) return getChairPerson();
				return basicGetChairPerson();
			case OparlPackage.MEETING__SCRIBE:
				if (resolve) return getScribe();
				return basicGetScribe();
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
			case OparlPackage.MEETING__KEYWORD:
				return getKeyword();
			case OparlPackage.MEETING__CREATED:
				return getCreated();
			case OparlPackage.MEETING__MODIFIED:
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
			case OparlPackage.MEETING__ID:
				setId((String)newValue);
				return;
			case OparlPackage.MEETING__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.MEETING__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.MEETING__START:
				setStart((Date)newValue);
				return;
			case OparlPackage.MEETING__END:
				setEnd((Date)newValue);
				return;
			case OparlPackage.MEETING__STREET_ADDRESS:
				setStreetAddress((String)newValue);
				return;
			case OparlPackage.MEETING__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case OparlPackage.MEETING__LOCALITY:
				setLocality((String)newValue);
				return;
			case OparlPackage.MEETING__LOCATION:
				setLocation((Location)newValue);
				return;
			case OparlPackage.MEETING__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case OparlPackage.MEETING__CHAIR_PERSON:
				setChairPerson((Person)newValue);
				return;
			case OparlPackage.MEETING__SCRIBE:
				setScribe((Person)newValue);
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
				setAuxiliaryFile((AuxiliaryFile)newValue);
				return;
			case OparlPackage.MEETING__AGENDA_ITEM:
				getAgendaItem().clear();
				getAgendaItem().addAll((Collection<? extends AgendaItem>)newValue);
				return;
			case OparlPackage.MEETING__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.MEETING__CREATED:
				setCreated((Date)newValue);
				return;
			case OparlPackage.MEETING__MODIFIED:
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
			case OparlPackage.MEETING__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.MEETING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.MEETING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.MEETING__START:
				setStart(START_EDEFAULT);
				return;
			case OparlPackage.MEETING__END:
				setEnd(END_EDEFAULT);
				return;
			case OparlPackage.MEETING__STREET_ADDRESS:
				setStreetAddress(STREET_ADDRESS_EDEFAULT);
				return;
			case OparlPackage.MEETING__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case OparlPackage.MEETING__LOCALITY:
				setLocality(LOCALITY_EDEFAULT);
				return;
			case OparlPackage.MEETING__LOCATION:
				setLocation((Location)null);
				return;
			case OparlPackage.MEETING__ORGANIZATION:
				getOrganization().clear();
				return;
			case OparlPackage.MEETING__CHAIR_PERSON:
				setChairPerson((Person)null);
				return;
			case OparlPackage.MEETING__SCRIBE:
				setScribe((Person)null);
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
				setAuxiliaryFile((AuxiliaryFile)null);
				return;
			case OparlPackage.MEETING__AGENDA_ITEM:
				getAgendaItem().clear();
				return;
			case OparlPackage.MEETING__KEYWORD:
				getKeyword().clear();
				return;
			case OparlPackage.MEETING__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case OparlPackage.MEETING__MODIFIED:
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
			case OparlPackage.MEETING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.MEETING__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.MEETING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.MEETING__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case OparlPackage.MEETING__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case OparlPackage.MEETING__STREET_ADDRESS:
				return STREET_ADDRESS_EDEFAULT == null ? streetAddress != null : !STREET_ADDRESS_EDEFAULT.equals(streetAddress);
			case OparlPackage.MEETING__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case OparlPackage.MEETING__LOCALITY:
				return LOCALITY_EDEFAULT == null ? locality != null : !LOCALITY_EDEFAULT.equals(locality);
			case OparlPackage.MEETING__LOCATION:
				return location != null;
			case OparlPackage.MEETING__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case OparlPackage.MEETING__CHAIR_PERSON:
				return chairPerson != null;
			case OparlPackage.MEETING__SCRIBE:
				return scribe != null;
			case OparlPackage.MEETING__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case OparlPackage.MEETING__INVITATION:
				return invitation != null;
			case OparlPackage.MEETING__RESULTS_PROTOCOL:
				return resultsProtocol != null;
			case OparlPackage.MEETING__VERBATIM_PROTOCOL:
				return verbatimProtocol != null;
			case OparlPackage.MEETING__AUXILIARY_FILE:
				return auxiliaryFile != null;
			case OparlPackage.MEETING__AGENDA_ITEM:
				return agendaItem != null && !agendaItem.isEmpty();
			case OparlPackage.MEETING__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case OparlPackage.MEETING__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case OparlPackage.MEETING__MODIFIED:
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
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", streetAddress: ");
		result.append(streetAddress);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", locality: ");
		result.append(locality);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(')');
		return result.toString();
	}

} //MeetingImpl
