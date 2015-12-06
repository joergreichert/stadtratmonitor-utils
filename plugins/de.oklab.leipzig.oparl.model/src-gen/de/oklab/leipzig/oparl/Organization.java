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
 * Dieser Objekttyp dient dazu, Gruppierungen von Personen abzubilden, die in der parlamentarischen Arbeit eine Rolle spielen.
 * Dazu zählen in der Praxis insbesondere Fraktionen und Gremien.^[Ein Teil der Eigenschaften ist der \"Organization\"
 *  Ontologie (kurz: `org:Organization`) des W3C entnommen. Quelle: The Organization Ontology, W3C Recommendation 16 January 2014,
 * <http://www.w3.org/TR/vocab-org/>. Deren Bezeichnungen wurden deshalb beibehalten. Das betrifft z.B. die Verwendung von `classification`.]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getMembership <em>Membership</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getPost <em>Post</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getSubOrganizationOf <em>Sub Organization Of</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Organization#getWebsite <em>Website</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends PersonOrOrganization {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Organization$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Körperschaft, zu der diese Gruppierung gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Body()
	 * @see de.oklab.leipzig.oparl.Body#getOrganization
	 * @model opposite="organization"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}' reference.
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
	 *  Offizielle (lange) Form des Namens der Gruppierung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Membership}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Mitgliedschaften dieser Gruppierung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Membership()
	 * @see de.oklab.leipzig.oparl.Membership#getOrganization
	 * @model opposite="organization"
	 * @generated
	 */
	EList<Membership> getMembership();

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Meeting}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sitzungen dieser Gruppierung. Invers zur Eigenschaft `organization` der Klasse `oparl:Meeting`. Da die Anzahl der
	 * Sitzungen stetig wachsen kann, wird EMPFOHLEN, die Liste über eine eigene URL verfügbar zu machen und damit
	 * Paginierung sowie die Filterung mittels startDate und endDate Parametern zu ermöglichen. Siehe dazu auch
	 * [Objektlisten](#objektlisten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meeting</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Meeting()
	 * @see de.oklab.leipzig.oparl.Meeting#getOrganization
	 * @model opposite="organization"
	 * @generated
	 */
	EList<Meeting> getMeeting();

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Der Name der Gruppierung als Kurzform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_ShortName()
	 * @model unique="false"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positionen, die für diese Gruppierung vorgesehen sind. Die Werte dieser Eigenschaft funktioniert wie in
	 * [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung) beschrieben entweder als URL zu einem `skos:Concept`
	 * oder als String. Die Strings bzw. `prefLabel`-Eigenschaften der Objekte SOLLEN sowohl die männliche als auch die
	 * weibliche Form enthalten, und zwar in dem Muster \"männliche Form | weibliche Form\" (genau in der Reihenfolge mit
	 * einem Leerzeichen vor und nach dem \"|\"). Wenn sich beide Formen nicht unterscheiden, dann DARF die Form nur einmal
	 * verwendet werden: \"Mitglied\" und nicht \"Mitglied | Mitglied\". Weitere Beispiele: \"Vorsitzender | Vorsitzende\",
	 * \"1. Stellvertreter | 1. Stellvertreterin\", \"2. Stellvertreter | 2. Stellvertreterin\", \"Schriftführer |
	 * Schriftführerin\", \"Stellvertretender Schriftführer | Stellvertretende Schriftführerin
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Post()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	EList<String> getPost();

	/**
	 * Returns the value of the '<em><b>Sub Organization Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Ggf. URL der übergeordneten Gruppierung.
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
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Art der Gruppierung. In Frage kommen z.B. \"Rat\", \"Hauptausschuss\", \"Ausschuss\", \"Beirat\",
	 * \"Projektbeirat\", \"Kommission\", \"AG\", \"Verwaltungsrat\". Die Angabe soll möglichst präzise erfolgen.
	 * Vgl. [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung).
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
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Gründungsdatum der Gruppierung. Kann z. B. das Datum der konstituierenden Sitzung sein.
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
	 *  Datum des letzten Tages der Existenz der Gruppierung.
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
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Created()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getCreated <em>Created</em>}' attribute.
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganization_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Organization#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Allgemeine Website der Gruppierung.
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

} // Organization
