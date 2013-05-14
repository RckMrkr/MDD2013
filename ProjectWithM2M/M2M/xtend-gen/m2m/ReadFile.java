package m2m;

import java.io.File;
import nl.tue.buildingsmart.emf.SchemaLoader;
import org.bimserver.BimServer;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.deserializers.Deserializer;
import org.bimserver.plugins.deserializers.DeserializerPlugin;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ReadFile implements IWorkflowComponent {
  private String importedFileNameSlot = "random";
  
  private String dataSlot = "random";
  
  private String BIMServerSlot;
  
  public String setbimServerslot(final String slotname) {
    String _BIMServerSlot = this.BIMServerSlot = slotname;
    return _BIMServerSlot;
  }
  
  public String setimportedFileNameSlot(final String filenameslot) {
    String _importedFileNameSlot = this.importedFileNameSlot = filenameslot;
    return _importedFileNameSlot;
  }
  
  public String setdataSlot(final String dataSlot) {
    String _dataSlot = this.dataSlot = dataSlot;
    return _dataSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    try {
      Object _get = ctx.get(this.importedFileNameSlot);
      String filename = ((String) _get);
      Object _get_1 = ctx.get(this.BIMServerSlot);
      BimServer bimServer = ((BimServer) _get_1);
      PluginManager _pluginManager = bimServer.getPluginManager();
      DeserializerPlugin deserializerPlugin = _pluginManager.getFirstDeserializer("ifc", true);
      PluginManager _pluginManager_1 = bimServer.getPluginManager();
      deserializerPlugin.init(_pluginManager_1);
      PluginConfiguration _pluginConfiguration = new PluginConfiguration();
      Deserializer deserializer = deserializerPlugin.createDeserializer(_pluginConfiguration);
      SchemaDefinition _loadDefaultSchema = SchemaLoader.loadDefaultSchema();
      deserializer.init(_loadDefaultSchema);
      File _file = new File(filename);
      IfcModelInterface data = deserializer.read(_file);
      data.fixOidCounter();
      ctx.put(this.dataSlot, data);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
