/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Paper;

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
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getSha1Checksum <em>Sha1 Checksum</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getAccessUrl <em>Access Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getDerivativeFile <em>Derivative File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getLicense <em>License</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getFileRole <em>File Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
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
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSha1Checksum() <em>Sha1 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha1Checksum()
	 * @generated
	 * @ordered
	 */
	protected static final String SHA1_CHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSha1Checksum() <em>Sha1 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha1Checksum()
	 * @generated
	 * @ordered
	 */
	protected String sha1Checksum = SHA1_CHECKSUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessUrl() <em>Access Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessUrl() <em>Access Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUrl()
	 * @generated
	 * @ordered
	 */
	protected String accessUrl = ACCESS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownloadUrl() <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadUrl() <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadUrl()
	 * @generated
	 * @ordered
	 */
	protected String downloadUrl = DOWNLOAD_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaper() <em>Paper</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> paper;

	/**
	 * The cached value of the '{@link #getMasterFile() <em>Master File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterFile()
	 * @generated
	 * @ordered
	 */
	protected File masterFile;

	/**
	 * The cached value of the '{@link #getDerivativeFile() <em>Derivative File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivativeFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> derivativeFile;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileRole() <em>File Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileRole()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileRole() <em>File Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileRole()
	 * @generated
	 * @ordered
	 */
	protected String fileRole = FILE_ROLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.FILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__FILE_NAME, oldFileName, fileName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSha1Checksum() {
		return sha1Checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSha1Checksum(String newSha1Checksum) {
		String oldSha1Checksum = sha1Checksum;
		sha1Checksum = newSha1Checksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__SHA1_CHECKSUM, oldSha1Checksum, sha1Checksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessUrl() {
		return accessUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessUrl(String newAccessUrl) {
		String oldAccessUrl = accessUrl;
		accessUrl = newAccessUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__ACCESS_URL, oldAccessUrl, accessUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadUrl(String newDownloadUrl) {
		String oldDownloadUrl = downloadUrl;
		downloadUrl = newDownloadUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__DOWNLOAD_URL, oldDownloadUrl, downloadUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paper> getPaper() {
		if (paper == null) {
			paper = new EObjectResolvingEList<Paper>(Paper.class, this, OparlPackage.FILE__PAPER);
		}
		return paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getMasterFile() {
		if (masterFile != null && masterFile.eIsProxy()) {
			InternalEObject oldMasterFile = (InternalEObject)masterFile;
			masterFile = (File)eResolveProxy(oldMasterFile);
			if (masterFile != oldMasterFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.FILE__MASTER_FILE, oldMasterFile, masterFile));
			}
		}
		return masterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetMasterFile() {
		return masterFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterFile(File newMasterFile, NotificationChain msgs) {
		File oldMasterFile = masterFile;
		masterFile = newMasterFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__MASTER_FILE, oldMasterFile, newMasterFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterFile(File newMasterFile) {
		if (newMasterFile != masterFile) {
			NotificationChain msgs = null;
			if (masterFile != null)
				msgs = ((InternalEObject)masterFile).eInverseRemove(this, OparlPackage.FILE__DERIVATIVE_FILE, File.class, msgs);
			if (newMasterFile != null)
				msgs = ((InternalEObject)newMasterFile).eInverseAdd(this, OparlPackage.FILE__DERIVATIVE_FILE, File.class, msgs);
			msgs = basicSetMasterFile(newMasterFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__MASTER_FILE, newMasterFile, newMasterFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getDerivativeFile() {
		if (derivativeFile == null) {
			derivativeFile = new EObjectWithInverseResolvingEList<File>(File.class, this, OparlPackage.FILE__DERIVATIVE_FILE, OparlPackage.FILE__MASTER_FILE);
		}
		return derivativeFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileRole() {
		return fileRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileRole(String newFileRole) {
		String oldFileRole = fileRole;
		fileRole = newFileRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__FILE_ROLE, oldFileRole, fileRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.FILE__KEYWORD);
		}
		return keyword;
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
			case OparlPackage.FILE__MASTER_FILE:
				if (masterFile != null)
					msgs = ((InternalEObject)masterFile).eInverseRemove(this, OparlPackage.FILE__DERIVATIVE_FILE, File.class, msgs);
				return basicSetMasterFile((File)otherEnd, msgs);
			case OparlPackage.FILE__DERIVATIVE_FILE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDerivativeFile()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.FILE__MASTER_FILE:
				return basicSetMasterFile(null, msgs);
			case OparlPackage.FILE__DERIVATIVE_FILE:
				return ((InternalEList<?>)getDerivativeFile()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.FILE__ID:
				return getId();
			case OparlPackage.FILE__TYPE:
				return getType();
			case OparlPackage.FILE__FILE_NAME:
				return getFileName();
			case OparlPackage.FILE__NAME:
				return getName();
			case OparlPackage.FILE__MIME_TYPE:
				return getMimeType();
			case OparlPackage.FILE__DATE:
				return getDate();
			case OparlPackage.FILE__MODIFIED:
				return getModified();
			case OparlPackage.FILE__SIZE:
				return getSize();
			case OparlPackage.FILE__SHA1_CHECKSUM:
				return getSha1Checksum();
			case OparlPackage.FILE__TEXT:
				return getText();
			case OparlPackage.FILE__ACCESS_URL:
				return getAccessUrl();
			case OparlPackage.FILE__DOWNLOAD_URL:
				return getDownloadUrl();
			case OparlPackage.FILE__PAPER:
				return getPaper();
			case OparlPackage.FILE__MASTER_FILE:
				if (resolve) return getMasterFile();
				return basicGetMasterFile();
			case OparlPackage.FILE__DERIVATIVE_FILE:
				return getDerivativeFile();
			case OparlPackage.FILE__LICENSE:
				return getLicense();
			case OparlPackage.FILE__FILE_ROLE:
				return getFileRole();
			case OparlPackage.FILE__KEYWORD:
				return getKeyword();
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
			case OparlPackage.FILE__ID:
				setId((String)newValue);
				return;
			case OparlPackage.FILE__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.FILE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case OparlPackage.FILE__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.FILE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case OparlPackage.FILE__DATE:
				setDate((Date)newValue);
				return;
			case OparlPackage.FILE__MODIFIED:
				setModified((Date)newValue);
				return;
			case OparlPackage.FILE__SIZE:
				setSize((Integer)newValue);
				return;
			case OparlPackage.FILE__SHA1_CHECKSUM:
				setSha1Checksum((String)newValue);
				return;
			case OparlPackage.FILE__TEXT:
				setText((String)newValue);
				return;
			case OparlPackage.FILE__ACCESS_URL:
				setAccessUrl((String)newValue);
				return;
			case OparlPackage.FILE__DOWNLOAD_URL:
				setDownloadUrl((String)newValue);
				return;
			case OparlPackage.FILE__PAPER:
				getPaper().clear();
				getPaper().addAll((Collection<? extends Paper>)newValue);
				return;
			case OparlPackage.FILE__MASTER_FILE:
				setMasterFile((File)newValue);
				return;
			case OparlPackage.FILE__DERIVATIVE_FILE:
				getDerivativeFile().clear();
				getDerivativeFile().addAll((Collection<? extends File>)newValue);
				return;
			case OparlPackage.FILE__LICENSE:
				setLicense((String)newValue);
				return;
			case OparlPackage.FILE__FILE_ROLE:
				setFileRole((String)newValue);
				return;
			case OparlPackage.FILE__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends String>)newValue);
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
			case OparlPackage.FILE__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.FILE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.FILE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case OparlPackage.FILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.FILE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case OparlPackage.FILE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case OparlPackage.FILE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case OparlPackage.FILE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case OparlPackage.FILE__SHA1_CHECKSUM:
				setSha1Checksum(SHA1_CHECKSUM_EDEFAULT);
				return;
			case OparlPackage.FILE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case OparlPackage.FILE__ACCESS_URL:
				setAccessUrl(ACCESS_URL_EDEFAULT);
				return;
			case OparlPackage.FILE__DOWNLOAD_URL:
				setDownloadUrl(DOWNLOAD_URL_EDEFAULT);
				return;
			case OparlPackage.FILE__PAPER:
				getPaper().clear();
				return;
			case OparlPackage.FILE__MASTER_FILE:
				setMasterFile((File)null);
				return;
			case OparlPackage.FILE__DERIVATIVE_FILE:
				getDerivativeFile().clear();
				return;
			case OparlPackage.FILE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case OparlPackage.FILE__FILE_ROLE:
				setFileRole(FILE_ROLE_EDEFAULT);
				return;
			case OparlPackage.FILE__KEYWORD:
				getKeyword().clear();
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
			case OparlPackage.FILE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.FILE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.FILE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case OparlPackage.FILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.FILE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case OparlPackage.FILE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case OparlPackage.FILE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case OparlPackage.FILE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case OparlPackage.FILE__SHA1_CHECKSUM:
				return SHA1_CHECKSUM_EDEFAULT == null ? sha1Checksum != null : !SHA1_CHECKSUM_EDEFAULT.equals(sha1Checksum);
			case OparlPackage.FILE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case OparlPackage.FILE__ACCESS_URL:
				return ACCESS_URL_EDEFAULT == null ? accessUrl != null : !ACCESS_URL_EDEFAULT.equals(accessUrl);
			case OparlPackage.FILE__DOWNLOAD_URL:
				return DOWNLOAD_URL_EDEFAULT == null ? downloadUrl != null : !DOWNLOAD_URL_EDEFAULT.equals(downloadUrl);
			case OparlPackage.FILE__PAPER:
				return paper != null && !paper.isEmpty();
			case OparlPackage.FILE__MASTER_FILE:
				return masterFile != null;
			case OparlPackage.FILE__DERIVATIVE_FILE:
				return derivativeFile != null && !derivativeFile.isEmpty();
			case OparlPackage.FILE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case OparlPackage.FILE__FILE_ROLE:
				return FILE_ROLE_EDEFAULT == null ? fileRole != null : !FILE_ROLE_EDEFAULT.equals(fileRole);
			case OparlPackage.FILE__KEYWORD:
				return keyword != null && !keyword.isEmpty();
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
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", name: ");
		result.append(name);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", date: ");
		result.append(date);
		result.append(", modified: ");
		result.append(modified);
		result.append(", size: ");
		result.append(size);
		result.append(", sha1Checksum: ");
		result.append(sha1Checksum);
		result.append(", text: ");
		result.append(text);
		result.append(", accessUrl: ");
		result.append(accessUrl);
		result.append(", downloadUrl: ");
		result.append(downloadUrl);
		result.append(", license: ");
		result.append(license);
		result.append(", fileRole: ");
		result.append(fileRole);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(')');
		return result.toString();
	}

} //FileImpl
