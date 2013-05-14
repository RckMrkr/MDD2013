package m2m

import OurPartialIFC.OurIFC
import OurPartialIFC.OurIfcElement
import OurPartialIFC.OurIfcElementType
import OurPartialIFC.OurIfcMaterial
import OurPartialIFC.OurIfcMaterialLayer
import OurPartialIFC.OurIfcMaterialLayerSet
import OurPartialIFC.OurIfcMaterialLayerSetUsage
import OurPartialIFC.OurIfcMaterialList
import OurPartialIFC.OurIfcRelAssociatesMaterial
import model.GuidCompressor
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package
import org.bimserver.models.ifc2x3tc1.IfcElement
import org.bimserver.models.ifc2x3tc1.IfcElementType
import org.bimserver.models.ifc2x3tc1.IfcMaterial
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayer
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSet
import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSetUsage
import org.bimserver.models.ifc2x3tc1.IfcMaterialList
import org.bimserver.models.ifc2x3tc1.IfcMaterialSelect
import org.bimserver.models.ifc2x3tc1.IfcOwnerHistory
import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesMaterial
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class PopulateBIMServerModel implements IWorkflowComponent {
	
	private String				   ifcDataSlot		  = "random"
	private String				   partialIFCDataSlot = "random"
	private final Ifc2x3tc1Package ifcPackage		  = Ifc2x3tc1Package::eINSTANCE
	private IfcModel		ifcModel
	private IfcOwnerHistory	ownerHistory
	private OurIFC partialIFCModel
	
	def setifcDataSlot(String slotname){
 		this.ifcDataSlot = slotname;
	}
	
	def setpartialIFCDataSlot(String slotname){
 		this.partialIFCDataSlot = slotname;
	}
	
	override invoke(IWorkflowContext ctx) {

		ifcModel		= ctx.get(ifcDataSlot)		  as IfcModel
		
		partialIFCModel	= ctx.get(partialIFCDataSlot) as OurIFC
		ownerHistory	= ifcModel.getAll(ifcPackage.ifcOwnerHistory).get(0) as IfcOwnerHistory
		
		for (relation : partialIFCModel.materialAssociation){
			if (relation.ID == 0)
				addRelation(relation,null)
		}
		
	}
	
	def private addRelation(OurIfcRelAssociatesMaterial relation, IfcMaterialSelect materialInput){
		var material = materialInput
		var factory = Ifc2x3tc1FactoryImpl::eINSTANCE
		var newRelation = ifcModel.create(factory.createIfcRelAssociatesMaterial.eClass) as IfcRelAssociatesMaterial
		relation.setID(-1)
		//var newRelation	  = factory.createIfcRelAssociatesMaterial
		
		newRelation.setGlobalId(GuidCompressor::newIfcGloballyUniqueId)
		newRelation.setOwnerHistory(ownerHistory)
		
		if (material == null){
			if (relation.material.ID == 0) // Then it's new, and then it's a material (We kind of materialselects we create)
				material = addMaterial(relation.material as OurIfcMaterial)
			else
				material = findMaterial(relation.material)
		}
		newRelation.setRelatingMaterial(material)
		
		// Finds all the related objects and adds them to a list
		for (element : relation.relatedElements){
			newRelation.relatedObjects.add(findElement(element));
		}
	}
	
	def private IfcMaterial addMaterial(OurIfcMaterial inputMaterial){
		var factory = Ifc2x3tc1FactoryImpl::eINSTANCE
		var newMaterial = ifcModel.create(factory.createIfcMaterial.eClass) as IfcMaterial
		//var newMaterial	  = factory.createIfcMaterial
		
		for (relation : partialIFCModel.materialAssociation.filter[it.material == inputMaterial && it.ID != -1])
			addRelation(relation,newMaterial)
		newMaterial.setName(inputMaterial.name)
		
		return newMaterial
	}
	
	def private dispatch findElement(OurIfcElement element){
		return ifcModel.getAllWithSubTypes(typeof(IfcElement)).findFirst[it.expressId == element.ID]
	}
	
	def private dispatch findElement(OurIfcElementType element){
		return ifcModel.getAllWithSubTypes(typeof(IfcElementType)).findFirst[it.expressId == element.ID]
	}
	
	def private dispatch findMaterial(OurIfcMaterial material){
		return ifcModel.getAll(typeof(IfcMaterial)).findFirst[it.expressId == material.ID]
	}
	
	def private dispatch findMaterial(OurIfcMaterialList material){
		return ifcModel.getAll(typeof(IfcMaterialList)).findFirst[it.expressId == material.ID]
	}
	
	def private dispatch findMaterial(OurIfcMaterialLayer material){
		return ifcModel.getAll(typeof(IfcMaterialLayer)).findFirst[it.expressId == material.ID]
	}
	
	def private dispatch findMaterial(OurIfcMaterialLayerSet material){
		return ifcModel.getAll(typeof(IfcMaterialLayerSet)).findFirst[it.expressId == material.ID]
	}
	
	def private dispatch findMaterial(OurIfcMaterialLayerSetUsage material){
		return ifcModel.getAll(typeof(IfcMaterialLayerSetUsage)).findFirst[it.expressId == material.ID]
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}