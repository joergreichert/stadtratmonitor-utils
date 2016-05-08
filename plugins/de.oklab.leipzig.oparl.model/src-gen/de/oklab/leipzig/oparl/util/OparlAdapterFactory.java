/**
 */
package de.oklab.leipzig.oparl.util;

import de.oklab.leipzig.oparl.AddressableOParlElement;
import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile;
import de.oklab.leipzig.oparl.AgendaItemResolutionFile;
import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.BodyLocation;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.Dated;
import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.Identifiable;
import de.oklab.leipzig.oparl.InnerOParlElement;
import de.oklab.leipzig.oparl.InvitationFile;
import de.oklab.leipzig.oparl.LegislativeTerm;
import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.MeetingLocation;
import de.oklab.leipzig.oparl.MeetingOrganization;
import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.Named;
import de.oklab.leipzig.oparl.OParlElement;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.OrganizationLocation;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.PaperLocation;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.PersonOrOrganization;
import de.oklab.leipzig.oparl.ResolutionFile;
import de.oklab.leipzig.oparl.ResultsProtocol;
import de.oklab.leipzig.oparl.Tagged;
import de.oklab.leipzig.oparl.Typed;
import de.oklab.leipzig.oparl.VerbatimProtocol;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.oklab.leipzig.oparl.OparlPackage
 * @generated
 */
public class OparlAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OparlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OparlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = OparlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OparlSwitch<Adapter> modelSwitch =
        new OparlSwitch<Adapter>() {
            @Override
            public Adapter caseIdentifiable(Identifiable object) {
                return createIdentifiableAdapter();
            }
            @Override
            public Adapter caseTyped(Typed object) {
                return createTypedAdapter();
            }
            @Override
            public Adapter caseTagged(Tagged object) {
                return createTaggedAdapter();
            }
            @Override
            public Adapter caseNamed(Named object) {
                return createNamedAdapter();
            }
            @Override
            public Adapter caseDated(Dated object) {
                return createDatedAdapter();
            }
            @Override
            public Adapter caseOParlElement(OParlElement object) {
                return createOParlElementAdapter();
            }
            @Override
            public Adapter caseInnerOParlElement(InnerOParlElement object) {
                return createInnerOParlElementAdapter();
            }
            @Override
            public Adapter caseSystem(de.oklab.leipzig.oparl.System object) {
                return createSystemAdapter();
            }
            @Override
            public Adapter caseBody(Body object) {
                return createBodyAdapter();
            }
            @Override
            public Adapter caseAddressableOParlElement(AddressableOParlElement object) {
                return createAddressableOParlElementAdapter();
            }
            @Override
            public Adapter caseLegislativeTerm(LegislativeTerm object) {
                return createLegislativeTermAdapter();
            }
            @Override
            public Adapter caseOrganization(Organization object) {
                return createOrganizationAdapter();
            }
            @Override
            public Adapter caseMeetingOrganization(MeetingOrganization object) {
                return createMeetingOrganizationAdapter();
            }
            @Override
            public Adapter casePerson(Person object) {
                return createPersonAdapter();
            }
            @Override
            public Adapter caseMembership(Membership object) {
                return createMembershipAdapter();
            }
            @Override
            public Adapter caseMeeting(Meeting object) {
                return createMeetingAdapter();
            }
            @Override
            public Adapter caseAgendaItem(AgendaItem object) {
                return createAgendaItemAdapter();
            }
            @Override
            public Adapter casePaper(Paper object) {
                return createPaperAdapter();
            }
            @Override
            public Adapter caseConsultation(Consultation object) {
                return createConsultationAdapter();
            }
            @Override
            public Adapter caseFile(File object) {
                return createFileAdapter();
            }
            @Override
            public Adapter caseLocation(Location object) {
                return createLocationAdapter();
            }
            @Override
            public Adapter caseBodyLocation(BodyLocation object) {
                return createBodyLocationAdapter();
            }
            @Override
            public Adapter caseOrganizationLocation(OrganizationLocation object) {
                return createOrganizationLocationAdapter();
            }
            @Override
            public Adapter caseMeetingLocation(MeetingLocation object) {
                return createMeetingLocationAdapter();
            }
            @Override
            public Adapter casePaperLocation(PaperLocation object) {
                return createPaperLocationAdapter();
            }
            @Override
            public Adapter casePersonOrOrganization(PersonOrOrganization object) {
                return createPersonOrOrganizationAdapter();
            }
            @Override
            public Adapter caseInvitationFile(InvitationFile object) {
                return createInvitationFileAdapter();
            }
            @Override
            public Adapter caseResultsProtocol(ResultsProtocol object) {
                return createResultsProtocolAdapter();
            }
            @Override
            public Adapter caseVerbatimProtocol(VerbatimProtocol object) {
                return createVerbatimProtocolAdapter();
            }
            @Override
            public Adapter caseAuxiliaryFile(AuxiliaryFile object) {
                return createAuxiliaryFileAdapter();
            }
            @Override
            public Adapter caseAgendaItemResolutionFile(AgendaItemResolutionFile object) {
                return createAgendaItemResolutionFileAdapter();
            }
            @Override
            public Adapter caseAgendaItemAuxiliaryFile(AgendaItemAuxiliaryFile object) {
                return createAgendaItemAuxiliaryFileAdapter();
            }
            @Override
            public Adapter caseResolutionFile(ResolutionFile object) {
                return createResolutionFileAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Identifiable <em>Identifiable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Identifiable
     * @generated
     */
    public Adapter createIdentifiableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Typed <em>Typed</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Typed
     * @generated
     */
    public Adapter createTypedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Tagged <em>Tagged</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Tagged
     * @generated
     */
    public Adapter createTaggedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Named <em>Named</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Named
     * @generated
     */
    public Adapter createNamedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Dated <em>Dated</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Dated
     * @generated
     */
    public Adapter createDatedAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.OParlElement <em>OParl Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.OParlElement
     * @generated
     */
    public Adapter createOParlElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.InnerOParlElement <em>Inner OParl Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.InnerOParlElement
     * @generated
     */
    public Adapter createInnerOParlElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.System <em>System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.System
     * @generated
     */
    public Adapter createSystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Body <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Body
     * @generated
     */
    public Adapter createBodyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.AddressableOParlElement <em>Addressable OParl Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.AddressableOParlElement
     * @generated
     */
    public Adapter createAddressableOParlElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.LegislativeTerm <em>Legislative Term</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.LegislativeTerm
     * @generated
     */
    public Adapter createLegislativeTermAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Organization <em>Organization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Organization
     * @generated
     */
    public Adapter createOrganizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.MeetingOrganization <em>Meeting Organization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.MeetingOrganization
     * @generated
     */
    public Adapter createMeetingOrganizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Person
     * @generated
     */
    public Adapter createPersonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Membership <em>Membership</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Membership
     * @generated
     */
    public Adapter createMembershipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Meeting <em>Meeting</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Meeting
     * @generated
     */
    public Adapter createMeetingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.AgendaItem <em>Agenda Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.AgendaItem
     * @generated
     */
    public Adapter createAgendaItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Paper <em>Paper</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Paper
     * @generated
     */
    public Adapter createPaperAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Consultation <em>Consultation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Consultation
     * @generated
     */
    public Adapter createConsultationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.File <em>File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.File
     * @generated
     */
    public Adapter createFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.Location <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.Location
     * @generated
     */
    public Adapter createLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.BodyLocation <em>Body Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.BodyLocation
     * @generated
     */
    public Adapter createBodyLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.OrganizationLocation <em>Organization Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.OrganizationLocation
     * @generated
     */
    public Adapter createOrganizationLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.MeetingLocation <em>Meeting Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.MeetingLocation
     * @generated
     */
    public Adapter createMeetingLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.PaperLocation <em>Paper Location</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.PaperLocation
     * @generated
     */
    public Adapter createPaperLocationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.PersonOrOrganization <em>Person Or Organization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.PersonOrOrganization
     * @generated
     */
    public Adapter createPersonOrOrganizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.InvitationFile <em>Invitation File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.InvitationFile
     * @generated
     */
    public Adapter createInvitationFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.ResultsProtocol <em>Results Protocol</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.ResultsProtocol
     * @generated
     */
    public Adapter createResultsProtocolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.VerbatimProtocol <em>Verbatim Protocol</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.VerbatimProtocol
     * @generated
     */
    public Adapter createVerbatimProtocolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.AuxiliaryFile <em>Auxiliary File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.AuxiliaryFile
     * @generated
     */
    public Adapter createAuxiliaryFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile <em>Agenda Item Resolution File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.AgendaItemResolutionFile
     * @generated
     */
    public Adapter createAgendaItemResolutionFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile <em>Agenda Item Auxiliary File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile
     * @generated
     */
    public Adapter createAgendaItemAuxiliaryFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.oklab.leipzig.oparl.ResolutionFile <em>Resolution File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.oklab.leipzig.oparl.ResolutionFile
     * @generated
     */
    public Adapter createResolutionFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //OparlAdapterFactory
