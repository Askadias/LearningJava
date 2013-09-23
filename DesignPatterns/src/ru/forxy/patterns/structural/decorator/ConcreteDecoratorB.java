package ru.forxy.patterns.structural.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 30.06.11
 * Time: 0:03
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorB extends Decorator {

    public void operation() {
        addedBehavior();
        super.operation();
        System.out.println("After decorationB");
    }

    private void addedBehavior() {
        System.out.println("DecorationB behavior");
    }
}
