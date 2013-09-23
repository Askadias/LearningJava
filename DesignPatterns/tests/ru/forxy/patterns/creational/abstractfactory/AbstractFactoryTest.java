package ru.forxy.patterns.creational.abstractfactory;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class AbstractFactoryTest extends TestCase {

    private Logger log = Logger.getLogger(AbstractFactoryTest.class.toString());

    public void testProductCreation() {
        log.info("Creating factory1 and factory2");
        AbstractFactory factory1 =  new ConcreteFactory1();
        AbstractFactory factory2 =  new ConcreteFactory2();

        log.info("Creating ProductA1");
        assertEquals("Factory 1 should create ProductA1",
                factory1.createProductA().getClass().toString(),
                "class ru.forxy.patterns.creational.abstractfactory.ProductA1");

        log.info("Creating ProductB1");
        assertEquals("Factory 1 should create ProductB1",
                factory1.createProductB().getClass().toString(),
                "class ru.forxy.patterns.creational.abstractfactory.ProductB1");

        log.info("Creating ProductA2");
        assertEquals("Factory 2 should create ProductA2",
                factory2.createProductA().getClass().toString(),
                "class ru.forxy.patterns.creational.abstractfactory.ProductA2");

        log.info("Creating ProductB2");
        assertEquals("Factory 2 should create ProductB2",
                factory2.createProductB().getClass().toString(),
                "class ru.forxy.patterns.creational.abstractfactory.ProductB2");
    }
}
