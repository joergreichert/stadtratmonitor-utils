/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.ResultsProtocol#getMeeting <em>Meeting</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.ResultsProtocol#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.ResultsProtocol#getPaper <em>Paper</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getResultsProtocol()
 * @model
 * @generated
 */
public interface ResultsProtocol extends File {
	/**
	 * Returns the value of the '<em><b>Meeting</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Meeting#getResultsProtocol <em>Results Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf Meeting-Objekte. Wird nur dann ausgegeben, wenn das
	 * File-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meeting</em>' container reference.
	 * @see #setMeeting(Meeting)
	 * @see de.oklab.leipzig.oparl.OparlPackage#getResultsProtocol_Meeting()
	 * @see de.oklab.leipzig.oparl.Meeting#getResultsProtocol
	 * @model opposite="resultsProtocol" transient="false"
	 * @generated
	 */
	Meeting getMeeting();

	/**
	 * Sets the value of the '{@link de.oklab.leipzig.oparl.ResultsProtocol#getMeeting <em>Meeting</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting</em>' container reference.
	 * @see #getMeeting()
	 * @generated
	 */
	void setMeeting(Meeting value);

	/**
	 * Returns the value of the '<em><b>Agenda Item</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.AgendaItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf AgendaItem-Objekte. Wird nur dann ausgegeben,
	 * wenn das File-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agenda Item</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getResultsProtocol_AgendaItem()
	 * @model
	 * @generated
	 */
	EList<AgendaItem> getAgendaItem();

	/**
	 * Returns the value of the '<em><b>Paper</b></em>' reference list.
	 * The list contents are of type {@link de.oklab.leipzig.oparl.Paper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Rückfreferenzen auf Paper-Objekte. Wird nur dann ausgegeben, wenn das
	 * File-Objekt nicht als eingebettetes Objekt aufgerufen wird.
	 * </ü>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper</em>' reference list.
	 * @see de.oklab.leipzig.oparl.OparlPackage#getResultsProtocol_Paper()
	 * @model
	 * @generated
	 */
	EList<Paper> getPaper();

} // ResultsProtocol
