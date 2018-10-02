package design_mode.builder.component;

import com.automannn.design_mode.builder.OOP_interface.Weapon;
import com.automannn.design_mode.builder.entity_nonliving.Dex;
import com.automannn.design_mode.builder.entity_nonliving.Gun;
import com.automannn.design_mode.builder.entity_nonliving.Knife;

/**
 * @author automannn@163.com
 * @time 2018/9/13 1:41
 */
public class Car  {

    public Car() {
    }

    //默认带了三把武器
    private Weapon weapons[] = {new Dex(),new Gun(),new Knife()};

    public Weapon getWeapon(int index){
        if (index>=weapons.length) throw new IllegalArgumentException("参数不合法");

        return weapons[index];
    }

    public Weapon[] getWeapons(){
        return weapons;
    }


}
