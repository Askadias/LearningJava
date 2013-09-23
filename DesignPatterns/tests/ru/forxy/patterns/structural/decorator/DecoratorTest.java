package ru.forxy.patterns.structural.decorator;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class DecoratorTest extends TestCase {

    private Logger log = Logger.getLogger(DecoratorTest.class.toString());

    public void testDecorators() {
        log.info("Creating decorators");
        Component concreteComponent = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA();
        Decorator decoratorB = new ConcreteDecoratorB();
        concreteComponent.operation();
        decoratorA.setComponent(concreteComponent);
        decoratorB.setComponent(decoratorA);
        decoratorA.operation();
        ((ConcreteDecoratorA)decoratorA).setAddedState("State A");
        decoratorB.operation();
    }
}
