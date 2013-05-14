package m2m

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class ExportFileName implements IWorkflowComponent {
	
	private String exportFileNameslot = "random" 
	
	def setexportFileNameslot(String slotname){
 		this.exportFileNameslot = slotname;
	} 
	

	override invoke(IWorkflowContext ctx) {

		ctx.put(exportFileNameslot,"/Users/RickMarker/Documents/ProjectWithM2M/M2M/output.ifc")
		
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}