package OurPartialIFC.OCL;

import org.eclipse.emf.ecore.*;
import org.eclipse.ocl.*;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.*;
import org.eclipse.ocl.helper.OCLHelper;
import OurPartialIFC.*;


public class OCLValidation {
	private OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
	
	private Constraint uniqueName;
	private Constraint missingRelation;
	
	public OCLValidation() {
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE); //creates a new instance ocl
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper(); //creates a instance of oclHelper from the ocl instance, used for setting some of the values for doing validation.
		
		
		
		// Creating unique name constraint
		
		helper.setContext(OurPartialIFCPackage.Literals.OUR_IFC_MATERIAL);
		
		try{
			uniqueName = helper.createInvariant("not OurIfcMaterial.allInstances()->exists(m : OurIfcMaterial |  m <> self and m.Name = self.Name)");
		} catch (ParserException e) {

			System.err.println(e.getLocalizedMessage());
		}
		
		// Creating element relation constraint		
		
		helper.setContext(OurPartialIFCPackage.Literals.OUR_IFC_ELEMENT);
		try {
			
		    
		    String invariantString = "OurIfcRelAssociatesMaterial.allInstances()->exists(rel : OurIfcRelAssociatesMaterial | rel.relatedElements->includes(self)) "
					   				+ "or "
					   				+ "let typerel : Set(OurIfcRelDefinesByType) = "
		    						+ "OurIfcRelDefinesByType.allInstances()->select(typedef : OurIfcRelDefinesByType | typedef.definedElements->includes(self)) "
					   				+ "in "
		    						+ "typerel->size() <> 0 and "
		    						+ "OurIfcRelAssociatesMaterial.allInstances()->exists(assoc : OurIfcRelAssociatesMaterial | assoc.relatedElements->exists(et : OurIfcRoot | typerel->exists(rel : OurIfcRelDefinesByType | rel.elementType = et) ) )";
		    
		    missingRelation = helper.createInvariant(invariantString);
		}catch (ParserException e) {
		    // record failure to parse
		    System.err.println(e.getLocalizedMessage());
		}
	}
	
	public boolean materialNameIsUnique (OurIfcMaterial material) {
		
	    return (boolean) ocl.createQuery(uniqueName).evaluate(material); //evaluates the current ocl constraint.
	}
	
	public boolean elementHasAssociation (OurIfcElement element) {

	    return (boolean) ocl.createQuery(missingRelation).evaluate(element);
	}
}
