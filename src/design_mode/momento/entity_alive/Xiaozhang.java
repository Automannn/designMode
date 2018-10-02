package design_mode.momento.entity_alive;

import com.automannn.design_mode.momento.OOP_interface.Observer;
import com.automannn.design_mode.strategy.OOP_class.Hero;

/**
 * @author automannn@163.com
 * @time 2018/9/18 16:14
 */
public class Xiaozhang extends Hero implements Observer {
    private static final String NAME = "警员小张";

    public Xiaozhang() {
        super(NAME);
    }

    @Override
    public void update() {
        System.out.println(NAME + "监听到了有人打电话!");
    }
}
