package design_mode.chain_of_responsibility.OOP_class;

import com.automannn.design_mode.chain_of_responsibility.able_interface.Stationable;
import com.automannn.design_mode.chain_of_responsibility.entity_logicalOperation.MoodStation;
import com.automannn.design_mode.chain_of_responsibility.entity_logicalOperation.MoodStationFactory;

/**
 * @author automannn@163.com
 * @time 2018/9/13 8:41
 */
public class Hero {
    public Stationable station;

    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void stationDo(){
        if (MoodStationFactory.isIschanged())
            station.stateDo();
    }

    public void  setStation(String outState){
        MoodStation station = (MoodStation) MoodStationFactory.getStation(outState);
        if (outState=="雨天")station.setInState("开心");
        if (outState=="晴天")station.setInState("难过");
        station.setInState("天气状态改变了，心情就改变了");

        this.station = station;
    }


}
