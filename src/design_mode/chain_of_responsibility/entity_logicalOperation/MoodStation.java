package design_mode.chain_of_responsibility.entity_logicalOperation;

import com.automannn.design_mode.chain_of_responsibility.OOP_class.Station;

/**
 * @author automannn@163.com
 * @time 2018/9/18 0:30
 */
public class MoodStation extends Station {


    public MoodStation(String outState) {
        super(outState);
    }

    @Override
    public boolean stateChanged() {
        return false;
    }
}
