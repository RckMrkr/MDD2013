package m2m;

import org.bimserver.BimServer;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

@SuppressWarnings("all")
public class StopBIMServer implements IWorkflowComponent {
  private String BIMServerSlot;
  
  public String setbimServerslot(final String slotname) {
    String _BIMServerSlot = this.BIMServerSlot = slotname;
    return _BIMServerSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    Object _get = ctx.get(this.BIMServerSlot);
    BimServer bimServer = ((BimServer) _get);
    bimServer.stop();
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
