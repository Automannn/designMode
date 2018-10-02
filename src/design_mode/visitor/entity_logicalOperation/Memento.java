package design_mode.visitor.entity_logicalOperation;

import com.automannn.design_mode.visitor.entity_nonliving.Scene;

/**
 * @author automannn@163.com
 * @time 2018/9/18 19:42
 */
public class Memento {
    Scene scene;

    public Memento(Scene scene) {
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
