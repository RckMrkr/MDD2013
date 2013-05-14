package m2m;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

@SuppressWarnings("all")
public class ExportFileName implements IWorkflowComponent {
  private String exportFileNameslot = "random";
  
  public String setexportFileNameslot(final String slotname) {
    String _exportFileNameslot = this.exportFileNameslot = slotname;
    return _exportFileNameslot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    ctx.put(this.exportFileNameslot, "/Users/RickMarker/Documents/ProjectWithM2M/M2M/output.ifc");
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
