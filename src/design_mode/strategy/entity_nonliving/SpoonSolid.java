package design_mode.strategy.entity_nonliving;

import com.automannn.design_mode.strategy.able_interface.Spoonable;

/**
 * @author automannn@163.com
 * @time 2018/9/17 15:03
 */
public class SpoonSolid implements Spoonable {
    @Override
    public void run() {
        System.out.println("盛装固体。。");
    }
}
