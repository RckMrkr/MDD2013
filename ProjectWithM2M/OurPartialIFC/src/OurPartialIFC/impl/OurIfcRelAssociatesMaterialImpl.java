/**
 */
package OurPartialIFC.impl;

import OurPartialIFC.OurIfcMaterialSelect;
import OurPartialIFC.OurIfcMaterial;
import OurPartialIFC.OurIfcRelAssociatesMaterial;
import OurPartialIFC.OurIfcRoot;
import OurPartialIFC.OurPartialIFCPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Our Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl#getID <em>ID</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OurIfcRelAssociatesMaterialImpl extends EObjectImpl implements OurIfcRelAssociatesMaterial {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedElements() <em>Related Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcRoot> relatedElements;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected OurIfcMaterialSelect material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OurIfcRelAssociatesMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OurPartialIFCPackage.Literals.OUR_IFC_REL_ASSOCIATES_MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcRoot> getRelatedElements() {
		if (relatedElements == null) {
			relatedElements = new EObjectResolvingEList<OurIfcRoot>(OurIfcRoot.class, this, OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS);
		}
		return relatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterialSelect getMaterial() {
		if (material != null && material.eIsProxy()) {
			InternalEObject oldMaterial = (InternalEObject)material;
			material = (OurIfcMaterialSelect)eResolveProxy(oldMaterial);
			if (material != oldMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL, oldMaterial, material));
			}
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterialSelect basicGetMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(OurIfcMaterialSelect newMaterial) {
		OurIfcMaterialSelect oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL, oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__ID:
				return getID();
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS:
				return getRelatedElements();
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL:
				if (resolve) return getMaterial();
				return basicGetMaterial();
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
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__ID:
				setID((Integer)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS:
				getRelatedElements().clear();
				getRelatedElements().addAll((Collection<? extends OurIfcRoot>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL:
				setMaterial((OurIfcMaterialSelect)newValue);
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
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__ID:
				setID(ID_EDEFAULT);
				return;
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS:
				getRelatedElements().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL:
				setMaterial((OurIfcMaterialSelect)null);
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
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__ID:
				return id != ID_EDEFAULT;
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS:
				return relatedElements != null && !relatedElements.isEmpty();
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL:
				return material != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //OurIfcRelAssociatesMaterialImpl
