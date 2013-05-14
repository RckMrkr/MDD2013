/**
 */
package OurPartialIFC.impl;

import OurPartialIFC.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OurPartialIFCFactoryImpl extends EFactoryImpl implements OurPartialIFCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OurPartialIFCFactory init() {
		try {
			OurPartialIFCFactory theOurPartialIFCFactory = (OurPartialIFCFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/OurPartialIFC/model/OurPartialIFC.ecore"); 
			if (theOurPartialIFCFactory != null) {
				return theOurPartialIFCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OurPartialIFCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurPartialIFCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OurPartialIFCPackage.OUR_IFC: return createOurIFC();
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL: return createOurIfcRelAssociatesMaterial();
			case OurPartialIFCPackage.OUR_IFC_ELEMENT: return createOurIfcElement();
			case OurPartialIFCPackage.OUR_IFC_ELEMENT_TYPE: return createOurIfcElementType();
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE: return createOurIfcRelDefinesByType();
			case OurPartialIFCPackage.OUR_IFC_MATERIAL: return createOurIfcMaterial();
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LAYER: return createOurIfcMaterialLayer();
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LIST: return createOurIfcMaterialList();
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LAYER_SET: return createOurIfcMaterialLayerSet();
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LAYER_SET_USAGE: return createOurIfcMaterialLayerSetUsage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIFC createOurIFC() {
		OurIFCImpl ourIFC = new OurIFCImpl();
		return ourIFC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcRelAssociatesMaterial createOurIfcRelAssociatesMaterial() {
		OurIfcRelAssociatesMaterialImpl ourIfcRelAssociatesMaterial = new OurIfcRelAssociatesMaterialImpl();
		return ourIfcRelAssociatesMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterial createOurIfcMaterial() {
		OurIfcMaterialImpl ourIfcMaterial = new OurIfcMaterialImpl();
		return ourIfcMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterialLayer createOurIfcMaterialLayer() {
		OurIfcMaterialLayerImpl ourIfcMaterialLayer = new OurIfcMaterialLayerImpl();
		return ourIfcMaterialLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterialList createOurIfcMaterialList() {
		OurIfcMaterialListImpl ourIfcMaterialList = new OurIfcMaterialListImpl();
		return ourIfcMaterialList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterialLayerSet createOurIfcMaterialLayerSet() {
		OurIfcMaterialLayerSetImpl ourIfcMaterialLayerSet = new OurIfcMaterialLayerSetImpl();
		return ourIfcMaterialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcMaterialLayerSetUsage createOurIfcMaterialLayerSetUsage() {
		OurIfcMaterialLayerSetUsageImpl ourIfcMaterialLayerSetUsage = new OurIfcMaterialLayerSetUsageImpl();
		return ourIfcMaterialLayerSetUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcElement createOurIfcElement() {
		OurIfcElementImpl ourIfcElement = new OurIfcElementImpl();
		return ourIfcElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcElementType createOurIfcElementType() {
		OurIfcElementTypeImpl ourIfcElementType = new OurIfcElementTypeImpl();
		return ourIfcElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurIfcRelDefinesByType createOurIfcRelDefinesByType() {
		OurIfcRelDefinesByTypeImpl ourIfcRelDefinesByType = new OurIfcRelDefinesByTypeImpl();
		return ourIfcRelDefinesByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurPartialIFCPackage getOurPartialIFCPackage() {
		return (OurPartialIFCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OurPartialIFCPackage getPackage() {
		return OurPartialIFCPackage.eINSTANCE;
	}

} //OurPartialIFCFactoryImpl
