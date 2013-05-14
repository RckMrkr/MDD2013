/**
 */
package OurPartialIFC.impl;

import OurPartialIFC.Identifiable;
import OurPartialIFC.OurIFC;
import OurPartialIFC.OurIfcElement;
import OurPartialIFC.OurIfcElementType;
import OurPartialIFC.OurIfcMaterial;
import OurPartialIFC.OurIfcMaterialLayer;
import OurPartialIFC.OurIfcMaterialLayerSet;
import OurPartialIFC.OurIfcMaterialLayerSetUsage;
import OurPartialIFC.OurIfcMaterialList;
import OurPartialIFC.OurIfcMaterialSelect;
import OurPartialIFC.OurIfcRelAssociatesMaterial;
import OurPartialIFC.OurIfcRelDefinesByType;
import OurPartialIFC.OurIfcRoot;
import OurPartialIFC.OurPartialIFCFactory;
import OurPartialIFC.OurPartialIFCPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OurPartialIFCPackageImpl extends EPackageImpl implements OurPartialIFCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIFCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcRelAssociatesMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcMaterialSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcMaterialLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcMaterialListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcMaterialLayerSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcMaterialLayerSetUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ourIfcRelDefinesByTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see OurPartialIFC.OurPartialIFCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OurPartialIFCPackageImpl() {
		super(eNS_URI, OurPartialIFCFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OurPartialIFCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OurPartialIFCPackage init() {
		if (isInited) return (OurPartialIFCPackage)EPackage.Registry.INSTANCE.getEPackage(OurPartialIFCPackage.eNS_URI);

		// Obtain or create and register package
		OurPartialIFCPackageImpl theOurPartialIFCPackage = (OurPartialIFCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OurPartialIFCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OurPartialIFCPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOurPartialIFCPackage.createPackageContents();

		// Initialize created meta-data
		theOurPartialIFCPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOurPartialIFCPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OurPartialIFCPackage.eNS_URI, theOurPartialIFCPackage);
		return theOurPartialIFCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIFC() {
		return ourIFCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_Materials() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_MaterialLists() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_MaterialLayers() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_MaterialLayerSet() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_MaterialLayerSetUsage() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_MaterialAssociation() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_Typedefinitions() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_Elementtypes() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIFC_Elements() {
		return (EReference)ourIFCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcRelAssociatesMaterial() {
		return ourIfcRelAssociatesMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIfcRelAssociatesMaterial_RelatedElements() {
		return (EReference)ourIfcRelAssociatesMaterialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIfcRelAssociatesMaterial_Material() {
		return (EReference)ourIfcRelAssociatesMaterialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcMaterialSelect() {
		return ourIfcMaterialSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcMaterial() {
		return ourIfcMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOurIfcMaterial_Name() {
		return (EAttribute)ourIfcMaterialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcMaterialLayer() {
		return ourIfcMaterialLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcMaterialList() {
		return ourIfcMaterialListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcMaterialLayerSet() {
		return ourIfcMaterialLayerSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcMaterialLayerSetUsage() {
		return ourIfcMaterialLayerSetUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcElement() {
		return ourIfcElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOurIfcElement_Description() {
		return (EAttribute)ourIfcElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOurIfcElement_Type() {
		return (EAttribute)ourIfcElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_ID() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcElementType() {
		return ourIfcElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcRoot() {
		return ourIfcRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOurIfcRelDefinesByType() {
		return ourIfcRelDefinesByTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIfcRelDefinesByType_ElementType() {
		return (EReference)ourIfcRelDefinesByTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOurIfcRelDefinesByType_DefinedElements() {
		return (EReference)ourIfcRelDefinesByTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OurPartialIFCFactory getOurPartialIFCFactory() {
		return (OurPartialIFCFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ourIFCEClass = createEClass(OUR_IFC);
		createEReference(ourIFCEClass, OUR_IFC__MATERIAL_ASSOCIATION);
		createEReference(ourIFCEClass, OUR_IFC__TYPEDEFINITIONS);
		createEReference(ourIFCEClass, OUR_IFC__ELEMENTTYPES);
		createEReference(ourIFCEClass, OUR_IFC__ELEMENTS);
		createEReference(ourIFCEClass, OUR_IFC__MATERIALS);
		createEReference(ourIFCEClass, OUR_IFC__MATERIAL_LISTS);
		createEReference(ourIFCEClass, OUR_IFC__MATERIAL_LAYERS);
		createEReference(ourIFCEClass, OUR_IFC__MATERIAL_LAYER_SET);
		createEReference(ourIFCEClass, OUR_IFC__MATERIAL_LAYER_SET_USAGE);

		ourIfcRelAssociatesMaterialEClass = createEClass(OUR_IFC_REL_ASSOCIATES_MATERIAL);
		createEReference(ourIfcRelAssociatesMaterialEClass, OUR_IFC_REL_ASSOCIATES_MATERIAL__RELATED_ELEMENTS);
		createEReference(ourIfcRelAssociatesMaterialEClass, OUR_IFC_REL_ASSOCIATES_MATERIAL__MATERIAL);

		ourIfcMaterialSelectEClass = createEClass(OUR_IFC_MATERIAL_SELECT);

		ourIfcElementEClass = createEClass(OUR_IFC_ELEMENT);
		createEAttribute(ourIfcElementEClass, OUR_IFC_ELEMENT__DESCRIPTION);
		createEAttribute(ourIfcElementEClass, OUR_IFC_ELEMENT__TYPE);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);

		ourIfcElementTypeEClass = createEClass(OUR_IFC_ELEMENT_TYPE);

		ourIfcRootEClass = createEClass(OUR_IFC_ROOT);

		ourIfcRelDefinesByTypeEClass = createEClass(OUR_IFC_REL_DEFINES_BY_TYPE);
		createEReference(ourIfcRelDefinesByTypeEClass, OUR_IFC_REL_DEFINES_BY_TYPE__ELEMENT_TYPE);
		createEReference(ourIfcRelDefinesByTypeEClass, OUR_IFC_REL_DEFINES_BY_TYPE__DEFINED_ELEMENTS);

		ourIfcMaterialEClass = createEClass(OUR_IFC_MATERIAL);
		createEAttribute(ourIfcMaterialEClass, OUR_IFC_MATERIAL__NAME);

		ourIfcMaterialLayerEClass = createEClass(OUR_IFC_MATERIAL_LAYER);

		ourIfcMaterialListEClass = createEClass(OUR_IFC_MATERIAL_LIST);

		ourIfcMaterialLayerSetEClass = createEClass(OUR_IFC_MATERIAL_LAYER_SET);

		ourIfcMaterialLayerSetUsageEClass = createEClass(OUR_IFC_MATERIAL_LAYER_SET_USAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ourIfcRelAssociatesMaterialEClass.getESuperTypes().add(this.getIdentifiable());
		ourIfcMaterialSelectEClass.getESuperTypes().add(this.getIdentifiable());
		ourIfcElementEClass.getESuperTypes().add(this.getOurIfcRoot());
		ourIfcElementTypeEClass.getESuperTypes().add(this.getOurIfcRoot());
		ourIfcRootEClass.getESuperTypes().add(this.getIdentifiable());
		ourIfcMaterialEClass.getESuperTypes().add(this.getOurIfcMaterialSelect());
		ourIfcMaterialLayerEClass.getESuperTypes().add(this.getOurIfcMaterialSelect());
		ourIfcMaterialListEClass.getESuperTypes().add(this.getOurIfcMaterialSelect());
		ourIfcMaterialLayerSetEClass.getESuperTypes().add(this.getOurIfcMaterialSelect());
		ourIfcMaterialLayerSetUsageEClass.getESuperTypes().add(this.getOurIfcMaterialSelect());

		// Initialize classes, features, and operations; add parameters
		initEClass(ourIFCEClass, OurIFC.class, "OurIFC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOurIFC_MaterialAssociation(), this.getOurIfcRelAssociatesMaterial(), null, "materialAssociation", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_Typedefinitions(), this.getOurIfcRelDefinesByType(), null, "typedefinitions", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_Elementtypes(), this.getOurIfcElementType(), null, "elementtypes", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_Elements(), this.getOurIfcElement(), null, "elements", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_Materials(), this.getOurIfcMaterial(), null, "materials", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_MaterialLists(), this.getOurIfcMaterialList(), null, "materialLists", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_MaterialLayers(), this.getOurIfcMaterialLayer(), null, "materialLayers", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_MaterialLayerSet(), this.getOurIfcMaterialLayerSet(), null, "materialLayerSet", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIFC_MaterialLayerSetUsage(), this.getOurIfcMaterialLayerSetUsage(), null, "materialLayerSetUsage", null, 0, -1, OurIFC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ourIfcRelAssociatesMaterialEClass, OurIfcRelAssociatesMaterial.class, "OurIfcRelAssociatesMaterial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOurIfcRelAssociatesMaterial_RelatedElements(), this.getOurIfcRoot(), null, "relatedElements", null, 1, -1, OurIfcRelAssociatesMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIfcRelAssociatesMaterial_Material(), this.getOurIfcMaterialSelect(), null, "material", null, 1, 1, OurIfcRelAssociatesMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ourIfcMaterialSelectEClass, OurIfcMaterialSelect.class, "OurIfcMaterialSelect", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ourIfcElementEClass, OurIfcElement.class, "OurIfcElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOurIfcElement_Description(), ecorePackage.getEString(), "Description", null, 0, 1, OurIfcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOurIfcElement_Type(), ecorePackage.getEString(), "Type", null, 1, 1, OurIfcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ourIfcElementTypeEClass, OurIfcElementType.class, "OurIfcElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ourIfcRootEClass, OurIfcRoot.class, "OurIfcRoot", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ourIfcRelDefinesByTypeEClass, OurIfcRelDefinesByType.class, "OurIfcRelDefinesByType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOurIfcRelDefinesByType_ElementType(), this.getOurIfcElementType(), null, "elementType", null, 1, 1, OurIfcRelDefinesByType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOurIfcRelDefinesByType_DefinedElements(), this.getOurIfcElement(), null, "definedElements", null, 1, -1, OurIfcRelDefinesByType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ourIfcMaterialEClass, OurIfcMaterial.class, "OurIfcMaterial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOurIfcMaterial_Name(), ecorePackage.getEString(), "Name", null, 1, 1, OurIfcMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ourIfcMaterialLayerEClass, OurIfcMaterialLayer.class, "OurIfcMaterialLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ourIfcMaterialListEClass, OurIfcMaterialList.class, "OurIfcMaterialList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ourIfcMaterialLayerSetEClass, OurIfcMaterialLayerSet.class, "OurIfcMaterialLayerSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ourIfcMaterialLayerSetUsageEClass, OurIfcMaterialLayerSetUsage.class, "OurIfcMaterialLayerSetUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OurPartialIFCPackageImpl
