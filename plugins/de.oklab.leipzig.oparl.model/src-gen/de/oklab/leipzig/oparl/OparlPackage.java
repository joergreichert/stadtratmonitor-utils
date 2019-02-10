/**
 */
package de.oklab.leipzig.oparl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * https://oparl.org/spezifikation/online-ansicht/#entity-system
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
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.IdentifiableImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE___GET_ID = 0;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE___SET_ID__STRING = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.TypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.TypedImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 1;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED___GET_ID = IDENTIFIABLE___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED___SET_ID__STRING = IDENTIFIABLE___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED___GET_TYPE = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.TaggedImpl <em>Tagged</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.TaggedImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getTagged()
	 * @generated
	 */
	int TAGGED = 2;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED__ID = TYPED__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED__KEYWORD = TYPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tagged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_FEATURE_COUNT = TYPED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED___GET_ID = TYPED___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED___SET_ID__STRING = TYPED___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED___GET_TYPE = TYPED___GET_TYPE;

	/**
	 * The number of operations of the '<em>Tagged</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_OPERATION_COUNT = TYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.NamedImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 3;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__ID = TAGGED__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__KEYWORD = TAGGED__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = TAGGED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = TAGGED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___GET_ID = TAGGED___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___SET_ID__STRING = TAGGED___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___GET_TYPE = TAGGED___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___GET_NAME = TAGGED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___SET_NAME__STRING = TAGGED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = TAGGED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.DatedImpl <em>Dated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.DatedImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getDated()
	 * @generated
	 */
	int DATED = 4;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED__ID = NAMED__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED__KEYWORD = NAMED__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED__CREATED = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED__MODIFIED = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED___GET_ID = NAMED___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED___SET_ID__STRING = NAMED___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED___GET_TYPE = NAMED___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED___GET_NAME = NAMED___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED___SET_NAME__STRING = NAMED___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Dated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATED_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.OParlElementImpl <em>OParl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.OParlElementImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOParlElement()
	 * @generated
	 */
	int OPARL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__ID = DATED__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__KEYWORD = DATED__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__NAME = DATED__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__CREATED = DATED__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__MODIFIED = DATED__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__SHORT_NAME = DATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__LICENSE = DATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT__DELETED = DATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OParl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT_FEATURE_COUNT = DATED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT___GET_ID = DATED___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT___SET_ID__STRING = DATED___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT___GET_TYPE = DATED___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT___GET_NAME = DATED___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT___SET_NAME__STRING = DATED___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>OParl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPARL_ELEMENT_OPERATION_COUNT = DATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.InnerOParlElementImpl <em>Inner OParl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.InnerOParlElementImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getInnerOParlElement()
	 * @generated
	 */
	int INNER_OPARL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT__ID = TAGGED__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT__KEYWORD = TAGGED__KEYWORD;

	/**
	 * The number of structural features of the '<em>Inner OParl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT_FEATURE_COUNT = TAGGED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT___GET_ID = TAGGED___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT___SET_ID__STRING = TAGGED___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT___GET_TYPE = TAGGED___GET_TYPE;

	/**
	 * The number of operations of the '<em>Inner OParl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_OPARL_ELEMENT_OPERATION_COUNT = TAGGED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.SystemImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__KEYWORD = OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CREATED = OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODIFIED = OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SHORT_NAME = OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LICENSE = OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DELETED = OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>oparl Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OPARL_VERSION = OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Oparl Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OTHER_OPARL_VERSIONS = OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BODIES = OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTACT_EMAIL = OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTACT_NAME = OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__WEBSITE = OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VENDOR = OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PRODUCT = OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = OPARL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___GET_ID = OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SET_ID__STRING = OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SET_NAME__STRING = OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___GET_TYPE = OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Oparl Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___GET_OPARL_VERSION = OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Oparl Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SET_OPARL_VERSION__STRING = OPARL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___GET_NAME = OPARL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Contact Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___GET_CONTACT_EMAIL = OPARL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Contact Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SET_CONTACT_EMAIL__STRING = OPARL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = OPARL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl <em>Addressable OParl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAddressableOParlElement()
	 * @generated
	 */
	int ADDRESSABLE_OPARL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__ID = OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__KEYWORD = OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__NAME = OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__CREATED = OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__MODIFIED = OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__SHORT_NAME = OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__LICENSE = OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__DELETED = OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS = OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE = OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT__LOCALITY = OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Addressable OParl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT = OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___GET_ID = OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___SET_ID__STRING = OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___GET_TYPE = OPARL_ELEMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___GET_NAME = OPARL_ELEMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___SET_NAME__STRING = OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS = OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING = OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE = OPARL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING = OPARL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY = OPARL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING = OPARL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Addressable OParl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT = OPARL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.BodyImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 8;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ID = ADDRESSABLE_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__KEYWORD = ADDRESSABLE_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__NAME = ADDRESSABLE_OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CREATED = ADDRESSABLE_OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MODIFIED = ADDRESSABLE_OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SHORT_NAME = ADDRESSABLE_OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LICENSE = ADDRESSABLE_OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__DELETED = ADDRESSABLE_OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__STREET_ADDRESS = ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__POSTAL_CODE = ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LOCALITY = ADDRESSABLE_OPARL_ELEMENT__LOCALITY;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SYSTEM = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__WEBSITE = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>License Valid Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LICENSE_VALID_SINCE = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Oparl Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__OPARL_SINCE = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__AGS = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__RGS = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Equivalent Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__EQUIVALENT_BODY = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CONTACT_EMAIL = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CONTACT_NAME = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ORGANIZATION = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__PERSON = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__MEETING = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__PAPER = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Legislative Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LEGISLATIVE_TERM = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__CLASSIFICATION = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LOCATION = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_ID = ADDRESSABLE_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___SET_ID__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_NAME = ADDRESSABLE_OPARL_ELEMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___SET_NAME__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___SET_STREET_ADDRESS__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Set Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___SET_POSTAL_CODE__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING;

	/**
	 * The operation id for the '<em>Set Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___SET_LOCALITY__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_TYPE = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Contact Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_CONTACT_EMAIL = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Contact Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___SET_CONTACT_EMAIL__STRING = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_STREET_ADDRESS = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_POSTAL_CODE = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY___GET_LOCALITY = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.LegislativeTermImpl <em>Legislative Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.LegislativeTermImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getLegislativeTerm()
	 * @generated
	 */
	int LEGISLATIVE_TERM = 10;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__ID = INNER_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__KEYWORD = INNER_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__NAME = INNER_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__BODY = INNER_OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__START_DATE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM__END_DATE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Legislative Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM_FEATURE_COUNT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM___GET_ID = INNER_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM___SET_ID__STRING = INNER_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM___GET_TYPE = INNER_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legislative Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGISLATIVE_TERM_OPERATION_COUNT = INNER_OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PersonOrOrganizationImpl <em>Person Or Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PersonOrOrganizationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPersonOrOrganization()
	 * @generated
	 */
	int PERSON_OR_ORGANIZATION = 25;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__ID = ADDRESSABLE_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__KEYWORD = ADDRESSABLE_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__NAME = ADDRESSABLE_OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__CREATED = ADDRESSABLE_OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__MODIFIED = ADDRESSABLE_OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__SHORT_NAME = ADDRESSABLE_OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__LICENSE = ADDRESSABLE_OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__DELETED = ADDRESSABLE_OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__STREET_ADDRESS = ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__POSTAL_CODE = ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION__LOCALITY = ADDRESSABLE_OPARL_ELEMENT__LOCALITY;

	/**
	 * The number of structural features of the '<em>Person Or Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION_FEATURE_COUNT = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___GET_ID = ADDRESSABLE_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___SET_ID__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___GET_TYPE = ADDRESSABLE_OPARL_ELEMENT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___GET_NAME = ADDRESSABLE_OPARL_ELEMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___SET_NAME__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___GET_STREET_ADDRESS = ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS;

	/**
	 * The operation id for the '<em>Set Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___SET_STREET_ADDRESS__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Get Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___GET_POSTAL_CODE = ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE;

	/**
	 * The operation id for the '<em>Set Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___SET_POSTAL_CODE__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING;

	/**
	 * The operation id for the '<em>Get Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___GET_LOCALITY = ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY;

	/**
	 * The operation id for the '<em>Set Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION___SET_LOCALITY__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING;

	/**
	 * The number of operations of the '<em>Person Or Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OR_ORGANIZATION_OPERATION_COUNT = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.OrganizationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 11;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = PERSON_OR_ORGANIZATION__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__KEYWORD = PERSON_OR_ORGANIZATION__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = PERSON_OR_ORGANIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CREATED = PERSON_OR_ORGANIZATION__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MODIFIED = PERSON_OR_ORGANIZATION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SHORT_NAME = PERSON_OR_ORGANIZATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LICENSE = PERSON_OR_ORGANIZATION__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DELETED = PERSON_OR_ORGANIZATION__DELETED;

	/**
	 * The feature id for the '<em><b>street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__STREET_ADDRESS = PERSON_OR_ORGANIZATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__POSTAL_CODE = PERSON_OR_ORGANIZATION__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOCALITY = PERSON_OR_ORGANIZATION__LOCALITY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__BODY = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERSHIP = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEETING = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__POST = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Organization Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SUB_ORGANIZATION_OF = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_TYPE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CLASSIFICATION = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__START_DATE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__END_DATE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__WEBSITE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ROOM = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOCATION = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_ID = PERSON_OR_ORGANIZATION___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SET_ID__STRING = PERSON_OR_ORGANIZATION___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_NAME = PERSON_OR_ORGANIZATION___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SET_NAME__STRING = PERSON_OR_ORGANIZATION___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SET_STREET_ADDRESS__STRING = PERSON_OR_ORGANIZATION___SET_STREET_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Set Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SET_POSTAL_CODE__STRING = PERSON_OR_ORGANIZATION___SET_POSTAL_CODE__STRING;

	/**
	 * The operation id for the '<em>Set Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___SET_LOCALITY__STRING = PERSON_OR_ORGANIZATION___SET_LOCALITY__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_TYPE = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_STREET_ADDRESS = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_POSTAL_CODE = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___GET_LOCALITY = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.MeetingOrganizationImpl <em>Meeting Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.MeetingOrganizationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeetingOrganization()
	 * @generated
	 */
	int MEETING_ORGANIZATION = 12;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ORGANIZATION__MEETING = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ORGANIZATION__ORGANIZATION = 1;

	/**
	 * The number of structural features of the '<em>Meeting Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ORGANIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meeting Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_ORGANIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PersonImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 13;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = PERSON_OR_ORGANIZATION__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KEYWORD = PERSON_OR_ORGANIZATION__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = PERSON_OR_ORGANIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED = PERSON_OR_ORGANIZATION__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MODIFIED = PERSON_OR_ORGANIZATION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SHORT_NAME = PERSON_OR_ORGANIZATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LICENSE = PERSON_OR_ORGANIZATION__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DELETED = PERSON_OR_ORGANIZATION__DELETED;

	/**
	 * The feature id for the '<em><b>street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STREET_ADDRESS = PERSON_OR_ORGANIZATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__POSTAL_CODE = PERSON_OR_ORGANIZATION__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCALITY = PERSON_OR_ORGANIZATION__LOCALITY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BODY = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FAMILY_NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GIVEN_NAME = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Form Of Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FORM_OF_ADDRESS = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AFFIX = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TITLE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sub Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUB_LOCALITY = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATION = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STATUS = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEMBERSHIP = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIFE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Life Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LIFE_SOURCE = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PERSON_OR_ORGANIZATION_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ID = PERSON_OR_ORGANIZATION___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SET_ID__STRING = PERSON_OR_ORGANIZATION___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SET_NAME__STRING = PERSON_OR_ORGANIZATION___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SET_STREET_ADDRESS__STRING = PERSON_OR_ORGANIZATION___SET_STREET_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Set Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SET_POSTAL_CODE__STRING = PERSON_OR_ORGANIZATION___SET_POSTAL_CODE__STRING;

	/**
	 * The operation id for the '<em>Set Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SET_LOCALITY__STRING = PERSON_OR_ORGANIZATION___SET_LOCALITY__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_NAME = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_STREET_ADDRESS = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_POSTAL_CODE = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_LOCALITY = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_TYPE = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = PERSON_OR_ORGANIZATION_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.MembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.MembershipImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 14;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ID = INNER_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__KEYWORD = INNER_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>Person</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__PERSON = INNER_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ORGANIZATION = INNER_OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ROLE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Voting Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__VOTING_RIGHT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__START_DATE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__END_DATE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>On Behalf Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ON_BEHALF_OF = INNER_OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___GET_ID = INNER_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___SET_ID__STRING = INNER_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___GET_TYPE = INNER_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = INNER_OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.MeetingImpl <em>Meeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.MeetingImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeeting()
	 * @generated
	 */
	int MEETING = 15;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ID = ADDRESSABLE_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__KEYWORD = ADDRESSABLE_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__NAME = ADDRESSABLE_OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__CREATED = ADDRESSABLE_OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__MODIFIED = ADDRESSABLE_OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__SHORT_NAME = ADDRESSABLE_OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__LICENSE = ADDRESSABLE_OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__DELETED = ADDRESSABLE_OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__STREET_ADDRESS = ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__POSTAL_CODE = ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__LOCALITY = ADDRESSABLE_OPARL_ELEMENT__LOCALITY;

	/**
	 * The feature id for the '<em><b>Meeting State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__MEETING_STATE = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__CANCELLED = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__START = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__END = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ROOM = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__LOCATION = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__ORGANIZATION = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__PARTICIPANT = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__INVITATION = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Results Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__RESULTS_PROTOCOL = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Verbatim Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__VERBATIM_PROTOCOL = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__AUXILIARY_FILE = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING__AGENDA_ITEM = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_FEATURE_COUNT = ADDRESSABLE_OPARL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___GET_ID = ADDRESSABLE_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___SET_ID__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___SET_NAME__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Set Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___SET_STREET_ADDRESS__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Set Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___SET_POSTAL_CODE__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING;

	/**
	 * The operation id for the '<em>Set Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___SET_LOCALITY__STRING = ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___GET_TYPE = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___GET_NAME = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Street Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___GET_STREET_ADDRESS = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Postal Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___GET_POSTAL_CODE = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Locality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING___GET_LOCALITY = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Meeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_OPERATION_COUNT = ADDRESSABLE_OPARL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemImpl <em>Agenda Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.AgendaItemImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItem()
	 * @generated
	 */
	int AGENDA_ITEM = 16;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__ID = INNER_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__KEYWORD = INNER_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__NAME = INNER_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__MEETING = INNER_OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__NUMBER = INNER_OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__PUBLIC = INNER_OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Consultation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__CONSULTATION = INNER_OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__RESULT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolution Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__RESOLUTION_TEXT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolution File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__RESOLUTION_FILE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__AUXILIARY_FILE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__START = INNER_OPARL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM__END = INNER_OPARL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Agenda Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_FEATURE_COUNT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM___GET_ID = INNER_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM___SET_ID__STRING = INNER_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM___GET_TYPE = INNER_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agenda Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_OPERATION_COUNT = INNER_OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PaperImpl <em>Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PaperImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPaper()
	 * @generated
	 */
	int PAPER = 17;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__ID = OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__KEYWORD = OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__NAME = OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__CREATED = OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__MODIFIED = OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__SHORT_NAME = OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__LICENSE = OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__DELETED = OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>Body</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__BODY = OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__REFERENCE = OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PUBLISHED_DATE = OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Paper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PAPER_TYPE = OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Related Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__RELATED_PAPER = OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Superordinated Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__SUPERORDINATED_PAPER = OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subordinated Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__SUBORDINATED_PAPER = OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Main File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__MAIN_FILE = OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__AUXILIARY_FILE = OPARL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__LOCATION = OPARL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Originator Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__ORIGINATOR_PERSON = OPARL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Under Directionof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__UNDER_DIRECTIONOF = OPARL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Originator Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__ORIGINATOR_ORGANIZATION = OPARL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Consultation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__CONSULTATION = OPARL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_FEATURE_COUNT = OPARL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER___GET_ID = OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER___SET_ID__STRING = OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER___SET_NAME__STRING = OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER___GET_TYPE = OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER___GET_NAME = OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_OPERATION_COUNT = OPARL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.ConsultationImpl <em>Consultation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.ConsultationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getConsultation()
	 * @generated
	 */
	int CONSULTATION = 18;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__ID = INNER_OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__KEYWORD = INNER_OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__PAPER = INNER_OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__AGENDA_ITEM = INNER_OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__MEETING = INNER_OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__ORGANIZATION = INNER_OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authoritative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__AUTHORITATIVE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION__ROLE = INNER_OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Consultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_FEATURE_COUNT = INNER_OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION___GET_ID = INNER_OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION___SET_ID__STRING = INNER_OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION___GET_TYPE = INNER_OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consultation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSULTATION_OPERATION_COUNT = INNER_OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.FileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 19;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KEYWORD = OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATED = OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFIED = OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SHORT_NAME = OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LICENSE = OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DELETED = OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_NAME = OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MIME_TYPE = OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DATE = OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SHA1_CHECKSUM = OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TEXT = OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ACCESS_URL = OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DOWNLOAD_URL = OPARL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTERNAL_SERVICE_URL = OPARL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MASTER_FILE = OPARL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DERIVATIVE_FILE = OPARL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_LICENSE = OPARL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = OPARL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___GET_ID = OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___SET_ID__STRING = OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___SET_NAME__STRING = OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___GET_TYPE = OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___GET_NAME = OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get License</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___GET_LICENSE = OPARL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = OPARL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.LocationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 20;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = OPARL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__KEYWORD = OPARL_ELEMENT__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = OPARL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CREATED = OPARL_ELEMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MODIFIED = OPARL_ELEMENT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SHORT_NAME = OPARL_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LICENSE = OPARL_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DELETED = OPARL_ELEMENT__DELETED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = OPARL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__GEOMETRY = OPARL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__BODIES = OPARL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ORGANIZATIONS = OPARL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meetings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MEETINGS = OPARL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Papers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PAPERS = OPARL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = OPARL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_ID = OPARL_ELEMENT___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___SET_ID__STRING = OPARL_ELEMENT___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_NAME = OPARL_ELEMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___SET_NAME__STRING = OPARL_ELEMENT___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_TYPE = OPARL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = OPARL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.BodyLocationImpl <em>Body Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.BodyLocationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getBodyLocation()
	 * @generated
	 */
	int BODY_LOCATION = 21;

	/**
	 * The feature id for the '<em><b>Body</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_LOCATION__BODY = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_LOCATION__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Body Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Body Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.OrganizationLocationImpl <em>Organization Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.OrganizationLocationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOrganizationLocation()
	 * @generated
	 */
	int ORGANIZATION_LOCATION = 22;

	/**
	 * The feature id for the '<em><b>Organziation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_LOCATION__ORGANZIATION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_LOCATION__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Organization Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organization Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.MeetingLocationImpl <em>Meeting Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.MeetingLocationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeetingLocation()
	 * @generated
	 */
	int MEETING_LOCATION = 23;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_LOCATION__MEETING = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_LOCATION__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Meeting Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meeting Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEETING_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.PaperLocationImpl <em>Paper Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.PaperLocationImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPaperLocation()
	 * @generated
	 */
	int PAPER_LOCATION = 24;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_LOCATION__PAPER = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_LOCATION__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Paper Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Paper Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.InvitationFileImpl <em>Invitation File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.InvitationFileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getInvitationFile()
	 * @generated
	 */
	int INVITATION_FILE = 26;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__CREATED = FILE__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__SHORT_NAME = FILE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__DELETED = FILE__DELETED;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__FILE_NAME = FILE__FILE_NAME;

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
	 * The feature id for the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__EXTERNAL_SERVICE_URL = FILE__EXTERNAL_SERVICE_URL;

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
	 * The feature id for the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__FILE_LICENSE = FILE__FILE_LICENSE;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__AGENDA_ITEM = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE__PAPER = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Invitation File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE___GET_ID = FILE___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE___SET_ID__STRING = FILE___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE___SET_NAME__STRING = FILE___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE___GET_TYPE = FILE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE___GET_NAME = FILE___GET_NAME;

	/**
	 * The operation id for the '<em>Get License</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITATION_FILE___GET_LICENSE = FILE___GET_LICENSE;

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
	int RESULTS_PROTOCOL = 27;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__CREATED = FILE__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__SHORT_NAME = FILE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__DELETED = FILE__DELETED;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__FILE_NAME = FILE__FILE_NAME;

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
	 * The feature id for the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__EXTERNAL_SERVICE_URL = FILE__EXTERNAL_SERVICE_URL;

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
	 * The feature id for the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__FILE_LICENSE = FILE__FILE_LICENSE;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__AGENDA_ITEM = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL__PAPER = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Results Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL___GET_ID = FILE___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL___SET_ID__STRING = FILE___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL___SET_NAME__STRING = FILE___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL___GET_TYPE = FILE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL___GET_NAME = FILE___GET_NAME;

	/**
	 * The operation id for the '<em>Get License</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTS_PROTOCOL___GET_LICENSE = FILE___GET_LICENSE;

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
	int VERBATIM_PROTOCOL = 28;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__CREATED = FILE__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__SHORT_NAME = FILE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__DELETED = FILE__DELETED;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__FILE_NAME = FILE__FILE_NAME;

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
	 * The feature id for the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__EXTERNAL_SERVICE_URL = FILE__EXTERNAL_SERVICE_URL;

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
	 * The feature id for the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__FILE_LICENSE = FILE__FILE_LICENSE;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__AGENDA_ITEM = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL__PAPER = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Verbatim Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL___GET_ID = FILE___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL___SET_ID__STRING = FILE___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL___SET_NAME__STRING = FILE___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL___GET_TYPE = FILE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL___GET_NAME = FILE___GET_NAME;

	/**
	 * The operation id for the '<em>Get License</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_PROTOCOL___GET_LICENSE = FILE___GET_LICENSE;

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
	int AUXILIARY_FILE = 29;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__CREATED = FILE__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__SHORT_NAME = FILE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__DELETED = FILE__DELETED;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__FILE_NAME = FILE__FILE_NAME;

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
	 * The feature id for the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__EXTERNAL_SERVICE_URL = FILE__EXTERNAL_SERVICE_URL;

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
	 * The feature id for the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__FILE_LICENSE = FILE__FILE_LICENSE;

	/**
	 * The feature id for the '<em><b>Meeting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__MEETING = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__AGENDA_ITEM = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE__PAPER = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Auxiliary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE___GET_ID = FILE___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE___SET_ID__STRING = FILE___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE___SET_NAME__STRING = FILE___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE___GET_TYPE = FILE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE___GET_NAME = FILE___GET_NAME;

	/**
	 * The operation id for the '<em>Get License</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE___GET_LICENSE = FILE___GET_LICENSE;

	/**
	 * The number of operations of the '<em>Auxiliary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemResolutionFileImpl <em>Agenda Item Resolution File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.AgendaItemResolutionFileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItemResolutionFile()
	 * @generated
	 */
	int AGENDA_ITEM_RESOLUTION_FILE = 30;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Resolution File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE = 1;

	/**
	 * The number of structural features of the '<em>Agenda Item Resolution File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_RESOLUTION_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agenda Item Resolution File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_RESOLUTION_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemAuxiliaryFileImpl <em>Agenda Item Auxiliary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.AgendaItemAuxiliaryFileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItemAuxiliaryFile()
	 * @generated
	 */
	int AGENDA_ITEM_AUXILIARY_FILE = 31;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Auxiliary File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE = 1;

	/**
	 * The number of structural features of the '<em>Agenda Item Auxiliary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_AUXILIARY_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agenda Item Auxiliary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_ITEM_AUXILIARY_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.oklab.leipzig.oparl.impl.ResolutionFileImpl <em>Resolution File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oklab.leipzig.oparl.impl.ResolutionFileImpl
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getResolutionFile()
	 * @generated
	 */
	int RESOLUTION_FILE = 32;

	/**
	 * The feature id for the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__ID = FILE__ID;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__KEYWORD = FILE__KEYWORD;

	/**
	 * The feature id for the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__CREATED = FILE__CREATED;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__SHORT_NAME = FILE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__LICENSE = FILE__LICENSE;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__DELETED = FILE__DELETED;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__FILE_NAME = FILE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__MIME_TYPE = FILE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__DATE = FILE__DATE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Sha1 Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__SHA1_CHECKSUM = FILE__SHA1_CHECKSUM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__TEXT = FILE__TEXT;

	/**
	 * The feature id for the '<em><b>Access Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__ACCESS_URL = FILE__ACCESS_URL;

	/**
	 * The feature id for the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__DOWNLOAD_URL = FILE__DOWNLOAD_URL;

	/**
	 * The feature id for the '<em><b>External Service Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__EXTERNAL_SERVICE_URL = FILE__EXTERNAL_SERVICE_URL;

	/**
	 * The feature id for the '<em><b>Master File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__MASTER_FILE = FILE__MASTER_FILE;

	/**
	 * The feature id for the '<em><b>Derivative File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__DERIVATIVE_FILE = FILE__DERIVATIVE_FILE;

	/**
	 * The feature id for the '<em><b>File License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__FILE_LICENSE = FILE__FILE_LICENSE;

	/**
	 * The feature id for the '<em><b>Agenda Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__AGENDA_ITEM = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paper</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE__PAPER = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resolution File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE___GET_ID = FILE___GET_ID;

	/**
	 * The operation id for the '<em>Set Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE___SET_ID__STRING = FILE___SET_ID__STRING;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE___SET_NAME__STRING = FILE___SET_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE___GET_TYPE = FILE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE___GET_NAME = FILE___GET_NAME;

	/**
	 * The operation id for the '<em>Get License</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE___GET_LICENSE = FILE___GET_LICENSE;

	/**
	 * The number of operations of the '<em>Resolution File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getURL()
	 * @generated
	 */
	int URL = 33;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 34;

	/**
	 * The meta object id for the '<em>OParl Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOParlType()
	 * @generated
	 */
	int OPARL_TYPE = 35;


	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see de.oklab.leipzig.oparl.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Identifiable <em>id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>id</em>'.
	 * @see de.oklab.leipzig.oparl.Identifiable
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable__id();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Identifiable#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see de.oklab.leipzig.oparl.Identifiable#getId()
	 * @generated
	 */
	EOperation getIdentifiable__GetId();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Identifiable#setId(java.lang.String) <em>Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Id</em>' operation.
	 * @see de.oklab.leipzig.oparl.Identifiable#setId(java.lang.String)
	 * @generated
	 */
	EOperation getIdentifiable__SetId__String();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see de.oklab.leipzig.oparl.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Typed#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Typed#getType()
	 * @generated
	 */
	EOperation getTyped__GetType();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Tagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged</em>'.
	 * @see de.oklab.leipzig.oparl.Tagged
	 * @generated
	 */
	EClass getTagged();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Tagged#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see de.oklab.leipzig.oparl.Tagged#getKeyword()
	 * @see #getTagged()
	 * @generated
	 */
	EAttribute getTagged_Keyword();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see de.oklab.leipzig.oparl.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Named <em>name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>name</em>'.
	 * @see de.oklab.leipzig.oparl.Named
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed__name();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Named#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.Named#getName()
	 * @generated
	 */
	EOperation getNamed__GetName();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Named#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.Named#setName(java.lang.String)
	 * @generated
	 */
	EOperation getNamed__SetName__String();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.Dated <em>Dated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dated</em>'.
	 * @see de.oklab.leipzig.oparl.Dated
	 * @generated
	 */
	EClass getDated();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Dated#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.oklab.leipzig.oparl.Dated#getCreated()
	 * @see #getDated()
	 * @generated
	 */
	EAttribute getDated_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Dated#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.oklab.leipzig.oparl.Dated#getModified()
	 * @see #getDated()
	 * @generated
	 */
	EAttribute getDated_Modified();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.OParlElement <em>OParl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OParl Element</em>'.
	 * @see de.oklab.leipzig.oparl.OParlElement
	 * @generated
	 */
	EClass getOParlElement();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.OParlElement#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see de.oklab.leipzig.oparl.OParlElement#getShortName()
	 * @see #getOParlElement()
	 * @generated
	 */
	EAttribute getOParlElement_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.OParlElement#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see de.oklab.leipzig.oparl.OParlElement#getLicense()
	 * @see #getOParlElement()
	 * @generated
	 */
	EAttribute getOParlElement_License();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.OParlElement#isDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted</em>'.
	 * @see de.oklab.leipzig.oparl.OParlElement#isDeleted()
	 * @see #getOParlElement()
	 * @generated
	 */
	EAttribute getOParlElement_Deleted();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.InnerOParlElement <em>Inner OParl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner OParl Element</em>'.
	 * @see de.oklab.leipzig.oparl.InnerOParlElement
	 * @generated
	 */
	EClass getInnerOParlElement();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System <em>oparl Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>oparl Version</em>'.
	 * @see de.oklab.leipzig.oparl.System
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem__oparlVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.System#getOtherOparlVersions <em>Other Oparl Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Oparl Versions</em>'.
	 * @see de.oklab.leipzig.oparl.System#getOtherOparlVersions()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_OtherOparlVersions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.System#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodies</em>'.
	 * @see de.oklab.leipzig.oparl.System#getBodies()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Bodies();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.System <em>contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>contact Email</em>'.
	 * @see de.oklab.leipzig.oparl.System
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem__contactEmail();

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
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.System#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.System#getType()
	 * @generated
	 */
	EOperation getSystem__GetType();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.System#getOparlVersion() <em>Get Oparl Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Oparl Version</em>' operation.
	 * @see de.oklab.leipzig.oparl.System#getOparlVersion()
	 * @generated
	 */
	EOperation getSystem__GetOparlVersion();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.System#setOparlVersion(java.lang.String) <em>Set Oparl Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Oparl Version</em>' operation.
	 * @see de.oklab.leipzig.oparl.System#setOparlVersion(java.lang.String)
	 * @generated
	 */
	EOperation getSystem__SetOparlVersion__String();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.System#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.System#getName()
	 * @generated
	 */
	EOperation getSystem__GetName();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.System#getContactEmail() <em>Get Contact Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contact Email</em>' operation.
	 * @see de.oklab.leipzig.oparl.System#getContactEmail()
	 * @generated
	 */
	EOperation getSystem__GetContactEmail();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.System#setContactEmail(java.lang.String) <em>Set Contact Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Contact Email</em>' operation.
	 * @see de.oklab.leipzig.oparl.System#setContactEmail(java.lang.String)
	 * @generated
	 */
	EOperation getSystem__SetContactEmail__String();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Body#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getSystem()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_System();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getOparlSince <em>Oparl Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oparl Since</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getOparlSince()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_OparlSince();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body#getAgs <em>Ags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ags</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getAgs()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Ags();

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
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Body#getEquivalentBody <em>Equivalent Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equivalent Body</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getEquivalentBody()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_EquivalentBody();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Body <em>contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>contact Email</em>'.
	 * @see de.oklab.leipzig.oparl.Body
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody__contactEmail();

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
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Body#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getOrganization()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Body#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getPerson()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Body#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getMeeting()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Meeting();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Body#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getPaper()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Paper();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Body#getLegislativeTerm <em>Legislative Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legislative Term</em>'.
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
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Body#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Body#getLocation()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Location();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Body#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Body#getType()
	 * @generated
	 */
	EOperation getBody__GetType();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Body#getContactEmail() <em>Get Contact Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contact Email</em>' operation.
	 * @see de.oklab.leipzig.oparl.Body#getContactEmail()
	 * @generated
	 */
	EOperation getBody__GetContactEmail();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Body#setContactEmail(java.lang.String) <em>Set Contact Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Contact Email</em>' operation.
	 * @see de.oklab.leipzig.oparl.Body#setContactEmail(java.lang.String)
	 * @generated
	 */
	EOperation getBody__SetContactEmail__String();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Body#getStreetAddress() <em>Get Street Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Street Address</em>' operation.
	 * @see de.oklab.leipzig.oparl.Body#getStreetAddress()
	 * @generated
	 */
	EOperation getBody__GetStreetAddress();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Body#getPostalCode() <em>Get Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Postal Code</em>' operation.
	 * @see de.oklab.leipzig.oparl.Body#getPostalCode()
	 * @generated
	 */
	EOperation getBody__GetPostalCode();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Body#getLocality() <em>Get Locality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locality</em>' operation.
	 * @see de.oklab.leipzig.oparl.Body#getLocality()
	 * @generated
	 */
	EOperation getBody__GetLocality();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.AddressableOParlElement <em>Addressable OParl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addressable OParl Element</em>'.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement
	 * @generated
	 */
	EClass getAddressableOParlElement();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AddressableOParlElement <em>street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>street Address</em>'.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement
	 * @see #getAddressableOParlElement()
	 * @generated
	 */
	EAttribute getAddressableOParlElement__streetAddress();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AddressableOParlElement <em>postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>postal Code</em>'.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement
	 * @see #getAddressableOParlElement()
	 * @generated
	 */
	EAttribute getAddressableOParlElement__postalCode();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AddressableOParlElement <em>locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>locality</em>'.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement
	 * @see #getAddressableOParlElement()
	 * @generated
	 */
	EAttribute getAddressableOParlElement__locality();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AddressableOParlElement#getStreetAddress() <em>Get Street Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Street Address</em>' operation.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement#getStreetAddress()
	 * @generated
	 */
	EOperation getAddressableOParlElement__GetStreetAddress();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AddressableOParlElement#setStreetAddress(java.lang.String) <em>Set Street Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Street Address</em>' operation.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement#setStreetAddress(java.lang.String)
	 * @generated
	 */
	EOperation getAddressableOParlElement__SetStreetAddress__String();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AddressableOParlElement#getPostalCode() <em>Get Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Postal Code</em>' operation.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement#getPostalCode()
	 * @generated
	 */
	EOperation getAddressableOParlElement__GetPostalCode();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AddressableOParlElement#setPostalCode(java.lang.String) <em>Set Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Postal Code</em>' operation.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement#setPostalCode(java.lang.String)
	 * @generated
	 */
	EOperation getAddressableOParlElement__SetPostalCode__String();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AddressableOParlElement#getLocality() <em>Get Locality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locality</em>' operation.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement#getLocality()
	 * @generated
	 */
	EOperation getAddressableOParlElement__GetLocality();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AddressableOParlElement#setLocality(java.lang.String) <em>Set Locality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Locality</em>' operation.
	 * @see de.oklab.leipzig.oparl.AddressableOParlElement#setLocality(java.lang.String)
	 * @generated
	 */
	EOperation getAddressableOParlElement__SetLocality__String();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.LegislativeTerm#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getBody()
	 * @see #getLegislativeTerm()
	 * @generated
	 */
	EReference getLegislativeTerm_Body();

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
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.LegislativeTerm#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.LegislativeTerm#getType()
	 * @generated
	 */
	EOperation getLegislativeTerm__GetType();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Organization#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getBody()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Organization#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membership</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getMembership()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Membership();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Organization#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getMeeting()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Meeting();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getOrganizationType <em>Organization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Type</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getOrganizationType()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationType();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Organization#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getRoom()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Room();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Organization#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Organization#getLocation()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Location();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Organization#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Organization#getType()
	 * @generated
	 */
	EOperation getOrganization__GetType();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Organization#getStreetAddress() <em>Get Street Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Street Address</em>' operation.
	 * @see de.oklab.leipzig.oparl.Organization#getStreetAddress()
	 * @generated
	 */
	EOperation getOrganization__GetStreetAddress();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Organization#getPostalCode() <em>Get Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Postal Code</em>' operation.
	 * @see de.oklab.leipzig.oparl.Organization#getPostalCode()
	 * @generated
	 */
	EOperation getOrganization__GetPostalCode();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Organization#getLocality() <em>Get Locality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locality</em>' operation.
	 * @see de.oklab.leipzig.oparl.Organization#getLocality()
	 * @generated
	 */
	EOperation getOrganization__GetLocality();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.MeetingOrganization <em>Meeting Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Organization</em>'.
	 * @see de.oklab.leipzig.oparl.MeetingOrganization
	 * @generated
	 */
	EClass getMeetingOrganization();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.MeetingOrganization#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.MeetingOrganization#getMeeting()
	 * @see #getMeetingOrganization()
	 * @generated
	 */
	EReference getMeetingOrganization_Meeting();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.MeetingOrganization#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
	 * @see de.oklab.leipzig.oparl.MeetingOrganization#getOrganization()
	 * @see #getMeetingOrganization()
	 * @generated
	 */
	EReference getMeetingOrganization_Organization();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Person#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getBody()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Body();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getAffix <em>Affix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affix</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getAffix()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Affix();

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
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Person#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phone</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getPhone()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Phone();

	/**
	 * Returns the meta object for the attribute list '{@link de.oklab.leipzig.oparl.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getSubLocality <em>Sub Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Locality</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getSubLocality()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SubLocality();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Person#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getLocation()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Location();

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
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Person#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membership</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getMembership()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Membership();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getLife <em>Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getLife()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Life();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Person#getLifeSource <em>Life Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Source</em>'.
	 * @see de.oklab.leipzig.oparl.Person#getLifeSource()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LifeSource();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Person#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.Person#getName()
	 * @generated
	 */
	EOperation getPerson__GetName();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Person#getStreetAddress() <em>Get Street Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Street Address</em>' operation.
	 * @see de.oklab.leipzig.oparl.Person#getStreetAddress()
	 * @generated
	 */
	EOperation getPerson__GetStreetAddress();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Person#getPostalCode() <em>Get Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Postal Code</em>' operation.
	 * @see de.oklab.leipzig.oparl.Person#getPostalCode()
	 * @generated
	 */
	EOperation getPerson__GetPostalCode();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Person#getLocality() <em>Get Locality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locality</em>' operation.
	 * @see de.oklab.leipzig.oparl.Person#getLocality()
	 * @generated
	 */
	EOperation getPerson__GetLocality();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Person#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Person#getType()
	 * @generated
	 */
	EOperation getPerson__GetType();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Membership#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Person</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getPerson()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Person();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Membership#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organization</em>'.
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
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Membership#getOnBehalfOf <em>On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Behalf Of</em>'.
	 * @see de.oklab.leipzig.oparl.Membership#getOnBehalfOf()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_OnBehalfOf();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Membership#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Membership#getType()
	 * @generated
	 */
	EOperation getMembership__GetType();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getMeetingState <em>Meeting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meeting State</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getMeetingState()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_MeetingState();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#isCancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancelled</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#isCancelled()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Cancelled();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.Meeting#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see de.oklab.leipzig.oparl.Meeting#getRoom()
	 * @see #getMeeting()
	 * @generated
	 */
	EAttribute getMeeting_Room();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Meeting#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
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
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Meeting#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary File</em>'.
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
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Meeting#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Meeting#getType()
	 * @generated
	 */
	EOperation getMeeting__GetType();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Meeting#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.Meeting#getName()
	 * @generated
	 */
	EOperation getMeeting__GetName();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Meeting#getStreetAddress() <em>Get Street Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Street Address</em>' operation.
	 * @see de.oklab.leipzig.oparl.Meeting#getStreetAddress()
	 * @generated
	 */
	EOperation getMeeting__GetStreetAddress();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Meeting#getPostalCode() <em>Get Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Postal Code</em>' operation.
	 * @see de.oklab.leipzig.oparl.Meeting#getPostalCode()
	 * @generated
	 */
	EOperation getMeeting__GetPostalCode();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Meeting#getLocality() <em>Get Locality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locality</em>' operation.
	 * @see de.oklab.leipzig.oparl.Meeting#getLocality()
	 * @generated
	 */
	EOperation getMeeting__GetLocality();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionText <em>Resolution Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Text</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getResolutionText()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_ResolutionText();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.AgendaItem#getResolutionFile <em>Resolution File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getResolutionFile()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EReference getAgendaItem_ResolutionFile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getAuxiliaryFile()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EReference getAgendaItem_AuxiliaryFile();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getStart()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.AgendaItem#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getEnd()
	 * @see #getAgendaItem()
	 * @generated
	 */
	EAttribute getAgendaItem_End();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.AgendaItem#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.AgendaItem#getType()
	 * @generated
	 */
	EOperation getAgendaItem__GetType();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Paper#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getBody()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Body();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getSuperordinatedPaper <em>Superordinated Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superordinated Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getSuperordinatedPaper()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_SuperordinatedPaper();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getSubordinatedPaper <em>Subordinated Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subordinated Paper</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getSubordinatedPaper()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_SubordinatedPaper();

	/**
	 * Returns the meta object for the containment reference '{@link de.oklab.leipzig.oparl.Paper#getMainFile <em>Main File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main File</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getMainFile()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_MainFile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Paper#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getAuxiliaryFile()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_AuxiliaryFile();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Paper#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getLocation()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Location();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getOriginatorPerson <em>Originator Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originator Person</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getOriginatorPerson()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_OriginatorPerson();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Paper#getOriginatorOrganization <em>Originator Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originator Organization</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getOriginatorOrganization()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_OriginatorOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oklab.leipzig.oparl.Paper#getConsultation <em>Consultation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consultation</em>'.
	 * @see de.oklab.leipzig.oparl.Paper#getConsultation()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Consultation();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Paper#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Paper#getType()
	 * @generated
	 */
	EOperation getPaper__GetType();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Paper#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.Paper#getName()
	 * @generated
	 */
	EOperation getPaper__GetName();

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
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.Consultation#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Paper</em>'.
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
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.Consultation#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.Consultation#getMeeting()
	 * @see #getConsultation()
	 * @generated
	 */
	EReference getConsultation_Meeting();

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
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Consultation#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Consultation#getType()
	 * @generated
	 */
	EOperation getConsultation__GetType();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getExternalServiceUrl <em>External Service Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Service Url</em>'.
	 * @see de.oklab.leipzig.oparl.File#getExternalServiceUrl()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_ExternalServiceUrl();

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
	 * Returns the meta object for the attribute '{@link de.oklab.leipzig.oparl.File#getFileLicense <em>File License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File License</em>'.
	 * @see de.oklab.leipzig.oparl.File#getFileLicense()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileLicense();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.File#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.File#getType()
	 * @generated
	 */
	EOperation getFile__GetType();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.File#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see de.oklab.leipzig.oparl.File#getName()
	 * @generated
	 */
	EOperation getFile__GetName();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.File#getLicense() <em>Get License</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get License</em>' operation.
	 * @see de.oklab.leipzig.oparl.File#getLicense()
	 * @generated
	 */
	EOperation getFile__GetLicense();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Location#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bodies</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getBodies()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Bodies();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Location#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organizations</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getOrganizations()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Organizations();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Location#getMeetings <em>Meetings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meetings</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getMeetings()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Meetings();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.Location#getPapers <em>Papers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Papers</em>'.
	 * @see de.oklab.leipzig.oparl.Location#getPapers()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Papers();

	/**
	 * Returns the meta object for the '{@link de.oklab.leipzig.oparl.Location#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see de.oklab.leipzig.oparl.Location#getType()
	 * @generated
	 */
	EOperation getLocation__GetType();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.BodyLocation <em>Body Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Location</em>'.
	 * @see de.oklab.leipzig.oparl.BodyLocation
	 * @generated
	 */
	EClass getBodyLocation();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.BodyLocation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body</em>'.
	 * @see de.oklab.leipzig.oparl.BodyLocation#getBody()
	 * @see #getBodyLocation()
	 * @generated
	 */
	EReference getBodyLocation_Body();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.BodyLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.BodyLocation#getLocation()
	 * @see #getBodyLocation()
	 * @generated
	 */
	EReference getBodyLocation_Location();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.OrganizationLocation <em>Organization Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Location</em>'.
	 * @see de.oklab.leipzig.oparl.OrganizationLocation
	 * @generated
	 */
	EClass getOrganizationLocation();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.OrganizationLocation#getOrganziation <em>Organziation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organziation</em>'.
	 * @see de.oklab.leipzig.oparl.OrganizationLocation#getOrganziation()
	 * @see #getOrganizationLocation()
	 * @generated
	 */
	EReference getOrganizationLocation_Organziation();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.OrganizationLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.OrganizationLocation#getLocation()
	 * @see #getOrganizationLocation()
	 * @generated
	 */
	EReference getOrganizationLocation_Location();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.MeetingLocation <em>Meeting Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meeting Location</em>'.
	 * @see de.oklab.leipzig.oparl.MeetingLocation
	 * @generated
	 */
	EClass getMeetingLocation();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.MeetingLocation#getMeeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meeting</em>'.
	 * @see de.oklab.leipzig.oparl.MeetingLocation#getMeeting()
	 * @see #getMeetingLocation()
	 * @generated
	 */
	EReference getMeetingLocation_Meeting();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.MeetingLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.MeetingLocation#getLocation()
	 * @see #getMeetingLocation()
	 * @generated
	 */
	EReference getMeetingLocation_Location();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.PaperLocation <em>Paper Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paper Location</em>'.
	 * @see de.oklab.leipzig.oparl.PaperLocation
	 * @generated
	 */
	EClass getPaperLocation();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.PaperLocation#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.PaperLocation#getPaper()
	 * @see #getPaperLocation()
	 * @generated
	 */
	EReference getPaperLocation_Paper();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.PaperLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.oklab.leipzig.oparl.PaperLocation#getLocation()
	 * @see #getPaperLocation()
	 * @generated
	 */
	EReference getPaperLocation_Location();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.InvitationFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.InvitationFile#getAgendaItem()
	 * @see #getInvitationFile()
	 * @generated
	 */
	EReference getInvitationFile_AgendaItem();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.InvitationFile#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.InvitationFile#getPaper()
	 * @see #getInvitationFile()
	 * @generated
	 */
	EReference getInvitationFile_Paper();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.ResultsProtocol#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.ResultsProtocol#getAgendaItem()
	 * @see #getResultsProtocol()
	 * @generated
	 */
	EReference getResultsProtocol_AgendaItem();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.ResultsProtocol#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.ResultsProtocol#getPaper()
	 * @see #getResultsProtocol()
	 * @generated
	 */
	EReference getResultsProtocol_Paper();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.VerbatimProtocol#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.VerbatimProtocol#getAgendaItem()
	 * @see #getVerbatimProtocol()
	 * @generated
	 */
	EReference getVerbatimProtocol_AgendaItem();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.VerbatimProtocol#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.VerbatimProtocol#getPaper()
	 * @see #getVerbatimProtocol()
	 * @generated
	 */
	EReference getVerbatimProtocol_Paper();

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
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.AuxiliaryFile#getAgendaItem()
	 * @see #getAuxiliaryFile()
	 * @generated
	 */
	EReference getAuxiliaryFile_AgendaItem();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.AuxiliaryFile#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.AuxiliaryFile#getPaper()
	 * @see #getAuxiliaryFile()
	 * @generated
	 */
	EReference getAuxiliaryFile_Paper();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile <em>Agenda Item Resolution File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda Item Resolution File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItemResolutionFile
	 * @generated
	 */
	EClass getAgendaItemResolutionFile();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItemResolutionFile#getAgendaItem()
	 * @see #getAgendaItemResolutionFile()
	 * @generated
	 */
	EReference getAgendaItemResolutionFile_AgendaItem();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.AgendaItemResolutionFile#getResolutionFile <em>Resolution File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolution File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItemResolutionFile#getResolutionFile()
	 * @see #getAgendaItemResolutionFile()
	 * @generated
	 */
	EReference getAgendaItemResolutionFile_ResolutionFile();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile <em>Agenda Item Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda Item Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile
	 * @generated
	 */
	EClass getAgendaItemAuxiliaryFile();

	/**
	 * Returns the meta object for the container reference '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAgendaItem()
	 * @see #getAgendaItemAuxiliaryFile()
	 * @generated
	 */
	EReference getAgendaItemAuxiliaryFile_AgendaItem();

	/**
	 * Returns the meta object for the reference '{@link de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAuxiliaryFile <em>Auxiliary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auxiliary File</em>'.
	 * @see de.oklab.leipzig.oparl.AgendaItemAuxiliaryFile#getAuxiliaryFile()
	 * @see #getAgendaItemAuxiliaryFile()
	 * @generated
	 */
	EReference getAgendaItemAuxiliaryFile_AuxiliaryFile();

	/**
	 * Returns the meta object for class '{@link de.oklab.leipzig.oparl.ResolutionFile <em>Resolution File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution File</em>'.
	 * @see de.oklab.leipzig.oparl.ResolutionFile
	 * @generated
	 */
	EClass getResolutionFile();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.ResolutionFile#getAgendaItem <em>Agenda Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agenda Item</em>'.
	 * @see de.oklab.leipzig.oparl.ResolutionFile#getAgendaItem()
	 * @see #getResolutionFile()
	 * @generated
	 */
	EReference getResolutionFile_AgendaItem();

	/**
	 * Returns the meta object for the reference list '{@link de.oklab.leipzig.oparl.ResolutionFile#getPaper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paper</em>'.
	 * @see de.oklab.leipzig.oparl.ResolutionFile#getPaper()
	 * @see #getResolutionFile()
	 * @generated
	 */
	EReference getResolutionFile_Paper();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>OParl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OParl Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getOParlType();

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
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.IdentifiableImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable__id();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE___GET_ID = eINSTANCE.getIdentifiable__GetId();

		/**
		 * The meta object literal for the '<em><b>Set Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE___SET_ID__STRING = eINSTANCE.getIdentifiable__SetId__String();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.TypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.TypedImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPED___GET_TYPE = eINSTANCE.getTyped__GetType();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.TaggedImpl <em>Tagged</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.TaggedImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getTagged()
		 * @generated
		 */
		EClass TAGGED = eINSTANCE.getTagged();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED__KEYWORD = eINSTANCE.getTagged_Keyword();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.NamedImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed__name();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED___GET_NAME = eINSTANCE.getNamed__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED___SET_NAME__STRING = eINSTANCE.getNamed__SetName__String();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.DatedImpl <em>Dated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.DatedImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getDated()
		 * @generated
		 */
		EClass DATED = eINSTANCE.getDated();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED__CREATED = eINSTANCE.getDated_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATED__MODIFIED = eINSTANCE.getDated_Modified();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.OParlElementImpl <em>OParl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.OParlElementImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOParlElement()
		 * @generated
		 */
		EClass OPARL_ELEMENT = eINSTANCE.getOParlElement();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPARL_ELEMENT__SHORT_NAME = eINSTANCE.getOParlElement_ShortName();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPARL_ELEMENT__LICENSE = eINSTANCE.getOParlElement_License();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPARL_ELEMENT__DELETED = eINSTANCE.getOParlElement_Deleted();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.InnerOParlElementImpl <em>Inner OParl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.InnerOParlElementImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getInnerOParlElement()
		 * @generated
		 */
		EClass INNER_OPARL_ELEMENT = eINSTANCE.getInnerOParlElement();

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
		 * The meta object literal for the '<em><b>oparl Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__OPARL_VERSION = eINSTANCE.getSystem__oparlVersion();

		/**
		 * The meta object literal for the '<em><b>Other Oparl Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__OTHER_OPARL_VERSIONS = eINSTANCE.getSystem_OtherOparlVersions();

		/**
		 * The meta object literal for the '<em><b>Bodies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BODIES = eINSTANCE.getSystem_Bodies();

		/**
		 * The meta object literal for the '<em><b>contact Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__CONTACT_EMAIL = eINSTANCE.getSystem__contactEmail();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__CONTACT_NAME = eINSTANCE.getSystem_ContactName();

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
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___GET_TYPE = eINSTANCE.getSystem__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Oparl Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___GET_OPARL_VERSION = eINSTANCE.getSystem__GetOparlVersion();

		/**
		 * The meta object literal for the '<em><b>Set Oparl Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___SET_OPARL_VERSION__STRING = eINSTANCE.getSystem__SetOparlVersion__String();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___GET_NAME = eINSTANCE.getSystem__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Contact Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___GET_CONTACT_EMAIL = eINSTANCE.getSystem__GetContactEmail();

		/**
		 * The meta object literal for the '<em><b>Set Contact Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___SET_CONTACT_EMAIL__STRING = eINSTANCE.getSystem__SetContactEmail__String();

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
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__SYSTEM = eINSTANCE.getBody_System();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__WEBSITE = eINSTANCE.getBody_Website();

		/**
		 * The meta object literal for the '<em><b>License Valid Since</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__LICENSE_VALID_SINCE = eINSTANCE.getBody_LicenseValidSince();

		/**
		 * The meta object literal for the '<em><b>Oparl Since</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__OPARL_SINCE = eINSTANCE.getBody_OparlSince();

		/**
		 * The meta object literal for the '<em><b>Ags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__AGS = eINSTANCE.getBody_Ags();

		/**
		 * The meta object literal for the '<em><b>Rgs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__RGS = eINSTANCE.getBody_Rgs();

		/**
		 * The meta object literal for the '<em><b>Equivalent Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__EQUIVALENT_BODY = eINSTANCE.getBody_EquivalentBody();

		/**
		 * The meta object literal for the '<em><b>contact Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__CONTACT_EMAIL = eINSTANCE.getBody__contactEmail();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__CONTACT_NAME = eINSTANCE.getBody_ContactName();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__ORGANIZATION = eINSTANCE.getBody_Organization();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__PERSON = eINSTANCE.getBody_Person();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__MEETING = eINSTANCE.getBody_Meeting();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__PAPER = eINSTANCE.getBody_Paper();

		/**
		 * The meta object literal for the '<em><b>Legislative Term</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__LOCATION = eINSTANCE.getBody_Location();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___GET_TYPE = eINSTANCE.getBody__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Contact Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___GET_CONTACT_EMAIL = eINSTANCE.getBody__GetContactEmail();

		/**
		 * The meta object literal for the '<em><b>Set Contact Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___SET_CONTACT_EMAIL__STRING = eINSTANCE.getBody__SetContactEmail__String();

		/**
		 * The meta object literal for the '<em><b>Get Street Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___GET_STREET_ADDRESS = eINSTANCE.getBody__GetStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Get Postal Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___GET_POSTAL_CODE = eINSTANCE.getBody__GetPostalCode();

		/**
		 * The meta object literal for the '<em><b>Get Locality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BODY___GET_LOCALITY = eINSTANCE.getBody__GetLocality();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl <em>Addressable OParl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.AddressableOParlElementImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAddressableOParlElement()
		 * @generated
		 */
		EClass ADDRESSABLE_OPARL_ELEMENT = eINSTANCE.getAddressableOParlElement();

		/**
		 * The meta object literal for the '<em><b>street Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSABLE_OPARL_ELEMENT__STREET_ADDRESS = eINSTANCE.getAddressableOParlElement__streetAddress();

		/**
		 * The meta object literal for the '<em><b>postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSABLE_OPARL_ELEMENT__POSTAL_CODE = eINSTANCE.getAddressableOParlElement__postalCode();

		/**
		 * The meta object literal for the '<em><b>locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESSABLE_OPARL_ELEMENT__LOCALITY = eINSTANCE.getAddressableOParlElement__locality();

		/**
		 * The meta object literal for the '<em><b>Get Street Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESSABLE_OPARL_ELEMENT___GET_STREET_ADDRESS = eINSTANCE.getAddressableOParlElement__GetStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Set Street Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESSABLE_OPARL_ELEMENT___SET_STREET_ADDRESS__STRING = eINSTANCE.getAddressableOParlElement__SetStreetAddress__String();

		/**
		 * The meta object literal for the '<em><b>Get Postal Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESSABLE_OPARL_ELEMENT___GET_POSTAL_CODE = eINSTANCE.getAddressableOParlElement__GetPostalCode();

		/**
		 * The meta object literal for the '<em><b>Set Postal Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESSABLE_OPARL_ELEMENT___SET_POSTAL_CODE__STRING = eINSTANCE.getAddressableOParlElement__SetPostalCode__String();

		/**
		 * The meta object literal for the '<em><b>Get Locality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESSABLE_OPARL_ELEMENT___GET_LOCALITY = eINSTANCE.getAddressableOParlElement__GetLocality();

		/**
		 * The meta object literal for the '<em><b>Set Locality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESSABLE_OPARL_ELEMENT___SET_LOCALITY__STRING = eINSTANCE.getAddressableOParlElement__SetLocality__String();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGISLATIVE_TERM__NAME = eINSTANCE.getLegislativeTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGISLATIVE_TERM__BODY = eINSTANCE.getLegislativeTerm_Body();

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
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGISLATIVE_TERM___GET_TYPE = eINSTANCE.getLegislativeTerm__GetType();

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
		 * The meta object literal for the '<em><b>Body</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__BODY = eINSTANCE.getOrganization_Body();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEMBERSHIP = eINSTANCE.getOrganization_Membership();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEETING = eINSTANCE.getOrganization_Meeting();

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
		 * The meta object literal for the '<em><b>Organization Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_TYPE = eINSTANCE.getOrganization_OrganizationType();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__CLASSIFICATION = eINSTANCE.getOrganization_Classification();

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
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__WEBSITE = eINSTANCE.getOrganization_Website();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ROOM = eINSTANCE.getOrganization_Room();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__LOCATION = eINSTANCE.getOrganization_Location();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANIZATION___GET_TYPE = eINSTANCE.getOrganization__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Street Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANIZATION___GET_STREET_ADDRESS = eINSTANCE.getOrganization__GetStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Get Postal Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANIZATION___GET_POSTAL_CODE = eINSTANCE.getOrganization__GetPostalCode();

		/**
		 * The meta object literal for the '<em><b>Get Locality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANIZATION___GET_LOCALITY = eINSTANCE.getOrganization__GetLocality();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.MeetingOrganizationImpl <em>Meeting Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.MeetingOrganizationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeetingOrganization()
		 * @generated
		 */
		EClass MEETING_ORGANIZATION = eINSTANCE.getMeetingOrganization();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING_ORGANIZATION__MEETING = eINSTANCE.getMeetingOrganization_Meeting();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING_ORGANIZATION__ORGANIZATION = eINSTANCE.getMeetingOrganization_Organization();

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
		 * The meta object literal for the '<em><b>Body</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BODY = eINSTANCE.getPerson_Body();

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
		 * The meta object literal for the '<em><b>Affix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AFFIX = eINSTANCE.getPerson_Affix();

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
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PHONE = eINSTANCE.getPerson_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Sub Locality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUB_LOCALITY = eINSTANCE.getPerson_SubLocality();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LOCATION = eINSTANCE.getPerson_Location();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__STATUS = eINSTANCE.getPerson_Status();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__MEMBERSHIP = eINSTANCE.getPerson_Membership();

		/**
		 * The meta object literal for the '<em><b>Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LIFE = eINSTANCE.getPerson_Life();

		/**
		 * The meta object literal for the '<em><b>Life Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LIFE_SOURCE = eINSTANCE.getPerson_LifeSource();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_NAME = eINSTANCE.getPerson__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Street Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_STREET_ADDRESS = eINSTANCE.getPerson__GetStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Get Postal Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_POSTAL_CODE = eINSTANCE.getPerson__GetPostalCode();

		/**
		 * The meta object literal for the '<em><b>Get Locality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_LOCALITY = eINSTANCE.getPerson__GetLocality();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_TYPE = eINSTANCE.getPerson__GetType();

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
		 * The meta object literal for the '<em><b>Person</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__PERSON = eINSTANCE.getMembership_Person();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>On Behalf Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__ON_BEHALF_OF = eINSTANCE.getMembership_OnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMBERSHIP___GET_TYPE = eINSTANCE.getMembership__GetType();

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
		 * The meta object literal for the '<em><b>Meeting State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__MEETING_STATE = eINSTANCE.getMeeting_MeetingState();

		/**
		 * The meta object literal for the '<em><b>Cancelled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__CANCELLED = eINSTANCE.getMeeting_Cancelled();

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
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEETING__ROOM = eINSTANCE.getMeeting_Room();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEETING___GET_TYPE = eINSTANCE.getMeeting__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEETING___GET_NAME = eINSTANCE.getMeeting__GetName();

		/**
		 * The meta object literal for the '<em><b>Get Street Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEETING___GET_STREET_ADDRESS = eINSTANCE.getMeeting__GetStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Get Postal Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEETING___GET_POSTAL_CODE = eINSTANCE.getMeeting__GetPostalCode();

		/**
		 * The meta object literal for the '<em><b>Get Locality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEETING___GET_LOCALITY = eINSTANCE.getMeeting__GetLocality();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__NAME = eINSTANCE.getAgendaItem_Name();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM__MEETING = eINSTANCE.getAgendaItem_Meeting();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__NUMBER = eINSTANCE.getAgendaItem_Number();

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
		 * The meta object literal for the '<em><b>Resolution Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__RESOLUTION_TEXT = eINSTANCE.getAgendaItem_ResolutionText();

		/**
		 * The meta object literal for the '<em><b>Resolution File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM__RESOLUTION_FILE = eINSTANCE.getAgendaItem_ResolutionFile();

		/**
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM__AUXILIARY_FILE = eINSTANCE.getAgendaItem_AuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__START = eINSTANCE.getAgendaItem_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENDA_ITEM__END = eINSTANCE.getAgendaItem_End();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGENDA_ITEM___GET_TYPE = eINSTANCE.getAgendaItem__GetType();

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
		 * The meta object literal for the '<em><b>Body</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__BODY = eINSTANCE.getPaper_Body();

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
		 * The meta object literal for the '<em><b>Superordinated Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__SUPERORDINATED_PAPER = eINSTANCE.getPaper_SuperordinatedPaper();

		/**
		 * The meta object literal for the '<em><b>Subordinated Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__SUBORDINATED_PAPER = eINSTANCE.getPaper_SubordinatedPaper();

		/**
		 * The meta object literal for the '<em><b>Main File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__MAIN_FILE = eINSTANCE.getPaper_MainFile();

		/**
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__AUXILIARY_FILE = eINSTANCE.getPaper_AuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__LOCATION = eINSTANCE.getPaper_Location();

		/**
		 * The meta object literal for the '<em><b>Originator Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__ORIGINATOR_PERSON = eINSTANCE.getPaper_OriginatorPerson();

		/**
		 * The meta object literal for the '<em><b>Under Directionof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__UNDER_DIRECTIONOF = eINSTANCE.getPaper_UnderDirectionof();

		/**
		 * The meta object literal for the '<em><b>Originator Organization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__ORIGINATOR_ORGANIZATION = eINSTANCE.getPaper_OriginatorOrganization();

		/**
		 * The meta object literal for the '<em><b>Consultation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__CONSULTATION = eINSTANCE.getPaper_Consultation();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER___GET_TYPE = eINSTANCE.getPaper__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAPER___GET_NAME = eINSTANCE.getPaper__GetName();

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
		 * The meta object literal for the '<em><b>Paper</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>Meeting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSULTATION__MEETING = eINSTANCE.getConsultation_Meeting();

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
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSULTATION___GET_TYPE = eINSTANCE.getConsultation__GetType();

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
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_NAME = eINSTANCE.getFile_FileName();

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
		 * The meta object literal for the '<em><b>External Service Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__EXTERNAL_SERVICE_URL = eINSTANCE.getFile_ExternalServiceUrl();

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
		 * The meta object literal for the '<em><b>File License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_LICENSE = eINSTANCE.getFile_FileLicense();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___GET_TYPE = eINSTANCE.getFile__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___GET_NAME = eINSTANCE.getFile__GetName();

		/**
		 * The meta object literal for the '<em><b>Get License</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___GET_LICENSE = eINSTANCE.getFile__GetLicense();

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
		 * The meta object literal for the '<em><b>Bodies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__BODIES = eINSTANCE.getLocation_Bodies();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__ORGANIZATIONS = eINSTANCE.getLocation_Organizations();

		/**
		 * The meta object literal for the '<em><b>Meetings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__MEETINGS = eINSTANCE.getLocation_Meetings();

		/**
		 * The meta object literal for the '<em><b>Papers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PAPERS = eINSTANCE.getLocation_Papers();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___GET_TYPE = eINSTANCE.getLocation__GetType();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.BodyLocationImpl <em>Body Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.BodyLocationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getBodyLocation()
		 * @generated
		 */
		EClass BODY_LOCATION = eINSTANCE.getBodyLocation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_LOCATION__BODY = eINSTANCE.getBodyLocation_Body();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_LOCATION__LOCATION = eINSTANCE.getBodyLocation_Location();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.OrganizationLocationImpl <em>Organization Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.OrganizationLocationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOrganizationLocation()
		 * @generated
		 */
		EClass ORGANIZATION_LOCATION = eINSTANCE.getOrganizationLocation();

		/**
		 * The meta object literal for the '<em><b>Organziation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_LOCATION__ORGANZIATION = eINSTANCE.getOrganizationLocation_Organziation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_LOCATION__LOCATION = eINSTANCE.getOrganizationLocation_Location();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.MeetingLocationImpl <em>Meeting Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.MeetingLocationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getMeetingLocation()
		 * @generated
		 */
		EClass MEETING_LOCATION = eINSTANCE.getMeetingLocation();

		/**
		 * The meta object literal for the '<em><b>Meeting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING_LOCATION__MEETING = eINSTANCE.getMeetingLocation_Meeting();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEETING_LOCATION__LOCATION = eINSTANCE.getMeetingLocation_Location();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.PaperLocationImpl <em>Paper Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.PaperLocationImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getPaperLocation()
		 * @generated
		 */
		EClass PAPER_LOCATION = eINSTANCE.getPaperLocation();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER_LOCATION__PAPER = eINSTANCE.getPaperLocation_Paper();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER_LOCATION__LOCATION = eINSTANCE.getPaperLocation_Location();

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
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITATION_FILE__AGENDA_ITEM = eINSTANCE.getInvitationFile_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITATION_FILE__PAPER = eINSTANCE.getInvitationFile_Paper();

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
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_PROTOCOL__AGENDA_ITEM = eINSTANCE.getResultsProtocol_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTS_PROTOCOL__PAPER = eINSTANCE.getResultsProtocol_Paper();

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
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBATIM_PROTOCOL__AGENDA_ITEM = eINSTANCE.getVerbatimProtocol_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERBATIM_PROTOCOL__PAPER = eINSTANCE.getVerbatimProtocol_Paper();

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
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_FILE__AGENDA_ITEM = eINSTANCE.getAuxiliaryFile_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_FILE__PAPER = eINSTANCE.getAuxiliaryFile_Paper();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemResolutionFileImpl <em>Agenda Item Resolution File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.AgendaItemResolutionFileImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItemResolutionFile()
		 * @generated
		 */
		EClass AGENDA_ITEM_RESOLUTION_FILE = eINSTANCE.getAgendaItemResolutionFile();

		/**
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM_RESOLUTION_FILE__AGENDA_ITEM = eINSTANCE.getAgendaItemResolutionFile_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Resolution File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM_RESOLUTION_FILE__RESOLUTION_FILE = eINSTANCE.getAgendaItemResolutionFile_ResolutionFile();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.AgendaItemAuxiliaryFileImpl <em>Agenda Item Auxiliary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.AgendaItemAuxiliaryFileImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getAgendaItemAuxiliaryFile()
		 * @generated
		 */
		EClass AGENDA_ITEM_AUXILIARY_FILE = eINSTANCE.getAgendaItemAuxiliaryFile();

		/**
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM_AUXILIARY_FILE__AGENDA_ITEM = eINSTANCE.getAgendaItemAuxiliaryFile_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Auxiliary File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA_ITEM_AUXILIARY_FILE__AUXILIARY_FILE = eINSTANCE.getAgendaItemAuxiliaryFile_AuxiliaryFile();

		/**
		 * The meta object literal for the '{@link de.oklab.leipzig.oparl.impl.ResolutionFileImpl <em>Resolution File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oklab.leipzig.oparl.impl.ResolutionFileImpl
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getResolutionFile()
		 * @generated
		 */
		EClass RESOLUTION_FILE = eINSTANCE.getResolutionFile();

		/**
		 * The meta object literal for the '<em><b>Agenda Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_FILE__AGENDA_ITEM = eINSTANCE.getResolutionFile_AgendaItem();

		/**
		 * The meta object literal for the '<em><b>Paper</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION_FILE__PAPER = eINSTANCE.getResolutionFile_Paper();

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

		/**
		 * The meta object literal for the '<em>OParl Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.oklab.leipzig.oparl.impl.OparlPackageImpl#getOParlType()
		 * @generated
		 */
		EDataType OPARL_TYPE = eINSTANCE.getOParlType();

	}

} //OparlPackage
