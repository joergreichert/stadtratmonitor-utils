/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Ein Objekt vom Typ {@link File} repräsentiert eine Datei, beispielsweise
 * eine PDF-Datei, ein RTF- oder ODF-Dokument, und hält Metadaten zu der Datei
 * sowie URLs zum Zugriff auf die Datei bereit.
 * </p><p>
 * Objekte vom Typ {@link File} können mit Drucksachen ({@link Paper}) oder
 * Sitzungen ({@link Meeting}) in Beziehung stehen. Dies wird durch die
 * Eigenschaft {@link File#paper} bzw. {@link File#meeting} angezeigt.
 * </p><p>
 * Mehrere Objekte vom Typ {@link File} können mit einander in direkter
 * Beziehung stehen, wenn sie den selben Inhalt in unterschiedlichen
 * technischen Formaten wiedergeben. Hierfür werden die Eigenschaften
 * {@link File#masterFile} bzw. {@link File#derivativeFile} eingesetzt.
 * Das oben angezeigte Beispiel-Objekt repräsentiert eine PDF-Datei
 * (zu erkennen an der Eigenschaft {@link File#mimeType} und zeigt außerdem über
 * die Eigenschaft {@link File#masterFile} an, von welcher anderen Datei es
 * abgeleitet wurde. Umgekehrt kann über die Eigenschaft
 * {@link File#derivativeFile} angezeigt werden, welche Ableitungen einer Datei
 * existieren.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.File#getFileName <em>File Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getDate <em>Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getSize <em>Size</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getSha1Checksum <em>Sha1 Checksum</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getText <em>Text</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getAccessUrl <em>Access Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getExternalServiceUrl <em>External Service Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getDerivativeFile <em>Derivative File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.File#getFileLicense <em>File License</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getFile()
 * @model
 * @generated
 */
public interface File extends OParlElement {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Dateiname, unter dem die Datei in einem Dateisystem gespeichert werden kann.
	 * Beispiel: "einedatei.pdf". Da der Name den kompletten Unicode-Zeichenumfang
	 * nutzen kann, <b>sollten</b> Clients ggf. selbst dafür sorgen, diesen beim
	 * Speichern in ein Dateisystem den lokalen Erfordernissen anzupassen.
	 * </p>
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
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * MIME-Type der Datei
	 * </p>
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
	 *  <p>
	 * Datum und Zeit der Erstellung der Datei. Wahlweise, falls dies nicht vom
	 * System kommuniziert werden kann oder soll, <b>kann</b> alternativ der
	 * Zeitpunkt der Veröffentlichung ausgegeben werden.
	 * </p>
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Größe der Datei in Bytes.
	 * </p>
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
	 *  <p>
	 * SHA1-Prüfsumme des Dateiinhalts in Hexadezimal-Schreibweise.
	 * </p>
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
	 *  <p>
	 * Reine Text-Wiedergabe des Dateiinhalts, sofern dieser in Textform
	 * wiedergegeben werden kann.
	 * </p>
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
	 *  <p>
	 * URL zum allgemeinen Zugriff auf die Datei. Näheres unter
	 * <a href="https://oparl.org/spezifikation/online-ansicht/#dateizugriff">Dateizugriffe</a>.
	 * </p>
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
	 *  <p>
	 * URL zum Download der Datei. Näheres unter
	 * <a href="https://oparl.org/spezifikation/online-ansicht/#dateizugriff">Dateizugriffe</a>.
	 * </p>
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
	 * Returns the value of the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Externe URL, welche eine zusätzliche Zugriffsmöglichkeit bietet.
	 * Beispiel: YouTube-Video.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Service Url</em>' attribute.
	 * @see #setExternalServiceUrl(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_ExternalServiceUrl()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getExternalServiceUrl();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getExternalServiceUrl <em>External Service Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Service Url</em>' attribute.
	 * @see #getExternalServiceUrl()
	 * @generated
	 */
	void setExternalServiceUrl(String value);

	/**
	 * Returns the value of the '<em><b>Master File</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.File#getDerivativeFile <em>Derivative File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Datei, von der das aktuelle Objekt abgeleitet wurde. Details dazu in der
	 * allgemeinen Beschreibung weiter oben.
	 * </p>
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
	 *  <p>
	 * Datei, die von dem aktuellen Objekt abgeleitet wurde. Details dazu in der
	 * allgemeinen Beschreibung weiter oben.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivative File</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_DerivativeFile()
	 * @see de.oklab.leipzig.oparl.File#getMasterFile
	 * @model opposite="masterFile"
	 * @generated
	 */
	EList<File> getDerivativeFile();

	/**
	 * Returns the value of the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Lizenz, unter der die Datei angeboten wird. Wenn diese Eigenschaft nicht
	 * verwendet wird, ist der Wert von {@link File#license} beziehungsweise die
	 * Lizenz eines übergeordneten Objektes maßgeblich.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File License</em>' attribute.
	 * @see #setFileLicense(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getFile_FileLicense()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getFileLicense();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.File#getFileLicense <em>File License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File License</em>' attribute.
	 * @see #getFileLicense()
	 * @generated
	 */
	void setFileLicense(String value);

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
	 * Ein zur Anzeige für Endnutzer bestimmter Name für dieses Objekt.
	 * Leerzeichen <b>dürfen</b> enthalten sein, Datei-Endungen wie ".pdf"
	 * <b>sollten nicht</b> enthalten sein.
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
	 * Lizenz, unter der die Datei-Metadaten (dieses Objekt) angeboten werden.
	 * Wenn diese Eigenschaft verwendet wird, dann ist sie anstelle einer
	 * globalen Angabe im übergeordneten {@link Body}- bzw.
	 * {@link System}-Objekt  maßgeblich.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.URL" unique="false"
	 * @generated
	 */
	String getLicense();

} // File
