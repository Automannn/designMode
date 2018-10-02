package design_mode.command.entity_logicalOperation;

import com.automannn.design_mode.command.OOP_class.Station;

import java.util.HashMap;
import java.util.Map;

/**
 * @author automannn@163.com
 * @time 2018/9/18 0:33
 */
public class MoodStationFactory {
    private static final Map<String,MoodStation> pool = new HashMap<>();

    private static boolean ischanged=true;

    private static  String cursorStation;

    public static Station getStation(String outState){
        MoodStation moodStation= null;
        if (cursorStation!=null)ischanged = !outState.equals(cursorStation);

        if (pool.containsKey(outState)){
            moodStation= pool.get(outState);
        }else {

            moodStation = new MoodStation(outState);
            pool.put(outState,moodStation);
        }
        cursorStation = outState;
        return moodStation;
    }

    public static boolean isIschanged() {
        return ischanged;
    }
}
