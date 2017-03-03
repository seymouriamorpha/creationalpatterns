package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.*;

/**
 * @author Eugene Kortelyov on 3/3/2017.
 */
public class ComputerImpl implements Computer {

    private Keyboard keyboard;
    private Monitor monitor;
    private SystemBlock block;
    private Mouse mouse;

    private String OS;

    public ComputerImpl(Keyboard keyboard, Monitor monitor, SystemBlock block, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.block = block;
        this.mouse = mouse;
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public Mouse getMouse() {
        return mouse;
    }

    @Override
    public SystemBlock getSystemBlock() {
        return block;
    }

    @Override
    public String getOS() {
        return OS;
    }

    @Override
    public void installOS(String os) {
        this.OS = os;
    }

    @Override
    public String toString() {
        return  "\n\t{" +
                "\n\t\"keyboard\":\"" + keyboard.getKeyboard() + "\"," +
                "\n\t\"monitor\":\"" + monitor.getMonitor() + "\"," +
                "\n\t\"block\":\"" + block.getSystemBlock() + "\"," +
                "\n\t\"mouse\":\"" + mouse.getMouse() + "\"," +
                "\n\t\"OS\":\"" + OS + "\"\n\t}\n"
                ;
    }

}
