/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * *
 * http://spec.oparl.org/version/master/OParl-1.0-draft.html
 * https://github.com/lu-j/oparl-json-schema/blob/master/schema/
 * <!-- end-model-doc -->
 * @see de.oklab.leipzig.oparl.OparlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.oklab.leipzig'"
 * @generated
 */
public interface OparlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oparl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.oklab.leipzig.oparl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oparl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OparlPackage eINSTANCE = de.oklab.leipzig.oparl.impl.OparlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl <em>Agenda Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.AgendaItemImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItem()
	 * @generated
	 */
	int AGENDA_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__MEETING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__RESOLUTION = 5;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__AUXILIARY_FILE = 6;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__KEYWORD = 7;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__PUBLIC = 8;

	/**
	 * The feature id for the '<em><b>Consultation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__CONSULTATION = 9;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__RESULT = 10;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__CREATED = 11;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__MODIFIED = 12;

	/**
	 * The number of structural features of the '<em>Agenda Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Agenda Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.MeetingImpl <em>Meeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.MeetingImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeeting()
	 * @generated
	 */
	int MEETING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__NAME = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__START = 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__END = 4;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__STREET_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__POSTAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__LOCALITY = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ORGANIZATION = 9;

	/**
	 * The feature id for the '<em><b>Chair Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__CHAIR_PERSON = 10;

	/**
	 * The feature id for the '<em><b>Scribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__SCRIBE = 11;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__PARTICIPANT = 12;

	/**
	 * The feature id for the '<em><b>Invitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__INVITATION = 13;

	/**
	 * The feature id for the '<em><b>Results Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__RESULTS_PROTOCOL = 14;

	/**
	 * The feature id for the '<em><b>Verbatim Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__VERBATIM_PROTOCOL = 15;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__AUXILIARY_FILE = 16;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__AGENDA_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__KEYWORD = 18;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__CREATED = 19;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__MODIFIED = 20;

	/**
	 * The number of structural features of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.ConsultationImpl <em>Consultation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.ConsultationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getConsultation()
	 * @generated
	 */
	int CONSULTATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__PAPER = 2;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__AGENDA_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Authoritative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__AUTHORITATIVE = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__KEYWORD = 7;

	/**
	 * The number of structural features of the '<em>Consultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Consultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.FileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MIME_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATE = 5;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFIED = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SHA1_CHECKSUM = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TEXT = 9;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ACCESS_URL = 10;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DOWNLOAD_URL = 11;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PAPER = 12;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MASTER_FILE = 13;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DERIVATIVE_FILE = 14;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LICENSE = 15;

	/**
	 * The feature id for the '<em><b>File Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_ROLE = 16;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KEYWORD = 17;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.InvitationFileImpl <em>Invitation File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.InvitationFileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getInvitationFile()
	 * @generated
	 */
	int INVITATION_FILE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__MIME_TYPE = FILE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__DATE = FILE__DATE;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__SHA1_CHECKSUM = FILE__SHA1_CHECKSUM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__ACCESS_URL = FILE__ACCESS_URL;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__DOWNLOAD_URL = FILE__DOWNLOAD_URL;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__PAPER = FILE__PAPER;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__MASTER_FILE = FILE__MASTER_FILE;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__DERIVATIVE_FILE = FILE__DERIVATIVE_FILE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>File Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__FILE_ROLE = FILE__FILE_ROLE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invitation File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Invitation File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.ResultsProtocolImpl <em>Results Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.ResultsProtocolImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getResultsProtocol()
	 * @generated
	 */
	int RESULTS_PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__MIME_TYPE = FILE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__DATE = FILE__DATE;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__SHA1_CHECKSUM = FILE__SHA1_CHECKSUM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__ACCESS_URL = FILE__ACCESS_URL;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__DOWNLOAD_URL = FILE__DOWNLOAD_URL;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__PAPER = FILE__PAPER;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__MASTER_FILE = FILE__MASTER_FILE;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__DERIVATIVE_FILE = FILE__DERIVATIVE_FILE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>File Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__FILE_ROLE = FILE__FILE_ROLE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Results Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Results Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.VerbatimProtocolImpl <em>Verbatim Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.VerbatimProtocolImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getVerbatimProtocol()
	 * @generated
	 */
	int VERBATIM_PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__MIME_TYPE = FILE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__DATE = FILE__DATE;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__SHA1_CHECKSUM = FILE__SHA1_CHECKSUM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__ACCESS_URL = FILE__ACCESS_URL;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__DOWNLOAD_URL = FILE__DOWNLOAD_URL;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__PAPER = FILE__PAPER;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__MASTER_FILE = FILE__MASTER_FILE;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__DERIVATIVE_FILE = FILE__DERIVATIVE_FILE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>File Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__FILE_ROLE = FILE__FILE_ROLE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verbatim Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verbatim Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.AuxiliaryFileImpl <em>Auxiliary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.AuxiliaryFileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAuxiliaryFile()
	 * @generated
	 */
	int AUXILIARY_FILE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__MIME_TYPE = FILE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__DATE = FILE__DATE;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__SHA1_CHECKSUM = FILE__SHA1_CHECKSUM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__ACCESS_URL = FILE__ACCESS_URL;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__DOWNLOAD_URL = FILE__DOWNLOAD_URL;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__PAPER = FILE__PAPER;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__MASTER_FILE = FILE__MASTER_FILE;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__DERIVATIVE_FILE = FILE__DERIVATIVE_FILE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>File Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__FILE_ROLE = FILE__FILE_ROLE;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.LocationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__GEOMETRY = 3;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__KEYWORD = 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PersonOrOrganizationImpl <em>Person Or Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PersonOrOrganizationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPersonOrOrganization()
	 * @generated
	 */
	int PERSON_OR_ORGANIZATION = 9;

	/**
	 * The number of structural features of the '<em>Person Or Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Person Or Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.OrganizationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TYPE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__BODY = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERSHIP = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEETING = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SHORT_NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__POST = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sub Organization Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SUB_ORGANIZATION_OF = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CLASSIFICATION = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__KEYWORD = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__START_DATE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__END_DATE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CREATED = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MODIFIED = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__WEBSITE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PersonImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TYPE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BODY = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FAMILY_NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GIVEN_NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Form Of Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FORM_OF_ADDRESS = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TITLE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STREET_ADDRESS = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__POSTAL_CODE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCALITY = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STATUS = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEMBERSHIP = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KEYWORD = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MODIFIED = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.MembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.MembershipImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__PERSON = 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__POST = 5;

	/**
	 * The feature id for the '<em><b>On Behalf Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ON_BEHALF_OF = 6;

	/**
	 * The feature id for the '<em><b>Voting Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__VOTING_RIGHT = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__START_DATE = 8;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__END_DATE = 9;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PaperImpl <em>Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PaperImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPaper()
	 * @generated
	 */
	int PAPER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__BODY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PUBLISHED_DATE = 5;

	/**
	 * The feature id for the '<em><b>Paper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PAPER_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Related Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__RELATED_PAPER = 7;

	/**
	 * The feature id for the '<em><b>Main File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__MAIN_FILE = 8;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__AUXILIARY_FILE = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Originator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__ORIGINATOR = 11;

	/**
	 * The feature id for the '<em><b>Consultation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__CONSULTATION = 12;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__MODIFIED = 13;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__KEYWORD = 14;

	/**
	 * The feature id for the '<em><b>Under Directionof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__UNDER_DIRECTIONOF = 15;

	/**
	 * The number of structural features of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.BodyImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SHORT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__NAME = 4;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__WEBSITE = 5;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LICENSE = 6;

	/**
	 * The feature id for the '<em><b>License Valid Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LICENSE_VALID_SINCE = 7;

	/**
	 * The feature id for the '<em><b>Rgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RGS = 8;

	/**
	 * The feature id for the '<em><b>Equivalent Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__EQUIVALENT_BODY = 9;

	/**
	 * The feature id for the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CONTACT_EMAIL = 10;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CONTACT_NAME = 11;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__PAPER = 12;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MEMBER = 13;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MEETING = 14;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ORGANIZATION = 15;

	/**
	 * The feature id for the '<em><b>Legislative Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEGISLATIVE_TERM = 16;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CLASSIFICATION = 17;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__KEYWORD = 18;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CREATED = 19;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MODIFIED = 20;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.SystemImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Oparl Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OPARL_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BODIES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 4;

	/**
	 * The feature id for the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTACT_EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTACT_NAME = 6;

	/**
	 * The feature id for the '<em><b>New Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NEW_OBJECTS = 7;

	/**
	 * The feature id for the '<em><b>Updated Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__UPDATED_OBJECTS = 8;

	/**
	 * The feature id for the '<em><b>Removed Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REMOVED_OBJECTS = 9;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__WEBSITE = 10;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VENDOR = 11;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PRODUCT = 12;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.LegislativeTermImpl <em>Legislative Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.LegislativeTermImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getLegislativeTerm()
	 * @generated
	 */
	int LEGISLATIVE_TERM = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__BODY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__END_DATE = 5;

	/**
	 * The number of structural features of the '<em>Legislative Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Legislative Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getURL()
	 * @generated
	 */
	int URL = 17;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 18;


	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.AgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem
	 * @generated
	 */
	EClass getAgendaItem();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getId()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getType()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.AgendaItem#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getMeeting()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EReference getAgendaItem_Meeting();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getName()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getNumber()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Number();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getResolution()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Resolution();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EReference getAgendaItem_AuxiliaryFile();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.AgendaItem#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getKeyword()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#isPublic()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Public();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.AgendaItem#getConsultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consultation</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getConsultation()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EReference getAgendaItem_Consultation();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getResult()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Result();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getCreated()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getModified()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Modified();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Meeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting
	 * @generated
	 */
	EClass getMeeting();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getId()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getType()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getName()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getStart()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getEnd()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_End();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getStreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Address</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getStreetAddress()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_StreetAddress();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getPostalCode()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getLocality()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Locality();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Meeting#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getLocation()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Location();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Meeting#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getOrganization()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Organization();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Meeting#getChairPerson <em>Chair Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chair Person</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getChairPerson()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_ChairPerson();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Meeting#getScribe <em>Scribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scribe</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getScribe()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Scribe();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Meeting#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getParticipant()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Participant();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Meeting#getInvitation <em>Invitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invitation</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getInvitation()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_Invitation();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Meeting#getResultsProtocol <em>Results Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Results Protocol</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getResultsProtocol()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_ResultsProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Meeting#getVerbatimProtocol <em>Verbatim Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verbatim Protocol</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getVerbatimProtocol()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_VerbatimProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_AuxiliaryFile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Meeting#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getAgendaItem()
	 * @see #getMeeting()
	 * @generated
	 */
	EReference getMeeting_AgendaItem();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Meeting#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getKeyword()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getCreated()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getModified()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Modified();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Consultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consultation</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation
	 * @generated
	 */
	EClass getConsultation();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Consultation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getId()
	 * @see #getConsultation()
	 * @generated
	 */
	EAttribute getConsultation_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Consultation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getType()
	 * @see #getConsultation()
	 * @generated
	 */
	EAttribute getConsultation_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getPaper()
	 * @see #getConsultation()
	 * @generated
	 */
	EReference getConsultation_Paper();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Consultation#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getAgendaItem()
	 * @see #getConsultation()
	 * @generated
	 */
	EReference getConsultation_AgendaItem();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Consultation#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getOrganization()
	 * @see #getConsultation()
	 * @generated
	 */
	EReference getConsultation_Organization();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Consultation#isAuthoritative <em>Authoritative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authoritative</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#isAuthoritative()
	 * @see #getConsultation()
	 * @generated
	 */
	EAttribute getConsultation_Authoritative();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Consultation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getRole()
	 * @see #getConsultation()
	 * @generated
	 */
	EAttribute getConsultation_Role();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Consultation#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getKeyword()
	 * @see #getConsultation()
	 * @generated
	 */
	EAttribute getConsultation_Keyword();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.InvitationFile <em>Invitation File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation File</em>'.
	 * @see de.oklab.leipzig.oparl.InvitationFile
	 * @generated
	 */
	EClass getInvitationFile();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.InvitationFile#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.InvitationFile#getMeeting()
	 * @see #getInvitationFile()
	 * @generated
	 */
	EReference getInvitationFile_Meeting();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.ResultsProtocol <em>Results Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results Protocol</em>'.
	 * @see de.oklab.leipzig.oparl.ResultsProtocol
	 * @generated
	 */
	EClass getResultsProtocol();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.ResultsProtocol#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.ResultsProtocol#getMeeting()
	 * @see #getResultsProtocol()
	 * @generated
	 */
	EReference getResultsProtocol_Meeting();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.VerbatimProtocol <em>Verbatim Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbatim Protocol</em>'.
	 * @see de.oklab.leipzig.oparl.VerbatimProtocol
	 * @generated
	 */
	EClass getVerbatimProtocol();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.VerbatimProtocol#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.VerbatimProtocol#getMeeting()
	 * @see #getVerbatimProtocol()
	 * @generated
	 */
	EReference getVerbatimProtocol_Meeting();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.AuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.AuxiliaryFile
	 * @generated
	 */
	EClass getAuxiliaryFile();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.AuxiliaryFile#getMeeting()
	 * @see #getAuxiliaryFile()
	 * @generated
	 */
	EReference getAuxiliaryFile_Meeting();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see de.oklab.leipzig.oparl.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.File#getId()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.File#getType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see de.oklab.leipzig.oparl.File#getFileName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see de.oklab.leipzig.oparl.File#getMimeType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.oklab.leipzig.oparl.File#getDate()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Date();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.File#getModified()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.oklab.leipzig.oparl.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getSha1Checksum <em>Sha1 Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sha1 Checksum</em>'.
	 * @see de.oklab.leipzig.oparl.File#getSha1Checksum()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Sha1Checksum();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.oklab.leipzig.oparl.File#getText()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getAccessUrl <em>Access Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Url</em>'.
	 * @see de.oklab.leipzig.oparl.File#getAccessUrl()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_AccessUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getDownloadUrl <em>Download Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Url</em>'.
	 * @see de.oklab.leipzig.oparl.File#getDownloadUrl()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_DownloadUrl();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.File#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.File#getPaper()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Paper();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.File#getMasterFile <em>Master File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master File</em>'.
	 * @see de.oklab.leipzig.oparl.File#getMasterFile()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_MasterFile();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.File#getDerivativeFile <em>Derivative File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derivative File</em>'.
	 * @see de.oklab.leipzig.oparl.File#getDerivativeFile()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_DerivativeFile();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see de.oklab.leipzig.oparl.File#getLicense()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_License();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getFileRole <em>File Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Role</em>'.
	 * @see de.oklab.leipzig.oparl.File#getFileRole()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileRole();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.File#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.File#getKeyword()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Keyword();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Location#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getType()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Location#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getDescription()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Location#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getGeometry()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Geometry();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Location#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getKeyword()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Keyword();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.PersonOrOrganization <em>Person Or Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Or Organization</em>'.
	 * @see de.oklab.leipzig.oparl.PersonOrOrganization
	 * @generated
	 */
	EClass getPersonOrOrganization();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getId()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getType()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getBody()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Body();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Organization#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Membership</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getMembership()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Membership();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Organization#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getMeeting()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Meeting();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getShortName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_ShortName();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Organization#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Post</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getPost()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Post();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Organization#getSubOrganizationOf <em>Sub Organization Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Organization Of</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getSubOrganizationOf()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_SubOrganizationOf();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getClassification()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Classification();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Organization#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getKeyword()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getStartDate()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getEndDate()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getCreated()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getModified()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Modified();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getWebsite()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Website();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.oklab.leipzig.oparl.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getType()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getBody()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Body();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getFamilyName <em>Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family Name</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getFamilyName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FamilyName();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getGivenName <em>Given Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given Name</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getGivenName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_GivenName();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getFormOfAddress <em>Form Of Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Of Address</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getFormOfAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FormOfAddress();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Person#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getTitle()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getPhone()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Phone();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getStreetAddress <em>Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Address</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getStreetAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_StreetAddress();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getPostalCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getLocality()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Locality();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Person#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Status</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Status();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Person#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Membership</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getMembership()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Membership();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Person#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getKeyword()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getCreated()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getModified()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Modified();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see de.oklab.leipzig.oparl.Membership
	 * @generated
	 */
	EClass getMembership();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getId()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getType()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getPerson()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Person();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getOrganization()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Organization();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getRole()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Role();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getPost()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Post();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getOnBehalfOf <em>On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Behalf Of</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getOnBehalfOf()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_OnBehalfOf();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#isVotingRight <em>Voting Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voting Right</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#isVotingRight()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_VotingRight();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getStartDate()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Membership#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getEndDate()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_EndDate();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Paper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Paper
	 * @generated
	 */
	EClass getPaper();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getId()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getType()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getBody()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Body();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getName()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getReference()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Reference();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getPublishedDate <em>Published Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published Date</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getPublishedDate()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_PublishedDate();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getPaperType <em>Paper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paper Type</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getPaperType()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_PaperType();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getRelatedPaper <em>Related Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getRelatedPaper()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_RelatedPaper();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Paper#getMainFile <em>Main File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main File</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getMainFile()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_MainFile();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getAuxiliaryFile()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_AuxiliaryFile();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getLocation()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Location();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getOriginator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originator</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getOriginator()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Originator();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getConsultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consultation</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getConsultation()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Consultation();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Paper#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getModified()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Modified();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Paper#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getKeyword()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Keyword();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getUnderDirectionof <em>Under Directionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Under Directionof</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getUnderDirectionof()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_UnderDirectionof();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getId()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getType()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getSystem()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_System();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getShortName()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getName()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getWebsite()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Website();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getLicense()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_License();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getLicenseValidSince <em>License Valid Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Valid Since</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getLicenseValidSince()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_LicenseValidSince();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getRgs <em>Rgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rgs</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getRgs()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Rgs();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Body#getEquivalentBody <em>Equivalent Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equivalent Body</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getEquivalentBody()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_EquivalentBody();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getContactEmail <em>Contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Email</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getContactEmail()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_ContactEmail();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Name</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getContactName()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_ContactName();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Body#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getPaper()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Paper();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Body#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getMember()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Member();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Body#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getMeeting()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Meeting();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Body#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getOrganization()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Organization();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Body#getLegislativeTerm <em>Legislative Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Legislative Term</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getLegislativeTerm()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LegislativeTerm();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getClassification()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Classification();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Body#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getKeyword()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getCreated()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getModified()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Modified();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see de.oklab.leipzig.oparl.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.System#getId()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.System#getType()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getOparlVersion <em>Oparl Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oparl Version</em>'.
	 * @see de.oklab.leipzig.oparl.System#getOparlVersion()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_OparlVersion();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.System#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bodies</em>'.
	 * @see de.oklab.leipzig.oparl.System#getBodies()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Bodies();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getContactEmail <em>Contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Email</em>'.
	 * @see de.oklab.leipzig.oparl.System#getContactEmail()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_ContactEmail();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Name</em>'.
	 * @see de.oklab.leipzig.oparl.System#getContactName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_ContactName();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getNewObjects <em>New Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Objects</em>'.
	 * @see de.oklab.leipzig.oparl.System#getNewObjects()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_NewObjects();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getUpdatedObjects <em>Updated Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated Objects</em>'.
	 * @see de.oklab.leipzig.oparl.System#getUpdatedObjects()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_UpdatedObjects();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getRemovedObjects <em>Removed Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removed Objects</em>'.
	 * @see de.oklab.leipzig.oparl.System#getRemovedObjects()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_RemovedObjects();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see de.oklab.leipzig.oparl.System#getWebsite()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Website();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see de.oklab.leipzig.oparl.System#getVendor()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product</em>'.
	 * @see de.oklab.leipzig.oparl.System#getProduct()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Product();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.LegislativeTerm <em>Legislative Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legislative Term</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm
	 * @generated
	 */
	EClass getLegislativeTerm();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.LegislativeTerm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getId()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EAttribute getLegislativeTerm_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.LegislativeTerm#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getType()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EAttribute getLegislativeTerm_Type();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getBody()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EReference getLegislativeTerm_Body();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.LegislativeTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getName()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EAttribute getLegislativeTerm_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.LegislativeTerm#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getStartDate()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EAttribute getLegislativeTerm_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.LegislativeTerm#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getEndDate()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EAttribute getLegislativeTerm_EndDate();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OparlFactory getOparlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl <em>Agenda Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.AgendaItemImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItem()
		 * @generated
		 */
		EClass AGENDA_ITEM = eINSTANCE.getAgendaItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__ID = eINSTANCE.getAgendaItem_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__TYPE = eINSTANCE.getAgendaItem_Type();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM__MEETING = eINSTANCE.getAgendaItem_Meeting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__NAME = eINSTANCE.getAgendaItem_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__NUMBER = eINSTANCE.getAgendaItem_Number();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__RESOLUTION = eINSTANCE.getAgendaItem_Resolution();

		/**
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM__AUXILIARY_FILE = eINSTANCE.getAgendaItem_AuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__KEYWORD = eINSTANCE.getAgendaItem_Keyword();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__PUBLIC = eINSTANCE.getAgendaItem_Public();

		/**
		 * The meta object literal for the '<em><b>Consultation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM__CONSULTATION = eINSTANCE.getAgendaItem_Consultation();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__RESULT = eINSTANCE.getAgendaItem_Result();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__CREATED = eINSTANCE.getAgendaItem_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__MODIFIED = eINSTANCE.getAgendaItem_Modified();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.MeetingImpl <em>Meeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.MeetingImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeeting()
		 * @generated
		 */
		EClass MEETING = eINSTANCE.getMeeting();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__ID = eINSTANCE.getMeeting_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__TYPE = eINSTANCE.getMeeting_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__NAME = eINSTANCE.getMeeting_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__START = eINSTANCE.getMeeting_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__END = eINSTANCE.getMeeting_End();

		/**
		 * The meta object literal for the '<em><b>Street Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__STREET_ADDRESS = eINSTANCE.getMeeting_StreetAddress();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__POSTAL_CODE = eINSTANCE.getMeeting_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__LOCALITY = eINSTANCE.getMeeting_Locality();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__LOCATION = eINSTANCE.getMeeting_Location();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__ORGANIZATION = eINSTANCE.getMeeting_Organization();

		/**
		 * The meta object literal for the '<em><b>Chair Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__CHAIR_PERSON = eINSTANCE.getMeeting_ChairPerson();

		/**
		 * The meta object literal for the '<em><b>Scribe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__SCRIBE = eINSTANCE.getMeeting_Scribe();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__PARTICIPANT = eINSTANCE.getMeeting_Participant();

		/**
		 * The meta object literal for the '<em><b>Invitation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__INVITATION = eINSTANCE.getMeeting_Invitation();

		/**
		 * The meta object literal for the '<em><b>Results Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__RESULTS_PROTOCOL = eINSTANCE.getMeeting_ResultsProtocol();

		/**
		 * The meta object literal for the '<em><b>Verbatim Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__VERBATIM_PROTOCOL = eINSTANCE.getMeeting_VerbatimProtocol();

		/**
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__AUXILIARY_FILE = eINSTANCE.getMeeting_AuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING__AGENDA_ITEM = eINSTANCE.getMeeting_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__KEYWORD = eINSTANCE.getMeeting_Keyword();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__CREATED = eINSTANCE.getMeeting_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__MODIFIED = eINSTANCE.getMeeting_Modified();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.ConsultationImpl <em>Consultation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.ConsultationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getConsultation()
		 * @generated
		 */
		EClass CONSULTATION = eINSTANCE.getConsultation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSULTATION__ID = eINSTANCE.getConsultation_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSULTATION__TYPE = eINSTANCE.getConsultation_Type();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSULTATION__PAPER = eINSTANCE.getConsultation_Paper();

		/**
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSULTATION__AGENDA_ITEM = eINSTANCE.getConsultation_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSULTATION__ORGANIZATION = eINSTANCE.getConsultation_Organization();

		/**
		 * The meta object literal for the '<em><b>Authoritative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSULTATION__AUTHORITATIVE = eINSTANCE.getConsultation_Authoritative();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSULTATION__ROLE = eINSTANCE.getConsultation_Role();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSULTATION__KEYWORD = eINSTANCE.getConsultation_Keyword();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.InvitationFileImpl <em>Invitation File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.InvitationFileImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getInvitationFile()
		 * @generated
		 */
		EClass INVITATION_FILE = eINSTANCE.getInvitationFile();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITATION_FILE__MEETING = eINSTANCE.getInvitationFile_Meeting();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.ResultsProtocolImpl <em>Results Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.ResultsProtocolImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getResultsProtocol()
		 * @generated
		 */
		EClass RESULTS_PROTOCOL = eINSTANCE.getResultsProtocol();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_PROTOCOL__MEETING = eINSTANCE.getResultsProtocol_Meeting();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.VerbatimProtocolImpl <em>Verbatim Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.VerbatimProtocolImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getVerbatimProtocol()
		 * @generated
		 */
		EClass VERBATIM_PROTOCOL = eINSTANCE.getVerbatimProtocol();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBATIM_PROTOCOL__MEETING = eINSTANCE.getVerbatimProtocol_Meeting();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.AuxiliaryFileImpl <em>Auxiliary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.AuxiliaryFileImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAuxiliaryFile()
		 * @generated
		 */
		EClass AUXILIARY_FILE = eINSTANCE.getAuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_FILE__MEETING = eINSTANCE.getAuxiliaryFile_Meeting();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.FileImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__ID = eINSTANCE.getFile_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TYPE = eINSTANCE.getFile_Type();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_NAME = eINSTANCE.getFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MIME_TYPE = eINSTANCE.getFile_MimeType();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DATE = eINSTANCE.getFile_Date();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MODIFIED = eINSTANCE.getFile_Modified();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SIZE = eINSTANCE.getFile_Size();

		/**
		 * The meta object literal for the '<em><b>Sha1 Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SHA1_CHECKSUM = eINSTANCE.getFile_Sha1Checksum();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TEXT = eINSTANCE.getFile_Text();

		/**
		 * The meta object literal for the '<em><b>Access Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__ACCESS_URL = eINSTANCE.getFile_AccessUrl();

		/**
		 * The meta object literal for the '<em><b>Download Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DOWNLOAD_URL = eINSTANCE.getFile_DownloadUrl();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PAPER = eINSTANCE.getFile_Paper();

		/**
		 * The meta object literal for the '<em><b>Master File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__MASTER_FILE = eINSTANCE.getFile_MasterFile();

		/**
		 * The meta object literal for the '<em><b>Derivative File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__DERIVATIVE_FILE = eINSTANCE.getFile_DerivativeFile();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__LICENSE = eINSTANCE.getFile_License();

		/**
		 * The meta object literal for the '<em><b>File Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_ROLE = eINSTANCE.getFile_FileRole();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__KEYWORD = eINSTANCE.getFile_Keyword();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.LocationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ID = eINSTANCE.getLocation_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__TYPE = eINSTANCE.getLocation_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__DESCRIPTION = eINSTANCE.getLocation_Description();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__GEOMETRY = eINSTANCE.getLocation_Geometry();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__KEYWORD = eINSTANCE.getLocation_Keyword();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.PersonOrOrganizationImpl <em>Person Or Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.PersonOrOrganizationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPersonOrOrganization()
		 * @generated
		 */
		EClass PERSON_OR_ORGANIZATION = eINSTANCE.getPersonOrOrganization();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.OrganizationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ID = eINSTANCE.getOrganization_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__TYPE = eINSTANCE.getOrganization_Type();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__BODY = eINSTANCE.getOrganization_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEMBERSHIP = eINSTANCE.getOrganization_Membership();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEETING = eINSTANCE.getOrganization_Meeting();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__SHORT_NAME = eINSTANCE.getOrganization_ShortName();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__POST = eINSTANCE.getOrganization_Post();

		/**
		 * The meta object literal for the '<em><b>Sub Organization Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__SUB_ORGANIZATION_OF = eINSTANCE.getOrganization_SubOrganizationOf();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__CLASSIFICATION = eINSTANCE.getOrganization_Classification();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__KEYWORD = eINSTANCE.getOrganization_Keyword();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__START_DATE = eINSTANCE.getOrganization_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__END_DATE = eINSTANCE.getOrganization_EndDate();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__CREATED = eINSTANCE.getOrganization_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__MODIFIED = eINSTANCE.getOrganization_Modified();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__WEBSITE = eINSTANCE.getOrganization_Website();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.PersonImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TYPE = eINSTANCE.getPerson_Type();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BODY = eINSTANCE.getPerson_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Family Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FAMILY_NAME = eINSTANCE.getPerson_FamilyName();

		/**
		 * The meta object literal for the '<em><b>Given Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GIVEN_NAME = eINSTANCE.getPerson_GivenName();

		/**
		 * The meta object literal for the '<em><b>Form Of Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FORM_OF_ADDRESS = eINSTANCE.getPerson_FormOfAddress();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TITLE = eINSTANCE.getPerson_Title();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PHONE = eINSTANCE.getPerson_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Street Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__STREET_ADDRESS = eINSTANCE.getPerson_StreetAddress();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__POSTAL_CODE = eINSTANCE.getPerson_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LOCALITY = eINSTANCE.getPerson_Locality();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__STATUS = eINSTANCE.getPerson_Status();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MEMBERSHIP = eINSTANCE.getPerson_Membership();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__KEYWORD = eINSTANCE.getPerson_Keyword();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CREATED = eINSTANCE.getPerson_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MODIFIED = eINSTANCE.getPerson_Modified();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.MembershipImpl <em>Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.MembershipImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMembership()
		 * @generated
		 */
		EClass MEMBERSHIP = eINSTANCE.getMembership();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__ID = eINSTANCE.getMembership_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__TYPE = eINSTANCE.getMembership_Type();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__PERSON = eINSTANCE.getMembership_Person();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__ORGANIZATION = eINSTANCE.getMembership_Organization();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__ROLE = eINSTANCE.getMembership_Role();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__POST = eINSTANCE.getMembership_Post();

		/**
		 * The meta object literal for the '<em><b>On Behalf Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__ON_BEHALF_OF = eINSTANCE.getMembership_OnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Voting Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__VOTING_RIGHT = eINSTANCE.getMembership_VotingRight();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__START_DATE = eINSTANCE.getMembership_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP__END_DATE = eINSTANCE.getMembership_EndDate();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.PaperImpl <em>Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.PaperImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPaper()
		 * @generated
		 */
		EClass PAPER = eINSTANCE.getPaper();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__ID = eINSTANCE.getPaper_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__TYPE = eINSTANCE.getPaper_Type();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__BODY = eINSTANCE.getPaper_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__NAME = eINSTANCE.getPaper_Name();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__REFERENCE = eINSTANCE.getPaper_Reference();

		/**
		 * The meta object literal for the '<em><b>Published Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__PUBLISHED_DATE = eINSTANCE.getPaper_PublishedDate();

		/**
		 * The meta object literal for the '<em><b>Paper Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__PAPER_TYPE = eINSTANCE.getPaper_PaperType();

		/**
		 * The meta object literal for the '<em><b>Related Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__RELATED_PAPER = eINSTANCE.getPaper_RelatedPaper();

		/**
		 * The meta object literal for the '<em><b>Main File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__MAIN_FILE = eINSTANCE.getPaper_MainFile();

		/**
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__AUXILIARY_FILE = eINSTANCE.getPaper_AuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__LOCATION = eINSTANCE.getPaper_Location();

		/**
		 * The meta object literal for the '<em><b>Originator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__ORIGINATOR = eINSTANCE.getPaper_Originator();

		/**
		 * The meta object literal for the '<em><b>Consultation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__CONSULTATION = eINSTANCE.getPaper_Consultation();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__MODIFIED = eINSTANCE.getPaper_Modified();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__KEYWORD = eINSTANCE.getPaper_Keyword();

		/**
		 * The meta object literal for the '<em><b>Under Directionof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__UNDER_DIRECTIONOF = eINSTANCE.getPaper_UnderDirectionof();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.BodyImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__ID = eINSTANCE.getBody_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__TYPE = eINSTANCE.getBody_Type();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__SYSTEM = eINSTANCE.getBody_System();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__SHORT_NAME = eINSTANCE.getBody_ShortName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__NAME = eINSTANCE.getBody_Name();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__WEBSITE = eINSTANCE.getBody_Website();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__LICENSE = eINSTANCE.getBody_License();

		/**
		 * The meta object literal for the '<em><b>License Valid Since</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__LICENSE_VALID_SINCE = eINSTANCE.getBody_LicenseValidSince();

		/**
		 * The meta object literal for the '<em><b>Rgs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__RGS = eINSTANCE.getBody_Rgs();

		/**
		 * The meta object literal for the '<em><b>Equivalent Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__EQUIVALENT_BODY = eINSTANCE.getBody_EquivalentBody();

		/**
		 * The meta object literal for the '<em><b>Contact Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__CONTACT_EMAIL = eINSTANCE.getBody_ContactEmail();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__CONTACT_NAME = eINSTANCE.getBody_ContactName();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__PAPER = eINSTANCE.getBody_Paper();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__MEMBER = eINSTANCE.getBody_Member();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__MEETING = eINSTANCE.getBody_Meeting();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__ORGANIZATION = eINSTANCE.getBody_Organization();

		/**
		 * The meta object literal for the '<em><b>Legislative Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LEGISLATIVE_TERM = eINSTANCE.getBody_LegislativeTerm();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__CLASSIFICATION = eINSTANCE.getBody_Classification();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__KEYWORD = eINSTANCE.getBody_Keyword();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__CREATED = eINSTANCE.getBody_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__MODIFIED = eINSTANCE.getBody_Modified();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.SystemImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ID = eINSTANCE.getSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__TYPE = eINSTANCE.getSystem_Type();

		/**
		 * The meta object literal for the '<em><b>Oparl Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__OPARL_VERSION = eINSTANCE.getSystem_OparlVersion();

		/**
		 * The meta object literal for the '<em><b>Bodies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BODIES = eINSTANCE.getSystem_Bodies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Contact Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__CONTACT_EMAIL = eINSTANCE.getSystem_ContactEmail();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__CONTACT_NAME = eINSTANCE.getSystem_ContactName();

		/**
		 * The meta object literal for the '<em><b>New Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NEW_OBJECTS = eINSTANCE.getSystem_NewObjects();

		/**
		 * The meta object literal for the '<em><b>Updated Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__UPDATED_OBJECTS = eINSTANCE.getSystem_UpdatedObjects();

		/**
		 * The meta object literal for the '<em><b>Removed Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__REMOVED_OBJECTS = eINSTANCE.getSystem_RemovedObjects();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__WEBSITE = eINSTANCE.getSystem_Website();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__VENDOR = eINSTANCE.getSystem_Vendor();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__PRODUCT = eINSTANCE.getSystem_Product();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.LegislativeTermImpl <em>Legislative Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.LegislativeTermImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getLegislativeTerm()
		 * @generated
		 */
		EClass LEGISLATIVE_TERM = eINSTANCE.getLegislativeTerm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGISLATIVE_TERM__ID = eINSTANCE.getLegislativeTerm_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGISLATIVE_TERM__TYPE = eINSTANCE.getLegislativeTerm_Type();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGISLATIVE_TERM__BODY = eINSTANCE.getLegislativeTerm_Body();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGISLATIVE_TERM__NAME = eINSTANCE.getLegislativeTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGISLATIVE_TERM__START_DATE = eINSTANCE.getLegislativeTerm_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGISLATIVE_TERM__END_DATE = eINSTANCE.getLegislativeTerm_EndDate();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //OparlPackage
