package design_mode.proxy.entity_logicalOperation;

import com.automannn.design_mode.proxy.OOP_class.Shell;
import com.automannn.design_mode.proxy.OOP_class.VehicleAbstractFactory;
import com.automannn.design_mode.proxy.OOP_class.Wheel;
import com.automannn.design_mode.proxy.entity_nonliving.MotorShell;
import com.automannn.design_mode.proxy.entity_nonliving.MotorWheel;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:28
 */
public class MotorFactory extends VehicleAbstractFactory {
    @Override
    public Wheel createWheel() {
        wheel = new MotorWheel();
        return wheel;
    }

    @Override
    public Shell createShell() {
        shell = new MotorShell();
        return shell;
    }

    @Override
    public void run() {
        System.out.println(wheel.getMessage());

        System.out.println(shell.getMessage());

    }
}
