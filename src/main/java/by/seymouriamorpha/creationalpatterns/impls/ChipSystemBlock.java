package by.seymouriamorpha.creationalpatterns.impls;

import by.seymouriamorpha.creationalpatterns.ifaces.SystemBlock;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class ChipSystemBlock implements SystemBlock {

    @Override
    public String getSystemBlock() {
        return "Intel Celeron J1800 2400MHz, ASUS J1800I-C DDR3 NM70, DDR3 2 Гб Hynix, 60 Gb SSD SB60";
    }

}
