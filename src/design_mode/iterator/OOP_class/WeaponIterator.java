package design_mode.iterator.OOP_class;

import com.automannn.design_mode.iterator.OOP_class.Iterator;
import com.automannn.design_mode.iterator.OOP_interface.Weapon;

/**
 * @author automannn@163.com
 * @time 2018/9/13 10:02
 */
public class WeaponIterator extends Iterator<Weapon> {
   public WeaponIterator(Weapon[] weapons) {
        super(weapons);
    }

    @Override
    public boolean haseNext() {
        return index<ts.length;
    }

    @Override
    public Object next() {
        return ts[index++];
    }
}
