package design_mode.proxy.entity_nonliving;


import com.automannn.design_mode.proxy.OOP_class.Hero;

/**
 * @author automannn@163.com
 * @time 2018/9/15 9:39
 */
public class HighStepThreadSafe {

    private static HighStepThreadSafe highStep=null;
    private static Hero hero;

    //宽度
    private float width;

    //高度
    private float height;

    //密度
    private float density;

    private HighStepThreadSafe() {
    }

    private HighStepThreadSafe(float width, float height, float density) {
        this.width = width;
        this.height = height;
        this.density = density;
    }

    public synchronized static HighStepThreadSafe getInstance(Hero h) throws Exception {
        if (highStep==null){
            highStep = new HighStepThreadSafe(20.0f,20.0f,3.0f);
            hero=h;
            System.out.println("~~~台阶被 "+h.getName()+ " 占了。");
        }else {
            throw new Exception("单例模式，这个台阶只能站一个人！");
        }
        return highStep;
    }
}
