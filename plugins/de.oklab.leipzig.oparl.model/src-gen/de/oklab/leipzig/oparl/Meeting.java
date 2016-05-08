/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Eine Sitzung ist die Versammlung einer oder mehrerer Gruppierungen
 * {@link Organization} zu einem bestimmten Zeitpunkt an einem bestimmten Ort.
 * </p><p>
 * Die geladenen Teilnehmer der Sitzung sind jeweils als Objekte vom Typ
 * {@link Person} in entsprechender Form referenziert. Verschiedene Dateien
 * (Einladung, Ergebnis- und Wortprotokoll, sonstige Anlagen) können
 * referenziert werden.
 * </p><p>
 * Die Inhalte einer Sitzung werden durch Tagesordnungspunkte
 * {@link AgendaItem} abgebildet.
 * </p>
 * <p>Beispiel:
 * {
 *   "id": "https://oparl.example.org/meeting/281",
 *   "type": "https://oparl.org/schema/1.0/Meeting",
 *   "name": "4. Sitzung des Finanzausschusses",
 *   "start": "2013-01-04T08:00:00+01:00",
 *   "end": "2013-01-04T12:00:00+01:00",
 *   "room": "Sitzungsraum 204",
 *   "streetAddress": "Musterstraße 5",
 *   "postalCode": "11111",
 *   "locality": "Musterort",
 *   "organization": [
 *       "https://oparl.example.org/organization/34"
 *   ],
 *   "invitation": {
 *       "id": "https://oparl.example.org/files/57739",
 *       "type": "https://oparl.org/schema/1.0/File",
 *       "name": "Einladung",
 *       "fileName": "einladung.pdf",
 *       "mimeType": "application/pdf",
 *       "date": "2012-01-08T14:05:27+01:00",
 *       "modified": "2012-01-08T14:05:27+01:00",
 *       "sha1Checksum": "da39a3ee5e6b4b0d3255bfef95601890afd80709",
 *       "size": 82930,
 *       "accessUrl": "https://oparl.example.org/files/57739.pdf",
 *       "downloadUrl": "https://oparl.example.org/files/download/57739.pdf"
 *   },
 *   "resultsProtocol": {
 *       "id": "https://oparl.example.org/files/57739",
 *       "type": "https://oparl.org/schema/1.0/File",
 *       "name": "Protokoll",
 *       "fileName": "protokoll.pdf",
 *       "mimeType": "application/pdf",
 *       "date": "2012-01-08T14:05:27+01:00",
 *       "modified": "2012-01-08T14:05:27+01:00",
 *       "sha1Checksum": "da39a3ee5e6b4b0d3255bfef95601890afd80709",
 *       "size": 82930,
 *       "accessUrl": "https://oparl.example.org/files/57739.pdf",
 *       "downloadUrl": "https://oparl.example.org/files/download/57739.pdf"
 *   },
 *   "verbatimProtocol": {
 *       "id": "https://oparl.example.org/files/57739",
 *       "type": "https://oparl.org/schema/1.0/File",
 *       "name": "Wortprotokoll",
 *       "fileName": "wortprotokoll.pdf",
 *       "mimeType": "application/pdf",
 *       "date": "2012-01-08T14:05:27+01:00",
 *       "modified": "2012-01-08T14:05:27+01:00",
 *       "sha1Checksum": "da39a3ee5e6b4b0d3255bfef95601890afd80709",
 *       "size": 82930,
 *       "accessUrl": "https://oparl.example.org/files/57739.pdf",
 *       "downloadUrl": "https://oparl.example.org/files/download/57739.pdf"
 *   },
 *   "auxiliaryFile": [
 *       {
 *           "id": "https://oparl.example.org/files/57739",
 *           "type": "https://oparl.org/schema/1.0/File",
 *           "name": "Nachtrags-Tagesordnung",
 *           "fileName": "nachtrag-TO.pdf",
 *           "mimeType": "application/pdf",
 *           "date": "2012-01-08T14:05:27+01:00",
 *           "modified": "2012-01-08T14:05:27+01:00",
 *           "sha1Checksum": "da39a3ee5e6b4b0d3255bfef95601890afd80709",
 *           "size": 82930,
 *           "accessUrl": "https://oparl.example.org/files/57739.pdf",
 *           "downloadUrl": "https://oparl.example.org/files/download/57739.pdf"
 *       }
 *   ],
 *   "agendaItem": [
 *       {
 *           "id": "https://oparl.example.org/agendaitem/3271",
 *           "type": "https://oparl.org/schema/1.0/AgendaItem",
 *           "meeting": "https://oparl.example.org/meeting/281",
 *           "number": "10.1",
 *           "name": "Satzungsänderung für Ausschreibungen",
 *           "public": true,
 *           "consultation": "https://oparl.example.org/consultation/1034",
 *           "result": "Geändert beschlossen",
 *           "resolution": "Der Beschluss weicht wie folgt vom Antrag ab: ...",
 *           "modified": "2012-08-16T14:05:27+02:00"
 *       }
 *   ],
 *   "created": "2012-01-06T12:01:00+01:00",
 *   "modified": "2012-01-08T14:05:27+01:00"
 * }
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getMeetingState <em>Meeting State</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#isCancelled <em>Cancelled</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getStart <em>Start</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getEnd <em>End</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getRoom <em>Room</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getInvitation <em>Invitation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getResultsProtocol <em>Results Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getVerbatimProtocol <em>Verbatim Protocol</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Meeting#getAgendaItem <em>Agenda Item</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting()
 * @model
 * @generated
 */
public interface Meeting extends AddressableOParlElement {
    /**
     * Returns the value of the '<em><b>Meeting State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Aktueller Status der Sitzung. <b>Empfohlen</b> ist die Verwendung von
     * <pre>terminiert</pre> (geplant), <pre>eingeladen</pre> (vor der Sitzung
     * bis zur Freigabe des Protokolls) und <pre>durchgeführt</pre>
     * (nach Freigabe des Protokolls).
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Meeting State</em>' attribute.
     * @see #setMeetingState(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_MeetingState()
     * @model unique="false"
     * @generated
     */
    String getMeetingState();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getMeetingState <em>Meeting State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meeting State</em>' attribute.
     * @see #getMeetingState()
     * @generated
     */
    void setMeetingState(String value);

    /**
     * Returns the value of the '<em><b>Cancelled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Wenn die Sitzung ausfällt, wird cancelled auf true gesetzt.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cancelled</em>' attribute.
     * @see #setCancelled(boolean)
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Cancelled()
     * @model unique="false"
     * @generated
     */
    boolean isCancelled();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#isCancelled <em>Cancelled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cancelled</em>' attribute.
     * @see #isCancelled()
     * @generated
     */
    void setCancelled(boolean value);

    /**
     * Returns the value of the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Datum und Uhrzeit des Anfangszeitpunkts der Sitzung. Bei einer zukünftigen
     * Sitzung ist dies der geplante Zeitpunkt, bei einer stattgefundenen
     * <b>kann</b> es der tatsächliche Startzeitpunkt sein.
     * </p>
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
     *  <p>
     * Endzeitpunkt der Sitzung als Datum/Uhrzeit. Bei einer zukünftigen Sitzung
     * ist dies der geplante Zeitpunkt, bei einer stattgefundenen <b>kann</b> es
     * der tatsächliche Endzeitpunkt sein.
     * </p>
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
     * Returns the value of the '<em><b>Room</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Raum, in dem die Sitzung stattfindet.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Room</em>' attribute.
     * @see #setRoom(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Room()
     * @model unique="false"
     * @generated
     */
    String getRoom();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getRoom <em>Room</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Room</em>' attribute.
     * @see #getRoom()
     * @generated
     */
    void setRoom(String value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.MeetingLocation#getMeeting <em>Meeting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Sitzungsort in Form von Geodaten.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Location</em>' containment reference.
     * @see #setLocation(MeetingLocation)
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Location()
     * @see de.oklab.leipzig.oparl.MeetingLocation#getMeeting
     * @model opposite="meeting" containment="true"
     * @generated
     */
    MeetingLocation getLocation();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Meeting#getLocation <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' containment reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(MeetingLocation value);

    /**
     * Returns the value of the '<em><b>Organization</b></em>' reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.MeetingOrganization}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.MeetingOrganization#getMeeting <em>Meeting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Gruppierungen, denen die Sitzung zugeordnet ist. Im Regelfall wird hier
     * eine Gruppierung verknüpft sein, es kann jedoch auch gemeinsame Sitzungen
     * mehrerer Gruppierungen geben. Das erste Element ist dann das
     * federführende Gremium.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Organization</em>' reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_Organization()
     * @see de.oklab.leipzig.oparl.MeetingOrganization#getMeeting
     * @model opposite="meeting"
     * @generated
     */
    EList<MeetingOrganization> getOrganization();

    /**
     * Returns the value of the '<em><b>Participant</b></em>' reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Person}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Personen, die an der Sitzung teilgenommen haben (d.h. nicht nur die
     * eingeladenen Personen, sondern die tatsächlich anwesenden). Diese
     * Eigenschaft kann selbstverständlich erst nach dem Stattfinden der
     * Sitzung vorkommen.
     * </p>
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
     *  <p>
     * Einladungsdokument zur Sitzung.
     * </p>
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
     *  <p>
     * Ergebnisprotokoll zur Sitzung. Diese Eigenschaft kann selbstverständlich
     * erst nachdem Stattfinden der Sitzung vorkommen.
     * </p>
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
     *  <p>
     * Wortprotokoll zur Sitzung. Diese Eigenschaft kann selbstverständlich
     * erst nach dem Stattfinden der Sitzung vorkommen.
     * </p>
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
     * Returns the value of the '<em><b>Auxiliary File</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.AuxiliaryFile}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting <em>Meeting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Dateianhang zur Sitzung. Hiermit sind Dateien gemeint, die
     * üblicherweise mit der Einladung zu einer Sitzung verteilt werden,
     * und die nicht bereits über einzelne Tagesordnungspunkte referenziert sind.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Auxiliary File</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_AuxiliaryFile()
     * @see de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting
     * @model opposite="meeting" containment="true"
     * @generated
     */
    EList<AuxiliaryFile> getAuxiliaryFile();

    /**
     * Returns the value of the '<em><b>Agenda Item</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.AgendaItem}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItem#getMeeting <em>Meeting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Tagesordnungspunkte der Sitzung. Die Reihenfolge ist relevant.
     * Es kann Sitzungen ohne TOPs geben.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Agenda Item</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeeting_AgendaItem()
     * @see de.oklab.leipzig.oparl.AgendaItem#getMeeting
     * @model opposite="meeting" containment="true"
     * @generated
     */
    EList<AgendaItem> getAgendaItem();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"https://oparl.org/schema/1.0/Meeting\";'"
     * @generated
     */
    String getType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Name der Sitzung.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getName();'"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Straße und Hausnummer des Sitzungsortes.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getStreetAddress();'"
     * @generated
     */
    String getStreetAddress();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Postleitzahl des Sitzungsortes.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getPostalCode();'"
     * @generated
     */
    String getPostalCode();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Ortsangabe des Sitzungsortes.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getLocality();'"
     * @generated
     */
    String getLocality();

} // Meeting
