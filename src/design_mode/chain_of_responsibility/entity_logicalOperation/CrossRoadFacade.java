package design_mode.chain_of_responsibility.entity_logicalOperation;

import com.automannn.design_mode.chain_of_responsibility.OOP_class.CrossFacade;

/**
 * @author automannn@163.com
 * @time 2018/9/17 14:24
 */
public class CrossRoadFacade extends CrossFacade {

    public CrossRoadFacade() {
    }

    @Override
    protected void lightOn() {
        System.out.println("打开转向灯");
    }

    @Override
    protected void waitingGreen() {
        System.out.println("等待通行灯");
    }

    @Override
    protected void watchAround() {
        System.out.println("四周查看，确认安全");
    }

    @Override
    protected void go() {
        System.out.println("通过！");
    }


}
