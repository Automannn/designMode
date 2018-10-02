package design_mode.proxy.OOP_class;

import com.automannn.design_mode.proxy.OOP_interface.Factory;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author automannn@163.com
 * @time 2018/9/14 14:47
 */
public abstract class BaseFactory implements Factory {
    protected static final Queue queueCache = new ArrayDeque();

    public Object getProduct(){
       return queueCache.poll();
    }


    protected void productWithCache(){
        queueCache.add(produce());
    }
}
