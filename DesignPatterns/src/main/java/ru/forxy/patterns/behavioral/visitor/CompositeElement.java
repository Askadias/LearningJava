package ru.forxy.patterns.behavioral.visitor;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class CompositeElement implements Element {

    private String name = "Composite";

    private Element[] elements;

    public CompositeElement(String name) {
        this.name = name;
        this.elements = new Element[]{new ElementA("NameA"), new ElementB("NameB")};
    }

    public void accept(Visitor<Element> visitor) {
        for (Element element: elements) {
            element.accept(visitor);
        }
    }

    public String getName() {
        return name;
    }
}
