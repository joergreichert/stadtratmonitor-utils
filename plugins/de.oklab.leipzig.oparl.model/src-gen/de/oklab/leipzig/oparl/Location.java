/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Dieser Objekttyp dient dazu, den Ortsbezug einer Drucksache formal  abzubilden. Ortsangaben können sowohl aus
 * Textinformationen bestehen  (beispielsweise dem Namen einer Straße/eines Platzes oder eine genaue  Adresse) als auch
 * aus Geodaten. Ortsangaben sind auch nicht auf einzelne Positionen beschränkt, sondern können eine Vielzahl von
 * Positionen, Flächen, Strecken etc. abdecken.\n\nIn der Praxis soll dies dazu dienen, den geografischen Bezug eines
 * politischen Vorgangs, wie zum Beispiel eines Bauvorhabens oder der  Änderung eines Flächennutzungsplanes,
 * maschinenlesbar nachvollziehbar zu machen.\n\nDieser Objekttyp kann für Objekte im Kontext des Objekttyps
 * `oparl:Paper` verwendet werden.\n\nOParl sieht bei Angabe von Geodaten ZWINGEND die Verwendung des
 * Well-Known-Text-Formats (WKT) der Simple Feature Access Spezifikation^[Simple Feature Access Spezifikation:
 * <http://www.opengeospatial.org/standards/sfa>] vor. WKT erlaubt die Beschreibung von unterschiedlichen Geometrien
 * wie Punkten (`Point`), Pfaden (`LineString`), Polygonen (`Polygon`) und viele andere mehr.\n\nZum Zeitpunkt der
 * Erstellung der vorliegenden Spezifikation ist Version 1.2.1 der Simple-Feature-Access-Spezifikation aktuell.
 * OParl stellt keine Anforderungen daran, welche Version von Simple-Feature-Access bei der Ausgabe von WKT zu
 * unterstützen ist.\n\nFür die Ausgabe über eine OParl-API MÜSSEN sämtliche Koordinatenangaben solcher Geodaten
 * im System WGS84^[WGS84 steht für \"World Geodetic System 1984\", es wird unter anderem auch vom Global Positioning
 * System (GPS) verwendet. In geografischen Informationssystemen ist für das System der EPSG-Code 4326  geläufig.]
 * angegeben werden, und zwar in Form von Zahlenwerten (Fließkommazahlen) für Längen- und Breitengrad.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getDescription <em>Description</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Location#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Location$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Location#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Textliche Beschreibung eines Orts, z. B. in Form einer Adresse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Location#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geodaten-Repräsentation des Orts. Ist diese Eigenschaft gesetzt, MUSS ihr Wert der Spezifikation von
	 * Well-Known Text (WKT) entsprechen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Geometry()
	 * @model unique="false"
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Location#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Nullable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Keyword()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getKeyword();

} // Location
