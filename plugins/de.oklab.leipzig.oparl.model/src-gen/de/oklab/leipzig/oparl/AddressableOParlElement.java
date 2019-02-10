/**
 */
package de.oklab.leipzig.oparl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressable OParl Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * </ul>
 *
 * @see de.oklab.leipzig.oparl.OparlPackage#getAddressableOParlElement()
 * @model features="_streetAddress _postalCode _locality" 
 *        _streetAddressUnique="false" _streetAddressDataType="org.eclipse.emf.ecore.EString" _streetAddressSuppressedGetVisibility="true" _streetAddressSuppressedSetVisibility="true"
 *        _postalCodeUnique="false" _postalCodeDataType="org.eclipse.emf.ecore.EString" _postalCodeSuppressedGetVisibility="true" _postalCodeSuppressedSetVisibility="true"
 *        _localityUnique="false" _localityDataType="org.eclipse.emf.ecore.EString" _localitySuppressedGetVisibility="true" _localitySuppressedSetVisibility="true"
 * @generated
 */
public interface AddressableOParlElement extends OParlElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Straße und Hausnummer der Körperschaft.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addressUnique="false"
	 * @generated
	 */
	void setStreetAddress(String address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Postleitzahl der Körperschaft.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model postalCodeUnique="false"
	 * @generated
	 */
	void setPostalCode(String postalCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  <p>
	 * Ortsangabe der Körperschaft.
	 * </p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getLocality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model localityUnique="false"
	 * @generated
	 */
	void setLocality(String locality);

} // AddressableOParlElement
