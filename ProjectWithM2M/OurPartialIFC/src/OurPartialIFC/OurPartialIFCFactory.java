/**
 */
package OurPartialIFC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OurPartialIFC.OurPartialIFCPackage
 * @generated
 */
public interface OurPartialIFCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OurPartialIFCFactory eINSTANCE = OurPartialIFC.impl.OurPartialIFCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Our IFC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our IFC</em>'.
	 * @generated
	 */
	OurIFC createOurIFC();

	/**
	 * Returns a new object of class '<em>Our Ifc Rel Associates Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Rel Associates Material</em>'.
	 * @generated
	 */
	OurIfcRelAssociatesMaterial createOurIfcRelAssociatesMaterial();

	/**
	 * Returns a new object of class '<em>Our Ifc Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Material</em>'.
	 * @generated
	 */
	OurIfcMaterial createOurIfcMaterial();

	/**
	 * Returns a new object of class '<em>Our Ifc Material Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Material Layer</em>'.
	 * @generated
	 */
	OurIfcMaterialLayer createOurIfcMaterialLayer();

	/**
	 * Returns a new object of class '<em>Our Ifc Material List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Material List</em>'.
	 * @generated
	 */
	OurIfcMaterialList createOurIfcMaterialList();

	/**
	 * Returns a new object of class '<em>Our Ifc Material Layer Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Material Layer Set</em>'.
	 * @generated
	 */
	OurIfcMaterialLayerSet createOurIfcMaterialLayerSet();

	/**
	 * Returns a new object of class '<em>Our Ifc Material Layer Set Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Material Layer Set Usage</em>'.
	 * @generated
	 */
	OurIfcMaterialLayerSetUsage createOurIfcMaterialLayerSetUsage();

	/**
	 * Returns a new object of class '<em>Our Ifc Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Element</em>'.
	 * @generated
	 */
	OurIfcElement createOurIfcElement();

	/**
	 * Returns a new object of class '<em>Our Ifc Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Element Type</em>'.
	 * @generated
	 */
	OurIfcElementType createOurIfcElementType();

	/**
	 * Returns a new object of class '<em>Our Ifc Rel Defines By Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Our Ifc Rel Defines By Type</em>'.
	 * @generated
	 */
	OurIfcRelDefinesByType createOurIfcRelDefinesByType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OurPartialIFCPackage getOurPartialIFCPackage();

} //OurPartialIFCFactory
