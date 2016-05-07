/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.BodyLocation;
import de.oklab.leipzig.oparl.Location;
import de.oklab.leipzig.oparl.MeetingLocation;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.OrganizationLocation;
import de.oklab.leipzig.oparl.PaperLocation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.LocationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.LocationImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.LocationImpl#getBodies <em>Bodies</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.LocationImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.LocationImpl#getMeetings <em>Meetings</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.LocationImpl#getPapers <em>Papers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends OParlElementImpl implements Location {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected String geometry = GEOMETRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBodies() <em>Bodies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyLocation> bodies;

	/**
	 * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationLocation> organizations;

	/**
	 * The cached value of the '{@link #getMeetings() <em>Meetings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeetingLocation> meetings;

	/**
	 * The cached value of the '{@link #getPapers() <em>Papers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPapers()
	 * @generated
	 * @ordered
	 */
	protected EList<PaperLocation> papers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.LOCATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		String oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.LOCATION__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyLocation> getBodies() {
		if (bodies == null) {
			bodies = new EObjectWithInverseResolvingEList<BodyLocation>(BodyLocation.class, this, OparlPackage.LOCATION__BODIES, OparlPackage.BODY_LOCATION__LOCATION);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationLocation> getOrganizations() {
		if (organizations == null) {
			organizations = new EObjectWithInverseResolvingEList<OrganizationLocation>(OrganizationLocation.class, this, OparlPackage.LOCATION__ORGANIZATIONS, OparlPackage.ORGANIZATION_LOCATION__LOCATION);
		}
		return organizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeetingLocation> getMeetings() {
		if (meetings == null) {
			meetings = new EObjectWithInverseResolvingEList<MeetingLocation>(MeetingLocation.class, this, OparlPackage.LOCATION__MEETINGS, OparlPackage.MEETING_LOCATION__LOCATION);
		}
		return meetings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaperLocation> getPapers() {
		if (papers == null) {
			papers = new EObjectWithInverseResolvingEList<PaperLocation>(PaperLocation.class, this, OparlPackage.LOCATION__PAPERS, OparlPackage.PAPER_LOCATION__LOCATION);
		}
		return papers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return "https://oparl.org/schema/1.0/Location";
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
			case OparlPackage.LOCATION__BODIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodies()).basicAdd(otherEnd, msgs);
			case OparlPackage.LOCATION__ORGANIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
			case OparlPackage.LOCATION__MEETINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeetings()).basicAdd(otherEnd, msgs);
			case OparlPackage.LOCATION__PAPERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPapers()).basicAdd(otherEnd, msgs);
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
			case OparlPackage.LOCATION__BODIES:
				return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
			case OparlPackage.LOCATION__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
			case OparlPackage.LOCATION__MEETINGS:
				return ((InternalEList<?>)getMeetings()).basicRemove(otherEnd, msgs);
			case OparlPackage.LOCATION__PAPERS:
				return ((InternalEList<?>)getPapers()).basicRemove(otherEnd, msgs);
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
			case OparlPackage.LOCATION__DESCRIPTION:
				return getDescription();
			case OparlPackage.LOCATION__GEOMETRY:
				return getGeometry();
			case OparlPackage.LOCATION__BODIES:
				return getBodies();
			case OparlPackage.LOCATION__ORGANIZATIONS:
				return getOrganizations();
			case OparlPackage.LOCATION__MEETINGS:
				return getMeetings();
			case OparlPackage.LOCATION__PAPERS:
				return getPapers();
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
			case OparlPackage.LOCATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OparlPackage.LOCATION__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case OparlPackage.LOCATION__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends BodyLocation>)newValue);
				return;
			case OparlPackage.LOCATION__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends OrganizationLocation>)newValue);
				return;
			case OparlPackage.LOCATION__MEETINGS:
				getMeetings().clear();
				getMeetings().addAll((Collection<? extends MeetingLocation>)newValue);
				return;
			case OparlPackage.LOCATION__PAPERS:
				getPapers().clear();
				getPapers().addAll((Collection<? extends PaperLocation>)newValue);
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
			case OparlPackage.LOCATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OparlPackage.LOCATION__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case OparlPackage.LOCATION__BODIES:
				getBodies().clear();
				return;
			case OparlPackage.LOCATION__ORGANIZATIONS:
				getOrganizations().clear();
				return;
			case OparlPackage.LOCATION__MEETINGS:
				getMeetings().clear();
				return;
			case OparlPackage.LOCATION__PAPERS:
				getPapers().clear();
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
			case OparlPackage.LOCATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OparlPackage.LOCATION__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case OparlPackage.LOCATION__BODIES:
				return bodies != null && !bodies.isEmpty();
			case OparlPackage.LOCATION__ORGANIZATIONS:
				return organizations != null && !organizations.isEmpty();
			case OparlPackage.LOCATION__MEETINGS:
				return meetings != null && !meetings.isEmpty();
			case OparlPackage.LOCATION__PAPERS:
				return papers != null && !papers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OparlPackage.LOCATION___GET_TYPE:
				return getType();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", geometry: ");
		result.append(geometry);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
