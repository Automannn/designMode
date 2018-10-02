package design_mode.command.OOP_class;

import com.automannn.design_mode.command.able_interface.Stationable;

/**
 * @author automannn@163.com
 * @time 2018/9/18 0:16
 */
public abstract class Station implements Stationable {
    private String inState;

    protected final String outState;

    public Station(String outState) {
        this.outState = outState;
    }

    public String getInState() {
        return inState;
    }

    public void setInState(String inState) {
        this.inState = inState;
    }

    public  void stateDo(){
        System.out.println("外部状态是："+ outState);
        System.out.println("内部状态是: "+ inState);
    }
}
