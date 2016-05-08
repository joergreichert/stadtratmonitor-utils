/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.oklab.leipzig.oparl.OparlPackage
 * @generated
 */
public interface OparlFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OparlFactory eINSTANCE = de.oklab.leipzig.oparl.impl.OparlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System</em>'.
     * @generated
     */
    System createSystem();

    /**
     * Returns a new object of class '<em>Body</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Body</em>'.
     * @generated
     */
    Body createBody();

    /**
     * Returns a new object of class '<em>Addressable OParl Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Addressable OParl Element</em>'.
     * @generated
     */
    AddressableOParlElement createAddressableOParlElement();

    /**
     * Returns a new object of class '<em>Legislative Term</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Legislative Term</em>'.
     * @generated
     */
    LegislativeTerm createLegislativeTerm();

    /**
     * Returns a new object of class '<em>Organization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Organization</em>'.
     * @generated
     */
    Organization createOrganization();

    /**
     * Returns a new object of class '<em>Meeting Organization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meeting Organization</em>'.
     * @generated
     */
    MeetingOrganization createMeetingOrganization();

    /**
     * Returns a new object of class '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Person</em>'.
     * @generated
     */
    Person createPerson();

    /**
     * Returns a new object of class '<em>Membership</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Membership</em>'.
     * @generated
     */
    Membership createMembership();

    /**
     * Returns a new object of class '<em>Meeting</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meeting</em>'.
     * @generated
     */
    Meeting createMeeting();

    /**
     * Returns a new object of class '<em>Agenda Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Agenda Item</em>'.
     * @generated
     */
    AgendaItem createAgendaItem();

    /**
     * Returns a new object of class '<em>Paper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Paper</em>'.
     * @generated
     */
    Paper createPaper();

    /**
     * Returns a new object of class '<em>Consultation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Consultation</em>'.
     * @generated
     */
    Consultation createConsultation();

    /**
     * Returns a new object of class '<em>File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File</em>'.
     * @generated
     */
    File createFile();

    /**
     * Returns a new object of class '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Location</em>'.
     * @generated
     */
    Location createLocation();

    /**
     * Returns a new object of class '<em>Body Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Body Location</em>'.
     * @generated
     */
    BodyLocation createBodyLocation();

    /**
     * Returns a new object of class '<em>Organization Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Organization Location</em>'.
     * @generated
     */
    OrganizationLocation createOrganizationLocation();

    /**
     * Returns a new object of class '<em>Meeting Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Meeting Location</em>'.
     * @generated
     */
    MeetingLocation createMeetingLocation();

    /**
     * Returns a new object of class '<em>Paper Location</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Paper Location</em>'.
     * @generated
     */
    PaperLocation createPaperLocation();

    /**
     * Returns a new object of class '<em>Invitation File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Invitation File</em>'.
     * @generated
     */
    InvitationFile createInvitationFile();

    /**
     * Returns a new object of class '<em>Results Protocol</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Results Protocol</em>'.
     * @generated
     */
    ResultsProtocol createResultsProtocol();

    /**
     * Returns a new object of class '<em>Verbatim Protocol</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Verbatim Protocol</em>'.
     * @generated
     */
    VerbatimProtocol createVerbatimProtocol();

    /**
     * Returns a new object of class '<em>Auxiliary File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Auxiliary File</em>'.
     * @generated
     */
    AuxiliaryFile createAuxiliaryFile();

    /**
     * Returns a new object of class '<em>Agenda Item Resolution File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Agenda Item Resolution File</em>'.
     * @generated
     */
    AgendaItemResolutionFile createAgendaItemResolutionFile();

    /**
     * Returns a new object of class '<em>Agenda Item Auxiliary File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Agenda Item Auxiliary File</em>'.
     * @generated
     */
    AgendaItemAuxiliaryFile createAgendaItemAuxiliaryFile();

    /**
     * Returns a new object of class '<em>Resolution File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resolution File</em>'.
     * @generated
     */
    ResolutionFile createResolutionFile();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    OparlPackage getOparlPackage();

} //OparlFactory
