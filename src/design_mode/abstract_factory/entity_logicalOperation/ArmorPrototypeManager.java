package design_mode.abstract_factory.entity_logicalOperation;

import com.automannn.design_mode.abstract_factory.OOP_class.PrototypeManager;

/**
 * @author automannn@163.com
 * @time 2018/9/15 14:10
 */
public class ArmorPrototypeManager extends PrototypeManager {

    @Override
    public void register(String key, Object value) {
        super.register0(key,value);
    }


}