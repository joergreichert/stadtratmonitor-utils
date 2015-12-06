/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting <em>Meeting</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getAuxiliaryFile()
 * @model
 * @generated
 */
public interface AuxiliaryFile extends File {
	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meeting</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting</em>' container reference.
	 * @see #setMeeting(Meeting)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getAuxiliaryFile_Meeting()
	 * @see de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile
	 * @model opposite="auxiliaryFile" transient="false"
	 * @generated
	 */
	Meeting getMeeting();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting <em>Meeting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting</em>' container reference.
	 * @see #getMeeting()
	 * @generated
	 */
	void setMeeting(Meeting value);

} // AuxiliaryFile
