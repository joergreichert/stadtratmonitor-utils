/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Dieser Objekttyp dient dazu, einen Ortsbezug formal abzubilden.
 * Ortsangaben können sowohl aus Textinformationen bestehen
 * (beispielsweise dem Namen einer Straße/eines Platzes oder eine genaue Adresse)
 * als auch aus Geodaten. Ortsangaben sind auch nicht auf einzelne Positionen
 * beschränkt, sondern können eine Vielzahl von Positionen, Flächen, Strecken
 * etc. abdecken.
 * </p><p>
 * Geodaten müssen im GeoJSON-Format ausgegeben werden.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getDescription <em>Description</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getBodies <em>Bodies</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getMeetings <em>Meetings</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Location#getPapers <em>Papers</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends OParlElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Textuelle Beschreibung eines Orts, z. B. in Form einer Adresse.
	 * </p>
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
	 * Geodaten-Repräsentation des Orts. Der Wert dieser Eigenschaft <b>muss</b>
	 * der Spezifikation von GeoJSON entsprechen.
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
	 * Returns the value of the '<em><b>Bodies</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.BodyLocation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.BodyLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf Body-Objekte. Wird nur dann ausgegeben, wenn das
	 * Location-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bodies</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Bodies()
	 * @see de.oklab.leipzig.oparl.BodyLocation#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	EList<BodyLocation> getBodies();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.OrganizationLocation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.OrganizationLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf Organization-Objekte. Wird nur dann ausgegeben,
	 * wenn das Location-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organizations</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Organizations()
	 * @see de.oklab.leipzig.oparl.OrganizationLocation#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	EList<OrganizationLocation> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Meetings</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.MeetingLocation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.MeetingLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf Meeting-Objekte. Wird nur dann ausgegeben, wenn das
	 * Location-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meetings</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Meetings()
	 * @see de.oklab.leipzig.oparl.MeetingLocation#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	EList<MeetingLocation> getMeetings();

	/**
	 * Returns the value of the '<em><b>Papers</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.PaperLocation}.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.PaperLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf Paper-Objekte. Wird nur dann ausgegeben, wenn das
	 * Location-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Papers</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLocation_Papers()
	 * @see de.oklab.leipzig.oparl.PaperLocation#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	EList<PaperLocation> getPapers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"https://oparl.org/schema/1.0/Location\";'"
	 * @generated
	 */
	String getType();

} // Location
