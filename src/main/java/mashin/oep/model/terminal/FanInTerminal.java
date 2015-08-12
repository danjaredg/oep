package mashin.oep.model.terminal;

import mashin.oep.model.WorkflowConnection;
import mashin.oep.model.node.Node;

public class FanInTerminal extends InputTerminal {

  public FanInTerminal(String label, Node holderNode) {
    super(label, holderNode);
  }

  @Override
  public boolean canAddConnection(WorkflowConnection connection) {
    if (!connection.getTarget().equals(holderNode)
        || hasConnection(connection)) {
      return false;
    }
    return true;
  }

}
