/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda Item Resolution File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getResolutionFile <em>Resolution File</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItemResolutionFile()
 * @model
 * @generated
 */
public interface AgendaItemResolutionFile extends EObject {
    /**
     * Returns the value of the '<em><b>Agenda Item</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionFile <em>Resolution File</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Agenda Item</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Agenda Item</em>' container reference.
     * @see #setAgendaItem(AgendaItem)
     * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItemResolutionFile_AgendaItem()
     * @see de.oklab.leipzig.oparl.AgendaItem#getResolutionFile
     * @model opposite="resolutionFile" transient="false"
     * @generated
     */
    AgendaItem getAgendaItem();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getAgendaItem <em>Agenda Item</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Agenda Item</em>' container reference.
     * @see #getAgendaItem()
     * @generated
     */
    void setAgendaItem(AgendaItem value);

    /**
     * Returns the value of the '<em><b>Resolution File</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.ResolutionFile#getAgendaItem <em>Agenda Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution File</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolution File</em>' reference.
     * @see #setResolutionFile(ResolutionFile)
     * @see de.oklab.leipzig.oparl.OparlPackage#getAgendaItemResolutionFile_ResolutionFile()
     * @see de.oklab.leipzig.oparl.ResolutionFile#getAgendaItem
     * @model opposite="agendaItem"
     * @generated
     */
    ResolutionFile getResolutionFile();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getResolutionFile <em>Resolution File</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolution File</em>' reference.
     * @see #getResolutionFile()
     * @generated
     */
    void setResolutionFile(ResolutionFile value);

} // AgendaItemResolutionFile
