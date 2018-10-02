package design_mode.composite.OOP_class;

/**
 * @author automannn@163.com
 * @time 2018/9/15 15:43
 */
public abstract class VehicleAbstractFactory extends AbstractFactory {

    //后来添加的属性，为了便于查看
    public Wheel wheel;
    public Shell shell;

    public static VehicleAbstractFactory getFactory(String classname){
        return (VehicleAbstractFactory) getFactory0(classname);
    }

    //生产轮子
    public abstract Wheel createWheel();

    //生产外壳
    public abstract Shell createShell();

    //run
    public abstract void run();
}
