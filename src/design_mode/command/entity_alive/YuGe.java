package design_mode.command.entity_alive;

import com.automannn.design_mode.command.OOP_class.Hero;
import com.automannn.design_mode.command.OOP_interface.NeedHelpPerson;
import com.automannn.design_mode.command.entity_nonliving.Armor;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:41
 */
public class YuGe extends Hero implements NeedHelpPerson {
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


    @Override
    public void help() {
        System.out.println("  于哥：请求帮助！");
    }
}
