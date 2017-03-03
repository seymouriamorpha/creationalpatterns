package by.seymouriamorpha.creationalpatterns.factory;

import by.seymouriamorpha.creationalpatterns.ifaces.Keyboard;
import by.seymouriamorpha.creationalpatterns.ifaces.Monitor;
import by.seymouriamorpha.creationalpatterns.ifaces.Mouse;
import by.seymouriamorpha.creationalpatterns.ifaces.SystemBlock;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public interface ComputerAbstractFactory {

    Keyboard createKeyboard();
    Monitor createMonitor();
    SystemBlock createSystemBlock();
    Mouse createMouse();

}
