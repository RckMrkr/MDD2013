package m2m;

import java.io.File;
import org.bimserver.BimServer;
import org.bimserver.BimServerConfig;
import org.bimserver.plugins.PluginManager;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SetupBIMServer implements IWorkflowComponent {
  private String BIMServerSlot;
  
  public String setbimServerslot(final String slotname) {
    String _BIMServerSlot = this.BIMServerSlot = slotname;
    return _BIMServerSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    try {
      BimServerConfig _bimServerConfig = new BimServerConfig();
      BimServerConfig serverConfig = _bimServerConfig;
      File _file = new File("home");
      serverConfig.setHomeDir(_file);
      LocalDevelopmentResourceFetcher _localDevelopmentResourceFetcher = new LocalDevelopmentResourceFetcher();
      LocalDevelopmentResourceFetcher resourceFetcher = _localDevelopmentResourceFetcher;
      File _file_1 = new File("home");
      resourceFetcher.addPath(_file_1);
      serverConfig.setResourceFetcher(resourceFetcher);
      serverConfig.setStartEmbeddedWebServer(true);
      serverConfig.setLocalDev(true);
      BimServer _bimServer = new BimServer(serverConfig);
      BimServer bimServer = _bimServer;
      PluginManager _pluginManager = bimServer.getPluginManager();
      File _file_2 = new File("../IfcPlugins");
      _pluginManager.loadPluginsFromEclipseProject(_file_2);
      PluginManager _pluginManager_1 = bimServer.getPluginManager();
      File _file_3 = new File("../buildingSMARTLibrary");
      _pluginManager_1.loadPluginsFromEclipseProject(_file_3);
      bimServer.start();
      ctx.put(this.BIMServerSlot, bimServer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
