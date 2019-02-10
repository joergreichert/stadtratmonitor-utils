/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Dated#getCreated <em>Created</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Dated#getModified <em>Modified</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getDated()
 * @model abstract="true"
 * @generated
 */
public interface Dated extends Named {
	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Datum und Uhrzeit der Erstellung des jeweiligen Objekts.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getDated_Created()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Dated#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Diese Eigenschaft kennzeichnet stets Datum und Uhrzeit der letzten Änderung
	 * des jeweiligen Objekts.
	 * </p><p>
	 * In Einzelfällen unterliegt die Frage, was als Änderung eines Objekts bezeichnet
	 * werden kann, einem gewissen Interpretationsspielraum. Beispielsweise ist zu
	 * entscheiden, ob eine Gruppierung (oparl:Organization) als geändert gilt, wenn
	 * ein neues Mitglied hinzugefügt wurde.
	 * </p><p>
	 * Diese Frage sollte aus Sicht des OParl-Clients beantwortet werden. Wenn
	 * beispielsweise eine Gruppierung vom Server grundsätzlich mit der Liste der URLs
	 * aller Mitglieder ausgegeben wird, umfasst das Objekt aus Sicht des Clients eben
	 * auch die Liste der Mitglieder. In diesem Fall wäre eine Veränderung der Liste
	 * der Mitglieder als Änderung des Objekts zu verstehen, die im modified
	 * Zeitstempel widerspiegeln sollte.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getDated_Modified()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Dated#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

} // Dated
