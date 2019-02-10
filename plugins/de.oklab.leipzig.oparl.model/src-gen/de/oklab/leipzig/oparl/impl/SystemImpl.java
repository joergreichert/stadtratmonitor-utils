/**
 */
package de.oklab.leipzig.oparl.impl;

import com.google.common.base.Objects;

import de.oklab.leipzig.oparl.Body;
import de.oklab.leipzig.oparl.Named;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Typed;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#get_oparlVersion <em>oparl Version</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getOtherOparlVersions <em>Other Oparl Versions</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getBodies <em>Bodies</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#get_contactEmail <em>contact Email</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.SystemImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends OParlElementImpl implements de.oklab.leipzig.oparl.System {
	/**
	 * The default value of the '{@link #get_oparlVersion() <em>oparl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_oparlVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String _OPARL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_oparlVersion() <em>oparl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_oparlVersion()
	 * @generated
	 * @ordered
	 */
	protected String _oparlVersion = _OPARL_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherOparlVersions() <em>Other Oparl Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherOparlVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<de.oklab.leipzig.oparl.System> otherOparlVersions;

	/**
	 * The cached value of the '{@link #getBodies() <em>Bodies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<Body> bodies;

	/**
	 * The default value of the '{@link #get_contactEmail() <em>contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_contactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String _CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_contactEmail() <em>contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_contactEmail()
	 * @generated
	 * @ordered
	 */
	protected String _contactEmail = _CONTACT_EMAIL_EDEFAULT;

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
	public String get_oparlVersion() {
		return _oparlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_oparlVersion(String new_oparlVersion) {
		String old_oparlVersion = _oparlVersion;
		_oparlVersion = new_oparlVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__OPARL_VERSION, old_oparlVersion, _oparlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<de.oklab.leipzig.oparl.System> getOtherOparlVersions() {
		if (otherOparlVersions == null) {
			otherOparlVersions = new EObjectContainmentEList<de.oklab.leipzig.oparl.System>(de.oklab.leipzig.oparl.System.class, this, OparlPackage.SYSTEM__OTHER_OPARL_VERSIONS);
		}
		return otherOparlVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Body> getBodies() {
		if (bodies == null) {
			bodies = new EObjectContainmentWithInverseEList<Body>(Body.class, this, OparlPackage.SYSTEM__BODIES, OparlPackage.BODY__SYSTEM);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_contactEmail() {
		return _contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_contactEmail(String new_contactEmail) {
		String old_contactEmail = _contactEmail;
		_contactEmail = new_contactEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.SYSTEM__CONTACT_EMAIL, old_contactEmail, _contactEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getType() {
		return "https://oparl.org/schema/1.0/System";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOparlVersion() {
		return ((SystemImpl) this)._oparlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOparlVersion(final String version) {
		boolean _equals = Objects.equal(version, null);
		if (_equals) {
			throw new IllegalArgumentException("OParl version isn\'t allowed to be null");
		}
		final String patternStr = "^mailto:.+$";
		final Pattern pattern = Pattern.compile(patternStr);
		final Matcher matcher = pattern.matcher(version);
		boolean _find = matcher.find();
		boolean _not = (!_find);
		if (_not) {
			String _format = String.format("%s doesn\'t follow pattern %s", version, patternStr);
			throw new IllegalArgumentException(_format);
		}
		((SystemImpl) this)._oparlVersion = version;
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
	@Override
	public String getContactEmail() {
		return ((SystemImpl) this)._contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactEmail(final String contactEmail) {
		boolean _notEquals = (!Objects.equal(contactEmail, null));
		if (_notEquals) {
			final String patternStr = "^^http://oparl\\.org/specs/1\\.0/$";
			final Pattern pattern = Pattern.compile(patternStr);
			final Matcher matcher = pattern.matcher(contactEmail);
			boolean _find = matcher.find();
			boolean _not = (!_find);
			if (_not) {
				String _format = String.format("%s doesn\'t follow pattern %s", contactEmail, patternStr);
				throw new IllegalArgumentException(_format);
			}
		}
		((SystemImpl) this)._contactEmail = contactEmail;
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
			case OparlPackage.SYSTEM__OTHER_OPARL_VERSIONS:
				return ((InternalEList<?>)getOtherOparlVersions()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.SYSTEM__OPARL_VERSION:
				return get_oparlVersion();
			case OparlPackage.SYSTEM__OTHER_OPARL_VERSIONS:
				return getOtherOparlVersions();
			case OparlPackage.SYSTEM__BODIES:
				return getBodies();
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				return get_contactEmail();
			case OparlPackage.SYSTEM__CONTACT_NAME:
				return getContactName();
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
			case OparlPackage.SYSTEM__OPARL_VERSION:
				set_oparlVersion((String)newValue);
				return;
			case OparlPackage.SYSTEM__OTHER_OPARL_VERSIONS:
				getOtherOparlVersions().clear();
				getOtherOparlVersions().addAll((Collection<? extends de.oklab.leipzig.oparl.System>)newValue);
				return;
			case OparlPackage.SYSTEM__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends Body>)newValue);
				return;
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				set_contactEmail((String)newValue);
				return;
			case OparlPackage.SYSTEM__CONTACT_NAME:
				setContactName((String)newValue);
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
			case OparlPackage.SYSTEM__OPARL_VERSION:
				set_oparlVersion(_OPARL_VERSION_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__OTHER_OPARL_VERSIONS:
				getOtherOparlVersions().clear();
				return;
			case OparlPackage.SYSTEM__BODIES:
				getBodies().clear();
				return;
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				set_contactEmail(_CONTACT_EMAIL_EDEFAULT);
				return;
			case OparlPackage.SYSTEM__CONTACT_NAME:
				setContactName(CONTACT_NAME_EDEFAULT);
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
			case OparlPackage.SYSTEM__OPARL_VERSION:
				return _OPARL_VERSION_EDEFAULT == null ? _oparlVersion != null : !_OPARL_VERSION_EDEFAULT.equals(_oparlVersion);
			case OparlPackage.SYSTEM__OTHER_OPARL_VERSIONS:
				return otherOparlVersions != null && !otherOparlVersions.isEmpty();
			case OparlPackage.SYSTEM__BODIES:
				return bodies != null && !bodies.isEmpty();
			case OparlPackage.SYSTEM__CONTACT_EMAIL:
				return _CONTACT_EMAIL_EDEFAULT == null ? _contactEmail != null : !_CONTACT_EMAIL_EDEFAULT.equals(_contactEmail);
			case OparlPackage.SYSTEM__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Typed.class) {
			switch (baseOperationID) {
				case OparlPackage.TYPED___GET_TYPE: return OparlPackage.SYSTEM___GET_TYPE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Named.class) {
			switch (baseOperationID) {
				case OparlPackage.NAMED___GET_NAME: return OparlPackage.SYSTEM___GET_NAME;
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
			case OparlPackage.SYSTEM___GET_TYPE:
				return getType();
			case OparlPackage.SYSTEM___GET_OPARL_VERSION:
				return getOparlVersion();
			case OparlPackage.SYSTEM___SET_OPARL_VERSION__STRING:
				setOparlVersion((String)arguments.get(0));
				return null;
			case OparlPackage.SYSTEM___GET_NAME:
				return getName();
			case OparlPackage.SYSTEM___GET_CONTACT_EMAIL:
				return getContactEmail();
			case OparlPackage.SYSTEM___SET_CONTACT_EMAIL__STRING:
				setContactEmail((String)arguments.get(0));
				return null;
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
		result.append(" (_oparlVersion: ");
		result.append(_oparlVersion);
		result.append(", _contactEmail: ");
		result.append(_contactEmail);
		result.append(", contactName: ");
		result.append(contactName);
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
