package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.SystemBlock;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ExpensiveSystemBlock implements SystemBlock {

    @Override
    public String getSystemBlock() {
        return "Intel Core i7-6700K(4.0(4.2)GHz), 16GB DDR4, GeForce GTX1080 8GB DDR5";
    }

}
