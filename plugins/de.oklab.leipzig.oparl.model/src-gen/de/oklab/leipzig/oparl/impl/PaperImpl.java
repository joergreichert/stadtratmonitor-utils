/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.PersonOrOrganization;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getPublishedDate <em>Published Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getPaperType <em>Paper Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getRelatedPaper <em>Related Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getMainFile <em>Main File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getOriginator <em>Originator</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getConsultation <em>Consultation</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getUnderDirectionof <em>Under Directionof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaperImpl extends MinimalEObjectImpl.Container implements Paper {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Body body;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublishedDate() <em>Published Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBLISHED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishedDate() <em>Published Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDate()
	 * @generated
	 * @ordered
	 */
	protected Date publishedDate = PUBLISHED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaperType() <em>Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAPER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaperType() <em>Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperType()
	 * @generated
	 * @ordered
	 */
	protected String paperType = PAPER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedPaper() <em>Related Paper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> relatedPaper;

	/**
	 * The cached value of the '{@link #getMainFile() <em>Main File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFile()
	 * @generated
	 * @ordered
	 */
	protected File mainFile;

	/**
	 * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryFile()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryFile> auxiliaryFile;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getOriginator() <em>Originator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginator()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonOrOrganization> originator;

	/**
	 * The cached value of the '{@link #getConsultation() <em>Consultation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultation()
	 * @generated
	 * @ordered
	 */
	protected EList<Consultation> consultation;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keyword;

	/**
	 * The cached value of the '{@link #getUnderDirectionof() <em>Under Directionof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderDirectionof()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> underDirectionof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (Body)eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.PAPER__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		Body oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Body newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, OparlPackage.BODY__PAPER, Body.class, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, OparlPackage.BODY__PAPER, Body.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDate(Date newPublishedDate) {
		Date oldPublishedDate = publishedDate;
		publishedDate = newPublishedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__PUBLISHED_DATE, oldPublishedDate, publishedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaperType() {
		return paperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaperType(String newPaperType) {
		String oldPaperType = paperType;
		paperType = newPaperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__PAPER_TYPE, oldPaperType, paperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paper> getRelatedPaper() {
		if (relatedPaper == null) {
			relatedPaper = new EObjectResolvingEList<Paper>(Paper.class, this, OparlPackage.PAPER__RELATED_PAPER);
		}
		return relatedPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getMainFile() {
		if (mainFile != null && mainFile.eIsProxy()) {
			InternalEObject oldMainFile = (InternalEObject)mainFile;
			mainFile = (File)eResolveProxy(oldMainFile);
			if (mainFile != oldMainFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.PAPER__MAIN_FILE, oldMainFile, mainFile));
			}
		}
		return mainFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetMainFile() {
		return mainFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainFile(File newMainFile) {
		File oldMainFile = mainFile;
		mainFile = newMainFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__MAIN_FILE, oldMainFile, mainFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryFile> getAuxiliaryFile() {
		if (auxiliaryFile == null) {
			auxiliaryFile = new EObjectResolvingEList<AuxiliaryFile>(AuxiliaryFile.class, this, OparlPackage.PAPER__AUXILIARY_FILE);
		}
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectResolvingEList<Location>(Location.class, this, OparlPackage.PAPER__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonOrOrganization> getOriginator() {
		if (originator == null) {
			originator = new EObjectResolvingEList<PersonOrOrganization>(PersonOrOrganization.class, this, OparlPackage.PAPER__ORIGINATOR);
		}
		return originator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consultation> getConsultation() {
		if (consultation == null) {
			consultation = new EObjectWithInverseResolvingEList<Consultation>(Consultation.class, this, OparlPackage.PAPER__CONSULTATION, OparlPackage.CONSULTATION__PAPER);
		}
		return consultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.PAPER__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getUnderDirectionof() {
		if (underDirectionof == null) {
			underDirectionof = new EObjectResolvingEList<Organization>(Organization.class, this, OparlPackage.PAPER__UNDER_DIRECTIONOF);
		}
		return underDirectionof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.PAPER__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, OparlPackage.BODY__PAPER, Body.class, msgs);
				return basicSetBody((Body)otherEnd, msgs);
			case OparlPackage.PAPER__CONSULTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.PAPER__BODY:
				return basicSetBody(null, msgs);
			case OparlPackage.PAPER__CONSULTATION:
				return ((InternalEList<?>)getConsultation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OparlPackage.PAPER__ID:
				return getId();
			case OparlPackage.PAPER__TYPE:
				return getType();
			case OparlPackage.PAPER__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case OparlPackage.PAPER__NAME:
				return getName();
			case OparlPackage.PAPER__REFERENCE:
				return getReference();
			case OparlPackage.PAPER__PUBLISHED_DATE:
				return getPublishedDate();
			case OparlPackage.PAPER__PAPER_TYPE:
				return getPaperType();
			case OparlPackage.PAPER__RELATED_PAPER:
				return getRelatedPaper();
			case OparlPackage.PAPER__MAIN_FILE:
				if (resolve) return getMainFile();
				return basicGetMainFile();
			case OparlPackage.PAPER__AUXILIARY_FILE:
				return getAuxiliaryFile();
			case OparlPackage.PAPER__LOCATION:
				return getLocation();
			case OparlPackage.PAPER__ORIGINATOR:
				return getOriginator();
			case OparlPackage.PAPER__CONSULTATION:
				return getConsultation();
			case OparlPackage.PAPER__MODIFIED:
				return getModified();
			case OparlPackage.PAPER__KEYWORD:
				return getKeyword();
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				return getUnderDirectionof();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OparlPackage.PAPER__ID:
				setId((String)newValue);
				return;
			case OparlPackage.PAPER__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.PAPER__BODY:
				setBody((Body)newValue);
				return;
			case OparlPackage.PAPER__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.PAPER__REFERENCE:
				setReference((String)newValue);
				return;
			case OparlPackage.PAPER__PUBLISHED_DATE:
				setPublishedDate((Date)newValue);
				return;
			case OparlPackage.PAPER__PAPER_TYPE:
				setPaperType((String)newValue);
				return;
			case OparlPackage.PAPER__RELATED_PAPER:
				getRelatedPaper().clear();
				getRelatedPaper().addAll((Collection<? extends Paper>)newValue);
				return;
			case OparlPackage.PAPER__MAIN_FILE:
				setMainFile((File)newValue);
				return;
			case OparlPackage.PAPER__AUXILIARY_FILE:
				getAuxiliaryFile().clear();
				getAuxiliaryFile().addAll((Collection<? extends AuxiliaryFile>)newValue);
				return;
			case OparlPackage.PAPER__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case OparlPackage.PAPER__ORIGINATOR:
				getOriginator().clear();
				getOriginator().addAll((Collection<? extends PersonOrOrganization>)newValue);
				return;
			case OparlPackage.PAPER__CONSULTATION:
				getConsultation().clear();
				getConsultation().addAll((Collection<? extends Consultation>)newValue);
				return;
			case OparlPackage.PAPER__MODIFIED:
				setModified((Date)newValue);
				return;
			case OparlPackage.PAPER__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
				return;
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				getUnderDirectionof().clear();
				getUnderDirectionof().addAll((Collection<? extends Organization>)newValue);
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
			case OparlPackage.PAPER__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.PAPER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.PAPER__BODY:
				setBody((Body)null);
				return;
			case OparlPackage.PAPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.PAPER__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case OparlPackage.PAPER__PUBLISHED_DATE:
				setPublishedDate(PUBLISHED_DATE_EDEFAULT);
				return;
			case OparlPackage.PAPER__PAPER_TYPE:
				setPaperType(PAPER_TYPE_EDEFAULT);
				return;
			case OparlPackage.PAPER__RELATED_PAPER:
				getRelatedPaper().clear();
				return;
			case OparlPackage.PAPER__MAIN_FILE:
				setMainFile((File)null);
				return;
			case OparlPackage.PAPER__AUXILIARY_FILE:
				getAuxiliaryFile().clear();
				return;
			case OparlPackage.PAPER__LOCATION:
				getLocation().clear();
				return;
			case OparlPackage.PAPER__ORIGINATOR:
				getOriginator().clear();
				return;
			case OparlPackage.PAPER__CONSULTATION:
				getConsultation().clear();
				return;
			case OparlPackage.PAPER__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OparlPackage.PAPER__KEYWORD:
				getKeyword().clear();
				return;
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				getUnderDirectionof().clear();
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
			case OparlPackage.PAPER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.PAPER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.PAPER__BODY:
				return body != null;
			case OparlPackage.PAPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.PAPER__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case OparlPackage.PAPER__PUBLISHED_DATE:
				return PUBLISHED_DATE_EDEFAULT == null ? publishedDate != null : !PUBLISHED_DATE_EDEFAULT.equals(publishedDate);
			case OparlPackage.PAPER__PAPER_TYPE:
				return PAPER_TYPE_EDEFAULT == null ? paperType != null : !PAPER_TYPE_EDEFAULT.equals(paperType);
			case OparlPackage.PAPER__RELATED_PAPER:
				return relatedPaper != null && !relatedPaper.isEmpty();
			case OparlPackage.PAPER__MAIN_FILE:
				return mainFile != null;
			case OparlPackage.PAPER__AUXILIARY_FILE:
				return auxiliaryFile != null && !auxiliaryFile.isEmpty();
			case OparlPackage.PAPER__LOCATION:
				return location != null && !location.isEmpty();
			case OparlPackage.PAPER__ORIGINATOR:
				return originator != null && !originator.isEmpty();
			case OparlPackage.PAPER__CONSULTATION:
				return consultation != null && !consultation.isEmpty();
			case OparlPackage.PAPER__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OparlPackage.PAPER__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				return underDirectionof != null && !underDirectionof.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", reference: ");
		result.append(reference);
		result.append(", publishedDate: ");
		result.append(publishedDate);
		result.append(", paperType: ");
		result.append(paperType);
		result.append(", modified: ");
		result.append(modified);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(')');
		return result.toString();
	}

} //PaperImpl
