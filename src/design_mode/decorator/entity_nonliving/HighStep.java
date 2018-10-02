package design_mode.decorator.entity_nonliving;


import com.automannn.design_mode.decorator.OOP_class.Hero;
import com.automannn.design_mode.decorator.exception.SingletonException;

/**
 * @author automannn@163.com
 * @time 2018/9/15 9:20
 */
//高台阶
public class HighStep {

    private static HighStep highStep = new HighStep(20.0f,20.0f,3.0f);
    private static Hero hero;

    //宽度
    private float width;

    //高度
    private float height;

    //密度
    private float density;

    private HighStep() {
    }

    private HighStep(float width, float height, float density) {
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public static HighStep getInstance(Hero h) throws SingletonException {
        if (hero==null){
            hero =h;
            System.out.println("台阶被 " +h.getName()+" 成功占据。");
        }else {
            throw new SingletonException("单例模式，这个台阶只能站一个人！");

        }

        return highStep;
    }

}
