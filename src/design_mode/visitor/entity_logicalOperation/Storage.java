package design_mode.visitor.entity_logicalOperation;

/**
 * @author automannn@163.com
 * @time 2018/9/18 19:43
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
