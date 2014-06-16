package ru.forxy.patterns.structural.facade;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 29.06.11
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
public class Facade {

    private SubsystemA subsystemA = new SubsystemA();
    private SubsystemB subsystemB = new SubsystemB();
    private SubsystemC subsystemC = new SubsystemC();

    public String operation1() {
        return subsystemA.A1() + subsystemA.A2() + subsystemB.B1();
    }

    public String operation2() {
        return subsystemA.A3() + subsystemB.B2() + subsystemC.C1();
    }
}
