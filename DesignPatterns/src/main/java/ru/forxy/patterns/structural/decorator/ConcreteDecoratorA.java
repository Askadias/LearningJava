package ru.forxy.patterns.structural.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 0:03
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    public void operation() {
        System.out.println("State decorationA: " + addedState);
        super.operation();
        System.out.println("After decorationA");
    }
}
