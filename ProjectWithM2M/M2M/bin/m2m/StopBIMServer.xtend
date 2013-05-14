package m2m

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.BimServer

class StopBIMServer implements IWorkflowComponent {
	
	private String BIMServerSlot;

	def setbimServerslot(String slotname){
 		this.BIMServerSlot = slotname;
	}
	

	override invoke(IWorkflowContext ctx) {
		var bimServer = ctx.get(BIMServerSlot) as BimServer
		bimServer.stop()
		
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}