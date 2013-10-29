package ru.forxy.patterns.creational.factorymethod;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class FactoryMethodTest extends TestCase {

    private Logger log = Logger.getLogger(FactoryMethodTest.class.toString());

    public void testProductCreation() {
        log.info("Creating creatorA and creatorB");
        Creator creatorA =  new ConcreteCreatorA();
        Creator creatorB =  new ConcreteCreatorB();

        log.info("Creating ProductA");
        assertEquals("Creator A should create ProductA",
                "class ru.forxy.patterns.creational.factorymethod.ProductA",
                creatorA.create().getClass().toString());

        log.info("Creating ProductB");
        assertEquals("Creator B should create ProductB",
                "class ru.forxy.patterns.creational.factorymethod.ProductB",
                creatorB.create().getClass().toString());
    }
}
