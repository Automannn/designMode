package design_mode.visitor.entity_nonliving;

import com.automannn.design_mode.visitor.OOP_class.BaseObservable;

/**
 * @author automannn@163.com
 * @time 2018/9/18 16:20
 */
public class FixedTelephone extends BaseObservable {

    @Override
    public void operate() {
        notifyObservers();
    }
}
