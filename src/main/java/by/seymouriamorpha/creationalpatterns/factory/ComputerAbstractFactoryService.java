package by.seymouriamorpha.creationalpatterns.factory;

import by.seymouriamorpha.creationalpatterns.enums.Price;
import by.seymouriamorpha.creationalpatterns.factory.impls.ChipComputerAbstractFactory;
import by.seymouriamorpha.creationalpatterns.factory.impls.ExpensiveComputerAbstractFactory;
import by.seymouriamorpha.creationalpatterns.ifaces.Computer;
import by.seymouriamorpha.creationalpatterns.impls.ComputerImpl;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public class ComputerAbstractFactoryService implements ComputerService {

    private Price price;

    public ComputerAbstractFactoryService(Price price) {
        this.price = price;
    }

    @Override
    public Computer process(){
        ComputerAbstractFactory factoryMethod = getComputerAbstractFactory();
        Computer computer = new ComputerImpl(factoryMethod.createKeyboard(), factoryMethod.createMonitor(), factoryMethod.createSystemBlock(), factoryMethod.createMouse());
        computer.installOS("CentOS");
        return computer;
    }

    private ComputerAbstractFactory getComputerAbstractFactory(){
        switch (price){
            case CHIP:
                return new ChipComputerAbstractFactory();
            case EXPENSIVE:
                return new ExpensiveComputerAbstractFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

}
