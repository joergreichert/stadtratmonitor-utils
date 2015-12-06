/**
 */
package de.oklab.leipzig.oparl.impl;

import de.oklab.leipzig.oparl.AgendaItem;
import de.oklab.leipzig.oparl.Consultation;
import de.oklab.leipzig.oparl.OparlPackage;
import de.oklab.leipzig.oparl.Organization;
import de.oklab.leipzig.oparl.Paper;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getPaper <em>Paper</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getAgendaItem <em>Agenda Item</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#isAuthoritative <em>Authoritative</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.oklab.leipzig.oparl.impl.ConsultationImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsultationImpl extends MinimalEObjectImpl.Container implements Consultation {
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
	 * The cached value of the '{@link #getPaper() <em>Paper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaper()
	 * @generated
	 * @ordered
	 */
	protected Paper paper;

	/**
	 * The cached value of the '{@link #getAgendaItem() <em>Agenda Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgendaItem()
	 * @generated
	 * @ordered
	 */
	protected AgendaItem agendaItem;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organization;

	/**
	 * The default value of the '{@link #isAuthoritative() <em>Authoritative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthoritative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHORITATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthoritative() <em>Authoritative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthoritative()
	 * @generated
	 * @ordered
	 */
	protected boolean authoritative = AUTHORITATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	protected ConsultationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OparlPackage.Literals.CONSULTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper getPaper() {
		if (paper != null && paper.eIsProxy()) {
			InternalEObject oldPaper = (InternalEObject)paper;
			paper = (Paper)eResolveProxy(oldPaper);
			if (paper != oldPaper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.CONSULTATION__PAPER, oldPaper, paper));
			}
		}
		return paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper basicGetPaper() {
		return paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaper(Paper newPaper, NotificationChain msgs) {
		Paper oldPaper = paper;
		paper = newPaper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__PAPER, oldPaper, newPaper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaper(Paper newPaper) {
		if (newPaper != paper) {
			NotificationChain msgs = null;
			if (paper != null)
				msgs = ((InternalEObject)paper).eInverseRemove(this, OparlPackage.PAPER__CONSULTATION, Paper.class, msgs);
			if (newPaper != null)
				msgs = ((InternalEObject)newPaper).eInverseAdd(this, OparlPackage.PAPER__CONSULTATION, Paper.class, msgs);
			msgs = basicSetPaper(newPaper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__PAPER, newPaper, newPaper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendaItem getAgendaItem() {
		if (agendaItem != null && agendaItem.eIsProxy()) {
			InternalEObject oldAgendaItem = (InternalEObject)agendaItem;
			agendaItem = (AgendaItem)eResolveProxy(oldAgendaItem);
			if (agendaItem != oldAgendaItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OparlPackage.CONSULTATION__AGENDA_ITEM, oldAgendaItem, agendaItem));
			}
		}
		return agendaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgendaItem basicGetAgendaItem() {
		return agendaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgendaItem(AgendaItem newAgendaItem, NotificationChain msgs) {
		AgendaItem oldAgendaItem = agendaItem;
		agendaItem = newAgendaItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__AGENDA_ITEM, oldAgendaItem, newAgendaItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgendaItem(AgendaItem newAgendaItem) {
		if (newAgendaItem != agendaItem) {
			NotificationChain msgs = null;
			if (agendaItem != null)
				msgs = ((InternalEObject)agendaItem).eInverseRemove(this, OparlPackage.AGENDA_ITEM__CONSULTATION, AgendaItem.class, msgs);
			if (newAgendaItem != null)
				msgs = ((InternalEObject)newAgendaItem).eInverseAdd(this, OparlPackage.AGENDA_ITEM__CONSULTATION, AgendaItem.class, msgs);
			msgs = basicSetAgendaItem(newAgendaItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__AGENDA_ITEM, newAgendaItem, newAgendaItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getOrganization() {
		if (organization == null) {
			organization = new EObjectResolvingEList<Organization>(Organization.class, this, OparlPackage.CONSULTATION__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthoritative() {
		return authoritative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoritative(boolean newAuthoritative) {
		boolean oldAuthoritative = authoritative;
		authoritative = newAuthoritative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__AUTHORITATIVE, oldAuthoritative, authoritative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OparlPackage.CONSULTATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeyword() {
		if (keyword == null) {
			keyword = new EDataTypeEList<String>(String.class, this, OparlPackage.CONSULTATION__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OparlPackage.CONSULTATION__PAPER:
				if (paper != null)
					msgs = ((InternalEObject)paper).eInverseRemove(this, OparlPackage.PAPER__CONSULTATION, Paper.class, msgs);
				return basicSetPaper((Paper)otherEnd, msgs);
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				if (agendaItem != null)
					msgs = ((InternalEObject)agendaItem).eInverseRemove(this, OparlPackage.AGENDA_ITEM__CONSULTATION, AgendaItem.class, msgs);
				return basicSetAgendaItem((AgendaItem)otherEnd, msgs);
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
			case OparlPackage.CONSULTATION__PAPER:
				return basicSetPaper(null, msgs);
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				return basicSetAgendaItem(null, msgs);
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
			case OparlPackage.CONSULTATION__ID:
				return getId();
			case OparlPackage.CONSULTATION__TYPE:
				return getType();
			case OparlPackage.CONSULTATION__PAPER:
				if (resolve) return getPaper();
				return basicGetPaper();
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				if (resolve) return getAgendaItem();
				return basicGetAgendaItem();
			case OparlPackage.CONSULTATION__ORGANIZATION:
				return getOrganization();
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				return isAuthoritative();
			case OparlPackage.CONSULTATION__ROLE:
				return getRole();
			case OparlPackage.CONSULTATION__KEYWORD:
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
			case OparlPackage.CONSULTATION__ID:
				setId((String)newValue);
				return;
			case OparlPackage.CONSULTATION__TYPE:
				setType((String)newValue);
				return;
			case OparlPackage.CONSULTATION__PAPER:
				setPaper((Paper)newValue);
				return;
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				setAgendaItem((AgendaItem)newValue);
				return;
			case OparlPackage.CONSULTATION__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				setAuthoritative((Boolean)newValue);
				return;
			case OparlPackage.CONSULTATION__ROLE:
				setRole((String)newValue);
				return;
			case OparlPackage.CONSULTATION__KEYWORD:
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
			case OparlPackage.CONSULTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case OparlPackage.CONSULTATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OparlPackage.CONSULTATION__PAPER:
				setPaper((Paper)null);
				return;
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				setAgendaItem((AgendaItem)null);
				return;
			case OparlPackage.CONSULTATION__ORGANIZATION:
				getOrganization().clear();
				return;
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				setAuthoritative(AUTHORITATIVE_EDEFAULT);
				return;
			case OparlPackage.CONSULTATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case OparlPackage.CONSULTATION__KEYWORD:
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
			case OparlPackage.CONSULTATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OparlPackage.CONSULTATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OparlPackage.CONSULTATION__PAPER:
				return paper != null;
			case OparlPackage.CONSULTATION__AGENDA_ITEM:
				return agendaItem != null;
			case OparlPackage.CONSULTATION__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case OparlPackage.CONSULTATION__AUTHORITATIVE:
				return authoritative != AUTHORITATIVE_EDEFAULT;
			case OparlPackage.CONSULTATION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case OparlPackage.CONSULTATION__KEYWORD:
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
		result.append(", authoritative: ");
		result.append(authoritative);
		result.append(", role: ");
		result.append(role);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(')');
		return result.toString();
	}

} //ConsultationImpl
