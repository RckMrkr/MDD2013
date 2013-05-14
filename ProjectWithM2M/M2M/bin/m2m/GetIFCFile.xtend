package m2m

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

public class GetIFCFile implements IWorkflowComponent {

	private String importedFileNameSlot = "random";
	
	def setimportedFileNameSlot(String fileNameSlot){
 		this.importedFileNameSlot = fileNameSlot;
	}
	
	override invoke(IWorkflowContext ctx) {
		
		// Ask in nice GUI way of the filename
		
		//var filename = "/Users/RickMarker/Documents/MDDProject/ifc/src/basic house.ifc"
		//var filename = "/Users/RickMarker/Documents/ProjectWithM2M/M2M/IFCTest/Template.ifc"
		//var filename = "/Users/RickMarker/Documents/ProjectWithM2M/M2M/IFCTest/Simple4.ifc"
		var filename = "/Users/RickMarker/Documents/ProjectWithM2M/M2M/IFCTest/Complete model.ifc"
		ctx.put(importedFileNameSlot,filename)
		
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
}