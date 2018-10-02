package design_mode.proxy.OOP_class;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:14
 */
public class Shell extends VehicleParts {
    private static final String name = "外壳";

    public Shell(String n) {
        super(n+name);
    }

    public Shell() {
        super(name);
    }
}
