package design_mode.command.entity_nonliving;

import com.automannn.design_mode.command.OOP_interface.Weapon;

/**
 * @author automannn@163.com
 * @time 2018/9/13 1:43
 */
public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("用枪攻击！");
    }
}
