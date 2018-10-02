package design_mode.facade.entity_nonliving;

import com.automannn.design_mode.facade.OOP_class.Shell;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:10
 */
public class CarShell extends Shell {
    private static final String name = "汽车";

    public CarShell() {
        super(name);
    }
}
