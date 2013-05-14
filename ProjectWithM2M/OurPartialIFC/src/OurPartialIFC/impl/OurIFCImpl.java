/**
 */
package OurPartialIFC.impl;

import OurPartialIFC.OurIFC;
import OurPartialIFC.OurIfcElement;
import OurPartialIFC.OurIfcElementType;
import OurPartialIFC.OurIfcMaterialSelect;
import OurPartialIFC.OurIfcMaterial;
import OurPartialIFC.OurIfcMaterialLayer;
import OurPartialIFC.OurIfcMaterialLayerSet;
import OurPartialIFC.OurIfcMaterialLayerSetUsage;
import OurPartialIFC.OurIfcMaterialList;
import OurPartialIFC.OurIfcRelAssociatesMaterial;
import OurPartialIFC.OurIfcRelDefinesByType;
import OurPartialIFC.OurPartialIFCPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Our IFC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getMaterialAssociation <em>Material Association</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getTypedefinitions <em>Typedefinitions</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getElementtypes <em>Elementtypes</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getMaterials <em>Materials</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getMaterialLists <em>Material Lists</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getMaterialLayerSet <em>Material Layer Set</em>}</li>
 *   <li>{@link OurPartialIFC.impl.OurIFCImpl#getMaterialLayerSetUsage <em>Material Layer Set Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OurIFCImpl extends EObjectImpl implements OurIFC {
	/**
	 * The cached value of the '{@link #getMaterialAssociation() <em>Material Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcRelAssociatesMaterial> materialAssociation;

	/**
	 * The cached value of the '{@link #getTypedefinitions() <em>Typedefinitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcRelDefinesByType> typedefinitions;

	/**
	 * The cached value of the '{@link #getElementtypes() <em>Elementtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcElementType> elementtypes;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcElement> elements;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcMaterial> materials;

	/**
	 * The cached value of the '{@link #getMaterialLists() <em>Material Lists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLists()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcMaterialList> materialLists;

	/**
	 * The cached value of the '{@link #getMaterialLayers() <em>Material Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcMaterialLayer> materialLayers;

	/**
	 * The cached value of the '{@link #getMaterialLayerSet() <em>Material Layer Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLayerSet()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcMaterialLayerSet> materialLayerSet;

	/**
	 * The cached value of the '{@link #getMaterialLayerSetUsage() <em>Material Layer Set Usage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLayerSetUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<OurIfcMaterialLayerSetUsage> materialLayerSetUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OurIFCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OurPartialIFCPackage.Literals.OUR_IFC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcMaterial> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<OurIfcMaterial>(OurIfcMaterial.class, this, OurPartialIFCPackage.OUR_IFC__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcMaterialList> getMaterialLists() {
		if (materialLists == null) {
			materialLists = new EObjectContainmentEList<OurIfcMaterialList>(OurIfcMaterialList.class, this, OurPartialIFCPackage.OUR_IFC__MATERIAL_LISTS);
		}
		return materialLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcMaterialLayer> getMaterialLayers() {
		if (materialLayers == null) {
			materialLayers = new EObjectContainmentEList<OurIfcMaterialLayer>(OurIfcMaterialLayer.class, this, OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYERS);
		}
		return materialLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcMaterialLayerSet> getMaterialLayerSet() {
		if (materialLayerSet == null) {
			materialLayerSet = new EObjectContainmentEList<OurIfcMaterialLayerSet>(OurIfcMaterialLayerSet.class, this, OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET);
		}
		return materialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcMaterialLayerSetUsage> getMaterialLayerSetUsage() {
		if (materialLayerSetUsage == null) {
			materialLayerSetUsage = new EObjectContainmentEList<OurIfcMaterialLayerSetUsage>(OurIfcMaterialLayerSetUsage.class, this, OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET_USAGE);
		}
		return materialLayerSetUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcRelAssociatesMaterial> getMaterialAssociation() {
		if (materialAssociation == null) {
			materialAssociation = new EObjectContainmentEList<OurIfcRelAssociatesMaterial>(OurIfcRelAssociatesMaterial.class, this, OurPartialIFCPackage.OUR_IFC__MATERIAL_ASSOCIATION);
		}
		return materialAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcRelDefinesByType> getTypedefinitions() {
		if (typedefinitions == null) {
			typedefinitions = new EObjectContainmentEList<OurIfcRelDefinesByType>(OurIfcRelDefinesByType.class, this, OurPartialIFCPackage.OUR_IFC__TYPEDEFINITIONS);
		}
		return typedefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcElementType> getElementtypes() {
		if (elementtypes == null) {
			elementtypes = new EObjectContainmentEList<OurIfcElementType>(OurIfcElementType.class, this, OurPartialIFCPackage.OUR_IFC__ELEMENTTYPES);
		}
		return elementtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OurIfcElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<OurIfcElement>(OurIfcElement.class, this, OurPartialIFCPackage.OUR_IFC__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_ASSOCIATION:
				return ((InternalEList<?>)getMaterialAssociation()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__TYPEDEFINITIONS:
				return ((InternalEList<?>)getTypedefinitions()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__ELEMENTTYPES:
				return ((InternalEList<?>)getElementtypes()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__MATERIALS:
				return ((InternalEList<?>)getMaterials()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LISTS:
				return ((InternalEList<?>)getMaterialLists()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYERS:
				return ((InternalEList<?>)getMaterialLayers()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET:
				return ((InternalEList<?>)getMaterialLayerSet()).basicRemove(otherEnd, msgs);
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET_USAGE:
				return ((InternalEList<?>)getMaterialLayerSetUsage()).basicRemove(otherEnd, msgs);
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
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_ASSOCIATION:
				return getMaterialAssociation();
			case OurPartialIFCPackage.OUR_IFC__TYPEDEFINITIONS:
				return getTypedefinitions();
			case OurPartialIFCPackage.OUR_IFC__ELEMENTTYPES:
				return getElementtypes();
			case OurPartialIFCPackage.OUR_IFC__ELEMENTS:
				return getElements();
			case OurPartialIFCPackage.OUR_IFC__MATERIALS:
				return getMaterials();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LISTS:
				return getMaterialLists();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYERS:
				return getMaterialLayers();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET:
				return getMaterialLayerSet();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET_USAGE:
				return getMaterialLayerSetUsage();
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
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_ASSOCIATION:
				getMaterialAssociation().clear();
				getMaterialAssociation().addAll((Collection<? extends OurIfcRelAssociatesMaterial>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__TYPEDEFINITIONS:
				getTypedefinitions().clear();
				getTypedefinitions().addAll((Collection<? extends OurIfcRelDefinesByType>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__ELEMENTTYPES:
				getElementtypes().clear();
				getElementtypes().addAll((Collection<? extends OurIfcElementType>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends OurIfcElement>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIALS:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends OurIfcMaterial>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LISTS:
				getMaterialLists().clear();
				getMaterialLists().addAll((Collection<? extends OurIfcMaterialList>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYERS:
				getMaterialLayers().clear();
				getMaterialLayers().addAll((Collection<? extends OurIfcMaterialLayer>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET:
				getMaterialLayerSet().clear();
				getMaterialLayerSet().addAll((Collection<? extends OurIfcMaterialLayerSet>)newValue);
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET_USAGE:
				getMaterialLayerSetUsage().clear();
				getMaterialLayerSetUsage().addAll((Collection<? extends OurIfcMaterialLayerSetUsage>)newValue);
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
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_ASSOCIATION:
				getMaterialAssociation().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__TYPEDEFINITIONS:
				getTypedefinitions().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__ELEMENTTYPES:
				getElementtypes().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__ELEMENTS:
				getElements().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIALS:
				getMaterials().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LISTS:
				getMaterialLists().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYERS:
				getMaterialLayers().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET:
				getMaterialLayerSet().clear();
				return;
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET_USAGE:
				getMaterialLayerSetUsage().clear();
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
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_ASSOCIATION:
				return materialAssociation != null && !materialAssociation.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__TYPEDEFINITIONS:
				return typedefinitions != null && !typedefinitions.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__ELEMENTTYPES:
				return elementtypes != null && !elementtypes.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__MATERIALS:
				return materials != null && !materials.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LISTS:
				return materialLists != null && !materialLists.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYERS:
				return materialLayers != null && !materialLayers.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET:
				return materialLayerSet != null && !materialLayerSet.isEmpty();
			case OurPartialIFCPackage.OUR_IFC__MATERIAL_LAYER_SET_USAGE:
				return materialLayerSetUsage != null && !materialLayerSetUsage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OurIFCImpl
