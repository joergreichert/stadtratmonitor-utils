/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getIdentifiable()
 * @model abstract="true"
 *        features="_id" 
 *        _idUnique="false" _idDataType="de.oklab.leipzig.oparl.URL" _idSuppressedGetVisibility="true" _idSuppressedSetVisibility="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Die Eigenschaft id ist für jeden OParl-Objekttypen vorgegeben und
	 * enthält den eindeutigen Bezeichner des Objekts, nämlich seine URL.
	 * Dies ist ein zwingendes Merkmal für jedes Objekt.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="de.oklab.leipzig.oparl.URL" unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model _idDataType="de.oklab.leipzig.oparl.URL" _idUnique="false"
	 * @generated
	 */
	void setId(String _id);

} // Identifiable
