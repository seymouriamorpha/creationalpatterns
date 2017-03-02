package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.Monitor;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ChipMonitor implements Monitor {

    @Override
    public String getMonitor() {
        return "NEC MultiSync E171M";
    }

}
