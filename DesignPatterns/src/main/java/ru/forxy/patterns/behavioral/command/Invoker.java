package ru.forxy.patterns.behavioral.command;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Invoker {

    Command command1;
    Command command2;

    public Invoker(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public void command1() {
        command1.execute();
    }

    public void command2() {
        command2.execute();
    }
}
