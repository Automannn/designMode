package design_mode.visitor.entity_logicalOperation;

import com.automannn.design_mode.visitor.OOP_interface.Access;
import com.automannn.design_mode.visitor.OOP_interface.Visitor;

/**
 * @author automannn@163.com
 * @time 2018/9/18 20:25
 */
public class SimpleVisitor implements Visitor {
    @Override
    public void visit(Access access) {
        System.out.println(access.getInfo());

    }
}
