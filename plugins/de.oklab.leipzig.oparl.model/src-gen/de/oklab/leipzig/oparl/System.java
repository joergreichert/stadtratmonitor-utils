/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Ein {@link System}-Objekt repräsentiert eine OParl-Schnittstelle für eine bestimmte OParl-Version.
 * Es ist außerdem der Startpunkt für Clients beim Zugriff auf einen Server.
 * </p>
 * <p>
 * Möchte ein Server mehrere zueinander inkompatible OParl-Versionen unterstützen, dann <b>muss</b> der Server für jede
 * Version eine eigenen OParl-Schnittstelle mit einem eigenen {@link System}-Objekt ausgeben.
 * </p>
 * <p>
 * Beispiel:
 * <pre>
 * {
 *   "id": "https://oparl.example.org/",
 *   "type": "https://oparl.org/schema/1.0/System",
 *   "oparlVersion": "https://oparl.org/specs/1.0/",
 *   "body": "https://oparl.example.org/bodies",
 *   "name": "Beispiel-System",
 *   "contactEmail": "info@example.org",
 *   "contactName": "Allgemeiner OParl Kontakt",
 *   "website": "http://www.example.org/",
 *   "vendor": "http://example-software.com/",
 *   "product": "http://example-software.com/oparl-server/",
 *   "otherOparlVersions": [
 *       "https://oparl2.example.org/"
 *   ]
 * }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.System#getOtherOparlVersions <em>Other Oparl Versions</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getBodies <em>Bodies</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem()
 * @model features="_oparlVersion _contactEmail" 
 *        _oparlVersionUnique="false" _oparlVersionDataType="org.eclipse.emf.ecore.EString" _oparlVersionSuppressedGetVisibility="true" _oparlVersionSuppressedSetVisibility="true"
 *        _contactEmailUnique="false" _contactEmailDataType="org.eclipse.emf.ecore.EString" _contactEmailSuppressedGetVisibility="true" _contactEmailSuppressedSetVisibility="true"
 * @generated
 */
public interface System extends OParlElement {
    /**
     * Returns the value of the '<em><b>Other Oparl Versions</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.System}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * *
     * Dient der Angabe von System-Objekten mit anderen OParl-Versionen.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Other Oparl Versions</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_OtherOparlVersions()
     * @model containment="true"
     * @generated
     */
    EList<System> getOtherOparlVersions();

    /**
     * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.Body}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * *
     * Link zur Objektliste mit allen Körperschaften, die auf dem System existieren.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bodies</em>' containment reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Bodies()
     * @see de.oklab.leipzig.oparl.Body#getSystem
     * @model opposite="system" containment="true"
     * @generated
     */
    EList<Body> getBodies();

    /**
     * Returns the value of the '<em><b>Contact Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name der Ansprechpartnerin bzw. des Ansprechpartners oder der Abteilung, die über die in
     * {@link System#contactEmail} angegebene Adresse erreicht werden kann.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Contact Name</em>' attribute.
     * @see #setContactName(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_ContactName()
     * @model unique="false"
     * @generated
     */
    String getContactName();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getContactName <em>Contact Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contact Name</em>' attribute.
     * @see #getContactName()
     * @generated
     */
    void setContactName(String value);

    /**
     * Returns the value of the '<em><b>Website</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * *
     * URL der Website des parlamentarischen Informationssystems
     * <!-- end-model-doc -->
     * @return the value of the '<em>Website</em>' attribute.
     * @see #setWebsite(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Website()
     * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
     * @generated
     */
    String getWebsite();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getWebsite <em>Website</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Website</em>' attribute.
     * @see #getWebsite()
     * @generated
     */
    void setWebsite(String value);

    /**
     * Returns the value of the '<em><b>Vendor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * *
     * URL der Website des Software-Anbieters, von dem die OParl-Server-Software stammt.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vendor</em>' attribute.
     * @see #setVendor(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Vendor()
     * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
     * @generated
     */
    String getVendor();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getVendor <em>Vendor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vendor</em>' attribute.
     * @see #getVendor()
     * @generated
     */
    void setVendor(String value);

    /**
     * Returns the value of the '<em><b>Product</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * *
     * URL zu Informationen über die auf dem System genutzte OParl-Server-Software
     * <!-- end-model-doc -->
     * @return the value of the '<em>Product</em>' attribute.
     * @see #setProduct(String)
     * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Product()
     * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
     * @generated
     */
    String getProduct();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getProduct <em>Product</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Product</em>' attribute.
     * @see #getProduct()
     * @generated
     */
    void setProduct(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"https://oparl.org/schema/1.0/System\";'"
     * @generated
     */
    String getType();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Die URL der OParl-Spezifikation, die von diesem Server unterstützt wird. Aktuell kommt hier nur ein
     * Wert in Frage. Mit zukünftigen OParl-Versionen kommen weitere mögliche URLs hinzu.
     * </p>
     * <p>
     * <b>Wert:</b> https://oparl.org/specs/1.0/
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.SystemImpl%>) this)._oparlVersion;'"
     * @generated
     */
    String getOparlVersion();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model versionUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _equals = <%com.google.common.base.Objects%>.equal(version, null);\nif (_equals)\n{\n\tthrow new <%java.lang.IllegalArgumentException%>(\"OParl version isn\\\'t allowed to be null\");\n}\nfinal <%java.lang.String%> patternStr = \"^mailto:.+$\";\nfinal <%java.util.regex.Pattern%> pattern = <%java.util.regex.Pattern%>.compile(patternStr);\nfinal <%java.util.regex.Matcher%> matcher = pattern.matcher(version);\nboolean _find = matcher.find();\nboolean _not = (!_find);\nif (_not)\n{\n\t<%java.lang.String%> _format = <%java.lang.String%>.format(\"%s doesn\\\'t follow pattern %s\", version, patternStr);\n\tthrow new <%java.lang.IllegalArgumentException%>(_format);\n}\n((<%de.oklab.leipzig.oparl.impl.SystemImpl%>) this)._oparlVersion = version;'"
     * @generated
     */
    void setOparlVersion(String version);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Nutzerfreundlicher Name für das System, mit dessen Hilfe Nutzerinnen und Nutzer das System erkennen und
     * von anderen unterscheiden können.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return super.getName();'"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * E-Mail-Adresse für Anfragen zur OParl-API. Die Angabe einer E-Mail-Adresse dient sowohl NutzerInnen wie
     * auch Entwicklerinnen von Clients zur Kontaktaufnahme mit dem Betreiber.
     * </p>
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.SystemImpl%>) this)._contactEmail;'"
     * @generated
     */
    String getContactEmail();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model contactEmailUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _notEquals = (!<%com.google.common.base.Objects%>.equal(contactEmail, null));\nif (_notEquals)\n{\n\tfinal <%java.lang.String%> patternStr = \"^^http://oparl\\\\.org/specs/1\\\\.0/$\";\n\tfinal <%java.util.regex.Pattern%> pattern = <%java.util.regex.Pattern%>.compile(patternStr);\n\tfinal <%java.util.regex.Matcher%> matcher = pattern.matcher(contactEmail);\n\tboolean _find = matcher.find();\n\tboolean _not = (!_find);\n\tif (_not)\n\t{\n\t\t<%java.lang.String%> _format = <%java.lang.String%>.format(\"%s doesn\\\'t follow pattern %s\", contactEmail, patternStr);\n\t\tthrow new <%java.lang.IllegalArgumentException%>(_format);\n\t}\n}\n((<%de.oklab.leipzig.oparl.impl.SystemImpl%>) this)._contactEmail = contactEmail;'"
     * @generated
     */
    void setContactEmail(String contactEmail);

} // System
