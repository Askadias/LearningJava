package ru.forxy.patterns.structural.flyweight;

import junit.framework.TestCase;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: Tiger
 * Date: 28.06.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightTest extends TestCase {

    private Logger log = Logger.getLogger(FlyweightTest.class.toString());

    public void testFlyweights() {
        log.info("Creating flyweight instances");
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight(1);
        flyweight.operation();
        flyweight = flyweightFactory.getFlyweight(2);
        flyweight.operation();
        flyweight = flyweightFactory.getFlyweight(1);
        flyweight.operation();
    }
}
