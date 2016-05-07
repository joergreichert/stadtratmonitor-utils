/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.File;
import de.oklab.leipzig.oparl.Named;
import de.oklab.leipzig.oparl.OparlPackage;
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
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getSha1Checksum <em>Sha1 Checksum</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getAccessUrl <em>Access Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getExternalServiceUrl <em>External Service Url</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getMasterFile <em>Master File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getDerivativeFile <em>Derivative File</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.FileImpl#getFileLicense <em>File License</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends OParlElementImpl implements File {
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
	 * The default value of the '{@link #getExternalServiceUrl() <em>External Service Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalServiceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_SERVICE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalServiceUrl() <em>External Service Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalServiceUrl()
	 * @generated
	 * @ordered
	 */
	protected String externalServiceUrl = EXTERNAL_SERVICE_URL_EDEFAULT;

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
	 * The default value of the '{@link #getFileLicense() <em>File License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileLicense() <em>File License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileLicense()
	 * @generated
	 * @ordered
	 */
	protected String fileLicense = FILE_LICENSE_EDEFAULT;

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
	public String getExternalServiceUrl() {
		return externalServiceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalServiceUrl(String newExternalServiceUrl) {
		String oldExternalServiceUrl = externalServiceUrl;
		externalServiceUrl = newExternalServiceUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__EXTERNAL_SERVICE_URL, oldExternalServiceUrl, externalServiceUrl));
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
	public String getFileLicense() {
		return fileLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileLicense(String newFileLicense) {
		String oldFileLicense = fileLicense;
		fileLicense = newFileLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.FILE__FILE_LICENSE, oldFileLicense, fileLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "https://oparl.org/schema/1.0/File";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return super.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return super.getLicense();
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
			case OparlPackage.FILE__FILE_NAME:
				return getFileName();
			case OparlPackage.FILE__MIME_TYPE:
				return getMimeType();
			case OparlPackage.FILE__DATE:
				return getDate();
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
			case OparlPackage.FILE__EXTERNAL_SERVICE_URL:
				return getExternalServiceUrl();
			case OparlPackage.FILE__MASTER_FILE:
				if (resolve) return getMasterFile();
				return basicGetMasterFile();
			case OparlPackage.FILE__DERIVATIVE_FILE:
				return getDerivativeFile();
			case OparlPackage.FILE__FILE_LICENSE:
				return getFileLicense();
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
			case OparlPackage.FILE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case OparlPackage.FILE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case OparlPackage.FILE__DATE:
				setDate((Date)newValue);
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
			case OparlPackage.FILE__EXTERNAL_SERVICE_URL:
				setExternalServiceUrl((String)newValue);
				return;
			case OparlPackage.FILE__MASTER_FILE:
				setMasterFile((File)newValue);
				return;
			case OparlPackage.FILE__DERIVATIVE_FILE:
				getDerivativeFile().clear();
				getDerivativeFile().addAll((Collection<? extends File>)newValue);
				return;
			case OparlPackage.FILE__FILE_LICENSE:
				setFileLicense((String)newValue);
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
			case OparlPackage.FILE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case OparlPackage.FILE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case OparlPackage.FILE__DATE:
				setDate(DATE_EDEFAULT);
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
			case OparlPackage.FILE__EXTERNAL_SERVICE_URL:
				setExternalServiceUrl(EXTERNAL_SERVICE_URL_EDEFAULT);
				return;
			case OparlPackage.FILE__MASTER_FILE:
				setMasterFile((File)null);
				return;
			case OparlPackage.FILE__DERIVATIVE_FILE:
				getDerivativeFile().clear();
				return;
			case OparlPackage.FILE__FILE_LICENSE:
				setFileLicense(FILE_LICENSE_EDEFAULT);
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
			case OparlPackage.FILE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case OparlPackage.FILE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case OparlPackage.FILE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
			case OparlPackage.FILE__EXTERNAL_SERVICE_URL:
				return EXTERNAL_SERVICE_URL_EDEFAULT == null ? externalServiceUrl != null : !EXTERNAL_SERVICE_URL_EDEFAULT.equals(externalServiceUrl);
			case OparlPackage.FILE__MASTER_FILE:
				return masterFile != null;
			case OparlPackage.FILE__DERIVATIVE_FILE:
				return derivativeFile != null && !derivativeFile.isEmpty();
			case OparlPackage.FILE__FILE_LICENSE:
				return FILE_LICENSE_EDEFAULT == null ? fileLicense != null : !FILE_LICENSE_EDEFAULT.equals(fileLicense);
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
				case OparlPackage.TYPED___GET_TYPE: return OparlPackage.FILE___GET_TYPE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Named.class) {
			switch (baseOperationID) {
				case OparlPackage.NAMED___GET_NAME: return OparlPackage.FILE___GET_NAME;
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
			case OparlPackage.FILE___GET_TYPE:
				return getType();
			case OparlPackage.FILE___GET_NAME:
				return getName();
			case OparlPackage.FILE___GET_LICENSE:
				return getLicense();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", date: ");
		result.append(date);
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
		result.append(", externalServiceUrl: ");
		result.append(externalServiceUrl);
		result.append(", fileLicense: ");
		result.append(fileLicense);
		result.append(')');
		return result.toString();
	}

} //FileImpl
