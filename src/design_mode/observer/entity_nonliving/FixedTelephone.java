package design_mode.observer.entity_nonliving;

import com.automannn.design_mode.observer.OOP_class.BaseObservable;
import com.automannn.design_mode.observer.OOP_interface.Observable;
import com.automannn.design_mode.observer.OOP_interface.Observer;

/**
 * @author automannn@163.com
 * @time 2018/9/18 16:20
 */
public class FixedTelephone extends BaseObservable{

    @Override
    public void operate() {
        notifyObservers();
    }
}
