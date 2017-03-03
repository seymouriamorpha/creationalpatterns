package by.seymouriamorpha.creationalpatterns.factory;

import by.seymouriamorpha.creationalpatterns.enums.Price;
import by.seymouriamorpha.creationalpatterns.factory.impls.ChipComputerFactoryMethod;
import by.seymouriamorpha.creationalpatterns.factory.impls.ExpensiveComputerFactoryMethod;
import by.seymouriamorpha.creationalpatterns.ifaces.Computer;

/**
 * @author Eugene Kortelyov on 02.03.2017.
 */
public class ComputerFactoryMethodService implements ComputerService {

    private Price price;

    public ComputerFactoryMethodService(Price price) {
        this.price = price;
    }

    @Override
    public Computer process(){
        ComputerFactoryMethod factoryMethod = getComputerFactoryMethod();
        Computer computer = factoryMethod.createComputer();
        computer.installOS("CentOS");
        return computer;
    }

    private ComputerFactoryMethod getComputerFactoryMethod(){
        switch (price){
            case CHIP:
                return new ChipComputerFactoryMethod();
            case EXPENSIVE:
                return new ExpensiveComputerFactoryMethod();
            default:
                throw new IllegalArgumentException();
        }
    }

}
