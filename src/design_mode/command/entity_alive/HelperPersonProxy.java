package design_mode.command.entity_alive;

import com.automannn.design_mode.command.OOP_interface.NeedHelpPerson;

/**
 * @author automannn@163.com
 * @time 2018/9/17 14:03
 */
public class HelperPersonProxy implements NeedHelpPerson {
    private NeedHelpPerson needHelpPerson;

   public HelperPersonProxy(NeedHelpPerson needHelpPerson){this.needHelpPerson = needHelpPerson; }


    @Override
    public void help() {
       before();
       needHelpPerson.help();
       after();

    }

    private void before(){
        System.out.println("找路人帮忙，没人。。。");

    }

    private void after(){
        System.out.println("打电话给救护车");
    }

}
