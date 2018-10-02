package design_mode.command.OOP_class;



/**
 * @author automannn@163.com
 * @time 2018/9/15 15:27
 */
//抽象工厂
public abstract class AbstractFactory{

    protected static AbstractFactory getFactory0(String className){
        AbstractFactory factory = null;
        try {
            factory = (AbstractFactory) Class.forName(className).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

}
