package ru.forxy.patterns.behavioral.templatemethod;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */
public class ImplementationB extends Template {

    public void method1() {
        System.out.println("B1");
    }

    public int method2() {
        return 2;
    }

    public String method3(int param) {
        return "B3 " + (param * 2);
    }
}
