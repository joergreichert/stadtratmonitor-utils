/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paper Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.PaperLocation#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.PaperLocation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getPaperLocation()
 * @model
 * @generated
 */
public interface PaperLocation extends EObject {
    /**
     * Returns the value of the '<em><b>Paper</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Paper#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Paper</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Paper</em>' container reference.
     * @see #setPaper(Paper)
     * @see de.oklab.leipzig.oparl.OparlPackage#getPaperLocation_Paper()
     * @see de.oklab.leipzig.oparl.Paper#getLocation
     * @model opposite="location" transient="false"
     * @generated
     */
    Paper getPaper();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.PaperLocation#getPaper <em>Paper</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Paper</em>' container reference.
     * @see #getPaper()
     * @generated
     */
    void setPaper(Paper value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Location#getPapers <em>Papers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #setLocation(Location)
     * @see de.oklab.leipzig.oparl.OparlPackage#getPaperLocation_Location()
     * @see de.oklab.leipzig.oparl.Location#getPapers
     * @model opposite="papers"
     * @generated
     */
    Location getLocation();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.PaperLocation#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(Location value);

} // PaperLocation
