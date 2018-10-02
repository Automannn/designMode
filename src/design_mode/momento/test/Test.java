package design_mode.momento.test;

import com.automannn.design_mode.momento.OOP_class.*;
import com.automannn.design_mode.momento.OOP_interface.AnswerPhone;
import com.automannn.design_mode.momento.OOP_interface.Command;
import com.automannn.design_mode.momento.OOP_interface.Weapon;
import com.automannn.design_mode.momento.entity_alive.*;
import com.automannn.design_mode.momento.entity_logicalOperation.*;
import com.automannn.design_mode.momento.entity_nonliving.*;
import com.automannn.design_mode.momento.exception.SingletonException;

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

        //于哥决定防弹衣不行，还得弄个盾牌
        Shield shield = new Shield();
        shield.run();
        System.out.println("这个盾牌太low了，需要一个更强大的");

        //于哥用通过了一个盾牌构造器构造一个盾牌
        System.out.println("使用盾牌构造器");
        ShieldBuilder shieldBuilder = new ShieldBuilder();
        Shield shield1= shieldBuilder.addParam("金刚石组成").addParam("具有条纹").addParam("可以防子弹").build();
        shield1.run();

        //他们都有点累了，心想回车里坐一下吧，于是通过抽象工厂，龙哥召唤出小汽车，于哥召唤出摩托车
       VehicleAbstractFactory carFactory=  VehicleAbstractFactory.getFactory("com.automannn.design_mode.momento." +
                "entity_logicalOperation.CarFactory");
       carFactory.createShell();
       carFactory.createWheel();
        System.out.println(longGe.getName()+" 坐骑:");
        carFactory.run();

        VehicleAbstractFactory carFactory1=  VehicleAbstractFactory.getFactory("com.automannn.design_mode.momento." +
                "entity_logicalOperation.MotorFactory");
        carFactory1.createShell();
        carFactory1.createWheel();
        System.out.println(yuGe.getName() +" 坐骑:");
        carFactory1.run();


        //龙哥觉得工厂造出来的车子不舒服，还是自己的宝马车安逸
        //并且使用了装饰器模式，洋洋洒洒的一通操作
        System.out.println("龙哥选择了他的宝马车，并用装饰器模式一顿操作猛如虎");
        new CarDecorator(longGe.getBmw_car()).run();

        //于哥觉得比较明智的就是报警，可由于自己放不开手，于是只能委托一个路人报警
        new HelperPersonProxy(yuGe).help();

        //突然前面遇到了一个红绿灯，龙哥害怕呀， 因为他不知道交通规则  于是使用门面模式，才得以安全过去
        System.out.println("龙哥，通过门面模式，通过一个红绿灯路口转弯");
        new CrossRoadFacade().cross();

        //这个时候，路边有个卖冰淇凌的。  龙哥和于哥都想买
        Bridge bridge =  new SpoonBridge();
        System.out.println("于哥想要吃粘稠一点的冰激凌，通过桥接模式：");
        bridge.setSpoon(new SpoonLiquid());
        bridge.run();

        System.out.println("龙哥想要吃干一点的冰激凌，通过桥接模式：");
        bridge.setSpoon(new SpoonSolid());
        bridge.run();

        //龙哥掏出了他的手机， 准备叫小弟
        System.out.println(longGe.getName()+"掏出了手机：");
       Phone aifeng= new Phone("爱疯叉");
       aifeng.addCorePart(new Phone.Part("A8处理器"));
       aifeng.addCorePart(new Phone.Part("定制主板"));
       aifeng.addOtherParts(new Phone.Part("定制电池"));
       aifeng.setShell(new Phone.Part("金属外壳"));

       aifeng.run();

       //在这种情况，如果下雨，
        System.out.println("下雨了。。。");
        yuGe.setStation("雨天");
        yuGe.stationDo();

        System.out.println("天晴了。。。");
        longGe.setStation("晴天");
        longGe.stationDo();

        //这时候龙哥的电话被小弟接到了
        AnswerPhone answerPhone = new Xiaodi("");
        answerPhone.answer();

        answerPhone = new Xiaodi("心情好");
        answerPhone.answer();

        //这时候警局的电话正被警元小张，和 小李观察，监听着电话
        FixedTelephone fixedTelephone =  new FixedTelephone();
        fixedTelephone.addObserver( new Xiaoli());
        fixedTelephone.addObserver( new Xiaozhang());

        fixedTelephone.operate();

        //相关部门已经知道了事情的严重性，于是下令必需妥善处理这件事
        BaseHandler high= new OfficialHandler("上级部门");
        BaseHandler medium = new OfficialHandler("中级部门");
        BaseHandler low = new OfficialHandler("下级部门");

        high.setHandler(medium);
        medium.setHandler(low);
        high.operate();

        //这个事情已经惊动了特种部队
        SpecialTroops specialTroops = new SpecialTroops();
        Command command = new SimpleCommand( specialTroops);
        Commander commander = new Commander();
        commander.setCommand(command);
        commander.action();

        //于哥知道等下警察就要来了，于是赶紧拍照保留证据，证明自己的清白
        Scene scene = new Scene();
        scene.setDesc("龙哥香车美女，目无他人，欺负老实人....");

        //备份
        Memento memento =new Memento(scene);

        //持久化
        Storage storage = new Storage(memento);


        System.out.println("证据已经留下,当时的情况是这样的：");
        System.out.println(storage.getMemento().getScene().getDesc());


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
