package design_mode.state.entity_nonliving;

import java.util.ArrayList;
import java.util.List;

/**
 * @author automannn@163.com
 * @time 2018/9/15 14:45
 */
//盾牌
public final class Shield {

    private final List<String> shieldParams= new ArrayList<>();

    public Shield() {
    }

    public void run(){
        if (shieldParams.size()==0){
            System.out.println("这是一把普通的盾牌，加持。");
            return;
        }
        StringBuilder params = new StringBuilder();
        for (int i=0;i<shieldParams.size();i++){
            params.append(shieldParams.get(i));

            if (i+1!=shieldParams.size())params.append("的,");
        }
        System.out.println("这是一把"+params.toString()+"的盾牌，加持！！！");
    }

    public void addParam(String param){
        shieldParams.add(param);
    }
}
