/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.InvitationFile;
import de.oklab.leipzig.oparl.LegislativeTerm;
import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.Meeting;
import de.oklab.leipzig.oparl.Membership;
import de.oklab.leipzig.oparl.OparlFactory;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.ResultsProtocol;
import de.oklab.leipzig.oparl.VerbatimProtocol;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OparlFactoryImpl extends EFactoryImpl implements OparlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OparlFactory init() {
		try {
			OparlFactory theOparlFactory = (OparlFactory)EPackage.Registry.INSTANCE.getEFactory(OparlPackage.eNS_URI);
			if (theOparlFactory != null) {
				return theOparlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OparlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OparlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OparlPackage.AGENDA_ITEM: return createAgendaItem();
			case OparlPackage.MEETING: return createMeeting();
			case OparlPackage.CONSULTATION: return createConsultation();
			case OparlPackage.INVITATION_FILE: return createInvitationFile();
			case OparlPackage.RESULTS_PROTOCOL: return createResultsProtocol();
			case OparlPackage.VERBATIM_PROTOCOL: return createVerbatimProtocol();
			case OparlPackage.AUXILIARY_FILE: return createAuxiliaryFile();
			case OparlPackage.FILE: return createFile();
			case OparlPackage.LOCATION: return createLocation();
			case OparlPackage.ORGANIZATION: return createOrganization();
			case OparlPackage.PERSON: return createPerson();
			case OparlPackage.MEMBERSHIP: return createMembership();
			case OparlPackage.PAPER: return createPaper();
			case OparlPackage.BODY: return createBody();
			case OparlPackage.SYSTEM: return createSystem();
			case OparlPackage.LEGISLATIVE_TERM: return createLegislativeTerm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OparlPackage.URL:
				return createURLFromString(eDataType, initialValue);
			case OparlPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OparlPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			case OparlPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendaItem createAgendaItem() {
		AgendaItemImpl agendaItem = new AgendaItemImpl();
		return agendaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meeting createMeeting() {
		MeetingImpl meeting = new MeetingImpl();
		return meeting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consultation createConsultation() {
		ConsultationImpl consultation = new ConsultationImpl();
		return consultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvitationFile createInvitationFile() {
		InvitationFileImpl invitationFile = new InvitationFileImpl();
		return invitationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsProtocol createResultsProtocol() {
		ResultsProtocolImpl resultsProtocol = new ResultsProtocolImpl();
		return resultsProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbatimProtocol createVerbatimProtocol() {
		VerbatimProtocolImpl verbatimProtocol = new VerbatimProtocolImpl();
		return verbatimProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryFile createAuxiliaryFile() {
		AuxiliaryFileImpl auxiliaryFile = new AuxiliaryFileImpl();
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership createMembership() {
		MembershipImpl membership = new MembershipImpl();
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper createPaper() {
		PaperImpl paper = new PaperImpl();
		return paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.oklab.leipzig.oparl.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegislativeTerm createLegislativeTerm() {
		LegislativeTermImpl legislativeTerm = new LegislativeTermImpl();
		return legislativeTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURLFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OparlPackage getOparlPackage() {
		return (OparlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OparlPackage getPackage() {
		return OparlPackage.eINSTANCE;
	}

} //OparlFactoryImpl
