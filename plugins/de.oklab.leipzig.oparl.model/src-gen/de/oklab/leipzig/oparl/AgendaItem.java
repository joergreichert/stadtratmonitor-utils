/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Tagesordnungspunkte sind die Bestandteile von Sitzungen {@link Meeting}.
 * Jeder Tagesordnungspunkt widmet sich inhaltlich einem bestimmten Thema,
 * wozu in der Regel auch die Beratung bestimmter Drucksachen gehört.
 * </p><p>
 * Die Beziehung zwischen einem Tagesordnungspunkt und einer Drucksache wird
 * über ein Objekt vom Typ {@link Consultation} hergestellt, das über die
 * Eigenschaft consultation referenziert werden kann.
 * </p>
 * <p>Beispiel:
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
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getNumber <em>Number</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#isPublic <em>Public</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getConsultation <em>Consultation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getResult <em>Result</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionText <em>Resolution Text</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionFile <em>Resolution File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getStart <em>Start</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem()
 * @model
 * @generated
 */
public interface AgendaItem extends InnerOParlElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Das Thema des Tagesordnungspunktes.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückreferenz auf das Meeting, welches nur dann ausgegeben wird,
	 * wenn das agendaItem-Objekt einzeln abgerufen ist, d.h. nicht Teil
	 * einer internen Ausgabe ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meeting</em>' container reference.
	 * @see #setMeeting(Meeting)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Meeting()
	 * @see de.oklab.leipzig.oparl.Meeting#getAgendaItem
	 * @model opposite="agendaItem" transient="false"
	 * @generated
	 */
	Meeting getMeeting();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getMeeting <em>Meeting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting</em>' container reference.
	 * @see #getMeeting()
	 * @generated
	 */
	void setMeeting(Meeting value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Gliederungs-"Nummer" des Tagesordnungspunktes. Eine beliebige Zeichenkette,
	 * wie z. B. "10.", "10.1", "C", "c)" o. ä. Die Reihenfolge wird nicht dadurch,
	 * sondern durch die Reihenfolge der TOPs im
	 * {@link AgendaItem#agendaItem}-Attribut von {@link Meeting} festgelegt.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Number()
	 * @model unique="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Kennzeichnet, ob der Tagesordnungspunkt zur Behandlung in öffentlicher
	 * Sitzung vorgesehen ist/war. Es wird ein Wahrheitswert (<pre>true</pre>
	 * oder <pre>false</pre>) erwartet.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Public()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Consultation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Consultation#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Beratung, die diesem Tagesordnungspunkt zugewiesen ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consultation</em>' reference.
	 * @see #setConsultation(Consultation)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Consultation()
	 * @see de.oklab.leipzig.oparl.Consultation#getAgendaItem
	 * @model opposite="agendaItem"
	 * @generated
	 */
	Consultation getConsultation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getConsultation <em>Consultation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consultation</em>' reference.
	 * @see #getConsultation()
	 * @generated
	 */
	void setConsultation(Consultation value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Kategorische Information darüber, welches Ergebnis die Beratung des
	 * Tagesordnungspunktes erbracht hat, in der Bedeutung etwa
	 * "Unverändert beschlossen" oder "Geändert beschlossen".
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Result()
	 * @model unique="false"
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Resolution Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Falls in diesem Tagesordnungspunkt ein Beschluss gefasst wurde,
	 * kann hier ein Text angegeben werden. Das ist besonders dann in der
	 * Praxis relevant, wenn der gefasste Beschluss (z. B. durch
	 * Änderungsantrag) von der Beschlussvorlage abweicht.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Text</em>' attribute.
	 * @see #setResolutionText(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_ResolutionText()
	 * @model unique="false"
	 * @generated
	 */
	String getResolutionText();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionText <em>Resolution Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Text</em>' attribute.
	 * @see #getResolutionText()
	 * @generated
	 */
	void setResolutionText(String value);

	/**
	 * Returns the value of the '<em><b>Resolution File</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Falls in diesem Tagesordnungspunkt ein Beschluss gefasst wurde,
	 * kann hier eine Datei angegeben werden. Das ist besonders dann in der
	 * Praxis relevant, wenn der gefasste Beschluss (z. B. durch Änderungsantrag)
	 * von der Beschlussvorlage abweicht.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution File</em>' containment reference.
	 * @see #setResolutionFile(AgendaItemResolutionFile)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_ResolutionFile()
	 * @see de.oklab.leipzig.oparl.AgendaItemResolutionFile#getAgendaItem
	 * @model opposite="agendaItem" containment="true"
	 * @generated
	 */
	AgendaItemResolutionFile getResolutionFile();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionFile <em>Resolution File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution File</em>' containment reference.
	 * @see #getResolutionFile()
	 * @generated
	 */
	void setResolutionFile(AgendaItemResolutionFile value);

	/**
	 * Returns the value of the '<em><b>Auxiliary File</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Dateianhänge zum Tagesordnungspunkt.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auxiliary File</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_AuxiliaryFile()
	 * @see de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAgendaItem
	 * @model opposite="agendaItem" containment="true"
	 * @generated
	 */
	EList<AgendaItemAuxiliaryFile> getAuxiliaryFile();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Datum und Uhrzeit des Anfangszeitpunkts des Tagesordnungspunktes.
	 * Bei zukünftigen Tagesordnungspunkten ist dies der geplante Zeitpunkt,
	 * bei einem stattgefundenen <b>kann</b> es der tatsächliche Startzeitpunkt
	 * sein.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Start()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getStart <em>Start</em>}' attribute.
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
	 * Endzeitpunkt des Tagesordnungspunktes als Datum/Uhrzeit.
	 * Bei zukünftigen Tagesordnungspunkt ist dies der geplante Zeitpunkt,
	 * bei einer stattgefundenen <b>kann</b> es der tatsächliche Endzeitpunkt sein.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_End()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 * @generated
	 */
	String getType();

} // AgendaItem
