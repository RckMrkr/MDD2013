package OurPartialIFC.OCL;

import OurPartialIFC.*;
import OurPartialIFC.impl.OurPartialIFCFactoryImpl;


public class validatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OurPartialIFCFactory factory = new OurPartialIFCFactoryImpl();
		
		OCLValidation val = new OCLValidation();
		
		OurIFC ifc = factory.createOurIFC();
		
		System.out.println("Testing for unique name");
		System.out.println("Expecting: false,false,true,true");
		
		OurIfcMaterial material1 = factory.createOurIfcMaterial();
		material1.setName("Hej");
		ifc.getMaterials().add(material1);
				
		OurIfcMaterial material2 = factory.createOurIfcMaterial();
		material2.setName("Hej");
		ifc.getMaterials().add(material2);

		
		OurIfcMaterial material3 = factory.createOurIfcMaterial();
		material3.setName("thata");
		ifc.getMaterials().add(material3);

		
		OurIfcMaterial material4 = factory.createOurIfcMaterial();
		material4.setName("lolo");
		ifc.getMaterials().add(material4);

		System.out.println(val.materialNameIsUnique(material1));
		System.out.println(val.materialNameIsUnique(material2));
		System.out.println(val.materialNameIsUnique(material3));
		System.out.println(val.materialNameIsUnique(material4));		
	
		System.out.println("Done testing unique name");
		
		// Unique materials done
		
		// Checking associations
		System.out.println("Testing material associations");
		System.out.println("Expecting: false,false,false,true,true,false");
		
		OurIfcRelAssociatesMaterial association1 = factory.createOurIfcRelAssociatesMaterial();
		OurIfcRelAssociatesMaterial association2 = factory.createOurIfcRelAssociatesMaterial();
		OurIfcRelAssociatesMaterial association3 = factory.createOurIfcRelAssociatesMaterial();
		OurIfcRelAssociatesMaterial association4 = factory.createOurIfcRelAssociatesMaterial();
		
		OurIfcElement element1 = factory.createOurIfcElement();
		OurIfcElement element2 = factory.createOurIfcElement();
		OurIfcElement element3 = factory.createOurIfcElement();
		OurIfcElement element4 = factory.createOurIfcElement();
		OurIfcElement element5 = factory.createOurIfcElement();
		OurIfcElement element6 = factory.createOurIfcElement();
		
		association3.getRelatedElements().add(element4);
		association4.getRelatedElements().add(element5);
		
		ifc.getElements().add(element1);
		ifc.getElements().add(element2);
		ifc.getElements().add(element3);
		ifc.getElements().add(element4);
		ifc.getElements().add(element5);
		ifc.getElements().add(element6);
		
		ifc.getMaterialAssociation().add(association1);
		ifc.getMaterialAssociation().add(association2);
		ifc.getMaterialAssociation().add(association3);
		ifc.getMaterialAssociation().add(association4);
		
		
		
		 System.out.println(val.elementHasAssociation(element1));
		 System.out.println(val.elementHasAssociation(element2));
		 System.out.println(val.elementHasAssociation(element3));
		 System.out.println(val.elementHasAssociation(element4));
		 System.out.println(val.elementHasAssociation(element5));
		 System.out.println(val.elementHasAssociation(element6));
		
		System.out.println("Done testing materialassociation");

		// Materialassociation done
		
		// Checking typeassociation
		System.out.println("Testing material associations");
		System.out.println("Expecting: true,true,false,true,true,false");
		
		OurIfcRelDefinesByType relation1 = factory.createOurIfcRelDefinesByType();
		OurIfcRelDefinesByType relation2 = factory.createOurIfcRelDefinesByType();
		
		OurIfcElementType elementType1 = factory.createOurIfcElementType();
		OurIfcElementType elementType2 = factory.createOurIfcElementType();
		OurIfcElementType elementType3 = factory.createOurIfcElementType();
		
		relation1.setElementType(elementType1);
		relation2.setElementType(elementType2);
		
		relation1.getDefinedElements().add(element1);
		relation1.getDefinedElements().add(element2);
		relation2.getDefinedElements().add(element6);
		
		OurIfcRelAssociatesMaterial association5 = factory.createOurIfcRelAssociatesMaterial();
		association5.getRelatedElements().add(elementType1);
		association5.getRelatedElements().add(elementType3);
		
		ifc.getElementtypes().add(elementType1);
		ifc.getElementtypes().add(elementType2);
		
		ifc.getTypedefinitions().add(relation1);
		ifc.getTypedefinitions().add(relation2);
		
		ifc.getMaterialAssociation().add(association5);

		System.out.println(val.elementHasAssociation(element1));
		System.out.println(val.elementHasAssociation(element2));
		System.out.println(val.elementHasAssociation(element3));
		System.out.println(val.elementHasAssociation(element4));
		System.out.println(val.elementHasAssociation(element5));
		System.out.println(val.elementHasAssociation(element6));	
	}
}
