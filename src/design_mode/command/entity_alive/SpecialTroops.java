package design_mode.command.entity_alive;

import com.automannn.design_mode.command.OOP_interface.CommanReceiver;

/**
 * @author automannn@163.com
 * @time 2018/9/18 19:14
 */
public class SpecialTroops implements CommanReceiver {
    @Override
    public void doSomething() {
        System.out.println("特种兵，前去主持正义。");
    }
}
