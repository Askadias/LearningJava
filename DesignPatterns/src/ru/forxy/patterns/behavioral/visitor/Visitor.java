package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */
public interface Visitor {

    public void visit(ElementA elementA);

    public void visit(ElementB elementB);
}
