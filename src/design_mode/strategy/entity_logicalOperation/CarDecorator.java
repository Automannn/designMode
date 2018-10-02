package design_mode.strategy.entity_logicalOperation;

import com.automannn.design_mode.strategy.component.Car;

/**
 * @author automannn@163.com
 * @time 2018/9/17 13:29
 */
//小汽车装饰类
public class CarDecorator extends Car {

    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println("喇叭如荣山洪爆发");
        car.run();
        System.out.println("浓黑的尾气直指天际");
    }
}
