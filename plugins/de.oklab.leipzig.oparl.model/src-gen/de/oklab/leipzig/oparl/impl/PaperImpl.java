/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AuxiliaryFile;
import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.Named;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;
import de.oklab.leipzig.oparl.PaperLocation;
import de.oklab.leipzig.oparl.Person;
import de.oklab.leipzig.oparl.Typed;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getPublishedDate <em>Published Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getPaperType <em>Paper Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getRelatedPaper <em>Related Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getSuperordinatedPaper <em>Superordinated Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getSubordinatedPaper <em>Subordinated Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getMainFile <em>Main File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getAuxiliaryFile <em>Auxiliary File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getOriginatorPerson <em>Originator Person</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getUnderDirectionof <em>Under Directionof</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getOriginatorOrganization <em>Originator Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.PaperImpl#getConsultation <em>Consultation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaperImpl extends OParlElementImpl implements Paper {
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
	 * The cached value of the '{@link #getSuperordinatedPaper() <em>Superordinated Paper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperordinatedPaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> superordinatedPaper;

	/**
	 * The cached value of the '{@link #getSubordinatedPaper() <em>Subordinated Paper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubordinatedPaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> subordinatedPaper;

	/**
	 * The cached value of the '{@link #getMainFile() <em>Main File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainFile()
	 * @generated
	 * @ordered
	 */
	protected File mainFile;

	/**
	 * The cached value of the '{@link #getAuxiliaryFile() <em>Auxiliary File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryFile()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryFile> auxiliaryFile;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<PaperLocation> location;

	/**
	 * The cached value of the '{@link #getOriginatorPerson() <em>Originator Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> originatorPerson;

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
	 * The cached value of the '{@link #getOriginatorOrganization() <em>Originator Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> originatorOrganization;

	/**
	 * The cached value of the '{@link #getConsultation() <em>Consultation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultation()
	 * @generated
	 * @ordered
	 */
	protected EList<Consultation> consultation;

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
	@Override
	public Body getBody() {
		if (eContainerFeatureID() != OparlPackage.PAPER__BODY) return null;
		return (Body)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body basicGetBody() {
		if (eContainerFeatureID() != OparlPackage.PAPER__BODY) return null;
		return (Body)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBody, OparlPackage.PAPER__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(Body newBody) {
		if (newBody != eInternalContainer() || (eContainerFeatureID() != OparlPackage.PAPER__BODY && newBody != null)) {
			if (EcoreUtil.isAncestor(this, newBody))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
	@Override
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public Date getPublishedDate() {
		return publishedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getPaperType() {
		return paperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
	public EList<Paper> getSuperordinatedPaper() {
		if (superordinatedPaper == null) {
			superordinatedPaper = new EObjectWithInverseResolvingEList.ManyInverse<Paper>(Paper.class, this, OparlPackage.PAPER__SUPERORDINATED_PAPER, OparlPackage.PAPER__SUBORDINATED_PAPER);
		}
		return superordinatedPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Paper> getSubordinatedPaper() {
		if (subordinatedPaper == null) {
			subordinatedPaper = new EObjectWithInverseResolvingEList.ManyInverse<Paper>(Paper.class, this, OparlPackage.PAPER__SUBORDINATED_PAPER, OparlPackage.PAPER__SUPERORDINATED_PAPER);
		}
		return subordinatedPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File getMainFile() {
		return mainFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainFile(File newMainFile, NotificationChain msgs) {
		File oldMainFile = mainFile;
		mainFile = newMainFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__MAIN_FILE, oldMainFile, newMainFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainFile(File newMainFile) {
		if (newMainFile != mainFile) {
			NotificationChain msgs = null;
			if (mainFile != null)
				msgs = ((InternalEObject)mainFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OparlPackage.PAPER__MAIN_FILE, null, msgs);
			if (newMainFile != null)
				msgs = ((InternalEObject)newMainFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OparlPackage.PAPER__MAIN_FILE, null, msgs);
			msgs = basicSetMainFile(newMainFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.PAPER__MAIN_FILE, newMainFile, newMainFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AuxiliaryFile> getAuxiliaryFile() {
		if (auxiliaryFile == null) {
			auxiliaryFile = new EObjectContainmentEList<AuxiliaryFile>(AuxiliaryFile.class, this, OparlPackage.PAPER__AUXILIARY_FILE);
		}
		return auxiliaryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PaperLocation> getLocation() {
		if (location == null) {
			location = new EObjectContainmentWithInverseEList<PaperLocation>(PaperLocation.class, this, OparlPackage.PAPER__LOCATION, OparlPackage.PAPER_LOCATION__PAPER);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Person> getOriginatorPerson() {
		if (originatorPerson == null) {
			originatorPerson = new EObjectResolvingEList<Person>(Person.class, this, OparlPackage.PAPER__ORIGINATOR_PERSON);
		}
		return originatorPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<Organization> getOriginatorOrganization() {
		if (originatorOrganization == null) {
			originatorOrganization = new EObjectResolvingEList<Organization>(Organization.class, this, OparlPackage.PAPER__ORIGINATOR_ORGANIZATION);
		}
		return originatorOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Consultation> getConsultation() {
		if (consultation == null) {
			consultation = new EObjectContainmentWithInverseEList<Consultation>(Consultation.class, this, OparlPackage.PAPER__CONSULTATION, OparlPackage.CONSULTATION__PAPER);
		}
		return consultation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return "https://oparl.org/schema/1.0/Paper";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return super.getName();
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
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBody((Body)otherEnd, msgs);
			case OparlPackage.PAPER__SUPERORDINATED_PAPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperordinatedPaper()).basicAdd(otherEnd, msgs);
			case OparlPackage.PAPER__SUBORDINATED_PAPER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubordinatedPaper()).basicAdd(otherEnd, msgs);
			case OparlPackage.PAPER__LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocation()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.PAPER__SUPERORDINATED_PAPER:
				return ((InternalEList<?>)getSuperordinatedPaper()).basicRemove(otherEnd, msgs);
			case OparlPackage.PAPER__SUBORDINATED_PAPER:
				return ((InternalEList<?>)getSubordinatedPaper()).basicRemove(otherEnd, msgs);
			case OparlPackage.PAPER__MAIN_FILE:
				return basicSetMainFile(null, msgs);
			case OparlPackage.PAPER__AUXILIARY_FILE:
				return ((InternalEList<?>)getAuxiliaryFile()).basicRemove(otherEnd, msgs);
			case OparlPackage.PAPER__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OparlPackage.PAPER__BODY:
				return eInternalContainer().eInverseRemove(this, OparlPackage.BODY__PAPER, Body.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OparlPackage.PAPER__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case OparlPackage.PAPER__REFERENCE:
				return getReference();
			case OparlPackage.PAPER__PUBLISHED_DATE:
				return getPublishedDate();
			case OparlPackage.PAPER__PAPER_TYPE:
				return getPaperType();
			case OparlPackage.PAPER__RELATED_PAPER:
				return getRelatedPaper();
			case OparlPackage.PAPER__SUPERORDINATED_PAPER:
				return getSuperordinatedPaper();
			case OparlPackage.PAPER__SUBORDINATED_PAPER:
				return getSubordinatedPaper();
			case OparlPackage.PAPER__MAIN_FILE:
				return getMainFile();
			case OparlPackage.PAPER__AUXILIARY_FILE:
				return getAuxiliaryFile();
			case OparlPackage.PAPER__LOCATION:
				return getLocation();
			case OparlPackage.PAPER__ORIGINATOR_PERSON:
				return getOriginatorPerson();
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				return getUnderDirectionof();
			case OparlPackage.PAPER__ORIGINATOR_ORGANIZATION:
				return getOriginatorOrganization();
			case OparlPackage.PAPER__CONSULTATION:
				return getConsultation();
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
			case OparlPackage.PAPER__BODY:
				setBody((Body)newValue);
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
			case OparlPackage.PAPER__SUPERORDINATED_PAPER:
				getSuperordinatedPaper().clear();
				getSuperordinatedPaper().addAll((Collection<? extends Paper>)newValue);
				return;
			case OparlPackage.PAPER__SUBORDINATED_PAPER:
				getSubordinatedPaper().clear();
				getSubordinatedPaper().addAll((Collection<? extends Paper>)newValue);
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
				getLocation().addAll((Collection<? extends PaperLocation>)newValue);
				return;
			case OparlPackage.PAPER__ORIGINATOR_PERSON:
				getOriginatorPerson().clear();
				getOriginatorPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				getUnderDirectionof().clear();
				getUnderDirectionof().addAll((Collection<? extends Organization>)newValue);
				return;
			case OparlPackage.PAPER__ORIGINATOR_ORGANIZATION:
				getOriginatorOrganization().clear();
				getOriginatorOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case OparlPackage.PAPER__CONSULTATION:
				getConsultation().clear();
				getConsultation().addAll((Collection<? extends Consultation>)newValue);
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
			case OparlPackage.PAPER__BODY:
				setBody((Body)null);
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
			case OparlPackage.PAPER__SUPERORDINATED_PAPER:
				getSuperordinatedPaper().clear();
				return;
			case OparlPackage.PAPER__SUBORDINATED_PAPER:
				getSubordinatedPaper().clear();
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
			case OparlPackage.PAPER__ORIGINATOR_PERSON:
				getOriginatorPerson().clear();
				return;
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				getUnderDirectionof().clear();
				return;
			case OparlPackage.PAPER__ORIGINATOR_ORGANIZATION:
				getOriginatorOrganization().clear();
				return;
			case OparlPackage.PAPER__CONSULTATION:
				getConsultation().clear();
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
			case OparlPackage.PAPER__BODY:
				return basicGetBody() != null;
			case OparlPackage.PAPER__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case OparlPackage.PAPER__PUBLISHED_DATE:
				return PUBLISHED_DATE_EDEFAULT == null ? publishedDate != null : !PUBLISHED_DATE_EDEFAULT.equals(publishedDate);
			case OparlPackage.PAPER__PAPER_TYPE:
				return PAPER_TYPE_EDEFAULT == null ? paperType != null : !PAPER_TYPE_EDEFAULT.equals(paperType);
			case OparlPackage.PAPER__RELATED_PAPER:
				return relatedPaper != null && !relatedPaper.isEmpty();
			case OparlPackage.PAPER__SUPERORDINATED_PAPER:
				return superordinatedPaper != null && !superordinatedPaper.isEmpty();
			case OparlPackage.PAPER__SUBORDINATED_PAPER:
				return subordinatedPaper != null && !subordinatedPaper.isEmpty();
			case OparlPackage.PAPER__MAIN_FILE:
				return mainFile != null;
			case OparlPackage.PAPER__AUXILIARY_FILE:
				return auxiliaryFile != null && !auxiliaryFile.isEmpty();
			case OparlPackage.PAPER__LOCATION:
				return location != null && !location.isEmpty();
			case OparlPackage.PAPER__ORIGINATOR_PERSON:
				return originatorPerson != null && !originatorPerson.isEmpty();
			case OparlPackage.PAPER__UNDER_DIRECTIONOF:
				return underDirectionof != null && !underDirectionof.isEmpty();
			case OparlPackage.PAPER__ORIGINATOR_ORGANIZATION:
				return originatorOrganization != null && !originatorOrganization.isEmpty();
			case OparlPackage.PAPER__CONSULTATION:
				return consultation != null && !consultation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Typed.class) {
			switch (baseOperationID) {
				case OparlPackage.TYPED___GET_TYPE: return OparlPackage.PAPER___GET_TYPE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Named.class) {
			switch (baseOperationID) {
				case OparlPackage.NAMED___GET_NAME: return OparlPackage.PAPER___GET_NAME;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OparlPackage.PAPER___GET_TYPE:
				return getType();
			case OparlPackage.PAPER___GET_NAME:
				return getName();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (reference: ");
		result.append(reference);
		result.append(", publishedDate: ");
		result.append(publishedDate);
		result.append(", paperType: ");
		result.append(paperType);
		result.append(')');
		return result.toString();
	}

} //PaperImpl
