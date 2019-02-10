/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legislative Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Dieser Objekttyp dient der Beschreibung einer Wahlperiode.
 * </p>
 * <p>Beispiel:
 * <pre>
 * "legislativeTerm": [
 *       {
 *           "id": "https://oparl.example.org/term/21",
 *           "type": "https://oparl.org/schema/1.0/LegislativeTerm",
 *           "body": "https://oparl.example.org/body/0",
 *           "name": "21. Wahlperiode",
 *           "startDate": "2010-12-03",
 *           "endDate": "2013-12-03"
 *       }
 *   ]
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm()
 * @model
 * @generated
 */
public interface LegislativeTerm extends InnerOParlElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Nutzerfreundliche Bezeichnung der Wahlperiode.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getLegislativeTerm <em>Legislative Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückreferenz auf die Körperschaft, welche nur dann ausgegeben wird, wenn das LegislativeTerm-Objekt einzeln
	 * abgerufen ist, d.h. nicht Teil einer internen Ausgabe ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' container reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_Body()
	 * @see de.oklab.leipzig.oparl.Body#getLegislativeTerm
	 * @model opposite="legislativeTerm" transient="false"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' container reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Der erste Tag der Wahlperiode.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Der letzte Tag der Wahlperiode.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 * @generated
	 */
	String getType();

} // LegislativeTerm
