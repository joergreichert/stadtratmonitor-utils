/**
 */
package de.oklab.leipzig.oparl.impl;

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
import de.oklab.leipzig.oparl.OparlFactory;
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

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OparlPackageImpl extends EPackageImpl implements OparlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oParlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerOParlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressableOParlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legislativeTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agendaItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consultationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meetingLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paperLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personOrOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invitationFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbatimProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agendaItemResolutionFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agendaItemAuxiliaryFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oParlTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.oklab.leipzig.oparl.OparlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OparlPackageImpl() {
		super(eNS_URI, OparlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OparlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OparlPackage init() {
		if (isInited) return (OparlPackage)EPackage.Registry.INSTANCE.getEPackage(OparlPackage.eNS_URI);

		// Obtain or create and register package
		OparlPackageImpl theOparlPackage = (OparlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OparlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OparlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOparlPackage.createPackageContents();

		// Initialize created meta-data
		theOparlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOparlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OparlPackage.eNS_URI, theOparlPackage);
		return theOparlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable__id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdentifiable__GetId() {
		return identifiableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdentifiable__SetId__String() {
		return identifiableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTyped__GetType() {
		return typedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagged() {
		return taggedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagged_Keyword() {
		return (EAttribute)taggedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed__name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamed__GetName() {
		return namedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamed__SetName__String() {
		return namedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDated() {
		return datedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDated_Created() {
		return (EAttribute)datedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDated_Modified() {
		return (EAttribute)datedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOParlElement() {
		return oParlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOParlElement_ShortName() {
		return (EAttribute)oParlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOParlElement_License() {
		return (EAttribute)oParlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOParlElement_Deleted() {
		return (EAttribute)oParlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInnerOParlElement() {
		return innerOParlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem__oparlVersion() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_OtherOparlVersions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Bodies() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem__contactEmail() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_ContactName() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Website() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Vendor() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Product() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__GetType() {
		return systemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__GetOparlVersion() {
		return systemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__SetOparlVersion__String() {
		return systemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__GetName() {
		return systemEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__GetContactEmail() {
		return systemEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystem__SetContactEmail__String() {
		return systemEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_System() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Website() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_LicenseValidSince() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_OparlSince() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Ags() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Rgs() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_EquivalentBody() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody__contactEmail() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_ContactName() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Organization() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Person() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Meeting() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Paper() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_LegislativeTerm() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBody_Classification() {
		return (EAttribute)bodyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBody_Location() {
		return (EReference)bodyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__GetType() {
		return bodyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__GetContactEmail() {
		return bodyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__SetContactEmail__String() {
		return bodyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__GetStreetAddress() {
		return bodyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__GetPostalCode() {
		return bodyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBody__GetLocality() {
		return bodyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressableOParlElement() {
		return addressableOParlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressableOParlElement__streetAddress() {
		return (EAttribute)addressableOParlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressableOParlElement__postalCode() {
		return (EAttribute)addressableOParlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressableOParlElement__locality() {
		return (EAttribute)addressableOParlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddressableOParlElement__GetStreetAddress() {
		return addressableOParlElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddressableOParlElement__SetStreetAddress__String() {
		return addressableOParlElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddressableOParlElement__GetPostalCode() {
		return addressableOParlElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddressableOParlElement__SetPostalCode__String() {
		return addressableOParlElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddressableOParlElement__GetLocality() {
		return addressableOParlElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddressableOParlElement__SetLocality__String() {
		return addressableOParlElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegislativeTerm() {
		return legislativeTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegislativeTerm_Name() {
		return (EAttribute)legislativeTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegislativeTerm_Body() {
		return (EReference)legislativeTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegislativeTerm_StartDate() {
		return (EAttribute)legislativeTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegislativeTerm_EndDate() {
		return (EAttribute)legislativeTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLegislativeTerm__GetType() {
		return legislativeTermEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Body() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Membership() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Meeting() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Post() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_SubOrganizationOf() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_OrganizationType() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Classification() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_StartDate() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_EndDate() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Website() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_Room() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Location() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganization__GetType() {
		return organizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganization__GetStreetAddress() {
		return organizationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganization__GetPostalCode() {
		return organizationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganization__GetLocality() {
		return organizationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetingOrganization() {
		return meetingOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeetingOrganization_Meeting() {
		return (EReference)meetingOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeetingOrganization_Organization() {
		return (EReference)meetingOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Body() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FamilyName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_GivenName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FormOfAddress() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Affix() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Title() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Phone() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Email() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_SubLocality() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Location() {
		return (EReference)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Status() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Membership() {
		return (EReference)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Life() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_LifeSource() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetName() {
		return personEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetStreetAddress() {
		return personEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetPostalCode() {
		return personEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetLocality() {
		return personEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetType() {
		return personEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMembership() {
		return membershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembership_Person() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembership_Organization() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_Role() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_VotingRight() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_StartDate() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMembership_EndDate() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembership_OnBehalfOf() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMembership__GetType() {
		return membershipEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeeting() {
		return meetingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeeting_MeetingState() {
		return (EAttribute)meetingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeeting_Cancelled() {
		return (EAttribute)meetingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeeting_Start() {
		return (EAttribute)meetingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeeting_End() {
		return (EAttribute)meetingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeeting_Room() {
		return (EAttribute)meetingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Location() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Organization() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Participant() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_Invitation() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_ResultsProtocol() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_VerbatimProtocol() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_AuxiliaryFile() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeeting_AgendaItem() {
		return (EReference)meetingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeeting__GetType() {
		return meetingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeeting__GetName() {
		return meetingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeeting__GetStreetAddress() {
		return meetingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeeting__GetPostalCode() {
		return meetingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeeting__GetLocality() {
		return meetingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgendaItem() {
		return agendaItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_Name() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItem_Meeting() {
		return (EReference)agendaItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_Number() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_Public() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItem_Consultation() {
		return (EReference)agendaItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_Result() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_ResolutionText() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItem_ResolutionFile() {
		return (EReference)agendaItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItem_AuxiliaryFile() {
		return (EReference)agendaItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_Start() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgendaItem_End() {
		return (EAttribute)agendaItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgendaItem__GetType() {
		return agendaItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaper() {
		return paperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_Body() {
		return (EReference)paperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaper_Reference() {
		return (EAttribute)paperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaper_PublishedDate() {
		return (EAttribute)paperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaper_PaperType() {
		return (EAttribute)paperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_RelatedPaper() {
		return (EReference)paperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_SuperordinatedPaper() {
		return (EReference)paperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_SubordinatedPaper() {
		return (EReference)paperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_MainFile() {
		return (EReference)paperEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_AuxiliaryFile() {
		return (EReference)paperEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_Location() {
		return (EReference)paperEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_OriginatorPerson() {
		return (EReference)paperEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_UnderDirectionof() {
		return (EReference)paperEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_OriginatorOrganization() {
		return (EReference)paperEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_Consultation() {
		return (EReference)paperEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaper__GetType() {
		return paperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaper__GetName() {
		return paperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsultation() {
		return consultationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsultation_Paper() {
		return (EReference)consultationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsultation_AgendaItem() {
		return (EReference)consultationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsultation_Meeting() {
		return (EReference)consultationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsultation_Organization() {
		return (EReference)consultationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsultation_Authoritative() {
		return (EAttribute)consultationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsultation_Role() {
		return (EAttribute)consultationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConsultation__GetType() {
		return consultationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_FileName() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_MimeType() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Date() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Size() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Sha1Checksum() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Text() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_AccessUrl() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_DownloadUrl() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_ExternalServiceUrl() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_MasterFile() {
		return (EReference)fileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_DerivativeFile() {
		return (EReference)fileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_FileLicense() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile__GetType() {
		return fileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile__GetName() {
		return fileEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile__GetLicense() {
		return fileEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Description() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Geometry() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Bodies() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Organizations() {
		return (EReference)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Meetings() {
		return (EReference)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Papers() {
		return (EReference)locationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__GetType() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyLocation() {
		return bodyLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyLocation_Body() {
		return (EReference)bodyLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyLocation_Location() {
		return (EReference)bodyLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationLocation() {
		return organizationLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationLocation_Organziation() {
		return (EReference)organizationLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationLocation_Location() {
		return (EReference)organizationLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeetingLocation() {
		return meetingLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeetingLocation_Meeting() {
		return (EReference)meetingLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeetingLocation_Location() {
		return (EReference)meetingLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaperLocation() {
		return paperLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaperLocation_Paper() {
		return (EReference)paperLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaperLocation_Location() {
		return (EReference)paperLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonOrOrganization() {
		return personOrOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvitationFile() {
		return invitationFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvitationFile_Meeting() {
		return (EReference)invitationFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvitationFile_AgendaItem() {
		return (EReference)invitationFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvitationFile_Paper() {
		return (EReference)invitationFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsProtocol() {
		return resultsProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsProtocol_Meeting() {
		return (EReference)resultsProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsProtocol_AgendaItem() {
		return (EReference)resultsProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsProtocol_Paper() {
		return (EReference)resultsProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerbatimProtocol() {
		return verbatimProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbatimProtocol_Meeting() {
		return (EReference)verbatimProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbatimProtocol_AgendaItem() {
		return (EReference)verbatimProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerbatimProtocol_Paper() {
		return (EReference)verbatimProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryFile() {
		return auxiliaryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryFile_Meeting() {
		return (EReference)auxiliaryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryFile_AgendaItem() {
		return (EReference)auxiliaryFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryFile_Paper() {
		return (EReference)auxiliaryFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgendaItemResolutionFile() {
		return agendaItemResolutionFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItemResolutionFile_AgendaItem() {
		return (EReference)agendaItemResolutionFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItemResolutionFile_ResolutionFile() {
		return (EReference)agendaItemResolutionFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgendaItemAuxiliaryFile() {
		return agendaItemAuxiliaryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItemAuxiliaryFile_AgendaItem() {
		return (EReference)agendaItemAuxiliaryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgendaItemAuxiliaryFile_AuxiliaryFile() {
		return (EReference)agendaItemAuxiliaryFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionFile() {
		return resolutionFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionFile_AgendaItem() {
		return (EReference)resolutionFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionFile_Paper() {
		return (EReference)resolutionFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURL() {
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOParlType() {
		return oParlTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OparlFactory getOparlFactory() {
		return (OparlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEOperation(identifiableEClass, IDENTIFIABLE___GET_ID);
		createEOperation(identifiableEClass, IDENTIFIABLE___SET_ID__STRING);

		typedEClass = createEClass(TYPED);
		createEOperation(typedEClass, TYPED___GET_TYPE);

		taggedEClass = createEClass(TAGGED);
		createEAttribute(taggedEClass, TAGGED__KEYWORD);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);
		createEOperation(namedEClass, NAMED___GET_NAME);
		createEOperation(namedEClass, NAMED___SET_NAME__STRING);

		datedEClass = createEClass(DATED);
		createEAttribute(datedEClass, DATED__CREATED);
		createEAttribute(datedEClass, DATED__MODIFIED);

		oParlElementEClass = createEClass(OPARL_ELEMENT);
		createEAttribute(oParlElementEClass, OPARL_ELEMENT__SHORT_NAME);
		createEAttribute(oParlElementEClass, OPARL_ELEMENT__LICENSE);
		createEAttribute(oParlElementEClass, OPARL_ELEMENT__DELETED);

		innerOParlElementEClass = createEClass(INNER_OPARL_ELEMENT);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__OPARL_VERSION);
		createEReference(systemEClass, SYSTEM__OTHER_OPARL_VERSIONS);
		createEReference(systemEClass, SYSTEM__BODIES);
		createEAttribute(systemEClass, SYSTEM__CONTACT_EMAIL);
		createEAttribute(systemEClass, SYSTEM__CONTACT_NAME);
		createEAttribute(systemEClass, SYSTEM__WEBSITE);
		createEAttribute(systemEClass, SYSTEM__VENDOR);
		createEAttribute(systemEClass, SYSTEM__PRODUCT);
		createEOperation(systemEClass, SYSTEM___GET_TYPE);
		createEOperation(systemEClass, SYSTEM___GET_OPARL_VERSION);
		createEOperation(systemEClass, SYSTEM___SET_OPARL_VERSION__STRING);
		createEOperation(systemEClass, SYSTEM___GET_NAME);
		createEOperation(systemEClass, SYSTEM___GET_CONTACT_EMAIL);
		createEOperation(systemEClass, SYSTEM___SET_CONTACT_EMAIL__STRING);

		bodyEClass = createEClass(BODY);
		createEReference(bodyEClass, BODY__SYSTEM);
		createEAttribute(bodyEClass, BODY__WEBSITE);
		createEAttribute(bodyEClass, BODY__LICENSE_VALID_SINCE);
		createEAttribute(bodyEClass, BODY__OPARL_SINCE);
		createEAttribute(bodyEClass, BODY__AGS);
		createEAttribute(bodyEClass, BODY__RGS);
		createEReference(bodyEClass, BODY__EQUIVALENT_BODY);
		createEAttribute(bodyEClass, BODY__CONTACT_EMAIL);
		createEAttribute(bodyEClass, BODY__CONTACT_NAME);
		createEReference(bodyEClass, BODY__ORGANIZATION);
		createEReference(bodyEClass, BODY__PERSON);
		createEReference(bodyEClass, BODY__MEETING);
		createEReference(bodyEClass, BODY__PAPER);
		createEReference(bodyEClass, BODY__LEGISLATIVE_TERM);
		createEAttribute(bodyEClass, BODY__CLASSIFICATION);
		createEReference(bodyEClass, BODY__LOCATION);
		createEOperation(bodyEClass, BODY___GET_TYPE);
		createEOperation(bodyEClass, BODY___GET_CONTACT_EMAIL);
		createEOperation(bodyEClass, BODY___SET_CONTACT_EMAIL__STRING);
		createEOperation(bodyEClass, BODY___GET_STREET_ADDRESS);
		createEOperation(bodyEClass, BODY___GET_POSTAL_CODE);
		createEOperation(bodyEClass, BODY___GET_LOCALITY);

		addressableOParlElementEClass = createEClass(ADDRESSABLE_OPARL_ELEMENT);
		createEAttribute(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS);
		createEAttribute(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE);
		createEAttribute(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT__LOCALITY);
		createEOperation(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS);
		createEOperation(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING);
		createEOperation(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE);
		createEOperation(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING);
		createEOperation(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY);
		createEOperation(addressableOParlElementEClass, ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING);

		legislativeTermEClass = createEClass(LEGISLATIVE_TERM);
		createEAttribute(legislativeTermEClass, LEGISLATIVE_TERM__NAME);
		createEReference(legislativeTermEClass, LEGISLATIVE_TERM__BODY);
		createEAttribute(legislativeTermEClass, LEGISLATIVE_TERM__START_DATE);
		createEAttribute(legislativeTermEClass, LEGISLATIVE_TERM__END_DATE);
		createEOperation(legislativeTermEClass, LEGISLATIVE_TERM___GET_TYPE);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__BODY);
		createEReference(organizationEClass, ORGANIZATION__MEMBERSHIP);
		createEReference(organizationEClass, ORGANIZATION__MEETING);
		createEAttribute(organizationEClass, ORGANIZATION__POST);
		createEReference(organizationEClass, ORGANIZATION__SUB_ORGANIZATION_OF);
		createEAttribute(organizationEClass, ORGANIZATION__ORGANIZATION_TYPE);
		createEAttribute(organizationEClass, ORGANIZATION__CLASSIFICATION);
		createEAttribute(organizationEClass, ORGANIZATION__START_DATE);
		createEAttribute(organizationEClass, ORGANIZATION__END_DATE);
		createEAttribute(organizationEClass, ORGANIZATION__WEBSITE);
		createEAttribute(organizationEClass, ORGANIZATION__ROOM);
		createEReference(organizationEClass, ORGANIZATION__LOCATION);
		createEOperation(organizationEClass, ORGANIZATION___GET_TYPE);
		createEOperation(organizationEClass, ORGANIZATION___GET_STREET_ADDRESS);
		createEOperation(organizationEClass, ORGANIZATION___GET_POSTAL_CODE);
		createEOperation(organizationEClass, ORGANIZATION___GET_LOCALITY);

		meetingOrganizationEClass = createEClass(MEETING_ORGANIZATION);
		createEReference(meetingOrganizationEClass, MEETING_ORGANIZATION__MEETING);
		createEReference(meetingOrganizationEClass, MEETING_ORGANIZATION__ORGANIZATION);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__BODY);
		createEAttribute(personEClass, PERSON__FAMILY_NAME);
		createEAttribute(personEClass, PERSON__GIVEN_NAME);
		createEAttribute(personEClass, PERSON__FORM_OF_ADDRESS);
		createEAttribute(personEClass, PERSON__AFFIX);
		createEAttribute(personEClass, PERSON__TITLE);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__PHONE);
		createEAttribute(personEClass, PERSON__EMAIL);
		createEAttribute(personEClass, PERSON__SUB_LOCALITY);
		createEReference(personEClass, PERSON__LOCATION);
		createEAttribute(personEClass, PERSON__STATUS);
		createEReference(personEClass, PERSON__MEMBERSHIP);
		createEAttribute(personEClass, PERSON__LIFE);
		createEAttribute(personEClass, PERSON__LIFE_SOURCE);
		createEOperation(personEClass, PERSON___GET_NAME);
		createEOperation(personEClass, PERSON___GET_STREET_ADDRESS);
		createEOperation(personEClass, PERSON___GET_POSTAL_CODE);
		createEOperation(personEClass, PERSON___GET_LOCALITY);
		createEOperation(personEClass, PERSON___GET_TYPE);

		membershipEClass = createEClass(MEMBERSHIP);
		createEReference(membershipEClass, MEMBERSHIP__PERSON);
		createEReference(membershipEClass, MEMBERSHIP__ORGANIZATION);
		createEAttribute(membershipEClass, MEMBERSHIP__ROLE);
		createEAttribute(membershipEClass, MEMBERSHIP__VOTING_RIGHT);
		createEAttribute(membershipEClass, MEMBERSHIP__START_DATE);
		createEAttribute(membershipEClass, MEMBERSHIP__END_DATE);
		createEReference(membershipEClass, MEMBERSHIP__ON_BEHALF_OF);
		createEOperation(membershipEClass, MEMBERSHIP___GET_TYPE);

		meetingEClass = createEClass(MEETING);
		createEAttribute(meetingEClass, MEETING__MEETING_STATE);
		createEAttribute(meetingEClass, MEETING__CANCELLED);
		createEAttribute(meetingEClass, MEETING__START);
		createEAttribute(meetingEClass, MEETING__END);
		createEAttribute(meetingEClass, MEETING__ROOM);
		createEReference(meetingEClass, MEETING__LOCATION);
		createEReference(meetingEClass, MEETING__ORGANIZATION);
		createEReference(meetingEClass, MEETING__PARTICIPANT);
		createEReference(meetingEClass, MEETING__INVITATION);
		createEReference(meetingEClass, MEETING__RESULTS_PROTOCOL);
		createEReference(meetingEClass, MEETING__VERBATIM_PROTOCOL);
		createEReference(meetingEClass, MEETING__AUXILIARY_FILE);
		createEReference(meetingEClass, MEETING__AGENDA_ITEM);
		createEOperation(meetingEClass, MEETING___GET_TYPE);
		createEOperation(meetingEClass, MEETING___GET_NAME);
		createEOperation(meetingEClass, MEETING___GET_STREET_ADDRESS);
		createEOperation(meetingEClass, MEETING___GET_POSTAL_CODE);
		createEOperation(meetingEClass, MEETING___GET_LOCALITY);

		agendaItemEClass = createEClass(AGENDA_ITEM);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__NAME);
		createEReference(agendaItemEClass, AGENDA_ITEM__MEETING);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__NUMBER);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__PUBLIC);
		createEReference(agendaItemEClass, AGENDA_ITEM__CONSULTATION);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__RESULT);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__RESOLUTION_TEXT);
		createEReference(agendaItemEClass, AGENDA_ITEM__RESOLUTION_FILE);
		createEReference(agendaItemEClass, AGENDA_ITEM__AUXILIARY_FILE);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__START);
		createEAttribute(agendaItemEClass, AGENDA_ITEM__END);
		createEOperation(agendaItemEClass, AGENDA_ITEM___GET_TYPE);

		paperEClass = createEClass(PAPER);
		createEReference(paperEClass, PAPER__BODY);
		createEAttribute(paperEClass, PAPER__REFERENCE);
		createEAttribute(paperEClass, PAPER__PUBLISHED_DATE);
		createEAttribute(paperEClass, PAPER__PAPER_TYPE);
		createEReference(paperEClass, PAPER__RELATED_PAPER);
		createEReference(paperEClass, PAPER__SUPERORDINATED_PAPER);
		createEReference(paperEClass, PAPER__SUBORDINATED_PAPER);
		createEReference(paperEClass, PAPER__MAIN_FILE);
		createEReference(paperEClass, PAPER__AUXILIARY_FILE);
		createEReference(paperEClass, PAPER__LOCATION);
		createEReference(paperEClass, PAPER__ORIGINATOR_PERSON);
		createEReference(paperEClass, PAPER__UNDER_DIRECTIONOF);
		createEReference(paperEClass, PAPER__ORIGINATOR_ORGANIZATION);
		createEReference(paperEClass, PAPER__CONSULTATION);
		createEOperation(paperEClass, PAPER___GET_TYPE);
		createEOperation(paperEClass, PAPER___GET_NAME);

		consultationEClass = createEClass(CONSULTATION);
		createEReference(consultationEClass, CONSULTATION__PAPER);
		createEReference(consultationEClass, CONSULTATION__AGENDA_ITEM);
		createEReference(consultationEClass, CONSULTATION__MEETING);
		createEReference(consultationEClass, CONSULTATION__ORGANIZATION);
		createEAttribute(consultationEClass, CONSULTATION__AUTHORITATIVE);
		createEAttribute(consultationEClass, CONSULTATION__ROLE);
		createEOperation(consultationEClass, CONSULTATION___GET_TYPE);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FILE_NAME);
		createEAttribute(fileEClass, FILE__MIME_TYPE);
		createEAttribute(fileEClass, FILE__DATE);
		createEAttribute(fileEClass, FILE__SIZE);
		createEAttribute(fileEClass, FILE__SHA1_CHECKSUM);
		createEAttribute(fileEClass, FILE__TEXT);
		createEAttribute(fileEClass, FILE__ACCESS_URL);
		createEAttribute(fileEClass, FILE__DOWNLOAD_URL);
		createEAttribute(fileEClass, FILE__EXTERNAL_SERVICE_URL);
		createEReference(fileEClass, FILE__MASTER_FILE);
		createEReference(fileEClass, FILE__DERIVATIVE_FILE);
		createEAttribute(fileEClass, FILE__FILE_LICENSE);
		createEOperation(fileEClass, FILE___GET_TYPE);
		createEOperation(fileEClass, FILE___GET_NAME);
		createEOperation(fileEClass, FILE___GET_LICENSE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__DESCRIPTION);
		createEAttribute(locationEClass, LOCATION__GEOMETRY);
		createEReference(locationEClass, LOCATION__BODIES);
		createEReference(locationEClass, LOCATION__ORGANIZATIONS);
		createEReference(locationEClass, LOCATION__MEETINGS);
		createEReference(locationEClass, LOCATION__PAPERS);
		createEOperation(locationEClass, LOCATION___GET_TYPE);

		bodyLocationEClass = createEClass(BODY_LOCATION);
		createEReference(bodyLocationEClass, BODY_LOCATION__BODY);
		createEReference(bodyLocationEClass, BODY_LOCATION__LOCATION);

		organizationLocationEClass = createEClass(ORGANIZATION_LOCATION);
		createEReference(organizationLocationEClass, ORGANIZATION_LOCATION__ORGANZIATION);
		createEReference(organizationLocationEClass, ORGANIZATION_LOCATION__LOCATION);

		meetingLocationEClass = createEClass(MEETING_LOCATION);
		createEReference(meetingLocationEClass, MEETING_LOCATION__MEETING);
		createEReference(meetingLocationEClass, MEETING_LOCATION__LOCATION);

		paperLocationEClass = createEClass(PAPER_LOCATION);
		createEReference(paperLocationEClass, PAPER_LOCATION__PAPER);
		createEReference(paperLocationEClass, PAPER_LOCATION__LOCATION);

		personOrOrganizationEClass = createEClass(PERSON_OR_ORGANIZATION);

		invitationFileEClass = createEClass(INVITATION_FILE);
		createEReference(invitationFileEClass, INVITATION_FILE__MEETING);
		createEReference(invitationFileEClass, INVITATION_FILE__AGENDA_ITEM);
		createEReference(invitationFileEClass, INVITATION_FILE__PAPER);

		resultsProtocolEClass = createEClass(RESULTS_PROTOCOL);
		createEReference(resultsProtocolEClass, RESULTS_PROTOCOL__MEETING);
		createEReference(resultsProtocolEClass, RESULTS_PROTOCOL__AGENDA_ITEM);
		createEReference(resultsProtocolEClass, RESULTS_PROTOCOL__PAPER);

		verbatimProtocolEClass = createEClass(VERBATIM_PROTOCOL);
		createEReference(verbatimProtocolEClass, VERBATIM_PROTOCOL__MEETING);
		createEReference(verbatimProtocolEClass, VERBATIM_PROTOCOL__AGENDA_ITEM);
		createEReference(verbatimProtocolEClass, VERBATIM_PROTOCOL__PAPER);

		auxiliaryFileEClass = createEClass(AUXILIARY_FILE);
		createEReference(auxiliaryFileEClass, AUXILIARY_FILE__MEETING);
		createEReference(auxiliaryFileEClass, AUXILIARY_FILE__AGENDA_ITEM);
		createEReference(auxiliaryFileEClass, AUXILIARY_FILE__PAPER);

		agendaItemResolutionFileEClass = createEClass(AGENDA_ITEM_RESOLUTION_FILE);
		createEReference(agendaItemResolutionFileEClass, AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM);
		createEReference(agendaItemResolutionFileEClass, AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE);

		agendaItemAuxiliaryFileEClass = createEClass(AGENDA_ITEM_AUXILIARY_FILE);
		createEReference(agendaItemAuxiliaryFileEClass, AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM);
		createEReference(agendaItemAuxiliaryFileEClass, AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE);

		resolutionFileEClass = createEClass(RESOLUTION_FILE);
		createEReference(resolutionFileEClass, RESOLUTION_FILE__AGENDA_ITEM);
		createEReference(resolutionFileEClass, RESOLUTION_FILE__PAPER);

		// Create data types
		urlEDataType = createEDataType(URL);
		dateEDataType = createEDataType(DATE);
		oParlTypeEDataType = createEDataType(OPARL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typedEClass.getESuperTypes().add(this.getIdentifiable());
		taggedEClass.getESuperTypes().add(this.getTyped());
		namedEClass.getESuperTypes().add(this.getTagged());
		datedEClass.getESuperTypes().add(this.getNamed());
		oParlElementEClass.getESuperTypes().add(this.getDated());
		innerOParlElementEClass.getESuperTypes().add(this.getTagged());
		systemEClass.getESuperTypes().add(this.getOParlElement());
		bodyEClass.getESuperTypes().add(this.getAddressableOParlElement());
		addressableOParlElementEClass.getESuperTypes().add(this.getOParlElement());
		legislativeTermEClass.getESuperTypes().add(this.getInnerOParlElement());
		organizationEClass.getESuperTypes().add(this.getPersonOrOrganization());
		personEClass.getESuperTypes().add(this.getPersonOrOrganization());
		membershipEClass.getESuperTypes().add(this.getInnerOParlElement());
		meetingEClass.getESuperTypes().add(this.getAddressableOParlElement());
		agendaItemEClass.getESuperTypes().add(this.getInnerOParlElement());
		paperEClass.getESuperTypes().add(this.getOParlElement());
		consultationEClass.getESuperTypes().add(this.getInnerOParlElement());
		fileEClass.getESuperTypes().add(this.getOParlElement());
		locationEClass.getESuperTypes().add(this.getOParlElement());
		personOrOrganizationEClass.getESuperTypes().add(this.getAddressableOParlElement());
		invitationFileEClass.getESuperTypes().add(this.getFile());
		resultsProtocolEClass.getESuperTypes().add(this.getFile());
		verbatimProtocolEClass.getESuperTypes().add(this.getFile());
		auxiliaryFileEClass.getESuperTypes().add(this.getFile());
		resolutionFileEClass.getESuperTypes().add(this.getFile());

		// Initialize classes, features, and operations; add parameters
		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable__id(), this.getURL(), "_id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIdentifiable__GetId(), this.getURL(), "getId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getIdentifiable__SetId__String(), null, "setId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getURL(), "_id", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTyped__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(taggedEClass, Tagged.class, "Tagged", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagged_Keyword(), theEcorePackage.getEString(), "keyword", null, 0, -1, Tagged.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed__name(), theEcorePackage.getEString(), "_name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNamed__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNamed__SetName__String(), null, "setName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(datedEClass, Dated.class, "Dated", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDated_Created(), this.getDate(), "created", null, 0, 1, Dated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDated_Modified(), this.getDate(), "modified", null, 0, 1, Dated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oParlElementEClass, OParlElement.class, "OParlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOParlElement_ShortName(), theEcorePackage.getEString(), "shortName", null, 0, 1, OParlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOParlElement_License(), theEcorePackage.getEString(), "license", null, 0, 1, OParlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOParlElement_Deleted(), theEcorePackage.getEBoolean(), "deleted", "false", 0, 1, OParlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(innerOParlElementEClass, InnerOParlElement.class, "InnerOParlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, de.oklab.leipzig.oparl.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem__oparlVersion(), theEcorePackage.getEString(), "_oparlVersion", null, 0, 1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_OtherOparlVersions(), this.getSystem(), null, "otherOparlVersions", null, 0, -1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Bodies(), this.getBody(), this.getBody_System(), "bodies", null, 0, -1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem__contactEmail(), theEcorePackage.getEString(), "_contactEmail", null, 0, 1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_ContactName(), theEcorePackage.getEString(), "contactName", null, 0, 1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Website(), this.getURL(), "website", null, 0, 1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Vendor(), this.getURL(), "vendor", null, 0, 1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Product(), this.getURL(), "product", null, 0, 1, de.oklab.leipzig.oparl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSystem__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getSystem__GetOparlVersion(), theEcorePackage.getEString(), "getOparlVersion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSystem__SetOparlVersion__String(), null, "setOparlVersion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "version", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getSystem__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getSystem__GetContactEmail(), theEcorePackage.getEString(), "getContactEmail", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSystem__SetContactEmail__String(), null, "setContactEmail", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "contactEmail", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBody_System(), this.getSystem(), this.getSystem_Bodies(), "system", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_Website(), theEcorePackage.getEString(), "website", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_LicenseValidSince(), this.getDate(), "licenseValidSince", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_OparlSince(), this.getDate(), "oparlSince", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_Ags(), theEcorePackage.getEString(), "ags", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_Rgs(), theEcorePackage.getEString(), "rgs", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_EquivalentBody(), this.getBody(), null, "equivalentBody", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody__contactEmail(), theEcorePackage.getEString(), "_contactEmail", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_ContactName(), theEcorePackage.getEString(), "contactName", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Organization(), this.getOrganization(), this.getOrganization_Body(), "organization", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Person(), this.getPerson(), this.getPerson_Body(), "person", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Meeting(), this.getMeeting(), null, "meeting", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Paper(), this.getPaper(), this.getPaper_Body(), "paper", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_LegislativeTerm(), this.getLegislativeTerm(), this.getLegislativeTerm_Body(), "legislativeTerm", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBody_Classification(), theEcorePackage.getEString(), "classification", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBody_Location(), this.getBodyLocation(), this.getBodyLocation_Body(), "location", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBody__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBody__GetContactEmail(), theEcorePackage.getEString(), "getContactEmail", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBody__SetContactEmail__String(), null, "setContactEmail", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "contactEmail", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBody__GetStreetAddress(), theEcorePackage.getEString(), "getStreetAddress", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBody__GetPostalCode(), theEcorePackage.getEString(), "getPostalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBody__GetLocality(), theEcorePackage.getEString(), "getLocality", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(addressableOParlElementEClass, AddressableOParlElement.class, "AddressableOParlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressableOParlElement__streetAddress(), theEcorePackage.getEString(), "_streetAddress", null, 0, 1, AddressableOParlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressableOParlElement__postalCode(), theEcorePackage.getEString(), "_postalCode", null, 0, 1, AddressableOParlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressableOParlElement__locality(), theEcorePackage.getEString(), "_locality", null, 0, 1, AddressableOParlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAddressableOParlElement__GetStreetAddress(), theEcorePackage.getEString(), "getStreetAddress", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAddressableOParlElement__SetStreetAddress__String(), null, "setStreetAddress", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "address", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAddressableOParlElement__GetPostalCode(), theEcorePackage.getEString(), "getPostalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAddressableOParlElement__SetPostalCode__String(), null, "setPostalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "postalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAddressableOParlElement__GetLocality(), theEcorePackage.getEString(), "getLocality", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAddressableOParlElement__SetLocality__String(), null, "setLocality", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "locality", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(legislativeTermEClass, LegislativeTerm.class, "LegislativeTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegislativeTerm_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LegislativeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegislativeTerm_Body(), this.getBody(), this.getBody_LegislativeTerm(), "body", null, 0, 1, LegislativeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegislativeTerm_StartDate(), theEcorePackage.getEString(), "startDate", null, 0, 1, LegislativeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegislativeTerm_EndDate(), theEcorePackage.getEString(), "endDate", null, 0, 1, LegislativeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLegislativeTerm__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Body(), this.getBody(), this.getBody_Organization(), "body", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Membership(), this.getMembership(), this.getMembership_Organization(), "membership", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Meeting(), this.getMeetingOrganization(), this.getMeetingOrganization_Organization(), "meeting", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Post(), theEcorePackage.getEString(), "post", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_SubOrganizationOf(), this.getOrganization(), null, "subOrganizationOf", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_OrganizationType(), theEcorePackage.getEString(), "organizationType", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Classification(), theEcorePackage.getEString(), "classification", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_StartDate(), this.getDate(), "startDate", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_EndDate(), this.getDate(), "endDate", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Website(), this.getURL(), "website", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_Room(), theEcorePackage.getEString(), "room", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Location(), this.getOrganizationLocation(), this.getOrganizationLocation_Organziation(), "location", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrganization__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrganization__GetStreetAddress(), theEcorePackage.getEString(), "getStreetAddress", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrganization__GetPostalCode(), theEcorePackage.getEString(), "getPostalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrganization__GetLocality(), theEcorePackage.getEString(), "getLocality", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(meetingOrganizationEClass, MeetingOrganization.class, "MeetingOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeetingOrganization_Meeting(), this.getMeeting(), this.getMeeting_Organization(), "meeting", null, 0, 1, MeetingOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeetingOrganization_Organization(), this.getOrganization(), this.getOrganization_Meeting(), "organization", null, 0, 1, MeetingOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Body(), this.getBody(), this.getBody_Person(), "body", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FamilyName(), theEcorePackage.getEString(), "familyName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_GivenName(), theEcorePackage.getEString(), "givenName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FormOfAddress(), theEcorePackage.getEString(), "formOfAddress", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Affix(), theEcorePackage.getEString(), "affix", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Title(), theEcorePackage.getEString(), "title", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), theEcorePackage.getEString(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Phone(), theEcorePackage.getEString(), "phone", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Email(), theEcorePackage.getEString(), "email", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_SubLocality(), theEcorePackage.getEString(), "subLocality", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Location(), this.getLocation(), null, "location", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Status(), theEcorePackage.getEString(), "status", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Membership(), this.getMembership(), this.getMembership_Person(), "membership", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Life(), theEcorePackage.getEString(), "life", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LifeSource(), theEcorePackage.getEString(), "lifeSource", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPerson__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__GetStreetAddress(), theEcorePackage.getEString(), "getStreetAddress", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__GetPostalCode(), theEcorePackage.getEString(), "getPostalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__GetLocality(), theEcorePackage.getEString(), "getLocality", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(membershipEClass, Membership.class, "Membership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMembership_Person(), this.getPerson(), this.getPerson_Membership(), "person", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMembership_Organization(), this.getOrganization(), this.getOrganization_Membership(), "organization", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_Role(), theEcorePackage.getEString(), "role", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_VotingRight(), theEcorePackage.getEBoolean(), "votingRight", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_StartDate(), this.getDate(), "startDate", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembership_EndDate(), this.getDate(), "endDate", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMembership_OnBehalfOf(), this.getOrganization(), null, "onBehalfOf", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMembership__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(meetingEClass, Meeting.class, "Meeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeeting_MeetingState(), theEcorePackage.getEString(), "meetingState", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeeting_Cancelled(), theEcorePackage.getEBoolean(), "cancelled", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeeting_Start(), this.getDate(), "start", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeeting_End(), this.getDate(), "end", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeeting_Room(), theEcorePackage.getEString(), "room", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_Location(), this.getMeetingLocation(), this.getMeetingLocation_Meeting(), "location", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_Organization(), this.getMeetingOrganization(), this.getMeetingOrganization_Meeting(), "organization", null, 0, -1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_Participant(), this.getPerson(), null, "participant", null, 0, -1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_Invitation(), this.getInvitationFile(), this.getInvitationFile_Meeting(), "invitation", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_ResultsProtocol(), this.getResultsProtocol(), this.getResultsProtocol_Meeting(), "resultsProtocol", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_VerbatimProtocol(), this.getVerbatimProtocol(), this.getVerbatimProtocol_Meeting(), "verbatimProtocol", null, 0, 1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_AuxiliaryFile(), this.getAuxiliaryFile(), this.getAuxiliaryFile_Meeting(), "auxiliaryFile", null, 0, -1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeeting_AgendaItem(), this.getAgendaItem(), this.getAgendaItem_Meeting(), "agendaItem", null, 0, -1, Meeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeeting__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeeting__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeeting__GetStreetAddress(), theEcorePackage.getEString(), "getStreetAddress", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeeting__GetPostalCode(), theEcorePackage.getEString(), "getPostalCode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeeting__GetLocality(), theEcorePackage.getEString(), "getLocality", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(agendaItemEClass, AgendaItem.class, "AgendaItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgendaItem_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgendaItem_Meeting(), this.getMeeting(), this.getMeeting_AgendaItem(), "meeting", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgendaItem_Number(), theEcorePackage.getEString(), "number", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgendaItem_Public(), theEcorePackage.getEBoolean(), "public", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgendaItem_Consultation(), this.getConsultation(), this.getConsultation_AgendaItem(), "consultation", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgendaItem_Result(), theEcorePackage.getEString(), "result", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgendaItem_ResolutionText(), theEcorePackage.getEString(), "resolutionText", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgendaItem_ResolutionFile(), this.getAgendaItemResolutionFile(), this.getAgendaItemResolutionFile_AgendaItem(), "resolutionFile", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgendaItem_AuxiliaryFile(), this.getAgendaItemAuxiliaryFile(), this.getAgendaItemAuxiliaryFile_AgendaItem(), "auxiliaryFile", null, 0, -1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgendaItem_Start(), this.getDate(), "start", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgendaItem_End(), this.getDate(), "end", null, 0, 1, AgendaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAgendaItem__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(paperEClass, Paper.class, "Paper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaper_Body(), this.getBody(), this.getBody_Paper(), "body", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaper_Reference(), theEcorePackage.getEString(), "reference", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaper_PublishedDate(), this.getDate(), "publishedDate", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaper_PaperType(), theEcorePackage.getEString(), "paperType", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_RelatedPaper(), this.getPaper(), null, "relatedPaper", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_SuperordinatedPaper(), this.getPaper(), this.getPaper_SubordinatedPaper(), "superordinatedPaper", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_SubordinatedPaper(), this.getPaper(), this.getPaper_SuperordinatedPaper(), "subordinatedPaper", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_MainFile(), this.getFile(), null, "mainFile", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_AuxiliaryFile(), this.getAuxiliaryFile(), null, "auxiliaryFile", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_Location(), this.getPaperLocation(), this.getPaperLocation_Paper(), "location", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_OriginatorPerson(), this.getPerson(), null, "originatorPerson", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_UnderDirectionof(), this.getOrganization(), null, "underDirectionof", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_OriginatorOrganization(), this.getOrganization(), null, "originatorOrganization", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_Consultation(), this.getConsultation(), this.getConsultation_Paper(), "consultation", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPaper__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPaper__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(consultationEClass, Consultation.class, "Consultation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsultation_Paper(), this.getPaper(), this.getPaper_Consultation(), "paper", null, 0, 1, Consultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsultation_AgendaItem(), this.getAgendaItem(), this.getAgendaItem_Consultation(), "agendaItem", null, 0, 1, Consultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsultation_Meeting(), this.getMeeting(), null, "meeting", null, 0, 1, Consultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsultation_Organization(), this.getOrganization(), null, "organization", null, 0, -1, Consultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsultation_Authoritative(), theEcorePackage.getEBoolean(), "authoritative", null, 0, 1, Consultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsultation_Role(), theEcorePackage.getEString(), "role", null, 0, 1, Consultation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConsultation__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_FileName(), theEcorePackage.getEString(), "fileName", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_MimeType(), theEcorePackage.getEString(), "mimeType", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Date(), this.getDate(), "date", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Size(), theEcorePackage.getEIntegerObject(), "size", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Sha1Checksum(), theEcorePackage.getEString(), "sha1Checksum", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Text(), theEcorePackage.getEString(), "text", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_AccessUrl(), this.getURL(), "accessUrl", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_DownloadUrl(), this.getURL(), "downloadUrl", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_ExternalServiceUrl(), this.getURL(), "externalServiceUrl", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_MasterFile(), this.getFile(), this.getFile_DerivativeFile(), "masterFile", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_DerivativeFile(), this.getFile(), this.getFile_MasterFile(), "derivativeFile", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_FileLicense(), this.getURL(), "fileLicense", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFile__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getFile__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getFile__GetLicense(), this.getURL(), "getLicense", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Geometry(), theEcorePackage.getEString(), "geometry", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Bodies(), this.getBodyLocation(), this.getBodyLocation_Location(), "bodies", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Organizations(), this.getOrganizationLocation(), this.getOrganizationLocation_Location(), "organizations", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Meetings(), this.getMeetingLocation(), this.getMeetingLocation_Location(), "meetings", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_Papers(), this.getPaperLocation(), this.getPaperLocation_Location(), "papers", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLocation__GetType(), this.getOParlType(), "getType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(bodyLocationEClass, BodyLocation.class, "BodyLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyLocation_Body(), this.getBody(), this.getBody_Location(), "body", null, 0, 1, BodyLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBodyLocation_Location(), this.getLocation(), this.getLocation_Bodies(), "location", null, 0, 1, BodyLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationLocationEClass, OrganizationLocation.class, "OrganizationLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationLocation_Organziation(), this.getOrganization(), this.getOrganization_Location(), "organziation", null, 0, 1, OrganizationLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationLocation_Location(), this.getLocation(), this.getLocation_Organizations(), "location", null, 0, 1, OrganizationLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meetingLocationEClass, MeetingLocation.class, "MeetingLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeetingLocation_Meeting(), this.getMeeting(), this.getMeeting_Location(), "meeting", null, 0, 1, MeetingLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeetingLocation_Location(), this.getLocation(), this.getLocation_Meetings(), "location", null, 0, 1, MeetingLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paperLocationEClass, PaperLocation.class, "PaperLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaperLocation_Paper(), this.getPaper(), this.getPaper_Location(), "paper", null, 0, 1, PaperLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaperLocation_Location(), this.getLocation(), this.getLocation_Papers(), "location", null, 0, 1, PaperLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personOrOrganizationEClass, PersonOrOrganization.class, "PersonOrOrganization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invitationFileEClass, InvitationFile.class, "InvitationFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvitationFile_Meeting(), this.getMeeting(), this.getMeeting_Invitation(), "meeting", null, 0, 1, InvitationFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvitationFile_AgendaItem(), this.getAgendaItem(), null, "agendaItem", null, 0, -1, InvitationFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvitationFile_Paper(), this.getPaper(), null, "paper", null, 0, -1, InvitationFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsProtocolEClass, ResultsProtocol.class, "ResultsProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsProtocol_Meeting(), this.getMeeting(), this.getMeeting_ResultsProtocol(), "meeting", null, 0, 1, ResultsProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultsProtocol_AgendaItem(), this.getAgendaItem(), null, "agendaItem", null, 0, -1, ResultsProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultsProtocol_Paper(), this.getPaper(), null, "paper", null, 0, -1, ResultsProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verbatimProtocolEClass, VerbatimProtocol.class, "VerbatimProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerbatimProtocol_Meeting(), this.getMeeting(), this.getMeeting_VerbatimProtocol(), "meeting", null, 0, 1, VerbatimProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbatimProtocol_AgendaItem(), this.getAgendaItem(), null, "agendaItem", null, 0, -1, VerbatimProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerbatimProtocol_Paper(), this.getPaper(), null, "paper", null, 0, -1, VerbatimProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auxiliaryFileEClass, AuxiliaryFile.class, "AuxiliaryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuxiliaryFile_Meeting(), this.getMeeting(), this.getMeeting_AuxiliaryFile(), "meeting", null, 0, 1, AuxiliaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryFile_AgendaItem(), this.getAgendaItemAuxiliaryFile(), this.getAgendaItemAuxiliaryFile_AuxiliaryFile(), "agendaItem", null, 0, -1, AuxiliaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryFile_Paper(), this.getPaper(), null, "paper", null, 0, -1, AuxiliaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agendaItemResolutionFileEClass, AgendaItemResolutionFile.class, "AgendaItemResolutionFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgendaItemResolutionFile_AgendaItem(), this.getAgendaItem(), this.getAgendaItem_ResolutionFile(), "agendaItem", null, 0, 1, AgendaItemResolutionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgendaItemResolutionFile_ResolutionFile(), this.getResolutionFile(), this.getResolutionFile_AgendaItem(), "resolutionFile", null, 0, 1, AgendaItemResolutionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agendaItemAuxiliaryFileEClass, AgendaItemAuxiliaryFile.class, "AgendaItemAuxiliaryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgendaItemAuxiliaryFile_AgendaItem(), this.getAgendaItem(), this.getAgendaItem_AuxiliaryFile(), "agendaItem", null, 0, 1, AgendaItemAuxiliaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgendaItemAuxiliaryFile_AuxiliaryFile(), this.getAuxiliaryFile(), this.getAuxiliaryFile_AgendaItem(), "auxiliaryFile", null, 0, 1, AgendaItemAuxiliaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolutionFileEClass, ResolutionFile.class, "ResolutionFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolutionFile_AgendaItem(), this.getAgendaItemResolutionFile(), this.getAgendaItemResolutionFile_ResolutionFile(), "agendaItem", null, 0, -1, ResolutionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolutionFile_Paper(), this.getPaper(), null, "paper", null, 0, -1, ResolutionFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(urlEDataType, String.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oParlTypeEDataType, String.class, "OParlType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OparlPackageImpl
