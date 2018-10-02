package design_mode.facade.OOP_class;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:12
 */
public class Wheel extends VehicleParts {
    private static final String name = "轮胎";

    public Wheel() {
        super(name);
    }

    public Wheel(String n) {
        super(n+name);
    }
}
