package m2m

import java.io.File
import java.util.Collection
import org.bimserver.BimServer
import org.bimserver.ifc.IfcModel
import org.bimserver.plugins.PluginConfiguration
import org.bimserver.plugins.serializers.Serializer
import org.bimserver.plugins.serializers.SerializerPlugin
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class WriteData implements IWorkflowComponent {
	
	private String exportFileNameslot
	private String BIMServerSlot;
	private String dataSlot

	def setbimServerslot(String slotname){
 		this.BIMServerSlot = slotname;
	}
	
	def setexportFileNameslot(String slotname){
 		this.exportFileNameslot = slotname;
	}
	
	def setdataSlot(String slotname){
 		this.dataSlot = slotname;
	}

	override invoke(IWorkflowContext ctx) {
		
		var filename  		  = ctx.get(exportFileNameslot) as String
		var data			  = ctx.get(dataSlot)			as IfcModel
		var bimServer		  = ctx.get(BIMServerSlot)		as BimServer
		var serializerPlugins = bimServer.pluginManager.getAllSerializerPlugins(true) as Collection<SerializerPlugin>
		var serializer		  = null as Serializer
		
		for(serializerPlugin : serializerPlugins){
			if (serializerPlugin.defaultName == "Ifc2x3"){
				serializer = serializerPlugin.createSerializer(new PluginConfiguration())
			}
		}
		
		data.resetExpressIds()
		//data.generateMinimalExpressIds()
		
		serializer.init(data,null,bimServer.pluginManager,null,true)
		serializer.writeToFile(new File(filename))
			
		
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}