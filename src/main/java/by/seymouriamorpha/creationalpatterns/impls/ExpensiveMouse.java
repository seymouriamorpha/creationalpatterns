package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.Mouse;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ExpensiveMouse implements Mouse {

    @Override
    public String getMouse() {
        return "Nakatomi MON-20U White";
    }

}
