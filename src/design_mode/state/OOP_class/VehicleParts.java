package design_mode.state.OOP_class;

/**
 * @author automannn@163.com
 * @time 2018/9/15 16:04
 */
public class VehicleParts {
    protected  String name;

    public VehicleParts(String name) {
        this.name = name;
    }

    public String getMessage(){
        return name;
    }
}
