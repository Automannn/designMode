package design_mode.visitor.OOP_class;

import com.automannn.design_mode.visitor.OOP_interface.Handler;

/**
 * @author automannn@163.com
 * @time 2018/9/18 18:49
 */
public abstract class BaseHandler implements Handler {

   private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
