package design_mode.iterator.entity_alive;

import com.automannn.design_mode.iterator.component.Car;
import com.automannn.design_mode.iterator.OOP_class.Hero;
import com.automannn.design_mode.iterator.OOP_class.WeaponIterator;
import com.automannn.design_mode.iterator.able_interface.Weaponable;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:41
 */
public class LongGe extends Hero implements Weaponable {
    private static final String NAME = "龙哥";

    private  final Car bmw_car=new Car();

    public LongGe() {
        super(NAME);
    }


    public Car getBmw_car() {
        return bmw_car;
    }

    @Override
    public WeaponIterator weaponItertor() {
        return new WeaponIterator(bmw_car.getWeapons());
    }
}
