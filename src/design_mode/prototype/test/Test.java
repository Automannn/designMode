package design_mode.prototype.test;

import com.automannn.design_mode.prototype.OOP_class.WeaponIterator;
import com.automannn.design_mode.prototype.OOP_interface.Weapon;
import com.automannn.design_mode.prototype.entity_alive.LongGe;
import com.automannn.design_mode.prototype.entity_alive.YuGe;
import com.automannn.design_mode.prototype.entity_logicalOperation.ArmorFactory;
import com.automannn.design_mode.prototype.entity_logicalOperation.ArmorPrototypeManager;
import com.automannn.design_mode.prototype.entity_logicalOperation.SimpleGunTemplate;
import com.automannn.design_mode.prototype.entity_nonliving.*;
import com.automannn.design_mode.prototype.exception.SingletonException;

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
        WeaponDescriptor descriptor= new WeaponDescriptor(60.0f,300.0f);
        longGe.setAdapter(new WeaponAdapter(descriptor));
        longGe.setAssosation(am);
        longGe.AssosationDo();

        //龙哥使用适配器模式，拿到了一把枪，可是他不知道怎么用，于是按照枪使用的模板使用

        System.out.println(longGe.getName()+"通过模板模式，使用枪支：");
        Weapon wpp =  am.getWeapon();
        try {
            Gun gg = (Gun) wpp;
            new SimpleGunTemplate().run();
        }catch (ClassCastException e){
            System.out.println("适配器出错！");
        }

        //于哥发现龙哥欺人太甚了，想用点什么来防御一下，但是自己制作太费时间，于是使用工厂模式生产防弹衣
        ArmorFactory armorFactory = new ArmorFactory();
        armorFactory.produceWithCahce();

        yuGe.setArmor((Armor) armorFactory.getProduct());

        System.out.print(yuGe.getName()+" 通过 工厂模式 生产的 ");
        yuGe.getArmor().run();

        //在打斗中，于哥发现旁边旁边有个台阶，于是站上去以便更好的防御
        try {
            HighStep highStep = HighStep.getInstance(yuGe);
        } catch (SingletonException e) {
            System.out.println(e.getMessage());
        }

        //龙哥本来就比于哥矮，于是肯定不甘心，于是追着站上去
        try {
            HighStep highStep = HighStep.getInstance(longGe);
        } catch (SingletonException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("龙哥不甘心，开始想象要是自己先站上去就好了");
        System.out.println("龙哥开始想象：~~~~");

        //于哥发现站不上去了，脑海中想着要是有个分身先站上去就好了

        //以下是他的想象：
        new Thread(()->{
            try {
                HighStepThreadSafe highStepThreadSafe = HighStepThreadSafe.getInstance(longGe);
            } catch (Exception e) {
                System.out.println("~~~~"+e.getMessage());
            }
        }).start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            HighStepThreadSafe highStepThreadSafe = HighStepThreadSafe.getInstance(yuGe);
        } catch (Exception e) {
            System.out.println("~~~~"+e.getMessage());
        }

        System.out.println("-------------------------");

        //于哥发现掉血有点严重，再通过工厂模式生产防弹衣代价太大，于是通过原型模式复制一个防弹衣就ok了
        ArmorPrototypeManager armorPrototypeManager= new ArmorPrototypeManager();
        armorPrototypeManager.register("newArmor",yuGe.getArmor());

        Armor newArmor= (Armor) armorPrototypeManager.create("newArmor");

        System.out.println(yuGe.getName()+" 通过原型模式，复制了一个防弹衣");

        newArmor.run();

    }

    public static class Trigger{
        MessageQueue queue= new MessageQueue();

        public void trigger(){
            queue.cacheMessage();
        }
    }

    private static class AdapterManager extends Trigger implements Runnable{
       private Weapon weapon;

        @Override
        public void run() {

            while (true){
                if (queue.hasMessage()&& longGe.getAdapter()!=null){
                    weapon = (Weapon) longGe.getAdapter().getTarget();

                    System.out.print(longGe.getName()+" 通过适配器取得了武器。又开始了攻击");
                    weapon.attack();
                }


            }

        }

        public Weapon getWeapon() {
            return weapon;
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
