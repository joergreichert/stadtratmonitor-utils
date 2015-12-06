/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consultation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Der Objekttyp `oparl:Consultation` dient dazu, die Beratung einer Drucksache ([`oparl:Paper`](#oparl_paper)) in
 * einer Sitzung abzubilden. Dabei ist es nicht entscheidend, ob diese Beratung in der Vergangenheit stattgefunden hat
 * oder diese für die Zukunft geplant ist.\n\nDie Gesamtheit aller Objekte des Typs `oparl:Consultation` zu einer
 * bestimmten Drucksache bildet das ab, was in der Praxis als \"Beratungsfolge\" der Drucksache bezeichnet wird.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#isAuthoritative <em>Authoritative</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getRole <em>Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Consultation#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation()
 * @model
 * @generated
 */
public interface Consultation extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Consultation$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Paper</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getConsultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paper</em>' reference.
	 * @see #setPaper(Paper)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Paper()
	 * @see de.oklab.leipzig.oparl.Paper#getConsultation
	 * @model opposite="consultation"
	 * @generated
	 */
	Paper getPaper();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paper</em>' reference.
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
	 *  Tagesordnungspunkt, unter dem die Drucksache beraten wird.
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
	 * Returns the value of the '<em><b>Organization</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gremium, dem die Sitzung zugewiesen ist, zu welcher der zuvor genannte Tagesordnungspunkt gehört. Hier kann
	 * auch eine mit Liste von Gremien angegeben werden (die verschiedenen `oparl:Body` und `oparl:System` angehören
	 * können). Die Liste ist dann geordnet. Das erste Gremium der Liste ist federführend.
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
	 *  Drückt aus, ob bei dieser Beratung ein Beschluss zu der Drucksache gefasst wird (`true`) wird oder nicht (`false`).
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
	 * Rolle oder Funktion der Beratung. Zum Beispiel Anhörung, Entscheidung, Kenntnisnahme, Vorberatung usw. Diese
	 * Eigenschaft funktioniert wie in  [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung) beschrieben
	 * entweder als String oder als URL zu einem `skos:Concept` Objekt.
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
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getConsultation_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

} // Consultation
