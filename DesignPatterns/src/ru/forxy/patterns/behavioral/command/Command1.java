package ru.forxy.patterns.behavioral.command;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class Command1 extends Command {

    public Command1(Receiver receiver) {
        super(receiver);
    }

    public void execute() {
        receiver.setState(1);
    }
}
