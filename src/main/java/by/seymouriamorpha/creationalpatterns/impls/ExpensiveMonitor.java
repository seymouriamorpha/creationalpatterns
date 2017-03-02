package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.Monitor;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ExpensiveMonitor implements Monitor {

    @Override
    public String getMonitor() {
        return "EIZO ColorEdge CG318-4K";
    }

}
