package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:23
 * To change this template use File | Settings | File Templates.
 */
public class DoVisitor implements Visitor {

    public void visit(ElementA elementA) {
        System.out.println("Do something with A: " + elementA.getName());
    }

    public void visit(ElementB elementB) {
        System.out.println("Do something with B");
    }
}
