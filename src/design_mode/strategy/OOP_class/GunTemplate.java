package design_mode.strategy.OOP_class;

import com.automannn.design_mode.strategy.OOP_interface.GunUsageTemplate;

/**
 * @author automannn@163.com
 * @time 2018/9/14 14:09
 */
public abstract class GunTemplate implements GunUsageTemplate {

    protected abstract void loadGunpowder();



    protected abstract void prepareFire();


    protected abstract void fire();

    @Override
    public void run() {
        loadGunpowder();
        prepareFire();
        fire();
    }
}
