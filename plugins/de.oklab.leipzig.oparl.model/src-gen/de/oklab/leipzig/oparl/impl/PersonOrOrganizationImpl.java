/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.PersonOrOrganization;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Or Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PersonOrOrganizationImpl extends AddressableOParlElementImpl implements PersonOrOrganization {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonOrOrganizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OparlPackage.Literals.PERSON_OR_ORGANIZATION;
    }

} //PersonOrOrganizationImpl
