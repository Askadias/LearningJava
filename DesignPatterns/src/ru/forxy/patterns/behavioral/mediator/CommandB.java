package ru.forxy.patterns.behavioral.mediator;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommandB extends CommandImpl {

    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public CommandB(Mediator mediator) {
        super(mediator);
    }

    public void execute() {
        mediator.do2();
    }
}
