package design_mode.proxy.entity_logicalOperation;

import com.automannn.design_mode.proxy.OOP_class.BaseFactory;
import com.automannn.design_mode.proxy.entity_nonliving.Armor;

/**
 * @author automannn@163.com
 * @time 2018/9/14 15:02
 */
public class ArmorFactory extends BaseFactory {
    @Override
    public Object produce() {
        return new Armor();
    }

    public void produceWithCahce(){
        super.productWithCache();
    }
}
