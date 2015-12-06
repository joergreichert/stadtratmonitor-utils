/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * **Namespace-URL:** `http://oparl.org/schema/1.0/System`\n\nDer Objekttyp `oparl:System` bildet grundlegende
 * Informationen zum parlamentarischen Informationssystem ab. Das Objekt repräsentiert das technische System,
 * unabhängig von der Frage, welche Körperschaften auf diesem System vertreten sind.\n\nAuf jedem OParl-Server
 * MUSS ein Objekt vom Typ `oparl:System` vorgehalten werden. Es DARF nur ein einziges solches Objekt je Server
 * existieren.\n\nFür Clients ist das `oparl:System` Objekt ein geeigneter Einstiegspunkt, um grundlegende
 * Informationen über das System zu bekommen und die URLs zum Zugriff auf andere Informationen in Erfahrung zu
 * bringen.\n\nDie URL des `oparl:System`-Objekts MUSS per Definition identisch mit der URL des API-Endpunkts
 * des Servers sein.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.System#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getOparlVersion <em>Oparl Version</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getBodies <em>Bodies</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getNewObjects <em>New Objects</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getUpdatedObjects <em>Updated Objects</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getRemovedObjects <em>Removed Objects</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.System#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/System$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Oparl Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die URL der OParl-Spezifikation, die von diesem Server unterstützt wird. Aktuell kommt hier nur ein Wert
	 * in Frage. Mit zukünftigen OParl-Versionen kommen weitere mögliche URLs hinzu. Wert: `http://oparl.org/specs/1.0/`
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oparl Version</em>' attribute.
	 * @see #setOparlVersion(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_OparlVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getOparlVersion();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getOparlVersion <em>Oparl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oparl Version</em>' attribute.
	 * @see #getOparlVersion()
	 * @generated
	 */
	void setOparlVersion(String value);

	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Body}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Liste der Körperschaften (`oparl:Body`-Objekte), die auf dem System existieren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bodies</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Bodies()
	 * @see de.oklab.leipzig.oparl.Body#getSystem
	 * @model opposite="system"
	 * @generated
	 */
	EList<Body> getBodies();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E-Mail-Adresse für Anfragen zur OParl-API. Die Angabe einer E-Mail-Adresse dient sowohl NutzerInnen wie
	 * auch Entwicklerinnen von Clients zur Kontaktaufnahme mit dem Betreiber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pattern("^mailto:.+$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Email</em>' attribute.
	 * @see #setContactEmail(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_ContactEmail()
	 * @model unique="false"
	 * @generated
	 */
	String getContactEmail();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getContactEmail <em>Contact Email</em>}' attribute.
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
	 * Name der Ansprechpartnerin bzw. des Ansprechpartners oder der Abteilung, die über die in `contactEmail`
	 * angegebene Adresse erreicht werden kann.
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
	 * Returns the value of the '<em><b>New Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL des Feeds \"Neue Objekte\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Objects</em>' attribute.
	 * @see #setNewObjects(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_NewObjects()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getNewObjects();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getNewObjects <em>New Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Objects</em>' attribute.
	 * @see #getNewObjects()
	 * @generated
	 */
	void setNewObjects(String value);

	/**
	 * Returns the value of the '<em><b>Updated Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL des Feeds \"Geänderte Objekte\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updated Objects</em>' attribute.
	 * @see #setUpdatedObjects(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_UpdatedObjects()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getUpdatedObjects();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getUpdatedObjects <em>Updated Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Objects</em>' attribute.
	 * @see #getUpdatedObjects()
	 * @generated
	 */
	void setUpdatedObjects(String value);

	/**
	 * Returns the value of the '<em><b>Removed Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL des Feeds \"Entfernte Objekte\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removed Objects</em>' attribute.
	 * @see #setRemovedObjects(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getSystem_RemovedObjects()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getRemovedObjects();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.System#getRemovedObjects <em>Removed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Objects</em>' attribute.
	 * @see #getRemovedObjects()
	 * @generated
	 */
	void setRemovedObjects(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL der Website des parlamentarischen Informationssystems
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
	 *  URL der Website des Software-Anbieters, von dem die OParl-Server-Software stammt.
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
	 *  URL zu Informationen über die auf dem System genutzte OParl-Server-Software
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

} // System
