package ru.forxy.patterns.behavioral.command;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Receiver {

    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
