package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class ElementB implements Element {

    private String name = "B";

    public ElementB(String name) {
        this.name = name;
    }

    public void accept(Visitor<Element> visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
