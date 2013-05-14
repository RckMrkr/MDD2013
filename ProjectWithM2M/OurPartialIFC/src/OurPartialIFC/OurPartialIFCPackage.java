/**
 */
package OurPartialIFC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see OurPartialIFC.OurPartialIFCFactory
 * @model kind="package"
 * @generated
 */
public interface OurPartialIFCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OurPartialIFC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/OurPartialIFC/model/OurPartialIFC.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OurPartialIFC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OurPartialIFCPackage eINSTANCE = OurPartialIFC.impl.OurPartialIFCPackageImpl.init();

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIFCImpl <em>Our IFC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIFCImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIFC()
	 * @generated
	 */
	int OUR_IFC = 0;

	/**
	 * The feature id for the '<em><b>Material Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__MATERIAL_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Typedefinitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__TYPEDEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Elementtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__ELEMENTTYPES = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__MATERIALS = 4;

	/**
	 * The feature id for the '<em><b>Material Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__MATERIAL_LISTS = 5;

	/**
	 * The feature id for the '<em><b>Material Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__MATERIAL_LAYERS = 6;

	/**
	 * The feature id for the '<em><b>Material Layer Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__MATERIAL_LAYER_SET = 7;

	/**
	 * The feature id for the '<em><b>Material Layer Set Usage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC__MATERIAL_LAYER_SET_USAGE = 8;

	/**
	 * The number of structural features of the '<em>Our IFC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Our IFC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.Identifiable
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl <em>Our Ifc Rel Associates Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcRelAssociatesMaterial()
	 * @generated
	 */
	int OUR_IFC_REL_ASSOCIATES_MATERIAL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_ASSOCIATES_MATERIAL__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Related Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Our Ifc Rel Associates Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_ASSOCIATES_MATERIAL_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Our Ifc Rel Associates Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_ASSOCIATES_MATERIAL_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.OurIfcMaterialSelect <em>Our Ifc Material Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.OurIfcMaterialSelect
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialSelect()
	 * @generated
	 */
	int OUR_IFC_MATERIAL_SELECT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_SELECT__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Material Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Material Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_SELECT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcMaterialImpl <em>Our Ifc Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcMaterialImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterial()
	 * @generated
	 */
	int OUR_IFC_MATERIAL = 8;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcMaterialLayerImpl <em>Our Ifc Material Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcMaterialLayerImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialLayer()
	 * @generated
	 */
	int OUR_IFC_MATERIAL_LAYER = 9;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcMaterialListImpl <em>Our Ifc Material List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcMaterialListImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialList()
	 * @generated
	 */
	int OUR_IFC_MATERIAL_LIST = 10;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcMaterialLayerSetImpl <em>Our Ifc Material Layer Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcMaterialLayerSetImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialLayerSet()
	 * @generated
	 */
	int OUR_IFC_MATERIAL_LAYER_SET = 11;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcMaterialLayerSetUsageImpl <em>Our Ifc Material Layer Set Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcMaterialLayerSetUsageImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialLayerSetUsage()
	 * @generated
	 */
	int OUR_IFC_MATERIAL_LAYER_SET_USAGE = 12;

	/**
	 * The meta object id for the '{@link OurPartialIFC.OurIfcRoot <em>Our Ifc Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.OurIfcRoot
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcRoot()
	 * @generated
	 */
	int OUR_IFC_ROOT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ROOT__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ROOT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ROOT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcElementImpl <em>Our Ifc Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcElementImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcElement()
	 * @generated
	 */
	int OUR_IFC_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT__ID = OUR_IFC_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT__DESCRIPTION = OUR_IFC_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT__TYPE = OUR_IFC_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Our Ifc Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT_FEATURE_COUNT = OUR_IFC_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Our Ifc Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT_OPERATION_COUNT = OUR_IFC_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcElementTypeImpl <em>Our Ifc Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcElementTypeImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcElementType()
	 * @generated
	 */
	int OUR_IFC_ELEMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT_TYPE__ID = OUR_IFC_ROOT__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT_TYPE_FEATURE_COUNT = OUR_IFC_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_ELEMENT_TYPE_OPERATION_COUNT = OUR_IFC_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OurPartialIFC.impl.OurIfcRelDefinesByTypeImpl <em>Our Ifc Rel Defines By Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OurPartialIFC.impl.OurIfcRelDefinesByTypeImpl
	 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcRelDefinesByType()
	 * @generated
	 */
	int OUR_IFC_REL_DEFINES_BY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Defined Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Our Ifc Rel Defines By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_DEFINES_BY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Our Ifc Rel Defines By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_REL_DEFINES_BY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL__ID = OUR_IFC_MATERIAL_SELECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL__NAME = OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Our Ifc Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_FEATURE_COUNT = OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Our Ifc Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_OPERATION_COUNT = OUR_IFC_MATERIAL_SELECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER__ID = OUR_IFC_MATERIAL_SELECT__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Material Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_FEATURE_COUNT = OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Material Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_OPERATION_COUNT = OUR_IFC_MATERIAL_SELECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LIST__ID = OUR_IFC_MATERIAL_SELECT__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Material List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LIST_FEATURE_COUNT = OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Material List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LIST_OPERATION_COUNT = OUR_IFC_MATERIAL_SELECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_SET__ID = OUR_IFC_MATERIAL_SELECT__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Material Layer Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_SET_FEATURE_COUNT = OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Material Layer Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_SET_OPERATION_COUNT = OUR_IFC_MATERIAL_SELECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_SET_USAGE__ID = OUR_IFC_MATERIAL_SELECT__ID;

	/**
	 * The number of structural features of the '<em>Our Ifc Material Layer Set Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_SET_USAGE_FEATURE_COUNT = OUR_IFC_MATERIAL_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Our Ifc Material Layer Set Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUR_IFC_MATERIAL_LAYER_SET_USAGE_OPERATION_COUNT = OUR_IFC_MATERIAL_SELECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIFC <em>Our IFC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our IFC</em>'.
	 * @see OurPartialIFC.OurIFC
	 * @generated
	 */
	EClass getOurIFC();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Materials</em>'.
	 * @see OurPartialIFC.OurIFC#getMaterials()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_Materials();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getMaterialLists <em>Material Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Lists</em>'.
	 * @see OurPartialIFC.OurIFC#getMaterialLists()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_MaterialLists();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getMaterialLayers <em>Material Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Layers</em>'.
	 * @see OurPartialIFC.OurIFC#getMaterialLayers()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_MaterialLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getMaterialLayerSet <em>Material Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Layer Set</em>'.
	 * @see OurPartialIFC.OurIFC#getMaterialLayerSet()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_MaterialLayerSet();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getMaterialLayerSetUsage <em>Material Layer Set Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Layer Set Usage</em>'.
	 * @see OurPartialIFC.OurIFC#getMaterialLayerSetUsage()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_MaterialLayerSetUsage();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getMaterialAssociation <em>Material Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material Association</em>'.
	 * @see OurPartialIFC.OurIFC#getMaterialAssociation()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_MaterialAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getTypedefinitions <em>Typedefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typedefinitions</em>'.
	 * @see OurPartialIFC.OurIFC#getTypedefinitions()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_Typedefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getElementtypes <em>Elementtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementtypes</em>'.
	 * @see OurPartialIFC.OurIFC#getElementtypes()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_Elementtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link OurPartialIFC.OurIFC#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see OurPartialIFC.OurIFC#getElements()
	 * @see #getOurIFC()
	 * @generated
	 */
	EReference getOurIFC_Elements();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcRelAssociatesMaterial <em>Our Ifc Rel Associates Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Rel Associates Material</em>'.
	 * @see OurPartialIFC.OurIfcRelAssociatesMaterial
	 * @generated
	 */
	EClass getOurIfcRelAssociatesMaterial();

	/**
	 * Returns the meta object for the reference list '{@link OurPartialIFC.OurIfcRelAssociatesMaterial#getRelatedElements <em>Related Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Elements</em>'.
	 * @see OurPartialIFC.OurIfcRelAssociatesMaterial#getRelatedElements()
	 * @see #getOurIfcRelAssociatesMaterial()
	 * @generated
	 */
	EReference getOurIfcRelAssociatesMaterial_RelatedElements();

	/**
	 * Returns the meta object for the reference '{@link OurPartialIFC.OurIfcRelAssociatesMaterial#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material</em>'.
	 * @see OurPartialIFC.OurIfcRelAssociatesMaterial#getMaterial()
	 * @see #getOurIfcRelAssociatesMaterial()
	 * @generated
	 */
	EReference getOurIfcRelAssociatesMaterial_Material();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcMaterialSelect <em>Our Ifc Material Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Material Select</em>'.
	 * @see OurPartialIFC.OurIfcMaterialSelect
	 * @generated
	 */
	EClass getOurIfcMaterialSelect();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcMaterial <em>Our Ifc Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Material</em>'.
	 * @see OurPartialIFC.OurIfcMaterial
	 * @generated
	 */
	EClass getOurIfcMaterial();

	/**
	 * Returns the meta object for the attribute '{@link OurPartialIFC.OurIfcMaterial#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OurPartialIFC.OurIfcMaterial#getName()
	 * @see #getOurIfcMaterial()
	 * @generated
	 */
	EAttribute getOurIfcMaterial_Name();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcMaterialLayer <em>Our Ifc Material Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Material Layer</em>'.
	 * @see OurPartialIFC.OurIfcMaterialLayer
	 * @generated
	 */
	EClass getOurIfcMaterialLayer();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcMaterialList <em>Our Ifc Material List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Material List</em>'.
	 * @see OurPartialIFC.OurIfcMaterialList
	 * @generated
	 */
	EClass getOurIfcMaterialList();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcMaterialLayerSet <em>Our Ifc Material Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Material Layer Set</em>'.
	 * @see OurPartialIFC.OurIfcMaterialLayerSet
	 * @generated
	 */
	EClass getOurIfcMaterialLayerSet();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcMaterialLayerSetUsage <em>Our Ifc Material Layer Set Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Material Layer Set Usage</em>'.
	 * @see OurPartialIFC.OurIfcMaterialLayerSetUsage
	 * @generated
	 */
	EClass getOurIfcMaterialLayerSetUsage();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcElement <em>Our Ifc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Element</em>'.
	 * @see OurPartialIFC.OurIfcElement
	 * @generated
	 */
	EClass getOurIfcElement();

	/**
	 * Returns the meta object for the attribute '{@link OurPartialIFC.OurIfcElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see OurPartialIFC.OurIfcElement#getDescription()
	 * @see #getOurIfcElement()
	 * @generated
	 */
	EAttribute getOurIfcElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link OurPartialIFC.OurIfcElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see OurPartialIFC.OurIfcElement#getType()
	 * @see #getOurIfcElement()
	 * @generated
	 */
	EAttribute getOurIfcElement_Type();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see OurPartialIFC.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link OurPartialIFC.Identifiable#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see OurPartialIFC.Identifiable#getID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ID();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcElementType <em>Our Ifc Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Element Type</em>'.
	 * @see OurPartialIFC.OurIfcElementType
	 * @generated
	 */
	EClass getOurIfcElementType();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcRoot <em>Our Ifc Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Root</em>'.
	 * @see OurPartialIFC.OurIfcRoot
	 * @generated
	 */
	EClass getOurIfcRoot();

	/**
	 * Returns the meta object for class '{@link OurPartialIFC.OurIfcRelDefinesByType <em>Our Ifc Rel Defines By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Our Ifc Rel Defines By Type</em>'.
	 * @see OurPartialIFC.OurIfcRelDefinesByType
	 * @generated
	 */
	EClass getOurIfcRelDefinesByType();

	/**
	 * Returns the meta object for the reference '{@link OurPartialIFC.OurIfcRelDefinesByType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see OurPartialIFC.OurIfcRelDefinesByType#getElementType()
	 * @see #getOurIfcRelDefinesByType()
	 * @generated
	 */
	EReference getOurIfcRelDefinesByType_ElementType();

	/**
	 * Returns the meta object for the reference list '{@link OurPartialIFC.OurIfcRelDefinesByType#getDefinedElements <em>Defined Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defined Elements</em>'.
	 * @see OurPartialIFC.OurIfcRelDefinesByType#getDefinedElements()
	 * @see #getOurIfcRelDefinesByType()
	 * @generated
	 */
	EReference getOurIfcRelDefinesByType_DefinedElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OurPartialIFCFactory getOurPartialIFCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIFCImpl <em>Our IFC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIFCImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIFC()
		 * @generated
		 */
		EClass OUR_IFC = eINSTANCE.getOurIFC();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__MATERIALS = eINSTANCE.getOurIFC_Materials();

		/**
		 * The meta object literal for the '<em><b>Material Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__MATERIAL_LISTS = eINSTANCE.getOurIFC_MaterialLists();

		/**
		 * The meta object literal for the '<em><b>Material Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__MATERIAL_LAYERS = eINSTANCE.getOurIFC_MaterialLayers();

		/**
		 * The meta object literal for the '<em><b>Material Layer Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__MATERIAL_LAYER_SET = eINSTANCE.getOurIFC_MaterialLayerSet();

		/**
		 * The meta object literal for the '<em><b>Material Layer Set Usage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__MATERIAL_LAYER_SET_USAGE = eINSTANCE.getOurIFC_MaterialLayerSetUsage();

		/**
		 * The meta object literal for the '<em><b>Material Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__MATERIAL_ASSOCIATION = eINSTANCE.getOurIFC_MaterialAssociation();

		/**
		 * The meta object literal for the '<em><b>Typedefinitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__TYPEDEFINITIONS = eINSTANCE.getOurIFC_Typedefinitions();

		/**
		 * The meta object literal for the '<em><b>Elementtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__ELEMENTTYPES = eINSTANCE.getOurIFC_Elementtypes();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC__ELEMENTS = eINSTANCE.getOurIFC_Elements();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl <em>Our Ifc Rel Associates Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcRelAssociatesMaterialImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcRelAssociatesMaterial()
		 * @generated
		 */
		EClass OUR_IFC_REL_ASSOCIATES_MATERIAL = eINSTANCE.getOurIfcRelAssociatesMaterial();

		/**
		 * The meta object literal for the '<em><b>Related Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS = eINSTANCE.getOurIfcRelAssociatesMaterial_RelatedElements();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL = eINSTANCE.getOurIfcRelAssociatesMaterial_Material();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.OurIfcMaterialSelect <em>Our Ifc Material Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.OurIfcMaterialSelect
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialSelect()
		 * @generated
		 */
		EClass OUR_IFC_MATERIAL_SELECT = eINSTANCE.getOurIfcMaterialSelect();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcMaterialImpl <em>Our Ifc Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcMaterialImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterial()
		 * @generated
		 */
		EClass OUR_IFC_MATERIAL = eINSTANCE.getOurIfcMaterial();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUR_IFC_MATERIAL__NAME = eINSTANCE.getOurIfcMaterial_Name();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcMaterialLayerImpl <em>Our Ifc Material Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcMaterialLayerImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialLayer()
		 * @generated
		 */
		EClass OUR_IFC_MATERIAL_LAYER = eINSTANCE.getOurIfcMaterialLayer();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcMaterialListImpl <em>Our Ifc Material List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcMaterialListImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialList()
		 * @generated
		 */
		EClass OUR_IFC_MATERIAL_LIST = eINSTANCE.getOurIfcMaterialList();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcMaterialLayerSetImpl <em>Our Ifc Material Layer Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcMaterialLayerSetImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialLayerSet()
		 * @generated
		 */
		EClass OUR_IFC_MATERIAL_LAYER_SET = eINSTANCE.getOurIfcMaterialLayerSet();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcMaterialLayerSetUsageImpl <em>Our Ifc Material Layer Set Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcMaterialLayerSetUsageImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcMaterialLayerSetUsage()
		 * @generated
		 */
		EClass OUR_IFC_MATERIAL_LAYER_SET_USAGE = eINSTANCE.getOurIfcMaterialLayerSetUsage();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcElementImpl <em>Our Ifc Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcElementImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcElement()
		 * @generated
		 */
		EClass OUR_IFC_ELEMENT = eINSTANCE.getOurIfcElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUR_IFC_ELEMENT__DESCRIPTION = eINSTANCE.getOurIfcElement_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUR_IFC_ELEMENT__TYPE = eINSTANCE.getOurIfcElement_Type();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.Identifiable
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_ID();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcElementTypeImpl <em>Our Ifc Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcElementTypeImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcElementType()
		 * @generated
		 */
		EClass OUR_IFC_ELEMENT_TYPE = eINSTANCE.getOurIfcElementType();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.OurIfcRoot <em>Our Ifc Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.OurIfcRoot
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcRoot()
		 * @generated
		 */
		EClass OUR_IFC_ROOT = eINSTANCE.getOurIfcRoot();

		/**
		 * The meta object literal for the '{@link OurPartialIFC.impl.OurIfcRelDefinesByTypeImpl <em>Our Ifc Rel Defines By Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OurPartialIFC.impl.OurIfcRelDefinesByTypeImpl
		 * @see OurPartialIFC.impl.OurPartialIFCPackageImpl#getOurIfcRelDefinesByType()
		 * @generated
		 */
		EClass OUR_IFC_REL_DEFINES_BY_TYPE = eINSTANCE.getOurIfcRelDefinesByType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE = eINSTANCE.getOurIfcRelDefinesByType_ElementType();

		/**
		 * The meta object literal for the '<em><b>Defined Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS = eINSTANCE.getOurIfcRelDefinesByType_DefinedElements();

	}

} //OurPartialIFCPackage
