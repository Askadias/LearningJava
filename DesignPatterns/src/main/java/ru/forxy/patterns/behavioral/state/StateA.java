package ru.forxy.patterns.behavioral.state;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class StateA implements State {

    public String getName() {
        return "StateA";
    }

    public void process(StateContext context, String param) {
        System.out.println(param.toLowerCase());
        context.setState(new StateB());
    }
}
