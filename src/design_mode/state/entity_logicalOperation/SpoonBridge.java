package design_mode.state.entity_logicalOperation;

import com.automannn.design_mode.state.OOP_class.Bridge;

/**
 * @author automannn@163.com
 * @time 2018/9/17 15:11
 */
public class SpoonBridge extends Bridge {

    @Override
    public void run() {
        getSpoon().run();
    }


}
