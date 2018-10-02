package design_mode.adapter.test;

import com.automannn.design_mode.adapter.OOP_class.WeaponIterator;
import com.automannn.design_mode.adapter.OOP_interface.Weapon;
import com.automannn.design_mode.adapter.entity_alive.LongGe;
import com.automannn.design_mode.adapter.entity_alive.YuGe;
import com.automannn.design_mode.adapter.entity_nonliving.Knife;
import com.automannn.design_mode.adapter.entity_nonliving.WeaponAdapter;
import com.automannn.design_mode.adapter.entity_nonliving.WeaponDescriptor;

/**
 * @author automannn@163.com
 * @time 2018/9/13 15:06
 */
public class Test {
    static LongGe longGe= new LongGe();
    public static void main(String[] args) {

        //龙哥的适配管理器

        AdapterManager am = new AdapterManager();
        new Thread(am).start();


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

        //突然龙哥的刀掉了，情急之下，忘记了自己的宝马车上有哪些武器
        WeaponDescriptor descriptor= new WeaponDescriptor(200.0f,20.0f);
        longGe.setAdapter(new WeaponAdapter(descriptor));
        longGe.setAssosation(am);
        longGe.AssosationDo();



    }

    public static class Trigger{
        MessageQueue queue= new MessageQueue();

        public void trigger(){
            queue.cacheMessage();
        }
    }

    private static class AdapterManager extends Trigger implements Runnable{


        @Override
        public void run() {

            while (true){
                if (queue.hasMessage()&& longGe.getAdapter()!=null){
                    Weapon wpp= (Weapon) longGe.getAdapter().getTarget();

                    System.out.print(longGe.getName()+" 通过适配器取得了武器。又开始了攻击");
                    wpp.attack();
                }

            }

        }
    }

    private static class MessageQueue{
        //接收五个信号用作缓冲,,这里没有用到,但是它逻辑上是存在的
        boolean[] bb = new boolean[5];

        //以0 记录队列头
        int top =0;

        //游标，控制队列的位置
        int corsor=0;

        private void cacheMessage(){
            //bb[corsor]=true;
            move();
        }


        public boolean hasMessage(){
            if (top == corsor) return false;
            Tmove();
            return true;
        }

        //定义浮标移动的方式
        private void move(){
            //若当前的游标已经到达线性尾部，则回到头部
            if ((corsor+1)%5==0){
                corsor=0;
                return;
            }

            corsor++;
        }

        private void Tmove(){
            //若当前的游标已经到达线性尾部，则回到头部
            if ((top+1)%5==0){
                top=0;
                return;
            }

            top++;
        }
    }


}
