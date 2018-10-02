package design_mode.visitor.entity_nonliving;

import com.automannn.design_mode.visitor.OOP_class.Wheel;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:06
 */
public class MotorWheel extends Wheel {
    private static final String name = "摩托车";

    public MotorWheel() {
        super(name);
    }
}
