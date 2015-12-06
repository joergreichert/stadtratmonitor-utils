/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Ein Objekt vom Typ `oparl:File` repräsentiert eine Datei, beispielsweise eine PDF-Datei, ein RTF- oder ODF-Dokument,
 * und hält Metadaten zu der Datei sowie URLs zum Zugriff auf  die Datei bereit.\n\nObjekte vom Typ `oparl:File` können
 * mit Drucksachen (`oparl:Paper`) oder Sitzungen (`oparl:Meeting`) in Beziehung stehen. Dies wird durch  die Eigenschaft
 * `paper` bzw. `meeting` angezeigt.\n\nMehrere Objekte vom Typ `oparl:File` können mit einander in direkter Beziehung stehen,
 * wenn sie den selben Inhalt in unterschiedlichen technischen Formaten wiedergeben. Hierfür werden die Eigenschaften
 * `masterFile` bzw. `derivativeFile` eingesetzt. Das oben angezeigte Beispiel-Objekt repräsentiert eine PDF-Datei
 * (zu erkennen an der Eigenschaft `mimeType`) und zeigt außerdem über die Eigenschaft  `masterFile` an, von welcher
 * anderen Datei es abgeleitet wurde. Umgekehrt KANN über die Eigenschaft `derivativeFile` angezeigt werden, welche
 * Ableitungen einer Datei existieren.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.File#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getFileName <em>File Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getDate <em>Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getSize <em>Size</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getSha1Checksum <em>Sha1 Checksum</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getText <em>Text</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getAccessUrl <em>Access Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getDerivativeFile <em>Derivative File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getLicense <em>License</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getFileRole <em>File Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getId <em>Id</em>}' attribute.
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
	 * Pattern(^http://oparl\\.org/schema/1\\.0/File$)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dateiname, unter dem die Datei in einem Dateisystem gespeichert werden kann. Beispiel: \"einedatei.pdf\".
	 * Da der Name den kompletten Unicode-Zeichenumang nutzen kann, SOLLEN Clients ggf. selbst dafür sorgen, diesen beim
	 * Speichern in ein Dateisystem den lokalen Erfordernissen anzupassen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_FileName()
	 * @model unique="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein zur Anzeige für Endnutzer bestimmter Name für dieses Objekt. Leerzeichen DÜRFEN enthalten sein, Datei-Endungen wie
	 * \".pdf\" SOLLEN NICHT enthalten sein. Der Wert SOLL NICHT mit dem Wert der Eigenschaft `fileName` identisch sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIME-Type des Inhalts ^[vgl. RFC2046: <http://tools.ietf.org/html/rfc2046>]. Sollte das System einer Datei keinen
	 * spezifischen Typ zuweisen können, wird EMPFOHLEN, hier `application/octet-stream` zu verwenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_MimeType()
	 * @model unique="false"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum und Zeit der Erstellung der Datei. Wahlweise, falls dies nicht vom System kommuniziert werden kann oder soll,
	 * KANN alternativ der Zeitpunkt der Veröffentlichung ausgegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Date()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum und Zeit der letzten Änderung der Datei bzw. der Metadaten. Als Änderung der Datei gilt alles, was den Inhalt
	 * der Datei verändert und beispielsweise zu einer Veränderung der Prüfsumme führen würde, nicht aber die Änderung des
	 * Dateinamens (siehe Eigenschaft `name`). Als Änderung der Metadaten hingegen würde beispielsweise die Änderung des
	 * Dateinamens gelten. Hier soll immer das größere der beiden Daten ausgegeben werden, also der am wenigsten lang
	 * zurückliegende Änderungszeitpunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Größe der Datei in Bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Size()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  SHA1-Prüfsumme des Dateiinhalts in Hexadezimal-Schreibweise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sha1 Checksum</em>' attribute.
	 * @see #setSha1Checksum(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Sha1Checksum()
	 * @model unique="false"
	 * @generated
	 */
	String getSha1Checksum();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getSha1Checksum <em>Sha1 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sha1 Checksum</em>' attribute.
	 * @see #getSha1Checksum()
	 * @generated
	 */
	void setSha1Checksum(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Reine Text-Wiedergabe des Dateiinhalts, sofern dieser in Textform wiedergegeben werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL zum allgemeinen Zugriff auf die Datei. Näheres unter [Dateizugriffe](#dateizugriff).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Url</em>' attribute.
	 * @see #setAccessUrl(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_AccessUrl()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getAccessUrl();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getAccessUrl <em>Access Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Url</em>' attribute.
	 * @see #getAccessUrl()
	 * @generated
	 */
	void setAccessUrl(String value);

	/**
	 * Returns the value of the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL zum Download der Datei. Näheres unter [Dateizugriffe](#dateizugriff).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Download Url</em>' attribute.
	 * @see #setDownloadUrl(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_DownloadUrl()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getDownloadUrl();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getDownloadUrl <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Url</em>' attribute.
	 * @see #getDownloadUrl()
	 * @generated
	 */
	void setDownloadUrl(String value);

	/**
	 * Returns the value of the '<em><b>Paper</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls die Datei zu einer oder mehreren Drucksachen (`oparl:Paper`) gehört, MÜSSEN diese Drucksachen über diese
	 * Eigenschaft angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Paper()
	 * @model
	 * @generated
	 */
	EList<Paper> getPaper();

	/**
	 * Returns the value of the '<em><b>Master File</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.File#getDerivativeFile <em>Derivative File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls die Datei zu einer oder mehreren Sitzungen (`oparl:Meeting`) gehört, MÜSSEN diese Sitzungen über diese
	 * Eigenschaft angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master File</em>' reference.
	 * @see #setMasterFile(File)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_MasterFile()
	 * @see de.oklab.leipzig.oparl.File#getDerivativeFile
	 * @model opposite="derivativeFile"
	 * @generated
	 */
	File getMasterFile();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getMasterFile <em>Master File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master File</em>' reference.
	 * @see #getMasterFile()
	 * @generated
	 */
	void setMasterFile(File value);

	/**
	 * Returns the value of the '<em><b>Derivative File</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.File}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.File#getMasterFile <em>Master File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datei, die von dem aktuellen Objekt abgeleitet wurde. Details dazu in der allgemeinen Beschreibung weiter oben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivative File</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_DerivativeFile()
	 * @see de.oklab.leipzig.oparl.File#getMasterFile
	 * @model opposite="masterFile"
	 * @generated
	 */
	EList<File> getDerivativeFile();

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lizenz, unter der die Datei angeboten wird. Wenn diese Eigenschaft verwendet wird, dann ist sie anstelle einer
	 * globalen Angabe im übergeordneten `oparl:Body`- bzw. `oparl:System`-Objekt maßgeblich.
	 * ^[vgl. [license](#eigenschaft_license)]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_License()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>File Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rolle, Funktion der Datei in Bezug auf eine Sitzung. Die Eigenschaft SOLL entsprechend nur in Verbindung mit der
	 * Eigenschaft `meeting` gesetzt sein. Siehe dazu [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Role</em>' attribute.
	 * @see #setFileRole(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_FileRole()
	 * @model unique="false"
	 * @generated
	 */
	String getFileRole();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getFileRole <em>File Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Role</em>' attribute.
	 * @see #getFileRole()
	 * @generated
	 */
	void setFileRole(String value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

} // File
