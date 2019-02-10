/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * <p>
 * Jede natürliche Person, die in der parlamentarischen Arbeit tätig und insbesondere Mitglied in einer Gruppierung
 * {@link Organization} ist, wird mit einem Objekt vom Typ {@link Personn} abgebildet.
 * </p>
 * <p>Beispiel:
 * <pre>
 * {
 *  "id": "https://oparl.example.org/person/29",
 *  "type": "https://oparl.org/schema/1.0/Person",
 *  "body": "https://oparl.example.org/body/0",
 *  "name": "Prof. Dr. Max Mustermann",
 *  "familyName": "Mustermann",
 *  "givenName": "Max",
 *  "title": [
 *      "Prof.",
 *      "Dr."
 *  ],
 *  "formOfAddress": "Ratsfrau",
 *  "gender": "male",
 *  "email": "max@mustermann.de",
 *  "phone": "+493012345678",
 *  "streetAddress": "Musterstraße 5",
 *  "postalCode": "11111",
 *  "locality": "Musterort",
 *  "status": [
 *      "Bezirksbürgermeister"
 *  ],
 *  "membership": [
 *      {
 *          "id": "https://oparl.example.org/memberships/385",
 *          "type": "https://oparl.org/schema/1.0/Membership",
 *          "organization": "https://oparl.example.org/organizations/5",
 *          "role": "Vorsitzende",
 *          "votingRight": true,
 *          "startDate": "2013-12-03T16:30:00+01:00"
 *      },
 *      {
 *          "id": "https://oparl.example.org/memberships/693",
 *          "type": "https://oparl.org/schema/1.0/Membership",
 *          "organization": "https://oparl.example.org/organizations/9",
 *          "role": "Sachkundige Bürgerin",
 *          "votingRight": false,
 *          "startDate": "2013-12-03T16:30:00+01:00",
 *          "endDate": "2014-07-28T00:00:00+02:00"
 *      }
 *  ],
 *  "created": "2011-11-11T11:11:00+01:00",
 *  "modified": "2012-08-16T14:05:27+02:00"
 * }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getFormOfAddress <em>Form Of Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getAffix <em>Affix</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getTitle <em>Title</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getSubLocality <em>Sub Locality</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getStatus <em>Status</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getLife <em>Life</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getLifeSource <em>Life Source</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends PersonOrOrganization {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Körperschaft, zu der die Person gehört.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' container reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Body()
	 * @see de.oklab.leipzig.oparl.Body#getPerson
	 * @model opposite="person" transient="false"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' container reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Familienname bzw. Nachname.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_FamilyName()
	 * @model unique="false"
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Vorname bzw. Taufname.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_GivenName()
	 * @model unique="false"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Form Of Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Anrede.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Of Address</em>' attribute.
	 * @see #setFormOfAddress(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_FormOfAddress()
	 * @model unique="false"
	 * @generated
	 */
	String getFormOfAddress();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getFormOfAddress <em>Form Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Of Address</em>' attribute.
	 * @see #getFormOfAddress()
	 * @generated
	 */
	void setFormOfAddress(String value);

	/**
	 * Returns the value of the '<em><b>Affix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Namenszusatz (z.B. jun. oder MdL.)
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affix</em>' attribute.
	 * @see #setAffix(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Affix()
	 * @model unique="false"
	 * @generated
	 */
	String getAffix();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getAffix <em>Affix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affix</em>' attribute.
	 * @see #getAffix()
	 * @generated
	 */
	void setAffix(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Akademische Titel
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Title()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTitle();

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Geschlecht. Empfohlene Werte sind <pre>female</pre>, <pre>male</pre> und <pre>other</pre>. Für den Fall,
	 * dass das Geschlecht der Person unbekannt ist, sollte die Eigenschaft nicht ausgegeben werden.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see #setGender(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Gender()
	 * @model unique="false"
	 * @generated
	 */
	String getGender();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see #getGender()
	 * @generated
	 */
	void setGender(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Telefonnummern der Person.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phone</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Phone()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPhone();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * E-Mail-Adressen der Person.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Email()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEmail();

	/**
	 * Returns the value of the '<em><b>Sub Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Untergeordnete Ortsangabe der Kontakt-Anschrift der Person,
	 * z.B. Stadtbezirk, Ortsteil oder Dorf.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Locality</em>' attribute.
	 * @see #setSubLocality(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_SubLocality()
	 * @model unique="false"
	 * @generated
	 */
	String getSubLocality();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getSubLocality <em>Sub Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Locality</em>' attribute.
	 * @see #getSubLocality()
	 * @generated
	 */
	void setSubLocality(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Referenz der Kontakt-Anschrift der Person.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Status, d.h. Rollen in der Kommune.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Status()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStatus();

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Membership}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Mitgliedschaften der Person in Gruppierungen, z. B. Gremien und
	 * Fraktionen. Es <b>sollen</b> sowohl aktuelle als auch vergangene
	 * Mitgliedschaften angegeben werden
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Membership()
	 * @see de.oklab.leipzig.oparl.Membership#getPerson
	 * @model opposite="person" containment="true"
	 * @generated
	 */
	EList<Membership> getMembership();

	/**
	 * Returns the value of the '<em><b>Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Kurzer Informationstext zur Person. Eine Länge von weniger als
	 * 300 Zeichen ist <b>empfohlen</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life</em>' attribute.
	 * @see #setLife(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Life()
	 * @model unique="false"
	 * @generated
	 */
	String getLife();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getLife <em>Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life</em>' attribute.
	 * @see #getLife()
	 * @generated
	 */
	void setLife(String value);

	/**
	 * Returns the value of the '<em><b>Life Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Angabe der Quelle, aus der die Informationen für {@link Person#life} stammen.
	 * Bei Angabe von {@link Person#life} ist diese Eigenschaft empfohlen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Life Source</em>' attribute.
	 * @see #setLifeSource(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_LifeSource()
	 * @model unique="false"
	 * @generated
	 */
	String getLifeSource();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getLifeSource <em>Life Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Source</em>' attribute.
	 * @see #getLifeSource()
	 * @generated
	 */
	void setLifeSource(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Der vollständige Name der Person mit akademischem Grad und dem gebräuchlichen Vornamen, wie er zur Anzeige
	 * durch den Client genutzt werden kann.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Straße und Hausnummer der Kontakt-Anschrift der Person.
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
	 * Postleitzahl der Kontakt-Anschrift der Person.
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
	 * Ortsangabe der Kontakt-Anschrift der Person.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getLocality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 * @generated
	 */
	String getType();

} // Person
