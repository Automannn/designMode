package design_mode.proxy.entity_logicalOperation;

import com.automannn.design_mode.proxy.OOP_class.GunTemplate;

/**
 * @author automannn@163.com
 * @time 2018/9/14 14:15
 */
public class SimpleGunTemplate extends GunTemplate {
    @Override
    public void loadGunpowder() {
        System.out.println("上两颗子弹");
    }

    @Override
    public void prepareFire() {
        System.out.println("上膛");
    }

    @Override
    public void fire() {
        System.out.println("开火！");
    }
}
