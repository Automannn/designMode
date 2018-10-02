package design_mode.visitor.entity_nonliving;

import com.automannn.design_mode.visitor.OOP_interface.Weapon;

/**
 * @author automannn@163.com
 * @time 2018/9/13 1:43
 */
public class Dex implements Weapon {
    @Override
    public void attack() {
        System.out.println("用斧子攻击！");
    }
}
