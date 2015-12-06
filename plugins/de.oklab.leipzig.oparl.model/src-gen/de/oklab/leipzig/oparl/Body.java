/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Objekttyp `oparl:Body` dient dazu, eine Körperschaft und damit ein Parlament zu repräsentieren, zu dem der Server Informationen
 * bereithält. Eine Körperschaft kann beispielsweise eine Gemeinde, ein Landkreis oder  ein kommunaler Zweckverband sein.
 * 
 * Hätte das System beispielsweise den Zweck, Informationen über das kommunale Parlament der Stadt Köln, namentlich den Rat der Stadt
 * Köln, abzubilden, dann müsste dieses System dazu ein Objekt vom Typ `oparl:Body` führen, welches die Stadt Köln repräsentiert.
 * 
 * Vom OParl-Server wird erwartet, dass er mindestens ein Objekt vom Typ `oparl:Body` bereithält. Teilen sich mehrere Körperschaften
 * dasselbe technische System, können auf demselben Server auch mehrere Objekte vom Typ `oparl:Body` beherbergt werden.
 * 
 * Über die Zuordnung zu einem bestimmten `oparl:Body`-Objekt zeigen andere Objekte, wie beispielsweise Gremien oder Drucksachen,
 * ihre Zugehörigkeit zu einer bestimmten Körperschaft und damit implizit zu einem bestimmten Parlament an.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getLicense <em>License</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getLicenseValidSince <em>License Valid Since</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getRgs <em>Rgs</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getEquivalentBody <em>Equivalent Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getMember <em>Member</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getLegislativeTerm <em>Legislative Term</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Body$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.System#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  System, zu dem dieses Objekt gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(de.oklab.leipzig.oparl.System)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_System()
	 * @see de.oklab.leipzig.oparl.System#getBodies
	 * @model opposite="bodies"
	 * @generated
	 */
	de.oklab.leipzig.oparl.System getSystem();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(de.oklab.leipzig.oparl.System value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Kurzer Name der Körperschaft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_ShortName()
	 * @model unique="false"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Der offizielle lange Name der Körperschaft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Allgemeine Website der Körperschaft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Website()
	 * @model unique="false"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lizenz, die für die Daten, die über diese API abgerufen werden können, gilt, sofern nicht am einzelnen Objekt anders angegeben.
	 * Siehe dazu auch die übergreifende Beschreibung zur Eigenschaft [`license`](#eigenschaft_license).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_License()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>License Valid Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkt, seit dem die unter `license` angegebene Lizenz gilt. Vorsicht bei Änderungen der Lizenz die zu restriktiveren
	 * Bedingungen führen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License Valid Since</em>' attribute.
	 * @see #setLicenseValidSince(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_LicenseValidSince()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getLicenseValidSince();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getLicenseValidSince <em>License Valid Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Valid Since</em>' attribute.
	 * @see #getLicenseValidSince()
	 * @generated
	 */
	void setLicenseValidSince(Date value);

	/**
	 * Returns the value of the '<em><b>Rgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regionalschlüssel der Körperschaft als zwölfstellige Zeichenkette^[Regionalschlüssel können im [Gemeindeverzeichnis (GV-ISys)
	 * des Statistischen Bundesamtes](https://www.destatis.de/DE/ZahlenFakten/LaenderRegionen/Regionales/Gemeindeverzeichnis/Gemeindeverzeichnis.html)
	 * eingesehen werden].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rgs</em>' attribute.
	 * @see #setRgs(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Rgs()
	 * @model unique="false"
	 * @generated
	 */
	String getRgs();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getRgs <em>Rgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rgs</em>' attribute.
	 * @see #getRgs()
	 * @generated
	 */
	void setRgs(String value);

	/**
	 * Returns the value of the '<em><b>Equivalent Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dient der Angabe beliebig vieler zusätzlicher URLs, die dieselbe Körperschaft repräsentieren. Hier können beispielsweise, sofern
	 * vorhanden, der entsprechende Eintrag der Gemeinsamen Normdatei der Deutschen Nationalbibliothek^[Gemeinsame Normdatei <http://www.dnb.de/gnd>]
	 * oder der DBPedia^[DBPedia <http://www.dbpedia.org/>] oder der Wikipedia^[Wikipedia <http://de.wikipedia.org/>] angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equivalent Body</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_EquivalentBody()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	EList<String> getEquivalentBody();

	/**
	 * Returns the value of the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dient der Angabe einer Kontakt-E-Mail-Adresse mit \"mailto:\"-Schema. Die Adresse soll die Kontaktaufnahme zu einer für die Körperschaft
	 * und idealerweise das parlamentarische Informationssystem zuständigen Stelle ermöglichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Email</em>' attribute.
	 * @see #setContactEmail(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_ContactEmail()
	 * @model unique="false"
	 * @generated
	 */
	String getContactEmail();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getContactEmail <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Email</em>' attribute.
	 * @see #getContactEmail()
	 * @generated
	 */
	void setContactEmail(String value);

	/**
	 * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name oder Bezeichnung der mit `contactEmail` erreichbaren Stelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Name</em>' attribute.
	 * @see #setContactName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_ContactName()
	 * @model unique="false"
	 * @generated
	 */
	String getContactName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getContactName <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Name</em>' attribute.
	 * @see #getContactName()
	 * @generated
	 */
	void setContactName(String value);

	/**
	 * Returns the value of the '<em><b>Paper</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Drucksachen unter dieser Körperschaft. Vgl. [Objektlisten](#objektlisten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Paper()
	 * @see de.oklab.leipzig.oparl.Paper#getBody
	 * @model opposite="body"
	 * @generated
	 */
	EList<Paper> getPaper();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Person}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Personen in dieser Körperschaft. Vgl. [Objektlisten](#objektlisten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Member()
	 * @see de.oklab.leipzig.oparl.Person#getBody
	 * @model opposite="body"
	 * @generated
	 */
	EList<Person> getMember();

	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Meeting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Sitzungen dieser Körperschaft. Vgl. [Objektlisten](#objektlisten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meeting</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Meeting()
	 * @model
	 * @generated
	 */
	EList<Meeting> getMeeting();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gruppierungen in dieser Körperschaft. Vgl. [Objektlisten](#objektlisten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Organization()
	 * @see de.oklab.leipzig.oparl.Organization#getBody
	 * @model opposite="body"
	 * @generated
	 */
	EList<Organization> getOrganization();

	/**
	 * Returns the value of the '<em><b>Legislative Term</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.LegislativeTerm}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Wahlperioden in dieser Körperschaft. Vgl. [Objektlisten](#objektlisten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legislative Term</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_LegislativeTerm()
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getBody
	 * @model opposite="body"
	 * @generated
	 */
	EList<LegislativeTerm> getLegislativeTerm();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Art der Körperschaft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Classification()
	 * @model unique="false"
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getClassification <em>Classification</em>}' attribute.
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Keyword()
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Created()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getCreated <em>Created</em>}' attribute.
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

} // Body
