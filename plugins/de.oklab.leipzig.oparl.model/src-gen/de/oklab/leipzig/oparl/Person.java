/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Jede natürliche Person, die in der parlamentarischen Arbeit tätig und insbesondere Mitglied in einer
 * Gruppierung ([oparl:Organization](#oparl_organization)) ist, wird mit einem Objekt vom Typ
 * `oparl:Person` abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getFormOfAddress <em>Form Of Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getTitle <em>Title</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getGender <em>Gender</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getPhone <em>Phone</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getLocality <em>Locality</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getStatus <em>Status</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Person#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends PersonOrOrganization {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Person$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Body()
	 * @see de.oklab.leipzig.oparl.Body#getMember
	 * @model opposite="member"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der vollständige Name der Person mit akademischem Grad und dem gebräuchlichen Vornamen, wie er
	 * zur Anzeige durch den Client genutzt werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Familienname bzw. Nachname.
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
	 *  Vorname bzw. Taufname.
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
	 * Anrede. Diese Eigenschaft funktioniert wie in [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung)
	 * beschrieben entweder als URL zu einem `skos:Concept` oder als String. Der String bzw. `prefLabel` SOLL
	 * sowohl die männliche als auch die weibliche Bezeichnung enthalten. Beispiele: \"Herr | Frau\", \"Ratsherr | Ratsfrau\".
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
	 * Returns the value of the '<em><b>Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Akademische(r) Titel. Vgl. [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung).
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
	 * Geschlecht. Empfohlene Werte sind `female`, `male`, `none` und `other`. Für den Fall, dass das Geschlecht
	 * der Person unbekannt ist, SOLL die Eigenschaft nicht ausgegeben werden. Vgl.
	 * [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung).
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
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Telefonnummer der Person mit `tel:` Schema, ohne Leerzeichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Phone()
	 * @model unique="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  E-Mail-Adresse mit `mailto:` Schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Straße und Hausnummer der Kontakt-Anschrift der Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Address</em>' attribute.
	 * @see #setStreetAddress(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_StreetAddress()
	 * @model unique="false"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getStreetAddress <em>Street Address</em>}' attribute.
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
	 *  Postleitzahl der Kontakt-Anschrift der Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_PostalCode()
	 * @model unique="false"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getPostalCode <em>Postal Code</em>}' attribute.
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
	 *  Ortsangabe der Kontakt-Anschrift der Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' attribute.
	 * @see #setLocality(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Locality()
	 * @model unique="false"
	 * @generated
	 */
	String getLocality();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getLocality <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' attribute.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status. Diese Eigenschaft funktioniert wie in [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung)
	 * beschrieben entweder als URL zu einem `skos:Concept` oder als String. Die Strings bzw. `prefLabel` SOLLEN
	 * sowohl die männliche als auch die weibliche Form enthalten, und zwar in dem Muster \"männliche Form | weibliche Form\"
	 * (genau in der Reihenfolge mit einem Leerzeichen vor und nach dem \"|\"). Wenn sich beide Formen nicht unterscheiden,
	 * dann DARF die Form nur einmal verwendet werden: \"Ratsmitglied\" und nicht \"Ratsmitglied | Ratsmitglied\".
	 * Dadurch kann auch solche Software einen sinnvollen Text anzeigen, die keine Fall-Unterscheidung nach Geschlecht
	 * der Personen vornimmt. Weitere Beispiele: \"Bürgermeister | Bürgermeisterin\", \"Bezirksbürgermeister |
	 * Bezirksbürgermeisterin\", \"Stadtverordneter | Stadtverordnete\", \"Bezirksverordneter | Bezirksverordnete\",
	 * \"Sachkundiger Bürger | Sachkundige Bürgerin\", \"Einzelstadtverordneter | Einzelstadtverordnete\"
	 * (Mitglieder des Rates die keiner Fraktion/Organisation angehören).
	 * Vgl. [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Status()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStatus();

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Membership}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Mitgliedschaften der Person in Gruppierungen, z. B. Gremien und Fraktionen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Membership()
	 * @see de.oklab.leipzig.oparl.Membership#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<Membership> getMembership();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Keyword()
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Created()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getCreated <em>Created</em>}' attribute.
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPerson_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Person#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

} // Person
