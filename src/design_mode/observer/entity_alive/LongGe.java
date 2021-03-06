package design_mode.observer.entity_alive;

import com.automannn.design_mode.observer.OOP_class.Adapter;
import com.automannn.design_mode.observer.OOP_class.Hero;
import com.automannn.design_mode.observer.OOP_class.WeaponIterator;
import com.automannn.design_mode.observer.able_interface.Assosationable;
import com.automannn.design_mode.observer.able_interface.Weaponable;
import com.automannn.design_mode.observer.component.Car;
import com.automannn.design_mode.observer.test.Test;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:41
 */
public class LongGe extends Hero implements Weaponable,Assosationable {
    private static final String NAME = "龙哥";

    Test.Trigger t;

    private  final Car bmw_car=new Car();

    private Adapter adapter;

    public LongGe() {
        super(NAME);
    }


    public Car getBmw_car() {
        return bmw_car;
    }

    public void setAdapter(Adapter adapter){
        this.adapter=adapter;
    }

    public Adapter getAdapter() {
        return adapter;
    }

    @Override
    public WeaponIterator weaponItertor() {
        return new WeaponIterator(bmw_car.getWeapons());
    }

    @Override
    public void setAssosation(Object o) {
        t = (Test.Trigger) o;
    }

    @Override
    public void AssosationDo() {
        t.trigger();
    }
}
