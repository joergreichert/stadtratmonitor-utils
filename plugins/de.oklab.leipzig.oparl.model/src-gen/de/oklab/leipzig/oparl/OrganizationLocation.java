/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.OrganizationLocation#getOrganziation <em>Organziation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.OrganizationLocation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganizationLocation()
 * @model
 * @generated
 */
public interface OrganizationLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Organziation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organziation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organziation</em>' container reference.
	 * @see #setOrganziation(Organization)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganizationLocation_Organziation()
	 * @see de.oklab.leipzig.oparl.Organization#getLocation
	 * @model opposite="location" transient="false"
	 * @generated
	 */
	Organization getOrganziation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.OrganizationLocation#getOrganziation <em>Organziation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organziation</em>' container reference.
	 * @see #getOrganziation()
	 * @generated
	 */
	void setOrganziation(Organization value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Location#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getOrganizationLocation_Location()
	 * @see de.oklab.leipzig.oparl.Location#getOrganizations
	 * @model opposite="organizations"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.OrganizationLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // OrganizationLocation
