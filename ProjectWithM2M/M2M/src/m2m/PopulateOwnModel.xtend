package m2m

import OurPartialIFC.impl.OurPartialIFCFactoryImpl
import java.util.List
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.IfcElement
import org.bimserver.models.ifc2x3tc1.IfcElementType
import org.bimserver.models.ifc2x3tc1.IfcMaterial
import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesMaterial
import org.bimserver.models.ifc2x3tc1.IfcRelDefinesByType
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.models.ifc2x3tc1.IfcMaterialSelect
import org.bimserver.models.ifc2x3tc1.IfcMaterialList
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayer
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSet
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage
import OurPartialIFC.OurIFC

class PopulateOwnModel implements IWorkflowComponent {
	
	private String newDataModelSlot				  = "random"
	private String dataSlot						  = "random"
	private OurPartialIFCFactoryImpl modelFactory = new OurPartialIFCFactoryImpl()
	private OurIFC ifc
	
	def setnewDataModelSlot(String filenameslot){
 		this.newDataModelSlot = filenameslot;
	} 
	
	def setimportedDataSlot(String dataSlot){
 		this.dataSlot = dataSlot;
	}

	override invoke(IWorkflowContext ctx) {
		
		var importedData = ctx.get(dataSlot)		 as IfcModel
		
		var elements	 = importedData.getAllWithSubTypes(typeof(IfcElement)) as List<IfcElement>
		var elementtypes = importedData.getAllWithSubTypes(typeof(IfcElementType)) as List<IfcElementType>
		var materials	 = importedData.getAllWithSubTypes(typeof(IfcMaterialSelect)) as List<IfcMaterialSelect>
		var relations	 = importedData.getAll(typeof(IfcRelAssociatesMaterial)) as List<IfcRelAssociatesMaterial>
		var typedefs	 = importedData.getAll(typeof(IfcRelDefinesByType)) as List<IfcRelDefinesByType>
		
		ifc = modelFactory.createOurIFC()

		println("Begynder med elementer! - " + elements.size())
		
		for (BIMElement : elements){
			var ourElement = modelFactory.createOurIfcElement()
			ourElement.setID(BIMElement.expressId)
			ourElement.setDescription(BIMElement.name)
			ourElement.setType(BIMElement.eClass.name)
			ifc.elements.add(ourElement)
		}
		println("Done med elementer!")
		println("Begynder med elementtyper! - " + elementtypes.size())
		
		for (BIMElementType : elementtypes){
			var ourElementType = modelFactory.createOurIfcElementType()
			ourElementType.setID(BIMElementType.expressId)
			ifc.elementtypes.add(ourElementType)
		}
		println("Done med elementtyper!")
		println("Begynder med materialer! - " + materials.size())
		
		for (BIMmaterial : materials){
			addMaterial(BIMmaterial)
		}

		println("Done med materialer!")
		println("Begynder med materialerelationer! - " + relations.size())
		
		for (BIMrelation : relations){
			
			var ourRelation = modelFactory.createOurIfcRelAssociatesMaterial()
			ourRelation.setID(BIMrelation.expressId)
			ourRelation.setMaterial(findMaterial(BIMrelation.relatingMaterial))
			
			for (relatedObject : BIMrelation.relatedObjects){
				switch relatedObject{
					IfcElement:
						ourRelation.relatedElements.add(ifc.elements.findFirst([it.ID == relatedObject.expressId]))
					IfcElementType:
						ourRelation.relatedElements.add(ifc.elementtypes.findFirst([it.ID == relatedObject.expressId]))
				}
			}
			ifc.materialAssociation.add(ourRelation)
		}
		
		println("Done med materialerelationer!")
		println("Begynder med typerelationer! - " + typedefs.size())
		
		for (BIMtypedef : typedefs){
			
			var ourTypedef = modelFactory.createOurIfcRelDefinesByType()

			
			ourTypedef.setElementType(ifc.elementtypes.findFirst([it.ID == BIMtypedef.relatingType.expressId]))
			
			for (relatedType : BIMtypedef.relatedObjects){
				ourTypedef.definedElements.add(ifc.elements.findFirst([it.ID == relatedType.expressId]))
			}
			
			if (ourTypedef.definedElements.size() != 0)
				ifc.typedefinitions.add(ourTypedef)
		}
		
		println("Done med typerelationer!")
		
		ctx.put(newDataModelSlot,ifc)	
	}
	
	def private dispatch findMaterial(IfcMaterial material){
		return ifc.materials.findFirst([it.ID == material.expressId])
	}
	
	def private dispatch findMaterial(IfcMaterialList material){
		return ifc.materialLists.findFirst([it.ID == material.expressId])
	}
	
	def private dispatch findMaterial(IfcMaterialLayer material){
		return ifc.materialLayers.findFirst([it.ID == material.expressId])
	}
	
	def private dispatch findMaterial(IfcMaterialLayerSet material){
		return ifc.materialLayerSet.findFirst([it.ID == material.expressId])
	}
	
	def private dispatch findMaterial(IfcMaterialLayerSetUsage material){
		return ifc.materialLayerSetUsage.findFirst([it.ID == material.expressId])
	}
	
	
	def private dispatch addMaterial(IfcMaterial material){
		var ourMaterial = modelFactory.createOurIfcMaterial()
		ourMaterial.setID(material.expressId);
		ourMaterial.setName(material.name)
		ifc.materials.add(ourMaterial)
	}
	
	def private dispatch addMaterial(IfcMaterialList material){
		var ourMaterial = modelFactory.createOurIfcMaterialList()
		ourMaterial.setID(material.expressId);
		ifc.materialLists.add(ourMaterial)
	}
	
	def private dispatch addMaterial(IfcMaterialLayer material){
		var ourMaterial = modelFactory.createOurIfcMaterialLayer()
		ourMaterial.setID(material.expressId);
		ifc.materialLayers.add(ourMaterial)
	}
	
	def private dispatch addMaterial(IfcMaterialLayerSet material){
		var ourMaterial = modelFactory.createOurIfcMaterialLayerSet()
		ourMaterial.setID(material.expressId);
		ifc.materialLayerSet.add(ourMaterial)
	}
	
	def private dispatch addMaterial(IfcMaterialLayerSetUsage material){
		var ourMaterial = modelFactory.createOurIfcMaterialLayerSetUsage()
		ourMaterial.setID(material.expressId);
		ifc.materialLayerSetUsage.add(ourMaterial)
	}
	
	override postInvoke() {
		
	}
	
	override preInvoke() {
		
	}
	
}