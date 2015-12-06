/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Tagesordnungspunkte sind die Bestandteile von Sitzungen (`oparl:Meeting`).
 * Jeder Tagesordnungspunkt widmet sich inhaltlich einem bestimmten Thema,
 * wozu in der Regel auch die Beratung bestimmter Drucksachen gehört.
 * 
 * Die Beziehung zwischen einem Tagesordnungspunkt und einer Drucksache wird
 * über ein Objekt vom Typ `oparl:Consultation` hergestellt, das über die
 * Eigenschaft `consultation` referenziert werden kann.
 * 
 * https://github.com/lu-j/oparl-json-schema/blob/master/schema/AgendaItem.json
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getNumber <em>Number</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getResolution <em>Resolution</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#isPublic <em>Public</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getConsultation <em>Consultation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getResult <em>Result</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItem#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem()
 * @model
 * @generated
 */
public interface AgendaItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @NonNull
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getId <em>Id</em>}' attribute.
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
	 * @NonNull
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Sitzung, der der Tagesordnungspunkt zugeordnet ist.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Das Thema des Tagesordnungspunktes.
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
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gliederungs-\"Nummer\" des Tagesordnungspunktes. Eine beliebige Zeichenkette,
	 * wie z. B. \"10.\", \"10.1\", \"C\", \"c)\" o. ä. Die Reihenfolge wird nicht
	 * dadurch, sondern durch die Reihenfolge der TOPs im `agendaItem`-Attribut von
	 * `oparl:Meeting` festgelegt.
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
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls in diesem Tagesordnungspunkt ein Beschluss gefasst wurde,
	 * kann hier ein Text oder eine Datei angegeben werden. Das ist
	 * besonders dann in der Praxis relevant, wenn der gefasste Beschluss
	 * (z. B. durch Änderungsantrag) von der Beschlussvorlage abweicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Resolution()
	 * @model unique="false"
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary File</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Dateianhänge zum Tagesordnungspunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auxiliary File</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_AuxiliaryFile()
	 * @model
	 * @generated
	 */
	EList<File> getAuxiliaryFile();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzeichnet, ob der Tagesordnungspunkt zur Behandlung in öffentlicher
	 * Sitzung vorgesehen ist/war. Es wird ein Wahrheitswert (`true` oder `false`)
	 * erwartet.
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
	 *  Beratung, die diesem Tagesordnungspunkt zugewiesen ist.
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
	 *  Kategorische Information darüber, welches Ergebnis die Beratung des
	 * Tagesordnungspunktes erbracht hat, in der Bedeutung etwa
	 * \"Unverändert beschlossen\" oder \"Geändert beschlossen\". Diese
	 * Eigenschaft  funktioniert wie in
	 * [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung)
	 * beschrieben entweder als URL zu einem `skos:Concept` oder als String.
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
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Created()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getCreated <em>Created</em>}' attribute.
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItem_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItem#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

} // AgendaItem
