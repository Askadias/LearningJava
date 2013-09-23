package ru.forxy.patterns.behavioral.mediator;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommandA extends CommandImpl {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CommandA(Mediator mediator, String state) {
        super(mediator);
        this.state = state;
    }

    public void execute() {
        mediator.do1();
    }
}
