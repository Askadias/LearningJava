package ru.forxy.patterns.behavioral.mediator;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CommandImpl implements Command {

    Mediator mediator;

    public CommandImpl(Mediator mediator) {
        this.mediator = mediator;
    }
}
