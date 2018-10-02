package design_mode.iterator.test;

import com.automannn.design_mode.iterator.OOP_interface.Weapon;
import com.automannn.design_mode.iterator.entity_alive.LongGe;
import com.automannn.design_mode.iterator.entity_alive.YuGe;
import com.automannn.design_mode.iterator.OOP_class.WeaponIterator;
import com.automannn.design_mode.iterator.entity_nonliving.Knife;

/**
 * @author automannn@163.com
 * @time 2018/9/13 15:06
 */
public class Test {
    public static void main(String[] args) {
        LongGe longGe= new LongGe();

        YuGe yuGe = new YuGe();

        //龙哥通过迭代器的方式拿武器，于哥不知道它的车身到底有什么武器
        WeaponIterator wp =  longGe.weaponItertor();

        //因为武器在车上，所以龙哥可以拿来攻击
        while (wp.haseNext()){
            Weapon weapon = (Weapon) wp.next();
            System.out.print(longGe.getName()+": ");
            weapon.attack();
        }

        //于哥有些慌张，想要去龙哥的车子抢夺刀，后者斧子，或者枪
        System.out.println(yuGe.getName()+"愤然反抗，去车里抢夺 刀，或者 枪， 或者 斧子");

        //这时候，于哥不知道总共有什么武器和多少武器，于是随便去拿
        try {
            //做好了拿刀的手势,却发现是斧子...
            Knife knife = (Knife) longGe.getBmw_car().getWeapon(0);
        }catch (ClassCastException e){
            System.out.print(yuGe.getName()+": ");
            System.out.println("迭代器模式真是厉害，我甘拜下风。");
        }

    }
}
