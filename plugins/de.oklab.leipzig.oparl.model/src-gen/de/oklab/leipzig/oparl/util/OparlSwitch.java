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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oklab.leipzig.oparl.OparlPackage
 * @generated
 */
public class OparlSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static OparlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OparlSwitch() {
        if (modelPackage == null) {
            modelPackage = OparlPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case OparlPackage.IDENTIFIABLE: {
                Identifiable identifiable = (Identifiable)theEObject;
                T result = caseIdentifiable(identifiable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.TYPED: {
                Typed typed = (Typed)theEObject;
                T result = caseTyped(typed);
                if (result == null) result = caseIdentifiable(typed);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.TAGGED: {
                Tagged tagged = (Tagged)theEObject;
                T result = caseTagged(tagged);
                if (result == null) result = caseTyped(tagged);
                if (result == null) result = caseIdentifiable(tagged);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.NAMED: {
                Named named = (Named)theEObject;
                T result = caseNamed(named);
                if (result == null) result = caseTagged(named);
                if (result == null) result = caseTyped(named);
                if (result == null) result = caseIdentifiable(named);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.DATED: {
                Dated dated = (Dated)theEObject;
                T result = caseDated(dated);
                if (result == null) result = caseNamed(dated);
                if (result == null) result = caseTagged(dated);
                if (result == null) result = caseTyped(dated);
                if (result == null) result = caseIdentifiable(dated);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.OPARL_ELEMENT: {
                OParlElement oParlElement = (OParlElement)theEObject;
                T result = caseOParlElement(oParlElement);
                if (result == null) result = caseDated(oParlElement);
                if (result == null) result = caseNamed(oParlElement);
                if (result == null) result = caseTagged(oParlElement);
                if (result == null) result = caseTyped(oParlElement);
                if (result == null) result = caseIdentifiable(oParlElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.INNER_OPARL_ELEMENT: {
                InnerOParlElement innerOParlElement = (InnerOParlElement)theEObject;
                T result = caseInnerOParlElement(innerOParlElement);
                if (result == null) result = caseTagged(innerOParlElement);
                if (result == null) result = caseTyped(innerOParlElement);
                if (result == null) result = caseIdentifiable(innerOParlElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.SYSTEM: {
                de.oklab.leipzig.oparl.System system = (de.oklab.leipzig.oparl.System)theEObject;
                T result = caseSystem(system);
                if (result == null) result = caseOParlElement(system);
                if (result == null) result = caseDated(system);
                if (result == null) result = caseNamed(system);
                if (result == null) result = caseTagged(system);
                if (result == null) result = caseTyped(system);
                if (result == null) result = caseIdentifiable(system);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.BODY: {
                Body body = (Body)theEObject;
                T result = caseBody(body);
                if (result == null) result = caseAddressableOParlElement(body);
                if (result == null) result = caseOParlElement(body);
                if (result == null) result = caseDated(body);
                if (result == null) result = caseNamed(body);
                if (result == null) result = caseTagged(body);
                if (result == null) result = caseTyped(body);
                if (result == null) result = caseIdentifiable(body);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.ADDRESSABLE_OPARL_ELEMENT: {
                AddressableOParlElement addressableOParlElement = (AddressableOParlElement)theEObject;
                T result = caseAddressableOParlElement(addressableOParlElement);
                if (result == null) result = caseOParlElement(addressableOParlElement);
                if (result == null) result = caseDated(addressableOParlElement);
                if (result == null) result = caseNamed(addressableOParlElement);
                if (result == null) result = caseTagged(addressableOParlElement);
                if (result == null) result = caseTyped(addressableOParlElement);
                if (result == null) result = caseIdentifiable(addressableOParlElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.LEGISLATIVE_TERM: {
                LegislativeTerm legislativeTerm = (LegislativeTerm)theEObject;
                T result = caseLegislativeTerm(legislativeTerm);
                if (result == null) result = caseInnerOParlElement(legislativeTerm);
                if (result == null) result = caseTagged(legislativeTerm);
                if (result == null) result = caseTyped(legislativeTerm);
                if (result == null) result = caseIdentifiable(legislativeTerm);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.ORGANIZATION: {
                Organization organization = (Organization)theEObject;
                T result = caseOrganization(organization);
                if (result == null) result = casePersonOrOrganization(organization);
                if (result == null) result = caseAddressableOParlElement(organization);
                if (result == null) result = caseOParlElement(organization);
                if (result == null) result = caseDated(organization);
                if (result == null) result = caseNamed(organization);
                if (result == null) result = caseTagged(organization);
                if (result == null) result = caseTyped(organization);
                if (result == null) result = caseIdentifiable(organization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.MEETING_ORGANIZATION: {
                MeetingOrganization meetingOrganization = (MeetingOrganization)theEObject;
                T result = caseMeetingOrganization(meetingOrganization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.PERSON: {
                Person person = (Person)theEObject;
                T result = casePerson(person);
                if (result == null) result = casePersonOrOrganization(person);
                if (result == null) result = caseAddressableOParlElement(person);
                if (result == null) result = caseOParlElement(person);
                if (result == null) result = caseDated(person);
                if (result == null) result = caseNamed(person);
                if (result == null) result = caseTagged(person);
                if (result == null) result = caseTyped(person);
                if (result == null) result = caseIdentifiable(person);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.MEMBERSHIP: {
                Membership membership = (Membership)theEObject;
                T result = caseMembership(membership);
                if (result == null) result = caseInnerOParlElement(membership);
                if (result == null) result = caseTagged(membership);
                if (result == null) result = caseTyped(membership);
                if (result == null) result = caseIdentifiable(membership);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.MEETING: {
                Meeting meeting = (Meeting)theEObject;
                T result = caseMeeting(meeting);
                if (result == null) result = caseAddressableOParlElement(meeting);
                if (result == null) result = caseOParlElement(meeting);
                if (result == null) result = caseDated(meeting);
                if (result == null) result = caseNamed(meeting);
                if (result == null) result = caseTagged(meeting);
                if (result == null) result = caseTyped(meeting);
                if (result == null) result = caseIdentifiable(meeting);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.AGENDA_ITEM: {
                AgendaItem agendaItem = (AgendaItem)theEObject;
                T result = caseAgendaItem(agendaItem);
                if (result == null) result = caseInnerOParlElement(agendaItem);
                if (result == null) result = caseTagged(agendaItem);
                if (result == null) result = caseTyped(agendaItem);
                if (result == null) result = caseIdentifiable(agendaItem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.PAPER: {
                Paper paper = (Paper)theEObject;
                T result = casePaper(paper);
                if (result == null) result = caseOParlElement(paper);
                if (result == null) result = caseDated(paper);
                if (result == null) result = caseNamed(paper);
                if (result == null) result = caseTagged(paper);
                if (result == null) result = caseTyped(paper);
                if (result == null) result = caseIdentifiable(paper);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.CONSULTATION: {
                Consultation consultation = (Consultation)theEObject;
                T result = caseConsultation(consultation);
                if (result == null) result = caseInnerOParlElement(consultation);
                if (result == null) result = caseTagged(consultation);
                if (result == null) result = caseTyped(consultation);
                if (result == null) result = caseIdentifiable(consultation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.FILE: {
                File file = (File)theEObject;
                T result = caseFile(file);
                if (result == null) result = caseOParlElement(file);
                if (result == null) result = caseDated(file);
                if (result == null) result = caseNamed(file);
                if (result == null) result = caseTagged(file);
                if (result == null) result = caseTyped(file);
                if (result == null) result = caseIdentifiable(file);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.LOCATION: {
                Location location = (Location)theEObject;
                T result = caseLocation(location);
                if (result == null) result = caseOParlElement(location);
                if (result == null) result = caseDated(location);
                if (result == null) result = caseNamed(location);
                if (result == null) result = caseTagged(location);
                if (result == null) result = caseTyped(location);
                if (result == null) result = caseIdentifiable(location);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.BODY_LOCATION: {
                BodyLocation bodyLocation = (BodyLocation)theEObject;
                T result = caseBodyLocation(bodyLocation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.ORGANIZATION_LOCATION: {
                OrganizationLocation organizationLocation = (OrganizationLocation)theEObject;
                T result = caseOrganizationLocation(organizationLocation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.MEETING_LOCATION: {
                MeetingLocation meetingLocation = (MeetingLocation)theEObject;
                T result = caseMeetingLocation(meetingLocation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.PAPER_LOCATION: {
                PaperLocation paperLocation = (PaperLocation)theEObject;
                T result = casePaperLocation(paperLocation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.PERSON_OR_ORGANIZATION: {
                PersonOrOrganization personOrOrganization = (PersonOrOrganization)theEObject;
                T result = casePersonOrOrganization(personOrOrganization);
                if (result == null) result = caseAddressableOParlElement(personOrOrganization);
                if (result == null) result = caseOParlElement(personOrOrganization);
                if (result == null) result = caseDated(personOrOrganization);
                if (result == null) result = caseNamed(personOrOrganization);
                if (result == null) result = caseTagged(personOrOrganization);
                if (result == null) result = caseTyped(personOrOrganization);
                if (result == null) result = caseIdentifiable(personOrOrganization);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.INVITATION_FILE: {
                InvitationFile invitationFile = (InvitationFile)theEObject;
                T result = caseInvitationFile(invitationFile);
                if (result == null) result = caseFile(invitationFile);
                if (result == null) result = caseOParlElement(invitationFile);
                if (result == null) result = caseDated(invitationFile);
                if (result == null) result = caseNamed(invitationFile);
                if (result == null) result = caseTagged(invitationFile);
                if (result == null) result = caseTyped(invitationFile);
                if (result == null) result = caseIdentifiable(invitationFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.RESULTS_PROTOCOL: {
                ResultsProtocol resultsProtocol = (ResultsProtocol)theEObject;
                T result = caseResultsProtocol(resultsProtocol);
                if (result == null) result = caseFile(resultsProtocol);
                if (result == null) result = caseOParlElement(resultsProtocol);
                if (result == null) result = caseDated(resultsProtocol);
                if (result == null) result = caseNamed(resultsProtocol);
                if (result == null) result = caseTagged(resultsProtocol);
                if (result == null) result = caseTyped(resultsProtocol);
                if (result == null) result = caseIdentifiable(resultsProtocol);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.VERBATIM_PROTOCOL: {
                VerbatimProtocol verbatimProtocol = (VerbatimProtocol)theEObject;
                T result = caseVerbatimProtocol(verbatimProtocol);
                if (result == null) result = caseFile(verbatimProtocol);
                if (result == null) result = caseOParlElement(verbatimProtocol);
                if (result == null) result = caseDated(verbatimProtocol);
                if (result == null) result = caseNamed(verbatimProtocol);
                if (result == null) result = caseTagged(verbatimProtocol);
                if (result == null) result = caseTyped(verbatimProtocol);
                if (result == null) result = caseIdentifiable(verbatimProtocol);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.AUXILIARY_FILE: {
                AuxiliaryFile auxiliaryFile = (AuxiliaryFile)theEObject;
                T result = caseAuxiliaryFile(auxiliaryFile);
                if (result == null) result = caseFile(auxiliaryFile);
                if (result == null) result = caseOParlElement(auxiliaryFile);
                if (result == null) result = caseDated(auxiliaryFile);
                if (result == null) result = caseNamed(auxiliaryFile);
                if (result == null) result = caseTagged(auxiliaryFile);
                if (result == null) result = caseTyped(auxiliaryFile);
                if (result == null) result = caseIdentifiable(auxiliaryFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.AGENDA_ITEM_RESOLUTION_FILE: {
                AgendaItemResolutionFile agendaItemResolutionFile = (AgendaItemResolutionFile)theEObject;
                T result = caseAgendaItemResolutionFile(agendaItemResolutionFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.AGENDA_ITEM_AUXILIARY_FILE: {
                AgendaItemAuxiliaryFile agendaItemAuxiliaryFile = (AgendaItemAuxiliaryFile)theEObject;
                T result = caseAgendaItemAuxiliaryFile(agendaItemAuxiliaryFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case OparlPackage.RESOLUTION_FILE: {
                ResolutionFile resolutionFile = (ResolutionFile)theEObject;
                T result = caseResolutionFile(resolutionFile);
                if (result == null) result = caseFile(resolutionFile);
                if (result == null) result = caseOParlElement(resolutionFile);
                if (result == null) result = caseDated(resolutionFile);
                if (result == null) result = caseNamed(resolutionFile);
                if (result == null) result = caseTagged(resolutionFile);
                if (result == null) result = caseTyped(resolutionFile);
                if (result == null) result = caseIdentifiable(resolutionFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiable(Identifiable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTyped(Typed object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tagged</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tagged</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTagged(Tagged object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamed(Named object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dated</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dated</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDated(Dated object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>OParl Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>OParl Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOParlElement(OParlElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inner OParl Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inner OParl Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInnerOParlElement(InnerOParlElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystem(de.oklab.leipzig.oparl.System object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Body</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBody(Body object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Addressable OParl Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Addressable OParl Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddressableOParlElement(AddressableOParlElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Legislative Term</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Legislative Term</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLegislativeTerm(LegislativeTerm object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrganization(Organization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meeting Organization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meeting Organization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeetingOrganization(MeetingOrganization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerson(Person object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Membership</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Membership</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMembership(Membership object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meeting</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meeting</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeeting(Meeting object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Agenda Item</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Agenda Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgendaItem(AgendaItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Paper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Paper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePaper(Paper object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Consultation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Consultation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConsultation(Consultation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFile(File object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocation(Location object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Body Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Body Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBodyLocation(BodyLocation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Organization Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Organization Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOrganizationLocation(OrganizationLocation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meeting Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meeting Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeetingLocation(MeetingLocation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Paper Location</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Paper Location</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePaperLocation(PaperLocation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person Or Organization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person Or Organization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePersonOrOrganization(PersonOrOrganization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Invitation File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Invitation File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInvitationFile(InvitationFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Results Protocol</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Results Protocol</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultsProtocol(ResultsProtocol object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Verbatim Protocol</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Verbatim Protocol</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVerbatimProtocol(VerbatimProtocol object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Auxiliary File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Auxiliary File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuxiliaryFile(AuxiliaryFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Agenda Item Resolution File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Agenda Item Resolution File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgendaItemResolutionFile(AgendaItemResolutionFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Agenda Item Auxiliary File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Agenda Item Auxiliary File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAgendaItemAuxiliaryFile(AgendaItemAuxiliaryFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resolution File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resolution File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResolutionFile(ResolutionFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //OparlSwitch
