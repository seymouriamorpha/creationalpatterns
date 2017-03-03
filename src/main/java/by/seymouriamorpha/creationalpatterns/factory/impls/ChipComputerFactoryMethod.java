package by.seymouriamorpha.creationalpatterns.factory.impls;

import by.seymouriamorpha.creationalpatterns.factory.ComputerFactoryMethod;
import by.seymouriamorpha.creationalpatterns.ifaces.Computer;
import by.seymouriamorpha.creationalpatterns.impls.*;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public class ChipComputerFactoryMethod implements ComputerFactoryMethod {

    @Override
    public Computer createComputer() {
        return new ComputerImpl(new ChipKeyboard(), new ChipMonitor(), new ChipSystemBlock(), new ChipMouse());
    }

}
