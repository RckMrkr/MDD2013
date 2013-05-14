package m2m;

import com.google.common.base.Objects;
import java.io.File;
import java.util.Collection;
import org.bimserver.BimServer;
import org.bimserver.ifc.IfcModel;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.serializers.Serializer;
import org.bimserver.plugins.serializers.SerializerPlugin;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class WriteData implements IWorkflowComponent {
  private String exportFileNameslot;
  
  private String BIMServerSlot;
  
  private String dataSlot;
  
  public String setbimServerslot(final String slotname) {
    String _BIMServerSlot = this.BIMServerSlot = slotname;
    return _BIMServerSlot;
  }
  
  public String setexportFileNameslot(final String slotname) {
    String _exportFileNameslot = this.exportFileNameslot = slotname;
    return _exportFileNameslot;
  }
  
  public String setdataSlot(final String slotname) {
    String _dataSlot = this.dataSlot = slotname;
    return _dataSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    try {
      Object _get = ctx.get(this.exportFileNameslot);
      String filename = ((String) _get);
      Object _get_1 = ctx.get(this.dataSlot);
      IfcModel data = ((IfcModel) _get_1);
      Object _get_2 = ctx.get(this.BIMServerSlot);
      BimServer bimServer = ((BimServer) _get_2);
      PluginManager _pluginManager = bimServer.getPluginManager();
      Collection<SerializerPlugin> _allSerializerPlugins = _pluginManager.getAllSerializerPlugins(true);
      Collection<SerializerPlugin> serializerPlugins = ((Collection<SerializerPlugin>) _allSerializerPlugins);
      Serializer serializer = ((Serializer) null);
      for (final SerializerPlugin serializerPlugin : serializerPlugins) {
        String _defaultName = serializerPlugin.getDefaultName();
        boolean _equals = Objects.equal(_defaultName, "Ifc2x3");
        if (_equals) {
          PluginConfiguration _pluginConfiguration = new PluginConfiguration();
          Serializer _createSerializer = serializerPlugin.createSerializer(_pluginConfiguration);
          serializer = _createSerializer;
        }
      }
      data.resetExpressIds();
      PluginManager _pluginManager_1 = bimServer.getPluginManager();
      serializer.init(data, null, _pluginManager_1, null, true);
      File _file = new File(filename);
      serializer.writeToFile(_file);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
