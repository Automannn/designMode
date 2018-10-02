package design_mode.visitor.OOP_interface;

/**
 * @author automannn@163.com
 * @time 2018/9/18 19:59
 */
public interface Access {
    void accept(Visitor visitor);

    String getInfo();
}
