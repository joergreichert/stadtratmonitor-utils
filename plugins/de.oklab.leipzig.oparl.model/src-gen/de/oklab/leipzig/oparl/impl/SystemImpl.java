/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.OparlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getOparlVersion <em>Oparl Version</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getBodies <em>Bodies</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getNewObjects <em>New Objects</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getUpdatedObjects <em>Updated Objects</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getRemovedObjects <em>Removed Objects</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements de.oklab.leipzig.oparl.System {
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
	 * The default value of the '{@link #getOparlVersion() <em>Oparl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOparlVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OPARL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOparlVersion() <em>Oparl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOparlVersion()
	 * @generated
	 * @ordered
	 */
	protected String oparlVersion = OPARL_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBodies() <em>Bodies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<Body> bodies;

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
	 * The default value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected String contactEmail = CONTACT_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected String contactName = CONTACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewObjects() <em>New Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewObjects()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_OBJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewObjects() <em>New Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewObjects()
	 * @generated
	 * @ordered
	 */
	protected String newObjects = NEW_OBJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatedObjects() <em>Updated Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_OBJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdatedObjects() <em>Updated Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedObjects()
	 * @generated
	 * @ordered
	 */
	protected String updatedObjects = UPDATED_OBJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovedObjects() <em>Removed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedObjects()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVED_OBJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovedObjects() <em>Removed Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedObjects()
	 * @generated
	 * @ordered
	 */
	protected String removedObjects = REMOVED_OBJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected String product = PRODUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOparlVersion() {
		return oparlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOparlVersion(String newOparlVersion) {
		String oldOparlVersion = oparlVersion;
		oparlVersion = newOparlVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__OPARL_VERSION, oldOparlVersion, oparlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Body> getBodies() {
		if (bodies == null) {
			bodies = new EObjectWithInverseResolvingEList<Body>(Body.class, this, OparlPackage.SYSTEM__BODIES, OparlPackage.BODY__SYSTEM);
		}
		return bodies;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactEmail(String newContactEmail) {
		String oldContactEmail = contactEmail;
		contactEmail = newContactEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__CONTACT_EMAIL, oldContactEmail, contactEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactName(String newContactName) {
		String oldContactName = contactName;
		contactName = newContactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__CONTACT_NAME, oldContactName, contactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewObjects() {
		return newObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewObjects(String newNewObjects) {
		String oldNewObjects = newObjects;
		newObjects = newNewObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__NEW_OBJECTS, oldNewObjects, newObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdatedObjects() {
		return updatedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedObjects(String newUpdatedObjects) {
		String oldUpdatedObjects = updatedObjects;
		updatedObjects = newUpdatedObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__UPDATED_OBJECTS, oldUpdatedObjects, updatedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemovedObjects() {
		return removedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedObjects(String newRemovedObjects) {
		String oldRemovedObjects = removedObjects;
		removedObjects = newRemovedObjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__REMOVED_OBJECTS, oldRemovedObjects, removedObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(String newProduct) {
		String oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__PRODUCT, oldProduct, product));
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
			case OparlPackage.SYSTEM__BODIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodies()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.SYSTEM__BODIES:
				return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.SYSTEM__ID:
				return getId();
			case OparlPackage.SYSTEM__TYPE:
				return getType();
			case OparlPackage.SYSTEM__OPARL_VERSION:
				return getOparlVersion();
			case OparlPackage.SYSTEM__BODIES:
				return getBodies();
			case OparlPackage.SYSTEM__NAME:
				return getName();
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				return getContactEmail();
			case OparlPackage.SYSTEM__CONTACT_NAME:
				return getContactName();
			case OparlPackage.SYSTEM__NEW_OBJECTS:
				return getNewObjects();
			case OparlPackage.SYSTEM__UPDATED_OBJECTS:
				return getUpdatedObjects();
			case OparlPackage.SYSTEM__REMOVED_OBJECTS:
				return getRemovedObjects();
			case OparlPackage.SYSTEM__WEBSITE:
				return getWebsite();
			case OparlPackage.SYSTEM__VENDOR:
				return getVendor();
			case OparlPackage.SYSTEM__PRODUCT:
				return getProduct();
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
			case OparlPackage.SYSTEM__ID:
				setId((String)newValue);
				return;
			case OparlPackage.SYSTEM__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.SYSTEM__OPARL_VERSION:
				setOparlVersion((String)newValue);
				return;
			case OparlPackage.SYSTEM__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends Body>)newValue);
				return;
			case OparlPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				setContactEmail((String)newValue);
				return;
			case OparlPackage.SYSTEM__CONTACT_NAME:
				setContactName((String)newValue);
				return;
			case OparlPackage.SYSTEM__NEW_OBJECTS:
				setNewObjects((String)newValue);
				return;
			case OparlPackage.SYSTEM__UPDATED_OBJECTS:
				setUpdatedObjects((String)newValue);
				return;
			case OparlPackage.SYSTEM__REMOVED_OBJECTS:
				setRemovedObjects((String)newValue);
				return;
			case OparlPackage.SYSTEM__WEBSITE:
				setWebsite((String)newValue);
				return;
			case OparlPackage.SYSTEM__VENDOR:
				setVendor((String)newValue);
				return;
			case OparlPackage.SYSTEM__PRODUCT:
				setProduct((String)newValue);
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
			case OparlPackage.SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__OPARL_VERSION:
				setOparlVersion(OPARL_VERSION_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__BODIES:
				getBodies().clear();
				return;
			case OparlPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				setContactEmail(CONTACT_EMAIL_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__CONTACT_NAME:
				setContactName(CONTACT_NAME_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__NEW_OBJECTS:
				setNewObjects(NEW_OBJECTS_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__UPDATED_OBJECTS:
				setUpdatedObjects(UPDATED_OBJECTS_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__REMOVED_OBJECTS:
				setRemovedObjects(REMOVED_OBJECTS_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__PRODUCT:
				setProduct(PRODUCT_EDEFAULT);
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
			case OparlPackage.SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.SYSTEM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.SYSTEM__OPARL_VERSION:
				return OPARL_VERSION_EDEFAULT == null ? oparlVersion != null : !OPARL_VERSION_EDEFAULT.equals(oparlVersion);
			case OparlPackage.SYSTEM__BODIES:
				return bodies != null && !bodies.isEmpty();
			case OparlPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				return CONTACT_EMAIL_EDEFAULT == null ? contactEmail != null : !CONTACT_EMAIL_EDEFAULT.equals(contactEmail);
			case OparlPackage.SYSTEM__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
			case OparlPackage.SYSTEM__NEW_OBJECTS:
				return NEW_OBJECTS_EDEFAULT == null ? newObjects != null : !NEW_OBJECTS_EDEFAULT.equals(newObjects);
			case OparlPackage.SYSTEM__UPDATED_OBJECTS:
				return UPDATED_OBJECTS_EDEFAULT == null ? updatedObjects != null : !UPDATED_OBJECTS_EDEFAULT.equals(updatedObjects);
			case OparlPackage.SYSTEM__REMOVED_OBJECTS:
				return REMOVED_OBJECTS_EDEFAULT == null ? removedObjects != null : !REMOVED_OBJECTS_EDEFAULT.equals(removedObjects);
			case OparlPackage.SYSTEM__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case OparlPackage.SYSTEM__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case OparlPackage.SYSTEM__PRODUCT:
				return PRODUCT_EDEFAULT == null ? product != null : !PRODUCT_EDEFAULT.equals(product);
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
		result.append(", oparlVersion: ");
		result.append(oparlVersion);
		result.append(", name: ");
		result.append(name);
		result.append(", contactEmail: ");
		result.append(contactEmail);
		result.append(", contactName: ");
		result.append(contactName);
		result.append(", newObjects: ");
		result.append(newObjects);
		result.append(", updatedObjects: ");
		result.append(updatedObjects);
		result.append(", removedObjects: ");
		result.append(removedObjects);
		result.append(", website: ");
		result.append(website);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", product: ");
		result.append(product);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
