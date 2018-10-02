package design_mode.chain_of_responsibility.entity_nonliving;

import com.automannn.design_mode.chain_of_responsibility.OOP_class.Wheel;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:07
 */
public class CarWheel extends Wheel {
    private static final String name = "小汽车";

    public CarWheel() {
        super(name);
    }
}
