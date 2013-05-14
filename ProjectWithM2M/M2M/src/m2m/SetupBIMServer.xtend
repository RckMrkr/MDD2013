package m2m

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.BimServer
import java.io.File
import org.bimserver.shared.LocalDevelopmentResourceFetcher
import org.bimserver.BimServerConfig

class SetupBIMServer implements IWorkflowComponent {
	
	private String BIMServerSlot;

	def setbimServerslot(String slotname){
 		this.BIMServerSlot = slotname;
	}

	override invoke(IWorkflowContext ctx) {
		
		// Serversetup taken from https://code.google.com/p/bimserver/wiki/Embedding
		var serverConfig = new BimServerConfig()
		serverConfig.setHomeDir(new File("home"))
		var resourceFetcher = new LocalDevelopmentResourceFetcher()
		resourceFetcher.addPath(new File("home")) // Makes it possible to read version.xml
		serverConfig.setResourceFetcher(resourceFetcher)
		serverConfig.setStartEmbeddedWebServer(true)
		serverConfig.setLocalDev(true)
		
		var bimServer = new BimServer(serverConfig);

		// load plugins
		bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../IfcPlugins"));
		bimServer.getPluginManager().loadPluginsFromEclipseProject(new File("../buildingSMARTLibrary"));
		
		bimServer.start()
		
		ctx.put(BIMServerSlot,bimServer)
	}
	
	override postInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	override preInvoke() {
		//throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}