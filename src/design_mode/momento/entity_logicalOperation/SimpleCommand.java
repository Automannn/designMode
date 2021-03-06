package design_mode.momento.entity_logicalOperation;

import com.automannn.design_mode.momento.OOP_interface.CommanReceiver;
import com.automannn.design_mode.momento.OOP_interface.Command;


/**
 * @author automannn@163.com
 * @time 2018/9/18 19:18
 */
public class SimpleCommand implements Command {
    private CommanReceiver receiver;

    public SimpleCommand(CommanReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
