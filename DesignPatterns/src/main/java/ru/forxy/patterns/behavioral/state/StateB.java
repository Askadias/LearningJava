package ru.forxy.patterns.behavioral.state;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class StateB implements State {

    private int counter = 0;

    public String getName() {
        return "StateB";
    }

    public void process(StateContext context, String param) {
        System.out.println(param.toUpperCase());
        if (++counter > 1) {
            context.setState(new StateA());
        }
    }
}
