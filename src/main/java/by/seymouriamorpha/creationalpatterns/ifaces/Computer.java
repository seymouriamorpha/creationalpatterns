package by.seymouriamorpha.creationalpatterns.ifaces;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public interface Computer {

    public Keyboard getKeyboard();
    public Monitor getMonitor();
    public Mouse getMouse();
    public SystemBlock getSystemBlock();

    public void installOS(String os);

}
