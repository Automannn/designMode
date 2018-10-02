package design_mode.abstract_factory.entity_nonliving;

import com.automannn.design_mode.abstract_factory.OOP_interface.Weapon;

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
