/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AddressableOParlElement;
import de.oklab.leipzig.oparl.OparlPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressable OParl Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl#get_streetAddress <em>street Address</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl#get_postalCode <em>postal Code</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl#get_locality <em>locality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressableOParlElementImpl extends OParlElementImpl implements AddressableOParlElement {
    /**
     * The default value of the '{@link #get_streetAddress() <em>street Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_streetAddress()
     * @generated
     * @ordered
     */
    protected static final String _STREET_ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #get_streetAddress() <em>street Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_streetAddress()
     * @generated
     * @ordered
     */
    protected String _streetAddress = _STREET_ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #get_postalCode() <em>postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_postalCode()
     * @generated
     * @ordered
     */
    protected static final String _POSTAL_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #get_postalCode() <em>postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_postalCode()
     * @generated
     * @ordered
     */
    protected String _postalCode = _POSTAL_CODE_EDEFAULT;

    /**
     * The default value of the '{@link #get_locality() <em>locality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_locality()
     * @generated
     * @ordered
     */
    protected static final String _LOCALITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #get_locality() <em>locality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #get_locality()
     * @generated
     * @ordered
     */
    protected String _locality = _LOCALITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AddressableOParlElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OparlPackage.Literals.ADDRESSABLE_OPARL_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String get_streetAddress() {
        return _streetAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void set_streetAddress(String new_streetAddress) {
        String old_streetAddress = _streetAddress;
        _streetAddress = new_streetAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS, old_streetAddress, _streetAddress));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String get_postalCode() {
        return _postalCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void set_postalCode(String new_postalCode) {
        String old_postalCode = _postalCode;
        _postalCode = new_postalCode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE, old_postalCode, _postalCode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String get_locality() {
        return _locality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void set_locality(String new_locality) {
        String old_locality = _locality;
        _locality = new_locality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.ADDRESSABLE_OPARL_ELEMENT__LOCALITY, old_locality, _locality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStreetAddress() {
        return ((AddressableOParlElementImpl) this)._streetAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStreetAddress(final String address) {
        ((AddressableOParlElementImpl) this)._streetAddress = address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPostalCode() {
        return ((AddressableOParlElementImpl) this)._postalCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostalCode(final String postalCode) {
        ((AddressableOParlElementImpl) this)._postalCode = postalCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocality() {
        return ((AddressableOParlElementImpl) this)._locality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocality(final String locality) {
        ((AddressableOParlElementImpl) this)._locality = locality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS:
                return get_streetAddress();
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE:
                return get_postalCode();
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__LOCALITY:
                return get_locality();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS:
                set_streetAddress((String)newValue);
                return;
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE:
                set_postalCode((String)newValue);
                return;
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__LOCALITY:
                set_locality((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS:
                set_streetAddress(_STREET_ADDRESS_EDEFAULT);
                return;
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE:
                set_postalCode(_POSTAL_CODE_EDEFAULT);
                return;
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__LOCALITY:
                set_locality(_LOCALITY_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS:
                return _STREET_ADDRESS_EDEFAULT == null ? _streetAddress != null : !_STREET_ADDRESS_EDEFAULT.equals(_streetAddress);
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE:
                return _POSTAL_CODE_EDEFAULT == null ? _postalCode != null : !_POSTAL_CODE_EDEFAULT.equals(_postalCode);
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT__LOCALITY:
                return _LOCALITY_EDEFAULT == null ? _locality != null : !_LOCALITY_EDEFAULT.equals(_locality);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS:
                return getStreetAddress();
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING:
                setStreetAddress((String)arguments.get(0));
                return null;
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE:
                return getPostalCode();
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING:
                setPostalCode((String)arguments.get(0));
                return null;
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY:
                return getLocality();
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING:
                setLocality((String)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (_streetAddress: ");
        result.append(_streetAddress);
        result.append(", _postalCode: ");
        result.append(_postalCode);
        result.append(", _locality: ");
        result.append(_locality);
        result.append(')');
        return result.toString();
    }

} //AddressableOParlElementImpl
