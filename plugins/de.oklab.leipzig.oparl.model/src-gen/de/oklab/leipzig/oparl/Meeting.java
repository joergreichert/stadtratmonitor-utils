/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getStart <em>Start</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getEnd <em>End</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getLocality <em>Locality</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getChairPerson <em>Chair Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getScribe <em>Scribe</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getInvitation <em>Invitation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getResultsProtocol <em>Results Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getVerbatimProtocol <em>Verbatim Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting()
 * @model
 * @generated
 */
public interface Meeting extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Meeting$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum und Uhrzeit des Anfangszeitpunkts der Sitzung. Bei einer zukünftigen Sitzung ist dies der geplante
	 * Zeitpunkt, bei einer stattgefundenen KANN es der tatsächliche Startzeitpunkt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Start()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endzeitpunkt der Sitzung als Datum/Uhrzeit. Bei einer zukünftigen Sitzung ist dies der geplante Zeitpunkt,
	 * bei einer stattgefundenen KANN es der tatsächliche Endzeitpunkt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_End()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Straße und Hausnummer des Sitzungsortes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Address</em>' attribute.
	 * @see #setStreetAddress(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_StreetAddress()
	 * @model unique="false"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getStreetAddress <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Address</em>' attribute.
	 * @see #getStreetAddress()
	 * @generated
	 */
	void setStreetAddress(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postleitzahl des Sitzungsortes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_PostalCode()
	 * @model unique="false"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ortsangabe des Sitzungsortes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' attribute.
	 * @see #setLocality(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Locality()
	 * @model unique="false"
	 * @generated
	 */
	String getLocality();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getLocality <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' attribute.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sitzungsort in Form von Geodaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gruppierungen, denen die Sitzung zugeordnet ist. Im Regelfall wird hier eine Gruppierung verknüpft sein,
	 * es kann jedoch auch gemeinsame Sitzungen mehrerer Gruppierungen geben. Das erste Element ist dann das
	 * federführende Gremium. TODO: Eigenschaft für federführendes Gremium ergänzen und dann Ordnung entfernen.
	 * invers zur Eigenschaft `meeting` der Klasse `oparl:Organization`.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Organization()
	 * @see de.oklab.leipzig.oparl.Organization#getMeeting
	 * @model opposite="meeting"
	 * @generated
	 */
	EList<Organization> getOrganization();

	/**
	 * Returns the value of the '<em><b>Chair Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorsitz der Sitzung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chair Person</em>' reference.
	 * @see #setChairPerson(Person)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_ChairPerson()
	 * @model
	 * @generated
	 */
	Person getChairPerson();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getChairPerson <em>Chair Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chair Person</em>' reference.
	 * @see #getChairPerson()
	 * @generated
	 */
	void setChairPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Scribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schriftführer, Protokollant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scribe</em>' reference.
	 * @see #setScribe(Person)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Scribe()
	 * @model
	 * @generated
	 */
	Person getScribe();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getScribe <em>Scribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scribe</em>' reference.
	 * @see #getScribe()
	 * @generated
	 */
	void setScribe(Person value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Teilnehmer der Sitzung. Bei einer Sitzung in der Zukunft sind dies die geladenen Teilnehmer, bei einer
	 * stattgefundenen Sitzung SOLL die Liste nur diejenigen Teilnehmer umfassen, die tatsächlich an der Sitzung
	 * teilgenommen haben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Participant()
	 * @model
	 * @generated
	 */
	EList<Person> getParticipant();

	/**
	 * Returns the value of the '<em><b>Invitation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.InvitationFile#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einladungsdokument zur Sitzung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invitation</em>' containment reference.
	 * @see #setInvitation(InvitationFile)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Invitation()
	 * @see de.oklab.leipzig.oparl.InvitationFile#getMeeting
	 * @model opposite="meeting" containment="true"
	 * @generated
	 */
	InvitationFile getInvitation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getInvitation <em>Invitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invitation</em>' containment reference.
	 * @see #getInvitation()
	 * @generated
	 */
	void setInvitation(InvitationFile value);

	/**
	 * Returns the value of the '<em><b>Results Protocol</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.ResultsProtocol#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergebnisprotokoll zur Sitzung. Diese Eigenschaft kann selbstverständlich erst nachdem Stattfinden der Sitzung
	 * vorkommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results Protocol</em>' containment reference.
	 * @see #setResultsProtocol(ResultsProtocol)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_ResultsProtocol()
	 * @see de.oklab.leipzig.oparl.ResultsProtocol#getMeeting
	 * @model opposite="meeting" containment="true"
	 * @generated
	 */
	ResultsProtocol getResultsProtocol();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getResultsProtocol <em>Results Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Protocol</em>' containment reference.
	 * @see #getResultsProtocol()
	 * @generated
	 */
	void setResultsProtocol(ResultsProtocol value);

	/**
	 * Returns the value of the '<em><b>Verbatim Protocol</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.VerbatimProtocol#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wortprotokoll zur Sitzung. Diese Eigenschaft kann selbstverständlich erst nach dem Stattfinden der Sitzung
	 * vorkommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbatim Protocol</em>' containment reference.
	 * @see #setVerbatimProtocol(VerbatimProtocol)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_VerbatimProtocol()
	 * @see de.oklab.leipzig.oparl.VerbatimProtocol#getMeeting
	 * @model opposite="meeting" containment="true"
	 * @generated
	 */
	VerbatimProtocol getVerbatimProtocol();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getVerbatimProtocol <em>Verbatim Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbatim Protocol</em>' containment reference.
	 * @see #getVerbatimProtocol()
	 * @generated
	 */
	void setVerbatimProtocol(VerbatimProtocol value);

	/**
	 * Returns the value of the '<em><b>Auxiliary File</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dateianhang zur Sitzung. Hiermit sind Dateien gemeint, die üblicherweise mit der Einladung zu einer Sitzung
	 * verteilt werden, und die nicht bereits über einzelne Tagesordnungspunkte referenziert sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auxiliary File</em>' containment reference.
	 * @see #setAuxiliaryFile(AuxiliaryFile)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_AuxiliaryFile()
	 * @see de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting
	 * @model opposite="meeting" containment="true"
	 * @generated
	 */
	AuxiliaryFile getAuxiliaryFile();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile <em>Auxiliary File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary File</em>' containment reference.
	 * @see #getAuxiliaryFile()
	 * @generated
	 */
	void setAuxiliaryFile(AuxiliaryFile value);

	/**
	 * Returns the value of the '<em><b>Agenda Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.AgendaItem}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItem#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tagesordnungspunkte der Sitzung. Die Reihenfolge ist relevant. Es kann Sitzungen ohne TOPs geben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agenda Item</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_AgendaItem()
	 * @see de.oklab.leipzig.oparl.AgendaItem#getMeeting
	 * @model opposite="meeting" containment="true"
	 * @generated
	 */
	EList<AgendaItem> getAgendaItem();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Created()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

} // Meeting
