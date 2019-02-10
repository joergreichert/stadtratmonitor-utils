/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Dieser Objekttyp dient dazu, Gruppierungen von Personen abzubilden, die in der parlamentarischen Arbeit eine
 * Rolle spielen. Dazu zählen in der Praxis insbesondere Fraktionen und Gremien.
 * </p>
 * <p>
 * Beispiel:
 * <pre>
 * {
 *   "id": "https://oparl.example.org/organization/34",
 *   "type": "https://oparl.org/schema/1.0/Organization",
 *   "body": "https://oparl.example.org/bodies/1",
 *   "name": "Ausschuss für Haushalt und Finanzen",
 *   "shortName": "Finanzausschuss",
 *   "startDate": "2012-07-17T00:00:00+02:00",
 *   "organizationType": "Gremium",
 *   "post": [
 *       "Vorsitzender",
 *       "1. Stellvertreter",
 *       "Mitglied"
 *   ],
 *   "meeting": [
 *       "https://oparl.example.org/meeting/27",
 *       "https://oparl.example.org/meeting/36",
 *       "https://oparl.example.org/meeting/45",
 *       "https://oparl.example.org/meeting/53",
 *       "https://oparl.example.org/meeting/63",
 *       "https://oparl.example.org/meeting/72",
 *       "https://oparl.example.org/meeting/81",
 *       "https://oparl.example.org/meeting/92",
 *       "https://oparl.example.org/meeting/101",
 *       "https://oparl.example.org/meeting/111",
 *       "https://oparl.example.org/meeting/120",
 *       "https://oparl.example.org/meeting/133"
 *   ],
 *   "membership": [
 *       "https://oparl.example.org/memberships/27",
 *       "https://oparl.example.org/memberships/48",
 *       "https://oparl.example.org/memberships/57"
 *   ],
 *   "classification": "Ausschuss",
 *   "keyword": [
 *       "finanzen",
 *       "haushalt"
 *   ],
 *   "created": "2012-07-16T16:01:44+02:00",
 *   "modified": "2012-08-16T14:05:27+02:00"
 * }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getPost <em>Post</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getSubOrganizationOf <em>Sub Organization Of</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getOrganizationType <em>Organization Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getRoom <em>Room</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends PersonOrOrganization {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Körperschaft, zu der diese Gruppierung gehört.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' container reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Body()
	 * @see de.oklab.leipzig.oparl.Body#getOrganization
	 * @model opposite="organization" transient="false"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' container reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Membership}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Mitgliedschaften dieser Gruppierung.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Membership()
	 * @see de.oklab.leipzig.oparl.Membership#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Membership> getMembership();

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.MeetingOrganization}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.MeetingOrganization#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * URL auf eine externe Objektliste mit den Sitzungen dieser Gruppierung. Invers zur Eigenschaft organization
	 * der Klasse oparl:Meeting
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meeting</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Meeting()
	 * @see de.oklab.leipzig.oparl.MeetingOrganization#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<MeetingOrganization> getMeeting();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Positionen, die für diese Gruppierung vorgesehen sind.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Post()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPost();

	/**
	 * Returns the value of the '<em><b>Sub Organization Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * URL der übergeordneten Gruppierung.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Organization Of</em>' reference.
	 * @see #setSubOrganizationOf(Organization)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_SubOrganizationOf()
	 * @model
	 * @generated
	 */
	Organization getSubOrganizationOf();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getSubOrganizationOf <em>Sub Organization Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Organization Of</em>' reference.
	 * @see #getSubOrganizationOf()
	 * @generated
	 */
	void setSubOrganizationOf(Organization value);

	/**
	 * Returns the value of the '<em><b>Organization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Grobe Kategorisierung der Gruppierung. Mögliche Werte sind "Gremium", "Partei", "Fraktion",
	 * "Verwaltungsbereich", "externes Gremium", "Institution" und "Sonstiges".
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Type</em>' attribute.
	 * @see #setOrganizationType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_OrganizationType()
	 * @model unique="false"
	 * @generated
	 */
	String getOrganizationType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getOrganizationType <em>Organization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Type</em>' attribute.
	 * @see #getOrganizationType()
	 * @generated
	 */
	void setOrganizationType(String value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Die Art der Gruppierung. In Frage kommen z.B. "Parlament", "Ausschuss", "Beirat", "Projektbeirat",
	 * "Kommission", "AG", "Verwaltungsrat", "Fraktion" oder "Partei". Die Angabe <b>sollte</b> möglichst
	 * präzise erfolgen. Außerdem <b>sollten</b> Abkürzungen vermieden werden. Für die höchste demokratische
	 * Instanz in der Kommune <b>sollte</b> immer der Begriff "Parlament" verwendet werden, nicht "Rat" oder
	 * "Hauptausschuss".
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Classification()
	 * @model unique="false"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Gründungsdatum der Gruppierung. Kann z. B. das Datum der konstituierenden Sitzung sein.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_StartDate()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Datum des letzten Tages der Existenz der Gruppierung.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_EndDate()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Allgemeine Website der Gruppierung.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Website()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Raum, in dem die Organization beheimatet ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Room()
	 * @model unique="false"
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.OrganizationLocation#getOrganziation <em>Organziation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Ort, an dem die Körperschaft beheimatet ist. Wenn möglich die Stadtgrenzen, ansonsten die Stadtmitte.
	 * (Die Ortsangabe kann sowohl über diese Eigenschaft, als auch über die vorangegangenen Einzeleigenschaften
	 * erfolgen, sollte aber übereinstimmen, falls beide Ausgabeoptionen genutzt werden.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(OrganizationLocation)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Location()
	 * @see de.oklab.leipzig.oparl.OrganizationLocation#getOrganziation
	 * @model opposite="organziation" containment="true"
	 * @generated
	 */
	OrganizationLocation getLocation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(OrganizationLocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Straße und Hausnummer der Organization.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Postleitzahl der Organization.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Ortsangabe der Organization.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getLocality();

} // Organization
