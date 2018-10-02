package design_mode.proxy.entity_nonliving;

import com.automannn.design_mode.proxy.OOP_interface.Prototype;

/**
 * @author automannn@163.com
 * @time 2018/9/14 14:42
 */

//防弹衣
public class Armor implements Prototype {
    public Armor() {
    }

    public void run(){
        System.out.println("防弹衣加持！！");
    }

    @Override
    public Object createClone() {
        Armor armor=null;
        try {
            armor= (Armor) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return armor;
    }
}
