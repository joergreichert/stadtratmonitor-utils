/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invitation File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.InvitationFile#getMeeting <em>Meeting</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getInvitationFile()
 * @model
 * @generated
 */
public interface InvitationFile extends File {
	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getInvitation <em>Invitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meeting</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting</em>' container reference.
	 * @see #setMeeting(Meeting)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getInvitationFile_Meeting()
	 * @see de.oklab.leipzig.oparl.Meeting#getInvitation
	 * @model opposite="invitation" transient="false"
	 * @generated
	 */
	Meeting getMeeting();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.InvitationFile#getMeeting <em>Meeting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting</em>' container reference.
	 * @see #getMeeting()
	 * @generated
	 */
	void setMeeting(Meeting value);

} // InvitationFile
