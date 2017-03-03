package by.seymouriamorpha.creationalpatterns.ifaces;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public interface Computer {

    Keyboard getKeyboard();
    Monitor getMonitor();
    Mouse getMouse();
    SystemBlock getSystemBlock();
    String getOS();

    void installOS(String os);

}
