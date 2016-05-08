/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.ResolutionFile#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.ResolutionFile#getPaper <em>Paper</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getResolutionFile()
 * @model
 * @generated
 */
public interface ResolutionFile extends File {
    /**
     * Returns the value of the '<em><b>Agenda Item</b></em>' reference list.
     * The list contents are of type {@link de.oklab.leipzig.oparl.AgendaItemResolutionFile}.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getResolutionFile <em>Resolution File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Rückfreferenzen auf AgendaItem-Objekte. Wird nur dann ausgegeben,
     * wenn das File-Objekt nicht als eingebettetes Objekt aufgerufen wird.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Agenda Item</em>' reference list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getResolutionFile_AgendaItem()
     * @see de.oklab.leipzig.oparl.AgendaItemResolutionFile#getResolutionFile
     * @model opposite="resolutionFile"
     * @generated
     */
    EList<AgendaItemResolutionFile> getAgendaItem();

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
     * @see de.oklab.leipzig.oparl.OparlPackage#getResolutionFile_Paper()
     * @model
     * @generated
     */
    EList<Paper> getPaper();

} // ResolutionFile
