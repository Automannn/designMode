package design_mode.chain_of_responsibility.entity_nonliving;

import java.util.ArrayList;
import java.util.List;

/**
 * @author automannn@163.com
 * @time 2018/9/17 23:15
 */
public class Phone {
    //手机牌子
    private String name;
    private final List<Part> coreParts = new ArrayList<>();
    private final List<Part> otherParts = new ArrayList<>();
    private Part shell;

    public Phone(String name) {
        this.name = name;
    }

    public Part getShell() {
        return shell;
    }

    public void setShell(Part shell) {
        this.shell = shell;
    }

    public void addCorePart(Part part){
        this.coreParts.add(part);
    }

    public void addOtherParts(Part part){
        this.otherParts.add(part);
    }

    public void run(){
        System.out.println("这是一个"+ name+"手机：它由三部分组成:核心部件，其它部件，以及外壳");
        System.out.println("核心部件有："+coreParts.toString());
        System.out.println("其它部件有："+ otherParts.toString());
        System.out.println("外壳是："+ getShell().toString());
    }

    public static class Part{
        private String name;

        public Part(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}


