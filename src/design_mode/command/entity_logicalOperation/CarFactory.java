package design_mode.command.entity_logicalOperation;

import com.automannn.design_mode.command.OOP_class.Shell;
import com.automannn.design_mode.command.OOP_class.VehicleAbstractFactory;
import com.automannn.design_mode.command.OOP_class.Wheel;
import com.automannn.design_mode.command.entity_nonliving.CarShell;
import com.automannn.design_mode.command.entity_nonliving.CarWheel;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:27
 */
public class CarFactory extends VehicleAbstractFactory {
    @Override
    public Wheel createWheel() {
        wheel=new CarWheel();
        return wheel;
    }

    @Override
    public Shell createShell() {
        shell = new CarShell();
        return shell;
    }

    @Override
    public void run() {
        System.out.println(wheel.getMessage());
        System.out.println(shell.getMessage());
    }


}
