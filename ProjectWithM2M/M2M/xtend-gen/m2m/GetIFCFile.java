package m2m;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

@SuppressWarnings("all")
public class GetIFCFile implements IWorkflowComponent {
  private String importedFileNameSlot = "random";
  
  public String setimportedFileNameSlot(final String fileNameSlot) {
    String _importedFileNameSlot = this.importedFileNameSlot = fileNameSlot;
    return _importedFileNameSlot;
  }
  
  public void invoke(final IWorkflowContext ctx) {
    String filename = "/Users/RickMarker/Documents/ProjectWithM2M/M2M/IFCTest/Complete model.ifc";
    ctx.put(this.importedFileNameSlot, filename);
  }
  
  public void postInvoke() {
  }
  
  public void preInvoke() {
  }
}
