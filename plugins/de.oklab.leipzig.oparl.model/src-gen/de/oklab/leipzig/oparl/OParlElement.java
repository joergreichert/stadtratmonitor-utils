/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OParl Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.OParlElement#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.OParlElement#getLicense <em>License</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.OParlElement#isDeleted <em>Deleted</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getOParlElement()
 * @model abstract="true"
 * @generated
 */
public interface OParlElement extends Dated {
    /**
     * Returns the value of the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Beide Eigenschaften können bei vielen Objekttypen genutzt werden,
     * um den Namen des Objekts anzugeben. Üblicherweise ist name eine
     * Pflichteigenschaft für den ausgeschriebenen offiziellen Namen,
     * während shortName optional angegeben werden kann. Dies ist
     * dann zu empfehlen, wenn zu einem Namen eine kurze bzw. kompakte
     * und eine längere, aber weniger nutzerfreundliche Variante existieren.
     * Ein Beispiel wäre die Kurzform "CDU" für den offiziellen Parteinamen
     * "Christlich Demokratische Union Deutschlands".
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Short Name</em>' attribute.
     * @see #setShortName(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getOParlElement_ShortName()
     * @model unique="false"
     * @generated
     */
    String getShortName();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.OParlElement#getShortName <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Name</em>' attribute.
     * @see #getShortName()
     * @generated
     */
    void setShortName(String value);

    /**
     * Returns the value of the '<em><b>License</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Die Eigenschaft license erlaubt es, am jeweiligen Objekt die URL einer
     * Lizenz anzugeben. Damit wird gekennzeichnet, welche Lizenz der Veröffentlicher
     * der Daten für das jeweilige Objekt vergibt.
     * </p><p>
     * Eine besondere Bedeutung hat die Eigenschaft license, wenn sie am oparl:System
     * Objekt oder am oparl:Body Objekt vergeben wird. Die hier angegebene
     * Lizenzinformation sagt aus, dass alle Objekte dieses Systems bzw. der
     * Körperschaft unter der angegebenen Lizenz veröffentlicht werden, sofern dies
     * nicht am jeweiligen Objekt mit einer anders lautenden Lizenz-URL überschrieben
     * wird. Daher wird dringend empfohlen, die Lizenzinformation global am
     * oparl:System Objekt mitzuteilen und auf redundante Informationen zu verzichten.
     * </p><p>
     * An Objekten vom Typ oparl:File auftretend, bezieht sich die Lizenzinformation
     * nicht nur auf die strukturierten Metadaten, die über die API bezogen werden,
     * sondern auch auf den eigentlichen Inhalt der Datei(en), die über die angebotene(n)
     * URL(s) abgerufen werden können.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>License</em>' attribute.
     * @see #setLicense(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getOParlElement_License()
     * @model unique="false"
     * @generated
     */
    String getLicense();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.OParlElement#getLicense <em>License</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>License</em>' attribute.
     * @see #getLicense()
     * @generated
     */
    void setLicense(String value);

    /**
     * Returns the value of the '<em><b>Deleted</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Falls das Objekt gelöscht wurde, muss dieses gemäß Kapitel 2.8 das Attribut
     * deleted: true bekommen.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deleted</em>' attribute.
     * @see #setDeleted(boolean)
     * @see de.oklab.leipzig.oparl.OparlPackage#getOParlElement_Deleted()
     * @model default="false" unique="false"
     * @generated
     */
    boolean isDeleted();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.OParlElement#isDeleted <em>Deleted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deleted</em>' attribute.
     * @see #isDeleted()
     * @generated
     */
    void setDeleted(boolean value);

} // OParlElement
