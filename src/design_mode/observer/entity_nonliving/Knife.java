package design_mode.observer.entity_nonliving;

import com.automannn.design_mode.observer.OOP_interface.Weapon;

/**
 * @author automannn@163.com
 * @time 2018/9/13 1:43
 */
public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("用刀攻击！");
    }
}
