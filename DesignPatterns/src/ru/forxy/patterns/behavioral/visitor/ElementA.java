package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class ElementA implements Element {

    private String name;

    public ElementA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
