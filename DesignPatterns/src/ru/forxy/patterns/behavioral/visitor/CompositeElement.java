package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class CompositeElement implements Element {

    private Element[] elements;

    public CompositeElement() {
        this.elements = new Element[]{new ElementA("NameA"), new ElementB()};
    }

    public void accept(Visitor visitor) {
        for (Element element: elements) {
            element.accept(visitor);
        }
    }
}
