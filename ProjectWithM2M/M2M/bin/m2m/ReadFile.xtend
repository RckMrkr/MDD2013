package m2m

import java.io.File
import nl.tue.buildingsmart.emf.SchemaLoader
import org.bimserver.BimServer
import org.bimserver.plugins.PluginConfiguration
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class ReadFile implements IWorkflowComponent {
	
	private String importedFileNameSlot = "random"
	private String dataSlot			    = "random"
	private String BIMServerSlot;

	def setbimServerslot(String slotname){
 		this.BIMServerSlot = slotname;
	}
	
	def setimportedFileNameSlot(String filenameslot){
 		this.importedFileNameSlot = filenameslot;
	} 
	
	def setdataSlot(String dataSlot){
 		this.dataSlot = dataSlot;
	}
	
	override invoke(IWorkflowContext ctx) {
		
		var filename		   = ctx.get(importedFileNameSlot) as String
		var bimServer		   = ctx.get(BIMServerSlot) as BimServer
		var deserializerPlugin = bimServer.pluginManager.getFirstDeserializer("ifc",true)
		
		deserializerPlugin.init(bimServer.pluginManager)
		
		var deserializer = deserializerPlugin.createDeserializer(new PluginConfiguration())
		
		deserializer.init(SchemaLoader::loadDefaultSchema)
		
		var data = deserializer.read(new File(filename))
		
		//data.fixOids();
		data.fixOidCounter();
		
		ctx.put(dataSlot,data)
		
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}