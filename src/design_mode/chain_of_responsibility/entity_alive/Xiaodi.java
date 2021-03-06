package design_mode.chain_of_responsibility.entity_alive;

import com.automannn.design_mode.chain_of_responsibility.OOP_class.OptimisticAnswer;
import com.automannn.design_mode.chain_of_responsibility.OOP_class.PessimismAnswer;
import com.automannn.design_mode.chain_of_responsibility.OOP_interface.AnswerPhone;
import com.automannn.design_mode.chain_of_responsibility.entity_logicalOperation.ListenPhone;

/**
 * @author automannn@163.com
 * @time 2018/9/18 15:14
 */
public class Xiaodi extends ListenPhone implements AnswerPhone {

    private final String inState;

    public Xiaodi(String inState){
        this.inState = inState;
    }


    @Override
    public void answer() {
        if (inState.equals("心情好"))
            new PessimismAnswer().answer();
        else
            new OptimisticAnswer().answer();
    }
}
