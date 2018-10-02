package design_mode.mediator.OOP_class;


import com.automannn.design_mode.mediator.OOP_interface.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author automannn@163.com
 * @time 2018/9/18 20:44
 */
public class CollisionMediator implements Mediator {
    List<Hero> list= new ArrayList<>();

    @Override
    public void createMediator(Hero... heroes) {
        for (Hero h: heroes){
            list.add(h);
        }
    }

    @Override
    public void workAll() {
        for (int i=0;i<list.size();i++){
            list.get(i).saySorry();
        }

    }
}
