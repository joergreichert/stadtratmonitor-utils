/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Der Objekttyp oparl:Body dient dazu, eine Körperschaft zu repräsentieren. Eine Körperschaft ist in den meisten
 * Fällen eine Gemeinde, eine Stadt oder ein Landkreis.
 * </p><p>
 * In der Regel sind auf einem OParl-Server Daten von genau einer Körperschaft gespeichert und es wird daher auch
 * nur ein Body-Objekt ausgegeben. Sind auf dem Server jedoch Daten von mehreren Körperschaften gespeichert, muss
 * für jede Körperschaft ein eigenes Body-Objekt ausgegeben werden.
 * </p>
 * <p>Beispiel:
 * <pre>
 * {
 *   "id": "https://oparl.example.org/body/0",
 *   "type": "https://oparl.org/schema/1.0/Body",
 *   "system": "https://oparl.example.org/",
 *   "contactEmail": "ris@beispielstadt.de",
 *   "contactName": "RIS-Betreuung",
 *   "ags": "05315000",
 *   "rgs": "053150000000",
 *   "equivalentBody": [
 *       "http://d-nb.info/gnd/2015732-0",
 *       "http://dbpedia.org/resource/Cologne"
 *   ],
 *   "shortName": "Köln",
 *   "name": "Stadt Köln, kreisfreie Stadt",
 *   "website": "http://www.beispielstadt.de/",
 *   "license": "http://creativecommons.org/licenses/by/4.0/",
 *   "licenseValidSince": "2014-01-01",
 *   "organization": "https://oparl.example.org/body/0/organizations/",
 *   "person": "https://oparl.example.org/body/0/people/",
 *   "meeting": "https://oparl.example.org/body/0/meetings/",
 *   "paper": "https://oparl.example.org/body/0/papers/",
 *   "legislativeTerm": [
 *       {
 *           "id": "https://oparl.example.org/term/21",
 *           "type": "https://oparl.org/schema/1.0/LegislativeTerm",
 *           "body": "https://oparl.example.org/body/0",
 *           "name": "21. Wahlperiode",
 *           "startDate": "2010-12-03",
 *           "endDate": "2013-12-03"
 *       }
 *   ],
 *   "location": {
 *       "id:": "https://oparl.example.org/location/0",
 *       "type": "https://oparl.org/schema/1.0/Location",
 *       "description": "Rathaus der Beispielstadt, Ratshausplatz 1, 12345 Beispielstadt",
 *       "geometry": {
 *           "type": "Feature",
 *           "geometry": {
 *               "type": "Point",
 *               "coordinates": [
 *                   50.1234,
 *                   10.4321
 *               ]
 *           },
 *           "properties": {
 *               "name": "Rathausplatz"
 *           }
 *       }
 *   },
 *   "classification": "Kreisfreie Stadt",
 *   "created": "2014-01-08T14:28:31.568+0100",
 *   "modified": "2014-01-08T14:28:31.568+0100"
 * }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getLicenseValidSince <em>License Valid Since</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getOparlSince <em>Oparl Since</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getAgs <em>Ags</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getRgs <em>Rgs</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getEquivalentBody <em>Equivalent Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getPerson <em>Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getLegislativeTerm <em>Legislative Term</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getClassification <em>Classification</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Body#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getBody()
 * @model features="_contactEmail" 
 *        _contactEmailUnique="false" _contactEmailDataType="org.eclipse.emf.ecore.EString" _contactEmailSuppressedGetVisibility="true" _contactEmailSuppressedSetVisibility="true"
 * @generated
 */
public interface Body extends AddressableOParlElement {
    /**
     * Returns the value of the '<em><b>System</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.System#getBodies <em>Bodies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * System, zu dem dieses Objekt gehört.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>System</em>' container reference.
     * @see #setSystem(de.oklab.leipzig.oparl.System)
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_System()
     * @see de.oklab.leipzig.oparl.System#getBodies
     * @model opposite="bodies" transient="false"
     * @generated
     */
    de.oklab.leipzig.oparl.System getSystem();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System</em>' container reference.
     * @see #getSystem()
     * @generated
     */
    void setSystem(de.oklab.leipzig.oparl.System value);

    /**
     * Returns the value of the '<em><b>Website</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Allgemeine Website der Körperschaft.
     * </p>
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
     * Returns the value of the '<em><b>License Valid Since</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Zeitpunkt, seit dem die unter {@link Body#license} angegebene Lizenz gilt. Vorsicht bei Änderungen der Lizenz
     * die zu restriktiveren Bedingungen führen.
     * </p>
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
     * Returns the value of the '<em><b>Oparl Since</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Zeitpunkt, ab dem OParl für dieses Body bereitgestellt wurde. Dies hilft, um die Datenvalidität einzuschätzen,
     * erst ab der Einrichtung für OParl kann sichergestellt werden, dass sämtliche Werte korrekt in der
     * Original-Quelle vorliegen.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Oparl Since</em>' attribute.
     * @see #setOparlSince(Date)
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_OparlSince()
     * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
     * @generated
     */
    Date getOparlSince();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getOparlSince <em>Oparl Since</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Oparl Since</em>' attribute.
     * @see #getOparlSince()
     * @generated
     */
    void setOparlSince(Date value);

    /**
     * Returns the value of the '<em><b>Ags</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Der achtstellige Amtliche Gemeindeschlüssel
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ags</em>' attribute.
     * @see #setAgs(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Ags()
     * @model unique="false"
     * @generated
     */
    String getAgs();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getAgs <em>Ags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ags</em>' attribute.
     * @see #getAgs()
     * @generated
     */
    void setAgs(String value);

    /**
     * Returns the value of the '<em><b>Rgs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Der zwölfstellige Regionalschlüssel. Der Regionalschlüssel wird in Zukunft voraussichtlich den
     * Amtlichen Gemeindeschlüssel ersetzen.
     * </p>
     * <p>
     * Regionalschlüssel können im <a href="https://www.destatis.de/DE/ZahlenFakten/LaenderRegionen/Regionales/Gemeindeverzeichnis/Gemeindeverzeichnis.html">Gemeindeverzeichnis (GV-ISys) des Statistischen Bundesamtes</a>
     * eingesehen werden.
     * </p>
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
     * Returns the value of the '<em><b>Equivalent Body</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Body}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Dient der Angabe beliebig vieler zusätzlicher URLs, die dieselbe Körperschaft repräsentieren.
     * </p><p>
     * Hier können beispielsweise, sofern vorhanden, der entsprechende Eintrag der <a href="http://www.dnb.de/gnd">
     * Gemeinsamen Normdatei der Deutschen Nationalbibliothek</a> oder der <a href="http://www.dbpedia.org/">
     * DBPedia</a> oder der <a href="http://www.dbpedia.org/">Wikipedia</a>.
     * angegeben werden.
     * </p><p>
     * Body- oder System-Objekte mit anderen OParl-Versionen <b>dürfen</b> nicht Teil der Liste sein.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equivalent Body</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_EquivalentBody()
     * @model containment="true"
     * @generated
     */
    EList<Body> getEquivalentBody();

    /**
     * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Name oder Bezeichnung der mit {@link Body#contactEmail} erreichbaren Stelle.
     * </p>
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
     * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Link zur Objektliste mit allen Gruppierungen der Körperschaft.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Organization</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Organization()
     * @see de.oklab.leipzig.oparl.Organization#getBody
     * @model opposite="body" containment="true"
     * @generated
     */
    EList<Organization> getOrganization();

    /**
     * Returns the value of the '<em><b>Person</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Person}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Link zur Objektliste mit allen Personen der Körperschaft.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Person</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Person()
     * @see de.oklab.leipzig.oparl.Person#getBody
     * @model opposite="body" containment="true"
     * @generated
     */
    EList<Person> getPerson();

    /**
     * Returns the value of the '<em><b>Meeting</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Meeting}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Link zur Objektliste mit allen Sitzungen der Körperschaft.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Meeting</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Meeting()
     * @model containment="true"
     * @generated
     */
    EList<Meeting> getMeeting();

    /**
     * Returns the value of the '<em><b>Paper</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Link zur Objektliste mit allen Drucksachen der Körperschaft.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Paper</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Paper()
     * @see de.oklab.leipzig.oparl.Paper#getBody
     * @model opposite="body" containment="true"
     * @generated
     */
    EList<Paper> getPaper();

    /**
     * Returns the value of the '<em><b>Legislative Term</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.LegislativeTerm}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Objektliste mit allen Wahlperioden der Körperschaft in dem Zeitraum, für den OParl bereitgestellt wird.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Legislative Term</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_LegislativeTerm()
     * @see de.oklab.leipzig.oparl.LegislativeTerm#getBody
     * @model opposite="body" containment="true"
     * @generated
     */
    EList<LegislativeTerm> getLegislativeTerm();

    /**
     * Returns the value of the '<em><b>Classification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Art der Körperschaft.
     * </p>
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
     * Returns the value of the '<em><b>Location</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.BodyLocation#getBody <em>Body</em>}'.
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
     * @see #setLocation(BodyLocation)
     * @see de.oklab.leipzig.oparl.OparlPackage#getBody_Location()
     * @see de.oklab.leipzig.oparl.BodyLocation#getBody
     * @model opposite="body" containment="true"
     * @generated
     */
    BodyLocation getLocation();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.Body#getLocation <em>Location</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' containment reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(BodyLocation value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"https://oparl.org/schema/1.0/Body\";'"
     * @generated
     */
    String getType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Dient der Angabe einer Kontakt-E-Mail-Adresse mit \"mailto:\"-Schema. Die Adresse soll die Kontaktaufnahme
     * zu einer für die Körperschaft und idealerweise das parlamentarische Informationssystem zuständigen Stelle
     * ermöglichen.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.BodyImpl%>) this)._contactEmail;'"
     * @generated
     */
    String getContactEmail();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model contactEmailUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _notEquals = (!<%com.google.common.base.Objects%>.equal(contactEmail, null));\nif (_notEquals)\n{\n\tfinal <%java.lang.String%> patternStr = \"^^http://oparl\\\\.org/specs/1\\\\.0/$\";\n\tfinal <%java.util.regex.Pattern%> pattern = <%java.util.regex.Pattern%>.compile(patternStr);\n\tfinal <%java.util.regex.Matcher%> matcher = pattern.matcher(contactEmail);\n\tboolean _find = matcher.find();\n\tboolean _not = (!_find);\n\tif (_not)\n\t{\n\t\t<%java.lang.String%> _format = <%java.lang.String%>.format(\"%s doesn\\\'t follow pattern %s\", contactEmail, patternStr);\n\t\tthrow new <%java.lang.IllegalArgumentException%>(_format);\n\t}\n}\n((<%de.oklab.leipzig.oparl.impl.BodyImpl%>) this)._contactEmail = contactEmail;'"
     * @generated
     */
    void setContactEmail(String contactEmail);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Straße und Hausnummer der Körperschaft.
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
     * Postleitzahl der Körperschaft.
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
     * Ortsangabe der Körperschaft.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getLocality();'"
     * @generated
     */
    String getLocality();

} // Body
