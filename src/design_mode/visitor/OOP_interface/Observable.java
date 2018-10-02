package design_mode.visitor.OOP_interface;

/**
 * @author automannn@163.com
 * @time 2018/9/18 16:03
 */
public interface Observable {
    void addObserver(Observer observer);
    void delObserver(Observer observer);
    void notifyObservers();
}
