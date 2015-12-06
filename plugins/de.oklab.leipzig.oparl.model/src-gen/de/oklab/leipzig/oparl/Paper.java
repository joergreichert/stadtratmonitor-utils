/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dieser Objekttyp dient der Abbildung von Drucksachen in der parlamentarischen Arbeit, wie zum Beispiel Anfragen, Anträgen
 * und Beschlussvorlagen.\n\nDrucksachen werden in Form einer Beratung (oparl:Consultation) im Rahmen eines Tagesordnungspunkts
 * (oparl:AgendaItem) einer Sitzung (oparl:Meeting) behandelt.\n\nDrucksachen spielen in der schriftlichen wie mündlichen
 * Kommunikation eine besondere Rolle, da in vielen Texten auf bestimmte Drucksachen Bezug genommen wird. Hierbei kommen in
 * parlamentarischen Informationssystemen unveränderliche Kennungen der Drucksachen zum Einsatz.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getReference <em>Reference</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getPublishedDate <em>Published Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getPaperType <em>Paper Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getRelatedPaper <em>Related Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getMainFile <em>Main File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getOriginator <em>Originator</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getConsultation <em>Consultation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Paper#getUnderDirectionof <em>Under Directionof</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper()
 * @model
 * @generated
 */
public interface Paper extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Paper$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Körperschaft, zu der die Drucksache gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Body()
	 * @see de.oklab.leipzig.oparl.Body#getPaper
	 * @model opposite="paper"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}' reference.
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
	 *  Titel der Drucksache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Kennung bzw. Aktenzeichen der Drucksache, mit der sie in der parlamentarischen Arbeit eindeutig referenziert werden kann.
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
	 *  Veröffentlichungsdatum der Drucksache.
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
	 *  Art der Drucksache, z. B. Beantwortung einer Anfrage. Diese Eigenschaft funktioniert wie in
	 * [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung) beschrieben entweder als URL zu einem `skos:Concept` oder als String.
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
	 *  Inhaltlich verwandte Drucksachen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_RelatedPaper()
	 * @model
	 * @generated
	 */
	EList<Paper> getRelatedPaper();

	/**
	 * Returns the value of the '<em><b>Main File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Haupt-Datei zu dieser Drucksache. Beispiel: Die Drucksache repräsentiert eine Beschlussvorlage und die Haupt-Datei
	 * enthält den Text der Beschlussvorlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main File</em>' reference.
	 * @see #setMainFile(File)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_MainFile()
	 * @model
	 * @generated
	 */
	File getMainFile();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getMainFile <em>Main File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main File</em>' reference.
	 * @see #getMainFile()
	 * @generated
	 */
	void setMainFile(File value);

	/**
	 * Returns the value of the '<em><b>Auxiliary File</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.AuxiliaryFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * opposite paper
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auxiliary File</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_AuxiliaryFile()
	 * @model
	 * @generated
	 */
	EList<AuxiliaryFile> getAuxiliaryFile();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * opposite paper
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Location()
	 * @model
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Originator</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.PersonOrOrganization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Urheber der Drucksache, kann eine oder mehrere Person(en) bzw. Gruppierung(en) sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Originator()
	 * @model
	 * @generated
	 */
	EList<PersonOrOrganization> getOriginator();

	/**
	 * Returns the value of the '<em><b>Consultation</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Consultation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Beratungen der Drucksache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consultation</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Consultation()
	 * @see de.oklab.leipzig.oparl.Consultation#getPaper
	 * @model opposite="paper"
	 * @generated
	 */
	EList<Consultation> getConsultation();

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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Paper#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

	/**
	 * Returns the value of the '<em><b>Under Directionof</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Organization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Federführung. Amt oder Abteilung, für die Inhalte oder Beantwortung der Drucksache verantwortlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Under Directionof</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getPaper_UnderDirectionof()
	 * @model
	 * @generated
	 */
	EList<Organization> getUnderDirectionof();

} // Paper
