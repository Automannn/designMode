package design_mode.factory.entity_alive;

import com.automannn.design_mode.factory.OOP_class.Hero;
import com.automannn.design_mode.factory.entity_nonliving.Armor;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:41
 */
public class YuGe extends Hero {
    private static final String NAME = "于哥";

    private Armor armor;

    public YuGe() {
        super(NAME);
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
