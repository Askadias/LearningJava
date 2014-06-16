package ru.forxy.patterns.behavioral.mediator;

/**
 * Created by IntelliJ IDEA.
 * User: Uladzislau_Prykhodzk
 * Date: 6/30/11
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mediator {

    CommandA commandA;
    CommandB commandB;

    public void registerCommandA(CommandA commandA) {
        this.commandA = commandA;
    }

    public void registerCommandB(CommandB commandB) {
        this.commandB = commandB;
    }

    public void do1() {
        System.out.println("Mediator do 1");
        commandA.setState("M1");
        commandB.setState(1);
    }

    public void do2() {
        System.out.println("Mediator do 2");
        commandA.setState("M2");
        commandB.setState(2);
    }
}
