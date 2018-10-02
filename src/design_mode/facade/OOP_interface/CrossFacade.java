package design_mode.facade.OOP_interface;

/**
 * @author automannn@163.com
 * @time 2018/9/17 14:25
 */
public abstract class CrossFacade {
    protected abstract void lightOn();

    protected abstract void waitingGreen();

    protected abstract void watchAround();

    protected abstract void go();

    public void cross(){
        lightOn();
        waitingGreen();
        watchAround();
        go();
    }
}
