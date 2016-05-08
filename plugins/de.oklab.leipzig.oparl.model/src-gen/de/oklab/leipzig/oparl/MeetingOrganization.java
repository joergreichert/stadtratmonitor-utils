/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.MeetingOrganization#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.MeetingOrganization#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getMeetingOrganization()
 * @model
 * @generated
 */
public interface MeetingOrganization extends EObject {
    /**
     * Returns the value of the '<em><b>Meeting</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meeting</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meeting</em>' reference.
     * @see #setMeeting(Meeting)
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeetingOrganization_Meeting()
     * @see de.oklab.leipzig.oparl.Meeting#getOrganization
     * @model opposite="organization"
     * @generated
     */
    Meeting getMeeting();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.MeetingOrganization#getMeeting <em>Meeting</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meeting</em>' reference.
     * @see #getMeeting()
     * @generated
     */
    void setMeeting(Meeting value);

    /**
     * Returns the value of the '<em><b>Organization</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Organization#getMeeting <em>Meeting</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Organization</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Organization</em>' container reference.
     * @see #setOrganization(Organization)
     * @see de.oklab.leipzig.oparl.OparlPackage#getMeetingOrganization_Organization()
     * @see de.oklab.leipzig.oparl.Organization#getMeeting
     * @model opposite="meeting" transient="false"
     * @generated
     */
    Organization getOrganization();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.MeetingOrganization#getOrganization <em>Organization</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Organization</em>' container reference.
     * @see #getOrganization()
     * @generated
     */
    void setOrganization(Organization value);

} // MeetingOrganization
