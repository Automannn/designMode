package design_mode.builder.entity_nonliving;

import com.automannn.design_mode.builder.OOP_class.Adapter;
import com.automannn.design_mode.builder.OOP_interface.Weapon;


/**
 * @author automannn@163.com
 * @time 2018/9/13 17:53
 */
public class WeaponAdapter extends Adapter {

    private WeaponDescriptor descriptor;

    public WeaponAdapter(WeaponDescriptor descriptor){
        this.descriptor = descriptor;
    }

    @Override
    public Weapon getTarget() {
        Float length = descriptor.getWeaponLenght();
        Float weight = descriptor.getWeaponWeight();
        //当长度大于100cm，并且重量在500g以内
        if (length>100.0f&&weight<500.0f){
            return  new Knife();
        }

        if (length<100.0f){
            if (weight>500.0f){
                return new Dex();
            }else {
                return new Gun();
            }
        }else {
            throw new IllegalArgumentException("武器描述有误！或者暂时不存在该种武器");
        }
    }
}
