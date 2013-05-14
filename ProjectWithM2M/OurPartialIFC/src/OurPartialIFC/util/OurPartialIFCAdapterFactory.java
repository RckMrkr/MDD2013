/**
 */
package OurPartialIFC.util;

import OurPartialIFC.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see OurPartialIFC.OurPartialIFCPackage
 * @generated
 */
public class OurPartialIFCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OurPartialIFCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurPartialIFCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OurPartialIFCPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OurPartialIFCSwitch<Adapter> modelSwitch =
		new OurPartialIFCSwitch<Adapter>() {
			@Override
			public Adapter caseOurIFC(OurIFC object) {
				return createOurIFCAdapter();
			}
			@Override
			public Adapter caseOurIfcRelAssociatesMaterial(OurIfcRelAssociatesMaterial object) {
				return createOurIfcRelAssociatesMaterialAdapter();
			}
			@Override
			public Adapter caseOurIfcMaterialSelect(OurIfcMaterialSelect object) {
				return createOurIfcMaterialSelectAdapter();
			}
			@Override
			public Adapter caseOurIfcElement(OurIfcElement object) {
				return createOurIfcElementAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseOurIfcElementType(OurIfcElementType object) {
				return createOurIfcElementTypeAdapter();
			}
			@Override
			public Adapter caseOurIfcRoot(OurIfcRoot object) {
				return createOurIfcRootAdapter();
			}
			@Override
			public Adapter caseOurIfcRelDefinesByType(OurIfcRelDefinesByType object) {
				return createOurIfcRelDefinesByTypeAdapter();
			}
			@Override
			public Adapter caseOurIfcMaterial(OurIfcMaterial object) {
				return createOurIfcMaterialAdapter();
			}
			@Override
			public Adapter caseOurIfcMaterialLayer(OurIfcMaterialLayer object) {
				return createOurIfcMaterialLayerAdapter();
			}
			@Override
			public Adapter caseOurIfcMaterialList(OurIfcMaterialList object) {
				return createOurIfcMaterialListAdapter();
			}
			@Override
			public Adapter caseOurIfcMaterialLayerSet(OurIfcMaterialLayerSet object) {
				return createOurIfcMaterialLayerSetAdapter();
			}
			@Override
			public Adapter caseOurIfcMaterialLayerSetUsage(OurIfcMaterialLayerSetUsage object) {
				return createOurIfcMaterialLayerSetUsageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIFC <em>Our IFC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIFC
	 * @generated
	 */
	public Adapter createOurIFCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcRelAssociatesMaterial <em>Our Ifc Rel Associates Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcRelAssociatesMaterial
	 * @generated
	 */
	public Adapter createOurIfcRelAssociatesMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcMaterialSelect <em>Our Ifc Material Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcMaterialSelect
	 * @generated
	 */
	public Adapter createOurIfcMaterialSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcMaterial <em>Our Ifc Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcMaterial
	 * @generated
	 */
	public Adapter createOurIfcMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcMaterialLayer <em>Our Ifc Material Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcMaterialLayer
	 * @generated
	 */
	public Adapter createOurIfcMaterialLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcMaterialList <em>Our Ifc Material List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcMaterialList
	 * @generated
	 */
	public Adapter createOurIfcMaterialListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcMaterialLayerSet <em>Our Ifc Material Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcMaterialLayerSet
	 * @generated
	 */
	public Adapter createOurIfcMaterialLayerSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcMaterialLayerSetUsage <em>Our Ifc Material Layer Set Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcMaterialLayerSetUsage
	 * @generated
	 */
	public Adapter createOurIfcMaterialLayerSetUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcElement <em>Our Ifc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcElement
	 * @generated
	 */
	public Adapter createOurIfcElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcElementType <em>Our Ifc Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcElementType
	 * @generated
	 */
	public Adapter createOurIfcElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcRoot <em>Our Ifc Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcRoot
	 * @generated
	 */
	public Adapter createOurIfcRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OurPartialIFC.OurIfcRelDefinesByType <em>Our Ifc Rel Defines By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OurPartialIFC.OurIfcRelDefinesByType
	 * @generated
	 */
	public Adapter createOurIfcRelDefinesByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OurPartialIFCAdapterFactory
