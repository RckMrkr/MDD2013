/**
 */
package OurPartialIFC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Our IFC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OurPartialIFC.OurIFC#getMaterialAssociation <em>Material Association</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getTypedefinitions <em>Typedefinitions</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getElementtypes <em>Elementtypes</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getElements <em>Elements</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getMaterials <em>Materials</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getMaterialLists <em>Material Lists</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getMaterialLayerSet <em>Material Layer Set</em>}</li>
 *   <li>{@link OurPartialIFC.OurIFC#getMaterialLayerSetUsage <em>Material Layer Set Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC()
 * @model
 * @generated
 */
public interface OurIFC extends EObject {
	/**
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_Materials()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcMaterial> getMaterials();

	/**
	 * Returns the value of the '<em><b>Material Lists</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcMaterialList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Lists</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_MaterialLists()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcMaterialList> getMaterialLists();

	/**
	 * Returns the value of the '<em><b>Material Layers</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcMaterialLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Layers</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_MaterialLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcMaterialLayer> getMaterialLayers();

	/**
	 * Returns the value of the '<em><b>Material Layer Set</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcMaterialLayerSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Layer Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Layer Set</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_MaterialLayerSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcMaterialLayerSet> getMaterialLayerSet();

	/**
	 * Returns the value of the '<em><b>Material Layer Set Usage</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcMaterialLayerSetUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Layer Set Usage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Layer Set Usage</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_MaterialLayerSetUsage()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcMaterialLayerSetUsage> getMaterialLayerSetUsage();

	/**
	 * Returns the value of the '<em><b>Material Association</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcRelAssociatesMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Association</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_MaterialAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcRelAssociatesMaterial> getMaterialAssociation();

	/**
	 * Returns the value of the '<em><b>Typedefinitions</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcRelDefinesByType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typedefinitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typedefinitions</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_Typedefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcRelDefinesByType> getTypedefinitions();

	/**
	 * Returns the value of the '<em><b>Elementtypes</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementtypes</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_Elementtypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcElementType> getElementtypes();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link OurPartialIFC.OurIfcElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see OurPartialIFC.OurPartialIFCPackage#getOurIFC_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<OurIfcElement> getElements();

} // OurIFC
