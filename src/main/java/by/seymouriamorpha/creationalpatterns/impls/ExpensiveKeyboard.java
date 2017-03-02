package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.Keyboard;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ExpensiveKeyboard implements Keyboard {

    @Override
    public String getKeyboard() {
        return "Logitech Orion Spark G910";
    }

}
