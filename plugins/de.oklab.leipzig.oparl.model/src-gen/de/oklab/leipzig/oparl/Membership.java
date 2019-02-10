/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  <p>
 * Über Objekte diesen Typs wird die Mitgliedschaft von Personen in
 * Gruppierungen dargestellt. Diese Mitgliedschaften können zeitlich
 * begrenzt sein. Zudem kann abgebildet werden, dass eine Person eine
 * bestimmte Rolle bzw. Position innerhalb der Gruppierung inne hat,
 * beispielsweise den Vorsitz einer Fraktion.
 * </p>
 * <p>Beispiel:
 * <pre>
 *      {
 *          "id": "https://oparl.example.org/memberships/385",
 *          "type": "https://oparl.org/schema/1.0/Membership",
 *          "organization": "https://oparl.example.org/organizations/5",
 *          "role": "Vorsitzende",
 *          "votingRight": true,
 *          "startDate": "2013-12-03T16:30:00+01:00"
 *      }
 * </pre>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getRole <em>Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#isVotingRight <em>Voting Right</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getOnBehalfOf <em>On Behalf Of</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends InnerOParlElement {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Person#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückreferenz auf Person, welches nur dann ausgegeben wird, wenn das
	 * Membership-Objekt einzeln abgerufen ist, d.h. nicht Teil einer internen Ausgabe ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' container reference.
	 * @see #setPerson(Person)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Person()
	 * @see de.oklab.leipzig.oparl.Person#getMembership
	 * @model opposite="membership" transient="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' container reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Die Gruppierung, in der die Person Mitglied ist oder war.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see #setOrganization(Organization)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Organization()
	 * @see de.oklab.leipzig.oparl.Organization#getMembership
	 * @model opposite="membership" transient="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' container reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rolle der Person für die Gruppierung. Kann genutzt werden, um
	 * verschiedene Arten von Mitgliedschaften zum Beispiel in Gremien zu
	 * unterscheiden.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Voting Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Gibt an, ob die Person in der Gruppierung stimmberechtigtes Mitglied ist.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voting Right</em>' attribute.
	 * @see #setVotingRight(boolean)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_VotingRight()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVotingRight();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#isVotingRight <em>Voting Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voting Right</em>' attribute.
	 * @see #isVotingRight()
	 * @generated
	 */
	void setVotingRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Anfangszeitpunkt der Mitgliedschaft.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_StartDate()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Der Endzeitpunkt der Mitgliedschaft.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_EndDate()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.Date"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Die Gruppierung, für die die Person in der unter organization angegebenen
	 * Organisation sitzt. Beispiel: Mitgliedschaft als Vertreter einer
	 * Ratsfraktion, einer Gruppierung oder einer externen Organisation.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' reference.
	 * @see #setOnBehalfOf(Organization)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_OnBehalfOf()
	 * @model
	 * @generated
	 */
	Organization getOnBehalfOf();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getOnBehalfOf <em>On Behalf Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Organization value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.OParlType" unique="false"
	 * @generated
	 */
	String getType();

} // Membership
