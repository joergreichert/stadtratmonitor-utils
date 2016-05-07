/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Dieser Objekttyp dient der Abbildung von Drucksachen in der parlamentarischen
 * Arbeit, wie zum Beispiel Anfragen, Anträgen und Beschlussvorlagen.
 * </p><p>
 * Drucksachen werden in Form einer Beratung ({@link Consultation}) im
 * Rahmen eines Tagesordnungspunkts ({@link AgendaItem}) einer
 * Sitzung ({@link Meeting}) behandelt.
 * </p><p>
 * Drucksachen spielen in der schriftlichen wie mündlichen Kommunikation eine
 * besondere Rolle, da in vielen Texten auf bestimmte Drucksachen Bezug genommen
 * wird. Hierbei kommen in parlamentarischen Informationssystemen
 * unveränderliche Kennungen der Drucksachen zum Einsatz.
 * </p>
 * <p>Beispiel:
 * <pre>
 * {
 *    "id": "https://oparl.example.org/paper/749",
 *    "type": "https://oparl.org/schema/1.0/Paper",
 *    "body": "https://oparl.example.org/bodies/1",
 *    "name": "Antwort auf Anfrage 1200/2014",
 *    "reference": "1234/2014",
 *    "publishedDate": "2014-04-04T16:42:02+02:00",
 *    "paperType": "Beantwortung einer Anfrage",
 *    "relatedPaper": [
 *        "https://oparl.example.org/paper/699"
 *    ],
 *    "mainFile": {
 *        "id": "https://oparl.example.org/files/57737",
 *        "type": "https://oparl.org/schema/1.0/File",
 *        "name": "Anlage 1 zur Anfrage",
 *        "fileName": "anlage.pdf",
 *        "mimeType": "application/pdf",
 *        "date": "2013-01-04T07:54:13+01:00",
 *        "modified": "2013-01-04T07:54:13+01:00",
 *        "sha1Checksum": "d749751af44a32c818b9b1e1515251c67734f5d2",
 *        "size": 82930,
 *        "accessUrl": "https://oparl.example.org/files/57737.pdf",
 *        "downloadUrl": "https://oparl.example.org/files/download/57737.pdf",
 *        "license": "http://www.opendefinition.org/licenses/cc-by"
 *    },
 *    "auxiliaryFile": [
 *        {
 *            "id": "https://oparl.example.org/files/57739",
 *            "type": "https://oparl.org/schema/1.0/File",
 *            "name": "Anlage 1 zur Anfrage",
 *            "fileName": "anlage.pdf",
 *            "mimeType": "application/pdf",
 *            "date": "2013-01-04T07:54:13+01:00",
 *            "modified": "2013-01-04T07:54:13+01:00",
 *            "sha1Checksum": "da39a3ee5e6b4b0d3255bfef95601890afd80709",
 *            "size": 82930,
 *            "accessUrl": "https://oparl.example.org/files/57739.pdf",
 *            "downloadUrl": "https://oparl.example.org/files/download/57739.pdf",
 *            "text": "Der Übersichtsplan zeigt alle Ebenen des ...",
 *            "masterFile": "https://oparl.example.org/files/57738",
 *            "license": "http://www.opendefinition.org/licenses/cc-by"
 *        }
 *    ],
 *    "location": [
 *        {
 *            "id": "https://oparl.example.org/locations/29856",
 *            "type": "https://oparl.org/schema/1.0/Location",
 *            "description": "Honschaftsstraße 312, Köln",
 *            "geometry": {
 *                "type": "Point",
 *                "coordinates": [
 *                    7.03291,
 *                    50.98249
 *                ]
 *            }
 *        }
 *    ],
 *    "originatorPerson": [
 *        "https://oparl.example.org/person/2000",
 *        "https://oparl.example.org/person/1000"
 *    ],
 *    "originatorOrganization": [
 *        "https://oparl.example.org/organization/2000",
 *        "https://oparl.example.org/organization/1000"
 *    ],
 *    "consultation": [
 *        {
 *            "id": "https://oparl.example.org/consultation/47594",
 *            "type": "https://oparl.org/schema/1.0/Consultation",
 *            "agendaItem": "https://oparl.example.org/agendaitem/15569",
 *            "meeting": "https://oparl.example.org/meeting/243",
 *            "organization": "https://oparl.example.org/organization/96",
 *            "authoritative": false,
 *            "role": "Beschlussfassung"
 *        }
 *    ],
 *    "underDirectionOf": [
 *        "https://oparl.example.org/organization/2000"
 *    ],
 *    "modified": "2013-01-08T12:05:27+01:00"
 * }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getReference <em>Reference</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getPublishedDate <em>Published Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getPaperType <em>Paper Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getRelatedPaper <em>Related Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getSuperordinatedPaper <em>Superordinated Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getSubordinatedPaper <em>Subordinated Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getMainFile <em>Main File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getOriginatorPerson <em>Originator Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getUnderDirectionof <em>Under Directionof</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getOriginatorOrganization <em>Originator Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getConsultation <em>Consultation</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper()
 * @model
 * @generated
 */
public interface Paper extends OParlElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Körperschaft, zu der die Drucksache gehört.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' container reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Body()
	 * @see de.oklab.leipzig.oparl.Body#getPaper
	 * @model opposite="paper" transient="false"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' container reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Kennung bzw. Aktenzeichen der Drucksache, mit der sie in der
	 * parlamentarischen Arbeit eindeutig referenziert werden kann.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Reference()
	 * @model unique="false"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Veröffentlichungsdatum der Drucksache.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Published Date</em>' attribute.
	 * @see #setPublishedDate(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_PublishedDate()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getPublishedDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getPublishedDate <em>Published Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published Date</em>' attribute.
	 * @see #getPublishedDate()
	 * @generated
	 */
	void setPublishedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Paper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Art der Drucksache, z. B. Beantwortung einer Anfrage.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper Type</em>' attribute.
	 * @see #setPaperType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_PaperType()
	 * @model unique="false"
	 * @generated
	 */
	String getPaperType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getPaperType <em>Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paper Type</em>' attribute.
	 * @see #getPaperType()
	 * @generated
	 */
	void setPaperType(String value);

	/**
	 * Returns the value of the '<em><b>Related Paper</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Inhaltlich verwandte Drucksachen.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_RelatedPaper()
	 * @model
	 * @generated
	 */
	EList<Paper> getRelatedPaper();

	/**
	 * Returns the value of the '<em><b>Superordinated Paper</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getSubordinatedPaper <em>Subordinated Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Übergeordnete Drucksachen.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Superordinated Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_SuperordinatedPaper()
	 * @see de.oklab.leipzig.oparl.Paper#getSubordinatedPaper
	 * @model opposite="subordinatedPaper"
	 * @generated
	 */
	EList<Paper> getSuperordinatedPaper();

	/**
	 * Returns the value of the '<em><b>Subordinated Paper</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getSuperordinatedPaper <em>Superordinated Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Untergeordnete Drucksachen.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subordinated Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_SubordinatedPaper()
	 * @see de.oklab.leipzig.oparl.Paper#getSuperordinatedPaper
	 * @model opposite="superordinatedPaper"
	 * @generated
	 */
	EList<Paper> getSubordinatedPaper();

	/**
	 * Returns the value of the '<em><b>Main File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Die Haupt-Datei zu dieser Drucksache.
	 * Beispiel: Die Drucksache repräsentiert eine Beschlussvorlage und die
	 * Haupt-Datei enthält den Text der Beschlussvorlage. Sollte keine
	 * eindeutige Haupt-Datei vorhanden sein, wird diese Eigenschaft nicht
	 * ausgegeben.
	 * <p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main File</em>' containment reference.
	 * @see #setMainFile(File)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_MainFile()
	 * @model containment="true"
	 * @generated
	 */
	File getMainFile();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getMainFile <em>Main File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main File</em>' containment reference.
	 * @see #getMainFile()
	 * @generated
	 */
	void setMainFile(File value);

	/**
	 * Returns the value of the '<em><b>Auxiliary File</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.AuxiliaryFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Alle Dateien zur Drucksache ausgenommen der gegebenenfalls in
	 * {@link Paper#mainFile} angegebenen Datei.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auxiliary File</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_AuxiliaryFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuxiliaryFile> getAuxiliaryFile();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.PaperLocation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.PaperLocation#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Sofern die Drucksache einen inhaltlichen Ortsbezug hat, beschreibt diese
	 * Eigenschaft den Ort in Textform und/oder in Form von Geodaten.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Location()
	 * @see de.oklab.leipzig.oparl.PaperLocation#getPaper
	 * @model opposite="paper" containment="true"
	 * @generated
	 */
	EList<PaperLocation> getLocation();

	/**
	 * Returns the value of the '<em><b>Originator Person</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Urheber der Drucksache, falls der Urheber eine Person ist.
	 * Es können auch mehrere Personen angegeben werden.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Person</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_OriginatorPerson()
	 * @model
	 * @generated
	 */
	EList<Person> getOriginatorPerson();

	/**
	 * Returns the value of the '<em><b>Under Directionof</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Federführung. Amt oder Abteilung, für die Inhalte oder Beantwortung der
	 * Drucksache verantwortlich.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Under Directionof</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_UnderDirectionof()
	 * @model
	 * @generated
	 */
	EList<Organization> getUnderDirectionof();

	/**
	 * Returns the value of the '<em><b>Originator Organization</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Urheber der Drucksache, falls der Urheber eine Gruppierung ist.
	 * Es können auch mehrere Gruppierungen angegeben werden.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator Organization</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_OriginatorOrganization()
	 * @model
	 * @generated
	 */
	EList<Organization> getOriginatorOrganization();

	/**
	 * Returns the value of the '<em><b>Consultation</b></em>' containment reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Consultation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Beratungen der Drucksache.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consultation</em>' containment reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Consultation()
	 * @see de.oklab.leipzig.oparl.Consultation#getPaper
	 * @model opposite="paper" containment="true"
	 * @generated
	 */
	EList<Consultation> getConsultation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"https://oparl.org/schema/1.0/Paper\";'"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Titel der Drucksache.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getName();'"
	 * @generated
	 */
	String getName();

} // Paper
