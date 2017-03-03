package by.seymouriamorpha.creationalpatterns.factory.impls;

import by.seymouriamorpha.creationalpatterns.factory.ComputerAbstractFactory;
import by.seymouriamorpha.creationalpatterns.ifaces.Keyboard;
import by.seymouriamorpha.creationalpatterns.ifaces.Monitor;
import by.seymouriamorpha.creationalpatterns.ifaces.Mouse;
import by.seymouriamorpha.creationalpatterns.ifaces.SystemBlock;
import by.seymouriamorpha.creationalpatterns.impls.ChipKeyboard;
import by.seymouriamorpha.creationalpatterns.impls.ChipMonitor;
import by.seymouriamorpha.creationalpatterns.impls.ChipMouse;
import by.seymouriamorpha.creationalpatterns.impls.ChipSystemBlock;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public class ChipComputerAbstractFactory implements ComputerAbstractFactory {

    @Override
    public Keyboard createKeyboard() {
        return new ChipKeyboard();
    }

    @Override
    public Monitor createMonitor() {
        return new ChipMonitor();
    }

    @Override
    public SystemBlock createSystemBlock() {
        return new ChipSystemBlock();
    }

    @Override
    public Mouse createMouse() {
        return new ChipMouse();
    }

}
