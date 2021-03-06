package design_mode.factory.OOP_class;

import com.automannn.design_mode.factory.able_interface.Iterable;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:50
 */
public abstract class Iterator<T> implements Iterable {
    protected int index;
    protected T[] ts;

    public Iterator(T[] ts){
        this.ts= ts;
        index=0;
    }
}
