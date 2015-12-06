/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legislative Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Dieser Objekttyp dient der Beschreibung einer Wahlperiode.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.LegislativeTerm#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm()
 * @model
 * @generated
 */
public interface LegislativeTerm extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/LegislativeTerm$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getLegislativeTerm <em>Legislative Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Die Körperschaft, der diese Wahlperiode zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Body)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getLegislativeTerm_Body()
	 * @see de.oklab.leipzig.oparl.Body#getLegislativeTerm
	 * @model opposite="legislativeTerm"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}' reference.
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
	 *  Nutzerfreundliche Bezeichnung der Wahlperiode.
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
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Der erste Tag der Wahlperiode.
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
	 *  Der letzte Tag der Wahlperiode.
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

} // LegislativeTerm
