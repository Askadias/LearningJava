package ru.forxy.patterns.behavioral.state;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class StateContext {

    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
