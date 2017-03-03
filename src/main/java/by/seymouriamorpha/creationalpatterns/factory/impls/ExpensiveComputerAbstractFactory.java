package by.seymouriamorpha.creationalpatterns.factory.impls;

import by.seymouriamorpha.creationalpatterns.factory.ComputerAbstractFactory;
import by.seymouriamorpha.creationalpatterns.ifaces.Keyboard;
import by.seymouriamorpha.creationalpatterns.ifaces.Monitor;
import by.seymouriamorpha.creationalpatterns.ifaces.Mouse;
import by.seymouriamorpha.creationalpatterns.ifaces.SystemBlock;
import by.seymouriamorpha.creationalpatterns.impls.ExpensiveKeyboard;
import by.seymouriamorpha.creationalpatterns.impls.ExpensiveMonitor;
import by.seymouriamorpha.creationalpatterns.impls.ExpensiveMouse;
import by.seymouriamorpha.creationalpatterns.impls.ExpensiveSystemBlock;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public class ExpensiveComputerAbstractFactory implements ComputerAbstractFactory {

    @Override
    public Keyboard createKeyboard() {
        return new ExpensiveKeyboard();
    }

    @Override
    public Monitor createMonitor() {
        return new ExpensiveMonitor();
    }

    @Override
    public SystemBlock createSystemBlock() {
        return new ExpensiveSystemBlock();
    }

    @Override
    public Mouse createMouse() {
        return new ExpensiveMouse();
    }

}
