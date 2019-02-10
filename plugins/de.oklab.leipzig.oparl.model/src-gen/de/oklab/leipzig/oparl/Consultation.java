/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consultation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Der Objekttyp {@link Consultation} dient dazu, die Beratung einer Drucksache
 * ({@link Paper}) in einer Sitzung abzubilden. Dabei ist es nicht entscheidend,
 * ob diese Beratung in der Vergangenheit stattgefunden hat oder diese für die
 * Zukunft geplant ist.
 * </p><p>
 * Die Gesamtheit aller Objekte des Typs {@link Consultation} zu einer bestimmten
 * Drucksache bildet das ab, was in der Praxis als "Beratungsfolge" der
 * Drucksache bezeichnet wird.
 * </p>
 * <p>Beispiel:
 * <pre>
 *        {
 *            "id": "https://oparl.example.org/consultation/47594",
 *            "type": "https://oparl.org/schema/1.0/Consultation",
 *            "agendaItem": "https://oparl.example.org/agendaitem/15569",
 *            "meeting": "https://oparl.example.org/meeting/243",
 *            "organization": "https://oparl.example.org/organization/96",
 *            "authoritative": false,
 *            "role": "Beschlussfassung"
 *        }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#isAuthoritative <em>Authoritative</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation()
 * @model
 * @generated
 */
public interface Consultation extends InnerOParlElement {
	/**
	 * Returns the value of the '<em><b>Paper</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getConsultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückreferenz auf das Paper, welches nur dann ausgegeben wird, wenn das
	 * Consultation-Objekt einzeln abgerufen ist, d.h. nicht Teil einer internen
	 * Ausgabe ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper</em>' container reference.
	 * @see #setPaper(Paper)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Paper()
	 * @see de.oklab.leipzig.oparl.Paper#getConsultation
	 * @model opposite="consultation" transient="false"
	 * @generated
	 */
	Paper getPaper();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paper</em>' container reference.
	 * @see #getPaper()
	 * @generated
	 */
	void setPaper(Paper value);

	/**
	 * Returns the value of the '<em><b>Agenda Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItem#getConsultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Tagesordnungspunkt, unter dem die Drucksache beraten wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agenda Item</em>' reference.
	 * @see #setAgendaItem(AgendaItem)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_AgendaItem()
	 * @see de.oklab.leipzig.oparl.AgendaItem#getConsultation
	 * @model opposite="consultation"
	 * @generated
	 */
	AgendaItem getAgendaItem();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getAgendaItem <em>Agenda Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda Item</em>' reference.
	 * @see #getAgendaItem()
	 * @generated
	 */
	void setAgendaItem(AgendaItem value);

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Sitzung, in der die Drucksache beraten wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meeting</em>' reference.
	 * @see #setMeeting(Meeting)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Meeting()
	 * @model
	 * @generated
	 */
	Meeting getMeeting();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getMeeting <em>Meeting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting</em>' reference.
	 * @see #getMeeting()
	 * @generated
	 */
	void setMeeting(Meeting value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Gremium, in dem die Drucksache beraten wird. Hier kann auch eine mit Liste
	 * von Gremien angegeben werden (die verschiedenen {@link Body} und
	 * {@link System} angehören können). Die Liste ist dann geordnet.
	 * Das erste Gremium der Liste ist federführend.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Organization()
	 * @model
	 * @generated
	 */
	EList<Organization> getOrganization();

	/**
	 * Returns the value of the '<em><b>Authoritative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Drückt aus, ob bei dieser Beratung ein Beschluss zu der Drucksache gefasst
	 * wird (<pre>true</pre>) wird oder nicht (<pre>false</pre>).
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authoritative</em>' attribute.
	 * @see #setAuthoritative(boolean)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Authoritative()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAuthoritative();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#isAuthoritative <em>Authoritative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authoritative</em>' attribute.
	 * @see #isAuthoritative()
	 * @generated
	 */
	void setAuthoritative(boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rolle oder Funktion der Beratung. Zum Beispiel Anhörung, Entscheidung,
	 * Kenntnisnahme, Vorberatung usw.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 * @generated
	 */
	String getType();

} // Consultation
