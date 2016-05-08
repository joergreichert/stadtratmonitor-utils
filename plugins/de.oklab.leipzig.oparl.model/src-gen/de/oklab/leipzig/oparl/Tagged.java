/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.Tagged#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getTagged()
 * @model abstract="true"
 * @generated
 */
public interface Tagged extends Typed {
    /**
     * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  <p>
     * Die Eigenschaft keyword dient der optionalen Kategorisierung von Objekten und
     * ist in einer Vielzahl von Objekttypen zu diesem Zweck einsetzbar.
     * </p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Keyword</em>' attribute list.
     * @see de.oklab.leipzig.oparl.OparlPackage#getTagged_Keyword()
     * @model unique="false"
     * @generated
     */
    EList<String> getKeyword();

} // Tagged
