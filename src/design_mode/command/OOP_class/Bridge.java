package design_mode.command.OOP_class;

import com.automannn.design_mode.command.able_interface.Spoonable;

/**
 * @author automannn@163.com
 * @time 2018/9/17 15:05
 */
public abstract class Bridge implements Spoonable {
    private Spoonable spoon;


    @Override
    public void run() {
        spoon.run();
    }

    public Spoonable getSpoon() {
        return spoon;
    }

    public void setSpoon(Spoonable spoon) {
        this.spoon = spoon;
    }
}
