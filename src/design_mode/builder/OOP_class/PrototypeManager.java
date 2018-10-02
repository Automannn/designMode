package design_mode.builder.OOP_class;

import com.automannn.design_mode.builder.OOP_interface.Prototype;

import java.util.HashMap;

/**
 * @author automannn@163.com
 * @time 2018/9/15 10:19
 */
public abstract class PrototypeManager {

    private static final HashMap prototypeComponent = new HashMap();

    public abstract void register(String key,Object value);

    protected void register0(String key,Object value){
        prototypeComponent.put(key,value);
    }

    public Object create(String key){
        Object o = prototypeComponent.get(key);

        return ((Prototype)o).createClone();
    }
}
