package design_mode.chain_of_responsibility.entity_logicalOperation;

import com.automannn.design_mode.chain_of_responsibility.OOP_class.BaseHandler;

/**
 * @author automannn@163.com
 * @time 2018/9/18 18:50
 */
public class OfficialHandler extends BaseHandler {
    private String name;

    public OfficialHandler(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name+"接收到了通知，将立即通知下级部门马上处理");
        if (getHandler() != null){
            getHandler().operate();
        }
    }
}
