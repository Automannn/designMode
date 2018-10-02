package design_mode.abstract_factory.entity_nonliving;

import com.automannn.design_mode.abstract_factory.OOP_class.Shell;
import com.automannn.design_mode.abstract_factory.OOP_class.VehicleParts;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:08
 */
public class MotorShell extends Shell{
    private static final String name = "摩托";

    public MotorShell() {
        super(name);
    }
}
