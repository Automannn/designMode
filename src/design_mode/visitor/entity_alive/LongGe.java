package design_mode.visitor.entity_alive;

import com.automannn.design_mode.visitor.OOP_class.Adapter;
import com.automannn.design_mode.visitor.OOP_class.Hero;
import com.automannn.design_mode.visitor.OOP_class.Iterator;
import com.automannn.design_mode.visitor.OOP_class.WeaponIterator;
import com.automannn.design_mode.visitor.OOP_interface.Access;
import com.automannn.design_mode.visitor.OOP_interface.Visitor;
import com.automannn.design_mode.visitor.OOP_interface.Weapon;
import com.automannn.design_mode.visitor.able_interface.Assosationable;
import com.automannn.design_mode.visitor.able_interface.Weaponable;
import com.automannn.design_mode.visitor.component.Car;
import com.automannn.design_mode.visitor.test.Test;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:41
 */
public class LongGe extends Hero implements Weaponable,Assosationable,Access {
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getInfo() {
        Iterator<Weapon> it = new WeaponIterator(bmw_car.getWeapons());
        StringBuilder  stringBuilder = new StringBuilder();

        while (it.haseNext()){
            Weapon weapon  = (Weapon) it.next();
            //stringBuilder.append(weapon)
        }
        return "宝马车上的所有物品都被访问者模式查了一遍（上下文）。";
    }
}
