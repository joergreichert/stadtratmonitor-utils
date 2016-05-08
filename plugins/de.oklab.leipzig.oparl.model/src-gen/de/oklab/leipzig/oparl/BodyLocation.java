/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.BodyLocation#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.BodyLocation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getBodyLocation()
 * @model
 * @generated
 */
public interface BodyLocation extends EObject {
    /**
     * Returns the value of the '<em><b>Body</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Body#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' container reference.
     * @see #setBody(Body)
     * @see de.oklab.leipzig.oparl.OparlPackage#getBodyLocation_Body()
     * @see de.oklab.leipzig.oparl.Body#getLocation
     * @model opposite="location" transient="false"
     * @generated
     */
    Body getBody();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.BodyLocation#getBody <em>Body</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' container reference.
     * @see #getBody()
     * @generated
     */
    void setBody(Body value);

    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.oklab.leipzig.oparl.Location#getBodies <em>Bodies</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #setLocation(Location)
     * @see de.oklab.leipzig.oparl.OparlPackage#getBodyLocation_Location()
     * @see de.oklab.leipzig.oparl.Location#getBodies
     * @model opposite="bodies"
     * @generated
     */
    Location getLocation();

    /**
     * Sets the value of the '{@link de.oklab.leipzig.oparl.BodyLocation#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(Location value);

} // BodyLocation
