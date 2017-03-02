package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.Keyboard;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ChipKeyboard implements Keyboard {

    @Override
    public String getKeyboard() {
        return "A4Tech KR-85";
    }

}
