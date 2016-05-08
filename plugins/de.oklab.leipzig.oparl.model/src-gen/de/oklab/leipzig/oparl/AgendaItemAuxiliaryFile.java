/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda Item Auxiliary File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItemAuxiliaryFile()
 * @model
 * @generated
 */
public interface AgendaItemAuxiliaryFile extends EObject {
    /**
     * Returns the value of the '<em><b>Agenda Item</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile <em>Auxiliary File</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Agenda Item</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Agenda Item</em>' container reference.
     * @see #setAgendaItem(AgendaItem)
     * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItemAuxiliaryFile_AgendaItem()
     * @see de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile
     * @model opposite="auxiliaryFile" transient="false"
     * @generated
     */
    AgendaItem getAgendaItem();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAgendaItem <em>Agenda Item</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Agenda Item</em>' container reference.
     * @see #getAgendaItem()
     * @generated
     */
    void setAgendaItem(AgendaItem value);

    /**
     * Returns the value of the '<em><b>Auxiliary File</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getAgendaItem <em>Agenda Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary File</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary File</em>' reference.
     * @see #setAuxiliaryFile(AuxiliaryFile)
     * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItemAuxiliaryFile_AuxiliaryFile()
     * @see de.oklab.leipzig.oparl.AuxiliaryFile#getAgendaItem
     * @model opposite="agendaItem"
     * @generated
     */
    AuxiliaryFile getAuxiliaryFile();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAuxiliaryFile <em>Auxiliary File</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auxiliary File</em>' reference.
     * @see #getAuxiliaryFile()
     * @generated
     */
    void setAuxiliaryFile(AuxiliaryFile value);

} // AgendaItemAuxiliaryFile
