package design_mode.momento.entity_nonliving;

import com.automannn.design_mode.momento.able_interface.Spoonable;

/**
 * @author automannn@163.com
 * @time 2018/9/17 15:02
 */
public class SpoonLiquid implements Spoonable {
    @Override
    public void run() {
        System.out.println("装载液体。");
    }
}
