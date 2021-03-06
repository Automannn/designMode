package design_mode.decorator.OOP_class;

import com.automannn.design_mode.decorator.OOP_interface.Builder;
import com.automannn.design_mode.decorator.entity_nonliving.Shield;

/**
 * @author automannn@163.com
 * @time 2018/9/15 14:57
 */
public final class ShieldBuilder implements Builder {
    private  final Shield shield = new Shield();


    @Override
    public Shield build() {
        return shield;
    }

    public ShieldBuilder addParam(String param){
        if (param==null)throw new IllegalArgumentException("参数不能为空！");
        shield.addParam(param);
        return  this;
    }
}
