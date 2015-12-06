/**
 */
package de.oklab.leipzig.oparl;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Über Objekte diesen Typs wird die Mitgliedschaft von Personen in Gruppierungen dargestellt. Diese Mitgliedschaften
 * können zeitlich begrenzt sein. Zudem kann abgebildet werden, dass eine Person eine bestimmte Rolle bzw. Position
 * innerhalb der Gruppierung inne hat, beispielsweise den Vorsitz einer Fraktion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getRole <em>Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getPost <em>Post</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#isVotingRight <em>Voting Right</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.Membership#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends EObject {
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
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Id()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getId <em>Id</em>}' attribute.
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
	 * Pattern("^http://oparl\\.org/schema/1\\.0/Membership$")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Person#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Die betreffende Person, die Mitglied einer Gruppierung ist oder war.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Person()
	 * @see de.oklab.leipzig.oparl.Person#getMembership
	 * @model opposite="membership"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Organization()
	 * @see de.oklab.leipzig.oparl.Organization#getMembership
	 * @model opposite="membership"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rolle der Person für die Gruppierung. Kann genutzt werden, um verschiedene Arten von Mitgliedschaften zum Beispiel
	 * in Gremien zu unterscheiden. Diese Eigenschaft funktioniert wie in
	 * [Vokabulare zur Klassifizierung](#vokabulare_klassifizierung) beschrieben entweder als URL zu einem skos:Concept
	 * oder als String. Der String (oder entsprechend das prefLabel des verlinkten Objekts) SOLL in dieser Form sowohl
	 * die männliche als auch die weibliche Rollenbezeichnung enthalten: `\"Vorsitzender | Vorsitzende\"`.
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
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The post held by the person in the organization. TODO: Prüfen, ob das ohne JSON-LD Sinn macht, oder ob hier
	 * zusätzliche Erläuterungen notwendig sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_Post()
	 * @model unique="false"
	 * @generated
	 */
	String getPost();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(String value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entsendende Gruppierung, Fraktion, fraktionsloses oder externes Gremium. Es kann auch Mitglieder geben, die von
	 * keiner anderen Gruppierung entsendet wurden (z. B. fraktionslose Abgeordnete). Da eine solche Person sich gewissermaßen
	 * selbst \"entsendet\" hat, SOLL in dem Fall hier der selbe Wert angegeben werden wie bei der Eigenschaft `person`.
	 * ^[ Dies entspricht `opengov:onBehalfOf` in Popolo. <http://popoloproject.com/specs/membership.html>]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' attribute.
	 * @see #setOnBehalfOf(String)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getMembership_OnBehalfOf()
	 * @model unique="false" dataType="de.oklab.leipzig.oparl.URL"
	 * @generated
	 */
	String getOnBehalfOf();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.Membership#getOnBehalfOf <em>On Behalf Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' attribute.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(String value);

	/**
	 * Returns the value of the '<em><b>Voting Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Gibt an, ob die Person in der Gruppierung stimmberechtigtes Mitglied ist.
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
	 * Anfangszeitpunkt der Mitgliedschaft.^[Abgeleitet von: `schema:validFrom` in Popolo.
	 * <http://popoloproject.com/specs/membership.html>]
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
	 * Der Endzeitpunkt der Mitgliedschaft.^[Abgeleitet von: `schema:validThrough` in Popolo.
	 * <http://popoloproject.com/specs/membership.html>]
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

} // Membership
