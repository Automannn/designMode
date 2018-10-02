package design_mode.chain_of_responsibility.OOP_class;

import com.automannn.design_mode.chain_of_responsibility.OOP_interface.Observable;
import com.automannn.design_mode.chain_of_responsibility.OOP_interface.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author automannn@163.com
 * @time 2018/9/18 16:04
 */
public abstract class BaseObservable implements Observable {

    private final List<Observer> observerList= new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
       Iterator it= observerList.iterator();

       while (it.hasNext()){
           Observer observer = (Observer) it.next();

           observer.update();
       }

    }

    public abstract void operate();
}
