package design_mode.observer.component;

import com.automannn.design_mode.observer.OOP_interface.Weapon;
import com.automannn.design_mode.observer.entity_nonliving.Dex;
import com.automannn.design_mode.observer.entity_nonliving.Gun;
import com.automannn.design_mode.observer.entity_nonliving.Knife;

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


    public void run(){
        System.out.println("龙哥的宝马车跑起来了");
    }
}
