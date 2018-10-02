package design_mode.command.entity_alive;

import com.automannn.design_mode.command.OOP_interface.Command;

/**
 * @author automannn@163.com
 * @time 2018/9/18 19:16
 */
public class Commander {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
