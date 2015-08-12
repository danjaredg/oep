package mashin.oep.model.terminal;

import mashin.oep.model.WorkflowConnection;
import mashin.oep.model.node.Node;

public class FanOutTerminal extends OutputTerminal {

  public FanOutTerminal(String label, Node holderNode) {
    super(label, holderNode);
  }

  @Override
  public boolean canAddConnection(WorkflowConnection connection) {
    if (!connection.getSource().equals(holderNode)
        || hasConnection(connection)) {
      return false;
    }
    return true;
  }

}
