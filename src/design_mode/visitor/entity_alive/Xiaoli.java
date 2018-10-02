package design_mode.visitor.entity_alive;

import com.automannn.design_mode.strategy.OOP_class.Hero;
import com.automannn.design_mode.visitor.OOP_interface.Observer;


/**
 * @author automannn@163.com
 * @time 2018/9/18 16:14
 */
public class Xiaoli extends Hero implements Observer {
    private static final String NAME = "警员小李";

    public Xiaoli() {
        super(NAME);
    }

    @Override
    public void update() {
        System.out.println(NAME + "监听到了有人打电话!");
    }
}
