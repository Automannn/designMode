package design_mode.mediator.OOP_interface;

import com.automannn.design_mode.mediator.OOP_class.Hero;

/**
 * @author automannn@163.com
 * @time 2018/9/18 20:41
 */
public interface Mediator {

    void createMediator(Hero... h1);

    void workAll();
}
