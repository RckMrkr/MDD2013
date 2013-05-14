/**
 */
package OurPartialIFC.util;

import OurPartialIFC.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see OurPartialIFC.OurPartialIFCPackage
 * @generated
 */
public class OurPartialIFCSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OurPartialIFCPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurPartialIFCSwitch() {
		if (modelPackage == null) {
			modelPackage = OurPartialIFCPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OurPartialIFCPackage.OUR_IFC: {
				OurIFC ourIFC = (OurIFC)theEObject;
				T result = caseOurIFC(ourIFC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_REL_ASSOCIATES_MATERIAL: {
				OurIfcRelAssociatesMaterial ourIfcRelAssociatesMaterial = (OurIfcRelAssociatesMaterial)theEObject;
				T result = caseOurIfcRelAssociatesMaterial(ourIfcRelAssociatesMaterial);
				if (result == null) result = caseIdentifiable(ourIfcRelAssociatesMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_SELECT: {
				OurIfcMaterialSelect ourIfcMaterialSelect = (OurIfcMaterialSelect)theEObject;
				T result = caseOurIfcMaterialSelect(ourIfcMaterialSelect);
				if (result == null) result = caseIdentifiable(ourIfcMaterialSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_ELEMENT: {
				OurIfcElement ourIfcElement = (OurIfcElement)theEObject;
				T result = caseOurIfcElement(ourIfcElement);
				if (result == null) result = caseOurIfcRoot(ourIfcElement);
				if (result == null) result = caseIdentifiable(ourIfcElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_ELEMENT_TYPE: {
				OurIfcElementType ourIfcElementType = (OurIfcElementType)theEObject;
				T result = caseOurIfcElementType(ourIfcElementType);
				if (result == null) result = caseOurIfcRoot(ourIfcElementType);
				if (result == null) result = caseIdentifiable(ourIfcElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_ROOT: {
				OurIfcRoot ourIfcRoot = (OurIfcRoot)theEObject;
				T result = caseOurIfcRoot(ourIfcRoot);
				if (result == null) result = caseIdentifiable(ourIfcRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_REL_DEFINES_BY_TYPE: {
				OurIfcRelDefinesByType ourIfcRelDefinesByType = (OurIfcRelDefinesByType)theEObject;
				T result = caseOurIfcRelDefinesByType(ourIfcRelDefinesByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_MATERIAL: {
				OurIfcMaterial ourIfcMaterial = (OurIfcMaterial)theEObject;
				T result = caseOurIfcMaterial(ourIfcMaterial);
				if (result == null) result = caseOurIfcMaterialSelect(ourIfcMaterial);
				if (result == null) result = caseIdentifiable(ourIfcMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LAYER: {
				OurIfcMaterialLayer ourIfcMaterialLayer = (OurIfcMaterialLayer)theEObject;
				T result = caseOurIfcMaterialLayer(ourIfcMaterialLayer);
				if (result == null) result = caseOurIfcMaterialSelect(ourIfcMaterialLayer);
				if (result == null) result = caseIdentifiable(ourIfcMaterialLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LIST: {
				OurIfcMaterialList ourIfcMaterialList = (OurIfcMaterialList)theEObject;
				T result = caseOurIfcMaterialList(ourIfcMaterialList);
				if (result == null) result = caseOurIfcMaterialSelect(ourIfcMaterialList);
				if (result == null) result = caseIdentifiable(ourIfcMaterialList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LAYER_SET: {
				OurIfcMaterialLayerSet ourIfcMaterialLayerSet = (OurIfcMaterialLayerSet)theEObject;
				T result = caseOurIfcMaterialLayerSet(ourIfcMaterialLayerSet);
				if (result == null) result = caseOurIfcMaterialSelect(ourIfcMaterialLayerSet);
				if (result == null) result = caseIdentifiable(ourIfcMaterialLayerSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OurPartialIFCPackage.OUR_IFC_MATERIAL_LAYER_SET_USAGE: {
				OurIfcMaterialLayerSetUsage ourIfcMaterialLayerSetUsage = (OurIfcMaterialLayerSetUsage)theEObject;
				T result = caseOurIfcMaterialLayerSetUsage(ourIfcMaterialLayerSetUsage);
				if (result == null) result = caseOurIfcMaterialSelect(ourIfcMaterialLayerSetUsage);
				if (result == null) result = caseIdentifiable(ourIfcMaterialLayerSetUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our IFC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our IFC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIFC(OurIFC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Rel Associates Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Rel Associates Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcRelAssociatesMaterial(OurIfcRelAssociatesMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Material Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Material Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcMaterialSelect(OurIfcMaterialSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcMaterial(OurIfcMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Material Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Material Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcMaterialLayer(OurIfcMaterialLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Material List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Material List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcMaterialList(OurIfcMaterialList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Material Layer Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Material Layer Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcMaterialLayerSet(OurIfcMaterialLayerSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Material Layer Set Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Material Layer Set Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcMaterialLayerSetUsage(OurIfcMaterialLayerSetUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcElement(OurIfcElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcElementType(OurIfcElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcRoot(OurIfcRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Our Ifc Rel Defines By Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Our Ifc Rel Defines By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOurIfcRelDefinesByType(OurIfcRelDefinesByType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OurPartialIFCSwitch
