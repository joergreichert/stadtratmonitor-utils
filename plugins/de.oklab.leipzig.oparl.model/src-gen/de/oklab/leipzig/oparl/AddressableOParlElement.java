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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl%>) this)._streetAddress;'"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addressUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='((<%de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl%>) this)._streetAddress = address;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl%>) this)._postalCode;'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model postalCodeUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='((<%de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl%>) this)._postalCode = postalCode;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((<%de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl%>) this)._locality;'"
	 * @generated
	 */
	String getLocality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model localityUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='((<%de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl%>) this)._locality = locality;'"
	 * @generated
	 */
	void setLocality(String locality);

} // AddressableOParlElement
